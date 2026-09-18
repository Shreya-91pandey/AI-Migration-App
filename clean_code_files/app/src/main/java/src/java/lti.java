import android.content.Context;

public final class lti
{
    public final Context a;
    public final f3c b;
    public final d2d c;
    public final d2d d;
    public final d2d e;
    public final en9 f;
    public final se6 g;
    
    public lti(final Context a, final f3c b, final d2d c, final d2d d, final d2d e, final en9 f, final se6 g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof lti) {
            final lti lti = (lti)o;
            if (mlc.q((Object)this.a, (Object)lti.a)) {
                if (this.b.equals(lti.b)) {
                    if (this.c.equals(lti.c)) {
                        if (this.d.equals(lti.d)) {
                            if (this.e.equals(lti.e)) {
                                if (this.f.equals(lti.f)) {
                                    return this.g == lti.g;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31) * 31) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Options(application=");
        sb.append((Object)this.a);
        sb.append(", defaults=");
        sb.append((Object)this.b);
        sb.append(", mainCoroutineContextLazy=");
        sb.append((Object)this.c);
        sb.append(", memoryCacheLazy=");
        sb.append((Object)this.d);
        sb.append(", diskCacheLazy=");
        sb.append((Object)this.e);
        sb.append(", eventListenerFactory=");
        sb.append((Object)this.f);
        sb.append(", componentRegistry=");
        sb.append((Object)this.g);
        sb.append(", logger=null)");
        return sb.toString();
    }
}
