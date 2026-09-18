public final class qz1 extends vv1
{
    public final byte b;
    
    @Override
    public final boolean b(final v5q v5q) {
        switch (this.b) {
            default: {
                return v5q.j.f;
            }
            case 1: {
                return v5q.j.e;
            }
            case 0: {
                return v5q.j.c;
            }
        }
    }
    
    @Override
    public final int c() {
        switch (this.b) {
            default: {
                return 9;
            }
            case 1: {
                return 5;
            }
            case 0: {
                return 6;
            }
        }
    }
    
    @Override
    public final boolean d(final Object o) {
        boolean b = false;
        switch (this.b) {
            default: {
                b = (boolean)o;
                break;
            }
            case 1: {
                b = (boolean)o;
                break;
            }
            case 0: {
                b = (boolean)o;
                break;
            }
        }
        return b ^ true;
    }
}
