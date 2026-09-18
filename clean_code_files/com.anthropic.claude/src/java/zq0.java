import java.util.Collection;
import com.anthropic.claude.api.account.CurrentUserAccess;
import com.anthropic.claude.api.account.GrowthBookSchema;
import java.util.Iterator;
import java.util.List;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ModelSelectorConfig;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.api.notification.Preferences;
import com.anthropic.claude.api.account.Membership;
import java.util.ArrayList;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountSettings;
import java.util.Map;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.api.account.AppStartResponse;

public final class zq0 extends m6n implements zta
{
    public final zn0 A;
    public final String B;
    public final AppStartResponse C;
    public final er0 D;
    public int w;
    public int x;
    public int y;
    public byte z;
    
    public zq0(final zn0 a, final String b, final AppStartResponse c, final er0 d, final f07 f07) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new zq0(this.A, this.B, this.C, this.D, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((zq0)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte z = this.z;
        final lpl y = lpl.y;
        final AppStartResponse c = this.C;
        final er0 d = this.D;
        final String b = this.B;
        final pc7 v = pc7.v;
        int y2 = 0;
        int x = 0;
        int w = 0;
        pc7 pc7 = null;
        Label_1341: {
            Label_1300: {
                int x2;
                int w2;
                if (z != 0) {
                    if (z != 1) {
                        if (z == 2) {
                            y2 = this.y;
                            x = this.x;
                            w = this.w;
                            vt4.g0(o);
                            pc7 = v;
                            break Label_1300;
                        }
                        if (z == 3) {
                            vt4.g0(o);
                            return lqo.a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        y2 = this.y;
                        x2 = this.x;
                        w2 = this.w;
                        vt4.g0(o);
                        pc7 = v;
                    }
                }
                else {
                    vt4.g0(o);
                    final zn0 a = this.A;
                    zn0 i;
                    if (a != null) {
                        i = d.i(b);
                    }
                    else {
                        i = null;
                    }
                    if (i != null && !mlc.q((Object)i.v, (Object)a.v)) {
                        w2 = 1;
                    }
                    else {
                        w2 = 0;
                    }
                    int n;
                    if (i != null && !mlc.q((Object)i.w, (Object)a.w)) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    int n2;
                    if (i != null && !i.x.equals(a.x)) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    if (w2 != 0 || n != 0 || n2 != 0) {
                        final List a2 = adn.a;
                        final StringBuilder v2 = smk.v("App start response for org ", OrganizationId.a(b), ": local state changed since the pre-request snapshot; keeping the changed settings fields=", ", local notificationPreferences=", (boolean)(w2 != 0));
                        v2.append((boolean)(n != 0));
                        v2.append(", local modelSelector=");
                        v2.append((boolean)(n2 != 0));
                        adn.e(6, v2.toString(), (String)null, (Map)null);
                    }
                    final Map c2 = c.c;
                    final Account a3 = c.a;
                    if (c2 != null) {
                        final opd l = d.l;
                        final String a4 = l.a();
                        if (!c2.isEmpty()) {
                            final tqd j = uqd.l;
                            l.b.put((Object)a4, (Object)c2);
                        }
                    }
                    Account account = c.a;
                    if (i != null) {
                        if (w2 != 0) {
                            final AccountSettings accountSettings = (AccountSettings)i.v;
                            AccountSettings k;
                            if (accountSettings != null) {
                                k = lkq.i(d.p, (AccountSettings)a.v, accountSettings, account.h);
                            }
                            else {
                                k = null;
                            }
                            account = Account.a(account, (String)null, (String)null, (ArrayList)null, k, 383);
                        }
                        if (n != 0) {
                            final List g = account.g;
                            final ArrayList list = new ArrayList(d86.p0((Iterable)g, 10));
                            for (Membership a5 : g) {
                                final Membership membership = a5;
                                if (mlc.q((Object)membership.a.a, (Object)b)) {
                                    a5 = Membership.a(membership, (Preferences)i.w);
                                }
                                list.add((Object)a5);
                            }
                            account = Account.a(account, (String)null, (String)null, list, (AccountSettings)null, 447);
                        }
                    }
                    d.b.d(account);
                    ((b5h)d.k.a.b((Object)new OrganizationId(b))).a.setValue((Object)c.e);
                    final pgp pgp = (pgp)d.i.a.b((Object)new OrganizationId(b));
                    final AccountSettings h = a3.h;
                    Boolean w3;
                    if (h != null) {
                        w3 = h.w;
                    }
                    else {
                        w3 = null;
                    }
                    final Boolean true = Boolean.TRUE;
                    pgp.a.setValue((Object)mlc.q((Object)w3, (Object)true));
                    final cop cop = (cop)d.j.a.b((Object)new OrganizationId(b));
                    final ksg a6 = cop.a;
                    final AccountSettings h2 = a3.h;
                    Boolean x3;
                    if (h2 != null) {
                        x3 = h2.x;
                    }
                    else {
                        x3 = null;
                    }
                    VillageWeaverConsentState v3;
                    if (h2 != null) {
                        v3 = h2.v;
                    }
                    else {
                        v3 = null;
                    }
                    final boolean b2 = v3 == VillageWeaverConsentState.z;
                    if (mlc.q((Object)cop.a(), (Object)dc8.a)) {
                        cop.b((gc8)ec8.a);
                    }
                    if (b2) {
                        final gc8 a7 = cop.a();
                        fc8 fc8;
                        if (a7 instanceof fc8) {
                            fc8 = (fc8)a7;
                        }
                        else {
                            fc8 = null;
                        }
                        if (fc8 != null) {
                            cop.b((gc8)fc8.a());
                        }
                        cop.b = false;
                        a6.setValue((Object)Boolean.FALSE);
                    }
                    else {
                        final boolean b3 = cop.b;
                        cop.b = false;
                        if (!b3 || !mlc.q((Object)x3, (Object)true)) {
                            a6.setValue((Object)mlc.q((Object)x3, (Object)true));
                        }
                    }
                    final fff c3 = d.c;
                    final List g2 = c.g;
                    List f = c.f;
                    if (n2 != 0) {
                        f = null;
                    }
                    if (g2 != null) {
                        final x8m b4 = c3.b;
                        final OrganizationId organizationId = new OrganizationId(b);
                        final ArrayList list2 = new ArrayList(d86.p0((Iterable)g2, 10));
                        for (final ModelSelectorConfig modelSelectorConfig : g2) {
                            final List b5 = modelSelectorConfig.b;
                            final ArrayList list3 = new ArrayList(d86.p0((Iterable)b5, 10));
                            final Iterator iterator3 = ((Iterable)b5).iterator();
                            while (iterator3.hasNext()) {
                                list3.add((Object)twl.L((ModelSelectorEntry)iterator3.next(), c3.a));
                            }
                            list2.add((Object)new ModelSelectorConfig(modelSelectorConfig.a, (List)list3));
                        }
                        pc7 = v;
                        b4.put((Object)organizationId, (Object)list2);
                    }
                    else {
                        pc7 = v;
                    }
                    if (f != null) {
                        c3.c.put((Object)new OrganizationId(b), (Object)f);
                    }
                    GrowthBookSchema b6 = c.b;
                    if (b6 == null || b6.a.isEmpty()) {
                        b6 = null;
                    }
                    final z8b a8 = d.g.a(b);
                    if (b6 != null) {
                        this.w = w2;
                        this.x = n;
                        this.y = n2;
                        this.z = 1;
                        if (a8.c(b6, (h07)this) == pc7) {
                            return pc7;
                        }
                        final int n3 = n;
                        y2 = n2;
                        x2 = n3;
                    }
                    else {
                        this.w = w2;
                        this.x = n;
                        this.y = n2;
                        this.z = 2;
                        if (a8.o((f07)this) == pc7) {
                            return pc7;
                        }
                        final int n4 = n2;
                        w = w2;
                        x = n;
                        y2 = n4;
                        break Label_1300;
                    }
                }
                final int n5 = w2;
                x = x2;
                w = n5;
                break Label_1341;
            }
            final List a9 = adn.a;
            adn.f((Throwable)new IllegalStateException("App start network response missing GrowthBook schema for org ".concat(OrganizationId.a(b))), (String)null, y, (Map)null, (List)null, 58);
        }
        CurrentUserAccess d2 = c.d;
        if (d2 == null || ((Collection)d2.a).isEmpty()) {
            d2 = null;
        }
        if (d2 != null) {
            ((v5a)d.h.a.b((Object)new OrganizationId(b))).a.setValue((Object)d2);
        }
        else {
            final List a10 = adn.a;
            adn.f((Throwable)new IllegalStateException("App start network response missing feature access for org ".concat(OrganizationId.a(b))), (String)null, y, (Map)null, (List)null, 58);
        }
        final gyf w4 = gyf.w;
        final yq0 yq0 = new yq0(w != 0, d, y2 != 0, this.B, null);
        this.w = w;
        this.x = x;
        this.y = y2;
        this.z = 3;
        if (rhc.f0((hc7)w4, (zta)yq0, (f07)this) != pc7) {
            return lqo.a;
        }
        return pc7;
    }
}
