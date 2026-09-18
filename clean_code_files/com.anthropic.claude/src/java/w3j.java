public final class w3j implements gc7
{
    public final aof v;
    
    public w3j(final aof v) {
        this.v = v;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof w3j && mlc.q((Object)this.v, (Object)((w3j)o).v));
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ReentrantMutexContextKey(mutex=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
}
