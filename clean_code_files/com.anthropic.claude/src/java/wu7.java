import java.io.Serializable;

public final class wu7
{
    public final aof a;
    public final x3j b;
    public final b4j c;
    public final rv7 d;
    
    public wu7(final aof a, final x3j b, final b4j c, final rv7 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(tt7 w, h07 x) {
        Object o = null;
        Label_0049: {
            if (x instanceof vu7) {
                o = x;
                final int e = ((vu7)o).E;
                if ((e & Integer.MIN_VALUE) != 0x0) {
                    ((vu7)o).E = e + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new vu7(this, (h07)x);
        }
        Object o2 = ((vu7)o).C;
        final int e2 = ((vu7)o).E;
        final pc7 v = pc7.v;
        Label_0624: {
            Label_0456: {
                int a2;
                rv7 z;
                Object c;
                Object b2;
                tt7 tt7;
                if (e2 != 0) {
                    if (e2 != 1) {
                        if (e2 != 2) {
                            if (e2 == 3) {
                                final Object y = ((vu7)o).y;
                                final Object o3 = ((vu7)o).x;
                                w = (tt7)((vu7)o).w;
                                try {
                                    vt4.g0(o2);
                                    o2 = y;
                                    break Label_0456;
                                }
                                finally {
                                    break Label_0624;
                                }
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        final int b = ((vu7)o).B;
                        final int a = ((vu7)o).A;
                        final rv7 rv7 = (rv7)((vu7)o).y;
                        final b4j b4j = (b4j)((vu7)o).x;
                        final Object w2 = ((vu7)o).w;
                        try {
                            vt4.g0(o2);
                            break Label_0456;
                        }
                        finally {
                            w = (tt7)w2;
                            break Label_0624;
                        }
                    }
                    a2 = ((vu7)o).A;
                    z = ((vu7)o).z;
                    c = ((vu7)o).y;
                    final x3j x3j = (x3j)((vu7)o).x;
                    x = ((vu7)o).w;
                    final tt7 v2 = ((vu7)o).v;
                    vt4.g0(o2);
                    b2 = x3j;
                    tt7 = v2;
                }
                else {
                    vt4.g0(o2);
                    ((vu7)o).v = w;
                    x = this.a;
                    ((vu7)o).w = (aof)x;
                    b2 = this.b;
                    ((vu7)o).x = (Serializable)b2;
                    c = this.c;
                    ((vu7)o).y = c;
                    final rv7 d = this.d;
                    ((vu7)o).z = d;
                    ((vu7)o).A = 0;
                    ((vu7)o).E = 1;
                    if (((aof)x).c((f07)o) == v) {
                        return v;
                    }
                    a2 = 0;
                    tt7 = w;
                    z = d;
                }
                try {
                    if (!((x3j)b2).v) {
                        final Object v3 = ((b4j)c).v;
                        ((vu7)o).v = null;
                        ((vu7)o).w = (aof)x;
                        ((vu7)o).x = (Serializable)c;
                        ((vu7)o).y = z;
                        ((vu7)o).z = null;
                        ((vu7)o).A = a2;
                        ((vu7)o).B = 0;
                        ((vu7)o).E = 2;
                        o2 = ((zta)tt7).d(v3, o);
                        if (o2 != v) {
                            final rv7 rv7 = z;
                            w = (tt7)x;
                            final int n = 0;
                            final int a = a2;
                            x = c;
                            final int b = n;
                            Object o3;
                            if (!mlc.q(o2, ((b4j)x).v)) {
                                ((vu7)o).v = null;
                                ((vu7)o).w = (aof)w;
                                ((vu7)o).x = (Serializable)x;
                                ((vu7)o).y = o2;
                                ((vu7)o).A = a;
                                ((vu7)o).B = b;
                                ((vu7)o).E = 3;
                                if (rv7.h(o2, false, (h07)o) == v) {
                                    return v;
                                }
                                o3 = x;
                                x = w;
                                ((b4j)o3).v = o2;
                            }
                            else {
                                o3 = x;
                                x = w;
                            }
                            final Object v4 = ((b4j)o3).v;
                            ((aof)x).g((Object)null);
                            return v4;
                        }
                        return v;
                    }
                }
                finally {
                    w = (tt7)x;
                    break Label_0624;
                }
            }
            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
        }
        ((aof)w).g((Object)null);
    }
}
