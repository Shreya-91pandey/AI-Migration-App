import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.types.OriginRelativePath;
import android.content.Context;
import java.util.Set;

public final class lp
{
    public static final Set k;
    public final fz6 a;
    public final Context b;
    public final oi0 c;
    public final s3p d;
    public final gba e;
    public final br f;
    public final wq g;
    public final daa h;
    public final ksg i;
    public wmm j;
    
    static {
        k = iw0.n1((Object[])new String[] { "txt", "log", "md", "yaml", "yml", "xml", "csv", "ini", "cfg", "toml" });
    }
    
    public lp(final fz6 a, final Context b, final oi0 c, final s3p d, final gba e, final h7g h7g, final br f, final wq g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final o68 a2 = vo8.a;
        final d58 w = d58.w;
        this.h = new daa((b03)h7g);
        this.i = o50.Q((Object)null);
    }
    
    public final void a(final gp gp) {
        final String d = gp.d();
        if (d == null) {
            return;
        }
        final String h = ekq.H(this.d.d, d);
        OriginRelativePath.b(h);
        rhc.G((oc7)this.a, (hc7)null, 0, (zta)new b0((Object)this, (Object)new wr8(new fs8(h, gp.c(), 0), MessageFileEvents$DownloadSource.I), (Object)gp, (f07)null, (byte)1), 3);
    }
}
