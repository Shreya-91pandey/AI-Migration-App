import android.view.ViewGroup;
import android.animation.LayoutTransition;
import android.view.ViewParent;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import java.util.WeakHashMap;
import android.view.WindowInsets;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Iterator;
import android.app.Activity;
import android.content.res.TypedArray;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import java.util.ArrayList;
import android.widget.FrameLayout;

public final class lra extends FrameLayout
{
    public final ArrayList v;
    public final ArrayList w;
    public View$OnApplyWindowInsetsListener x;
    public boolean y;
    
    public lra(final Context context, AttributeSet q, final vra o) {
        super(context, q);
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.y = true;
        final String classAttribute = q.getClassAttribute();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q, zni.b, 0, 0);
        obtainStyledAttributes.getClass();
        String string = classAttribute;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final String string2 = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        final int id = ((View)this).getId();
        final hra c = o.C(id);
        Label_0530: {
            if (string != null && c == null) {
                if (id == -1) {
                    String string3;
                    if (string2 != null) {
                        final StringBuilder sb = new StringBuilder(" with tag ");
                        sb.append((Object)string2);
                        string3 = sb.toString();
                    }
                    else {
                        string3 = "";
                    }
                    uy8.e((Object)string, (Object)string3, "FragmentContainerView must have an android:id to add Fragment ");
                    throw null;
                }
                final pra g = o.G();
                context.getClassLoader();
                final hra a = g.a(string);
                a.getClass();
                a.S = id;
                a.T = id;
                a.U = string2;
                a.O = o;
                final jra w = o.w;
                a.P = w;
                a.Z = true;
                Activity x;
                if (w == null) {
                    x = null;
                }
                else {
                    x = w.x;
                }
                if (x != null) {
                    a.Z = true;
                }
                final cp1 cp1 = new cp1(o);
                cp1.o = true;
                a.a0 = (ViewGroup)this;
                a.K = true;
                cp1.f(((View)this).getId(), a, string2);
                if (!cp1.g) {
                    q = (AttributeSet)cp1.q;
                    if (((vra)q).w == null) {
                        break Label_0530;
                    }
                    if (((vra)q).J) {
                        break Label_0530;
                    }
                    ((vra)q).z(true);
                    final cp1 h = ((vra)q).h;
                    if (h != null) {
                        h.r = false;
                        h.d();
                        if (vra.I(3)) {
                            Objects.toString((Object)((vra)q).h);
                            Objects.toString((Object)cp1);
                        }
                        ((vra)q).h.e(false, false);
                        ((vra)q).h.a(((vra)q).L, ((vra)q).M);
                        final Iterator iterator = ((vra)q).h.a.iterator();
                        while (iterator.hasNext()) {
                            final hra b = ((dsa)iterator.next()).b;
                            if (b != null) {
                                b.H = false;
                            }
                        }
                        ((vra)q).h = null;
                    }
                    cp1.a(((vra)q).L, ((vra)q).M);
                    ((vra)q).b = true;
                    try {
                        ((vra)q).U(((vra)q).L, ((vra)q).M);
                        ((vra)q).e();
                        ((vra)q).e0();
                        if (((vra)q).K) {
                            ((vra)q).K = false;
                            ((vra)q).c0();
                        }
                        ((HashMap)((vra)q).c.x).values().removeAll((Collection)Collections.singleton((Object)null));
                        break Label_0530;
                    }
                    finally {
                        ((vra)q).e();
                    }
                }
                en9.q("This transaction is already being added to the back stack");
                throw null;
            }
        }
        final Iterator iterator2 = o.c.y().iterator();
        while (iterator2.hasNext()) {
            iterator2.next().getClass();
            ((View)this).getId();
        }
    }
    
    public final void a(final View view) {
        if (this.w.contains((Object)view)) {
            this.v.add((Object)view);
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final Object tag = view.getTag(2131296474);
        hra hra;
        if (tag instanceof hra) {
            hra = (hra)tag;
        }
        else {
            hra = null;
        }
        if (hra != null) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        en9.p((Object)view, (Object)" is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
    }
    
    public final WindowInsets dispatchApplyWindowInsets(final WindowInsets windowInsets) {
        final h2q c = h2q.c(windowInsets, null);
        final View$OnApplyWindowInsetsListener x = this.x;
        h2q h2q;
        if (x != null) {
            h2q = h2q.c(x.onApplyWindowInsets((View)this, windowInsets), null);
        }
        else {
            final WeakHashMap a = gap.a;
            final WindowInsets b = c.b();
            h2q = c;
            if (b != null) {
                h2q = c;
                if (!b.equals((Object)b)) {
                    h2q = h2q.c(b, (View)this);
                }
            }
        }
        if (!h2q.a.s()) {
            for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
                gap.b(((ViewGroup)this).getChildAt(i), h2q);
            }
        }
        return windowInsets;
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        if (this.y) {
            final Iterator iterator = this.v.iterator();
            while (iterator.hasNext()) {
                super.drawChild(canvas, (View)iterator.next(), ((View)this).getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        if (this.y) {
            final ArrayList v = this.v;
            if (!v.isEmpty() && v.contains((Object)view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, n);
    }
    
    public final void endViewTransition(final View view) {
        this.w.remove((Object)view);
        if (this.v.remove((Object)view)) {
            this.y = true;
        }
        super.endViewTransition(view);
    }
    
    public final <F extends hra> F getFragment() {
        Object o = this;
        while (true) {
            while (o != null) {
                final Object tag = ((View)o).getTag(2131296474);
                hra hra;
                if (tag instanceof hra) {
                    hra = (hra)tag;
                }
                else {
                    hra = null;
                }
                if (hra != null) {
                    if (hra == null) {
                        Context context = ((View)this).getContext();
                        while (true) {
                            while (context instanceof ContextWrapper) {
                                if (context instanceof kra) {
                                    final kra kra = (kra)context;
                                    if (kra != null) {
                                        final vra vra = ((jra)kra.Q.w).A;
                                        return (F)vra.C(((View)this).getId());
                                    }
                                    uy8.e((Object)this, (Object)" is not within a subclass of FragmentActivity.", "View ");
                                    return null;
                                }
                                else {
                                    context = ((ContextWrapper)context).getBaseContext();
                                }
                            }
                            final kra kra = null;
                            continue;
                        }
                    }
                    if (!hra.n()) {
                        final StringBuilder sb = new StringBuilder("The Fragment ");
                        sb.append((Object)hra);
                        sb.append(" that owns View ");
                        sb.append((Object)this);
                        sb.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                        throw new IllegalStateException(sb.toString());
                    }
                    final vra vra = hra.g();
                    return (F)vra.C(((View)this).getId());
                }
                final ViewParent parent = ((View)o).getParent();
                if (parent instanceof View) {
                    o = parent;
                }
                else {
                    o = null;
                }
            }
            hra hra = null;
            continue;
        }
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        return windowInsets;
    }
    
    public final void removeAllViewsInLayout() {
        for (int n = ((ViewGroup)this).getChildCount() - 1; -1 < n; --n) {
            final View child = ((ViewGroup)this).getChildAt(n);
            child.getClass();
            this.a(child);
        }
        super.removeAllViewsInLayout();
    }
    
    public final void removeView(final View view) {
        this.a(view);
        super.removeView(view);
    }
    
    public final void removeViewAt(final int n) {
        final View child = ((ViewGroup)this).getChildAt(n);
        child.getClass();
        this.a(child);
        super.removeViewAt(n);
    }
    
    public final void removeViewInLayout(final View view) {
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public final void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            child.getClass();
            this.a(child);
        }
        super.removeViews(n, n2);
    }
    
    public final void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            child.getClass();
            this.a(child);
        }
        super.removeViewsInLayout(n, n2);
    }
    
    public final void setDrawDisappearingViewsLast(final boolean y) {
        this.y = y;
    }
    
    public void setLayoutTransition(final LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public void setOnApplyWindowInsetsListener(final View$OnApplyWindowInsetsListener x) {
        this.x = x;
    }
    
    public final void startViewTransition(final View view) {
        if (view.getParent() == this) {
            this.w.add((Object)view);
        }
        super.startViewTransition(view);
    }
}
