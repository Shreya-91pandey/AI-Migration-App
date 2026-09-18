public abstract class fec extends hgf implements wfo
{
    public d1q J;
    public d1q K;
    
    public fec() {
        final sga y = ao2.y;
        this.J = y;
        this.K = y;
    }
    
    public void g1() {
        o50.Z((t98)this, (Object)"androidx.compose.foundation.layout.ConsumedInsetsProvider", (lta)new eec(this, (byte)1));
        this.p1();
    }
    
    public void h1() {
        this.K = this.J;
        o50.b0((hgf)this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", (lta)new eec(this, (byte)0));
    }
    
    public final void i1() {
        this.J = ao2.y;
    }
    
    public d1q o1(final d1q d1q) {
        return d1q;
    }
    
    public void p1() {
        this.K = this.o1(this.J);
        o50.b0((hgf)this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", (lta)new eec(this, (byte)0));
    }
    
    public final Object u() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
