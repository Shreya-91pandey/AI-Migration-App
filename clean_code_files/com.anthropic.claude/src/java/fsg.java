import java.util.List;
import com.google.android.gms.common.api.Status;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class fsg implements Parcelable$Creator
{
    public final byte a;
    
    public final Object createFromParcel(final Parcel parcel) {
        final byte a = this.a;
        final int n = 0;
        int j = 0;
        Object m = null;
        String k = null;
        switch (a) {
            default: {
                final int u = xiq.U(parcel);
                PendingIntent pendingIntent = null;
                np6 np6 = null;
                while (parcel.dataPosition() < u) {
                    final int h = xiq.H(parcel);
                    final int v = xiq.v(h);
                    if (v != 1) {
                        if (v != 2) {
                            if (v != 3) {
                                if (v != 4) {
                                    xiq.R(parcel, h);
                                }
                                else {
                                    np6 = (np6)xiq.j(parcel, h, np6.CREATOR);
                                }
                            }
                            else {
                                pendingIntent = (PendingIntent)xiq.j(parcel, h, PendingIntent.CREATOR);
                            }
                        }
                        else {
                            k = xiq.k(parcel, h);
                        }
                    }
                    else {
                        j = xiq.J(parcel, h);
                    }
                }
                xiq.p(parcel, u);
                return new Status(j, k, pendingIntent, np6);
            }
            case 6: {
                final int u2 = xiq.U(parcel);
                int i = 0;
                boolean d = false;
                String l = null;
                long l2 = -1L;
                while (parcel.dataPosition() < u2) {
                    final int h2 = xiq.H(parcel);
                    final int v2 = xiq.v(h2);
                    if (v2 != 1) {
                        if (v2 != 2) {
                            if (v2 != 3) {
                                if (v2 != 4) {
                                    xiq.R(parcel, h2);
                                }
                                else {
                                    d = xiq.D(parcel, h2);
                                }
                            }
                            else {
                                l2 = xiq.L(parcel, h2);
                            }
                        }
                        else {
                            i = xiq.J(parcel, h2);
                        }
                    }
                    else {
                        l = xiq.k(parcel, h2);
                    }
                }
                xiq.p(parcel, u2);
                return new n5a(i, l2, l, d);
            }
            case 5: {
                final int u3 = xiq.U(parcel);
                int j2 = 0;
                int j3 = 0;
                PendingIntent pendingIntent2 = null;
                Integer k3;
                Object k2 = k3 = null;
                while (parcel.dataPosition() < u3) {
                    final int h3 = xiq.H(parcel);
                    final int v3 = xiq.v(h3);
                    if (v3 != 1) {
                        if (v3 != 2) {
                            if (v3 != 3) {
                                if (v3 != 4) {
                                    if (v3 != 5) {
                                        xiq.R(parcel, h3);
                                    }
                                    else {
                                        k3 = xiq.K(parcel, h3);
                                    }
                                }
                                else {
                                    k2 = xiq.k(parcel, h3);
                                }
                            }
                            else {
                                pendingIntent2 = (PendingIntent)xiq.j(parcel, h3, PendingIntent.CREATOR);
                            }
                        }
                        else {
                            j3 = xiq.J(parcel, h3);
                        }
                    }
                    else {
                        j2 = xiq.J(parcel, h3);
                    }
                }
                xiq.p(parcel, u3);
                return new np6(j2, j3, pendingIntent2, (String)k2, k3);
            }
            case 4: {
                final int u4 = xiq.U(parcel);
                int j4 = -1;
                long l3 = 0L;
                long l4 = 0L;
                int j5 = 0;
                int j6 = 0;
                int j8;
                int j7 = j8 = j6;
                String k4 = null;
                String k5 = null;
                while (parcel.dataPosition() < u4) {
                    final int h4 = xiq.H(parcel);
                    switch (xiq.v(h4)) {
                        default: {
                            xiq.R(parcel, h4);
                            continue;
                        }
                        case 9: {
                            j4 = xiq.J(parcel, h4);
                            continue;
                        }
                        case 8: {
                            j8 = xiq.J(parcel, h4);
                            continue;
                        }
                        case 7: {
                            k5 = xiq.k(parcel, h4);
                            continue;
                        }
                        case 6: {
                            k4 = xiq.k(parcel, h4);
                            continue;
                        }
                        case 5: {
                            l4 = xiq.L(parcel, h4);
                            continue;
                        }
                        case 4: {
                            l3 = xiq.L(parcel, h4);
                            continue;
                        }
                        case 3: {
                            j7 = xiq.J(parcel, h4);
                            continue;
                        }
                        case 2: {
                            j6 = xiq.J(parcel, h4);
                            continue;
                        }
                        case 1: {
                            j5 = xiq.J(parcel, h4);
                            continue;
                        }
                    }
                }
                xiq.p(parcel, u4);
                return new z8f(j5, j6, j7, l3, l4, k4, k5, j8, j4);
            }
            case 3: {
                final int u5 = xiq.U(parcel);
                int j9 = n;
                while (parcel.dataPosition() < u5) {
                    final int h5 = xiq.H(parcel);
                    final int v4 = xiq.v(h5);
                    if (v4 != 1) {
                        if (v4 != 2) {
                            xiq.R(parcel, h5);
                        }
                        else {
                            m = xiq.m(parcel, h5, z8f.CREATOR);
                        }
                    }
                    else {
                        j9 = xiq.J(parcel, h5);
                    }
                }
                xiq.p(parcel, u5);
                return new ldn(j9, (List)m);
            }
            case 2: {
                return new isg(parcel.readLong());
            }
            case 1: {
                return new hsg(parcel.readInt());
            }
            case 0: {
                return new gsg(parcel.readFloat());
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new Status[n];
            }
            case 6: {
                return new n5a[n];
            }
            case 5: {
                return new np6[n];
            }
            case 4: {
                return new z8f[n];
            }
            case 3: {
                return new ldn[n];
            }
            case 2: {
                return new isg[n];
            }
            case 1: {
                return new hsg[n];
            }
            case 0: {
                return new gsg[n];
            }
        }
    }
}
