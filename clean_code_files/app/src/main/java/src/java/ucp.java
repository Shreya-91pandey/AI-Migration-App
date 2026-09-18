import java.lang.reflect.InvocationTargetException;
import android.app.Application;

public final class ucp extends wcp
{
    public static ucp c;
    public static final cib d;
    public final Application b;
    
    static {
        d = new cib((byte)27);
    }
    
    public ucp(final Application b) {
        this.b = b;
    }
    
    public static tcp d(final Class cls, final Application application) {
        if (wc0.class.isAssignableFrom(cls)) {
            Label_0087: {
                Label_0078: {
                    Label_0069: {
                        try {
                            final tcp tcp = (tcp)cls.getConstructor(Application.class).newInstance(new Object[] { application });
                            tcp.getClass();
                            return tcp;
                        }
                        catch (final InvocationTargetException ex) {}
                        catch (final InstantiationException ex2) {
                            break Label_0069;
                        }
                        catch (final IllegalAccessException ex3) {
                            break Label_0078;
                        }
                        catch (final NoSuchMethodException ex4) {
                            break Label_0087;
                        }
                        final InvocationTargetException ex;
                        oyl.m("Cannot create an instance of ", (Object)cls, (Throwable)ex);
                        return null;
                    }
                    final InstantiationException ex2;
                    oyl.m("Cannot create an instance of ", (Object)cls, (Throwable)ex2);
                    return null;
                }
                final IllegalAccessException ex3;
                oyl.m("Cannot create an instance of ", (Object)cls, (Throwable)ex3);
                return null;
            }
            final NoSuchMethodException ex4;
            oyl.m("Cannot create an instance of ", (Object)cls, (Throwable)ex4);
            return null;
        }
        return rhc.o(cls);
    }
    
    @Override
    public final tcp a(final Class clazz) {
        final Application b = this.b;
        if (b != null) {
            return d(clazz, b);
        }
        oyl.s("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
    
    @Override
    public final tcp b(final Class cls, final elf elf) {
        if (this.b != null) {
            return this.a(cls);
        }
        final Application application = (Application)elf.a.get((Object)ucp.d);
        if (application != null) {
            return d(cls, application);
        }
        if (!wc0.class.isAssignableFrom(cls)) {
            return rhc.o(cls);
        }
        en9.s("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
