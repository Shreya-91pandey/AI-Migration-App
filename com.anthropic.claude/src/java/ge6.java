import java.util.Map;
import android.os.Trace;
import android.app.PictureInPictureUiState;
import android.view.MenuItem;
import android.view.Menu;
import android.app.Activity;
import java.util.Iterator;
import android.content.res.Configuration;
import java.util.LinkedHashMap;
import android.os.Bundle;
import android.content.Intent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ge6 extends fe6 implements ycp, pcb, j9k, f8g, crf, te, i8g, ita
{
    public final ce6 A;
    public final l7n B;
    public final AtomicInteger C;
    public final ee6 D;
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public final CopyOnWriteArrayList I;
    public final CopyOnWriteArrayList J;
    public final CopyOnWriteArrayList K;
    public boolean L;
    public boolean M;
    public final l7n N;
    public final l7n O;
    public final l7n P;
    public final a09 w;
    public final tze x;
    public final e3a y;
    public xcp z;
    
    public ge6() {
        final a09 w = new a09((byte)1);
        this.w = w;
        this.x = new tze((Runnable)new vd6(this, (byte)1));
        final i9k i9k = new i9k((j9k)this, new lce((Object)this, (byte)28));
        final e3a y = new e3a(i9k);
        this.y = y;
        this.A = new ce6(this);
        this.B = new l7n((jta)new wd6(this, (byte)1));
        this.C = new AtomicInteger();
        this.D = new ee6(this);
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = new CopyOnWriteArrayList();
        this.J = new CopyOnWriteArrayList();
        this.K = new CopyOnWriteArrayList();
        this.N = new l7n((jta)new wd6(this, (byte)2));
        final jbd v = super.v;
        if (v != null) {
            v.a((fbd)new yd6((Object)this, (byte)0));
            super.v.a((fbd)new yd6((Object)this, (byte)1));
            super.v.a((fbd)new j2j(this, (byte)1));
            i9k.a();
            qt7.t(this);
            ((e3a)y.x).P("android:support:activity-result", (h9k)new zd6((Object)this, (byte)0));
            final ae6 ae6 = new ae6(this, (byte)0);
            if (w.x != null) {
                ae6.a();
            }
            ((CopyOnWriteArraySet)w.w).add((Object)ae6);
            this.O = new l7n((jta)new wd6(this, (byte)3));
            this.P = new l7n((jta)new wd6(this, (byte)4));
            return;
        }
        en9.q("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }
    
    public static final void i(final ge6 ge6) {
        try {
            ge6.onBackPressed();
        }
        catch (final NullPointerException ex) {
            if (!mlc.q(((Throwable)ex).getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw ex;
            }
        }
        catch (final IllegalStateException ex2) {
            if (!mlc.q(((Throwable)ex2).getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw ex2;
            }
        }
    }
    
    @Override
    public final void A(final yv6 yv6) {
        this.E.add((Object)yv6);
    }
    
    @Override
    public final void B(final yv6 yv6) {
        this.E.remove((Object)yv6);
    }
    
    @Override
    public final c2l a() {
        return this.e().b().c;
    }
    
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.h();
        final View decorView = this.getWindow().getDecorView();
        decorView.getClass();
        this.A.a(decorView);
        super.addContentView(view, viewGroup$LayoutParams);
    }
    
    @Override
    public final elf b() {
        final elf elf = new elf(0);
        if (this.getApplication() != null) {
            elf.a((hm7)ucp.d, (Object)this.getApplication());
        }
        elf.a((hm7)qt7.b, (Object)this);
        elf.a((hm7)qt7.c, (Object)this);
        final Intent intent = this.getIntent();
        Bundle extras;
        if (intent != null) {
            extras = intent.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            elf.a((hm7)qt7.d, (Object)extras);
        }
        return elf;
    }
    
    public final vad d() {
        return (vad)super.v;
    }
    
    @Override
    public final d8g e() {
        return (d8g)this.P.getValue();
    }
    
    public final vcp g() {
        return (vcp)this.O.getValue();
    }
    
    public final void h() {
        final View decorView = this.getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(2131297128, (Object)this);
        final View decorView2 = this.getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131297132, (Object)this);
        final View decorView3 = this.getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131297131, (Object)this);
        final View decorView4 = this.getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131297130, (Object)this);
        final View decorView5 = this.getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(2131297029, (Object)this);
        final View decorView6 = this.getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(2131297129, (Object)this);
    }
    
    public final pe j(final be be, final rhc rhc) {
        final StringBuilder sb = new StringBuilder("activity_rq#");
        sb.append(this.C.getAndIncrement());
        final String string = sb.toString();
        final ee6 d = this.D;
        final LinkedHashMap c = d.c;
        final jbd v = super.v;
        if (!v.i.a(tad.y)) {
            d.d(string);
            oe oe;
            if ((oe = (oe)c.get((Object)string)) == null) {
                oe = new oe((vad)v);
            }
            final me me = new me(d, string, be, rhc);
            oe.a.a((fbd)me);
            oe.b.add((Object)me);
            ((Map)c).put((Object)string, (Object)oe);
            return new pe(d, string, rhc, (byte)0);
        }
        final StringBuilder sb2 = new StringBuilder("LifecycleOwner ");
        sb2.append((Object)this);
        final tad i = v.i;
        sb2.append(" is attempting to register while current state is ");
        sb2.append((Object)i);
        sb2.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb2.toString().toString());
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (!this.D.a(n, n2, intent)) {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    public final void onBackPressed() {
        ((frf)this.N.getValue()).a();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Iterator iterator = this.E.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            ((yv6)iterator.next()).accept((Object)configuration);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        this.y.M(bundle);
        this.w.b((Context)this);
        super.onCreate(bundle);
        final int w = zdj.w;
        xdj.b((Activity)this);
        ((Context)this).getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0) {
            super.onCreatePanelMenu(n, menu);
            this.getMenuInflater();
            final Iterator iterator = ((CopyOnWriteArrayList)this.x.x).iterator();
            while (iterator.hasNext()) {
                ((ora)iterator.next()).a.l();
            }
        }
        return true;
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        if (n == 0) {
            final Iterator iterator = ((CopyOnWriteArrayList)this.x.x).iterator();
            while (iterator.hasNext()) {
                if (((ora)iterator.next()).a.q()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void onMultiWindowModeChanged(final boolean b) {
        if (!this.L) {
            final Iterator iterator = this.H.iterator();
            iterator.getClass();
            while (iterator.hasNext()) {
                ((yv6)iterator.next()).accept((Object)new ikf(b));
            }
        }
    }
    
    public final void onMultiWindowModeChanged(final boolean b, final Configuration configuration) {
        this.L = true;
        try {
            super.onMultiWindowModeChanged(b, configuration);
            this.L = false;
            final Iterator iterator = this.H.iterator();
            iterator.getClass();
            while (iterator.hasNext()) {
                ((yv6)iterator.next()).accept((Object)new ikf(0, b));
            }
        }
        finally {
            this.L = false;
        }
    }
    
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        final Iterator iterator = this.G.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            ((yv6)iterator.next()).accept((Object)intent);
        }
    }
    
    public final void onPanelClosed(final int n, final Menu menu) {
        final Iterator iterator = ((CopyOnWriteArrayList)this.x.x).iterator();
        while (iterator.hasNext()) {
            ((ora)iterator.next()).a.r();
        }
        super.onPanelClosed(n, menu);
    }
    
    public final void onPictureInPictureModeChanged(final boolean b) {
        if (!this.M) {
            final Iterator iterator = this.I.iterator();
            iterator.getClass();
            while (iterator.hasNext()) {
                ((yv6)iterator.next()).accept((Object)new u7h(b));
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        this.M = true;
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            this.M = false;
            final Iterator iterator = this.I.iterator();
            iterator.getClass();
            while (iterator.hasNext()) {
                ((yv6)iterator.next()).accept((Object)new u7h(0, b));
            }
        }
        finally {
            this.M = false;
        }
    }
    
    public final void onPictureInPictureUiStateChanged(final PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        final ze8 g = alq.g(pictureInPictureUiState);
        final Iterator iterator = this.J.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            ((yv6)iterator.next()).accept((Object)g);
        }
    }
    
    public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n == 0) {
            super.onPreparePanel(n, view, menu);
            final Iterator iterator = ((CopyOnWriteArrayList)this.x.x).iterator();
            while (iterator.hasNext()) {
                ((ora)iterator.next()).a.u();
            }
        }
        return true;
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (!this.D.a(n, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", array2))) {
            super.onRequestPermissionsResult(n, array, array2);
        }
    }
    
    public final Object onRetainNonConfigurationInstance() {
        xcp a;
        final xcp xcp = a = this.z;
        if (xcp == null) {
            final be6 be6 = (be6)this.getLastNonConfigurationInstance();
            a = xcp;
            if (be6 != null) {
                a = be6.a;
            }
        }
        if (a == null) {
            return null;
        }
        final Object o = new Object();
        ((be6)o).a = a;
        return o;
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        final jbd v = super.v;
        if (v != null) {
            v.i(tad.x);
        }
        super.onSaveInstanceState(bundle);
        this.y.N(bundle);
    }
    
    public final void onTrimMemory(final int n) {
        super.onTrimMemory(n);
        final Iterator iterator = this.F.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            ((yv6)iterator.next()).accept((Object)n);
        }
    }
    
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        final Iterator iterator = this.K.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
    }
    
    @Override
    public final ee6 p() {
        return this.D;
    }
    
    public void reportFullyDrawn() {
        try {
            if (omo.P()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((hta)this.B.getValue()).a();
        }
        finally {
            Trace.endSection();
        }
    }
    
    @Override
    public final xcp s() {
        if (this.getApplication() != null) {
            xcp z;
            if ((z = this.z) == null) {
                final be6 be6 = (be6)this.getLastNonConfigurationInstance();
                if (be6 != null) {
                    this.z = be6.a;
                }
                if ((z = this.z) == null) {
                    z = new xcp();
                    this.z = z;
                }
            }
            z.getClass();
            return z;
        }
        en9.q("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }
    
    public final void setContentView(final int contentView) {
        this.h();
        final View decorView = this.getWindow().getDecorView();
        decorView.getClass();
        this.A.a(decorView);
        super.setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        this.h();
        final View decorView = this.getWindow().getDecorView();
        decorView.getClass();
        this.A.a(decorView);
        super.setContentView(contentView);
    }
    
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.h();
        final View decorView = this.getWindow().getDecorView();
        decorView.getClass();
        this.A.a(decorView);
        super.setContentView(view, viewGroup$LayoutParams);
    }
    
    @Override
    public final e3a x() {
        return (e3a)this.y.x;
    }
}
