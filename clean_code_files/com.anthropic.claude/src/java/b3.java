import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import androidx.concurrent.futures.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;

public abstract class b3 implements fld
{
    public static final r9n A;
    public static final Object B;
    public static final boolean y;
    public static final Logger z;
    public volatile Object v;
    public volatile x2 w;
    public volatile a3 x;
    
    static {
        y = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        z = Logger.getLogger(b3.class.getName());
        z2 a;
        try {
            final y2 y2 = new y2(AtomicReferenceFieldUpdater.newUpdater((Class)a3.class, (Class)Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater((Class)a3.class, (Class)a3.class, "b"), AtomicReferenceFieldUpdater.newUpdater((Class)b3.class, (Class)a3.class, "x"), AtomicReferenceFieldUpdater.newUpdater((Class)b3.class, (Class)x2.class, "w"), AtomicReferenceFieldUpdater.newUpdater((Class)b3.class, (Class)Object.class, "v"));
        }
        finally {
            a = new z2();
        }
        A = (r9n)a;
        final Throwable t;
        if (t != null) {
            b3.z.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        B = new Object();
    }
    
    public static void h(final b3 b3) {
        a3 a3;
        do {
            a3 = b3.x;
        } while (!b3.A.k(b3, a3, a3.c));
        x2 x2;
        while (true) {
            x2 = null;
            if (a3 == null) {
                break;
            }
            final Thread a4 = a3.a;
            if (a4 != null) {
                a3.a = null;
                LockSupport.unpark(a4);
            }
            a3 = a3.b;
        }
        b3.e();
        x2 w;
        do {
            w = b3.w;
        } while (!b3.A.i(b3, w, x2.d));
        x2 x3 = x2;
        x2 c = w;
        x2 x4;
        while (true) {
            final x2 c2 = x3;
            x3 = c;
            x4 = c2;
            if (x3 == null) {
                break;
            }
            c = x3.c;
            x3.c = c2;
        }
        while (x4 != null) {
            final x2 c3 = x4.c;
            i(x4.a, x4.b);
            x4 = c3;
        }
    }
    
    public static void i(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append((Object)runnable);
            sb.append(" with executor ");
            sb.append((Object)executor);
            b3.z.log(severe, sb.toString(), (Throwable)ex);
        }
    }
    
    public static Object j(final Object o) {
        if (o instanceof w2) {
            final Throwable b = ((w2)o).b;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ((Throwable)ex).initCause(b);
            throw ex;
        }
        if (!(o instanceof a)) {
            Object o2;
            if ((o2 = o) == b3.B) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((a)o).a);
    }
    
    public static Object k(final Future future) {
        boolean b = false;
        try {
            return future.get();
        }
        catch (final InterruptedException ex) {
            b = true;
            return future.get();
        }
        finally {
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    @Override
    public final void a(final Runnable runnable, final Executor executor) {
        executor.getClass();
        x2 c = this.w;
        final x2 d = x2.d;
        if (c != d) {
            final x2 x2 = new x2(runnable, executor);
            do {
                x2.c = c;
                if (b3.A.i(this, c, x2)) {
                    return;
                }
            } while ((c = this.w) != d);
        }
        i(runnable, executor);
    }
    
    public final void b(final StringBuilder sb) {
        try {
            final Object k = k((Future)this);
            sb.append("SUCCESS, result=[");
            String value;
            if (k == this) {
                value = "this future";
            }
            else {
                value = String.valueOf(k);
            }
            sb.append(value);
            sb.append("]");
            return;
        }
        catch (final RuntimeException ex) {
            goto Label_0050;
        }
        catch (final ExecutionException ex2) {}
        catch (final CancellationException ex3) {
            sb.append("CANCELLED");
            return;
        }
        sb.append("FAILURE, cause=[");
        final ExecutionException ex2;
        sb.append((Object)((Throwable)ex2).getCause());
        sb.append("]");
    }
    
    public final boolean cancel(final boolean b) {
        final Object v = this.v;
        if (v == null) {
            w2 w2;
            if (b3.y) {
                w2 = new w2((Throwable)new CancellationException("Future.cancel() was called."), b);
            }
            else if (b) {
                w2 = w2.c;
            }
            else {
                w2 = w2.d;
            }
            if (b3.A.j(this, v, (Object)w2)) {
                h(this);
                return true;
            }
        }
        return false;
    }
    
    public void e() {
    }
    
    public final Object get() {
        final a3 c = a3.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object v = this.v;
        if (v != null) {
            return j(v);
        }
        a3 a3 = this.x;
        if (a3 != c) {
            final a3 a4 = new a3();
            do {
                final r9n a5 = b3.A;
                a5.P(a4, a3);
                if (a5.k(this, a3, a4)) {
                    Object v2;
                    do {
                        LockSupport.park((Object)this);
                        if (Thread.interrupted()) {
                            this.m(a4);
                            throw new InterruptedException();
                        }
                        v2 = this.v;
                    } while (v2 == null);
                    return j(v2);
                }
            } while ((a3 = this.x) != c);
        }
        return j(this.v);
    }
    
    public final Object get(long convert, final TimeUnit timeUnit) {
        final a3 c = a3.c;
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object v = this.v;
        if (v != null) {
            return j(v);
        }
        long n;
        if (nanos > 0L) {
            n = System.nanoTime() + nanos;
        }
        else {
            n = 0L;
        }
        long n2 = nanos;
        Label_0216: {
            if (nanos >= 1000L) {
                a3 a3 = this.x;
                if (a3 != c) {
                    final a3 a4 = new a3();
                    do {
                        final r9n a5 = b3.A;
                        a5.P(a4, a3);
                        if (a5.k(this, a3, a4)) {
                            do {
                                LockSupport.parkNanos((Object)this, nanos);
                                if (Thread.interrupted()) {
                                    this.m(a4);
                                    throw new InterruptedException();
                                }
                                final Object v2 = this.v;
                                if (v2 != null) {
                                    return j(v2);
                                }
                                n2 = (nanos = n - System.nanoTime());
                            } while (n2 >= 1000L);
                            this.m(a4);
                            break Label_0216;
                        }
                    } while ((a3 = this.x) != c);
                }
                return j(this.v);
            }
        }
        while (n2 > 0L) {
            final Object v3 = this.v;
            if (v3 != null) {
                return j(v3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            n2 = n - System.nanoTime();
        }
        final String string = this.toString();
        final String string2 = timeUnit.toString();
        final Locale root = Locale.ROOT;
        final String lowerCase = string2.toLowerCase(root);
        final StringBuilder u = smk.u(convert, "Waited ", " ");
        u.append(timeUnit.toString().toLowerCase(root));
        String s2;
        final String s = s2 = u.toString();
        if (n2 + 1000L < 0L) {
            final String concat = s.concat(" (plus ");
            final long n3 = -n2;
            convert = timeUnit.convert(n3, TimeUnit.NANOSECONDS);
            final long n4 = n3 - timeUnit.toNanos(convert);
            final long n5 = lcmp(convert, 0L);
            final boolean b = n5 == 0 || n4 > 1000L;
            String concat2 = concat;
            if (n5 > 0) {
                final StringBuilder sb = new StringBuilder(concat);
                sb.append(convert);
                sb.append(" ");
                sb.append(lowerCase);
                String s3 = sb.toString();
                if (b) {
                    s3 = s3.concat(",");
                }
                concat2 = s3.concat(" ");
            }
            String i = concat2;
            if (b) {
                i = hia.i(n4, concat2, " nanoseconds ");
            }
            s2 = i.concat("delay)");
        }
        if (this.isDone()) {
            throw new TimeoutException(s2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(hia.k(s2, " for ", string));
    }
    
    public final boolean isCancelled() {
        return this.v instanceof w2;
    }
    
    public final boolean isDone() {
        return this.v != null;
    }
    
    public String l() {
        if (this instanceof ScheduledFuture) {
            final StringBuilder sb = new StringBuilder("remaining delay=[");
            sb.append(((Delayed)this).getDelay(TimeUnit.MILLISECONDS));
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }
    
    public final void m(a3 x) {
        x.a = null;
    Label_0005:
        while (true) {
            x = this.x;
            if (x == a3.c) {
                break;
            }
            a3 a3 = null;
            while (x != null) {
                final a3 b = x.b;
                a3 a4;
                if (x.a != null) {
                    a4 = x;
                }
                else if (a3 != null) {
                    a3.b = b;
                    a4 = a3;
                    if (a3.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    a4 = a3;
                    if (!b3.A.k(this, x, b)) {
                        continue Label_0005;
                    }
                }
                x = b;
                a3 = a4;
            }
            break;
        }
    }
    
    public boolean n(final Object o) {
        Object b = o;
        if (o == null) {
            b = b3.B;
        }
        if (b3.A.j(this, (Object)null, b)) {
            h(this);
            return true;
        }
        return false;
    }
    
    public boolean o(final Throwable t) {
        if (b3.A.j(this, (Object)null, (Object)new a(t))) {
            h(this);
            return true;
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.v instanceof w2) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.b(sb);
        }
        else {
            String s;
            try {
                s = this.l();
            }
            catch (final RuntimeException ex) {
                final StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append((Object)ex.getClass());
                s = sb2.toString();
            }
            if (s != null && !s.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(s);
                sb.append("]");
            }
            else if (this.isDone()) {
                this.b(sb);
            }
            else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
