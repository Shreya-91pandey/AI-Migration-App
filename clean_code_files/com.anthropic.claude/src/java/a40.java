import android.graphics.Typeface$Builder;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

public final class a40 extends f70
{
    public final zoa c;
    public final int d;
    public boolean e;
    public Typeface f;
    public final AssetManager g;
    public final String h;
    
    public a40(final AssetManager g, final String h, final zoa c, final int d, final xoa xoa) {
        super((e70)y7j.x, xoa);
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        this.f = this.c(null);
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final zoa b() {
        return this.c;
    }
    
    public final Typeface c(final Context context) {
        if (context == null) {
            return null;
        }
        return new Typeface$Builder(this.g, this.h).setFontVariationSettings(glq.o(super.b, (xc8)r9n.b(context), glq.g(context))).build();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof a40) {
                final a40 a40 = (a40)o;
                if (mlc.q((Object)this.h, (Object)a40.h)) {
                    if (super.b.equals(a40.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return super.b.a.hashCode() + this.h.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final int d = this.d;
        String s;
        if (d == 0) {
            s = "Normal";
        }
        else if (d == 1) {
            s = "Italic";
        }
        else {
            s = "Invalid";
        }
        final StringBuilder sb = new StringBuilder("Font(assetManager, path=");
        sb.append(this.h);
        sb.append(", weight=");
        sb.append((Object)this.c);
        sb.append(", style=");
        return oz1.p(sb, s, ")");
    }
}
