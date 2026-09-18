import android.view.View;
import android.content.Context;

public final class wh6 extends n0
{
    public final ksg E;
    public boolean F;
    
    public wh6(final Context context) {
        super(context);
        this.E = o50.Q((Object)null);
    }
    
    @Override
    public final void a(final int n, final gva gva) {
        gva.i0(420213850);
        int n2;
        if (gva.h((Object)this)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final zta zta = (zta)this.E.getValue();
            if (zta == null) {
                gva.g0(-1238823553);
            }
            else {
                ge9.B(gva, 98585282, 0, zta, gva);
            }
            gva.q(false);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)this, n, (byte)5);
        }
    }
    
    public CharSequence getAccessibilityClassName() {
        return (CharSequence)wh6.class.getName();
    }
    
    @Override
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F;
    }
    
    public final void setContent(final zta value) {
        this.F = true;
        this.E.setValue((Object)value);
        if (!((View)this).isAttachedToWindow() && this.getComposeViewContext$ui() == null) {
            return;
        }
        this.d();
    }
}
