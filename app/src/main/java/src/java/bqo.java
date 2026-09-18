public final class bqo
{
    public vhk a;
    public vhk b;
    public int c;
    public Long d;
    public boolean e;
    
    public final void a(final mln x) {
        this.e = false;
        final vhk a = this.a;
        mln mln;
        if (a != null) {
            mln = (mln)a.x;
        }
        else {
            mln = null;
        }
        if (!mlc.q((Object)x, (Object)mln)) {
            final String w = x.a.w;
            final vhk a2 = this.a;
            String w2 = null;
            Label_0095: {
                if (a2 != null) {
                    final mln mln2 = (mln)a2.x;
                    if (mln2 != null) {
                        w2 = mln2.a.w;
                        break Label_0095;
                    }
                }
                w2 = null;
            }
            final boolean q = mlc.q((Object)w, (Object)w2);
            final vhk a3 = this.a;
            if (q) {
                if (a3 != null) {
                    a3.x = x;
                }
            }
            else {
                this.a = new vhk(a3, x, (byte)19);
                this.b = null;
                if ((this.c += x.a.w.length()) > 100000) {
                    vhk a4 = this.a;
                    vhk vhk;
                    if (a4 != null) {
                        vhk = (vhk)a4.w;
                    }
                    else {
                        vhk = null;
                    }
                    if (vhk != null) {
                        while (true) {
                            vhk vhk3 = null;
                            Label_0241: {
                                if (a4 != null) {
                                    final vhk vhk2 = (vhk)a4.w;
                                    if (vhk2 != null) {
                                        vhk3 = (vhk)vhk2.w;
                                        break Label_0241;
                                    }
                                }
                                vhk3 = null;
                            }
                            if (vhk3 == null) {
                                break;
                            }
                            a4 = (vhk)a4.w;
                        }
                        if (a4 != null) {
                            a4.w = null;
                        }
                    }
                }
            }
        }
    }
}
