public final class bfo extends m6n implements zta
{
    public float w;
    public boolean x;
    public Object y;
    public final efo z;
    
    public bfo(final efo z, final f07 f07) {
        this.z = z;
        super(2, f07);
    }
    
    @Override
    public final f07 create(final Object y, final f07 f07) {
        final bfo bfo = new bfo(this.z, f07);
        bfo.y = y;
        return bfo;
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        return ((bfo)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    @Override
    public final Object invokeSuspend(final Object o) {
        final boolean x = this.x;
        float w;
        oc7 y;
        if (x) {
            if (!x) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w = this.w;
            final oc7 oc7 = (oc7)this.y;
            vt4.g0(o);
            y = oc7;
        }
        else {
            vt4.g0(o);
            y = (oc7)this.y;
            w = uoo.J(y.getCoroutineContext());
        }
        while (ien.y(y)) {
            final afo afo = new afo(this.z, w);
            this.y = y;
            this.w = w;
            this.x = true;
            final Object p = ien.v(this.getContext()).p0((f07)this, (lta)afo);
            final pc7 v = pc7.v;
            if (p == v) {
                return v;
            }
        }
        return lqo.a;
    }
}
