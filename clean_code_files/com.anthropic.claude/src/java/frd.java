import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import android.os.Build$VERSION;
import java.io.Closeable;
import java.net.DatagramPacket;
import android.os.SystemClock;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Set;
import com.anthropic.claude.conversation.sse.d;
import com.anthropic.claude.types.strings.SessionId;
import android.view.View;

public final class frd extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public Object y;
    public final Object z;
    
    public final f07 create(final Object y, final f07 f07) {
        final byte w = this.w;
        final Object z = this.z;
        switch (w) {
            default: {
                return (f07)new frd(this.y, z, f07, (byte)29);
            }
            case 28: {
                return (f07)new frd(this.y, z, f07, (byte)28);
            }
            case 27: {
                final frd frd = new frd((byte)27, f07, z);
                frd.y = y;
                return (f07)frd;
            }
            case 26: {
                return (f07)new frd(this.y, z, f07, (byte)26);
            }
            case 25: {
                final frd frd2 = new frd((byte)25, f07, z);
                final SessionId sessionId = (SessionId)y;
                String a;
                if (sessionId != null) {
                    a = sessionId.a;
                }
                else {
                    a = null;
                }
                frd2.y = a;
                return (f07)frd2;
            }
            case 24: {
                final frd frd3 = new frd((byte)24, f07, z);
                frd3.y = y;
                return (f07)frd3;
            }
            case 23: {
                return (f07)new frd(this.y, z, f07, (byte)23);
            }
            case 22: {
                return (f07)new frd(this.y, z, f07, (byte)22);
            }
            case 21: {
                final frd frd4 = new frd((byte)21, f07, z);
                frd4.y = y;
                return (f07)frd4;
            }
            case 20: {
                final frd frd5 = new frd((byte)20, f07, z);
                frd5.y = y;
                return (f07)frd5;
            }
            case 19: {
                final frd frd6 = new frd((byte)19, f07, z);
                frd6.y = y;
                return (f07)frd6;
            }
            case 18: {
                return (f07)new frd(this.y, z, f07, (byte)18);
            }
            case 17: {
                return (f07)new frd(this.y, z, f07, (byte)17);
            }
            case 16: {
                return (f07)new frd(this.y, z, f07, (byte)16);
            }
            case 15: {
                return (f07)new frd(this.y, z, f07, (byte)15);
            }
            case 14: {
                final frd frd7 = new frd((byte)14, f07, z);
                frd7.y = y;
                return (f07)frd7;
            }
            case 13: {
                final frd frd8 = new frd((byte)13, f07, z);
                frd8.y = y;
                return (f07)frd8;
            }
            case 12: {
                return (f07)new frd(this.y, z, f07, (byte)12);
            }
            case 11: {
                return (f07)new frd(this.y, z, f07, (byte)11);
            }
            case 10: {
                return (f07)new frd(this.y, z, f07, (byte)10);
            }
            case 9: {
                return (f07)new frd(this.y, z, f07, (byte)9);
            }
            case 8: {
                return (f07)new frd(this.y, z, f07, (byte)8);
            }
            case 7: {
                final frd frd9 = new frd((byte)7, f07, z);
                frd9.y = y;
                return (f07)frd9;
            }
            case 6: {
                return (f07)new frd(this.y, z, f07, (byte)6);
            }
            case 5: {
                return (f07)new frd(this.y, z, f07, (byte)5);
            }
            case 4: {
                return (f07)new frd(this.y, z, f07, (byte)4);
            }
            case 3: {
                final frd frd10 = new frd((byte)3, f07, z);
                frd10.y = y;
                return (f07)frd10;
            }
            case 2: {
                return (f07)new frd(this.y, z, f07, (byte)2);
            }
            case 1: {
                return (f07)new frd(this.y, z, f07, (byte)1);
            }
            case 0: {
                return (f07)new frd(this.y, z, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, Object o2) {
        final byte w = this.w;
        final pc7 v = pc7.v;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 28: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 27: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 26: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 25: {
                final SessionId sessionId = (SessionId)o;
                final Object o3 = null;
                String a2;
                if (sessionId != null) {
                    a2 = sessionId.a;
                }
                else {
                    a2 = null;
                }
                final f07 f07 = (f07)o2;
                o2 = o3;
                if (a2 != null) {
                    o2 = new SessionId(a2);
                }
                return ((frd)this.create(o2, f07)).invokeSuspend(a);
            }
            case 24: {
                ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
                return v;
            }
            case 23: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 22: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 21: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 20: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 19: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 18: {
                ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
                return v;
            }
            case 17: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 16: {
                return ((frd)this.create(((Number)o).intValue(), (f07)o2)).invokeSuspend(a);
            }
            case 15: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 14: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 13: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 12: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 11: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 10: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 9: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 8: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 7: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 5: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
                return v;
            }
            case 3: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((frd)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        int n = 3;
        boolean b = false;
        Object a = lqo.a;
        final Object z = this.z;
        Object v = pc7.v;
        switch (w) {
            default: {
                final j0j j0j = (j0j)this.y;
                final View view = (View)z;
                final boolean x = this.x;
                Label_0214: {
                    if (!x) {
                        break Label_0214;
                    }
                    Label_0204: {
                        if (!x) {
                            break Label_0204;
                        }
                        Label_0273: {
                            try {
                                vt4.g0(o);
                                break Label_0273;
                            }
                            finally {
                                if (b3q.a(view) == j0j) {
                                    view.setTag(2131296323, (Object)null);
                                }
                                Object o2 = null;
                            Block_111_Outer:
                                while (true) {
                                    iftrue(Label_0273:)(o != v);
                                    o2 = v;
                                    return o2;
                                    while (true) {
                                        view.setTag(2131296323, (Object)null);
                                        o2 = a;
                                        return o2;
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        o2 = null;
                                        return o2;
                                        o2 = a;
                                        iftrue(Label_0297:)(b3q.a(view) != j0j);
                                        continue;
                                    }
                                    Label_0258: {
                                        o = a;
                                    }
                                    continue Block_111_Outer;
                                    vt4.g0(o);
                                    this.x = true;
                                    final apm w2 = j0j.w;
                                    o = new nw2(2, (f07)null, (byte)5);
                                    o = vt4.A((ija)w2, (zta)o, (f07)this);
                                    iftrue(Label_0258:)(o != v);
                                    continue Block_111_Outer;
                                }
                                Label_0297: {
                                    return o2;
                                }
                            }
                        }
                    }
                }
            }
            case 28: {
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
                    final ep0 ep0 = (ep0)this.y;
                    final krf krf = (krf)z;
                    this.x = true;
                    o = ljq.a0((jta)new gv4(krf, (byte)1)).a((jja)new wb0(ep0, (byte)28), (f07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 27: {
                final jja jja = (jja)this.y;
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
                    final ija data = ((ou7)((nvp)z).a.getValue()).getData();
                    this.y = null;
                    this.x = true;
                    if (x90.t(jja, data, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 26: {
                final crp crp = (crp)this.y;
                final boolean x4 = this.x;
                if (x4) {
                    if (!x4) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final o10 i = crp.i;
                    this.x = true;
                    if (i.d(z, (Object)this) == v) {
                        return v;
                    }
                }
                Object o3 = a;
                if (!(boolean)crp.g.b(z)) {
                    crp.a(z, false, (grp)erp.a);
                    o3 = a;
                }
                return o3;
            }
            case 25: {
                final String s = (String)this.y;
                final boolean x5 = this.x;
                if (x5) {
                    if (x5) {
                        throw ge9.w(o);
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    a = null;
                }
                else {
                    vt4.g0(o);
                    if (s != null) {
                        final gep gep = (gep)z;
                        final String d = q2r.d(s);
                        this.y = null;
                        this.x = true;
                        gep.b(d, (h07)this);
                        a = v;
                    }
                }
                return a;
            }
            case 24: {
                final qno qno = (qno)z;
                final oc7 oc7 = (oc7)this.y;
                final boolean x6 = this.x;
                Label_0890: {
                    if (x6) {
                        if (x6) {
                            vt4.g0(o);
                            break Label_0890;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        rhc.G(oc7, (hc7)null, 0, (zta)new lno(qno, (f07)null, (byte)0), 3);
                        rhc.G(oc7, (hc7)null, 0, (zta)new lno(qno, (f07)null, (byte)1), 3);
                        rhc.G(oc7, (hc7)null, 0, (zta)new lno(qno, (f07)null, (byte)2), 3);
                        final apm h = qno.h;
                        final v8n v8n = new v8n((byte)10, (f07)null, (Object)qno);
                        this.y = null;
                        this.x = true;
                        if (x90.r((ija)h, (zta)v8n, (f07)this) == v) {
                            return v;
                        }
                        break Label_0890;
                    }
                    v = null;
                    return v;
                }
                en9.q("SharedFlow never completes, this call should never return.");
                return null;
            }
            case 23: {
                final jta jta = (jta)z;
                final boolean x7 = this.x;
                Label_0989: {
                    if (x7) {
                        Label_0937: {
                            if (x7) {
                                Label_1005: {
                                    try {
                                        vt4.g0(o);
                                        break Label_0989;
                                    }
                                    finally {
                                        break Label_1005;
                                    }
                                    break Label_0937;
                                }
                                jta.a();
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                    final dho dho = (dho)this.y;
                    this.x = true;
                    if ((o = dho.b((h07)this)) == v) {
                        a = v;
                        return a;
                    }
                }
                final Set set = (Set)o;
                jta.a();
                return a;
            }
            case 22: {
                final cmc cmc = (cmc)z;
                final boolean x8 = this.x;
                Label_1102: {
                    if (x8) {
                        Label_1050: {
                            if (x8) {
                                Label_1116: {
                                    try {
                                        vt4.g0(o);
                                        break Label_1102;
                                    }
                                    finally {
                                        break Label_1116;
                                    }
                                    break Label_1050;
                                }
                                cmc.a();
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                    final cho cho = (cho)this.y;
                    this.x = true;
                    if ((o = cho.c((h07)this)) == v) {
                        a = v;
                        return a;
                    }
                }
                final Set set2 = (Set)o;
                cmc.a();
                return a;
            }
            case 21: {
                final boolean x9 = this.x;
                if (x9) {
                    if (x9) {
                        vt4.g0(o);
                        v = o;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final aeo aeo = (aeo)this.y;
                    final dho dho2 = (dho)z;
                    this.x = true;
                    o = dho2.a((vfh)aeo, (h07)this);
                    if (o != v) {
                        v = o;
                    }
                }
                return v;
            }
            case 20: {
                final boolean x10 = this.x;
                if (x10) {
                    if (x10) {
                        vt4.g0(o);
                        v = o;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final zdo zdo = (zdo)this.y;
                    final cho cho2 = (cho)z;
                    this.x = true;
                    o = cho2.a((ufh)zdo, (h07)this);
                    if (o != v) {
                        v = o;
                    }
                }
                return v;
            }
            case 19: {
                final hjn hjn = (hjn)z;
                final boolean x11 = this.x;
                if (x11) {
                    if (x11) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final oc7 oc8 = (oc7)this.y;
                    final n6k a2 = ljq.a0((jta)new wfk((Object)hjn, (byte)15));
                    final hb4 hb4 = new hb4(hjn, oc8);
                    this.x = true;
                    if (a2.a((jja)hb4, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 18: {
                final boolean x12 = this.x;
                if (x12) {
                    if (x12) {
                        throw ge9.w(o);
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    v = null;
                }
                else {
                    vt4.g0(o);
                    final yhn yhn = (yhn)this.y;
                    final djh djh = new djh((Object)yhn, (Object)z, (f07)null, (byte)10);
                    this.x = true;
                    sbh.b((pbh)yhn, (zta)djh, (h07)this);
                }
                return v;
            }
            case 17: {
                final boolean x13 = this.x;
                if (x13) {
                    if (x13) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final zta zta = (zta)this.y;
                    final wom wom = (wom)z;
                    this.x = true;
                    if (zta.d((Object)wom, (Object)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 16: {
                final y3j y3j = (y3j)z;
                final crm crm = (crm)this.y;
                final boolean x14 = this.x;
                if (x14) {
                    if (!x14) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final ksg d2 = crm.d;
                    final ksg e = crm.e;
                    final float n2 = ((qs8)e.getValue()).v + ((qs8)d2.getValue()).v;
                    crm.d.setValue((Object)new qs8(0.0f));
                    e.setValue((Object)new qs8(n2));
                    if (!qs8.e(n2, 0.0f)) {
                        final elo g = yi2.g;
                        final qs8 qs8 = new qs8(n2);
                        final qs8 qs9 = new qs8(0.0f);
                        final qs8 qs10 = new qs8(y3j.v);
                        final ygm a3 = frm.a;
                        final txf txf = new txf((Object)crm, (Object)y3j, (byte)12);
                        this.x = true;
                        if (uoo.m(g, (Comparable)qs8, (Comparable)qs9, (Comparable)qs10, (cg0)a3, (zta)txf, (h07)this) == v) {
                            a = v;
                            return a;
                        }
                    }
                }
                y3j.v = 0.0f;
                return a;
            }
            case 15: {
                final uom uom = (uom)z;
                final boolean x15 = this.x;
                if (x15) {
                    if (x15) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final xtm xtm = (xtm)((s10)this.y).w.w;
                    final us4 a4 = v4j.a((Class)s7n.class);
                    final knk knk = new knk(2, (Object)uom, (Class)uom.class, "runningUpdate", "runningUpdate(Lcom/segment/analytics/kotlin/core/System;)V", 4, (byte)1);
                    this.x = true;
                    if (xtm.f((s1n)uom, a4, true, (ic7)vo8.a, (zta)knk, (h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 14: {
                final zjm zjm = (zjm)this.y;
                final boolean x16 = this.x;
                if (x16) {
                    if (x16) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final d d3 = (d)z;
                    zjm.getClass();
                    final ejm ejm = (ejm)zjm;
                    this.y = null;
                    this.x = true;
                    if (d3.L(ejm, (h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 13: {
                final oc7 y = (oc7)this.y;
                final boolean x17 = this.x;
                Label_2102: {
                    if (x17) {
                        if (x17) {
                            vt4.g0(o);
                            break Label_2102;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        final e9m e9m = new e9m(2, (f07)null, (byte)0);
                        this.y = y;
                        this.x = true;
                        if ((o = r6k.j0(5000L, (zta)e9m, (f07)this)) == v) {
                            return v;
                        }
                        break Label_2102;
                    }
                    v = null;
                    return v;
                }
                final InetAddress inetAddress = (InetAddress)o;
                if (inetAddress != null) {
                    Label_2376: {
                        Label_2351: {
                            byte[] array;
                            try {
                                array = new byte[48];
                                array[0] = 27;
                                final Object o4;
                                v = (o4 = new DatagramSocket());
                                final int n3 = 5000;
                                ((DatagramSocket)o4).setSoTimeout(n3);
                                final Object o5 = v;
                                final InetAddress inetAddress2 = inetAddress;
                                final int n4 = 123;
                                ((DatagramSocket)o5).connect(inetAddress2, n4);
                                final long n5 = System.currentTimeMillis();
                                final long n6 = SystemClock.elapsedRealtime();
                                final DatagramPacket datagramPacket = new(java.net.DatagramPacket.class)();
                                final DatagramPacket datagramPacket3;
                                final DatagramPacket datagramPacket2 = datagramPacket3 = datagramPacket;
                                final byte[] array2 = array;
                                final int n7 = 48;
                                new DatagramPacket(array2, n7);
                                final Object o6 = v;
                                final DatagramPacket datagramPacket4 = datagramPacket2;
                                ((DatagramSocket)o6).send(datagramPacket4);
                                final DatagramPacket datagramPacket5 = new(java.net.DatagramPacket.class)();
                                final DatagramPacket datagramPacket7;
                                final DatagramPacket datagramPacket6 = datagramPacket7 = datagramPacket5;
                                final byte[] array3 = array;
                                final int n8 = 48;
                                new DatagramPacket(array3, n8);
                                final Object o7 = v;
                                final DatagramPacket datagramPacket8 = datagramPacket6;
                                ((DatagramSocket)o7).receive(datagramPacket8);
                                final long n9 = SystemClock.elapsedRealtime();
                                final long n11;
                                final long n10 = n11 = n9;
                                final long n12 = n6;
                                final long n13 = n11 - n12;
                                final long n14 = n5;
                                final long n15 = n13 + n14;
                                final byte[] array4 = array;
                                final int n16 = 0;
                                final byte b2 = array4[n16];
                                final byte[] array5 = array;
                                final int n17 = 1;
                                final byte b3 = array5[n17];
                                final int n18 = 255;
                                final int n19 = b3 & n18;
                                final byte b4 = b2;
                                final byte b5 = 7;
                                final int n20 = b4 & b5;
                                final int n21 = 4;
                                if (n20 != n21) {
                                    break Label_2351;
                                }
                                final xgc xgc = f9m.a;
                                final xgc xgc3;
                                final xgc xgc2 = xgc3 = xgc;
                                final int n22 = ((vgc)xgc3).v;
                                final int n23 = n19;
                                final vgc vgc = (vgc)xgc2;
                                final int n24 = vgc.w;
                                if (n23 > n24) {
                                    break Label_2351;
                                }
                                final int n25 = n22;
                                final int n26 = n19;
                                if (n25 <= n26) {
                                    final byte[] array6 = array;
                                    final int n27 = 32;
                                    final long n28 = f9m.a(array6, n27);
                                    final byte[] array7 = array;
                                    final int n29 = 40;
                                    final long n30 = f9m.a(array7, n29);
                                    final long n32;
                                    final long n31 = n32 = n30;
                                    final long n33 = n15;
                                    final long n34 = n32 - n33;
                                    final long n35 = n28;
                                    final long n36 = n5;
                                    final long n37 = n35 - n36;
                                    final long n38 = n34 + n37;
                                    final long n39 = 2L;
                                    final long n40 = n38 / n39;
                                    final g9m g9m = new(g9m.class)();
                                    final g9m g9m2;
                                    o = (g9m2 = g9m);
                                    final long n41 = n15;
                                    final long n42 = n40;
                                    final long n43 = n41 + n42;
                                    final long n44 = n10;
                                    final long n45 = n40;
                                    final long n46 = n15;
                                    final long n47 = n5;
                                    final long n48 = n46 - n47;
                                    final long n49 = n31;
                                    final long n50 = n28;
                                    final long n51 = n49 - n50;
                                    final long n52 = n48 - n51;
                                    new g9m(n43, n44, n45, n52);
                                    final Object o8 = v;
                                    ((DatagramSocket)o8).close();
                                    break Label_2351;
                                }
                                break Label_2351;
                            }
                            finally {
                                break Label_2351;
                            }
                            try {
                                final Object o4 = v;
                                final int n3 = 5000;
                                ((DatagramSocket)o4).setSoTimeout(n3);
                                final Object o5 = v;
                                final InetAddress inetAddress2 = inetAddress;
                                final int n4 = 123;
                                ((DatagramSocket)o5).connect(inetAddress2, n4);
                                final long n5 = System.currentTimeMillis();
                                final long n6 = SystemClock.elapsedRealtime();
                                final DatagramPacket datagramPacket = new(java.net.DatagramPacket.class)();
                                final DatagramPacket datagramPacket3;
                                final DatagramPacket datagramPacket2 = datagramPacket3 = datagramPacket;
                                final byte[] array2 = array;
                                final int n7 = 48;
                                new DatagramPacket(array2, n7);
                                final Object o6 = v;
                                final DatagramPacket datagramPacket4 = datagramPacket2;
                                ((DatagramSocket)o6).send(datagramPacket4);
                                final DatagramPacket datagramPacket5 = new(java.net.DatagramPacket.class)();
                                final DatagramPacket datagramPacket7;
                                final DatagramPacket datagramPacket6 = datagramPacket7 = datagramPacket5;
                                final byte[] array3 = array;
                                final int n8 = 48;
                                new DatagramPacket(array3, n8);
                                final Object o7 = v;
                                final DatagramPacket datagramPacket8 = datagramPacket6;
                                ((DatagramSocket)o7).receive(datagramPacket8);
                                final long n9 = SystemClock.elapsedRealtime();
                                final long n11;
                                final long n10 = n11 = n9;
                                final long n12 = n6;
                                final long n13 = n11 - n12;
                                final long n14 = n5;
                                final long n15 = n13 + n14;
                                final byte[] array4 = array;
                                final int n16 = 0;
                                final byte b2 = array4[n16];
                                final byte[] array5 = array;
                                final int n17 = 1;
                                final byte b3 = array5[n17];
                                final int n18 = 255;
                                final int n19 = b3 & n18;
                                final byte b4 = b2;
                                final byte b5 = 7;
                                final int n20 = b4 & b5;
                                final int n21 = 4;
                                if (n20 != n21) {
                                    break Label_2351;
                                }
                                final xgc xgc = f9m.a;
                                final xgc xgc3;
                                final xgc xgc2 = xgc3 = xgc;
                                final int n22 = ((vgc)xgc3).v;
                                final int n23 = n19;
                                final vgc vgc = (vgc)xgc2;
                                final int n24 = vgc.w;
                                if (n23 > n24) {
                                    break Label_2351;
                                }
                                final int n25 = n22;
                                final int n26 = n19;
                                if (n25 <= n26) {
                                    final byte[] array6 = array;
                                    final int n27 = 32;
                                    final long n28 = f9m.a(array6, n27);
                                    final byte[] array7 = array;
                                    final int n29 = 40;
                                    final long n30 = f9m.a(array7, n29);
                                    final long n32;
                                    final long n31 = n32 = n30;
                                    final long n33 = n15;
                                    final long n34 = n32 - n33;
                                    final long n35 = n28;
                                    final long n36 = n5;
                                    final long n37 = n35 - n36;
                                    final long n38 = n34 + n37;
                                    final long n39 = 2L;
                                    final long n40 = n38 / n39;
                                    final g9m g9m = new(g9m.class)();
                                    final g9m g9m2;
                                    o = (g9m2 = g9m);
                                    final long n41 = n15;
                                    final long n42 = n40;
                                    final long n43 = n41 + n42;
                                    final long n44 = n10;
                                    final long n45 = n40;
                                    final long n46 = n15;
                                    final long n47 = n5;
                                    final long n48 = n46 - n47;
                                    final long n49 = n31;
                                    final long n50 = n28;
                                    final long n51 = n49 - n50;
                                    final long n52 = n48 - n51;
                                    new g9m(n43, n44, n45, n52);
                                    final Object o8 = v;
                                    ((DatagramSocket)o8).close();
                                    break Label_2351;
                                }
                                break Label_2351;
                            }
                            finally {
                                try {}
                                finally {
                                    zn2.r((Closeable)v, (Throwable)o);
                                }
                                ((DatagramSocket)v).close();
                                o = null;
                                break Label_2376;
                            }
                        }
                        o = new jpj((Throwable)o);
                    }
                    if (!(o instanceof jpj)) {
                        v = o;
                        return v;
                    }
                }
                return null;
            }
            case 12: {
                final q6m q6m = (q6m)this.y;
                final boolean x18 = this.x;
                Label_2658: {
                    if (x18) {
                        if (x18) {
                            vt4.g0(o);
                            break Label_2658;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        Object o9 = a;
                        if (q6m == null) {
                            return o9;
                        }
                        final u6m u6m = (u6m)q6m;
                        final r6m duration = u6m.b().getDuration();
                        if (u6m.b().b() != null) {
                            b = true;
                        }
                        final i4 i2 = (i4)z;
                        final int ordinal = ((Enum)duration).ordinal();
                        final long n53 = Long.MAX_VALUE;
                        long n54;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    en9.r();
                                    return null;
                                }
                                n54 = Long.MAX_VALUE;
                            }
                            else {
                                n54 = 10000L;
                            }
                        }
                        else {
                            n54 = 4000L;
                        }
                        if (i2 != null) {
                            final AccessibilityManager a5 = ((x30)i2).a;
                            if (n54 < 2147483647L) {
                                if (b) {
                                    n = 7;
                                }
                                if (Build$VERSION.SDK_INT >= 29) {
                                    final int g2 = bi0.g(a5, (int)n54, n);
                                    if (g2 == Integer.MAX_VALUE) {
                                        n54 = n53;
                                    }
                                    else {
                                        n54 = g2;
                                    }
                                }
                                else if (b && a5.isTouchExplorationEnabled()) {
                                    n54 = n53;
                                }
                            }
                        }
                        this.x = true;
                        if (ach.A(n54, (f07)this) == v) {
                            o9 = v;
                            return o9;
                        }
                        break Label_2658;
                    }
                    return null;
                }
                ((u6m)q6m).a();
                return a;
            }
            case 11: {
                final boolean x19 = this.x;
                if (x19) {
                    if (x19) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ija u = soh.u((ija)new cd0(yi2.r((ija)((kd)this.y).y, ach.i0(c0k.d)), (byte)7));
                    final wb0 wb0 = new wb0(z, (byte)20);
                    this.x = true;
                    if (u.a((jja)wb0, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 10: {
                final lnk lnk = (lnk)z;
                final boolean x20 = this.x;
                if (x20) {
                    if (x20) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final xtm xtm2 = (xtm)((s10)this.y).w.w;
                    final us4 a6 = v4j.a((Class)s7n.class);
                    final knk knk2 = new knk(2, (Object)lnk, (Class)lnk.class, "onEnableToggled", "onEnableToggled$core(Lcom/segment/analytics/kotlin/core/System;)V", 4, (byte)0);
                    this.x = true;
                    if (xtm2.f((s1n)lnk, a6, true, (ic7)vo8.a, (zta)knk2, (h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 9: {
                final boolean x21 = this.x;
                if (x21) {
                    if (x21) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final jq8 v2 = soh.v(yi2.r((ija)((kd)this.y).y, ach.i0(c0k.d)), (lta)new drj((byte)7), (zta)soh.i);
                    final wb0 wb2 = new wb0(z, (byte)19);
                    this.x = true;
                    if (v2.a((jja)wb2, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 8: {
                final boolean x22 = this.x;
                if (x22) {
                    if (x22) {
                        vt4.g0(o);
                        v = o;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final quj quj = (quj)this.y;
                    final zta zta2 = (zta)z;
                    this.x = true;
                    o = quj.i(false, zta2, (h07)this);
                    if (o != v) {
                        v = o;
                    }
                }
                return v;
            }
            case 7: {
                final boolean x23 = this.x;
                if (x23) {
                    if (x23) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final oc7 oc9 = (oc7)this.y;
                    final ArrayList list = new ArrayList();
                    o = new Object();
                    final Object o10 = new Object();
                    final ma0 ma0 = (ma0)z;
                    final bsl a7 = ma0.J.a;
                    final w4g w4g = new w4g((x3j)o10, ma0, list, (b4j)o, oc9);
                    this.x = true;
                    a7.a((jja)w4g, (f07)this);
                    a = v;
                }
                return a;
            }
            case 6: {
                final boolean x24 = this.x;
                if (x24) {
                    if (x24) {
                        vt4.g0(o);
                        v = o;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final zta zta3 = (zta)this.y;
                    final xug xug = (xug)z;
                    this.x = true;
                    o = zta3.d((Object)xug, (Object)this);
                    if (o != v) {
                        v = o;
                    }
                }
                return v;
            }
            case 5: {
                final boolean x25 = this.x;
                if (x25) {
                    if (!x25) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    this.x = true;
                    if (ach.A(1000L, (f07)this) == v) {
                        a = v;
                        return a;
                    }
                }
                final krd c = krd.c();
                final int a8 = n4q.a;
                c.getClass();
                ((jrh)z).e((Object)new lv6(7));
                return a;
            }
            case 4: {
                final boolean x26 = this.x;
                Label_3506: {
                    if (x26) {
                        if (x26) {
                            vt4.g0(o);
                            break Label_3506;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        final yom yom = (yom)this.y;
                        final wb0 wb3 = new wb0(z, (byte)15);
                        this.x = true;
                        if (((ija)yom).a((jja)wb3, (f07)this) == v) {
                            return v;
                        }
                        break Label_3506;
                    }
                    v = null;
                    return v;
                }
                ebq.a();
                return null;
            }
            case 3: {
                final btg btg = (btg)this.y;
                final boolean x27 = this.x;
                if (x27) {
                    if (x27) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final pfe pfe = (pfe)z;
                    final zka zka = new zka((Object)pfe.n.x, (ija)ljq.a0((jta)new kfe(pfe, btg, (byte)1)), (bua)new ofe(), (byte)1);
                    final q16 q16 = new q16((byte)9);
                    this.y = null;
                    this.x = true;
                    if (vt4.A((ija)zka, (zta)q16, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 2: {
                final boolean x28 = this.x;
                if (x28) {
                    if (x28) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ija ija = (ija)this.y;
                    final wb0 wb4 = new wb0(z, (byte)12);
                    this.x = true;
                    if (ija.a((jja)wb4, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 1: {
                final boolean x29 = this.x;
                if (x29) {
                    if (x29) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final cd0 cd0 = new cd0((ija)((vn0)this.y).x, (byte)5);
                    final wb0 wb5 = new wb0(z, (byte)11);
                    this.x = true;
                    if (cd0.a((jja)wb5, (f07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 0: {
                final boolean x30 = this.x;
                if (x30) {
                    if (x30) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ede ede = (ede)this.y;
                    final n6k a9 = ljq.a0((jta)new erd((l9o)z, (byte)0));
                    this.x = true;
                    ede.getClass();
                    o = x90.r((ija)a9, (zta)new m10((byte)2, (f07)null, (Object)ede), (f07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        a = v;
                    }
                }
                return a;
            }
        }
    }
}
