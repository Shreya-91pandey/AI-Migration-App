public interface o6p
{
    boolean a();
    
    long d(final ig0 p0, final ig0 p1, final ig0 p2);
    
    ig0 e(final long p0, final ig0 p1, final ig0 p2, final ig0 p3);
    
    ig0 i(final long p0, final ig0 p1, final ig0 p2, final ig0 p3);
    
    default ig0 k(final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return this.e(this.d(ig0, ig2, ig3), ig0, ig2, ig3);
    }
}
