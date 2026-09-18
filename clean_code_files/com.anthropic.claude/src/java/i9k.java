import android.os.Bundle;
import java.util.LinkedHashMap;

public final class i9k
{
    public final j9k a;
    public final lce b;
    public final vzq c;
    public final LinkedHashMap d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;
    
    public i9k(final j9k a, final lce b) {
        this.a = a;
        this.b = b;
        this.c = new vzq((byte)25);
        this.d = new LinkedHashMap();
        this.h = true;
    }
    
    public final void a() {
        final j9k a = this.a;
        if (((gbd)a).d().b() != tad.w) {
            en9.q("Restarter must be created only during owner's initialization stage");
            return;
        }
        if (!this.e) {
            this.b.a();
            ((gbd)a).d().a((fbd)new yd6((Object)this, (byte)2));
            this.e = true;
            return;
        }
        en9.q("SavedStateRegistry was already attached.");
    }
}
