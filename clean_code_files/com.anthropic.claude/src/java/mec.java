public final class mec
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public mec(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mec)) {
            return false;
        }
        final mec mec = (mec)o;
        return this.a == mec.a && this.b == mec.b && this.c == mec.c && this.d == mec.d;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        return rua.h(this.c, this.d, ", bottom=", ")", hia.o(this.a, this.b, "InsetsValues(left=", ", top=", ", right="));
    }
}
