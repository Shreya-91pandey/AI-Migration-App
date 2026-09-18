import java.util.Set;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolved;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineErrorKind;
import com.anthropic.claude.analytics.events.OfflineEvents$CacheAgeBucket;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolvedOutcome;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineScreen;
import java.util.LinkedHashSet;

public final class lek
{
    public final st4 a;
    public final LinkedHashSet b;
    
    public lek(final st4 a, final f60 f60) {
        this.a = a;
        this.b = new LinkedHashSet();
    }
    
    public final void a(final OfflineEvents$OfflineScreen offlineEvents$OfflineScreen, final boolean b, final boolean b2, final int n, final Long n2, final long n3, final boolean b3) {
        final boolean add = ((Set)this.b).add((Object)offlineEvents$OfflineScreen);
        Long value;
        if (n2 != null) {
            long n4;
            if ((n4 = System.currentTimeMillis() - ((Number)n2).longValue()) < 0L) {
                n4 = 0L;
            }
            value = n4;
        }
        else {
            value = null;
        }
        long longValue = 0L;
        OfflineEvents$ScreenResolvedOutcome offlineEvents$ScreenResolvedOutcome;
        if (!b && b2) {
            offlineEvents$ScreenResolvedOutcome = OfflineEvents$ScreenResolvedOutcome.w;
        }
        else if (b && b2) {
            offlineEvents$ScreenResolvedOutcome = OfflineEvents$ScreenResolvedOutcome.x;
        }
        else if (b) {
            offlineEvents$ScreenResolvedOutcome = OfflineEvents$ScreenResolvedOutcome.y;
        }
        else {
            offlineEvents$ScreenResolvedOutcome = OfflineEvents$ScreenResolvedOutcome.z;
        }
        long longValue2;
        if (n2 != null) {
            longValue2 = n2;
        }
        else {
            longValue2 = 0L;
        }
        if (value != null) {
            longValue = value;
        }
        OfflineEvents$CacheAgeBucket offlineEvents$CacheAgeBucket;
        if (value == null || (offlineEvents$CacheAgeBucket = lkq.b((long)value)) == null) {
            offlineEvents$CacheAgeBucket = OfflineEvents$CacheAgeBucket.w;
        }
        final boolean b4 = !b2 && b3;
        OfflineEvents$OfflineErrorKind offlineEvents$OfflineErrorKind;
        if (b2) {
            offlineEvents$OfflineErrorKind = OfflineEvents$OfflineErrorKind.w;
        }
        else if (b3) {
            offlineEvents$OfflineErrorKind = OfflineEvents$OfflineErrorKind.x;
        }
        else {
            offlineEvents$OfflineErrorKind = OfflineEvents$OfflineErrorKind.y;
        }
        final OfflineEvents$ScreenResolved offlineEvents$ScreenResolved = new OfflineEvents$ScreenResolved(offlineEvents$OfflineScreen, offlineEvents$ScreenResolvedOutcome, add, n, longValue2, longValue, offlineEvents$CacheAgeBucket, b4, offlineEvents$OfflineErrorKind, n3);
        final KSerializer serializer = OfflineEvents$ScreenResolved.Companion.serializer();
        vt4.b0(serializer);
        this.a.b((v10)offlineEvents$ScreenResolved, serializer);
    }
}
