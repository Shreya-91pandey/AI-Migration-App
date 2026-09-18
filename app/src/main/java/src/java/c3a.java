import java.util.Iterator;
import java.util.Collection;
import java.util.Locale;
import android.content.Context;
import java.util.Set;

public abstract class c3a
{
    public static final Set a;
    public static final Set b;
    
    static {
        a = iw0.n1((Object[])new String[] { "http", "https" });
        b = iw0.n1((Object[])new String[] { "mailto", "tel", "sms" });
    }
    
    public static final void a(final ye6 ye6, final gva gva, final int n) {
        gva.i0(-511813528);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)ye6)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final Context context = (Context)gva.j((sei)q50.b);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if ((o = r) == a) {
                o = new ux8((byte)10);
                gva.q0(o);
            }
            final bnf bnf = (bnf)mlc.a0(new Object[0], (jta)o, gva, 48);
            final boolean f = gva.f((Object)context);
            final Object r2 = gva.R();
            b3a b3a;
            if (f || (b3a = (b3a)r2) == a) {
                b3a = new b3a(context, bnf);
                gva.q0((Object)b3a);
            }
            c5q.c(n35.a.a((Object)b3a), (zta)uuj.t0(1785461672, (aua)new bc3(ye6, (byte)5), gva), gva, 48);
            if (((String)((xom)bnf).getValue()).length() > 0) {
                gva.g0(-301651200);
                final String s = (String)((xom)bnf).getValue();
                final boolean f2 = gva.f((Object)bnf);
                final Object r3 = gva.R();
                Object o2;
                if (f2 || (o2 = r3) == a) {
                    o2 = new ny1(bnf, (byte)13);
                    gva.q0(o2);
                }
                ujq.b(s, (jta)o2, (lta)null, gva, 0, 4);
                gva.q(false);
            }
            else {
                gva.g0(-301533958);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new a3a(n, ye6);
        }
    }
    
    public static final String b(String s) {
        final yog d = d(s);
        if (d == null) {
            return null;
        }
        s = (String)d.v;
        if (((CharSequence)s).length() != 0) {
            for (int i = 0; i < ((CharSequence)s).length(); ++i) {
                if (((CharSequence)s).charAt(i) > '~') {
                    return null;
                }
            }
            final Locale root = Locale.ROOT;
            return oz1.r(root, s, root);
        }
        return null;
    }
    
    public static final boolean c(final String s) {
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            int n2 = n;
            if ('0' <= char1) {
                n2 = n;
                if (char1 < ':') {
                    n2 = n + 1;
                }
            }
            ++i;
            n = n2;
        }
        if (n >= 3) {
            final kw0 kw0 = new kw0((Object)new q9m((Object)s, (byte)7), (byte)1);
            if (!(kw0 instanceof Collection) || !((Collection)kw0).isEmpty()) {
                final Iterator iterator = kw0.iterator();
                while (true) {
                    final k1 k1 = (k1)iterator;
                    if (!((Iterator)k1.x).hasNext()) {
                        break;
                    }
                    final v7c v7c = (v7c)k1.next();
                    final int a = v7c.a;
                    final char charValue = (char)v7c.b;
                    if ('0' <= charValue && charValue < ':') {
                        continue;
                    }
                    if (kym.J0((CharSequence)" -().", charValue)) {
                        continue;
                    }
                    if (charValue == '+' && a == 0) {
                        continue;
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final yog d(final String s) {
        final String string = kym.B1((CharSequence)s).toString();
        final int v0 = kym.V0((CharSequence)string, ':', 0, 6);
        Integer value = v0;
        if (v0 < 0) {
            value = null;
        }
        if (value != null) {
            final int intValue = value;
            return new yog((Object)kym.z1(intValue, string), (Object)string.substring(intValue));
        }
        return null;
    }
}
