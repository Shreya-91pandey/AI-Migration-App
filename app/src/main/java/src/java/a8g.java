public final class a8g extends ncq
{
    public final z7g e;
    public final gbd f;
    
    public a8g(final gbd f, final z7g e) {
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a8g)) {
            return false;
        }
        final a8g a8g = (a8g)o;
        return mlc.q(this.e, a8g.e) && mlc.q(this.f, a8g.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.e.hashCode();
        final gbd f = this.f;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("OnBackPressedCallbackInfo(callback=");
        sb.append((Object)this.e);
        sb.append(", owner=");
        sb.append((Object)this.f);
        sb.append(')');
        return sb.toString();
    }
}
