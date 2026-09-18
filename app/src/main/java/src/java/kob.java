import java.io.Serializable;

public final class kob
{
    public int a;
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    
    public kob() {
        this.b = new wlb[32];
        this.c = new float[32];
        this.d = new byte[32];
        final umf a = kak.a;
        this.e = new umf();
        this.f = new umf();
    }
    
    public void a(final wlb wlb) {
        final int b1 = iw0.b1((Object[])this.b, (Object)wlb);
        if (b1 >= 0) {
            final wlb[] array = (wlb[])this.b;
            final int n = b1 + 1;
            iw0.K0(b1, n, this.a, (Object[])array, (Object[])array);
            final wlb[] array2 = (wlb[])this.b;
            final int a = this.a;
            array2[a - 1] = null;
            final float[] array3 = (float[])this.c;
            System.arraycopy((Object)array3, n, (Object)array3, b1, a - n);
            final byte[] array4 = (Object)this.d;
            iw0.I0(b1, n, this.a, array4, array4);
            --this.a;
        }
    }
}
