public final class jea implements tdc
{
    public final tdc a;
    public final tdc b;
    
    public jea(final tdc a, final tdc b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (jea.class != o.getClass()) {
            return false;
        }
        final jea jea = (jea)o;
        return mlc.q((Object)this.a, (Object)jea.a) && mlc.q((Object)this.b, (Object)jea.b) && mlc.q((Object)this.l(), (Object)jea.l());
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final mvc l = this.l();
        int hashCode3;
        if (l != null) {
            hashCode3 = l.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode2 + hashCode * 31) * 32 + hashCode3;
    }
    
    @Override
    public final void j(final itk itk) {
        this.a.j(itk);
        this.b.j(itk);
    }
    
    @Override
    public final void k(final ghn ghn) {
        this.a.k(ghn);
        this.b.k(ghn);
    }
    
    @Override
    public final mvc l() {
        final mvc l = this.b.l();
        final tdc a = this.a;
        if (l != null) {
            return l.b(a.l());
        }
        return a.l();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.a);
        sb.append(".then(");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
