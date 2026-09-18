import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public final class o4q
{
    public static final String i;
    public final a5q a;
    public final String b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public j9j h;
    
    static {
        i = krd.e("WorkContinuationImpl");
    }
    
    public o4q(final a5q a, final String b, final int c, final List d, int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new ArrayList(d.size());
        this.f = new ArrayList();
        String string;
        for (i = 0; i < d.size(); ++i) {
            if (c == 1 && ((r5q)d.get(i)).b.u != Long.MAX_VALUE) {
                en9.s("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            string = ((r5q)d.get(i)).a.toString();
            string.getClass();
            this.e.add((Object)string);
            this.f.add((Object)string);
        }
    }
    
    public static HashSet b(final o4q o4q) {
        final HashSet set = new HashSet();
        o4q.getClass();
        return set;
    }
    
    public final j9j a() {
        if (!this.g) {
            final a5q a = this.a;
            final eup g = a.b.g;
            final int c = this.c;
            String s;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            throw null;
                        }
                        s = "APPEND_OR_REPLACE";
                    }
                    else {
                        s = "APPEND";
                    }
                }
                else {
                    s = "KEEP";
                }
            }
            else {
                s = "REPLACE";
            }
            this.h = qt7.J(g, "EnqueueRunnable_".concat(s), (Executor)a.d.a, (jta)new wfk((Object)this, (byte)27));
        }
        else {
            final krd c2 = krd.c();
            final StringBuilder sb = new StringBuilder("Already enqueued work ids (");
            sb.append(TextUtils.join((CharSequence)", ", (Iterable)this.e));
            sb.append(")");
            c2.f(o4q.i, sb.toString());
        }
        return this.h;
    }
}
