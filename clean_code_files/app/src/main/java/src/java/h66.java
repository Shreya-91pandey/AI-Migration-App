import java.io.IOException;
import androidx.datastore.preferences.protobuf.d;

public abstract class h66
{
    public int a;
    public int b;
    public d c;
    
    public abstract void a(final int p0);
    
    public abstract int b();
    
    public abstract boolean c();
    
    public abstract void d(final int p0);
    
    public abstract int e(final int p0);
    
    public abstract boolean f();
    
    public abstract fs2 g();
    
    public abstract double h();
    
    public abstract int i();
    
    public abstract int j();
    
    public abstract long k();
    
    public abstract float l();
    
    public abstract int m();
    
    public abstract long n();
    
    public abstract int o();
    
    public abstract long p();
    
    public abstract int q();
    
    public abstract long r();
    
    public abstract String s();
    
    public abstract String t();
    
    public abstract int u();
    
    public abstract int v();
    
    public abstract long w();
    
    public abstract boolean x(final int p0);
    
    public final void y() {
        boolean x;
        do {
            final int u = this.u();
            if (u == 0) {
                break;
            }
            final int a = this.a;
            final int b = this.b;
            if (a + b >= 100) {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = b + 1;
            x = this.x(u);
            --this.b;
        } while (x);
    }
}
