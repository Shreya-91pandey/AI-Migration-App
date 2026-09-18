import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.Buffer;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import sun.misc.Unsafe;

public abstract class kso
{
    public static final Unsafe a;
    public static final Class b;
    public static final fso c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;
    
    static {
        final boolean b2 = true;
        Object c2 = null;
        Unsafe a2;
        try {
            final Unsafe unsafe = (Unsafe)AccessController.doPrivileged((PrivilegedExceptionAction)new wro((byte)1));
        }
        finally {
            a2 = null;
        }
        a = a2;
        b = w30.a;
        final boolean d2 = d(Long.TYPE);
        final boolean d3 = d(Integer.TYPE);
        if (a2 != null) {
            if (w30.a()) {
                if (d2) {
                    c2 = new fso(a2, (byte)1);
                }
                else if (d3) {
                    c2 = new bso(a2, (byte)0);
                }
            }
            else {
                c2 = new bso(a2, (byte)1);
            }
        }
        c = (fso)c2;
        d = (c2 != null && ((fso)c2).j());
        e = (c2 != null && ((fso)c2).i());
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        final Field c3 = c();
        if (c3 != null) {
            if (c2 != null) {
                ((fso)c2).b.objectFieldOffset(c3);
            }
        }
        g = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN && b2);
    }
    
    public static int a(final Class clazz) {
        if (kso.e) {
            return kso.c.b.arrayBaseOffset(clazz);
        }
        return -1;
    }
    
    public static void b(final Class clazz) {
        if (kso.e) {
            kso.c.b.arrayIndexScale(clazz);
        }
    }
    
    public static Field c() {
        final boolean a = w30.a();
        final Field field = null;
        if (a) {
            Field field2;
            try {
                Buffer.class.getDeclaredField("effectiveDirectAddress");
            }
            finally {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        Field field3;
        try {
            Buffer.class.getDeclaredField("address");
        }
        finally {
            field3 = null;
        }
        Field field4 = field;
        if (field3 != null) {
            field4 = field;
            if (field3.getType() == Long.TYPE) {
                field4 = field3;
            }
        }
        return field4;
    }
    
    public static boolean d(final Class clazz) {
        if (!w30.a()) {
            return false;
        }
        try {
            final Class b = kso.b;
            final Class type = Boolean.TYPE;
            b.getMethod("peekLong", clazz, type);
            b.getMethod("pokeLong", clazz, Long.TYPE, type);
            final Class type2 = Integer.TYPE;
            b.getMethod("pokeInt", clazz, type2, type);
            b.getMethod("peekInt", clazz, type);
            b.getMethod("pokeByte", clazz, Byte.TYPE);
            b.getMethod("peekByte", clazz);
            b.getMethod("pokeByteArray", clazz, byte[].class, type2, type2);
            b.getMethod("peekByteArray", clazz, byte[].class, type2, type2);
            return true;
        }
        finally {
            return false;
        }
    }
    
    public static boolean e(final long n, final Object o) {
        return (byte)(f(0xFFFFFFFFFFFFFFFCL & n, o) >>> (int)((~n & 0x3L) << 3) & 0xFF) != 0;
    }
    
    public static int f(final long n, final Object o) {
        return kso.c.b.getInt(o, n);
    }
    
    public static long g(final long n, final Object o) {
        return kso.c.b.getLong(o, n);
    }
    
    public static Object h(final long n, final Object o) {
        return kso.c.b.getObject(o, n);
    }
    
    public static void i(final Throwable t) {
        final Logger logger = Logger.getLogger(kso.class.getName());
        final Level warning = Level.WARNING;
        final StringBuilder sb = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
        sb.append((Object)t);
        logger.log(warning, sb.toString());
    }
    
    public static void j(final byte[] array, final long n, final byte b) {
        kso.c.f(kso.f + n, array, b);
    }
    
    public static void k(final long n, final Object o, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int f = f(n2, o);
        final int n3 = (~(int)n & 0x3) << 3;
        m((0xFF & b) << n3 | (f & ~(255 << n3)), n2, o);
    }
    
    public static void l(final long n, final Object o, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int f = f(n2, o);
        final int n3 = ((int)n & 0x3) << 3;
        m((0xFF & b) << n3 | (f & ~(255 << n3)), n2, o);
    }
    
    public static void m(final int n, final long n2, final Object o) {
        kso.c.b.putInt(o, n2, n);
    }
    
    public static void n(final Object o, final long n, final long n2) {
        kso.c.b.putLong(o, n, n2);
    }
    
    public static void o(final long n, final Object o, final Object o2) {
        kso.c.b.putObject(o, n, o2);
    }
}
