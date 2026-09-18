import java.util.Collections;
import java.util.List;
import java.util.Objects;
import android.view.View;
import android.graphics.Rect;
import android.os.Build$VERSION;

public class e2q
{
    public static final h2q b;
    public final h2q a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o;
        if (sdk_INT >= 36) {
            o = new t1q();
        }
        else if (sdk_INT >= 35) {
            o = new s1q();
        }
        else if (sdk_INT >= 34) {
            o = new r1q();
        }
        else if (sdk_INT >= 31) {
            o = new q1q();
        }
        else if (sdk_INT >= 30) {
            o = new p1q();
        }
        else if (sdk_INT >= 29) {
            o = new o1q();
        }
        else {
            o = new m1q();
        }
        b = ((u1q)o).b().a.a().a.b().a.c();
    }
    
    public e2q(final h2q a) {
        this.a = a;
    }
    
    public void A(final int n) {
    }
    
    public void B(final Rect[][] array) {
    }
    
    public void C(final Rect[][] array) {
    }
    
    public h2q a() {
        return this.a;
    }
    
    public h2q b() {
        return this.a;
    }
    
    public h2q c() {
        return this.a;
    }
    
    public void d(final View view) {
    }
    
    public void e(final h2q h2q) {
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e2q)) {
            return false;
        }
        final e2q e2q = (e2q)o;
        return this.t() == e2q.t() && this.s() == e2q.s() && Objects.equals((Object)this.n(), (Object)e2q.n()) && Objects.equals((Object)this.l(), (Object)e2q.l()) && Objects.equals((Object)this.h(), (Object)e2q.h());
    }
    
    public List<Rect> f(final int n) {
        return (List<Rect>)Collections.EMPTY_LIST;
    }
    
    public List<Rect> g(final int n) {
        return (List<Rect>)Collections.EMPTY_LIST;
    }
    
    public yo8 h() {
        return null;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(new Object[] { this.t(), this.s(), this.n(), this.l(), this.h() });
    }
    
    public dec i(final int n) {
        return dec.e;
    }
    
    public dec j(final int n) {
        if ((n & 0x8) == 0x0) {
            return dec.e;
        }
        en9.s("Unable to query the maximum insets for IME");
        return null;
    }
    
    public dec k() {
        return this.n();
    }
    
    public dec l() {
        return dec.e;
    }
    
    public dec m() {
        return this.n();
    }
    
    public dec n() {
        return dec.e;
    }
    
    public dec o() {
        return this.n();
    }
    
    public void p(final View view) {
    }
    
    public void q() {
    }
    
    public h2q r(final int n, final int n2, final int n3, final int n4) {
        return e2q.b;
    }
    
    public boolean s() {
        return false;
    }
    
    public boolean t() {
        return false;
    }
    
    public boolean u(final int n) {
        return true;
    }
    
    public void v(final pp8 pp8) {
    }
    
    public void w(final dec[] array) {
    }
    
    public void x(final dec dec) {
    }
    
    public void y(final h2q h2q) {
    }
    
    public void z(final dec dec) {
    }
}
