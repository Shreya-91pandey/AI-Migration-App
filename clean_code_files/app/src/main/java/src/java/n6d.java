public final class n6d implements z0q
{
    public jta a;
    public ksg b;
    public final ksg c;
    
    public n6d() {
        this.c = o50.Q((Object)Boolean.FALSE);
    }
    
    public final long a() {
        ksg b;
        if ((b = this.b) == null) {
            final jta a = this.a;
            od8 c;
            if (a == null || (c = (od8)a.a()) == null) {
                c = od8.c;
            }
            b = o50.Q((Object)c);
            this.b = b;
            this.a = null;
        }
        return ((od8)b.getValue()).a;
    }
    
    public final boolean b() {
        return (boolean)this.c.getValue();
    }
}
