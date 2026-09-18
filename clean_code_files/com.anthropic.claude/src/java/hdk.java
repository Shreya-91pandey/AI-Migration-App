import com.google.android.gms.common.internal.a;
import kotlinx.serialization.KSerializer;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResultGeocoded;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationError;
import android.location.Location;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationErrorErrorType;
import android.location.LocationManager;
import com.anthropic.claude.tool.model.UserLocationV0InputAccuracy;
import android.os.SystemClock;
import com.anthropic.claude.tool.model.UserLocationV0Input;
import android.content.Context;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class hdk implements gfi, mrf, vqc, t45, jg0, c1q, wcq, r8j, zgq
{
    public final Object v;
    
    public hdk(final byte b) {
        switch (b) {
            default: {
                this.v = new gb0();
                return;
            }
            case 12: {
                this.v = new ThreadLocal();
            }
        }
    }
    
    public hdk(final int n) {
        this.v = new ArrayList(n);
    }
    
    public hdk(final hcq hcq) {
        this.v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue(), (ThreadFactory)hcq);
    }
    
    public void a(final Object o) {
        ((ArrayList)this.v).add(o);
    }
    
    public void c(final Object o) {
        final ArrayList list = (ArrayList)this.v;
        if (o != null) {
            if (o instanceof Object[]) {
                final Object[] array = (Object[])o;
                if (array.length > 0) {
                    list.ensureCapacity(list.size() + array.length);
                    Collections.addAll((Collection)list, array);
                }
            }
            else {
                if (o instanceof Collection) {
                    list.addAll((Collection)o);
                    return;
                }
                if (o instanceof Iterable) {
                    final Iterator iterator = ((Iterable)o).iterator();
                    while (iterator.hasNext()) {
                        list.add(iterator.next());
                    }
                }
                else {
                    if (!(o instanceof Iterator)) {
                        final Class<?> class1 = o.getClass();
                        final StringBuilder sb = new StringBuilder("Don't know how to spread ");
                        sb.append((Object)class1);
                        throw new UnsupportedOperationException(sb.toString());
                    }
                    final Iterator iterator2 = (Iterator)o;
                    while (iterator2.hasNext()) {
                        list.add(iterator2.next());
                    }
                }
            }
        }
    }
    
    @Override
    public gnf d(final i1 i1) {
        return ((gb0)this.v).f((lta)i1);
    }
    
    public Object e(final Context v, final UserLocationV0Input w, final h07 h07) {
        final t2p t2p = (t2p)this.v;
        Object o = null;
        Label_0062: {
            if (h07 instanceof s2p) {
                final s2p s2p = (s2p)h07;
                final int g = s2p.G;
                if ((g & Integer.MIN_VALUE) != 0x0) {
                    s2p.G = g + Integer.MIN_VALUE;
                    o = s2p;
                    break Label_0062;
                }
            }
            o = new s2p(this, h07);
        }
        Object o2 = ((s2p)o).E;
        final int g2 = ((s2p)o).G;
        final pc7 v2 = pc7.v;
        while (true) {
            int b = 0;
            long a = 0L;
            o2h x = null;
            UserLocationV0Input w4 = null;
            Context v4 = null;
            Object p3 = null;
            Label_0723: {
                Context v3 = null;
                UserLocationV0Input w3 = null;
                Object d = null;
                Label_0358: {
                    double d2;
                    double c;
                    sdr z;
                    Double y;
                    if (g2 != 0) {
                        if (g2 == 1) {
                            b = ((s2p)o).B;
                            a = ((s2p)o).A;
                            final UserLocationV0Input w2 = ((s2p)o).w;
                            v3 = ((s2p)o).v;
                            vt4.g0(o2);
                            final o2h o2h = (o2h)o2;
                            w3 = w2;
                            d = o2h;
                            break Label_0358;
                        }
                        if (g2 == 2) {
                            b = ((s2p)o).B;
                            a = ((s2p)o).A;
                            x = ((s2p)o).x;
                            w4 = ((s2p)o).w;
                            v4 = ((s2p)o).v;
                            vt4.g0(o2);
                            p3 = o2;
                            break Label_0723;
                        }
                        if (g2 != 3) {
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d2 = ((s2p)o).D;
                        c = ((s2p)o).C;
                        z = ((s2p)o).z;
                        y = ((s2p)o).y;
                        vt4.g0(o2);
                    }
                    else {
                        vt4.g0(o2);
                        a = SystemClock.elapsedRealtime();
                        if (w.a == UserLocationV0InputAccuracy.x) {
                            b = 1;
                        }
                        else {
                            b = 0;
                        }
                        final LocationManager locationManager = (LocationManager)v.getSystemService((Class)LocationManager.class);
                        if (locationManager != null && !tpd.a(locationManager)) {
                            final UserLocationV0OutputUserLocationErrorErrorType z2 = UserLocationV0OutputUserLocationErrorErrorType.z;
                            t2p.B(w, (o2h)null, a, z2.a(), (Location)null, (m2p)null);
                            return sdr.j((Object)new UserLocationV0OutputUserLocationError(z2, "Location is turned off in the device settings."));
                        }
                        final xd f = t2p.f;
                        ((s2p)o).v = v;
                        ((s2p)o).w = w;
                        ((s2p)o).A = a;
                        ((s2p)o).B = b;
                        ((s2p)o).G = 1;
                        d = f.d((boolean)(b != 0), (h07)o);
                        if (d == v2) {
                            return v2;
                        }
                        w3 = w;
                        v3 = v;
                        break Label_0358;
                    }
                    final UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult = new UserLocationV0OutputUserLocationResult(y, (UserLocationV0OutputUserLocationResultGeocoded)o2, c, d2);
                    z.getClass();
                    return sdr.t((Object)userLocationV0OutputUserLocationResult);
                }
                final o2h x2 = (o2h)d;
                if (x2.a() == n2h.v) {
                    t2p.h = true;
                    final UserLocationV0OutputUserLocationErrorErrorType x3 = UserLocationV0OutputUserLocationErrorErrorType.x;
                    t2p.B(w3, x2, a, x3.a(), (Location)null, (m2p)null);
                    return sdr.j((Object)new UserLocationV0OutputUserLocationError(x3, "Location permission denied."));
                }
                final boolean b2 = b != 0;
                final n2h a2 = x2.a();
                ((s2p)o).v = v3;
                ((s2p)o).w = w3;
                ((s2p)o).x = x2;
                ((s2p)o).A = a;
                ((s2p)o).B = b;
                ((s2p)o).G = 2;
                final boolean b3 = a2 == n2h.w;
                final qc2 qc2 = new qc2();
                int n;
                if (b2 && !b3) {
                    n = 100;
                }
                else {
                    n = 102;
                }
                qc2.d(n);
                final long n2 = 30000L;
                long n3;
                if (b3) {
                    n3 = 600000L;
                }
                else {
                    n3 = 30000L;
                }
                qc2.c(n3);
                long n4 = n2;
                if (b3) {
                    n4 = 8000L;
                }
                qc2.b(n4);
                final hr7 a3 = qc2.a();
                final cvj cvj = new cvj((byte)13);
                final l13 l13 = new l13(1, ljq.K((f07)o));
                l13.r();
                final cgr f2 = vpd.a(v3).f(a3, cvj.C());
                final zzc zzc = new zzc((Object)new q6(l13, (byte)2));
                f2.getClass();
                f2.e((Executor)rcn.a, (a9g)zzc);
                f2.c((o8g)new zs2(l13, (byte)5));
                l13.v((lta)new gwb((Object)cvj, (byte)25));
                p3 = l13.p();
                if (p3 == v2) {
                    return v2;
                }
                v4 = v3;
                x = x2;
                w4 = w3;
            }
            final p2p p2p = (p2p)p3;
            final int b4 = idn.B(p2p);
            final n2h x4 = n2h.x;
            if (b4 != 0) {
                String s = "Location could not be determined: positioning returned no position.";
                if (b4 == 1) {
                    final int n5 = 1;
                    final UserLocationV0OutputUserLocationErrorErrorType a4 = UserLocationV0OutputUserLocationErrorErrorType.A;
                    int n6;
                    if (b != 0) {
                        n6 = n5;
                    }
                    else {
                        n6 = 0;
                    }
                    if (x.a() != x4) {
                        if (n6 != 0 && x.b()) {
                            s = "Precise location was not granted: Claude has approximate-only location access on this device, Android had no recent approximate position to return, and it does not compute a fresh one for approximate-only apps.";
                        }
                        else if (x.b() && Build$VERSION.SDK_INT >= 31) {
                            s = "The user chose approximate-only location access for Claude just now; Android had no recent approximate position to return, and it does not compute a fresh one for approximate-only apps.";
                        }
                        else {
                            s = "Claude has approximate-only location access on this device and Android had no recent position to return; Android does not compute a fresh position for approximate-only apps, only for apps with precise access.";
                        }
                    }
                    t2p.B(w4, x, a, a4.a(), (Location)null, (m2p)null);
                    return sdr.j((Object)new UserLocationV0OutputUserLocationError(a4, s));
                }
                if (b4 == 2) {
                    final UserLocationV0OutputUserLocationErrorErrorType a5 = UserLocationV0OutputUserLocationErrorErrorType.A;
                    t2p.B(w4, x, a, a5.a(), (Location)null, (m2p)p2p);
                    return sdr.j((Object)new UserLocationV0OutputUserLocationError(a5, "Location could not be determined: positioning returned no position."));
                }
                en9.r();
                return null;
            }
            else {
                final Location a6 = ((n2p)p2p).a();
                t2p.B(w4, x, a, "success", a6, (m2p)null);
                Location location = a6;
                if (b == 0) {
                    if (x.a() != x4) {
                        location = a6;
                    }
                    else {
                        location = new Location(a6);
                        location.setLatitude(ncq.m(Math.round(location.getLatitude() * 50.0) / 50.0, -90.0, 90.0));
                        double cos;
                        if ((cos = Math.cos(Math.toRadians(location.getLatitude()))) < 0.01) {
                            cos = 0.01;
                        }
                        final double n7 = cos * 50.0;
                        final double n8 = Math.round(location.getLongitude() * n7) / n7;
                        double n9;
                        if (n8 > 180.0) {
                            n9 = n8 - 360.0;
                        }
                        else {
                            n9 = n8;
                            if (n8 < -180.0) {
                                n9 = n8 + 360.0;
                            }
                        }
                        location.setLongitude(Math.round(n9 * 100000.0) / 100000.0);
                        location.setAccuracy(Math.max(location.getAccuracy(), 2000.0f));
                    }
                }
                final sdr p4 = sdr.P;
                final double c = location.getLatitude();
                final double d2 = location.getLongitude();
                Location location2;
                if (location.hasAccuracy()) {
                    location2 = location;
                }
                else {
                    location2 = null;
                }
                Double y2;
                if (location2 != null) {
                    y2 = new Double((double)location2.getAccuracy());
                }
                else {
                    y2 = null;
                }
                ((s2p)o).v = null;
                ((s2p)o).w = null;
                ((s2p)o).x = null;
                ((s2p)o).y = y2;
                ((s2p)o).z = p4;
                ((s2p)o).A = a;
                ((s2p)o).B = b;
                ((s2p)o).C = c;
                ((s2p)o).D = d2;
                ((s2p)o).G = 3;
                o2 = t2p.z(v4, location, (h07)o);
                if (o2 != v2) {
                    final Double y = y2;
                    final sdr z = p4;
                    continue;
                }
            }
            break;
        }
        return v2;
    }
    
    public void g() {
        final View view = (View)this.v;
        if (view != null) {
            ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
    
    @Override
    public Object get() {
        return new gdk((int)gdk.y, (Context)((gfi)this.v).get(), "com.google.android.datatransport.events");
    }
    
    @Override
    public mia get(final int n) {
        return (mia)this.v;
    }
    
    @Override
    public Object h(final jqc jqc, final KSerializer kSerializer, final qn2 qn2) {
        return ((cxm)this.v).c(jqc, kSerializer, qn2);
    }
    
    public void i() {
        final View view = (View)this.v;
        if (view != null) {
            View focus;
            if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                focus = view.getRootView().findFocus();
            }
            else {
                view.requestFocus();
                focus = view;
            }
            View viewById = focus;
            if (focus == null) {
                viewById = view.getRootView().findViewById(16908290);
            }
            if (viewById != null && viewById.hasWindowFocus()) {
                viewById.post((Runnable)new m0((Object)viewById, (byte)10));
            }
        }
    }
    
    @Override
    public Object zza() {
        final uzq uzq = (uzq)((zgq)this.v).zza();
        if (uzq != null) {
            return uzq;
        }
        fvd.k("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
