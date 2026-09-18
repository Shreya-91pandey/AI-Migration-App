import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class fso
{
    public final byte a;
    public final Unsafe b;
    
    public boolean a(final long n, final Object o) {
        if (jso.g) {
            return jso.f(n, o) != 0;
        }
        return jso.g(n, o) != 0;
    }
    
    public byte b(final long n, final Object o) {
        if (jso.g) {
            return jso.f(n, o);
        }
        return jso.g(n, o);
    }
    
    public double c(final long n, final Object o) {
        return Double.longBitsToDouble(this.b.getLong(o, n));
    }
    
    public float d(final long n, final Object o) {
        return Float.intBitsToFloat(this.b.getInt(o, n));
    }
    
    public void e(final Object o, final long n, final boolean b) {
        if (jso.g) {
            jso.l(n, o, (byte)(byte)(b ? 1 : 0));
            return;
        }
        jso.m(n, o, (byte)(byte)(b ? 1 : 0));
    }
    
    public void f(final long n, final Object o, final byte b) {
        if (kso.g) {
            kso.k(n, o, b);
            return;
        }
        kso.l(n, o, b);
    }
    
    public void g(final Object o, final long n, final double n2) {
        this.b.putLong(o, n, Double.doubleToLongBits(n2));
    }
    
    public void h(final Object o, final long n, final float n2) {
        this.b.putInt(o, n, Float.floatToIntBits(n2));
    }
    
    public boolean i() {
        final byte a = this.a;
        final Class type = Integer.TYPE;
        final Class type2 = Long.TYPE;
        final Unsafe b = this.b;
        switch (a) {
            default: {
                if (b != null) {
                    boolean b2;
                    try {
                        final Class<? extends Unsafe> class1 = b.getClass();
                        class1.getMethod("objectFieldOffset", Field.class);
                        class1.getMethod("arrayBaseOffset", Class.class);
                        class1.getMethod("arrayIndexScale", Class.class);
                        class1.getMethod("getInt", Object.class, type2);
                        class1.getMethod("putInt", Object.class, type2, type);
                        class1.getMethod("getLong", Object.class, type2);
                        class1.getMethod("putLong", Object.class, type2, type2);
                        class1.getMethod("getObject", Object.class, type2);
                        class1.getMethod("putObject", Object.class, type2, Object.class);
                        b2 = true;
                    }
                    finally {
                        final Throwable t;
                        kso.i(t);
                        return false;
                    }
                    return b2;
                }
                return false;
            }
            case 0: {
                if (b != null) {
                    boolean b3;
                    try {
                        final Class<? extends Unsafe> class2 = b.getClass();
                        class2.getMethod("objectFieldOffset", Field.class);
                        class2.getMethod("arrayBaseOffset", Class.class);
                        class2.getMethod("arrayIndexScale", Class.class);
                        class2.getMethod("getInt", Object.class, type2);
                        class2.getMethod("putInt", Object.class, type2, type);
                        class2.getMethod("getLong", Object.class, type2);
                        class2.getMethod("putLong", Object.class, type2, type2);
                        class2.getMethod("getObject", Object.class, type2);
                        class2.getMethod("putObject", Object.class, type2, Object.class);
                        b3 = true;
                    }
                    finally {
                        final Throwable t2;
                        jso.k(t2);
                        return false;
                    }
                    return b3;
                }
                return false;
            }
        }
    }
    
    public boolean j() {
        return false;
    }
    
    public double k(final long n, final Object o) {
        return Double.longBitsToDouble(this.b.getLong(o, n));
    }
    
    public float l(final long n, final Object o) {
        return Float.intBitsToFloat(this.b.getInt(o, n));
    }
    
    public void m(final Object o, final long n, final boolean b) {
        if (r7r.e) {
            r7r.e(o, n, b);
            return;
        }
        r7r.f(o, n, b);
    }
    
    public void n(final Object o, final long n, final double n2) {
        this.b.putLong(o, n, Double.doubleToLongBits(n2));
    }
    
    public void o(final Object o, final long n, final float n2) {
        this.b.putInt(o, n, Float.floatToIntBits(n2));
    }
    
    public boolean p(final long n, final Object o) {
        if (r7r.e) {
            return r7r.i(n, o);
        }
        return r7r.j(n, o);
    }
}
