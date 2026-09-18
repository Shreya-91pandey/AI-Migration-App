import java.util.List;
import android.widget.Toast;
import java.util.Iterator;
import java.util.Collection;
import android.webkit.URLUtil;
import android.content.Context;

public final class b3a implements l35
{
    public final Context a;
    public final bnf b;
    
    public b3a(final Context a, final bnf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final lta lta, String s) {
        final String b = c3a.b(s);
        final zdd a = zdd.a;
        ydd ydd = null;
        Label_0537: {
            if (b != null) {
                boolean validUrl = false;
                Label_0440: {
                    if (c3a.a.contains((Object)b)) {
                        validUrl = URLUtil.isValidUrl(s);
                    }
                    else {
                        Label_0437: {
                            if (c3a.b.contains((Object)b)) {
                                final yog d = c3a.d(s);
                                if (d != null) {
                                    final String substring = ((String)d.w).substring(1);
                                    if (b.equals("mailto")) {
                                        final int v0 = kym.V0((CharSequence)substring, '@', 0, 6);
                                        if (v0 <= 0 || v0 >= substring.length() - 1) {
                                            break Label_0437;
                                        }
                                        final kw0 kw0 = new kw0((Object)new q9m((Object)substring, (byte)7), (byte)1);
                                        if (!(kw0 instanceof Collection) || !((Collection)kw0).isEmpty()) {
                                            final Iterator iterator = kw0.iterator();
                                            while (true) {
                                                final k1 k1 = (k1)iterator;
                                                if (!((Iterator)k1.x).hasNext()) {
                                                    break;
                                                }
                                                final v7c v7c = (v7c)k1.next();
                                                final int a2 = v7c.a;
                                                final char charValue = (char)v7c.b;
                                                if ('a' <= charValue && charValue < '{') {
                                                    continue;
                                                }
                                                if ('A' <= charValue && charValue < '[') {
                                                    continue;
                                                }
                                                if ('0' <= charValue && charValue < ':') {
                                                    continue;
                                                }
                                                if (kym.J0((CharSequence)"._+-", charValue)) {
                                                    continue;
                                                }
                                                if (a2 == v0) {
                                                    continue;
                                                }
                                                break Label_0437;
                                            }
                                        }
                                    }
                                    else if (b.equals("sms")) {
                                        final List l1 = kym.l1((CharSequence)substring, new char[] { ',', ';' }, 6);
                                        if (!((Collection)l1).isEmpty()) {
                                            final Iterator iterator2 = ((Iterable)l1).iterator();
                                            while (iterator2.hasNext()) {
                                                if (!c3a.c((String)iterator2.next())) {
                                                    break Label_0437;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        final String u1 = kym.u1(',', substring, substring);
                                        if (!c3a.c(kym.u1(';', u1, u1))) {
                                            break Label_0437;
                                        }
                                        for (int i = 0; i < substring.length(); ++i) {
                                            final char char1 = substring.charAt(i);
                                            if ('0' > char1 || char1 >= ':') {
                                                if (!kym.J0((CharSequence)" -().+,;*", char1)) {
                                                    break Label_0437;
                                                }
                                            }
                                        }
                                    }
                                    validUrl = true;
                                    break Label_0440;
                                }
                            }
                        }
                        validUrl = false;
                    }
                }
                if (validUrl) {
                    final yog d2 = c3a.d(s);
                    String s3 = null;
                    Label_0528: {
                        if (d2 != null) {
                            final String obj = (String)d2.v;
                            final String s2 = (String)d2.w;
                            final String b2 = c3a.b(s);
                            if (b2 != null) {
                                if (!b2.equals(obj) || !mlc.q((Object)kym.B1((CharSequence)s).toString(), (Object)s)) {
                                    s3 = smk.s(b2, s2);
                                    break Label_0528;
                                }
                            }
                        }
                        s3 = s;
                    }
                    ydd = new ydd(s3);
                    break Label_0537;
                }
            }
            ydd = (ydd)a;
        }
        if (ydd instanceof ydd) {
            this.b.setValue((Object)ydd.a());
            return;
        }
        if (ydd.equals(a)) {
            if (s.length() > 256) {
                if (Character.isHighSurrogate(s.charAt(255))) {
                    s = kym.z1(255, s).concat("\u2026");
                }
                else {
                    s = kym.z1(256, s).concat("\u2026");
                }
            }
            final Context a3 = this.a;
            Toast.makeText(a3, (CharSequence)a3.getString(2131758587, new Object[] { s }), 0).show();
            return;
        }
        en9.r();
    }
}
