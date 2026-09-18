public interface a0d extends t98
{
    default int M0(final wxd wxd, final goe goe, final int n) {
        return new cvj((Object)this, (byte)28).H(new slc((flc)wxd, ((flc)wxd).getLayoutDirection()), new c58(goe, 1, 1, (byte)1), hv6.b(0, 0, 0, n, 7)).b();
    }
    
    noe b(final ooe p0, final goe p1, final long p2);
    
    default int g(final wxd wxd, final goe goe, final int n) {
        return new zzc((Object)this).t(new slc((flc)wxd, ((flc)wxd).getLayoutDirection()), new c58(goe, 2, 2, (byte)1), hv6.b(0, n, 0, 0, 13)).a();
    }
    
    default int h(final wxd wxd, final goe goe, final int n) {
        return new xa9((Object)this).C(new slc((flc)wxd, ((flc)wxd).getLayoutDirection()), new c58(goe, 1, 2, (byte)1), hv6.b(0, n, 0, 0, 13)).a();
    }
    
    default int k(final wxd wxd, final goe goe, final int n) {
        return this.b((ooe)new slc((flc)wxd, ((flc)wxd).getLayoutDirection()), (goe)new c58(goe, 2, 1, (byte)1), hv6.b(0, 0, 0, n, 7)).b();
    }
}
