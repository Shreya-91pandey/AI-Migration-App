import androidx.work.WorkerParameters;
import android.content.Context;

public abstract class c6q
{
    public final nld b(final Context context, final String className, final WorkerParameters workerParameters) {
        Object o;
        if ((o = this.a(context, className, workerParameters)) == null) {
            try {
                o = Class.forName(className).asSubclass(nld.class);
                ((nld)o).getClass();
                try {
                    final Object instance = ((Class)o).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(new Object[] { context, workerParameters });
                    instance.getClass();
                    o = instance;
                }
                finally {
                    final Throwable t;
                    krd.c().b(d6q.a(), "Could not instantiate ".concat(className), t);
                }
            }
            finally {
                final Throwable t2;
                krd.c().b(d6q.a(), "Invalid class: ".concat(className), t2);
            }
        }
        if (!((nld)o).d) {
            return (nld)o;
        }
        final String name = this.getClass().getName();
        final StringBuilder sb = new StringBuilder("WorkerFactory (");
        sb.append(name);
        sb.append(") returned an instance of a ListenableWorker (");
        sb.append(className);
        sb.append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        throw new IllegalStateException(sb.toString());
    }
}
