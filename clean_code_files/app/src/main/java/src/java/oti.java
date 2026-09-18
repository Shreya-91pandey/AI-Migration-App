import android.view.View;
import java.util.concurrent.CancellationException;
import coil3.request.NullRequestDataException;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import java.util.List;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.io.File;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class oti implements p2c
{
    public static final int f = 0;
    public final lti a;
    public final fz6 b;
    public final jmq c;
    public final se6 d;
    public volatile int e;
    
    static {
        AtomicIntegerFieldUpdater.newUpdater((Class)oti.class, "e");
    }
    
    public oti(final lti a) {
        this.a = a;
        this.b = ien.a(uuj.s0((hc7)omo.o(), (hc7)new uw4((gc7)o55.x, (byte)2)));
        final Object o = new Object();
        ((gb0)o).w = new WeakReference((Object)this);
        ((gb0)o).x = new fb0((gb0)o, this);
        ((gb0)o).y = new i70(o, (byte)2);
        final jmq c = new jmq(this);
        this.c = c;
        final uy7 uy7 = new uy7(a.g);
        final ArrayList list = (ArrayList)uy7.v;
        final ArrayList list2 = (ArrayList)uy7.y;
        final ArrayList list3 = (ArrayList)uy7.x;
        final ArrayList list4 = (ArrayList)uy7.z;
        final f3c b = a.b;
        Object o2;
        if ((o2 = b.n.a.get((Object)q2c.a)) == null) {
            o2 = Boolean.TRUE;
        }
        if (o2) {
            list2.add((Object)new lih((byte)8));
            list4.add((Object)new lih((byte)9));
        }
        uy7.z(new kc0((byte)0), v4j.a((Class)Uri.class));
        uy7.z(new kc0((byte)3), v4j.a((Class)Integer.class));
        list3.add((Object)new yog((Object)new la0((byte)0), (Object)v4j.a((Class)uyo.class)));
        uy7.A((l8a)new k71((byte)0), v4j.a((Class)uyo.class));
        uy7.A((l8a)new k71((byte)4), v4j.a((Class)uyo.class));
        uy7.A((l8a)new k71((byte)9), v4j.a((Class)uyo.class));
        uy7.A((l8a)new k71((byte)6), v4j.a((Class)Drawable.class));
        final o3a a2 = r2c.a;
        Object o3;
        if ((o3 = b.n.a.get((Object)r2c.a)) == null) {
            o3 = 4;
        }
        final int intValue = ((Number)o3).intValue();
        final int a3 = otk.a;
        final mtk mtk = new mtk(intValue);
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object a4 = cv9.a;
        if (sdk_INT >= 29) {
            Object o4;
            if ((o4 = b.n.a.get((Object)r2c.c)) == null) {
                o4 = Boolean.TRUE;
            }
            if (o4) {
                Object value;
                if ((value = b.n.a.get((Object)r2c.b)) == null) {
                    value = a4;
                }
                if (((cv9)value).equals(a4)) {
                    list4.add((Object)new re6((u18)new vpm((ntk)mtk), (byte)0));
                }
            }
        }
        final Object value2 = b.n.a.get((Object)r2c.b);
        if (value2 != null) {
            a4 = value2;
        }
        list4.add((Object)new re6((u18)new vd2((ntk)mtk, (cv9)a4), (byte)0));
        uy7.z(new kc0((byte)1), v4j.a((Class)File.class));
        uy7.A((l8a)new k71((byte)8), v4j.a((Class)uyo.class));
        uy7.A((l8a)new k71((byte)3), v4j.a((Class)ByteBuffer.class));
        uy7.z(new kc0((byte)4), v4j.a((Class)String.class));
        uy7.z(new kc0((byte)2), v4j.a((Class)fvg.class));
        list3.add((Object)new yog((Object)new la0((byte)1), (Object)v4j.a((Class)uyo.class)));
        list3.add((Object)new yog((Object)new la0((byte)2), (Object)v4j.a((Class)uyo.class)));
        uy7.A((l8a)new k71((byte)7), v4j.a((Class)uyo.class));
        uy7.A((l8a)new k71((byte)2), v4j.a((Class)byte[].class));
        uy7.A((l8a)new k71((byte)5), v4j.a((Class)uyo.class));
        uy7.A((l8a)new k71((byte)1), v4j.a((Class)Bitmap.class));
        list.add((Object)new fb9(this, (gb0)o, c));
        this.d = new se6(qt7.R((List)list), qt7.R((List)uy7.w), qt7.R((List)list3), qt7.R((List)list2), qt7.R((List)list4));
    }
    
    public final Object a(i3c w, int z, h07 v) {
        while (true) {
            Label_0043: {
                if (!(v instanceof nti)) {
                    break Label_0043;
                }
                Object o = v;
                final int c = ((nti)o).C;
                if ((c & Integer.MIN_VALUE) == 0x0) {
                    break Label_0043;
                }
                ((nti)o).C = c + Integer.MIN_VALUE;
                Object o2 = ((nti)o).A;
                final int c2 = ((nti)o).C;
                final pc7 v2 = pc7.v;
                Object y = null;
                Label_1501: {
                    Object x = null;
                    Label_1400: {
                        Label_1091: {
                            final i3c i3c;
                            while (true) {
                                Label_0292: {
                                    if (c2 == 0) {
                                        break Label_0292;
                                    }
                                    Label_0226: {
                                        if (c2 == 1) {
                                            z = ((nti)o).z;
                                            v = (h07)((nti)o).x;
                                            y = ((nti)o).w;
                                            final cfj v3 = ((nti)o).v;
                                            try {
                                                vt4.g0(o2);
                                                w = (i3c)y;
                                            }
                                            finally {
                                                x = v3;
                                                break Label_0226;
                                            }
                                            break Label_0292;
                                        }
                                        if (c2 != 2) {
                                            if (c2 == 3) {
                                                final Object x2 = ((nti)o).x;
                                                final i3c w2 = ((nti)o).w;
                                                final cfj v4 = ((nti)o).v;
                                                v = (h07)x2;
                                                x = w2;
                                                y = v4;
                                                try {
                                                    vt4.g0(o2);
                                                    final Object f0 = o2;
                                                    o = x2;
                                                    o2 = w2;
                                                    break Label_1091;
                                                }
                                                finally {
                                                    break Label_1400;
                                                }
                                            }
                                            en9.q("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        z = ((nti)o).z;
                                        final a1c y2 = ((nti)o).y;
                                        x = ((nti)o).x;
                                        y = ((nti)o).w;
                                        w = (i3c)((nti)o).v;
                                        try {
                                            vt4.g0(o2);
                                            break Label_1091;
                                        }
                                        finally {
                                            v = (h07)x;
                                            x = w;
                                            w = i3c;
                                        }
                                    }
                                    final h07 h07 = (h07)y;
                                    y = x;
                                    x = h07;
                                    break Label_1400;
                                }
                                vt4.g0(o2);
                                final opc x3 = x90.x(((f07)o).getContext());
                                final boolean b = z == 0;
                                final jmq c3 = this.c;
                                c3.getClass();
                                final oti oti = (oti)c3.w;
                                final icn w3 = w.w();
                                if (w3 instanceof gxa) {
                                    vad vad;
                                    if ((vad = l3c.g(w)) == null) {
                                        vad = jmq.u(w);
                                    }
                                    v = (h07)new qdp(oti, w, (gxa)w3, vad, x3);
                                }
                                else {
                                    vad vad2;
                                    if ((vad2 = l3c.g(w)) == null) {
                                        if (b) {
                                            vad2 = jmq.u(w);
                                        }
                                        else {
                                            vad2 = null;
                                        }
                                    }
                                    if (vad2 != null) {
                                        v = (h07)new lbd(vad2, x3);
                                    }
                                    else {
                                        v = (h07)lw1.d(x3);
                                    }
                                }
                                ((cfj)v).b();
                                final e3c x4 = i3c.x(w);
                                x4.c(oti.a.b);
                                Object o3;
                                if ((o3 = w.g().c()) == null) {
                                    Label_0571: {
                                        if (w.w() instanceof gxa) {
                                            final View view = ((gxa)w.w()).getView();
                                            if (view instanceof ImageView) {
                                                final ImageView$ScaleType scaleType = ((ImageView)view).getScaleType();
                                                if (scaleType == ImageView$ScaleType.CENTER || scaleType == ImageView$ScaleType.MATRIX) {
                                                    o3 = m0m.n;
                                                    break Label_0571;
                                                }
                                            }
                                            o3 = ger.f(view);
                                        }
                                        else {
                                            o3 = m0m.n;
                                        }
                                    }
                                    x4.i((m0m)o3);
                                }
                                if (w.g().b() == null) {
                                    final icn w4 = w.w();
                                    gxa gxa;
                                    if (w4 instanceof gxa) {
                                        gxa = (gxa)w4;
                                    }
                                    else {
                                        gxa = null;
                                    }
                                    Object view2;
                                    if (gxa != null) {
                                        view2 = gxa.getView();
                                    }
                                    else {
                                        view2 = null;
                                    }
                                    ImageView imageView;
                                    if (view2 instanceof ImageView) {
                                        imageView = (ImageView)view2;
                                    }
                                    else {
                                        imageView = null;
                                    }
                                    z9k z9k;
                                    if (imageView != null) {
                                        z9k = k5p.c(imageView);
                                    }
                                    else {
                                        z9k = w.u();
                                    }
                                    x4.h(z9k);
                                }
                                if (w.g().a() == 0) {
                                    int n;
                                    if ((w.g().c() != null || !mlc.q(o3, (Object)m0m.n)) && (!(w.w() instanceof gxa) || !(o3 instanceof iui) || !(((gxa)w.w()).getView() instanceof ImageView) || ((gxa)w.w()).getView() != ((iui)o3).d())) {
                                        n = 1;
                                    }
                                    else {
                                        n = 2;
                                    }
                                    x4.g(n);
                                }
                                x = x4.a();
                                w = (i3c)zyo.B;
                                try {
                                    if (((i3c)x).d().equals(h3g.a)) {
                                        throw new NullRequestDataException();
                                    }
                                    ((cfj)v).start();
                                    if (z == 0) {
                                        ((nti)o).v = (cfj)v;
                                        ((nti)o).w = (i3c)x;
                                        ((nti)o).x = (zyo)w;
                                        ((nti)o).z = z;
                                        ((nti)o).C = 1;
                                        if (((cfj)v).a((nti)o) == v2) {
                                            return v2;
                                        }
                                    }
                                }
                                finally {
                                    y = v;
                                    v = (h07)w;
                                    final i3c i3c2;
                                    w = i3c2;
                                    break Label_1400;
                                }
                                final i3c i3c3 = w;
                                w = (i3c)x;
                                x = i3c3;
                                i3c i3c4 = null;
                                Label_0979: {
                                    try {
                                        final vse s = w.s();
                                        if (s != null) {
                                            final sti c4 = this.c();
                                            if (c4 != null) {
                                                final wse a = c4.a(s);
                                                if (a != null) {
                                                    a.b();
                                                    break Label_0979;
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        i3c4 = w;
                                        y = v;
                                        final i3c i3c5;
                                        w = i3c5;
                                        v = (h07)x;
                                        x = i3c4;
                                        break Label_1400;
                                    }
                                    y = null;
                                }
                                final icn w5 = w.w();
                                if (w5 != null) {
                                    Object y3;
                                    if (y == null) {
                                        y3 = w.y();
                                    }
                                    else {
                                        y3 = y;
                                    }
                                    w5.onStart((a1c)y3);
                                }
                                x.getClass();
                                final m0m v5 = w.v();
                                ((nti)i3c4).v = (cfj)v;
                                ((nti)i3c4).w = w;
                                ((nti)i3c4).x = (zyo)x;
                                ((nti)i3c4).y = (a1c)y;
                                ((nti)i3c4).z = z;
                                ((nti)i3c4).C = 2;
                                o2 = v5.c((f07)i3c4);
                                if (o2 == v2) {
                                    return v2;
                                }
                                continue;
                            }
                            while (true) {
                                try {
                                    final xzl xzl = (xzl)o2;
                                    x.getClass();
                                    final hc7 m = w.m();
                                    try {
                                        final kee kee = new kee((Object)w, (Object)this, (Object)xzl, x, y, (f07)null, (byte)5);
                                        ((nti)i3c).v = (cfj)v;
                                        ((nti)i3c).w = w;
                                        ((nti)i3c).x = (zyo)x;
                                        ((nti)i3c).y = null;
                                        ((nti)i3c).z = z;
                                        ((nti)i3c).C = 3;
                                        final Object f0 = rhc.f0(m, (zta)kee, (f07)i3c);
                                        if (f0 == v2) {
                                            return v2;
                                        }
                                        o2 = w;
                                        w = (i3c)v;
                                        o = x;
                                        v = (h07)o;
                                        x = o2;
                                        final p3c p3c = (p3c)f0;
                                        v = (h07)o;
                                        x = o2;
                                        if (p3c instanceof j3n) {
                                            v = (h07)o;
                                            x = o2;
                                            this.e((j3n)p3c, ((i3c)o2).w(), (zyo)o);
                                        }
                                        else {
                                            v = (h07)o;
                                            x = o2;
                                            if (!(p3c instanceof fi9)) {
                                                v = (h07)o;
                                                x = o2;
                                                v = (h07)o;
                                                x = o2;
                                                final RuntimeException ex = new RuntimeException();
                                                v = (h07)o;
                                                x = o2;
                                                throw ex;
                                            }
                                            v = (h07)o;
                                            x = o2;
                                            this.d((fi9)p3c, ((i3c)o2).w(), (zyo)o);
                                        }
                                        ((cfj)w).c();
                                        return p3c;
                                    }
                                    finally {}
                                    final i3c i3c6 = w;
                                    w = (i3c)y;
                                    v = (h07)x;
                                    x = i3c6;
                                    break Label_1400;
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                        throw new NullRequestDataException();
                        try {
                            if (!(w instanceof CancellationException)) {
                                a1c a1c;
                                if (w instanceof NullRequestDataException) {
                                    if ((a1c = ((i3c)x).b()) == null) {
                                        a1c = ((i3c)x).a();
                                    }
                                }
                                else {
                                    a1c = ((i3c)x).a();
                                }
                                final fi9 fi9 = new fi9(a1c, (i3c)x, (Throwable)w);
                                this.d(fi9, ((i3c)x).w(), (zyo)v);
                                ((cfj)y).c();
                                return fi9;
                            }
                        }
                        finally {
                            break Label_1501;
                        }
                    }
                    v.getClass();
                    x.getClass();
                    throw;
                }
                ((cfj)y).c();
            }
            Object o = new nti(this, v);
            continue;
        }
    }
    
    public final Object b(final i3c i3c, final h07 h07) {
        if (!(i3c.w() instanceof gxa) && !(i3c.v() instanceof iui) && l3c.g(i3c) == null) {
            return this.a(i3c, 1, h07);
        }
        return ien.m((f07)h07, (zta)new jzg((Object)this, (Object)i3c, (f07)null, (byte)8));
    }
    
    public final sti c() {
        return (sti)this.a.d.getValue();
    }
    
    public final void d(final fi9 fi9, final icn icn, final zyo zyo) {
        final i3c f = fi9.f();
        Label_0072: {
            if (!(icn instanceof ifo)) {
                if (icn == null) {
                    break Label_0072;
                }
            }
            else {
                final cfo a = l3c.h(fi9.f()).a((ifo)icn, (p3c)fi9);
                if (!(a instanceof pyf)) {
                    zyo.getClass();
                    a.a();
                    break Label_0072;
                }
            }
            icn.onError(fi9.a());
        }
        zyo.getClass();
        final h3c n = f.n();
        if (n != null) {
            n.j(fi9);
        }
    }
    
    public final void e(final j3n j3n, final icn icn, final zyo zyo) {
        final i3c f = j3n.f();
        Label_0072: {
            if (!(icn instanceof ifo)) {
                if (icn == null) {
                    break Label_0072;
                }
            }
            else {
                final cfo a = l3c.h(j3n.f()).a((ifo)icn, (p3c)j3n);
                if (!(a instanceof pyf)) {
                    zyo.getClass();
                    a.a();
                    break Label_0072;
                }
            }
            icn.onSuccess(j3n.a());
        }
        zyo.getClass();
        f.n();
    }
}
