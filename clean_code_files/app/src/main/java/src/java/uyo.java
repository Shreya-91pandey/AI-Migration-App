public final class uyo
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    public uyo(final String a, final String b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof uyo) || !((uyo)o).a.equals(this.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
