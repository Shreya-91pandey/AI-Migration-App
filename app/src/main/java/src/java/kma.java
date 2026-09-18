import androidx.compose.ui.platform.AndroidComposeView;

public final class kma
{
    public final pma a;
    public final AndroidComposeView b;
    public final umf c;
    public final umf d;
    public boolean e;
    
    public kma(final pma a, final AndroidComposeView b) {
        this.a = a;
        this.b = b;
        final umf a2 = kak.a;
        this.c = new umf();
        this.d = new umf();
    }
    
    public final void a() {
        if (!this.e) {
            final kr kr = new kr(0, (Object)this, (Class)kma.class, "invalidateNodes", "invalidateNodes()V", 0, (byte)18);
            final emf l0 = this.b.L0;
            if (l0.h((Object)kr) < 0) {
                l0.b((Object)kr);
            }
            this.e = true;
        }
    }
}
