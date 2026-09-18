public final class irh implements bnf, oc7
{
    public final bnf v;
    public final hc7 w;
    
    public irh(final bnf v, final hc7 w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final hc7 getCoroutineContext() {
        return this.w;
    }
    
    public final Object getValue() {
        return ((xom)this.v).getValue();
    }
    
    @Override
    public final void setValue(final Object value) {
        this.v.setValue(value);
    }
}
