import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.health.HealthMetricReport;
import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import com.anthropic.claude.types.strings.SessionId;
import java.util.Locale;
import java.util.List;
import java.util.Map;
import com.anthropic.claude.analytics.health.HealthMetricAction;

public final class shb
{
    public final uhb a;
    public final q4g b;
    
    public shb(final uhb a, final q4g b) {
        this.a = a;
        this.b = b;
    }
    
    public static void a(shb a, final HealthMetricAction healthMetricAction, dkj dkj, String a2, final String s, final Long n, phb phb, final lhb lhb, final int n2) {
        String s2;
        if ((n2 & 0x4) != 0x0) {
            s2 = null;
        }
        else {
            s2 = a2;
        }
        String s3;
        if ((n2 & 0x8) != 0x0) {
            s3 = null;
        }
        else {
            s3 = s;
        }
        Long n3;
        if ((n2 & 0x10) != 0x0) {
            n3 = null;
        }
        else {
            n3 = n;
        }
        if ((n2 & 0x20) != 0x0) {
            phb = null;
        }
        lhb lhb2;
        if ((n2 & 0x40) != 0x0) {
            lhb2 = null;
        }
        else {
            lhb2 = lhb;
        }
        a.getClass();
        if (healthMetricAction == HealthMetricAction.x) {
            final List a3 = adn.a;
            adn.f((Throwable)new IllegalArgumentException("reportHealthMetric called with UNSPECIFIED action"), (String)null, (lpl)null, (Map)null, (List)null, 62);
            return;
        }
        final boolean b = dkj instanceof zjj;
        final ckj a4 = ckj.a;
        final bkj a5 = bkj.a;
        final xjj a6 = xjj.a;
        final akj a7 = akj.a;
        String s4;
        if (b) {
            s4 = ((zjj)dkj).b;
        }
        else if (dkj instanceof yjj) {
            s4 = ((yjj)dkj).a;
        }
        else {
            if (!dkj.equals(a4) && !dkj.equals(a7) && !dkj.equals(a6) && !dkj.equals(a5)) {
                en9.r();
                return;
            }
            s4 = null;
        }
        zjj zjj;
        if (b) {
            zjj = (zjj)dkj;
        }
        else {
            zjj = null;
        }
        String a9;
        if (zjj != null) {
            final uv0 a8 = vhb.a;
            a9 = vhb.a(zjj.b, (jta)new v36((Object)a.b, (byte)22), zjj.a);
        }
        else {
            a9 = null;
        }
        final tqd l = uqd.l;
        String lowerCase = null;
        Label_0379: {
            if (lhb2 != null) {
                if (lhb2 instanceof ihb) {
                    String a10 = ((ihb)lhb2).a;
                    if (!nhb.a.g((CharSequence)a10)) {
                        a10 = null;
                    }
                    if (a10 != null) {
                        lowerCase = a10.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        break Label_0379;
                    }
                }
                else if (!(lhb2 instanceof khb)) {
                    en9.r();
                    return;
                }
            }
            while (true) {
                lowerCase = null;
                break Label_0379;
                continue;
            }
        }
        String a11 = null;
        Label_0452: {
            if (lhb2 != null) {
                if (lhb2 instanceof khb) {
                    final SessionId sessionId = (SessionId)((khb)lhb2).a.a();
                    if (sessionId != null) {
                        a2 = sessionId.a;
                    }
                    else {
                        a2 = null;
                    }
                    if (a2 != null) {
                        a11 = n8l.a(a2);
                        break Label_0452;
                    }
                }
                else if (!(lhb2 instanceof ihb)) {
                    en9.r();
                    return;
                }
            }
            while (true) {
                a11 = null;
                break Label_0452;
                continue;
            }
        }
        HealthMetricOutcome healthMetricOutcome;
        if (dkj.equals(a4)) {
            healthMetricOutcome = HealthMetricOutcome.w;
        }
        else if (b) {
            healthMetricOutcome = HealthMetricOutcome.x;
        }
        else if (dkj.equals(a7)) {
            healthMetricOutcome = HealthMetricOutcome.y;
        }
        else {
            if (!dkj.equals(a6) && !(dkj instanceof yjj) && !dkj.equals(a5)) {
                en9.r();
                return;
            }
            healthMetricOutcome = HealthMetricOutcome.z;
        }
        Long n4;
        if (n3 == null || dkj.equals(a5)) {
            n4 = null;
        }
        else {
            if (!dkj.equals(a4) && !dkj.equals(a7) && !dkj.equals(a6) && !(dkj instanceof yjj) && !b) {
                en9.r();
                return;
            }
            n4 = n3;
        }
        dkj = (dkj)new HealthMetricReport(healthMetricOutcome, s2, a9, s4, s3, n4, healthMetricAction, a11, lowerCase);
        a = (shb)a.a;
        try {
            ((uhb)a).b.b(healthMetricAction.v, (Map)yi2.e0(jrc.i(x90.N(((uhb)a).a, (Object)dkj, (KSerializer)HealthMetricReport.Companion.serializer()))));
        }
        catch (final Exception ex) {
            uhb.a(ex, "rum");
        }
        try {
            final hhb c = ((uhb)a).c;
            rhc.G((oc7)c.c, (hc7)vo8.a, 0, (zta)new ghb((HealthMetricReport)dkj, c, (ch0)c.b.b((Object)phb), null), 2);
        }
        catch (final Exception ex2) {
            uhb.a(ex2, "event-logging");
        }
    }
    
    public static thb b(final shb shb, final HealthMetricAction healthMetricAction, final oc7 oc7, String s, String s2, lhb lhb, hwn c, gwn gwn, final int n) {
        if ((n & 0x4) != 0x0) {
            s = null;
        }
        if ((n & 0x8) != 0x0) {
            s2 = null;
        }
        if ((n & 0x10) != 0x0) {
            lhb = null;
        }
        if ((n & 0x20) != 0x0) {
            c = (hwn)y7j.C;
        }
        if ((n & 0x40) != 0x0) {
            gwn = null;
        }
        shb.getClass();
        return new thb(lq6.X((Object)healthMetricAction), shb, s2, lhb, oc7, s, c, (fc6)gwn);
    }
}
