import android.os.Build$VERSION;
import android.content.Context;

public final class ddo
{
    public final Context a;
    public final cv6 b;
    public final rz1 c;
    public final ttf d;
    public final cv6 e;
    
    public ddo(final Context a, final f5q f5q) {
        final Context applicationContext = a.getApplicationContext();
        applicationContext.getClass();
        final rz1 b = new rz1(applicationContext, f5q, (byte)0);
        final Context applicationContext2 = a.getApplicationContext();
        applicationContext2.getClass();
        final rz1 c = new rz1(applicationContext2, f5q, (byte)1);
        ttf a2;
        if (Build$VERSION.SDK_INT < 28) {
            final Context applicationContext3 = a.getApplicationContext();
            applicationContext3.getClass();
            a2 = stf.a(applicationContext3, f5q);
        }
        else {
            a2 = null;
        }
        final Context applicationContext4 = a.getApplicationContext();
        applicationContext4.getClass();
        final rz1 e = new rz1(applicationContext4, f5q, (byte)2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a2;
        this.e = e;
    }
}
