import androidx.compose.ui.platform.AndroidComposeView;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;

public final class ctk
{
    public final LayoutNode a;
    public final x89 b;
    public final sgc c;
    public final emf d;
    
    public ctk(final LayoutNode a, final x89 b, final jlf c) {
        this.a = a;
        this.b = b;
        this.c = (sgc)c;
        this.d = new emf(2);
    }
    
    public final zsk a() {
        return new zsk(this.b, false, this.a, new tsk());
    }
    
    public final void b(final LayoutNode layoutNode, final tsk tsk) {
        final emf d = this.d;
        final Object[] a = d.a;
        for (int b = d.b, i = 0; i < b; ++i) {
            final c40 c40 = (c40)a[i];
            c40.getClass();
            final tsk j = layoutNode.I();
            final int w = layoutNode.w;
            final e3a v = c40.v;
            final AndroidComposeView x = c40.x;
            u50 u50;
            if (tsk != null) {
                Object g;
                if ((g = tsk.v.g((Object)etk.s)) == null) {
                    g = null;
                }
                u50 = (u50)g;
            }
            else {
                u50 = null;
            }
            u50 u51;
            if (j != null) {
                Object g2;
                if ((g2 = j.v.g((Object)etk.s)) == null) {
                    g2 = null;
                }
                u51 = (u50)g2;
            }
            else {
                u51 = null;
            }
            final u50 m = wab.M;
            final boolean q = mlc.q((Object)u51, (Object)m);
            int n = 1;
            if (q) {
                if (!mlc.q((Object)u50, (Object)m)) {
                    v.H((View)x, w, false);
                }
            }
            else {
                if (mlc.q((Object)u50, (Object)m) && !mlc.q((Object)u51, (Object)m)) {
                    v.H((View)x, w, true);
                }
                String w2 = null;
                Label_0293: {
                    if (tsk != null) {
                        Object g3;
                        if ((g3 = tsk.v.g((Object)etk.F)) == null) {
                            g3 = null;
                        }
                        final og0 og0 = (og0)g3;
                        if (og0 != null) {
                            w2 = og0.w;
                            break Label_0293;
                        }
                    }
                    w2 = null;
                }
                String w3 = null;
                Label_0352: {
                    if (j != null) {
                        Object g4;
                        if ((g4 = j.v.g((Object)etk.F)) == null) {
                            g4 = null;
                        }
                        final og0 og2 = (og0)g4;
                        if (og2 != null) {
                            w3 = og2.w;
                            break Label_0352;
                        }
                    }
                    w3 = null;
                }
                if (w2 != w3) {
                    if (w2 == null) {
                        v.H((View)x, w, true);
                    }
                    else if (w3 == null) {
                        v.H((View)x, w, false);
                    }
                    else if (mlc.q((Object)u51, (Object)wab.N)) {
                        v.C().notifyValueChanged((View)x, w, nsk.s(w3));
                    }
                }
                c1o c1o;
                if (tsk != null) {
                    Object g5;
                    if ((g5 = tsk.v.g((Object)etk.L)) == null) {
                        g5 = null;
                    }
                    c1o = (c1o)g5;
                }
                else {
                    c1o = null;
                }
                c1o c1o2;
                if (j != null) {
                    Object g6;
                    if ((g6 = j.v.g((Object)etk.L)) == null) {
                        g6 = null;
                    }
                    c1o2 = (c1o)g6;
                }
                else {
                    c1o2 = null;
                }
                if (c1o != c1o2) {
                    if (c1o == null) {
                        v.H((View)x, w, true);
                    }
                    else if (c1o2 == null) {
                        v.H((View)x, w, false);
                    }
                    else if (mlc.q((Object)u51, (Object)wab.O)) {
                        final int ordinal = c1o2.ordinal();
                        Boolean b2;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                b2 = null;
                            }
                            else {
                                b2 = Boolean.FALSE;
                            }
                        }
                        else {
                            b2 = Boolean.TRUE;
                        }
                        if (b2 != null) {
                            v.C().notifyValueChanged((View)x, w, nsk.t((boolean)b2));
                        }
                    }
                }
                b70 b3;
                if (tsk != null) {
                    Object g7;
                    if ((g7 = tsk.v.g((Object)etk.t)) == null) {
                        g7 = null;
                    }
                    b3 = (b70)g7;
                }
                else {
                    b3 = null;
                }
                b70 b4;
                if (j != null) {
                    Object g8;
                    if ((g8 = j.v.g((Object)etk.t)) == null) {
                        g8 = null;
                    }
                    b4 = (b70)g8;
                }
                else {
                    b4 = null;
                }
                if (!mlc.q((Object)b3, (Object)b4)) {
                    if (b3 == null) {
                        v.H((View)x, w, true);
                    }
                    else if (b4 == null) {
                        v.H((View)x, w, false);
                    }
                    else {
                        v.C().notifyValueChanged((View)x, w, b4.a);
                    }
                }
            }
            final boolean b5 = tsk != null && tsk.v.b((Object)etk.r);
            if (j == null || !j.v.b((Object)etk.r)) {
                n = 0;
            }
            if ((b5 ? 1 : 0) != n) {
                final klf c41 = c40.C;
                if (n != 0) {
                    c41.a(w);
                }
                else {
                    c41.g(w);
                }
            }
        }
    }
}
