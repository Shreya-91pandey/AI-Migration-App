import java.lang.reflect.AccessibleObject;
import java.util.List;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;

public final class j2j implements cbd
{
    public final byte v;
    public final Object w;
    
    @Override
    public final void g(gbd name, final rad rad) {
        final byte v = this.v;
        final Object w = this.w;
        switch (v) {
            default: {
                if (rad == rad.ON_CREATE) {
                    ((gbd)name).d().d((fbd)this);
                    ((e9k)w).b();
                }
                else {
                    fvd.j((Object)rad, "Next event must be ON_CREATE, it was ");
                }
                return;
            }
            case 1: {
                final ge6 ge6 = (ge6)w;
                if (ge6.z == null) {
                    final be6 be6 = (be6)ge6.getLastNonConfigurationInstance();
                    if (be6 != null) {
                        ge6.z = be6.a;
                    }
                    if (ge6.z == null) {
                        ge6.z = new xcp();
                    }
                }
                ge6.v.d((fbd)this);
                return;
            }
            case 0: {
                final j9k j9k = (j9k)w;
                if (rad == rad.ON_CREATE) {
                    ((gbd)name).d().d((fbd)this);
                    final Bundle e = j9k.x().e("androidx.savedstate.Restarter");
                    if (e != null) {
                        final ArrayList r = ek.r(e);
                        Label_0356: {
                            if (r != null) {
                                final Iterator iterator = ((List)r).iterator();
                                while (iterator.hasNext()) {
                                    name = (NoSuchMethodException)iterator.next();
                                    try {
                                        Object o = Class.forName((String)name, false, j2j.class.getClassLoader()).asSubclass(g9k.class);
                                        ((Class)o).getClass();
                                        try {
                                            final Constructor declaredConstructor = ((Class)o).getDeclaredConstructor((Class[])null);
                                            ((AccessibleObject)declaredConstructor).setAccessible(true);
                                            try {
                                                o = declaredConstructor.newInstance((Object[])null);
                                                ((Class)o).getClass();
                                                o = o;
                                                ((f7d)o).a(j9k);
                                            }
                                            catch (final Exception ex) {
                                                fvd.v(smk.s("Failed to instantiate ", (String)name), (Throwable)ex);
                                            }
                                        }
                                        catch (final NoSuchMethodException name) {
                                            final String simpleName = ((Class)o).getSimpleName();
                                            final StringBuilder sb = new StringBuilder("Class ");
                                            sb.append(simpleName);
                                            sb.append(" must have default constructor in order to be automatically recreated");
                                            throw new IllegalStateException(sb.toString(), (Throwable)name);
                                        }
                                    }
                                    catch (final ClassNotFoundException ex2) {
                                        fvd.v(hia.k("Class ", (String)name, " wasn't found"), (Throwable)ex2);
                                        break;
                                    }
                                    break Label_0356;
                                }
                                return;
                            }
                        }
                        en9.q("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                }
                else {
                    en9.g((Object)"Next event must be ON_CREATE");
                }
            }
        }
    }
}
