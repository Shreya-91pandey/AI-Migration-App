import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.node.Owner;

public abstract class sbh
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new mff((byte)29), (byte)1);
    }
    
    public static final void a(final zz3 value, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1892278287);
        int n2;
        if (gva.f((Object)value)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            final b09 a = sbh.a;
            final cd3 cd3 = (cd3)gva.j((sei)a);
            final boolean f = gva.f((Object)cd3);
            final Object r = gva.R();
            cd3 cd4;
            if (f || (cd4 = (cd3)r) == bi6.a) {
                cd4 = new cd3(value, cd3);
                gva.q0((Object)cd4);
            }
            final cd3 cd5 = cd4;
            cd5.b.setValue((Object)value);
            c5q.c(a.a((Object)cd5), (zta)ye6, gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new txf((Object)value, (Object)ye6, n, (byte)3);
        }
    }
    
    public static final void b(final pbh pbh, final zta zta, final h07 h07) {
        Object o = null;
        Label_0050: {
            if (h07 instanceof qbh) {
                final qbh qbh = (qbh)h07;
                final int w = qbh.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    qbh.w = w + Integer.MIN_VALUE;
                    o = qbh;
                    break Label_0050;
                }
            }
            o = new h07((f07)h07);
        }
        final Object v = ((qbh)o).v;
        final int w2 = ((qbh)o).w;
        if (w2 != 0) {
            if (w2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            throw ge9.w(v);
        }
        else {
            vt4.g0(v);
            if (((hgf)pbh).v.I) {
                final Owner m = soh.M((t98)pbh);
                final e3h e3h = (e3h)soh.L((t98)pbh).X;
                e3h.getClass();
                final cd3 cd3 = (cd3)ncq.K(e3h, (sei)sbh.a);
                ((qbh)o).w = 1;
                c(m, cd3, zta, (h07)o);
                return;
            }
            en9.s("establishTextInputSession called from an unattached node");
        }
    }
    
    public static final void c(final Owner owner, final cd3 cd3, final zta zta, final h07 h07) {
        h07 h8 = null;
        Label_0053: {
            if (h07 instanceof rbh) {
                final rbh rbh = (rbh)h07;
                final int w = rbh.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    rbh.w = w + Integer.MIN_VALUE;
                    h8 = (h07)rbh;
                    break Label_0053;
                }
            }
            h8 = new h07((f07)h07);
        }
        final Object v = ((rbh)h8).v;
        final int w2 = ((rbh)h8).w;
        if (w2 != 0) {
            if (w2 == 1) {
                throw ge9.w(v);
            }
            if (w2 != 2) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            throw ge9.w(v);
        }
        else {
            vt4.g0(v);
            if (cd3 == null) {
                ((rbh)h8).w = 1;
                ((AndroidComposeView)owner).K(zta, h8);
                return;
            }
            ((rbh)h8).w = 2;
            cd3.a(owner, zta, h8);
        }
    }
}
