import java.lang.ref.Reference;
import androidx.compose.ui.node.Owner;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.util.AttributeSet;
import android.content.Context;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;

public abstract class n0 extends ViewGroup
{
    public qn1 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public WeakReference v;
    public IBinder w;
    public b9q x;
    public tl6 y;
    public zh6 z;
    
    public n0(final Context context) {
        super(context, (AttributeSet)null, 0);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        ((View)this).setImportantForAccessibility(1);
        final j70 j70 = new j70((Object)this, (byte)1);
        ((View)this).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)j70);
        final hap hap = new hap(this);
        zn2.C((View)this).a.add((Object)hap);
        this.A = new qn1((Object)this, (Object)j70, (Object)hap, (byte)25);
    }
    
    private final void setParentContext(final tl6 y) {
        if (this.y != y) {
            if ((this.y = y) != null) {
                this.v = null;
            }
            final b9q x = this.x;
            if (x != null) {
                x.a();
                this.x = null;
                if (((View)this).isAttachedToWindow()) {
                    this.f();
                }
            }
        }
    }
    
    private final void setPreviousAttachedWindowToken(final IBinder w) {
        if (this.w != w) {
            this.w = w;
            this.v = null;
        }
    }
    
    public abstract void a(final int p0, final gva p1);
    
    public final void addView(final View view) {
        this.c();
        super.addView(view);
    }
    
    public final void addView(final View view, final int n) {
        this.c();
        super.addView(view, n);
    }
    
    public final void addView(final View view, final int n, final int n2) {
        this.c();
        super.addView(view, n, n2);
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        super.addView(view, viewGroup$LayoutParams);
    }
    
    public final boolean addViewInLayout(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        return super.addViewInLayout(view, n, viewGroup$LayoutParams);
    }
    
    public final boolean addViewInLayout(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        this.c();
        return super.addViewInLayout(view, n, viewGroup$LayoutParams, b);
    }
    
    public final void b() {
        if (((View)this).isAttachedToWindow()) {
            this.setPreviousAttachedWindowToken(((View)this).getWindowToken());
            if (this.z == null) {
                final int childCount = this.getChildCount();
                AndroidComposeView androidComposeView = null;
                if (childCount != 0) {
                    final View child = this.getChildAt(0);
                    if (child instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView)child;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(this.l(r9n.v((View)this), androidComposeView.getComposeViewContext()));
                }
            }
            if (this.getShouldCreateCompositionOnAttachedToWindow()) {
                this.f();
            }
        }
    }
    
    public final void c() {
        if (this.C) {
            return;
        }
        oyl.s(hia.k("Cannot add views to ", this.getClass().getSimpleName(), "; only Compose content is supported"));
    }
    
    public final void d() {
        if (this.y == null && !((View)this).isAttachedToWindow()) {
            final zh6 z = this.z;
            if (z == null || !z.a.isAttachedToWindow()) {
                en9.q("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
                return;
            }
        }
        this.f();
    }
    
    public final void e() {
        final View child = this.getChildAt(0);
        AndroidComposeView androidComposeView;
        if (child instanceof AndroidComposeView) {
            androidComposeView = (AndroidComposeView)child;
        }
        else {
            androidComposeView = null;
        }
        if (androidComposeView != null && androidComposeView.Y0) {
            androidComposeView.getComposeViewContext().b();
            androidComposeView.Y0 = false;
        }
        final b9q x = this.x;
        if (x != null) {
            x.a();
        }
        this.x = null;
        ((View)this).requestLayout();
    }
    
    public final void f() {
        if (this.x != null) {
            return;
        }
        Label_0090: {
            Label_0085: {
                try {
                    this.C = true;
                    Trace.beginSection("Compose:initializeView");
                    try {
                        if (this.z == null) {
                            this.i();
                        }
                    }
                    finally {
                        break Label_0085;
                    }
                    final zh6 zh6;
                    this.x = h9q.a(this, zh6, new ye6(1003123809, true, (Object)new l0((Object)this, (byte)0)));
                    Trace.endSection();
                    this.C = false;
                    return;
                }
                finally {
                    break Label_0090;
                }
            }
            Trace.endSection();
            throw;
        }
        this.C = false;
    }
    
    public void g(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final View child = this.getChildAt(0);
        if (child != null) {
            child.layout(((View)this).getPaddingLeft(), ((View)this).getPaddingTop(), n3 - n - ((View)this).getPaddingRight(), n4 - n2 - ((View)this).getPaddingBottom());
        }
    }
    
    public final int getAutoClearFocusBehavior-4UtRPd4() {
        final Object tag = ((View)this).getTag(2131296328);
        xj1 xj1;
        if (tag instanceof xj1) {
            xj1 = (xj1)tag;
        }
        else {
            xj1 = null;
        }
        if (xj1 != null) {
            return xj1.b();
        }
        return 1;
    }
    
    public final zh6 getComposeViewContext$ui() {
        return this.z;
    }
    
    public final boolean getHasComposition() {
        return this.x != null;
    }
    
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }
    
    public final boolean getShowLayoutBounds() {
        return this.B;
    }
    
    public void h(int paddingRight, int measuredHeight) {
        final View child = this.getChildAt(0);
        if (child == null) {
            super.onMeasure(paddingRight, measuredHeight);
            return;
        }
        child.measure(View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(paddingRight) - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight()), View$MeasureSpec.getMode(paddingRight)), View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(measuredHeight) - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()), View$MeasureSpec.getMode(measuredHeight)));
        final int measuredWidth = child.getMeasuredWidth();
        final int paddingLeft = ((View)this).getPaddingLeft();
        paddingRight = ((View)this).getPaddingRight();
        measuredHeight = child.getMeasuredHeight();
        ((View)this).setMeasuredDimension(paddingRight + (paddingLeft + measuredWidth), ((View)this).getPaddingBottom() + (((View)this).getPaddingTop() + measuredHeight));
    }
    
    public final zh6 i() {
        final int childCount = this.getChildCount();
        final ycp ycp = null;
        zh6 composeViewContext = null;
        Label_0049: {
            if (childCount != 0) {
                final View child = this.getChildAt(0);
                AndroidComposeView androidComposeView;
                if (child instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView)child;
                }
                else {
                    androidComposeView = null;
                }
                if (androidComposeView != null) {
                    composeViewContext = androidComposeView.getComposeViewContext();
                    break Label_0049;
                }
            }
            composeViewContext = null;
        }
        final View v = r9n.v((View)this);
        final zh6 a = r9n.A(v);
        if (a == null) {
            final tl6 k = this.k();
            gbd y;
            if ((y = eqi.Y(v)) == null) {
                gbd d;
                if (composeViewContext != null) {
                    d = composeViewContext.d();
                }
                else {
                    d = null;
                }
                if (d == null) {
                    en9.q("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                    return null;
                }
                y = d;
            }
            j9k h0;
            if ((h0 = uuj.h0(v)) == null) {
                j9k e;
                if (composeViewContext != null) {
                    composeViewContext.g();
                    e = composeViewContext.e;
                    e.getClass();
                }
                else {
                    e = null;
                }
                if (e == null) {
                    en9.q("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                    return null;
                }
                h0 = e;
            }
            ycp ycp2 = r6k.t(v);
            if (ycp2 == null) {
                ycp2 = ycp;
                if (composeViewContext != null) {
                    composeViewContext.g();
                    ycp2 = composeViewContext.f;
                }
            }
            final zh6 zh6 = new zh6(r9n.A(r9n.v(v)), v, k, y, h0, ycp2);
            v.setTag(2131296322, (Object)new WeakReference((Object)zh6));
            return zh6;
        }
        return this.l(v, a);
    }
    
    public final boolean isTransitionGroup() {
        return !this.D || super.isTransitionGroup();
    }
    
    public final tl6 k() {
        Object y;
        if ((y = this.y) == null) {
            tl6 a = b3q.a((View)this);
            if (a == null) {
                ViewParent viewParent = ((View)this).getParent();
                tl6 a2 = a;
                while (true) {
                    a = a2;
                    if (a2 != null) {
                        break;
                    }
                    a = a2;
                    if (!(viewParent instanceof View)) {
                        break;
                    }
                    final View view = (View)viewParent;
                    a2 = b3q.a(view);
                    viewParent = soh.z(view);
                }
            }
            final g0j w = g0j.w;
            final Object o = null;
            tl6 tl6;
            if (a != null) {
                Object o2;
                if (a instanceof j0j && ((Enum)((j0j)a).w.getValue()).compareTo((Enum)w) <= 0) {
                    o2 = null;
                }
                else {
                    o2 = a;
                }
                tl6 = a;
                if (o2 != null) {
                    this.v = new WeakReference(o2);
                    tl6 = a;
                }
            }
            else {
                tl6 = null;
            }
            if ((y = tl6) == null) {
                final WeakReference v = this.v;
                tl6 tl8 = null;
                Label_0202: {
                    if (v != null) {
                        final tl6 tl7 = (tl6)((Reference)v).get();
                        if (tl7 != null) {
                            tl8 = tl7;
                            if (!(tl7 instanceof j0j)) {
                                break Label_0202;
                            }
                            if (((Enum)((j0j)tl7).w.getValue()).compareTo((Enum)w) > 0) {
                                tl8 = tl7;
                                break Label_0202;
                            }
                        }
                    }
                    tl8 = null;
                }
                if ((y = tl8) == null) {
                    final j0j b = b3q.b((View)this);
                    Object o3 = o;
                    if (((Enum)b.w.getValue()).compareTo((Enum)w) > 0) {
                        o3 = b;
                    }
                    y = b;
                    if (o3 != null) {
                        this.v = new WeakReference(o3);
                        y = b;
                    }
                }
            }
        }
        return (tl6)y;
    }
    
    public final zh6 l(final View view, final zh6 zh6) {
        final tl6 k = this.k();
        final gbd y = eqi.Y(view);
        final ycp t = r6k.t(view);
        final j9k h0 = uuj.h0(view);
        if (k == zh6.c() && y == zh6.d()) {
            zh6.g();
            if (t == zh6.f) {
                zh6.g();
                final j9k e = zh6.e;
                e.getClass();
                if (h0 == e) {
                    return zh6;
                }
            }
        }
        if (k.k() != zh6.c().k()) {
            this.e();
        }
        gbd d;
        if ((d = y) == null) {
            d = zh6.d();
        }
        j9k e2;
        if ((e2 = h0) == null) {
            zh6.g();
            e2 = zh6.e;
            e2.getClass();
        }
        final zh6 zh7 = new zh6(zh6, view, k, d, e2, t);
        view.setTag(2131296322, (Object)new WeakReference((Object)zh7));
        return zh7;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final tmf a = b3q.a;
        ViewParent viewParent = soh.z((View)this);
        Object o = this;
        while (viewParent instanceof View) {
            final View view = (View)viewParent;
            if (view.getId() == 16908290) {
                break;
            }
            viewParent = view.getParent();
            o = view;
        }
        if (((View)o).getParent() == null) {
            ((View)this).getHandler().postAtFrontOfQueue((Runnable)new m0((Object)this, (byte)0));
            return;
        }
        this.b();
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.g(b, n, n2, n3, n4);
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.f();
        this.h(n, n2);
    }
    
    public final void onRtlPropertiesChanged(final int layoutDirection) {
        final View child = this.getChildAt(0);
        if (child != null) {
            child.setLayoutDirection(layoutDirection);
        }
    }
    
    public final void setAutoClearFocusBehavior-17tfJxM(final int n) {
        ((View)this).setTag(2131296328, (Object)xj1.a(n));
    }
    
    public final void setComposeViewContext$ui(final zh6 zh6) {
        if (this.z != zh6) {
            if (zh6 == null) {
                this.e();
            }
            else if (this.getChildCount() != 0) {
                final View child = this.getChildAt(0);
                AndroidComposeView androidComposeView;
                if (child instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView)child;
                }
                else {
                    androidComposeView = null;
                }
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != zh6.c().k()) {
                        this.e();
                    }
                    androidComposeView.setComposeViewContext(zh6);
                }
            }
            this.z = zh6;
        }
    }
    
    public final void setParentCompositionContext(final tl6 parentContext) {
        this.setParentContext(parentContext);
    }
    
    public final void setShowLayoutBounds(final boolean b) {
        this.B = b;
        final View child = this.getChildAt(0);
        if (child != null) {
            ((Owner)child).setShowLayoutBounds(b);
        }
    }
    
    public void setTransitionGroup(final boolean transitionGroup) {
        super.setTransitionGroup(transitionGroup);
        this.D = true;
    }
    
    public final void setViewCompositionStrategy(final iap iap) {
        final qn1 a = this.A;
        if (a != null) {
            a.a();
        }
        ((xp7)iap).getClass();
        final j70 j70 = new j70((Object)this, (byte)1);
        ((View)this).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)j70);
        final hap hap = new hap(this);
        zn2.C((View)this).a.add((Object)hap);
        this.A = new qn1((Object)this, (Object)j70, (Object)hap, (byte)25);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
