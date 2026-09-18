import java.util.List;
import com.anthropic.router.panes.Panes;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import com.anthropic.claude.app.ClaudeAppDestination;

public abstract class ox8
{
    public static final px4 a(final nx8 nx8, final jta jta, final frg frg, final ClaudeAppDestination claudeAppDestination, jta jta2, final gva gva, int n, int size) {
        if ((size & 0x10) != 0x0) {
            jta2 = null;
        }
        final odk a = ii8.a(gva);
        final boolean f = gva.f((Object)null);
        final boolean f2 = gva.f((Object)a);
        final Object r = gva.R();
        final cib a2 = bi6.a;
        Object o;
        if ((f | f2) || (o = r) == a2) {
            o = a.d((Class)bx8.class, (emi)null);
            gva.q0(o);
        }
        final bx8 bx8 = (bx8)o;
        final rp4 rp4 = (rp4)frg.w.getValue();
        final zp4 d = rp4.d;
        final ArrayList a3 = rp4.a;
        final zp4 v = zp4.v;
        boolean b = true;
        ry4 ry4 = ry4.w;
        final ry4 x = ry4.x;
        Label_0200: {
            if (d == v) {
                size = rp4.b.size();
                if (a3.size() + size <= 1) {
                    break Label_0200;
                }
            }
            else {
                if (!(claudeAppDestination instanceof ClaudeAppDestination.List)) {
                    ry4 = ry4.v;
                    break Label_0200;
                }
                if (a3.size() <= 1) {
                    break Label_0200;
                }
            }
            ry4 = x;
        }
        if (jta2 == null) {
            gva.g0(864720915);
            if ((((n & 0x380) ^ 0x180) > 256 && gva.h((Object)frg)) || (n & 0x180) == 0x100) {
                size = 1;
            }
            else {
                size = 0;
            }
            if ((((n & 0x1C00) ^ 0xC00) > 2048 && gva.h((Object)claudeAppDestination)) || (n & 0xC00) == 0x800) {
                n = 1;
            }
            else {
                n = 0;
            }
            final Object r2 = gva.R();
            Object o2;
            if ((n | size) != 0x0 || (o2 = r2) == a2) {
                o2 = new jd0((Object)frg, (Object)claudeAppDestination, (byte)25);
                gva.q0(o2);
            }
            jta2 = (jta)o2;
            gva.q(false);
        }
        else {
            gva.g0(27893758);
            gva.q(false);
        }
        bx8.getClass();
        final td9 x2 = sw8.x;
        if (!((j0)x2).isEmpty()) {
            for (final sw8 sw8 : x2) {
                if (!(boolean)y5e.X((Object)sw8, (Map)bx8.d)) {
                    final krf a4 = bx8.a;
                    if (cx8.a[((Enum)sw8).ordinal()] != 1) {
                        en9.r();
                        return null;
                    }
                    if (a4.l()) {
                        return new px4(ry4, nx8, jta2, jta, b);
                    }
                    continue;
                }
            }
        }
        b = false;
        return new px4(ry4, nx8, jta2, jta, b);
    }
    
    public static final void b(final frg frg, final ClaudeAppDestination claudeAppDestination, final jta jta) {
        final Panes p3 = tar.p((rp4)frg.w.getValue());
        final List a = p3.a;
        final int r = o47.r(claudeAppDestination);
        if (r != 0) {
            if (r == 1) {
                final List b = p3.b;
                Label_0132: {
                    if (mlc.q(c86.R0(b), (Object)claudeAppDestination)) {
                        final int size = a.size();
                        final int size2 = b.size();
                        if (size2 > 0) {
                            if (size > 0) {
                                break Label_0132;
                            }
                            if (size2 > 1) {
                                break Label_0132;
                            }
                        }
                        jta.a();
                        return;
                    }
                }
                frg.b((lta)new crg(claudeAppDestination, (byte)0), (zta)new v6e((byte)28));
                return;
            }
            if (r == 2) {
                frg.b((lta)new crg(claudeAppDestination, (byte)1), (zta)new v6e((byte)28));
                return;
            }
            en9.r();
        }
        else {
            if (mlc.q(c86.i1(a), (Object)claudeAppDestination)) {
                jta.a();
                return;
            }
            frg.b((lta)new crg(claudeAppDestination, (byte)2), (zta)new v6e((byte)28));
        }
    }
}
