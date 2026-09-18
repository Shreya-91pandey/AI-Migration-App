import android.content.res.AssetFileDescriptor;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import java.io.IOException;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.Context;

public abstract class ith
{
    public static final ekj a;
    public static final Object b;
    public static hth c;
    
    static {
        a = (ekj)new Object();
        b = new Object();
        ith.c = null;
    }
    
    public static long a(final Context context) {
        final PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build$VERSION.SDK_INT >= 33) {
            return mo2.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
    
    public static hth b(final int n, final boolean b, final boolean b2) {
        ((b3)ith.a).n((Object)(ith.c = new hth(n, b, b2)));
        return ith.c;
    }
    
    public static void c(final Context context, final boolean b) {
        if (!b && ith.c != null) {
            return;
        }
        final Object b2;
        monitorenter(b2 = ith.b);
        Label_0042: {
            if (b) {
                break Label_0042;
            }
            try {
                if (ith.c != null) {
                    monitorexit(b2);
                    return;
                }
                break Label_0042;
            }
            finally {
                monitorexit(b2);
                while (true) {
                    boolean b3 = true;
                    Label_0137: {
                        while (true) {
                            Label_0263: {
                                break Label_0263;
                                final int n = 0;
                                try {
                                    final AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                                    try {
                                        final boolean b4 = openFd.getLength() > 0L;
                                        openFd.close();
                                    }
                                    finally {
                                        if (openFd != null) {
                                            try {
                                                openFd.close();
                                            }
                                            finally {
                                                final Throwable t;
                                                final Throwable t2;
                                                t.addSuppressed(t2);
                                            }
                                        }
                                    }
                                }
                                catch (final IOException ex) {
                                    final boolean b4 = false;
                                }
                                final int sdk_INT = Build$VERSION.SDK_INT;
                                iftrue(Label_0529:)(sdk_INT < 28 || sdk_INT == 30);
                                break Label_0137;
                                try {
                                    final long a = a(context);
                                    final File file = new File(context.getFilesDir(), "profileInstalled");
                                    gth a2 = null;
                                    final boolean b5;
                                    Label_0325: {
                                        if (file.exists()) {
                                            try {
                                                a2 = gth.a(file);
                                                break Label_0325;
                                            }
                                            catch (final IOException ex2) {
                                                b(131072, b5, b3);
                                                monitorexit(b2);
                                                return;
                                            }
                                        }
                                        a2 = null;
                                    }
                                    int n2 = 0;
                                    Label_0389: {
                                        if (a2 != null && a2.c == a) {
                                            final int b6 = a2.b;
                                            if (b6 != 2) {
                                                n2 = b6;
                                                break Label_0389;
                                            }
                                        }
                                        final boolean b4;
                                        if (!b4) {
                                            n2 = 327680;
                                        }
                                        else if (b5) {
                                            n2 = 1;
                                        }
                                        else {
                                            n2 = n;
                                            if (b3) {
                                                n2 = 2;
                                            }
                                        }
                                    }
                                    int n3 = n2;
                                    if (b) {
                                        n3 = n2;
                                        if (b3 && (n3 = n2) != 1) {
                                            n3 = 2;
                                        }
                                    }
                                    int n4 = n3;
                                    if (a2 != null) {
                                        n4 = n3;
                                        if (a2.b == 2 && (n4 = n3) == 1) {
                                            n4 = n3;
                                            final long length;
                                            if (length < a2.d) {
                                                n4 = 3;
                                            }
                                        }
                                    }
                                    final long length2;
                                    final gth gth = new gth(1, n4, a, length2);
                                    int n5 = 0;
                                    Label_0497: {
                                        if (a2 != null) {
                                            final boolean equals = a2.equals(gth);
                                            n5 = n4;
                                            if (equals) {
                                                break Label_0497;
                                            }
                                        }
                                        try {
                                            gth.b(file);
                                            n5 = n4;
                                        }
                                        catch (final IOException ex3) {
                                            n5 = 196608;
                                        }
                                    }
                                    b(n5, b5, b3);
                                    monitorexit(b2);
                                }
                                catch (final PackageManager$NameNotFoundException ex4) {
                                    final boolean b5;
                                    b(65536, b5, b3);
                                    monitorexit(b2);
                                }
                            }
                            return;
                            Label_0260: {
                                b3 = false;
                            }
                            continue;
                        }
                    }
                    final File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    final long length = file2.length();
                    final boolean b5 = file2.exists() && length > 0L;
                    final File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    final long length2 = file3.length();
                    iftrue(Label_0260:)(!file3.exists() || length2 <= 0L);
                    continue;
                }
                Label_0529: {
                    b(262144, false, false);
                }
                monitorexit(b2);
            }
        }
    }
}
