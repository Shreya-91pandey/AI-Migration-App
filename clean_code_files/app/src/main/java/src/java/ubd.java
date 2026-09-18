import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public abstract class ubd
{
    public static final HashMap a;
    public static final HashMap b;
    
    static {
        a = new HashMap();
        b = new HashMap();
    }
    
    public static void a(final Constructor constructor, final fbd fbd) {
        try {
            final Object instance = constructor.newInstance(new Object[] { fbd });
            instance.getClass();
            guc.o(instance);
            throw null;
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException((Throwable)ex);
        }
        catch (final InstantiationException ex2) {
            throw new RuntimeException((Throwable)ex2);
        }
        catch (final IllegalAccessException ex3) {
            throw new RuntimeException((Throwable)ex3);
        }
    }
    
    public static int b(final Class clazz) {
        final HashMap a = ubd.a;
        final Integer n = (Integer)a.get((Object)clazz);
        if (n != null) {
            return n;
        }
        final String canonicalName = clazz.getCanonicalName();
        final int n2 = 1;
        int n3 = 0;
        Label_0520: {
            if (canonicalName == null) {
                n3 = n2;
            }
            else {
                int i = 0;
                final List list = null;
                Constructor constructor;
                try {
                    final Package package1 = clazz.getPackage();
                    clazz.getCanonicalName();
                    if (package1 != null) {
                        package1.getName();
                        goto Label_0085;
                    }
                    goto Label_0081;
                }
                catch (final NoSuchMethodException ex) {
                    goto Label_0244;
                }
                catch (final ClassNotFoundException ex2) {
                    constructor = null;
                }
                final HashMap b = ubd.b;
                if (constructor != null) {
                    b.put((Object)clazz, (Object)lq6.X((Object)constructor));
                }
                else {
                    if (at4.c.b(clazz)) {
                        n3 = n2;
                        break Label_0520;
                    }
                    final Class superclass = clazz.getSuperclass();
                    Object o = list;
                    if (superclass != null) {
                        o = list;
                        if (fbd.class.isAssignableFrom(superclass)) {
                            superclass.getClass();
                            if (b(superclass) == 1) {
                                n3 = n2;
                                break Label_0520;
                            }
                            final Object value = b.get((Object)superclass);
                            value.getClass();
                            o = new ArrayList((Collection)value);
                        }
                    }
                    final Class[] interfaces = clazz.getInterfaces();
                    interfaces.getClass();
                    while (i < interfaces.length) {
                        final Class cls = interfaces[i];
                        Object o2 = o;
                        if (cls != null) {
                            o2 = o;
                            if (fbd.class.isAssignableFrom(cls)) {
                                cls.getClass();
                                if (b(cls) == 1) {
                                    n3 = n2;
                                    break Label_0520;
                                }
                                if ((o2 = o) == null) {
                                    o2 = new ArrayList();
                                }
                                final Object value2 = b.get((Object)cls);
                                value2.getClass();
                                ((List)o2).addAll((Collection)value2);
                            }
                        }
                        ++i;
                        o = o2;
                    }
                    n3 = n2;
                    if (o == null) {
                        break Label_0520;
                    }
                    b.put((Object)clazz, o);
                }
                n3 = 2;
            }
        }
        a.put((Object)clazz, (Object)n3);
        return n3;
    }
}
