import java.lang.reflect.Type;

public final class rj0 implements c03
{
    public final c03 v;
    public final Type w;
    public final fu4 x;
    public final zta y;
    
    public rj0(final c03 v, final Type w, final fu4 x, final zta y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public final boolean Q() {
        return this.v.Q();
    }
    
    @Override
    public final sej Y() {
        final sej y = this.v.Y();
        y.getClass();
        return y;
    }
    
    public final rj0 a() {
        final c03 clone = this.v.clone();
        clone.getClass();
        return new rj0(clone, this.w, this.x, this.y);
    }
    
    @Override
    public final void cancel() {
        this.v.cancel();
    }
    
    @Override
    public final void t(final m03 m03) {
        this.v.t((m03)new jmq((Object)this, (Object)m03, (byte)6));
    }
}
