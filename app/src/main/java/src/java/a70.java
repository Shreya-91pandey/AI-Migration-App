public final class a70 implements vcp
{
    public final byte a;
    
    @Override
    public final tcp a(final Class clazz) {
        switch (this.a) {
            default: {
                return (tcp)new i0e();
            }
            case 1: {
                return new xra(true);
            }
            case 0: {
                return (tcp)new gfc();
            }
        }
    }
}
