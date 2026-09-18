package com.anthropic.claude.app.main;

import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.AccountSwitcherEvents$AccountSwitched;
import com.anthropic.claude.analytics.events.AccountSwitcherEvents$AccountSwitchSource;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import android.content.SharedPreferences;
import java.util.List;
import android.widget.Toast;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.ArrayList;
import java.util.Map;
import com.anthropic.claude.login.WelcomeNotice;
import android.content.Context;

public abstract class l
{
    public static final void a(final boolean b, final xk0 xk0, final gva gva, final int n) {
        gva.i0(1878170994);
        int n2;
        if (gva.g(b)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)xk0)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        final int n5 = 1;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            if (!b) {
                gva.g0(2053270249);
                int n6 = n5;
                if ((n4 & 0x70) != 0x20) {
                    if (gva.h((Object)xk0)) {
                        n6 = n5;
                    }
                    else {
                        n6 = 0;
                    }
                }
                final Object r = gva.R();
                Object o;
                if (n6 != 0 || (o = r) == bi6.a) {
                    o = new h80((byte)14, (f07)null, (Object)xk0);
                    gva.q0(o);
                }
                mlc.f((zta)o, gva, (Object)lqo.a);
                gva.q(false);
            }
            else {
                gva.g0(2053369232);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new uf0(b, xk0, n);
        }
    }
    
    public static final void b(final jta jta, final hwj hwj, final igf igf, ep0 ep0, nkc nkc, t7d t7d, final n2b n2b, vn0 vn0, final wec wec, xk0 xk0, final gva gva, final int n) {
        gva.i0(1440493845);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)hwj)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f((Object)igf)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n | n2 | n3 | n4 | 0x12492400;
        wec wec2;
        n2b n2b4;
        if (gva.W(n5 & 0x1, (0x12492493 & n5) != 0x12492492)) {
            gva.b0();
            final cib a = bi6.a;
            n2b n2b2;
            vn0 vn2;
            Object o;
            nkc nkc3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final ep0 ep2 = ep0;
                final nkc nkc2 = nkc;
                n2b2 = n2b;
                vn2 = vn0;
                wec2 = wec;
                o = ep2;
                nkc3 = nkc2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (ep0 = (ep0)r) == a) {
                    ep0 = (ep0)a2.d((Class)ep0.class, (emi)null);
                    gva.q0((Object)ep0);
                }
                o = ep0;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)nkc.class, (emi)null);
                    gva.q0(o2);
                }
                nkc3 = (nkc)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)t7d.class, (emi)null);
                    gva.q0(o3);
                }
                t7d = (t7d)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                final Object r4 = gva.R();
                Object o4;
                if ((f7 | f8) || (o4 = r4) == a) {
                    o4 = a5.d((Class)n2b.class, (emi)null);
                    gva.q0(o4);
                }
                n2b2 = (n2b)o4;
                final odk a6 = ii8.a(gva);
                final boolean f9 = gva.f((Object)null);
                final boolean f10 = gva.f((Object)a6);
                final Object r5 = gva.R();
                Object o5;
                if ((f9 | f10) || (o5 = r5) == a) {
                    o5 = a6.d((Class)vn0.class, (emi)null);
                    gva.q0(o5);
                }
                final vn0 vn3 = (vn0)o5;
                final odk a7 = ii8.a(gva);
                final boolean f11 = gva.f((Object)null);
                final boolean f12 = gva.f((Object)a7);
                final Object r6 = gva.R();
                Object o6;
                if ((f11 | f12) || (o6 = r6) == a) {
                    o6 = a7.d((Class)wec.class, (emi)null);
                    gva.q0(o6);
                }
                final wec wec3 = (wec)o6;
                final odk a8 = ii8.a(gva);
                final boolean f13 = gva.f((Object)null);
                final boolean f14 = gva.f((Object)a8);
                final Object r7 = gva.R();
                Object o7;
                if ((f13 | f14) || (o7 = r7) == a) {
                    o7 = a8.d((Class)xk0.class, (emi)null);
                    gva.q0(o7);
                }
                final xk0 xk2 = (xk0)o7;
                vn2 = vn3;
                wec2 = wec3;
                xk0 = xk2;
            }
            gva.r();
            k8e.g((wop)null, gva, 0);
            final boolean h = gva.h((Object)t7d);
            final boolean h2 = gva.h((Object)wec2);
            final Object r8 = gva.R();
            Object o8;
            if ((h | h2) || (o8 = r8) == a) {
                o8 = new rf0((Object)t7d, (Object)wec2, (f07)null, (byte)16);
                gva.q0(o8);
            }
            final zta zta = (zta)o8;
            final lqo a9 = lqo.a;
            mlc.f(zta, gva, (Object)a9);
            final boolean h3 = gva.h((Object)vn2);
            final boolean h4 = gva.h((Object)n2b2);
            final Object r9 = gva.R();
            Object o9;
            if ((h3 | h4) || (o9 = r9) == a) {
                o9 = new frd((Object)vn2, (Object)n2b2, (f07)null, (byte)1);
                gva.q0(o9);
            }
            mlc.f((zta)o9, gva, (Object)a9);
            c5q.c(iwj.a.a((Object)hwj), (zta)uuj.t0(-2103319083, (aua)new a((ep0)o, xk0, jta, igf, nkc3), gva), gva, 56);
            final ep0 ep3 = (ep0)o;
            final n2b n2b3 = n2b2;
            vn0 = vn2;
            ep0 = ep3;
            nkc = nkc3;
            n2b4 = n2b3;
        }
        else {
            gva.Z();
            wec2 = wec;
            n2b4 = n2b;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new j0e(jta, hwj, igf, ep0, nkc, t7d, n2b4, vn0, wec2, xk0, n);
        }
    }
    
    public static final void c(final gwj gwj, final xk0 xk0, final jta jta, final igf igf, final gva gva, final int n) {
        gva.i0(-916675178);
        int n2;
        if (gva.f((Object)gwj)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)xk0)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)jta)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.f((Object)igf)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n2 | n | n3 | n4 | n5;
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            final int n7 = n6 & 0xE;
            mlc.k(gwj, igf, (vlm)soh.s(gwj, gva, n7 | 0x180), uuj.t0(1023637720, (aua)new c(jta, gwj, xk0, igf), gva), gva, n7 | 0xC00 | (n6 >> 6 & 0x70), 0);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cj4(gwj, xk0, jta, igf, n);
        }
    }
    
    public static final void d(final xk0 xk0, final t9 t9, final jta jta, final ep0 ep0, final MainAppScreens mainAppScreens, final Context context, final gwj gwj, final p9 p9, final WelcomeNotice welcomeNotice) {
        final Integer value = 1;
        xk0.b.set(true);
        final List a = adn.a;
        adn.e(6, "Closing account scope", (String)null, (Map)null);
        t9.a();
        jta.a();
        final String d = ep0.d();
        if (d != null && !d.equals(((MainAppScreens.LoggedIn)mainAppScreens).a)) {
            final SharedPreferences m = smk.m("account_prefs", d, context.getApplicationContext(), 0);
            Object o;
            if ((o = m.getAll()) == null) {
                o = s89.v;
            }
            final Iterable iterable = (Iterable)((Map)o).keySet();
            final ArrayList list = new ArrayList();
            for (final Object next : iterable) {
                final String s = (String)next;
                if (!mlc.q((Object)s, (Object)"conway_saved_client_id")) {
                    s.getClass();
                    if (!rym.E0(s, "conway_composer_draft_", false) && !rym.E0(s, "conway_viewing_fork_", false) && !rym.E0(s, "conway_send_outbox_", false)) {
                        continue;
                    }
                }
                list.add(next);
            }
            if (!list.isEmpty()) {
                final SharedPreferences$Editor edit = m.edit();
                edit.getClass();
                final Iterator iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    edit.remove((String)iterator2.next());
                }
                edit.apply();
            }
            String string = m.getString("selected_org_id", (String)null);
            if (string == null) {
                string = null;
            }
            Object o2;
            if (string != null) {
                o2 = new OrganizationId(string);
            }
            else {
                o2 = null;
            }
            o50.Q(o2);
            String s2;
            if ((s2 = (String)o50.Q((Object)m.getString("display_email", (String)null)).getValue()) == null) {
                s2 = d;
            }
            int n;
            if (welcomeNotice == null) {
                n = -1;
            }
            else {
                n = s0e.a[((Enum)welcomeNotice).ordinal()];
            }
            yog yog;
            if (n != -1) {
                if (n != 1) {
                    if (n != 2) {
                        en9.r();
                        return;
                    }
                    yog = new yog((Object)2131757425, (Object)value);
                }
                else {
                    yog = new yog((Object)2131757426, (Object)value);
                }
            }
            else {
                yog = new yog((Object)2131757307, (Object)0);
            }
            Toast.makeText(context, (CharSequence)context.getString(((Number)yog.v).intValue(), new Object[] { s2 }), ((Number)yog.w).intValue()).show();
            e(p9, mainAppScreens, xk0, context, gwj, d, 4);
            return;
        }
        gwj.b((lta)new crd((Object[])new MainAppScreens[] { new MainAppScreens.LoggedOut(welcomeNotice) }, (byte)11), (zta)new p0e((byte)9));
    }
    
    public static final void e(final p9 p7, final MainAppScreens mainAppScreens, final xk0 xk0, final Context context, final gwj gwj, final String s, int d) {
        final String a = ((MainAppScreens.LoggedIn)mainAppScreens).a;
        final st4 b = p7.b;
        d = ge9.D(d);
        AccountSwitcherEvents$AccountSwitchSource accountSwitcherEvents$AccountSwitchSource;
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        if (d != 4) {
                            if (d != 5) {
                                en9.r();
                                return;
                            }
                            accountSwitcherEvents$AccountSwitchSource = AccountSwitcherEvents$AccountSwitchSource.B;
                        }
                        else {
                            accountSwitcherEvents$AccountSwitchSource = AccountSwitcherEvents$AccountSwitchSource.A;
                        }
                    }
                    else {
                        accountSwitcherEvents$AccountSwitchSource = AccountSwitcherEvents$AccountSwitchSource.z;
                    }
                }
                else {
                    accountSwitcherEvents$AccountSwitchSource = AccountSwitcherEvents$AccountSwitchSource.y;
                }
            }
            else {
                accountSwitcherEvents$AccountSwitchSource = AccountSwitcherEvents$AccountSwitchSource.x;
            }
        }
        else {
            accountSwitcherEvents$AccountSwitchSource = AccountSwitcherEvents$AccountSwitchSource.w;
        }
        final AccountSwitcherEvents$AccountSwitched accountSwitcherEvents$AccountSwitched = new AccountSwitcherEvents$AccountSwitched(accountSwitcherEvents$AccountSwitchSource, p7.a.j().size(), a, s);
        final KSerializer serializer = AccountSwitcherEvents$AccountSwitched.Companion.serializer();
        vt4.b0(serializer);
        b.b((v10)accountSwitcherEvents$AccountSwitched, (KSerializer)serializer);
        xk0.b.set(true);
        final SharedPreferences m = smk.m("account_prefs", s, context.getApplicationContext(), 0);
        Object o;
        if ((o = m.getAll()) == null) {
            o = s89.v;
        }
        final Iterable iterable = (Iterable)((Map)o).keySet();
        final ArrayList list = new ArrayList();
        for (final Object next : iterable) {
            final String s2 = (String)next;
            if (!mlc.q((Object)s2, (Object)"conway_saved_client_id")) {
                s2.getClass();
                if (!rym.E0(s2, "conway_composer_draft_", false) && !rym.E0(s2, "conway_viewing_fork_", false) && !rym.E0(s2, "conway_send_outbox_", false)) {
                    continue;
                }
            }
            list.add(next);
        }
        if (!list.isEmpty()) {
            final SharedPreferences$Editor edit = m.edit();
            edit.getClass();
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                edit.remove((String)iterator2.next());
            }
            edit.apply();
        }
        final String s3 = null;
        String string = m.getString("selected_org_id", (String)null);
        if (string == null) {
            string = null;
        }
        Object o2;
        if (string != null) {
            o2 = new OrganizationId(string);
        }
        else {
            o2 = null;
        }
        final ksg q = o50.Q(o2);
        o50.Q((Object)m.getString("display_email", (String)null));
        final OrganizationId organizationId = (OrganizationId)q.getValue();
        String a2 = s3;
        if (organizationId != null) {
            a2 = organizationId.a;
        }
        gwj.b((lta)new crd((Object[])new MainAppScreens[] { new MainAppScreens.LoggedIn(s, a2, wn.D) }, (byte)12), (zta)new p0e((byte)10));
    }
}
