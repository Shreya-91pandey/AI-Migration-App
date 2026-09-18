import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.view.View;
import android.view.ViewParent;
import android.graphics.Rect;
import androidx.compose.ui.node.LayoutNode;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.content.Context;
import java.util.HashMap;
import android.view.ViewGroup;

public final class zc0 extends ViewGroup
{
    public final HashMap v;
    public final HashMap w;
    
    public zc0(final Context context) {
        super(context);
        this.setClipChildren(false);
        this.v = new HashMap();
        this.w = new HashMap();
    }
    
    public final void dispatchDraw(final Canvas canvas) {
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
    
    public final HashMap<uc0, LayoutNode> getHolderToLayoutNode() {
        return (HashMap<uc0, LayoutNode>)this.v;
    }
    
    public final HashMap<LayoutNode, uc0> getLayoutNodeToHolder() {
        return (HashMap<LayoutNode, uc0>)this.w;
    }
    
    public final ViewParent invalidateChildInParent(final int[] array, final Rect rect) {
        return null;
    }
    
    public final void onDescendantInvalidated(final View view, final View view2) {
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (final uc0 uc0 : (Iterable)this.v.keySet()) {
            ((View)uc0).layout(((View)uc0).getLeft(), ((View)uc0).getTop(), ((View)uc0).getRight(), ((View)uc0).getBottom());
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (View$MeasureSpec.getMode(n) != 1073741824) {
            gac.a("widthMeasureSpec should be EXACTLY");
        }
        if (View$MeasureSpec.getMode(n2) != 1073741824) {
            gac.a("heightMeasureSpec should be EXACTLY");
        }
        ((View)this).setMeasuredDimension(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        final Iterator iterator = ((Iterable)this.v.keySet()).iterator();
        while (iterator.hasNext()) {
            ((uc0)iterator.next()).n();
        }
    }
    
    public final void requestLayout() {
        this.cleanupLayoutState((View)this);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final LayoutNode layoutNode = (LayoutNode)this.v.get((Object)child);
            if (child.isLayoutRequested() && layoutNode != null) {
                LayoutNode.t0(layoutNode, false, 7);
            }
        }
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
