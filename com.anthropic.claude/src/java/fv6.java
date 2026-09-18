import android.net.NetworkRequest;
import java.util.Set;

public final class fv6
{
    public static final fv6 j;
    public final int a;
    public final ktf b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    
    static {
        j = new fv6(15);
    }
    
    public fv6(final int n) {
        boolean e = true;
        int a;
        if ((n & 0x1) != 0x0) {
            a = 1;
        }
        else {
            a = 2;
        }
        if ((n & 0x4) != 0x0) {
            e = false;
        }
        this.b = new ktf(null);
        this.a = a;
        this.c = false;
        this.d = false;
        this.e = e;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = (Set)z89.v;
    }
    
    public fv6(final fv6 fv6) {
        this.c = fv6.c;
        this.d = fv6.d;
        this.b = fv6.b;
        this.a = fv6.a;
        this.e = fv6.e;
        this.f = fv6.f;
        this.i = fv6.i;
        this.g = fv6.g;
        this.h = fv6.h;
    }
    
    public fv6(final ktf b, final int a, final boolean c, final boolean d, final boolean e, final boolean f, final long g, final long h, final Set i) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final NetworkRequest a() {
        return (NetworkRequest)this.b.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (fv6.class.equals(o.getClass())) {
                final fv6 fv6 = (fv6)o;
                if (this.c == fv6.c) {
                    if (this.d == fv6.d) {
                        if (this.e == fv6.e) {
                            if (this.f == fv6.f) {
                                if (this.g == fv6.g) {
                                    if (this.h == fv6.h) {
                                        if (mlc.q((Object)this.a(), (Object)fv6.a())) {
                                            if (this.a == fv6.a) {
                                                return this.i.equals(fv6.i);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int d = ge9.D(this.a);
        final int c = this.c ? 1 : 0;
        final int d2 = this.d ? 1 : 0;
        final int e = this.e ? 1 : 0;
        final int f = this.f ? 1 : 0;
        final long g = this.g;
        final int n = (int)(g ^ g >>> 32);
        final long h = this.h;
        final int o = lmf.o(this.i, ((((((d * 31 + c) * 31 + d2) * 31 + e) * 31 + f) * 31 + n) * 31 + (int)(h ^ h >>> 32)) * 31, 31);
        final NetworkRequest a = this.a();
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return o + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Constraints{requiredNetworkType=");
        sb.append(lmf.A(this.a));
        sb.append(", requiresCharging=");
        sb.append(this.c);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.d);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.e);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.f);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.g);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.h);
        sb.append(", contentUriTriggers=");
        sb.append((Object)this.i);
        sb.append(", }");
        return sb.toString();
    }
}
