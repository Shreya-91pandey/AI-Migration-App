import android.os.BaseBundle;
import java.util.List;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.text.SpannableString;
import android.text.TextUtils;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;

public final class x4
{
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;
    
    public x4(final AccessibilityNodeInfo a) {
        this.b = -1;
        this.c = -1;
        this.a = a;
    }
    
    public static String d(final int n) {
        if (n == 1) {
            return "ACTION_FOCUS";
        }
        if (n == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                return "ACTION_UNKNOWN";
                                            }
                                            case 16908383: {
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            }
                                            case 16908382: {
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            }
                                        }
                                        break;
                                    }
                                    case 16908375: {
                                        return "ACTION_DRAG_CANCEL";
                                    }
                                    case 16908374: {
                                        return "ACTION_DRAG_DROP";
                                    }
                                    case 16908373: {
                                        return "ACTION_DRAG_START";
                                    }
                                    case 16908372: {
                                        return "ACTION_IME_ENTER";
                                    }
                                }
                                break;
                            }
                            case 16908362: {
                                return "ACTION_PRESS_AND_HOLD";
                            }
                            case 16908361: {
                                return "ACTION_PAGE_RIGHT";
                            }
                            case 16908360: {
                                return "ACTION_PAGE_LEFT";
                            }
                            case 16908359: {
                                return "ACTION_PAGE_DOWN";
                            }
                            case 16908358: {
                                return "ACTION_PAGE_UP";
                            }
                            case 16908357: {
                                return "ACTION_HIDE_TOOLTIP";
                            }
                            case 16908356: {
                                return "ACTION_SHOW_TOOLTIP";
                            }
                        }
                        break;
                    }
                    case 16908349: {
                        return "ACTION_SET_PROGRESS";
                    }
                    case 16908348: {
                        return "ACTION_CONTEXT_CLICK";
                    }
                    case 16908347: {
                        return "ACTION_SCROLL_RIGHT";
                    }
                    case 16908346: {
                        return "ACTION_SCROLL_DOWN";
                    }
                    case 16908345: {
                        return "ACTION_SCROLL_LEFT";
                    }
                    case 16908344: {
                        return "ACTION_SCROLL_UP";
                    }
                    case 16908343: {
                        return "ACTION_SCROLL_TO_POSITION";
                    }
                    case 16908342: {
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                }
                break;
            }
            case 16908354: {
                return "ACTION_MOVE_WINDOW";
            }
            case 2097152: {
                return "ACTION_SET_TEXT";
            }
            case 524288: {
                return "ACTION_COLLAPSE";
            }
            case 262144: {
                return "ACTION_EXPAND";
            }
            case 131072: {
                return "ACTION_SET_SELECTION";
            }
            case 65536: {
                return "ACTION_CUT";
            }
            case 32768: {
                return "ACTION_PASTE";
            }
            case 16384: {
                return "ACTION_COPY";
            }
            case 8192: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 4096: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 2048: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 1024: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 512: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 256: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 128: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 64: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 32: {
                return "ACTION_LONG_CLICK";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 4: {
                return "ACTION_SELECT";
            }
        }
    }
    
    public final void a(final int n) {
        this.a.addAction(n);
    }
    
    public final void b(final q4 q4) {
        this.a.addAction((AccessibilityNodeInfo$AccessibilityAction)q4.a);
    }
    
    public final ArrayList c(final String s) {
        final AccessibilityNodeInfo a = this.a;
        ArrayList integerArrayList;
        if ((integerArrayList = a.getExtras().getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList();
            a.getExtras().putIntegerArrayList(s, integerArrayList);
        }
        return integerArrayList;
    }
    
    public final boolean e(final int n) {
        final Bundle extras = this.a.getExtras();
        if (extras != null) {
            if ((((BaseBundle)extras).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & n) == n) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof x4)) {
            return false;
        }
        final x4 x4 = (x4)o;
        final AccessibilityNodeInfo a = x4.a;
        final AccessibilityNodeInfo a2 = this.a;
        if (a2 == null) {
            if (a != null) {
                return false;
            }
        }
        else if (!a2.equals((Object)a)) {
            return false;
        }
        return this.c == x4.c && this.b == x4.b;
    }
    
    public final CharSequence f() {
        final boolean empty = ((List)this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY")).isEmpty();
        final AccessibilityNodeInfo a = this.a;
        if (!empty) {
            final ArrayList c = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final ArrayList c2 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final ArrayList c3 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final ArrayList c4 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            final CharSequence text = a.getText();
            final int length = a.getText().length();
            int i = 0;
            final SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring(text, 0, length));
            while (i < ((List)c).size()) {
                spannableString.setSpan((Object)new u3((int)((List)c4).get(i), this, ((BaseBundle)a.getExtras()).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)((List)c).get(i), (int)((List)c2).get(i), (int)((List)c3).get(i));
                ++i;
            }
            return (CharSequence)spannableString;
        }
        return a.getText();
    }
    
    public final void g(final int n, final boolean b) {
        final Bundle extras = this.a.getExtras();
        if (extras != null) {
            final int int1 = ((BaseBundle)extras).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n2;
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            ((BaseBundle)extras).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n2 | (int1 & ~n));
        }
    }
    
    public final void h(final String className) {
        this.a.setClassName((CharSequence)className);
    }
    
    @Override
    public final int hashCode() {
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    public final void i(final w4 w4) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo$CollectionItemInfo)w4.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        final AccessibilityNodeInfo a = this.a;
        a.getBoundsInParent(rect);
        final StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append((Object)rect);
        sb.append(sb2.toString());
        a.getBoundsInScreen(rect);
        final StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append((Object)rect);
        sb.append(sb3.toString());
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 34) {
            j4.b(a, rect);
        }
        else {
            final Rect rect2 = (Rect)a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        final StringBuilder sb4 = new StringBuilder("; boundsInWindow: ");
        sb4.append((Object)rect);
        sb.append(sb4.toString());
        sb.append("; packageName: ");
        sb.append(a.getPackageName());
        sb.append("; className: ");
        sb.append(a.getClassName());
        sb.append("; text: ");
        sb.append(this.f());
        sb.append("; error: ");
        sb.append(a.getError());
        sb.append("; maxTextLength: ");
        sb.append(a.getMaxTextLength());
        sb.append("; stateDescription: ");
        CharSequence charSequence;
        if (sdk_INT >= 30) {
            charSequence = r4.c(a);
        }
        else {
            charSequence = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(a.getContentDescription());
        sb.append("; supplementalDescription: ");
        CharSequence charSequence2;
        if (sdk_INT >= 36) {
            charSequence2 = t4.c(a);
        }
        else {
            charSequence2 = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
        }
        sb.append(charSequence2);
        sb.append("; tooltipText: ");
        CharSequence charSequence3;
        if (sdk_INT >= 28) {
            charSequence3 = l4.j(a);
        }
        else {
            charSequence3 = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence3);
        sb.append("; viewIdResName: ");
        sb.append(a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        String s;
        if (sdk_INT >= 33) {
            s = s4.c(a);
        }
        else {
            s = ((BaseBundle)a.getExtras()).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(s);
        sb.append("; checkable: ");
        sb.append(a.isCheckable());
        sb.append("; checked: ");
        int n;
        if (sdk_INT >= 36) {
            n = t4.a(a);
        }
        else {
            n = ((BaseBundle)a.getExtras()).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", (int)(a.isChecked() ? 1 : 0));
        }
        final String s2 = "PARTIAL";
        String s3;
        if (n == 1) {
            s3 = "TRUE";
        }
        else if (n == 2) {
            s3 = "PARTIAL";
        }
        else {
            s3 = "FALSE";
        }
        sb.append(s3);
        sb.append("; fieldRequired: ");
        boolean b;
        if (sdk_INT >= 36) {
            b = t4.d(a);
        }
        else {
            b = ((BaseBundle)a.getExtras()).getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
        }
        sb.append(b);
        sb.append("; focusable: ");
        sb.append(a.isFocusable());
        sb.append("; focused: ");
        sb.append(a.isFocused());
        sb.append("; selected: ");
        sb.append(a.isSelected());
        sb.append("; clickable: ");
        sb.append(a.isClickable());
        sb.append("; longClickable: ");
        sb.append(a.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(a.isContextClickable());
        sb.append("; expandedState: ");
        final int n2 = 0;
        int n3;
        if (sdk_INT >= 36) {
            n3 = t4.b(a);
        }
        else {
            n3 = ((BaseBundle)a.getExtras()).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        }
        String s4;
        if (n3 != 0) {
            if (n3 != 1) {
                s4 = s2;
                if (n3 != 2) {
                    if (n3 != 3) {
                        s4 = "UNKNOWN";
                    }
                    else {
                        s4 = "FULL";
                    }
                }
            }
            else {
                s4 = "COLLAPSED";
            }
        }
        else {
            s4 = "UNDEFINED";
        }
        sb.append(s4);
        sb.append("; enabled: ");
        sb.append(a.isEnabled());
        sb.append("; password: ");
        sb.append(a.isPassword());
        final StringBuilder sb5 = new StringBuilder("; scrollable: ");
        sb5.append(a.isScrollable());
        sb.append(sb5.toString());
        sb.append("; containerTitle: ");
        CharSequence charSequence4;
        if (sdk_INT >= 34) {
            charSequence4 = j4.c(a);
        }
        else {
            charSequence4 = a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence4);
        sb.append("; granularScrollingSupported: ");
        sb.append(this.e(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(a.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(a.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        boolean b2;
        if (sdk_INT >= 33) {
            b2 = s4.e(a);
        }
        else {
            b2 = this.e(8388608);
        }
        sb.append(b2);
        sb.append("; accessibilityDataSensitive: ");
        boolean b3;
        if (sdk_INT >= 34) {
            b3 = j4.d(a);
        }
        else {
            b3 = this.e(64);
        }
        sb.append(b3);
        sb.append("; [");
        final List actionList = a.getActionList();
        final ArrayList list = new ArrayList();
        final int size = actionList.size();
        int n4 = 0;
        int i;
        while (true) {
            i = n2;
            if (n4 >= size) {
                break;
            }
            list.add((Object)new q4(actionList.get(n4), 0, null, null));
            ++n4;
        }
        while (i < list.size()) {
            final q4 q4 = (q4)list.get(i);
            final Object a2 = q4.a;
            final Object a3 = q4.a;
            String s6;
            final String s5 = s6 = d(((AccessibilityNodeInfo$AccessibilityAction)a2).getId());
            if (s5.equals((Object)"ACTION_UNKNOWN")) {
                s6 = s5;
                if (((AccessibilityNodeInfo$AccessibilityAction)a3).getLabel() != null) {
                    s6 = ((AccessibilityNodeInfo$AccessibilityAction)a3).getLabel().toString();
                }
            }
            sb.append(s6);
            if (i != list.size() - 1) {
                sb.append(", ");
            }
            ++i;
        }
        sb.append("]");
        return sb.toString();
    }
}
