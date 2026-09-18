import androidx.work.impl.WorkDatabase;

public final class u4q
{
    public final f5q a;
    public final frh b;
    public final z5q c;
    
    static {
        krd.e("WMFgUpdater");
    }
    
    public u4q(final WorkDatabase workDatabase, final frh b, final f5q a) {
        this.b = b;
        this.a = a;
        this.c = workDatabase.v();
    }
}
