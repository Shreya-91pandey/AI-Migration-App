import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.AccessibleObject;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Objects;
import android.view.ViewParent;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.View$AccessibilityDelegate;
import android.view.WindowInsets;
import android.os.Build$VERSION;
import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

public abstract class gap
{
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final r9p d;
    public static final t9p e;
    
    static {
        d = (r9p)new Object();
        e = new t9p();
    }
    
    public static adp a(final View view) {
        WeakHashMap a;
        if ((a = gap.a) == null) {
            a = (gap.a = new WeakHashMap());
        }
        adp adp;
        if ((adp = (adp)a.get((Object)view)) == null) {
            adp = new adp(view);
            gap.a.put((Object)view, (Object)adp);
        }
        return adp;
    }
    
    public static void b(final View view, final h2q h2q) {
        final WindowInsets b = h2q.b();
        if (b != null) {
            WindowInsets windowInsets;
            if (Build$VERSION.SDK_INT >= 30) {
                windowInsets = cap.a(view, b);
            }
            else {
                windowInsets = u9p.a(view, b);
            }
            if (!windowInsets.equals((Object)b)) {
                h2q.c(windowInsets, view);
            }
        }
    }
    
    public static View$AccessibilityDelegate c(final View view) {
        if (Build$VERSION.SDK_INT >= 29) {
            return bap.a(view);
        }
        if (!gap.c) {
            if (gap.b == null) {
                try {
                    ((AccessibleObject)(gap.b = View.class.getDeclaredField("mAccessibilityDelegate"))).setAccessible(true);
                }
                finally {
                    gap.c = true;
                    return null;
                }
            }
            try {
                final Object value = gap.b.get((Object)view);
                if (value instanceof View$AccessibilityDelegate) {
                    return (View$AccessibilityDelegate)value;
                }
            }
            finally {
                gap.c = true;
            }
        }
        return null;
    }
    
    public static String[] d(final ul0 ul0) {
        if (Build$VERSION.SDK_INT >= 31) {
            return dap.a((View)ul0);
        }
        return (String[])((View)ul0).getTag(2131297097);
    }
    
    public static void e(final View source, final int n) {
        final AccessibilityManager accessibilityManager = (AccessibilityManager)source.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            final boolean b = new s9p((byte)1).a(source) != null && source.isShown() && source.getWindowVisibility() == 0;
            final int accessibilityLiveRegion = source.getAccessibilityLiveRegion();
            int eventType = 32;
            if (accessibilityLiveRegion != 0 || b) {
                final AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!b) {
                    eventType = 2048;
                }
                obtain.setEventType(eventType);
                obtain.setContentChangeTypes(n);
                if (b) {
                    ((AccessibilityRecord)obtain).getText().add((Object)new s9p((byte)1).a(source));
                    if (source.getImportantForAccessibility() == 0) {
                        source.setImportantForAccessibility(1);
                    }
                }
                source.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (n == 32) {
                final AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                source.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(n);
                ((AccessibilityRecord)obtain2).setSource(source);
                source.onPopulateAccessibilityEvent(obtain2);
                ((AccessibilityRecord)obtain2).getText().add((Object)new s9p((byte)1).a(source));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (source.getParent() != null) {
                final ViewParent parent = source.getParent();
                try {
                    parent.notifySubtreeAccessibilityStateChanged(source, source, n);
                }
                catch (final AbstractMethodError abstractMethodError) {
                    Log.e("ViewCompat", source.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), (Throwable)abstractMethodError);
                }
            }
        }
    }
    
    public static tx6 f(final View view, tx6 a) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString((Object)a);
            view.getClass();
            view.getId();
        }
        if (Build$VERSION.SDK_INT >= 31) {
            return dap.b(view, a);
        }
        final ynn ynn = (ynn)view.getTag(2131297096);
        Object d = gap.d;
        if (ynn == null) {
            if (view instanceof x8g) {
                d = view;
            }
            return ((x8g)d).a(a);
        }
        a = ynn.a(view, a);
        if (a == null) {
            return null;
        }
        if (view instanceof x8g) {
            d = view;
        }
        return ((x8g)d).a(a);
    }
    
    public static View g(View viewById, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return (View)aap.f(viewById, n);
        }
        viewById = viewById.findViewById(n);
        if (viewById != null) {
            return viewById;
        }
        en9.s("ID does not reference a View inside this View");
        return null;
    }
    
    public static void h(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n) {
        if (Build$VERSION.SDK_INT >= 29) {
            bap.b(view, context, array, set, typedArray, n, 0);
        }
    }
    
    public static void i(final View view, final w3 w3) {
        w3 w4 = w3;
        if (w3 == null) {
            w4 = w3;
            if (c(view) instanceof v3) {
                w4 = new w3();
            }
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        View$AccessibilityDelegate w5;
        if (w4 == null) {
            w5 = null;
        }
        else {
            w5 = w4.w;
        }
        view.setAccessibilityDelegate(w5);
    }
    
    public static void j(final View view, final CharSequence charSequence) {
        boolean b = true;
        new s9p((byte)1).b(view, (Object)charSequence);
        final t9p e = gap.e;
        if (charSequence != null) {
            final WeakHashMap v = e.v;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                b = false;
            }
            v.put((Object)view, (Object)b);
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)e);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)e);
            }
            return;
        }
        e.v.remove((Object)view);
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)e);
        view.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)e);
    }
}
