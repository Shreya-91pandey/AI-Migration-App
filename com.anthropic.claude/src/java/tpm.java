public final class tpm implements b3k
{
    public final b3k v;
    public final jgh w;
    
    public tpm(final b3k v, final jgh w) {
        this.v = v;
        this.w = w;
        Thread.currentThread().getId();
    }
    
    @Override
    public final void U(final int n, final String s) {
        if (!(boolean)this.w.get()) {
            this.v.U(n, s);
            return;
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final boolean Z0() {
        if (!(boolean)this.w.get()) {
            return this.v.Z0();
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    public final void close() {
        if (!(boolean)this.w.get()) {
            ((AutoCloseable)this.v).close();
            return;
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final byte[] getBlob(final int n) {
        if (!(boolean)this.w.get()) {
            return this.v.getBlob(n);
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final int getColumnCount() {
        if (!(boolean)this.w.get()) {
            return this.v.getColumnCount();
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final String getColumnName(final int n) {
        if (!(boolean)this.w.get()) {
            return this.v.getColumnName(n);
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final long getLong(final int n) {
        if (!(boolean)this.w.get()) {
            return this.v.getLong(n);
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final boolean isNull(final int n) {
        if (!(boolean)this.w.get()) {
            return this.v.isNull(n);
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final void k(final int n, final long n2) {
        if (!(boolean)this.w.get()) {
            this.v.k(n, n2);
            return;
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final void l(final byte[] array, final int n) {
        if (!(boolean)this.w.get()) {
            this.v.l(array, n);
            return;
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final void m(final int n) {
        if (!(boolean)this.w.get()) {
            this.v.m(n);
            return;
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final void o() {
        if (!(boolean)this.w.get()) {
            this.v.o();
            return;
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final void reset() {
        if (!(boolean)this.w.get()) {
            this.v.reset();
            return;
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
    
    @Override
    public final String t0(final int n) {
        if (!(boolean)this.w.get()) {
            return this.v.t0(n);
        }
        tiq.l(21, "Statement is recycled");
        throw null;
    }
}
