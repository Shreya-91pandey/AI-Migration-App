public final class fva
{
    public final byte a;
    public final Object b;
    
    public final void a() {
        final byte a = this.a;
        final Object b = this.b;
        switch (a) {
            default: {
                final y8m y8m = (y8m)b;
                --y8m.k;
                return;
            }
            case 0: {
                final gva gva = (gva)b;
                --gva.A;
            }
        }
    }
    
    public final void b() {
        final byte a = this.a;
        final Object b = this.b;
        switch (a) {
            default: {
                final y8m y8m = (y8m)b;
                ++y8m.k;
                return;
            }
            case 0: {
                final gva gva = (gva)b;
                ++gva.A;
            }
        }
    }
}
