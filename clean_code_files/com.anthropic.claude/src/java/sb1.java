public final class sb1
{
    public final f70 a;
    
    public sb1(final f70 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof sb1) {
                if (mlc.q((Object)this.a, (Object)((sb1)o).a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Key(font=");
        sb.append((Object)this.a);
        sb.append(", loaderKey=null)");
        return sb.toString();
    }
}
