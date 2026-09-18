import java.lang.reflect.AccessibleObject;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class cpd
{
    public static final sei a;
    
    static {
        Method method;
        Object o = null;
        while (true) {
            method = null;
        Label_0059:
            while (true) {
                Label_0074: {
                    try {
                        final ClassLoader classLoader = j9k.class.getClassLoader();
                        classLoader.getClass();
                        final Annotation[] annotations = ((AccessibleObject)classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", (Class[])null)).getAnnotations();
                        annotations.getClass();
                        for (int length = annotations.length, i = 0; i < length; ++i) {
                            if (annotations[i] instanceof hd8) {
                                break Label_0059;
                            }
                        }
                        break Label_0074;
                        break;
                    }
                    finally {
                        break Label_0059;
                    }
                }
                final Object invoke = ((Method)o).invoke((Object)null, (Object[])null);
                if (invoke instanceof sei) {
                    o = invoke;
                    break;
                }
                continue Label_0059;
            }
            o = new jpj((Throwable)o);
            break;
        }
        if (o instanceof jpj) {
            o = method;
        }
        Object a2;
        if ((a2 = o) == null) {
            a2 = new b09((jta)new lrc((byte)10), (byte)1);
        }
        a = (sei)a2;
    }
}
