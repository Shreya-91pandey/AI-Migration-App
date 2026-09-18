public final class u76
{
    public final int a;
    public final int b;
    
    public u76(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u76)) {
            return false;
        }
        final u76 u76 = (u76)o;
        return this.a == u76.a && this.b == u76.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return hia.g(this.a, this.b, "CollectionInfo(rowCount=", ", columnCount=", ")");
    }
}
