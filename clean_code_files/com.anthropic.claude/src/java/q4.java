import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;

public final class q4
{
    public static final q4 c;
    public static final q4 d;
    public static final q4 e;
    public static final q4 f;
    public static final q4 g;
    public static final q4 h;
    public static final q4 i;
    public static final q4 j;
    public final Object a;
    public final int b;
    
    static {
        new q4(null, 1, null, null);
        new q4(null, 2, null, null);
        new q4(null, 4, null, null);
        new q4(null, 8, null, null);
        new q4(null, 16, null, null);
        new q4(null, 32, null, null);
        c = new q4(null, 64, null, null);
        d = new q4(null, 128, null, null);
        new q4(null, 256, null, i5.class);
        new q4(null, 512, null, i5.class);
        new q4(null, 1024, null, j5.class);
        new q4(null, 2048, null, j5.class);
        e = new q4(null, 4096, null, null);
        f = new q4(null, 8192, null, null);
        new q4(null, 16384, null, null);
        new q4(null, 32768, null, null);
        new q4(null, 65536, null, null);
        new q4(null, 131072, null, n5.class);
        new q4(null, 262144, null, null);
        new q4(null, 524288, null, null);
        new q4(null, 1048576, null, null);
        new q4(null, 2097152, null, o5.class);
        new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null);
        new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, l5.class);
        g = new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null);
        h = new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null);
        i = new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null);
        j = new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null);
        final int sdk_INT = Build$VERSION.SDK_INT;
        AccessibilityNodeInfo$AccessibilityAction b;
        if (sdk_INT >= 29) {
            b = m4.b();
        }
        else {
            b = null;
        }
        new q4(b, 16908358, null, null);
        AccessibilityNodeInfo$AccessibilityAction h2;
        if (sdk_INT >= 29) {
            h2 = m4.h();
        }
        else {
            h2 = null;
        }
        new q4(h2, 16908359, null, null);
        AccessibilityNodeInfo$AccessibilityAction t;
        if (sdk_INT >= 29) {
            t = m4.t();
        }
        else {
            t = null;
        }
        new q4(t, 16908360, null, null);
        AccessibilityNodeInfo$AccessibilityAction x;
        if (sdk_INT >= 29) {
            x = m4.x();
        }
        else {
            x = null;
        }
        new q4(x, 16908361, null, null);
        new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null);
        new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, m5.class);
        new q4(AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, k5.class);
        AccessibilityNodeInfo$AccessibilityAction e2;
        if (sdk_INT >= 28) {
            e2 = k4.e();
        }
        else {
            e2 = null;
        }
        new q4(e2, 16908356, null, null);
        AccessibilityNodeInfo$AccessibilityAction r;
        if (sdk_INT >= 28) {
            r = k4.r();
        }
        else {
            r = null;
        }
        new q4(r, 16908357, null, null);
        AccessibilityNodeInfo$AccessibilityAction o;
        if (sdk_INT >= 30) {
            o = p4.o();
        }
        else {
            o = null;
        }
        new q4(o, 16908362, null, null);
        AccessibilityNodeInfo$AccessibilityAction a;
        if (sdk_INT >= 30) {
            a = p4.A();
        }
        else {
            a = null;
        }
        new q4(a, 16908372, null, null);
        AccessibilityNodeInfo$AccessibilityAction a2;
        if (sdk_INT >= 32) {
            a2 = n4.a();
        }
        else {
            a2 = null;
        }
        new q4(a2, 16908373, null, null);
        AccessibilityNodeInfo$AccessibilityAction b2;
        if (sdk_INT >= 32) {
            b2 = n4.b();
        }
        else {
            b2 = null;
        }
        new q4(b2, 16908374, null, null);
        AccessibilityNodeInfo$AccessibilityAction c2;
        if (sdk_INT >= 32) {
            c2 = n4.c();
        }
        else {
            c2 = null;
        }
        new q4(c2, 16908375, null, null);
        AccessibilityNodeInfo$AccessibilityAction f2;
        if (sdk_INT >= 33) {
            f2 = o4.f();
        }
        else {
            f2 = null;
        }
        new q4(f2, 16908376, null, null);
        AccessibilityNodeInfo$AccessibilityAction a3;
        if (sdk_INT >= 34) {
            a3 = j4.a();
        }
        else {
            a3 = null;
        }
        new q4(a3, 16908382, null, null);
        final int a4 = sn2.a;
        AccessibilityNodeInfo$AccessibilityAction l = null;
        Label_0862: {
            if (sdk_INT >= 36) {
                int a5;
                if (sdk_INT < 36) {
                    a5 = sdk_INT * 100000;
                }
                else {
                    a5 = rn2.a();
                }
                if (a5 >= 3600001) {
                    l = a4r.l();
                    break Label_0862;
                }
            }
            l = null;
        }
        new q4(l, 16908383, null, null);
    }
    
    public q4(final int n, final String s) {
        this(null, n, (CharSequence)s, null);
    }
    
    public q4(final Object a, final int b, final CharSequence charSequence, final Class clazz) {
        this.b = b;
        if (a == null) {
            this.a = new AccessibilityNodeInfo$AccessibilityAction(b, charSequence);
            return;
        }
        this.a = a;
    }
    
    @Override
    public final boolean equals(Object a) {
        if (a == null) {
            return false;
        }
        if (!(a instanceof q4)) {
            return false;
        }
        final Object a2 = ((q4)a).a;
        a = this.a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        }
        else if (!a.equals(a2)) {
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String s2;
        final String s = s2 = x4.d(this.b);
        if (s.equals((Object)"ACTION_UNKNOWN")) {
            final Object a = this.a;
            s2 = s;
            if (((AccessibilityNodeInfo$AccessibilityAction)a).getLabel() != null) {
                s2 = ((AccessibilityNodeInfo$AccessibilityAction)a).getLabel().toString();
            }
        }
        sb.append(s2);
        return sb.toString();
    }
}
