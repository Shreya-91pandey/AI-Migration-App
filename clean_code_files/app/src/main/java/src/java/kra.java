import android.app.Activity;
import java.util.Collection;
import android.view.MenuItem;
import android.util.AttributeSet;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build$VERSION;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;

public abstract class kra extends ge6
{
    public final jy7 Q;
    public final jbd R;
    public boolean S;
    public boolean T;
    public boolean U;
    
    public kra() {
        this.Q = new jy7((Object)new jra(this), (byte)17);
        this.R = new jbd((gbd)this, true);
        this.U = true;
        ((e3a)super.y.x).P("android:support:lifecycle", (h9k)new zd6((Object)this, (byte)2));
        this.A((yv6)new ira((Object)this, (byte)0));
        super.G.add((Object)new ira((Object)this, (byte)1));
        final ae6 ae6 = new ae6((ge6)this, (byte)1);
        final a09 w = super.w;
        if (w.x != null) {
            ae6.a();
        }
        ((CopyOnWriteArraySet)w.w).add((Object)ae6);
    }
    
    public static boolean k(final vra vra) {
        final Iterator iterator = ((Collection)vra.c.A()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final hra hra = (hra)iterator.next();
            if (hra == null) {
                continue;
            }
            final jra p = hra.P;
            kra b;
            if (p == null) {
                b = null;
            }
            else {
                b = p.B;
            }
            int n2 = n;
            if (b != null) {
                n2 = (n | (k(hra.g()) ? 1 : 0));
            }
            final esa k0 = hra.k0;
            final tad y = tad.y;
            n = n2;
            if (k0 != null) {
                n = n2;
                if (((jbd)k0.d()).i.a(y)) {
                    hra.k0.f();
                    n = (true ? 1 : 0);
                }
            }
            if (!hra.i0.i.a(y)) {
                continue;
            }
            hra.i0.i(tad.x);
            n = (true ? 1 : 0);
        }
        return n != 0;
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        Label_0183: {
            if (array != null) {
                if (array.length != 0) {
                    final String s2 = array[0];
                    switch (s2.hashCode()) {
                        default: {
                            break Label_0183;
                        }
                        case 1455016274: {
                            if (!s2.equals((Object)"--autofill")) {
                                break Label_0183;
                            }
                            return;
                        }
                        case 1159329357: {
                            if (!s2.equals((Object)"--contentcapture")) {
                                break Label_0183;
                            }
                            if (Build$VERSION.SDK_INT >= 29) {
                                return;
                            }
                            break Label_0183;
                        }
                        case 472614934: {
                            if (!s2.equals((Object)"--list-dumpables")) {
                                break Label_0183;
                            }
                            break;
                        }
                        case 100470631: {
                            if (!s2.equals((Object)"--dump-dumpable")) {
                                break Label_0183;
                            }
                            break;
                        }
                        case -645125871: {
                            if (!s2.equals((Object)"--translation")) {
                                break Label_0183;
                            }
                            if (Build$VERSION.SDK_INT >= 31) {
                                return;
                            }
                            break Label_0183;
                        }
                    }
                    if (Build$VERSION.SDK_INT < 33) {
                        break Label_0183;
                    }
                    return;
                }
            }
        }
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode((Object)this)));
        printWriter.println(" State:");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("  ");
        final String string = sb.toString();
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.S);
        printWriter.print(" mResumed=");
        printWriter.print(this.T);
        printWriter.print(" mStopped=");
        printWriter.print(this.U);
        if (((Activity)this).getApplication() != null) {
            sn9.P((gbd)this).N(string, printWriter);
        }
        ((jra)this.Q.w).A.w(s, fileDescriptor, printWriter, array);
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        this.Q.w();
        super.onActivityResult(n, n2, intent);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.R.g(rad.ON_CREATE);
        final vra a = ((jra)this.Q.w).A;
        a.H = false;
        a.I = false;
        a.O.g = false;
        a.v(1);
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final lra lra = (lra)((jra)this.Q.w).A.f.onCreateView(view, s, context, set);
        if (lra == null) {
            return super.onCreateView(view, s, context, set);
        }
        return (View)lra;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        final lra lra = (lra)((jra)this.Q.w).A.f.onCreateView(null, s, context, set);
        if (lra == null) {
            return super.onCreateView(s, context, set);
        }
        return (View)lra;
    }
    
    public void onDestroy() {
        super.onDestroy();
        ((jra)this.Q.w).A.m();
        this.R.g(rad.ON_DESTROY);
    }
    
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return super.onMenuItemSelected(n, menuItem) || (n == 6 && ((jra)this.Q.w).A.k());
    }
    
    public final void onPause() {
        super.onPause();
        this.T = false;
        final vra a = ((jra)this.Q.w).A;
        if (a.h != null) {
            a.d();
        }
        a.v(5);
        this.R.g(rad.ON_PAUSE);
    }
    
    public final void onPostResume() {
        super.onPostResume();
        this.R.g(rad.ON_RESUME);
        final vra a = ((jra)this.Q.w).A;
        a.H = false;
        a.I = false;
        a.O.g = false;
        a.v(7);
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.Q.w();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public final void onResume() {
        final jy7 q = this.Q;
        q.w();
        super.onResume();
        this.T = true;
        ((jra)q.w).A.A(true);
    }
    
    public final void onStart() {
        final jy7 q = this.Q;
        q.w();
        final jra jra = (jra)q.w;
        super.onStart();
        this.U = false;
        if (!this.S) {
            this.S = true;
            final vra a = jra.A;
            a.H = false;
            a.I = false;
            a.O.g = false;
            a.v(4);
        }
        jra.A.A(true);
        this.R.g(rad.ON_START);
        final vra a2 = jra.A;
        a2.H = false;
        a2.I = false;
        a2.O.g = false;
        a2.v(5);
    }
    
    public final void onStateNotSaved() {
        this.Q.w();
    }
    
    public final void onStop() {
        super.onStop();
        this.U = true;
        jy7 q;
        do {
            q = this.Q;
        } while (k(((jra)q.w).A));
        final vra a = ((jra)q.w).A;
        a.I = true;
        a.O.g = true;
        a.v(4);
        this.R.g(rad.ON_STOP);
    }
}
