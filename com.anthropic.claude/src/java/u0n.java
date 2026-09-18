import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class u0n extends v98 implements teh, zla, zma
{
    public jta L;
    public boolean M;
    public final t6n N;
    
    public u0n(final jta l) {
        this.L = l;
        final t6n a = p6n.a((PointerInputEventHandler)new v60((Object)this, (byte)1));
        this.o1((t98)a);
        this.N = a;
    }
    
    public final void G(final jeh jeh, final keh keh, final long n) {
        this.N.G(jeh, keh, n);
    }
    
    public final void S(final bna bna) {
        this.M = bna.b();
    }
    
    public final void V() {
        this.N.V();
    }
    
    public final long w() {
        return uoo.c.a(soh.L((t98)this).U);
    }
}
