import android.os.Build$VERSION;
import android.view.inputmethod.CursorAnchorInfo;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo$Builder;

public final class nr7
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    
    public nr7(final jfj jfj) {
        this.e = jfj.b;
        this.f = jfj.c;
        this.g = jfj.a.c;
        this.h = jfj.o;
        this.i = jfj.s;
        this.j = jfj.t;
        this.k = jfj.u;
        this.a = jfj.p;
        this.b = jfj.q;
        this.c = jfj.r;
        this.l = jfj.w;
        this.d = jfj.x;
    }
    
    public nr7(final peo e, final qmn f, final ko1 g, final oc7 h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = new CursorAnchorInfo$Builder();
        this.k = l8e.a();
        this.l = new Matrix();
    }
    
    public CursorAnchorInfo a() {
        final Matrix matrix = (Matrix)this.l;
        final float[] array = (float[])this.k;
        final qmn qmn = (qmn)this.f;
        nzc e = qmn.e();
        if (e != null) {
            if (!e.p()) {
                e = null;
            }
            if (e != null) {
                nzc nzc = (nzc)qmn.e.getValue();
                if (nzc != null) {
                    if (!nzc.p()) {
                        nzc = null;
                    }
                    if (nzc != null) {
                        nzc b = qmn.b();
                        if (b != null) {
                            if (!b.p()) {
                                b = null;
                            }
                            if (b != null) {
                                final omn c = qmn.c();
                                if (c != null) {
                                    final hhn f = ((peo)this.e).f();
                                    l8e.d(array);
                                    e.h(array);
                                    zrn.T(matrix, array);
                                    final k2j m = tsf.Y(nzc).m(e.H(nzc, 0L));
                                    final k2j i = tsf.Y(b).m(e.H(b, 0L));
                                    final CursorAnchorInfo$Builder cursorAnchorInfo$Builder = (CursorAnchorInfo$Builder)this.j;
                                    final long y = f.y;
                                    final dnn z = f.z;
                                    final boolean a = this.a;
                                    final boolean b2 = this.b;
                                    final boolean c2 = this.c;
                                    final boolean d = this.d;
                                    cursorAnchorInfo$Builder.reset();
                                    cursorAnchorInfo$Builder.setMatrix(matrix);
                                    final int g = dnn.g(y);
                                    cursorAnchorInfo$Builder.setSelectionRange(g, dnn.f(y));
                                    if (a) {
                                        if (g >= 0) {
                                            final k2j c3 = c.c(g);
                                            final float n = ncq.n(c3.a, 0.0f, (float)(int)(c.c >> 32));
                                            final boolean y2 = lq6.y(m, n, c3.b);
                                            final boolean y3 = lq6.y(m, n, c3.d);
                                            final boolean b3 = c.a(g) == 2;
                                            final boolean b4 = y2 || y3;
                                            int n2 = 0;
                                            Label_0439: {
                                                if (y2) {
                                                    n2 = (b4 ? 1 : 0);
                                                    if (y3) {
                                                        break Label_0439;
                                                    }
                                                }
                                                n2 = ((b4 ? 1 : 0) | 0x2);
                                            }
                                            int n3 = n2;
                                            if (b3) {
                                                n3 = (n2 | 0x4);
                                            }
                                            final float b5 = c3.b;
                                            final float d2 = c3.d;
                                            cursorAnchorInfo$Builder.setInsertionMarkerLocation(n, b5, d2, d2, n3);
                                        }
                                    }
                                    boolean b6 = d;
                                    if (b2) {
                                        int f2 = -1;
                                        int g2;
                                        if (z != null) {
                                            g2 = dnn.g(z.a);
                                        }
                                        else {
                                            g2 = -1;
                                        }
                                        if (z != null) {
                                            f2 = dnn.f(z.a);
                                        }
                                        b6 = d;
                                        if (g2 >= 0) {
                                            b6 = d;
                                            if (g2 < f2) {
                                                cursorAnchorInfo$Builder.setComposingText(g2, f.x.subSequence(g2, f2));
                                                final float[] array2 = new float[(f2 - g2) * 4];
                                                c.b.a(rhc.c(g2, f2), array2);
                                                int n4 = g2;
                                                while (true) {
                                                    final int n5 = n4;
                                                    b6 = d;
                                                    if (n5 >= f2) {
                                                        break;
                                                    }
                                                    final int n6 = (n5 - g2) * 4;
                                                    final float n7 = array2[n6];
                                                    final float n8 = array2[n6 + 1];
                                                    final float n9 = array2[n6 + 2];
                                                    final float n10 = array2[n6 + 3];
                                                    final boolean b7 = m.a < n9 & n7 < m.c & m.b < n10 & n8 < m.d;
                                                    int n11 = 0;
                                                    Label_0776: {
                                                        if (lq6.y(m, n7, n8)) {
                                                            n11 = (b7 ? 1 : 0);
                                                            if (lq6.y(m, n9, n10)) {
                                                                break Label_0776;
                                                            }
                                                        }
                                                        n11 = ((b7 ? 1 : 0) | 0x2);
                                                    }
                                                    int n12 = n11;
                                                    if (c.a(n5) == 2) {
                                                        n12 = (n11 | 0x4);
                                                    }
                                                    cursorAnchorInfo$Builder.addCharacterBounds(n5, n7, n8, n9, n10, n12);
                                                    n4 = n5 + 1;
                                                }
                                            }
                                        }
                                    }
                                    final int sdk_INT = Build$VERSION.SDK_INT;
                                    if (sdk_INT >= 33 && c2) {
                                        mo2.e(cursorAnchorInfo$Builder, i);
                                    }
                                    if (sdk_INT >= 34 && b6) {
                                        uoo.j(cursorAnchorInfo$Builder, c, m);
                                    }
                                    return cursorAnchorInfo$Builder.build();
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
