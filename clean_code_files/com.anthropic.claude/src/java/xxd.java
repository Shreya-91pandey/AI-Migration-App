import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.node.Owner;

public final class xxd extends n8h
{
    public final byte w;
    public final Object x;
    
    @Override
    public float a(final wlb wlb) {
        switch (this.w) {
            default: {
                return super.a(wlb);
            }
            case 0: {
                final zta a = wlb.a;
                final float n = Float.NaN;
                float n2;
                if (a != null) {
                    n2 = ((Number)a.d((Object)this, (Object)Float.NaN)).floatValue();
                }
                else {
                    final wxd v = (wxd)this.x;
                    if (v.J) {
                        n2 = n;
                    }
                    else {
                        final Object o = new Object();
                        ((b4j)o).v = v;
                        while (true) {
                            final kob l = ((wxd)((b4j)o).v).L;
                            float n3 = 0.0f;
                            Label_0163: {
                                if (l != null) {
                                    final int b1 = iw0.b1((Object[])l.b, (Object)wlb);
                                    if (b1 >= 0) {
                                        n3 = ((float[])l.c)[b1];
                                        break Label_0163;
                                    }
                                }
                                n3 = Float.NaN;
                            }
                            final boolean naN = Float.isNaN(n3);
                            final Object v2 = ((b4j)o).v;
                            if (!naN) {
                                ((wxd)v2).f0(v.x0(), wlb);
                                n2 = wlb.a(n3, ((wxd)((b4j)o).v).u0(), v.u0());
                                break;
                            }
                            final wxd wxd = (wxd)v2;
                            final zta c = wxd.C;
                            if (c != null) {
                                final lta d = wxd.D;
                                if (d != null && (boolean)d.b((Object)wlb)) {
                                    final wxd wxd2 = (wxd)((b4j)o).v;
                                    tmf f;
                                    if ((f = wxd2.F) == null) {
                                        final long[] a2 = jak.a;
                                        f = new tmf();
                                        wxd2.F = f;
                                    }
                                    Object g;
                                    if ((g = f.g((Object)wlb)) == null) {
                                        g = new q8h(wxd2.y0(), wxd2, wlb);
                                        f.m((Object)wlb, g);
                                    }
                                    final q8h q8h = (q8h)g;
                                    q8h.v = wxd2.y0();
                                    final Owner j = v.x0().J;
                                    if (j != null) {
                                        final lmg snapshotObserver = j.getSnapshotObserver();
                                        if (snapshotObserver != null) {
                                            snapshotObserver.a.d(q8h, (lta)wxd.O, (jta)new p8c((Object)c, o, (Object)wlb, (byte)8));
                                        }
                                    }
                                    ((wxd)((b4j)o).v).f0(v.x0(), wlb);
                                    final kob i = ((wxd)((b4j)o).v).L;
                                    float n4 = 0.0f;
                                    Label_0510: {
                                        if (i != null) {
                                            final int b2 = iw0.b1((Object[])i.b, (Object)wlb);
                                            if (b2 >= 0) {
                                                n4 = ((float[])i.c)[b2];
                                                break Label_0510;
                                            }
                                        }
                                        n4 = Float.NaN;
                                    }
                                    if (!Float.isNaN(n4)) {
                                        n2 = wlb.a(n4, ((wxd)((b4j)o).v).u0(), v.u0());
                                        break;
                                    }
                                }
                            }
                            final wxd z0 = ((wxd)((b4j)o).v).z0();
                            if (z0 == null) {
                                ((wxd)((b4j)o).v).f0(v.x0(), wlb);
                                n2 = n;
                                break;
                            }
                            ((b4j)o).v = z0;
                        }
                    }
                }
                return n2;
            }
        }
    }
    
    @Override
    public final nzc b() {
        final byte w = this.w;
        final Object x = this.x;
        switch (w) {
            default: {
                return ((Owner)x).getRoot().getOuterCoordinator$ui();
            }
            case 0: {
                final wxd wxd = (wxd)x;
                nzc u0;
                if (wxd.J) {
                    u0 = null;
                }
                else {
                    u0 = wxd.u0();
                }
                if (u0 == null) {
                    wxd.x0().t().b();
                }
                return u0;
            }
        }
    }
    
    @Override
    public final qzc c() {
        final byte w = this.w;
        final Object x = this.x;
        switch (w) {
            default: {
                return ((Owner)x).getLayoutDirection();
            }
            case 0: {
                return ((flc)x).getLayoutDirection();
            }
        }
    }
    
    @Override
    public final int d() {
        final byte w = this.w;
        final Object x = this.x;
        switch (w) {
            default: {
                return ((Owner)x).getRoot().J();
            }
            case 0: {
                return ((wxd)x).V();
            }
        }
    }
    
    public final float getDensity() {
        final byte w = this.w;
        final Object x = this.x;
        switch (w) {
            default: {
                return ((Owner)x).getDensity().getDensity();
            }
            case 0: {
                return ((xc8)x).getDensity();
            }
        }
    }
    
    public final float o0() {
        final byte w = this.w;
        final Object x = this.x;
        switch (w) {
            default: {
                return ((Owner)x).getDensity().o0();
            }
            case 0: {
                return ((xc8)x).o0();
            }
        }
    }
}
