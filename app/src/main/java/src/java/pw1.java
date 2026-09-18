import java.io.File;
import java.util.ArrayList;

public final class pw1 extends m6n implements lta
{
    public final Object A;
    public final byte w;
    public boolean x;
    public final Object y;
    public final Object z;
    
    public pw1(final rv7 y, final yci yci, final hc7 z, final zta a, final f07 f07) {
        this.w = 2;
        this.y = y;
        this.z = z;
        this.A = a;
        super(1, f07);
    }
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((pw1)this.create(f07)).invokeSuspend(a);
            }
            case 4: {
                return ((pw1)this.create(f07)).invokeSuspend(a);
            }
            case 3: {
                return ((pw1)this.create(f07)).invokeSuspend(a);
            }
            case 2: {
                return ((pw1)this.create(f07)).invokeSuspend(a);
            }
            case 1: {
                return ((pw1)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((pw1)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    @Override
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object z = this.z;
        final Object a = this.A;
        final Object y = this.y;
        switch (w) {
            default: {
                return new pw1(y, this.z, a, f07, (byte)5);
            }
            case 4: {
                return new pw1(y, z, a, f07, (byte)4);
            }
            case 3: {
                return new pw1(y, z, a, f07, (byte)3);
            }
            case 2: {
                return new pw1((rv7)y, null, (hc7)z, (zta)a, f07);
            }
            case 1: {
                return new pw1(y, z, a, f07, (byte)1);
            }
            case 0: {
                return new pw1(y, z, a, f07, (byte)0);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        final Object a2 = this.A;
        final Object z = this.z;
        final Object y = this.y;
        final pc7 v = pc7.v;
        boolean b = true;
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
                    final hw7 hw7 = new hw7((zmk)y, z, (efo)a2, (f07)null);
                    this.x = true;
                    if (ien.m((f07)this, (zta)hw7) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 4: {
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
                    final ozh ozh = (ozh)y;
                    final qzh qzh = (qzh)z;
                    final ArrayList list = (ArrayList)a2;
                    this.x = true;
                    if (ozh.c(ozh, qzh, list, (h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 3: {
                final boolean x3 = this.x;
                if (x3) {
                    if (x3) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final xug xug = (xug)y;
                    final ceo ceo = (ceo)z;
                    final zta zta = (zta)a2;
                    this.x = true;
                    if ((o = xug.e(ceo, zta, (h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
            case 2: {
                final rv7 rv7 = (rv7)y;
                final boolean x4 = this.x;
                if (x4) {
                    if (x4) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    rv7.getClass();
                    final nv7 nv7 = new nv7(rv7, (hc7)z, (zta)a2, (f07)null);
                    this.x = true;
                    if ((o = zn2.R("DataStore.transformAndWrite", null, (lta)nv7, this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
            case 1: {
                final boolean x5 = this.x;
                if (x5) {
                    if (x5) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final kx3 kx3 = (kx3)y;
                    final qx3 qx3 = (qx3)z;
                    final ArrayList list2 = (ArrayList)a2;
                    this.x = true;
                    if (kx3.b(kx3, qx3, list2, (h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 0: {
                final boolean x6 = this.x;
                if (x6) {
                    if (x6) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final muj muj = (muj)y;
                    final v2k v2k = (v2k)z;
                    final String s = (String)a2;
                    this.x = true;
                    String absolutePath = s;
                    if (!s.equals(":memory:")) {
                        final File databasePath = muj.c.a.getDatabasePath(s);
                        absolutePath = s;
                        if (databasePath != null) {
                            absolutePath = databasePath.getAbsolutePath();
                            if (absolutePath == null) {
                                absolutePath = s;
                            }
                        }
                    }
                    if (muj.a || muj.b || absolutePath.equals(":memory:")) {
                        b = false;
                    }
                    final it9 it9 = new it9(absolutePath, b);
                    o = new xw1(it9, (x3j)new Object(), (f07)null, muj, v2k, absolutePath, absolutePath);
                    if ((o = zn2.U(it9.a, (lta)o, this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
        }
    }
}
