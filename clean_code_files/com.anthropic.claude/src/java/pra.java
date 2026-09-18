import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import androidx.fragment.app.Fragment$InstantiationException;

public final class pra
{
    public static final myl b;
    public final vra a;
    
    static {
        b = new myl(0);
    }
    
    public pra(final vra a) {
        this.a = a;
    }
    
    public static Class b(final String name, final ClassLoader loader) {
        final myl b = pra.b;
        myl myl;
        if ((myl = (myl)b.get((Object)loader)) == null) {
            myl = new myl(0);
            b.put((Object)loader, (Object)myl);
        }
        final Class clazz = (Class)myl.get((Object)name);
        if (clazz == null) {
            final Class<?> forName = Class.forName(name, false, loader);
            myl.put((Object)name, (Object)forName);
            return forName;
        }
        return clazz;
    }
    
    public static Class c(final String s, final ClassLoader classLoader) {
        try {
            return b(s, classLoader);
        }
        catch (final ClassCastException ex) {
            throw new Fragment$InstantiationException((Exception)ex, hia.k("Unable to instantiate fragment ", s, ": make sure class is a valid subclass of Fragment"));
        }
        catch (final ClassNotFoundException ex2) {
            throw new Fragment$InstantiationException((Exception)ex2, hia.k("Unable to instantiate fragment ", s, ": make sure class name exists"));
        }
    }
    
    public final hra a(final String s) {
        final Context y = this.a.w.y;
        try {
            return (hra)c(s, y.getClassLoader()).getConstructor((Class[])null).newInstance((Object[])null);
        }
        catch (final InvocationTargetException ex) {}
        catch (final NoSuchMethodException ex2) {
            throw new Fragment$InstantiationException((Exception)ex2, hia.k("Unable to instantiate fragment ", s, ": could not find Fragment constructor"));
        }
        catch (final IllegalAccessException ex3) {
            throw new Fragment$InstantiationException((Exception)ex3, hia.k("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"));
        }
        catch (final InstantiationException ex4) {
            throw new Fragment$InstantiationException((Exception)ex4, hia.k("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"));
        }
        final InvocationTargetException ex;
        throw new Fragment$InstantiationException((Exception)ex, hia.k("Unable to instantiate fragment ", s, ": calling Fragment constructor caused an exception"));
    }
}
