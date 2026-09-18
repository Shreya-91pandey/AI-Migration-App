public final class kzl extends r9n
{
    public final tei h;
    public final ksg i;
    
    public kzl(final tei h) {
        this.h = h;
        this.i = o50.Q((Object)null);
    }
    
    public final void Y(final tei tei, final Object value) {
        if (tei != this.h) {
            gac.c("Check failed.");
        }
        this.i.setValue(value);
    }
    
    public final boolean o(final tei tei) {
        return tei == this.h;
    }
    
    public final Object z(final tei tei) {
        if (tei != this.h) {
            gac.c("Check failed.");
        }
        Object value;
        if ((value = this.i.getValue()) == null) {
            value = null;
        }
        return value;
    }
}
