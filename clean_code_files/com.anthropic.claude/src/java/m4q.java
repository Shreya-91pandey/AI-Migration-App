public final class m4q extends m6n implements bua
{
    public boolean w;
    public jja x;
    public Object[] y;
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final jja x = (jja)o;
        final Object[] y = (Object[])o2;
        final m6n m6n = new m6n(3, (f07)o3);
        ((m4q)m6n).x = x;
        ((m4q)m6n).y = y;
        return ((m4q)m6n).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final boolean w = this.w;
        final kv6 kv6 = null;
        if (w) {
            if (!w) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(o);
        }
        else {
            vt4.g0(o);
            final jja x = this.x;
            final mv6[] array = (mv6[])this.y;
            final int length = array.length;
            int n = 0;
            kv6 a;
            mv6 mv6;
            while (true) {
                a = kv6.a;
                mv6 = kv6;
                if (n >= length) {
                    break;
                }
                mv6 = array[n];
                if (!mlc.q((Object)mv6, (Object)a)) {
                    break;
                }
                ++n;
            }
            if (mv6 == null) {
                mv6 = a;
            }
            this.w = true;
            final Object l = x.l((Object)mv6, (f07)this);
            final pc7 v = pc7.v;
            if (l == v) {
                return v;
            }
        }
        return lqo.a;
    }
}
