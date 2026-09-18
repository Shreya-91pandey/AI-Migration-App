public final class jgo extends hgo
{
    public final byte y;
    
    public final Object next() {
        switch (this.y) {
            default: {
                final int x = super.x;
                super.x = x + 2;
                return super.v[x + 1];
            }
            case 0: {
                final int x2 = super.x;
                super.x = x2 + 2;
                final Object[] v = super.v;
                return new i3e(v[x2], v[x2 + 1]);
            }
        }
    }
}
