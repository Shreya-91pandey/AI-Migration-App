import com.anthropic.claude.types.strings.CodeArtifactId;
import com.anthropic.claude.artifact.frame.ArtifactLink;
import java.util.regex.Pattern;

public abstract class x01
{
    public static final w6j a;
    public static final w6j b;
    public static final w6j c;
    
    static {
        final String quote = Pattern.quote(zx0.y.a());
        quote.getClass();
        a = new w6j(hia.k("^https://((?:[a-z0-9-]+\\.)?", quote, ")/(?:code/(?:artifact|frame)|artifact)/(?:[^/?#]*-)?([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}|[123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz]{22})(?:[/?#]|\\z)"));
        final String quote2 = Pattern.quote(zx0.z.a());
        quote2.getClass();
        b = new w6j(hia.k("^https://((?:preview\\.)?", quote2, ")/(?:code/(?:artifact|frame)|artifact)/(?:[^/?#]*-)?([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}|[123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz]{22})(?:[/?#]|\\z)"));
        c = new w6j(hia.k("^https://([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})\\.(", c86.N0((Iterable)zx0.B, (CharSequence)"|", (String)null, (String)null, (lta)new jn0((byte)21), 30), ")(?:[/?#]|\\z)"));
    }
    
    public static final zx0 a(final oi0 oi0) {
        final td9 b = zx0.B;
        b.getClass();
        final k1 k1 = new k1((Object)b, (byte)0);
        while (k1.hasNext()) {
            final Object next = k1.next();
            if (mlc.q((Object)((zx0)next).w, (Object)oi0)) {
                return (zx0)next;
            }
        }
        return null;
    }
    
    public static final ArtifactLink b(final String s) {
        final ArtifactLink c = c(s);
        if (c != null) {
            return c;
        }
        final c8e b = w6j.b(x01.c, (CharSequence)s);
        if (b != null) {
            final td9 b2 = zx0.B;
            b2.getClass();
            final k1 k1 = new k1((Object)b2, (byte)0);
            while (k1.hasNext()) {
                final zx0 zx0 = (zx0)k1.next();
                if (zx0.x.equals(((a8e)b.a()).get(2))) {
                    final l65 companion = CodeArtifactId.Companion;
                    final String s2 = (String)((a8e)b.a()).get(1);
                    companion.getClass();
                    final String b3 = l65.b(s2);
                    if (b3 == null) {
                        return null;
                    }
                    return new ArtifactLink(b3, zx0, "preview.".concat(zx0.a()));
                }
            }
            oyl.i("Collection contains no element matching the predicate.");
        }
        return null;
    }
    
    public static final ArtifactLink c(String s) {
        final c8e b = w6j.b(x01.a, (CharSequence)s);
        if (b != null) {
            final String s2 = (String)((a8e)b.a()).get(2);
            CodeArtifactId.Companion.getClass();
            if ((s = l65.b(s2)) == null) {
                s = l65.a(s2);
            }
            if (s != null) {
                return new ArtifactLink(s, zx0.y, (String)((a8e)b.a()).get(1));
            }
        }
        else {
            final c8e b2 = w6j.b(x01.b, (CharSequence)s);
            if (b2 != null) {
                final String s3 = (String)((a8e)b2.a()).get(2);
                CodeArtifactId.Companion.getClass();
                if ((s = l65.b(s3)) == null) {
                    s = l65.a(s3);
                }
                if (s != null) {
                    return new ArtifactLink(s, zx0.z, (String)((a8e)b2.a()).get(1));
                }
            }
        }
        return null;
    }
}
