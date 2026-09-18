import com.anthropic.claude.app.ClaudeAppOverlay;

public final class zvn
{
    public final ClaudeAppOverlay a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public zvn(final ClaudeAppOverlay a, final boolean b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zvn)) {
            return false;
        }
        final zvn zvn = (zvn)o;
        return mlc.q((Object)this.a, (Object)zvn.a) && this.b == zvn.b && this.c == zvn.c && this.d == zvn.d && this.e == zvn.e;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.e) + smk.l(smk.l(smk.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TimeLimitsTriggerInputs(activeOverlay=");
        sb.append((Object)this.a);
        sb.append(", inForeground=");
        sb.append(this.b);
        sb.append(", settingsLoaded=");
        p3g.i(sb, this.c, ", showQuietHours=", this.d, ", showBreakSuggestion=");
        return ge9.t(sb, this.e, ")");
    }
}
