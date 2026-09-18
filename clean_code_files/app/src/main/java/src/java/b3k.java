public interface b3k extends AutoCloseable
{
    void U(final int p0, final String p1);
    
    default boolean W() {
        return this.getLong(0) != 0L;
    }
    
    boolean Z0();
    
    byte[] getBlob(final int p0);
    
    int getColumnCount();
    
    String getColumnName(final int p0);
    
    long getLong(final int p0);
    
    boolean isNull(final int p0);
    
    void k(final int p0, final long p1);
    
    void l(final byte[] p0, final int p1);
    
    void m(final int p0);
    
    void o();
    
    void reset();
    
    String t0(final int p0);
}
