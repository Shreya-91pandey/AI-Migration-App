import android.graphics.Bitmap;

public final class k71 implements l8a
{
    public final byte a;
    
    @Override
    public final m8a a(final Object o, final pfg pfg, final oti oti) {
        final byte a = this.a;
        final m8a m8a = null;
        final m8a m8a2 = null;
        final m8a m8a3 = null;
        final m8a m8a4 = null;
        final m8a m8a5 = null;
        final m8a m8a6 = null;
        switch (a) {
            default: {
                final uyo uyo = (uyo)o;
                Object o2;
                if (!mlc.q((Object)uyo.c, (Object)"android.resource")) {
                    o2 = m8a6;
                }
                else {
                    o2 = new l71(uyo, pfg, (byte)5);
                }
                return (m8a)o2;
            }
            case 8: {
                final uyo uyo2 = (uyo)o;
                Object o3;
                if (!mlc.q((Object)uyo2.c, (Object)"jar:file")) {
                    o3 = m8a;
                }
                else {
                    o3 = new l71(uyo2, pfg, (byte)4);
                }
                return (m8a)o3;
            }
            case 7: {
                final uyo uyo3 = (uyo)o;
                final String c = uyo3.c;
                if (c != null) {
                    final Object o4 = m8a2;
                    if (!mlc.q((Object)c, (Object)"file")) {
                        return (m8a)o4;
                    }
                }
                Object o4 = m8a2;
                if (uyo3.e != null) {
                    o4 = m8a2;
                    if (!k5p.f(uyo3)) {
                        o4 = new l71(uyo3, pfg, (byte)3);
                    }
                }
                return (m8a)o4;
            }
            case 6: {
                return (m8a)new iv1((Object)o, pfg, (byte)3);
            }
            case 5: {
                final uyo uyo4 = (uyo)o;
                Object o5;
                if (!mlc.q((Object)uyo4.c, (Object)"data")) {
                    o5 = m8a3;
                }
                else {
                    o5 = new l71(uyo4, pfg, (byte)2);
                }
                return (m8a)o5;
            }
            case 4: {
                final uyo uyo5 = (uyo)o;
                Object o6;
                if (!mlc.q((Object)uyo5.c, (Object)"content")) {
                    o6 = m8a4;
                }
                else {
                    o6 = new l71(uyo5, pfg, (byte)1);
                }
                return (m8a)o6;
            }
            case 3: {
                return (m8a)new iv1((Object)o, pfg, (byte)2);
            }
            case 2: {
                return (m8a)new iv1((Object)o, pfg, (byte)1);
            }
            case 1: {
                return (m8a)new ce2((Bitmap)o);
            }
            case 0: {
                final uyo uyo6 = (uyo)o;
                Object o7;
                if (!k5p.f(uyo6)) {
                    o7 = m8a5;
                }
                else {
                    o7 = new l71(uyo6, pfg, (byte)0);
                }
                return (m8a)o7;
            }
        }
    }
}
