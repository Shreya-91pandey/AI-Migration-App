import java.util.concurrent.atomic.AtomicReference;
import android.provider.Settings$Global;
import android.database.ContentObserver;
import android.content.Context;
import android.net.Uri;
import android.content.ContentResolver;

public final class xnf extends m6n implements zta
{
    public Object A;
    public Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final byte w;
    public byte x;
    public Object y;
    public Object z;
    
    public xnf(final ContentResolver a, final Uri b, final z38 c, final mn2 d, final Context e, final f07 f07) {
        this.w = 1;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        super(2, f07);
    }
    
    public xnf(final lnf d, final ynf c, final lta e, final f07 f07) {
        this.w = 0;
        this.D = d;
        this.C = c;
        this.E = e;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final Object e = this.E;
        final Object d = this.D;
        final Object c = this.C;
        switch (w) {
            default: {
                final xnf xnf = new xnf((ContentResolver)this.A, (Uri)this.B, (z38)c, (mn2)d, (Context)e, f07);
                xnf.y = o;
                return (f07)xnf;
            }
            case 0: {
                final xnf xnf2 = new xnf((lnf)d, (ynf)c, (lta)e, f07);
                xnf2.A = o;
                return (f07)xnf2;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((xnf)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((xnf)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object l) {
        final byte w = this.w;
        final Object e = this.E;
        Object d = this.D;
        final Object v = pc7.v;
        final Object c = this.C;
        switch (w) {
            default: {
                final z38 z38 = (z38)c;
                final ContentResolver contentResolver = (ContentResolver)this.A;
                final byte x = this.x;
                Object a;
                while (true) {
                    jja jja = null;
                    Object z40 = null;
                    Object b = null;
                    Label_0233: {
                        en2 z39 = null;
                        Label_0194: {
                            if (x == 0) {
                                vt4.g0(l);
                                jja = (jja)this.y;
                                contentResolver.registerContentObserver((Uri)this.B, false, (ContentObserver)z38);
                                z39 = new en2((mn2)d);
                                break Label_0194;
                            }
                            if (x == 1) {
                                z40 = this.z;
                                jja = (jja)this.y;
                                vt4.g0(l);
                                b = l;
                                break Label_0233;
                            }
                            Label_0115: {
                                if (x != 2) {
                                    break Label_0115;
                                }
                                z40 = this.z;
                                jja = (jja)this.y;
                                Label_0333: {
                                    try {
                                        vt4.g0(l);
                                        l = z40;
                                        break Label_0194;
                                    }
                                    finally {
                                        break Label_0333;
                                    }
                                    break Label_0115;
                                }
                                contentResolver.unregisterContentObserver((ContentObserver)z38);
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            a = null;
                            return a;
                        }
                        this.y = jja;
                        this.z = z39;
                        this.x = 1;
                        b = z39.b((f07)this);
                        if (b == v) {
                            a = v;
                            return a;
                        }
                        z40 = z39;
                    }
                    if (b) {
                        ((en2)z40).c();
                        final Context context = (Context)e;
                        final tmf a2 = b3q.a;
                        l = new Float(Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                        this.y = jja;
                        this.z = z40;
                        this.x = 2;
                        l = jja.l(l, (f07)this);
                        if (l != v) {
                            continue;
                        }
                        a = v;
                    }
                    else {
                        contentResolver.unregisterContentObserver((ContentObserver)z38);
                        a = lqo.a;
                    }
                    break;
                }
                return a;
            }
            case 0: {
                Object o = c;
                final byte x2 = this.x;
                Object o2 = null;
                Object o3 = null;
                Label_0744: {
                    Label_0667: {
                        lta y;
                        if (x2 != 0) {
                            if (x2 != 1) {
                                if (x2 == 2) {
                                    o2 = this.y;
                                    final aof aof = (aof)this.z;
                                    o3 = this.A;
                                    try {
                                        vt4.g0(l);
                                        break Label_0667;
                                    }
                                    finally {
                                        l = aof;
                                        o = d;
                                        break Label_0744;
                                    }
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                l = null;
                                return l;
                            }
                            o = this.B;
                            y = (lta)this.y;
                            d = this.z;
                            final vnf vnf = (vnf)this.A;
                            vt4.g0(l);
                            l = vnf;
                        }
                        else {
                            vt4.g0(l);
                            final oc7 oc7 = (oc7)this.A;
                            final lnf lnf = (lnf)d;
                            final fc7 m0 = oc7.getCoroutineContext().M0((gc7)o55.z);
                            m0.getClass();
                            l = new vnf(lnf, (opc)m0);
                            ((ynf)o).b((vnf)l);
                            final cof b2 = ((ynf)o).b;
                            y = (lta)e;
                            this.A = l;
                            this.z = b2;
                            this.y = y;
                            this.B = o;
                            this.x = 1;
                            d = b2;
                            if (b2.c((f07)this) == v) {
                                l = v;
                                return l;
                            }
                        }
                        try {
                            this.A = l;
                            this.z = d;
                            this.y = o;
                            this.B = null;
                            this.x = 2;
                            final Object b3 = y.b((Object)this);
                            if (b3 == v) {
                                l = v;
                                return l;
                            }
                            final Object o4 = b3;
                            final Object o5 = l;
                            o2 = o;
                            l = o4;
                            o3 = o5;
                            o = d;
                            d = o;
                            try {
                                final AtomicReference a3 = ((ynf)o2).a;
                                do {
                                    d = o;
                                    if (a3.compareAndSet(o3, (Object)null)) {
                                        break;
                                    }
                                    d = o;
                                } while (a3.get() == o3);
                                ((aof)o).g((Object)null);
                                return l;
                            }
                            finally {}
                        }
                        finally {
                            o2 = o;
                            final aof aof2;
                            o = aof2;
                            o3 = l;
                            l = d;
                        }
                    }
                    break Label_0744;
                    ((aof)d).g((Object)null);
                    throw l;
                }
                final AtomicReference a4 = ((ynf)o2).a;
                while (!a4.compareAndSet(o3, (Object)null) && a4.get() == o3) {}
                throw o;
            }
        }
    }
}
