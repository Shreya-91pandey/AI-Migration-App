public final class pd8 implements bfa
{
    public final ygm a;
    
    public pd8(final ygm a) {
        this.a = a;
    }
    
    public final r6p a(final dlo dlo) {
        final ld8 ld8 = new ld8(dlo, (byte)2);
        final ygm a = this.a;
        final float a2 = a.a;
        final float b = a.b;
        final Object c = a.c;
        ig0 ig0;
        if (c == null) {
            ig0 = null;
        }
        else {
            ig0 = (ig0)((lta)ld8).b(c);
        }
        return (r6p)new gfk(a2, b, ig0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof pd8 && this.a.equals((Object)((pd8)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
