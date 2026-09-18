import java.util.Collection;
import android.view.View;
import java.util.AbstractCollection;
import android.content.res.Resources;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0Output;
import java.util.Locale;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItem;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem;
import java.util.Map$Entry;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
import java.util.ArrayList;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0Input;
import java.util.Map;
import java.util.LinkedHashMap;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.tool.model.EventDeleteV0Input;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchError;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchErrorErrorType;
import com.anthropic.claude.tool.model.CalendarSearchV0Output;
import java.util.concurrent.CancellationException;
import android.content.Context;
import android.util.Log;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.AnyMessage;
import anthropic.claude.usercontent.mcpapp.JsonRpcEnvelope;
import anthropic.claude.usercontent.mcpapp.ReportInitializeResultRequest;
import anthropic.claude.usercontent.mcpapp.ReportHandshakeResultRequest;
import anthropic.claude.usercontent.mcpapp.RequestConnectorAuthRequest;
import anthropic.claude.usercontent.mcpapp.OpenLinkRequest;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import androidx.datastore.core.CorruptionException;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.chat.RecordToolResultRequest;
import com.anthropic.claude.api.chat.tool.ToolResultText;
import com.anthropic.claude.tool.model.ToolInvocationResult$Report;
import java.util.List;
import androidx.datastore.preferences.protobuf.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import androidx.datastore.preferences.protobuf.e;
import android.os.Looper;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class j9j implements t45, d64, t7o, be, rb2, e8k, uc7
{
    public static final afg x;
    public static final afg y;
    public final byte v;
    public Object w;
    
    static {
        x = new afg((byte)1);
        y = new afg((byte)0);
    }
    
    public j9j(final byte v) {
        switch (this.v = v) {
            default: {
                this.w = new AtomicReference((Object)null);
                return;
            }
            case 24: {
                final String property = System.getProperty("java.version");
                final String property2 = System.getProperty("java.runtime.version");
                System.getProperty("java.runtime.name");
                System.getProperty("java.vm.vendor");
                final String property3 = System.getProperty("java.vendor.version");
                String s = property;
                if (property == null) {
                    s = "";
                }
                String w;
                if ((w = property3) == null) {
                    w = "";
                }
                this.w = w;
                String s2;
                if (s.isEmpty() || (s2 = property2) == null) {
                    s2 = s;
                }
                if (s.length() + 1 < s2.length()) {
                    s2.substring(s.length() + 1);
                }
                return;
            }
            case 23: {
                this.w = new ConcurrentHashMap();
                return;
            }
            case 14: {
                this.w = new TreeSet((Comparator)zn2.i);
                return;
            }
            case 13: {
                this.w = uoo.y(Looper.getMainLooper());
                return;
            }
            case 12: {
                this.w = bpm.a((Object)spo.b);
                return;
            }
            case 11: {
                return;
            }
            case 4: {
                this.w = new inf(0, (Object[])new mx6[16]);
            }
        }
    }
    
    public j9j(final e w) {
        this.v = 8;
        ejc.a((Object)w, "output");
        this.w = w;
        w.a = this;
    }
    
    public j9j(final Set set) {
        this.v = 0;
        this.w = new HashMap();
        for (final i9j i9j : set) {
            final HashMap hashMap = (HashMap)this.w;
            i9j.getClass();
            hashMap.put((Object)hs7.class, (Object)i9j.a);
        }
    }
    
    public j9j(final oti w, final jmq jmq) {
        this.v = 22;
        this.w = w;
    }
    
    public j9j(final int[] array, final float[] array2, final float[][] array3) {
        this.v = 2;
        final int n = array2.length - 1;
        final nu0[][] w = new nu0[n][];
        int n2 = 1;
        int n3 = 1;
        int n5;
        int n6 = 0;
        int n9;
        for (int i = 0; i < n; i = n9, n2 = n6, n3 = n5) {
            final int n4 = array[i];
            n5 = 3;
            Label_0142: {
                Label_0099: {
                    if (n4 != 0) {
                        while (true) {
                            Label_0136: {
                                if (n4 == 1) {
                                    break Label_0136;
                                }
                                if (n4 != 2) {
                                    if (n4 != 3) {
                                        n5 = 4;
                                        if (n4 == 4) {
                                            break Label_0099;
                                        }
                                        n5 = 5;
                                        if (n4 != 5) {
                                            n5 = n3;
                                            n6 = n2;
                                            break Label_0142;
                                        }
                                        break Label_0099;
                                    }
                                    else if (n2 != 1) {
                                        break Label_0136;
                                    }
                                }
                                final int n7 = 2;
                                final int n8 = n7;
                                n6 = n7;
                                n5 = n8;
                                break Label_0142;
                            }
                            final int n7 = 1;
                            continue;
                        }
                    }
                }
                n6 = n2;
            }
            final float[] array4 = array3[i];
            n9 = i + 1;
            final float[] array5 = array3[n9];
            final float n10 = array2[i];
            final float n11 = array2[n9];
            final int n12 = array4.length / 2 + array4.length % 2;
            final nu0[] array6 = new nu0[n12];
            for (int j = 0; j < n12; ++j) {
                final int n13 = j * 2;
                final float n14 = array4[n13];
                final int n15 = n13 + 1;
                array6[j] = new nu0(n10, n11, n14, array4[n15], array5[n13], array5[n15], n5);
            }
            w[i] = array6;
        }
        this.w = w;
    }
    
    public static o4d C(j9j e, final int n) {
        final v5d v5d = (v5d)((j9j)e).w;
        final r7m a = q7m.a();
        if (a != null) {
            e = a.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a);
        try {
            final l5d l5d = (l5d)v5d.f.getValue();
            q7m.d(a, b, (lta)e);
            return v5d.q.a(n, l5d.j, v5d.d, (lta)new hvb(n, l5d));
        }
        finally {
            q7m.d(a, b, (lta)e);
        }
    }
    
    public static void D(final ft7 ft7, final String s, final Object o) {
        ft7.c.X(o, s);
    }
    
    public boolean A(final LayoutNode layoutNode) {
        if (!layoutNode.V()) {
            gac.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((AbstractCollection)this.w).remove((Object)layoutNode);
    }
    
    public void B() {
        final inf inf = (inf)this.w;
        final xgc t = ncq.T(0, inf.x);
        int v = ((vgc)t).v;
        final int w = ((vgc)t).w;
        if (v <= w) {
            while (true) {
                ((mx6)inf.v[v]).b.resumeWith((Object)lqo.a);
                if (v == w) {
                    break;
                }
                ++v;
            }
        }
        inf.h();
    }
    
    public vom E(final vom vom) {
        final apm apm = (apm)this.w;
        Object value;
        Object o;
        do {
            value = apm.getValue();
            final vom vom2 = (vom)value;
            if (!(vom2 instanceof dsi)) {
                if (!mlc.q(vom2, spo.b)) {
                    if (vom2 instanceof ot7) {
                        o = vom2;
                        if (vom.a <= ((vom)vom2).a) {
                            continue;
                        }
                    }
                    else {
                        if (vom2 instanceof nea) {
                            o = vom2;
                            continue;
                        }
                        if (vom2 instanceof jxf) {
                            en9.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        en9.r();
                        return null;
                    }
                }
            }
            o = vom;
        } while (!apm.j(value, o));
        return (vom)o;
    }
    
    public void F(final int n, final Object o, final bdk bdk) {
        final a a = (a)o;
        final e e = (e)this.w;
        e.A(n, 2);
        e.C(a.a(bdk));
        bdk.i((Object)a, this);
    }
    
    @Override
    public boolean a() {
        return ((f64)this.w).L.getValue() == null;
    }
    
    @Override
    public Object b(String e, String v, final ToolInvocationResult$Report toolInvocationResult$Report, final h07 h07) {
        final v87 v2 = (v87)this.w;
        Object o = null;
        Label_0070: {
            if (h07 instanceof t87) {
                final t87 t87 = (t87)h07;
                final int y = t87.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    t87.y = y + Integer.MIN_VALUE;
                    o = t87;
                    break Label_0070;
                }
            }
            o = new t87(this, h07);
        }
        final Object w = ((t87)o).w;
        final int y2 = ((t87)o).y;
        Object o2;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((t87)o).v;
            vt4.g0(w);
            o2 = w;
        }
        else {
            vt4.g0(w);
            final wl3 b = v2.b;
            final String c = v2.c;
            final String d = v2.d;
            final RecordToolResultRequest recordToolResultRequest = new RecordToolResultRequest(e, lq6.X(new ToolResultText(toolInvocationResult$Report.a())), toolInvocationResult$Report.b() ^ true, 0);
            ((t87)o).v = v;
            ((t87)o).y = 1;
            final Object f = ((xl3)b).f(c, d, recordToolResultRequest, (h07)o);
            final pc7 v3 = pc7.v;
            if ((o2 = f) == v3) {
                return v3;
            }
        }
        final ApiResult apiResult = (ApiResult)o2;
        final int z = t.z(apiResult);
        if (z != 0) {
            if (z != 1) {
                en9.r();
                return null;
            }
            final pj0 pj0 = (pj0)apiResult;
            final Throwable h8 = ak0.h(pj0);
            if (h8 == null || !ssf.f(h8)) {
                v = v2.j(v);
                if (h8 != null) {
                    e = t4r.e(h8);
                }
                else {
                    e = null;
                }
                SilentException.a(new SilentException(lmf.s("Failed to send tool result for ", v, ": ", e)), lpl.w, (List)null, 6);
            }
            v2.f.b((Object)pj0);
        }
        return lqo.a;
    }
    
    public Object c(final CorruptionException ex) {
        return ((lta)this.w).b(ex);
    }
    
    public void d(final Request request) {
        final kde kde = (kde)this.w;
        final ybe w = kde.W;
        final fz6 r = kde.R;
        final String method = request.getMethod();
        switch (method.hashCode()) {
            case 2131511581: {
                if (!method.equals((Object)"anthropic.claude.usercontent.mcpapp.OpenLink")) {
                    break;
                }
                final jta q = kde.getCallbacks().q;
                if (q != null) {
                    final tqd l = uqd.l;
                    q.a();
                    rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)8), 3);
                    return;
                }
                final OpenLinkRequest openLinkRequest = (OpenLinkRequest)kde.q(request, OpenLinkRequest.ADAPTER);
                if (openLinkRequest == null) {
                    final tqd i = uqd.l;
                    rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)5), 3);
                    return;
                }
                ((View)kde).post((Runnable)new pfa((Object)kde, (Object)openLinkRequest, (byte)9));
                rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)6), 3);
                return;
            }
            case 979950463: {
                if (!method.equals((Object)"anthropic.claude.usercontent.mcpapp.RequestConnectorAuth")) {
                    break;
                }
                final jta q2 = kde.getCallbacks().q;
                if (q2 != null) {
                    final tqd j = uqd.l;
                    q2.a();
                    rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)8), 3);
                    return;
                }
                AnyMessage payload = request.getPayload();
                RequestConnectorAuthRequest requestConnectorAuthRequest = null;
                Label_0316: {
                    if (payload != null) {
                        final String v = payload.v;
                        final ProtoAdapter adapter = RequestConnectorAuthRequest.ADAPTER;
                        if (!mlc.q(v, adapter.getTypeUrl())) {
                            payload = null;
                        }
                        if (payload != null) {
                            requestConnectorAuthRequest = (RequestConnectorAuthRequest)payload.a(adapter);
                            break Label_0316;
                        }
                    }
                    requestConnectorAuthRequest = null;
                }
                final zta m = kde.getCallbacks().m;
                if (requestConnectorAuthRequest != null && m != null) {
                    w.c((zta)new nh6((Object)requestConnectorAuthRequest, (Object)m, (Object)kde, (Object)request, (f07)null, (byte)18));
                    return;
                }
                final tqd k = uqd.l;
                rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)7), 3);
                return;
            }
            case 518279175: {
                if (!method.equals((Object)"anthropic.claude.usercontent.mcpapp.ReportHandshakeResult")) {
                    break;
                }
                final jta q3 = kde.getCallbacks().q;
                if (q3 == null) {
                    kde.n(request, ReportHandshakeResultRequest.ADAPTER);
                    return;
                }
                final tqd l2 = uqd.l;
                q3.a();
                rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)8), 3);
                return;
            }
            case -150863590: {
                if (!method.equals((Object)"anthropic.claude.usercontent.mcpapp.ReportInitializeResult")) {
                    break;
                }
                final jta q4 = kde.getCallbacks().q;
                if (q4 == null) {
                    kde.n(request, ReportInitializeResultRequest.ADAPTER);
                    return;
                }
                final tqd l3 = uqd.l;
                q4.a();
                rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)8), 3);
                return;
            }
            case -267277826: {
                if (!method.equals((Object)"anthropic.claude.usercontent.sandbox.ReadyForContent")) {
                    break;
                }
                return;
            }
            case -524716315: {
                if (!method.equals((Object)"anthropic.claude.usercontent.mcpapp.BridgeToHost")) {
                    break;
                }
                final JsonRpcEnvelope jsonRpcEnvelope = (JsonRpcEnvelope)kde.q(request, JsonRpcEnvelope.ADAPTER);
                if (jsonRpcEnvelope == null) {
                    final tqd l4 = uqd.l;
                    rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)3), 3);
                    return;
                }
                w.a(jsonRpcEnvelope.getMessage());
                rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)4), 3);
                return;
            }
        }
        final tqd l5 = uqd.l;
        rhc.G((oc7)r, null, 0, (zta)new ide(kde, request, (f07)null, (byte)0), 3);
    }
    
    @Override
    public List e() {
        Object v;
        if ((v = ((f64)this.w).L.getValue()) == null) {
            v = r89.v;
        }
        return (List)v;
    }
    
    @Override
    public void f(final Object o) {
        final ae ae = (ae)o;
        final vra vra = (vra)this.w;
        final rra rra = (rra)vra.F.pollLast();
        if (rra == null) {
            final StringBuilder sb = new StringBuilder("No Activities were started for result for ");
            sb.append((Object)this);
            Log.w("FragmentManager", sb.toString());
            return;
        }
        final String v = rra.v;
        final int w = rra.w;
        final hra x = vra.c.x(v);
        if (x == null) {
            final StringBuilder sb2 = new StringBuilder("Activity result delivered for unknown Fragment ");
            sb2.append(v);
            Log.w("FragmentManager", sb2.toString());
            return;
        }
        x.r(w, ae.v, ae.w);
    }
    
    @Override
    public void g(final gc2 gc2) {
        h4b.a((k13)this.w, (Object)(gc2.a == 0));
    }
    
    public void h() {
    }
    
    @Override
    public boolean i() {
        final f64 f64 = (f64)this.w;
        return f64.L.getValue() != null && mlc.q(f64.C.k(f64.b0(), f64.a0()).b(), Boolean.TRUE);
    }
    
    @Override
    public boolean j() {
        final f64 f64 = (f64)this.w;
        return f64.C.k(f64.b0(), f64.a0()).c();
    }
    
    @Override
    public void k() {
        final f64 f64 = (f64)this.w;
        final String a0 = f64.a0();
        if (!mlc.q(a0, f64.M)) {
            return;
        }
        rhc.G((oc7)((tvj)f64).v, null, 0, (zta)new g24((Object)f64, (Object)a0, (f07)null, (byte)1), 3);
    }
    
    @Override
    public void l() {
        h4b.a((k13)this.w, (Object)Boolean.FALSE);
    }
    
    public void m(final LayoutNode layoutNode) {
        if (!layoutNode.V()) {
            gac.c("DepthSortedSet.add called on an unattached node");
        }
        ((AbstractCollection)this.w).add((Object)layoutNode);
    }
    
    public kt7 n() {
        final Context context = (Context)this.w;
        if (context != null) {
            final Object o = new Object();
            ((kt7)o).v = jr8.a((gfi)tsf.c);
            final o3a w = new o3a((Object)context);
            ((kt7)o).w = w;
            ((kt7)o).x = jr8.a((gfi)new e3a((Object)w, (Object)new v2b((Object)w, (byte)11), (byte)11));
            final o3a w2 = ((kt7)o).w;
            ((kt7)o).y = new hdk(w2);
            final gfi a = jr8.a((gfi)new e3a((Object)((kt7)o).y, (Object)jr8.a((gfi)new v2b((Object)w2, (byte)17)), (byte)27));
            ((kt7)o).z = a;
            final awp awp = new awp((byte)24);
            final o3a w3 = ((kt7)o).w;
            final tze tze = new tze((Object)w3, (Object)a, (Object)awp, (byte)8);
            final gfi v = ((kt7)o).v;
            final gfi x = ((kt7)o).x;
            ((kt7)o).A = jr8.a((gfi)new tze((Object)new uy7((Object)v, (Object)x, (Object)tze, (Object)a, (Object)a), (Object)new ve6((Object)w3, (Object)x, (Object)a, (Object)tze, (Object)v, (Object)a, (Object)a), (Object)new c2l(v, a, tze, a, (byte)23), (byte)15));
            return (kt7)o;
        }
        final String canonicalName = Context.class.getCanonicalName();
        final StringBuilder sb = new StringBuilder();
        sb.append(canonicalName);
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
    
    public void o(final CancellationException ex) {
        final inf inf = (inf)this.w;
        final int x = inf.x;
        final k13[] array = new k13[x];
        final int n = 0;
        int n2 = 0;
        int i;
        while (true) {
            i = n;
            if (n2 >= x) {
                break;
            }
            array[n2] = (k13)((mx6)inf.v[n2]).b;
            ++n2;
        }
        while (i < x) {
            array[i].u((Throwable)ex);
            ++i;
        }
        if (inf.x == 0) {
            return;
        }
        jac.c("uncancelled requests present");
    }
    
    public boolean p(final Object o) {
        final Set[] array = (Set[])this.w;
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].contains(o)) {
                return true;
            }
        }
        return false;
    }
    
    public void q() {
        this.w.getClass();
    }
    
    public Object r(final f07 f07) {
        final oy2 oy2 = (oy2)this.w;
        ny2 ny3 = null;
        Label_0061: {
            if (f07 instanceof ny2) {
                final ny2 ny2 = (ny2)f07;
                final int x = ny2.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ny2.x = x + Integer.MIN_VALUE;
                    ny3 = ny2;
                    break Label_0061;
                }
            }
            ny3 = new ny2(this, (h07)f07);
        }
        Object o = ny3.v;
        final int x2 = ny3.x;
        final pc7 v = pc7.v;
        Label_0112: {
            if (x2 == 0) {
                break Label_0112;
            }
            Label_0105: {
                if (x2 == 1) {
                    break Label_0105;
                }
                Label_0097: {
                    if (x2 != 2) {
                        break Label_0097;
                    }
                    try {
                        vt4.g0(o);
                        Label_0232: {
                            final CalendarSearchV0Output calendarSearchV0Output = (CalendarSearchV0Output)o;
                        }
                        goto Label_0259;
                        while (true) {
                            iftrue(Label_0177:)((boolean)o);
                            return sdr.j((Object)new CalendarSearchV0OutputCalendarSearchError(CalendarSearchV0OutputCalendarSearchErrorErrorType.x, "Calendar read permission denied."));
                            vt4.g0(o);
                            continue;
                        }
                        Label_0177:
                        final az2 g = oy2.g;
                        ny3.x = 2;
                        final o68 a = vo8.a;
                        iftrue(Label_0232:)((o = rhc.f0((hc7)d58.w, (zta)new np0((byte)10, (f07)null, (Object)g), (f07)ny3)) != v);
                        return v;
                        vt4.g0(o);
                        final xd f8 = oy2.f;
                        ny3.x = 1;
                        iftrue(Label_0150:)((o = f8.e("android.permission.READ_CALENDAR", (h07)ny3)) != v);
                        return v;
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    catch (final CancellationException ex) {
                        throw ex;
                    }
                    finally {
                        final tqd l = uqd.l;
                        final CalendarSearchV0OutputCalendarSearchError calendarSearchV0OutputCalendarSearchError = new CalendarSearchV0OutputCalendarSearchError(CalendarSearchV0OutputCalendarSearchErrorErrorType.A, "An error occurred.");
                    }
                }
            }
        }
    }
    
    public Object s(final EventDeleteV0Input eventDeleteV0Input, final h07 h07) {
        final by2 by2 = (by2)this.w;
        ay2 ay3 = null;
        Label_0062: {
            if (h07 instanceof ay2) {
                final ay2 ay2 = (ay2)h07;
                final int y = ay2.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ay2.y = y + Integer.MIN_VALUE;
                    ay3 = ay2;
                    break Label_0062;
                }
            }
            ay3 = new ay2(this, h07);
        }
        final Object w = ay3.w;
        final int y2 = ay3.y;
        final pc7 v = pc7.v;
        if (y2 == 0 || (y2 == 1 || y2 != 2)) {
            goto Label_0125;
        }
        try {
            vt4.g0(w);
            goto Label_0261;
        }
        catch (final CancellationException ex) {
            throw ex;
        }
        finally {
            goto Label_0272;
        }
    }
    
    public void t(final String s, final String s2) {
        final ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.w;
        final kfg kfg = (kfg)concurrentHashMap.get((Object)new ChatId(s));
        if (kfg != null) {
            if (kfg.c() && !s2.equals(kfg.a())) {
                concurrentHashMap.remove((Object)new ChatId(s), (Object)kfg);
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 14: {
                return this.w.toString();
            }
        }
    }
    
    public wse u(final i3c i3c, final vse vse, final xzl xzl, final z9k z9k) {
        if (xc2.c(i3c.q())) {
            final sti c = ((oti)this.w).c();
            wse a;
            if (c != null) {
                a = c.a(vse);
            }
            else {
                a = null;
            }
            if (a != null) {
                final a1c b = a.b();
                de2 de2;
                if (b instanceof de2) {
                    de2 = (de2)b;
                }
                else {
                    de2 = null;
                }
                if (de2 == null || jmq.A(i3c, blq.j(de2.f()))) {
                    final String s = (String)vse.a().get((Object)"coil#size");
                    if (s != null) {
                        if (!s.equals(xzl.toString())) {
                            return null;
                        }
                    }
                    else {
                        final Object value = a.a().get((Object)"coil#is_sampled");
                        Boolean b2;
                        if (value instanceof Boolean) {
                            b2 = (Boolean)value;
                        }
                        else {
                            b2 = null;
                        }
                        if (b2 == null || !b2) {
                            if (c7r.p(xzl)) {
                                return a;
                            }
                            if (i3c.t() == 2) {
                                return a;
                            }
                        }
                        final int b3 = a.b().b();
                        final int a2 = a.b().a();
                        xzl xzl2;
                        if (a.b() instanceof de2) {
                            xzl2 = k3c.c(i3c);
                        }
                        else {
                            xzl2 = xzl.c;
                        }
                        final kl8 a3 = xzl.a;
                        int b4;
                        if (a3 instanceof hl8) {
                            b4 = ((hl8)a3).b();
                        }
                        else {
                            b4 = Integer.MAX_VALUE;
                        }
                        final kl8 a4 = xzl2.a;
                        int b5;
                        if (a4 instanceof hl8) {
                            b5 = ((hl8)a4).b();
                        }
                        else {
                            b5 = Integer.MAX_VALUE;
                        }
                        final int min = Math.min(b4, b5);
                        final kl8 b6 = xzl.b;
                        int b7;
                        if (b6 instanceof hl8) {
                            b7 = ((hl8)b6).b();
                        }
                        else {
                            b7 = Integer.MAX_VALUE;
                        }
                        final kl8 b8 = xzl2.b;
                        int b9;
                        if (b8 instanceof hl8) {
                            b9 = ((hl8)b8).b();
                        }
                        else {
                            b9 = Integer.MAX_VALUE;
                        }
                        final int min2 = Math.min(b7, b9);
                        final double n = min / (double)b3;
                        double n2 = min2 / (double)a2;
                        z9k w;
                        if (min != Integer.MAX_VALUE && min2 != Integer.MAX_VALUE) {
                            w = z9k;
                        }
                        else {
                            w = z9k.w;
                        }
                        final int ordinal = ((Enum)w).ordinal();
                        int n3;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                en9.r();
                                return null;
                            }
                            if (n < n2) {
                                n3 = Math.abs(min - b3);
                                n2 = n;
                            }
                            else {
                                n3 = Math.abs(min2 - a2);
                            }
                        }
                        else if (n > n2) {
                            n3 = Math.abs(min - b3);
                            n2 = n;
                        }
                        else {
                            n3 = Math.abs(min2 - a2);
                        }
                        if (n3 > 1) {
                            final int d = ge9.D(i3c.t());
                            if (d != 0) {
                                if (d != 1) {
                                    en9.r();
                                    return null;
                                }
                                if (n2 > 1.0) {
                                    return null;
                                }
                            }
                            else if (n2 != 1.0) {
                                return null;
                            }
                        }
                    }
                    return a;
                }
            }
        }
        return null;
    }
    
    public vom v() {
        return (vom)((apm)this.w).getValue();
    }
    
    public void w(final String s) {
        final tjc tjc = (tjc)((jta)this.w).a();
        rjc v;
        if (tjc != null) {
            v = tjc.v();
        }
        else {
            v = null;
        }
        if (v != null) {
            c5q.E(v, 5, qjc.w, (jta)new zo1(s, (byte)24), null, false, 56);
        }
    }
    
    public vse x(final i3c i3c, final Object o, final pfg pfg, final zyo zyo) {
        if (i3c.q() != 4) {
            if (i3c.o() != null) {
                return new vse(i3c.o(), i3c.p());
            }
            final List c = ((oti)this.w).d.c;
            while (true) {
                for (int size = ((Collection)c).size(), i = 0; i < size; ++i) {
                    final yog yog = (yog)c.get(i);
                    final la0 la0 = (la0)yog.v;
                    if (((us4)yog.w).d(o)) {
                        la0.getClass();
                        String s = null;
                        Label_0375: {
                            switch (la0.a) {
                                default: {
                                    s = ((uyo)o).a;
                                    break Label_0375;
                                }
                                case 1: {
                                    final uyo uyo = (uyo)o;
                                    final String c2 = uyo.c;
                                    if ((c2 != null && !mlc.q(c2, "file")) || uyo.e == null || k5p.f(uyo) || !k3c.b(pfg)) {
                                        break;
                                    }
                                    final String k = k8r.k(uyo);
                                    if (k != null) {
                                        final xca d = pfg.d();
                                        final String w = fvg.w;
                                        final Long n = (Long)d.V(cib.l(k)).g;
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append((Object)uyo);
                                        sb.append("-");
                                        sb.append((Object)n);
                                        s = sb.toString();
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case 0: {
                                    final uyo uyo2 = (uyo)o;
                                    if (mlc.q(uyo2.c, "android.resource")) {
                                        final int b = k5p.b(pfg.b().getResources().getConfiguration());
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append((Object)uyo2);
                                        sb2.append(":");
                                        sb2.append(b);
                                        s = sb2.toString();
                                        break Label_0375;
                                    }
                                    break;
                                }
                            }
                            s = null;
                        }
                        if (s != null) {
                            if (s == null) {
                                return null;
                            }
                            if (!((Collection)k3c.d(i3c)).isEmpty()) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap(i3c.p());
                                ((Map)linkedHashMap).put((Object)"coil#size", (Object)pfg.f().toString());
                                return new vse(s, (Map)linkedHashMap);
                            }
                            return new vse(s, i3c.p());
                        }
                    }
                }
                String s = null;
                continue;
            }
        }
        return null;
    }
    
    public void y(final Object o, final String s, final String s2) {
        final ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.w;
        kfg kfg = (kfg)concurrentHashMap.get((Object)new ChatId(s));
        if (kfg != null) {
            if (kfg.b() != o) {
                kfg = null;
            }
            if (kfg != null) {
                if (!kfg.c() && mlc.q(s2, kfg.a())) {
                    concurrentHashMap.replace((Object)new ChatId(s), (Object)kfg, (Object)new kfg(o, kfg.a(), true));
                    return;
                }
                concurrentHashMap.remove((Object)new ChatId(s), (Object)kfg);
            }
        }
    }
    
    @Override
    public Object z(final Context context, final Object o, final String s, final x4o x4o) {
        switch (this.v) {
            default: {
                final HealthConnectDataTypesV0Input healthConnectDataTypesV0Input = (HealthConnectDataTypesV0Input)o;
                final deb deb = (deb)this.w;
                final Resources b = x3r.b(context);
                final l7n h = ahb.h;
                final List m = a4r.m();
                final ArrayList list = new ArrayList();
                for (final Object next : m) {
                    if (((ahb)next).g() && deb.f.h()) {
                        continue;
                    }
                    list.add(next);
                }
                final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
                for (final ahb ahb : list) {
                    final String d = ahb.d();
                    final String string = b.getString(ahb.c());
                    string.getClass();
                    final int d2 = ge9.D(ahb.e());
                    final Object o2 = null;
                    HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType healthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
                    if (d2 != 0) {
                        if (d2 != 1) {
                            if (d2 != 2) {
                                en9.r();
                                return o2;
                            }
                            healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType.y;
                        }
                        else {
                            healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType.x;
                        }
                    }
                    else {
                        healthConnectDataTypesV0OutputDataTypesItemRecordBaseType = HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType.w;
                    }
                    final String i = ahb.i();
                    final Map h2 = ahb.h();
                    final ArrayList list3 = new ArrayList(h2.size());
                    final Iterator iterator3 = h2.entrySet().iterator();
                    while (iterator3.hasNext()) {
                        final int ordinal = ((Enum)((Map$Entry)iterator3.next()).getKey()).ordinal();
                        HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            if (ordinal != 5) {
                                                en9.r();
                                                return o2;
                                            }
                                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.B;
                                        }
                                        else {
                                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.A;
                                        }
                                    }
                                    else {
                                        healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.z;
                                    }
                                }
                                else {
                                    healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.y;
                                }
                            }
                            else {
                                healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.x;
                            }
                        }
                        else {
                            healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem = HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem.w;
                        }
                        list3.add((Object)healthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem);
                    }
                    list2.add((Object)new HealthConnectDataTypesV0OutputDataTypesItem(string, d, healthConnectDataTypesV0OutputDataTypesItemRecordBaseType, list3, i));
                }
                final String a = healthConnectDataTypesV0Input.a;
                ArrayList list4 = list2;
                if (a != null) {
                    if (kym.Y0((CharSequence)a)) {
                        list4 = list2;
                    }
                    else {
                        final String lowerCase = a.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        list4 = new ArrayList();
                        for (final Object next2 : list2) {
                            final HealthConnectDataTypesV0OutputDataTypesItem healthConnectDataTypesV0OutputDataTypesItem = (HealthConnectDataTypesV0OutputDataTypesItem)next2;
                            final String b2 = healthConnectDataTypesV0OutputDataTypesItem.b();
                            final Locale root = Locale.ROOT;
                            final String lowerCase2 = b2.toLowerCase(root);
                            lowerCase2.getClass();
                            if (!kym.I0((CharSequence)lowerCase2, (CharSequence)lowerCase, false)) {
                                final String lowerCase3 = healthConnectDataTypesV0OutputDataTypesItem.a().toLowerCase(root);
                                lowerCase3.getClass();
                                if (!kym.I0((CharSequence)lowerCase3, (CharSequence)lowerCase, false)) {
                                    continue;
                                }
                            }
                            list4.add(next2);
                        }
                    }
                }
                return sdr.t((Object)new HealthConnectDataTypesV0Output(list4));
            }
            case 6: {
                final lqo lqo = (lqo)o;
                return this.r((f07)x4o);
            }
            case 5: {
                return this.s((EventDeleteV0Input)o, (h07)x4o);
            }
        }
    }
}
