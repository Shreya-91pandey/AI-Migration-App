import android.graphics.Paint$Style;
import android.graphics.PathEffect;
import android.graphics.ColorFilter;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.os.Build$VERSION;
import android.graphics.Shader;
import android.graphics.Paint;

public final class y80
{
    public final Paint a;
    public int b;
    public Shader c;
    public he2 d;
    public ivg e;
    
    public y80(final Paint a) {
        this.a = a;
        this.b = 3;
    }
    
    public final long a() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Paint a = this.a;
        if (sdk_INT >= 29) {
            return f9q.a.a(a);
        }
        return t08.c(a.getColor());
    }
    
    public final int b() {
        final Paint$Cap strokeCap = this.a.getStrokeCap();
        int n;
        if (strokeCap == null) {
            n = -1;
        }
        else {
            n = z80.a[((Enum)strokeCap).ordinal()];
        }
        if (n != 1) {
            if (n == 2) {
                return 1;
            }
            if (n == 3) {
                return 2;
            }
        }
        return 0;
    }
    
    public final int c() {
        final Paint$Join strokeJoin = this.a.getStrokeJoin();
        int n;
        if (strokeJoin == null) {
            n = -1;
        }
        else {
            n = z80.b[((Enum)strokeJoin).ordinal()];
        }
        if (n != 1) {
            if (n == 2) {
                return 2;
            }
            if (n == 3) {
                return 1;
            }
        }
        return 0;
    }
    
    public final void d(final float n) {
        this.a.setAlpha((int)(float)Math.rint((double)(n * 255.0f)));
    }
    
    public final void e(final int b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Paint a = this.a;
        if (sdk_INT >= 29) {
            f9q.a.b(a, b);
            return;
        }
        a.setXfermode((Xfermode)new PorterDuffXfermode(soh.a0(b)));
    }
    
    public final void f(final long n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Paint a = this.a;
        if (sdk_INT >= 29) {
            f9q.a.c(a, n);
            return;
        }
        a.setColor(t08.o0(n));
    }
    
    public final void g(final he2 d) {
        this.d = d;
        ColorFilter a;
        if (d != null) {
            a = d.a;
        }
        else {
            a = null;
        }
        this.a.setColorFilter(a);
    }
    
    public final void h(int n) {
        if (n == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.a.setFilterBitmap((boolean)((n ^ 0x1) != 0x0));
    }
    
    public final void i(final ivg e) {
        final h90 h90 = (h90)e;
        PathEffect a;
        if (h90 != null) {
            a = h90.a();
        }
        else {
            a = null;
        }
        this.a.setPathEffect(a);
        this.e = e;
    }
    
    public final void j(final Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }
    
    public final void k(final int n) {
        Paint$Cap strokeCap;
        if (n == 2) {
            strokeCap = Paint$Cap.SQUARE;
        }
        else if (n == 1) {
            strokeCap = Paint$Cap.ROUND;
        }
        else if (n == 0) {
            strokeCap = Paint$Cap.BUTT;
        }
        else {
            strokeCap = Paint$Cap.BUTT;
        }
        this.a.setStrokeCap(strokeCap);
    }
    
    public final void l(final int n) {
        Paint$Join strokeJoin;
        if (n == 0) {
            strokeJoin = Paint$Join.MITER;
        }
        else if (n == 2) {
            strokeJoin = Paint$Join.BEVEL;
        }
        else if (n == 1) {
            strokeJoin = Paint$Join.ROUND;
        }
        else {
            strokeJoin = Paint$Join.MITER;
        }
        this.a.setStrokeJoin(strokeJoin);
    }
    
    public final void m(final float strokeWidth) {
        this.a.setStrokeWidth(strokeWidth);
    }
    
    public final void n(final int n) {
        Paint$Style style;
        if (n == 1) {
            style = Paint$Style.STROKE;
        }
        else {
            style = Paint$Style.FILL;
        }
        this.a.setStyle(style);
    }
}
