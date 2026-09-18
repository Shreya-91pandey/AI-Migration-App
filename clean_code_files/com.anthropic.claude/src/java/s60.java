import android.view.DragEvent;
import android.view.View;
import android.view.View$OnDragListener;

public final class s60 implements View$OnDragListener, rt8
{
    public final st8 a;
    public final fw0 b;
    public final r60 c;
    
    public s60() {
        this.a = new st8(null, 3);
        this.b = new fw0(0);
        this.c = new r60(this);
    }
    
    public final boolean onDrag(final View view, final DragEvent dragEvent) {
        final mt8 mt8 = new mt8(dragEvent);
        final int action = dragEvent.getAction();
        final fw0 b = this.b;
        final st8 a = this.a;
        switch (action) {
            default: {
                return false;
            }
            case 6: {
                a.x0(mt8);
                return false;
            }
            case 5: {
                a.z(mt8);
                return false;
            }
            case 4: {
                a.N(mt8);
                b.clear();
                return false;
            }
            case 3: {
                return a.Y0(mt8);
            }
            case 2: {
                a.H0(mt8);
                return false;
            }
            case 1: {
                final Object o = new Object();
                final z36 z36 = new z36((Object)mt8, (Object)a, o, (byte)16);
                if (z36.b((Object)a) == vfo.v) {
                    o50.c0((wfo)a, (lta)z36);
                }
                final boolean v = ((x3j)o).v;
                final ew0 ew0 = new ew0(b);
                while (((r7c)ew0).hasNext()) {
                    ((ut8)((r7c)ew0).next()).G0(mt8);
                }
                return v;
            }
        }
    }
}
