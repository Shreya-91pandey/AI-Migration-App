import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import android.app.Activity;

public final class bw6
{
    public final ClassLoader a;
    
    public aw6 a(final Object o, final us4 us4, final Activity activity, final o2a o2a) {
        final zv6 zv6 = new zv6(us4, o2a);
        final ClassLoader a = this.a;
        final Class loadClass = a.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        final Object proxyInstance = Proxy.newProxyInstance(a, new Class[] { loadClass }, (InvocationHandler)zv6);
        proxyInstance.getClass();
        final Class<?> class1 = o.getClass();
        final Class loadClass2 = a.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        class1.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(o, new Object[] { activity, proxyInstance });
        final Class<?> class2 = o.getClass();
        final Class loadClass3 = a.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new aw6(class2.getMethod("removeWindowLayoutInfoListener", loadClass3), o, proxyInstance);
    }
}
