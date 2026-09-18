public final class nc9 extends qxc implements lta
{
    public final byte w;
    public final lta x;
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final lta x = this.x;
        switch (w) {
            default: {
                return new ugc((long)((Number)x.b((int)(((chc)o).a & 0xFFFFFFFFL))).intValue() & 0xFFFFFFFFL);
            }
            case 2: {
                return new ugc((long)((Number)x.b((int)(((chc)o).a & 0xFFFFFFFFL))).intValue() & 0xFFFFFFFFL);
            }
            case 1: {
                final long a = ((chc)o).a;
                return new chc(((long)((Number)x.b((int)(a & 0xFFFFFFFFL))).intValue() & 0xFFFFFFFFL) | (long)(int)(a >> 32) << 32);
            }
            case 0: {
                final long a2 = ((chc)o).a;
                return new chc(((long)((Number)x.b((int)(a2 & 0xFFFFFFFFL))).intValue() & 0xFFFFFFFFL) | (long)(int)(a2 >> 32) << 32);
            }
        }
    }
}
