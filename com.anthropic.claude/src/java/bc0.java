import android.graphics.Paint$Style;
import android.graphics.Shader;
import android.graphics.Paint;
import android.text.TextPaint;

public final class bc0 extends TextPaint
{
    public y80 a;
    public wgn b;
    public byte c;
    public rpl d;
    public j86 e;
    public qm2 f;
    public sd8 g;
    public yzl h;
    public dw8 i;
    
    public final y80 a() {
        final y80 a = this.a;
        if (a != null) {
            return a;
        }
        return this.a = new y80((Paint)this);
    }
    
    public final void b(final int c) {
        if (c == this.c) {
            return;
        }
        this.a().e(c);
        this.c = (byte)c;
    }
    
    public final void c(final qm2 f, final long n, final float n2) {
        if (f == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            ((Paint)this).setShader((Shader)null);
            return;
        }
        if (f instanceof cam) {
            this.d(nsk.z(n2, ((cam)f).a));
            return;
        }
        if (f instanceof opl) {
            Label_0143: {
                if (mlc.q((Object)this.f, (Object)f)) {
                    final yzl h = this.h;
                    if (h != null && yzl.b(h.a, n)) {
                        break Label_0143;
                    }
                }
                if (n != 9205357640488583168L) {
                    this.f = f;
                    this.h = new yzl(n);
                    this.g = r8m.b((jta)new ac0((Object)f, n, (byte)0));
                }
            }
            final y80 a = this.a();
            final sd8 g = this.g;
            Shader shader;
            if (g != null) {
                shader = (Shader)g.getValue();
            }
            else {
                shader = null;
            }
            a.j(shader);
            this.e = null;
            l9r.i((TextPaint)this, n2);
            return;
        }
        en9.r();
    }
    
    public final void d(final long n) {
        final j86 e = this.e;
        if ((e == null || !foo.a(e.a, n)) && n != 16L) {
            this.e = new j86(n);
            ((Paint)this).setColor(t08.o0(n));
            this.g = null;
            this.f = null;
            this.h = null;
            ((Paint)this).setShader((Shader)null);
        }
    }
    
    public final void e(final dw8 i) {
        if (i != null) {
            if (!mlc.q((Object)this.i, (Object)i)) {
                this.i = i;
                if (i.equals(gea.a)) {
                    ((Paint)this).setStyle(Paint$Style.FILL);
                    return;
                }
                if (i instanceof tym) {
                    this.a().n(1);
                    final y80 a = this.a();
                    final tym tym = (tym)i;
                    a.m(tym.a);
                    this.a().a.setStrokeMiter(tym.b);
                    this.a().l(tym.d);
                    this.a().k(tym.c);
                    this.a().i(tym.e);
                    return;
                }
                en9.r();
            }
        }
    }
    
    public final void f(rpl d) {
        if (d != null) {
            if (!mlc.q((Object)this.d, (Object)d)) {
                this.d = d;
                if (d.equals((Object)rpl.d)) {
                    ((Paint)this).clearShadowLayer();
                    return;
                }
                d = this.d;
                float c;
                if ((c = d.c) == 0.0f) {
                    c = Float.MIN_VALUE;
                }
                ((Paint)this).setShadowLayer(c, Float.intBitsToFloat((int)(d.b >> 32)), Float.intBitsToFloat((int)(this.d.b & 0xFFFFFFFFL)), t08.o0(this.d.a));
            }
        }
    }
    
    public final void g(final wgn b) {
        if (b != null) {
            if (!mlc.q((Object)this.b, (Object)b)) {
                this.b = b;
                final int a = b.a;
                final boolean b2 = false;
                ((Paint)this).setUnderlineText((a | 0x1) == a);
                final int a2 = this.b.a;
                boolean strikeThruText = b2;
                if ((a2 | 0x2) == a2) {
                    strikeThruText = true;
                }
                ((Paint)this).setStrikeThruText(strikeThruText);
            }
        }
    }
}
