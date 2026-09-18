import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.util.Log;

public final class lqn implements qgg
{
    public final ep0 a;
    public final l7n b;
    public kqn c;
    public lta d;
    public lta e;
    
    public lqn(final ep0 a, final l7n b) {
        this.a = a;
        this.b = b;
        this.c = iqn.a;
        this.d = (lta)new jkn((byte)8);
        this.e = (lta)new jkn((byte)9);
    }
    
    public final void a(final boolean b) {
        monitorenter(this);
        final boolean a = b ^ true;
        Label_0113: {
            try {
                final SharedPreferences$Editor edit = this.a.a.edit();
                edit.getClass();
                edit.putBoolean("third_party_analytics_disabled_for_org", b);
                edit.apply();
                Object a2 = null;
                Label_0088: {
                    final fdo w;
                    Label_0062: {
                        Label_0058: {
                            if (!b) {
                                Label_0079: {
                                    try {
                                        final fdo v = fdo.v;
                                        break Label_0062;
                                    }
                                    finally {
                                        break Label_0079;
                                    }
                                    break Label_0058;
                                }
                                a2 = new jpj((Throwable)w);
                                break Label_0088;
                            }
                        }
                        w = fdo.w;
                    }
                    zw7.a((String)null).i(w);
                    a2 = lqo.a;
                }
                final Throwable a3 = kpj.a(a2);
                if (a3 != null) {
                    Log.e("ThirdPartyAnalyticsGate", "Datadog consent change failed", a3);
                }
                break Label_0113;
            }
            finally {
                monitorexit(this);
                while (true) {
                    jpj jpj = null;
                    Throwable a4 = null;
                    Throwable a5;
                    jpj jpj2;
                    Throwable a6 = null;
                    lqo a7;
                    final Throwable t;
                    lqo a8;
                    final Throwable t2;
                    jpj jpj3 = null;
                    s10 s10;
                    tze w2;
                    lqo a9;
                    final Throwable t3;
                    Label_0200_Outer:Block_11_Outer:
                    while (true) {
                    Label_0298:
                        while (true) {
                            Block_10: {
                                while (true) {
                                Label_0316_Outer:
                                    while (true) {
                                        a4 = kpj.a((Object)jpj);
                                        iftrue(Label_0267:)(a4 == null);
                                        break Block_10;
                                        while (true) {
                                            monitorexit(this);
                                            return;
                                            Log.e("ThirdPartyAnalyticsGate", "Sift enabled change dispatch failed", a5);
                                            continue Label_0200_Outer;
                                        }
                                        a6 = kpj.a((Object)jpj2);
                                        iftrue(Label_0218:)(a6 == null);
                                        break Label_0200_Outer;
                                        try {
                                            Label_0218: {
                                                this.d.b((Object)a);
                                            }
                                            a7 = lqo.a;
                                        }
                                        finally {
                                            jpj = new jpj(t);
                                        }
                                        continue Label_0316_Outer;
                                    }
                                    try {
                                        Label_0267: {
                                            this.e.b((Object)a);
                                        }
                                        a8 = lqo.a;
                                    }
                                    finally {
                                        jpj3 = new jpj(t2);
                                    }
                                    break Label_0298;
                                    try {
                                        s10 = (s10)this.b.getValue();
                                        s10.A = a;
                                        w2 = s10.w;
                                        rhc.G((oc7)w2.y, (hc7)w2.x, 0, (zta)new m10((Object)s10, a, (f07)null, (byte)0), 2);
                                        a9 = lqo.a;
                                    }
                                    finally {
                                        jpj2 = new jpj(t3);
                                    }
                                    continue Block_11_Outer;
                                }
                            }
                            Log.e("ThirdPartyAnalyticsGate", "Sentry enabled change dispatch failed", a4);
                            continue;
                        }
                        a5 = kpj.a((Object)jpj3);
                        iftrue(Label_0316:)(a5 == null);
                        continue Block_11_Outer;
                    }
                    Log.e("ThirdPartyAnalyticsGate", "Segment enabled change failed", a6);
                    continue;
                }
            }
        }
    }
    
    public final void b(final String s) {
        final ep0 a = this.a;
        final SharedPreferences a2 = a.a;
        if (!a2.contains(ep0.p(s))) {
            return;
        }
        final String p = ep0.p(s);
        boolean b;
        if (a2.contains(p)) {
            b = a2.getBoolean(p, false);
        }
        else {
            b = a2.getBoolean("third_party_analytics_disabled_for_org", false);
        }
        a.s(s, b);
        this.a(b);
    }
    
    public final boolean c() {
        monitorenter(this);
        while (true) {
            Label_0048: {
                try {
                    if (this.c.equals(iqn.a) && !this.a.a.contains("third_party_analytics_policy_resolved")) {
                        final boolean b = false;
                        break Label_0050;
                    }
                    break Label_0048;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                    return;
                    b = true;
                    continue;
                }
            }
            break;
        }
    }
    
    public final void d() {
        monitorenter(this);
        Label_0059: {
            try {
                final int d = ge9.D(this.a.f());
                if (d == 0) {
                    break Label_0059;
                }
                if (d == 1) {
                    break Label_0059;
                }
                if (d == 2) {
                    break Label_0059;
                }
                throw new RuntimeException();
            }
            finally {
                monitorexit(this);
                this.a(true);
                break Label_0059;
                this.a(false);
                monitorexit(this);
            }
        }
    }
    
    public final void e(final String s, final boolean b) {
        monitorenter(this);
        try {
            final kqn c = this.c;
            boolean q;
            if (c.equals(iqn.a)) {
                q = b;
            }
            else if (c instanceof jqn) {
                q = false;
            }
            else {
                if (!(c instanceof hqn)) {
                    throw new RuntimeException();
                }
                q = mlc.q((Object)((hqn)c).a, (Object)s);
            }
            final ep0 a = this.a;
            if (!q) {
                final SharedPreferences$Editor edit = a.a.edit();
                edit.getClass();
                edit.putBoolean(ep0.p(s), b);
                edit.apply();
                monitorexit(this);
                return;
            }
            a.s(s, b);
            this.a(b);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            throw new RuntimeException();
        }
    }
}
