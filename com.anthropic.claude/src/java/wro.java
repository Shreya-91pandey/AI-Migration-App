import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import sun.misc.Unsafe;
import java.security.PrivilegedExceptionAction;

public final class wro implements PrivilegedExceptionAction
{
    public final byte a;
    
    public final Object run() {
        final byte a = this.a;
        int n = 0;
        final int n2 = 0;
        final Object o = null;
        final Object o2 = null;
        switch (a) {
            default: {
                final Field[] declaredFields = Unsafe.class.getDeclaredFields();
                final int length = declaredFields.length;
                int n3 = n2;
                Object o3;
                while (true) {
                    o3 = o2;
                    if (n3 >= length) {
                        break;
                    }
                    final Field field = declaredFields[n3];
                    ((AccessibleObject)field).setAccessible(true);
                    final Object value = field.get((Object)null);
                    if (Unsafe.class.isInstance(value)) {
                        o3 = Unsafe.class.cast(value);
                        break;
                    }
                    ++n3;
                }
                return o3;
            }
            case 0: {
                final Field[] declaredFields2 = Unsafe.class.getDeclaredFields();
                final int length2 = declaredFields2.length;
                Object o4;
                while (true) {
                    o4 = o;
                    if (n >= length2) {
                        break;
                    }
                    final Field field2 = declaredFields2[n];
                    ((AccessibleObject)field2).setAccessible(true);
                    final Object value2 = field2.get((Object)null);
                    if (Unsafe.class.isInstance(value2)) {
                        o4 = Unsafe.class.cast(value2);
                        break;
                    }
                    ++n;
                }
                return o4;
            }
        }
    }
}
