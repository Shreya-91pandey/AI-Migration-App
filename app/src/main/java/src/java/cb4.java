import java.util.Iterator;
import java.util.List;
import android.content.Context;
import java.util.HashSet;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.api.artifacts.ArtifactSource;
import com.anthropic.claude.api.artifacts.ArtifactVersionRecord;
import java.util.ArrayList;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.artifacts.ArtifactVersionsResponse;
import com.anthropic.claude.analytics.screens.AnalyticsScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatScreen;

public final class cb4 extends m6n implements lta
{
    public final byte w;
    public boolean x;
    public final oc4 y;
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((cb4)this.create(f07)).invokeSuspend(a);
            }
            case 3: {
                return ((cb4)this.create(f07)).invokeSuspend(a);
            }
            case 2: {
                return ((cb4)this.create(f07)).invokeSuspend(a);
            }
            case 1: {
                return ((cb4)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((cb4)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final oc4 y = this.y;
        switch (w) {
            default: {
                return (f07)new cb4(y, f07, (byte)4);
            }
            case 3: {
                return (f07)new cb4(y, f07, (byte)3);
            }
            case 2: {
                return (f07)new cb4(y, f07, (byte)2);
            }
            case 1: {
                return (f07)new cb4(y, f07, (byte)1);
            }
            case 0: {
                return (f07)new cb4(y, f07, (byte)0);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        final oc4 y = this.y;
        Object v = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    this.x = true;
                    o = rhc.f0((hc7)((y38)y.D0).a(), (zta)new mn3(y, null, (byte)27), (f07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 3: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    this.x = true;
                    if (y.Z1((f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 2: {
                final boolean x3 = this.x;
                if (x3) {
                    if (x3) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    y.W.d((AnalyticsScreen)new AnalyticsScreens$ChatScreen(y.y.d, y.q1, y.v0().e));
                    final zm4 w2 = y.W0;
                    rhc.G((oc7)w2.h, (hc7)null, 0, (zta)new pn((byte)3, (f07)null, (Object)w2), 3);
                    this.x = true;
                    if (y.A1((h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 1: {
                final boolean x4 = this.x;
                if (x4) {
                    if (x4) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final eup e = eup.E;
                    final Context x5 = y.x;
                    ((y38)y.D0).getClass();
                    final o68 a2 = vo8.a;
                    final d58 w3 = d58.w;
                    this.x = true;
                    if (e.z(x5, (ic7)w3, (h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 0: {
                final boolean x6 = this.x;
                Label_0512: {
                    if (x6) {
                        if (x6) {
                            vt4.g0(o);
                            break Label_0512;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        final s51 z0 = y.z0;
                        final String d = y.y.d;
                        final String q1 = y.q1;
                        this.x = true;
                        if ((o = s51.a(z0, d, q1, (h07)this)) == v) {
                            return v;
                        }
                        break Label_0512;
                    }
                    v = null;
                    return v;
                }
                final ArtifactVersionsResponse artifactVersionsResponse = (ArtifactVersionsResponse)ak0.g((ApiResult)o);
                if (artifactVersionsResponse == null) {
                    return null;
                }
                final List a3 = artifactVersionsResponse.a();
                if (a3 == null) {
                    return null;
                }
                final ArrayList list = new ArrayList();
                for (final Object next : a3) {
                    final ArtifactVersionRecord artifactVersionRecord = (ArtifactVersionRecord)next;
                    if (artifactVersionRecord.c() == ArtifactSource.x && (artifactVersionRecord.e() == ArtifactVisibility.x || (artifactVersionRecord.b() != null && artifactVersionRecord.a() == null))) {
                        list.add(next);
                    }
                }
                o = new HashSet();
                final Iterator iterator2 = list.iterator();
                while (true) {
                    v = o;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final String d2 = ((ArtifactVersionRecord)iterator2.next()).d();
                    if (d2 == null) {
                        continue;
                    }
                    ((HashSet)o).add((Object)d2);
                }
                return v;
            }
        }
    }
}
