import android.graphics.Region$Op;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Canvas;

public final class f40 implements x13
{
    public Canvas a;
    public Rect b;
    public Rect c;
    
    public f40() {
        this.a = g40.a;
    }
    
    @Override
    public final void a(final float n, final float n2) {
        this.a.scale(n, n2);
    }
    
    @Override
    public final void b(final float n) {
        this.a.rotate(n);
    }
    
    @Override
    public final void c(final float n, final long n2, final y80 y80) {
        this.a.drawCircle(Float.intBitsToFloat((int)(n2 >> 32)), Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)), n, y80.a);
    }
    
    @Override
    public final void d(final g90 g90, final y80 y80) {
        final Canvas a = this.a;
        if (g90 instanceof g90) {
            a.drawPath(g90.a, uoo.L(y80));
            return;
        }
        oyl.s("Unable to obtain android.graphics.Path");
    }
    
    @Override
    public final void e(final n70 n70, final long n71, final long n72, final long n73, final long n74, final y80 y80) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        final Canvas a = this.a;
        final Bitmap h = ien.h(n70);
        final Rect b = this.b;
        b.getClass();
        final int left = (int)(n71 >> 32);
        b.left = left;
        final int top = (int)(n71 & 0xFFFFFFFFL);
        b.top = top;
        b.right = left + (int)(n72 >> 32);
        b.bottom = top + (int)(n72 & 0xFFFFFFFFL);
        final Rect c = this.c;
        c.getClass();
        final int left2 = (int)(n73 >> 32);
        c.left = left2;
        final int top2 = (int)(n73 & 0xFFFFFFFFL);
        c.top = top2;
        c.right = left2 + (int)(n74 >> 32);
        c.bottom = top2 + (int)(n74 & 0xFFFFFFFFL);
        a.drawBitmap(h, b, c, y80.a);
    }
    
    @Override
    public final void f(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final y80 y80) {
        this.a.drawRoundRect(n, n2, n3, n4, n5, n6, uoo.L(y80));
    }
    
    @Override
    public final void g() {
        this.a.save();
    }
    
    @Override
    public final void h(final long n, final long n2, final y80 y80) {
        this.a.drawLine(Float.intBitsToFloat((int)(n >> 32)), Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)), Float.intBitsToFloat((int)(n2 >> 32)), Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)), y80.a);
    }
    
    @Override
    public final void i() {
        x3r.g(this.a, false);
    }
    
    @Override
    public final void j(final float n, final float n2, final float n3, final float n4, final y80 y80) {
        this.a.drawRect(n, n2, n3, n4, uoo.L(y80));
    }
    
    @Override
    public final void k(final float[] array) {
        if (!lq6.U(array)) {
            final Matrix matrix = new Matrix();
            zrn.T(matrix, array);
            this.a.concat(matrix);
        }
    }
    
    @Override
    public final void l(final g90 g90) {
        final Canvas a = this.a;
        if (g90 instanceof g90) {
            a.clipPath(g90.a, Region$Op.INTERSECT);
            return;
        }
        oyl.s("Unable to obtain android.graphics.Path");
    }
    
    @Override
    public final void m(final float n, final float n2, final float n3, final float n4, final int n5) {
        final Canvas a = this.a;
        Region$Op region$Op;
        if (n5 == 0) {
            region$Op = Region$Op.DIFFERENCE;
        }
        else {
            region$Op = Region$Op.INTERSECT;
        }
        a.clipRect(n, n2, n3, n4, region$Op);
    }
    
    @Override
    public final void n(final float n, final float n2) {
        this.a.translate(n, n2);
    }
    
    @Override
    public final void o(final n70 n70, final long n71, final y80 y80) {
        this.a.drawBitmap(ien.h(n70), Float.intBitsToFloat((int)(n71 >> 32)), Float.intBitsToFloat((int)(n71 & 0xFFFFFFFFL)), uoo.L(y80));
    }
    
    @Override
    public final void p() {
        this.a.restore();
    }
    
    @Override
    public final void r(final k2j k2j, final y80 y80) {
        this.a.saveLayer(k2j.a, k2j.b, k2j.c, k2j.d, y80.a, 31);
    }
    
    @Override
    public final void s() {
        x3r.g(this.a, true);
    }
    
    @Override
    public final void t(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final y80 y80) {
        this.a.drawArc(n, n2, n3, n4, n5, n6, false, y80.a);
    }
}
