public final class udd extends vdd
{
    public final String a;
    public final vmn b;
    public final eed c;
    
    public udd(final String a, final vmn b, final eed c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final eed a() {
        return this.c;
    }
    
    public final vmn b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof udd)) {
            return false;
        }
        final udd udd = (udd)o;
        return mlc.q((Object)this.a, (Object)udd.a) && mlc.q((Object)this.b, (Object)udd.b) && mlc.q((Object)this.c, (Object)udd.c);
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final vmn b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final eed c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    public final String toString() {
        return hia.k("LinkAnnotation.Url(url=", this.a, ")");
    }
}
