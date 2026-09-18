public class byf
{
    public final inf a;
    public final emf b;
    
    public byf() {
        this.a = new inf(0, new oxf[16]);
        this.b = new emf(10);
    }
    
    public boolean a(final rwd rwd, final nzc nzc, final ms9 ms9, final boolean b) {
        final inf a = this.a;
        final Object[] v = a.v;
        final int x = a.x;
        int i = 0;
        boolean b2 = false;
        while (i < x) {
            b2 = (((oxf)v[i]).a(rwd, nzc, ms9, b) || b2);
            ++i;
        }
        return b2;
    }
    
    public void b(final ms9 ms9) {
        final inf a = this.a;
        for (int n = a.x - 1; -1 < n; --n) {
            if (((oxf)a.v[n]).d.h()) {
                a.l(n);
            }
        }
    }
}
