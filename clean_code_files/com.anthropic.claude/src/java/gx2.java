import com.anthropic.claude.types.strings.OrganizationId;

public final class gx2 implements lta
{
    public final byte v;
    public final lta w;
    
    public final Object b(Object c) {
        switch (this.v) {
            default: {
                return this.w.b((Object)(((Number)c).longValue() / 1000000L));
            }
            case 1: {
                final e8m e8m = (e8m)c;
                c = g8m.c;
                synchronized (c) {
                    final long e = g8m.e;
                    g8m.e = 1L + e;
                    monitorexit(c);
                    return new tsi(e, e8m, this.w);
                }
            }
            case 0: {
                final OrganizationId organizationId = (OrganizationId)c;
                final String a = organizationId.a;
                return this.w.b((Object)organizationId);
            }
        }
    }
}
