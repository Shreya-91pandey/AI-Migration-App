public final class lge
{
    public final String a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof lge) {
            if (this.a.equals(((lge)o).a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return oz1.n("McpClientRosterToken(", this.a.length(), " chars)");
    }
}
