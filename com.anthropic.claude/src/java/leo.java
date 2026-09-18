public final class leo
{
    public final og0 a;
    public final o6g b;
    
    public leo(final og0 a, final o6g b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof leo) {
                final leo leo = (leo)o;
                if (mlc.q((Object)this.a, (Object)leo.a)) {
                    if (this.b.equals(leo.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TransformedText(text=");
        sb.append((Object)this.a);
        sb.append(", offsetMapping=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
