import java.util.concurrent.atomic.AtomicInteger;

public abstract class kpm implements jpm
{
    public final cc1 v;
    
    public kpm() {
        this.v = (cc1)new AtomicInteger(0);
    }
    
    public final boolean e(final int n) {
        return (this.v.get() & n) != 0x0;
    }
    
    public final void g(final int n) {
        cc1 v;
        int value;
        do {
            v = this.v;
            value = v.get();
            if ((value & n) != 0x0) {
                break;
            }
        } while (!v.compareAndSet(value, value | n));
    }
}
