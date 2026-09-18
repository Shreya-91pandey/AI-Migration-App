import java.util.Collection;
import android.app.Application;
import java.util.concurrent.Executor;
import kotlinx.serialization.KSerializer;
import java.util.concurrent.Executors;
import androidx.datastore.core.CorruptionException;
import java.util.Iterator;
import java.util.List;
import java.security.UnrecoverableKeyException;
import java.security.KeyStoreException;
import javax.crypto.AEADBadTagException;
import android.os.Build$VERSION;
import android.content.SharedPreferences;
import android.content.Context;

public final class cib implements nhn, ne6, vqc, q8m, gc7, qna, zr2, by6, gfi, dyc, gdo, uc7, hm7, cul, wcq
{
    public static final cib A;
    public static final cib B;
    public static final cib C;
    public static final cib D;
    public static final cib E;
    public static final cib w;
    public static final cib x;
    public static final cib y;
    public static final cib z;
    public final byte v;
    
    public static ep0 j(Context applicationContext, final f60 f60) {
        applicationContext = applicationContext.getApplicationContext();
        final SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("app_prefs", 0);
        sharedPreferences.getClass();
        return new ep0(sharedPreferences, new tn(applicationContext, (byte)1), new tn(applicationContext, (byte)2), new ap0(applicationContext, (byte)0), f60);
    }
    
    public static fvg l(final String s) {
        final is2 a = e.a;
        final Object o = new Object();
        ((an2)o).n1(s);
        return e.d((an2)o, false);
    }
    
    public static boolean o(Throwable t) {
        final pgf a = ep0.A;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final List c0 = xyk.c0(xyk.Y((lta)new uz((byte)16), (Object)t));
        if (!((Collection)c0).isEmpty()) {
            final Iterator iterator = ((Iterable)c0).iterator();
            while (iterator.hasNext()) {
                if (((Throwable)iterator.next()) instanceof AEADBadTagException) {
                    return true;
                }
            }
        }
        if (sdk_INT >= 33) {
            if (!((Collection)c0).isEmpty()) {
                for (final Throwable t2 : c0) {
                    if (od.y(t2) && !od.w(od.d(t2))) {
                        return true;
                    }
                }
            }
        }
        final boolean empty = ((Collection)c0).isEmpty();
        final int n = 0;
        int n2;
        if (empty) {
            n2 = n;
        }
        else {
            final Iterator iterator3 = ((Iterable)c0).iterator();
            boolean w;
            do {
                n2 = n;
                if (!iterator3.hasNext()) {
                    return (n2 ^ 0x1) != 0x0;
                }
                t = (Throwable)iterator3.next();
                if (sdk_INT >= 33 && od.y(t)) {
                    w = od.w(od.d(t));
                }
                else {
                    w = (t instanceof KeyStoreException || t instanceof UnrecoverableKeyException);
                }
            } while (!w);
            n2 = 1;
        }
        return (n2 ^ 0x1) != 0x0;
    }
    
    public byte[] a(final byte[] array, final int n, final int n2) {
        final byte[] array2 = new byte[n2];
        System.arraycopy((Object)array, n, (Object)array2, 0, n2);
        return array2;
    }
    
    public void b(final Context context) {
    }
    
    public Object c(final CorruptionException ex) {
        throw ex;
    }
    
    public ija d(final u1n u1n) {
        return (ija)new m22((Object)u1n, (byte)6);
    }
    
    public long e(long n, long n2) {
        final float m = rml.m(n, n2);
        n2 = Float.floatToRawIntBits(m);
        n = Float.floatToRawIntBits(m);
        final int a = bak.a;
        return n2 << 32 | (n & 0xFFFFFFFFL);
    }
    
    public void g(final ye6 ye6, final gva gva, final int n) {
        gva.i0(-2101003086);
        int n2;
        if (gva.f((Object)this)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            ye6.d((Object)gva, (Object)6);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new t7((Object)this, (Object)ye6, n, (byte)10);
        }
    }
    
    public Object get() {
        return new y6k((Object)Executors.newSingleThreadExecutor(), (byte)0);
    }
    
    public Object h(final jqc jqc, final KSerializer kSerializer, final qn2 qn2) {
        return lq6.E(jqc, kSerializer, (mjc)new e3a(qn2, (byte)16));
    }
    
    public boolean i(final lnh lnh) {
        return false;
    }
    
    public Object k(final uy7 uy7) {
        switch (this.v) {
            default: {
                return new j9j(uy7.g(bmi.a((Class)i9j.class)));
            }
            case 3: {
                final Object w = uy7.w(new bmi((Class)wf2.class, (Class)Executor.class));
                w.getClass();
                return eqi.W((Executor)w);
            }
        }
    }
    
    public void m(final tjc tjc, final Context context) {
    }
    
    public boolean n(final Object o, final Object o2) {
        final byte v = this.v;
        boolean b2;
        final boolean b = b2 = false;
        switch (v) {
            default: {
                final zin zin = (zin)o;
                final zin zin2 = (zin)o2;
                if (zin != null && zin2 != null) {
                    b2 = b;
                    if (zin.a != zin2.a) {
                        return b2;
                    }
                    b2 = b;
                    if (!mlc.q((Object)zin.b, (Object)zin2.b)) {
                        return b2;
                    }
                    b2 = b;
                    if (zin.c != zin2.c) {
                        return b2;
                    }
                    b2 = b;
                    if (zin.d != zin2.d) {
                        return b2;
                    }
                    b2 = b;
                    if (zin.e != zin2.e) {
                        return b2;
                    }
                }
                else {
                    final boolean b3 = zin == null;
                    final boolean b4 = zin2 == null;
                    b2 = b;
                    if (b3 ^ b4) {
                        return b2;
                    }
                }
                b2 = true;
                return b2;
            }
            case 5: {
                return b2;
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 27: {
                final int hashCode = this.hashCode();
                lq6.u(16);
                final String string = Integer.toString(hashCode, 16);
                string.getClass();
                return lmf.t("CreationExtras.Key@", string, "<", v4j.a((Class)Application.class).c(), ">");
            }
            case 25: {
                return "SharingStarted.Lazily";
            }
            case 24: {
                final int hashCode2 = this.hashCode();
                lq6.u(16);
                final String string2 = Integer.toString(hashCode2, 16);
                string2.getClass();
                return lmf.t("CreationExtras.Key@", string2, "<", v4j.a((Class)j9k.class).c(), ">");
            }
            case 13: {
                return "Empty";
            }
            case 7: {
                return "SingleLineCodepointTransformation";
            }
            case 5: {
                return "NeverEqualPolicy";
            }
        }
    }
}
