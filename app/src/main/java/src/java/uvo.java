public final class uvo implements fc7
{
    public final uvo v;
    public final rv7 w;
    
    public uvo(final uvo v, final rv7 w) {
        this.v = v;
        this.w = w;
    }
    
    public final hc7 F0(final hc7 hc7) {
        return uuj.s0((hc7)this, hc7);
    }
    
    public final /* bridge */ fc7 M0(final gc7 gc7) {
        return r6k.s((fc7)this, gc7);
    }
    
    public final Object V(final zta zta, final Object o) {
        return zta.d(o, (Object)this);
    }
    
    public final void a(final ou7 ou7) {
        if (this.w != ou7) {
            final uvo v = this.v;
            if (v != null) {
                v.a(ou7);
            }
            return;
        }
        en9.q("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }
    
    public final /* bridge */ hc7 c0(final gc7 gc7) {
        return r6k.J((fc7)this, gc7);
    }
    
    public final gc7 getKey() {
        return (gc7)cib.D;
    }
}
