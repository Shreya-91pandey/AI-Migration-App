import android.database.Cursor;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageManager;
import java.io.Closeable;
import android.os.Build$VERSION;
import android.net.Uri$Builder;
import android.content.Context;
import android.net.Uri;

public final class r33 implements u33
{
    public static final Uri b;
    public final Context a;
    
    static {
        final Uri build = new Uri$Builder().scheme("content").authority("androidx.car.app.connection").build();
        build.getClass();
        b = build;
    }
    
    public r33(final Context a, final wo8 wo8) {
        this.a = a;
    }
    
    public final boolean a() {
        final Context a = this.a;
        final PackageManager packageManager = a.getPackageManager();
        final String authority = r33.b.getAuthority();
        authority.getClass();
        final boolean b = false;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            return false;
        }
        final ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
        if (applicationInfo == null) {
            return false;
        }
        if (!mlc.q((Object)applicationInfo.packageName, (Object)"com.google.android.projection.gearhead")) {
            return false;
        }
        Label_0179: {
            if ((applicationInfo.flags & 0x81) != 0x0) {
                final boolean t = true;
                break Label_0179;
            }
            Label_0103: {
                if (Build$VERSION.SDK_INT >= 28) {
                    break Label_0103;
                }
                while (true) {
                    boolean t = false;
                    break Label_0179;
                    try {
                        final PackageManager packageManager2 = a.getPackageManager();
                        final String packageName = applicationInfo.packageName;
                        final byte[] array = new byte[32];
                        for (int i = 0; i < 32; ++i) {
                            final int n = i * 2;
                            final String substring = "1ca8dcc0bed3cbd872d2cb791200c0292ca9975768a82d676b8b424fb65b5295".substring(n, n + 2);
                            lq6.u(16);
                            array[i] = (byte)Integer.parseInt(substring, 16);
                        }
                        t = l4.t(packageManager2, packageName, array);
                        if (t) {
                            final Cursor query = a.getContentResolver().query(r33.b, new String[] { "CarConnectionState" }, (String)null, (String[])null, (String)null);
                            if (query != null) {
                                Label_0275: {
                                    try {
                                        final int columnIndex = query.getColumnIndex("CarConnectionState");
                                        boolean b2 = b;
                                        if (columnIndex < 0) {
                                            break Label_0275;
                                        }
                                        b2 = b;
                                        if (!query.moveToFirst()) {
                                            break Label_0275;
                                        }
                                        final int int1 = query.getInt(columnIndex);
                                        b2 = b;
                                        if (int1 != 0) {
                                            b2 = true;
                                        }
                                        break Label_0275;
                                    }
                                    finally {
                                        try {}
                                        finally {
                                            final Throwable t2;
                                            zn2.r((Closeable)query, t2);
                                        }
                                        ((Closeable)query).close();
                                        return;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    catch (final Exception ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final ija b() {
        final uja uja = new uja(soh.u((ija)new n6k((zta)new o33(this, null, (byte)1))), (bua)new q33(3, null, (byte)0), (byte)1);
        final o68 a = vo8.a;
        return ri2.G((ija)uja, (hc7)d58.w);
    }
}
