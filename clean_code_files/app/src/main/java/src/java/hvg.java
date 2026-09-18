import android.graphics.Path$FillType;
import java.util.List;

public final class hvg extends s5p
{
    public qm2 b;
    public float c;
    public List d;
    public float e;
    public float f;
    public qm2 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public tym q;
    public final g90 r;
    public g90 s;
    public g90 t;
    public final d2d u;
    
    public hvg() {
        this.c = 1.0f;
        final int a = l6p.a;
        this.d = (List)r89.v;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        final g90 a2 = j90.a();
        this.r = a2;
        this.s = a2;
        this.u = ncq.F(3, (jta)new mff((byte)20));
    }
    
    @Override
    public final void a(final cw8 cw8) {
        if (this.n) {
            ien.M(this.d, this.r);
            this.e();
        }
        else if (this.p) {
            this.e();
        }
        this.n = false;
        this.p = false;
        final qm2 b = this.b;
        if (b != null) {
            cw8.s0(cw8, this.s, b, this.c, null, 56);
        }
        final qm2 g = this.g;
        if (g != null) {
            tym q = this.q;
            if (this.o || q == null) {
                q = new tym(this.f, this.j, this.h, this.i, null, 16);
                this.q = q;
                this.o = false;
            }
            cw8.s0(cw8, this.s, g, this.e, q, 48);
        }
    }
    
    public final void e() {
        final float k = this.k;
        final g90 r = this.r;
        if (k == 0.0f && this.l == 1.0f) {
            this.s = r;
            return;
        }
        final g90 s = this.s;
        if (s != r) {
            int n;
            if (s.a.getFillType() == Path$FillType.EVEN_ODD) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.s.l();
            this.s.m(n);
        }
        else {
            this.s = j90.a();
        }
        final d2d u = this.u;
        ((i90)u.getValue()).c(r);
        final float a = ((i90)u.getValue()).a();
        final float i = this.k;
        final float m = this.m;
        final float n2 = (i + m) % 1.0f * a;
        final float n3 = (this.l + m) % 1.0f * a;
        if (n2 > n3) {
            g90 t = this.t;
            if (t == null) {
                t = j90.a();
                this.t = t;
            }
            t.k();
            ((i90)u.getValue()).b(n2, a, t);
            g90.c(this.s, t);
            t.k();
            ((i90)u.getValue()).b(0.0f, n3, t);
            g90.c(this.s, t);
            return;
        }
        ((i90)u.getValue()).b(n2, n3, this.s);
    }
    
    @Override
    public final String toString() {
        return this.r.toString();
    }
}
