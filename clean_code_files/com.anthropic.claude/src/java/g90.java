import android.graphics.Path$FillType;
import android.graphics.Path$Op;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Path;

public final class g90
{
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;
    
    public g90(final Path a) {
        this.a = a;
    }
    
    public static void a(final g90 g90, final k2j k2j) {
        RectF b;
        if ((b = g90.b) == null) {
            b = new RectF();
            g90.b = b;
        }
        b.set(k2j.a, k2j.b, k2j.c, k2j.d);
        final Path a = g90.a;
        final RectF b2 = g90.b;
        b2.getClass();
        a.addOval(b2, j90.c(1));
    }
    
    public static void c(final g90 g90, final g90 g91) {
        g90.b(g91, 0L);
    }
    
    public static void d(final g90 g90, final k2j k2j) {
        final float a = k2j.a;
        final float d = k2j.d;
        final float c = k2j.c;
        final float b = k2j.b;
        if (Float.isNaN(a) || Float.isNaN(b) || Float.isNaN(c) || Float.isNaN(d)) {
            j90.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF b2;
        if ((b2 = g90.b) == null) {
            b2 = new RectF();
            g90.b = b2;
        }
        b2.set(a, b, c, d);
        final Path a2 = g90.a;
        final RectF b3 = g90.b;
        b3.getClass();
        a2.addRect(b3, j90.c(1));
    }
    
    public static void e(final g90 g90, final lvj lvj) {
        RectF b;
        if ((b = g90.b) == null) {
            b = new RectF();
            g90.b = b;
        }
        final float a = lvj.a;
        final long h = lvj.h;
        final long g91 = lvj.g;
        final long f = lvj.f;
        final long e = lvj.e;
        b.set(a, lvj.b, lvj.c, lvj.d);
        float[] c;
        if ((c = g90.c) == null) {
            c = new float[8];
            g90.c = c;
        }
        c[0] = Float.intBitsToFloat((int)(e >> 32));
        c[1] = Float.intBitsToFloat((int)(e & 0xFFFFFFFFL));
        c[2] = Float.intBitsToFloat((int)(f >> 32));
        c[3] = Float.intBitsToFloat((int)(f & 0xFFFFFFFFL));
        c[4] = Float.intBitsToFloat((int)(g91 >> 32));
        c[5] = Float.intBitsToFloat((int)(g91 & 0xFFFFFFFFL));
        c[6] = Float.intBitsToFloat((int)(h >> 32));
        c[7] = Float.intBitsToFloat((int)(h & 0xFFFFFFFFL));
        final Path a2 = g90.a;
        final RectF b2 = g90.b;
        b2.getClass();
        final float[] c2 = g90.c;
        c2.getClass();
        a2.addRoundRect(b2, c2, j90.c(1));
    }
    
    public final void b(final g90 g90, final long n) {
        if (g90 instanceof g90) {
            this.a.addPath(g90.a, Float.intBitsToFloat((int)(n >> 32)), Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)));
            return;
        }
        oyl.s("Unable to obtain android.graphics.Path");
    }
    
    public final void f(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.a.cubicTo(n, n2, n3, n4, n5, n6);
    }
    
    public final k2j g() {
        RectF b;
        if ((b = this.b) == null) {
            b = new RectF();
            this.b = b;
        }
        this.a.computeBounds(b, true);
        return new k2j(b.left, b.top, b.right, b.bottom);
    }
    
    public final void h(final float n, final float n2) {
        this.a.lineTo(n, n2);
    }
    
    public final void i(final float n, final float n2) {
        this.a.moveTo(n, n2);
    }
    
    public final boolean j(final g90 g90, final g90 g91, final int n) {
        Path$Op path$Op;
        if (bkq.t(n, 0)) {
            path$Op = Path$Op.DIFFERENCE;
        }
        else if (bkq.t(n, 1)) {
            path$Op = Path$Op.INTERSECT;
        }
        else if (bkq.t(n, 4)) {
            path$Op = Path$Op.REVERSE_DIFFERENCE;
        }
        else if (bkq.t(n, 2)) {
            path$Op = Path$Op.UNION;
        }
        else {
            path$Op = Path$Op.XOR;
        }
        if (!(g90 instanceof g90)) {
            oyl.s("Unable to obtain android.graphics.Path");
            return false;
        }
        final Path a = g90.a;
        if (g91 instanceof g90) {
            return this.a.op(a, g91.a, path$Op);
        }
        oyl.s("Unable to obtain android.graphics.Path");
        return false;
    }
    
    public final void k() {
        this.a.reset();
    }
    
    public final void l() {
        this.a.rewind();
    }
    
    public final void m(final int n) {
        Path$FillType fillType;
        if (n == 1) {
            fillType = Path$FillType.EVEN_ODD;
        }
        else {
            fillType = Path$FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }
    
    public final void n(final long n) {
        final Matrix d = this.d;
        if (d == null) {
            this.d = new Matrix();
        }
        else {
            d.reset();
        }
        final Matrix d2 = this.d;
        d2.getClass();
        d2.setTranslate(Float.intBitsToFloat((int)(n >> 32)), Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)));
        final Matrix d3 = this.d;
        d3.getClass();
        this.a.transform(d3);
    }
}
