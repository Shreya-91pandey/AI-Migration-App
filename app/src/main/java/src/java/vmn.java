public final class vmn
{
    public final hcm a;
    public final hcm b;
    public final hcm c;
    public final hcm d;
    
    public vmn(final hcm a, final hcm b, final hcm c, final hcm d) {
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
        if (o != null && o instanceof vmn) {
            final vmn vmn = (vmn)o;
            return mlc.q((Object)this.a, (Object)vmn.a) && mlc.q((Object)this.b, (Object)vmn.b) && mlc.q((Object)this.c, (Object)vmn.c) && mlc.q((Object)this.d, (Object)vmn.d);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final hcm a = this.a;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final hcm b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final hcm c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final hcm d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
}
