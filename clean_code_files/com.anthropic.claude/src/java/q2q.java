import java.util.List;

public final class q2q
{
    public final List a;
    
    public q2q(final List a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && q2q.class.equals(o.getClass()) && this.a.equals(((q2q)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return c86.N0((Iterable)this.a, (CharSequence)", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", (lta)null, 56);
    }
}
