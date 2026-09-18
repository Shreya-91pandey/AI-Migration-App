import android.view.InputEvent;
import android.os.Build$VERSION;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.MotionEvent;
import java.util.ArrayList;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;

public final class shf
{
    public long a;
    public final SparseLongArray b;
    public final SparseBooleanArray c;
    public final ArrayList d;
    public final rwd e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public l6g j;
    
    public shf() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = new rwd((Object)null);
        this.f = -1;
        this.g = -1;
    }
    
    public final void a(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final SparseLongArray b = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                final int pointerId = motionEvent.getPointerId(0);
                if (b.indexOfKey(pointerId) < 0) {
                    final long a = this.a;
                    this.a = 1L + a;
                    b.put(pointerId, a);
                }
            }
        }
        else {
            final int actionIndex = motionEvent.getActionIndex();
            final int pointerId2 = motionEvent.getPointerId(actionIndex);
            if (b.indexOfKey(pointerId2) < 0) {
                final long a2 = this.a;
                this.a = 1L + a2;
                b.put(pointerId2, a2);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.c.put(pointerId2, true);
                }
            }
        }
    }
    
    public final void b(final MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            final int toolType = motionEvent.getToolType(0);
            final int source = motionEvent.getSource();
            if (toolType != this.f || source != this.g) {
                this.f = toolType;
                this.g = source;
                this.c.clear();
                this.b.clear();
            }
        }
    }
    
    public final sv9 c(final MotionEvent motionEvent, final AndroidComposeView androidComposeView) {
        final int actionMasked = motionEvent.getActionMasked();
        final SparseBooleanArray c = this.c;
        if (actionMasked != 3 && actionMasked != 4) {
            this.b(motionEvent);
            this.a(motionEvent);
            final boolean b = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
            final boolean b2 = actionMasked == 8;
            if (b) {
                c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
            }
            int actionIndex;
            if (actionMasked != 1) {
                if (actionMasked != 6) {
                    actionIndex = -1;
                }
                else {
                    actionIndex = motionEvent.getActionIndex();
                }
            }
            else {
                actionIndex = 0;
            }
            final ArrayList d = this.d;
            d.clear();
            if (motionEvent.getActionMasked() == 0) {
                final boolean b3 = Build$VERSION.SDK_INT >= 34 && (ipe.c(motionEvent) == 3 || ipe.c(motionEvent) == 5);
                final boolean b4 = motionEvent.getButtonState() == 0 && (((InputEvent)motionEvent).isFromSource(8194) || ((InputEvent)motionEvent).isFromSource(1048584));
                if (b3 || b4) {
                    this.h = true;
                }
            }
            if (Build$VERSION.SDK_INT >= 34 && (ipe.c(motionEvent) == 3 || ipe.c(motionEvent) == 5)) {
                if (ipe.c(motionEvent) == 5 && motionEvent.getPointerCount() == 1) {
                    if (motionEvent.getActionMasked() == 1) {
                        this.h = false;
                        this.i = false;
                        this.j = null;
                    }
                    this.e(motionEvent);
                    return null;
                }
                this.i = true;
                if (motionEvent.getActionMasked() == 0) {
                    this.j = new l6g((long)Float.floatToRawIntBits(ipe.u(motionEvent)) << 32 | ((long)Float.floatToRawIntBits(ipe.a(motionEvent)) & 0xFFFFFFFFL));
                }
                else if (motionEvent.getActionMasked() == 5 && ipe.c(motionEvent) == 5 && motionEvent.getPointerCount() == 2) {
                    this.j = new l6g((long)Float.floatToRawIntBits((ipe.y(motionEvent) + ipe.u(motionEvent)) / 2.0f) << 32 | ((long)Float.floatToRawIntBits((ipe.p(motionEvent) + ipe.a(motionEvent)) / 2.0f) & 0xFFFFFFFFL));
                }
                d.add((Object)this.d(androidComposeView, motionEvent, this.j, 0, false));
            }
            else {
                this.i = false;
                for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                    d.add((Object)this.d(androidComposeView, motionEvent, null, i, !b && i != actionIndex && (!b2 || motionEvent.getButtonState() != 0)));
                }
            }
            if (motionEvent.getActionMasked() == 1) {
                this.h = false;
                this.i = false;
                this.j = null;
            }
            this.e(motionEvent);
            motionEvent.getEventTime();
            return new sv9((Object)d, (Object)motionEvent, (byte)17);
        }
        this.b.clear();
        c.clear();
        this.h = false;
        this.i = false;
        this.j = null;
        return null;
    }
    
    public final reh d(final AndroidComposeView androidComposeView, final MotionEvent motionEvent, final l6g l6g, final int n, final boolean b) {
        final int pointerId = motionEvent.getPointerId(n);
        final SparseLongArray b2 = this.b;
        final int indexOfKey = b2.indexOfKey(pointerId);
        long n2;
        if (indexOfKey >= 0) {
            n2 = b2.valueAt(indexOfKey);
        }
        else {
            n2 = this.a;
            this.a = 1L + n2;
            b2.put(pointerId, n2);
        }
        final float pressure = motionEvent.getPressure(n);
        final long n3 = ((long)Float.floatToRawIntBits(motionEvent.getY(n)) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(motionEvent.getX(n)) << 32;
        long r = 0L;
        long n6 = 0L;
        Label_0243: {
            long n4;
            long n5;
            if (n == 0) {
                if (l6g != null) {
                    n4 = l6g.a;
                }
                else {
                    n4 = ((long)Float.floatToRawIntBits(motionEvent.getRawX()) << 32 | ((long)Float.floatToRawIntBits(motionEvent.getRawY()) & 0xFFFFFFFFL));
                }
                n5 = androidComposeView.H(n4);
            }
            else {
                if (Build$VERSION.SDK_INT < 29) {
                    r = androidComposeView.r(n3);
                    n6 = n3;
                    break Label_0243;
                }
                if (l6g != null) {
                    n4 = l6g.a;
                }
                else {
                    n4 = j9r.o(motionEvent, n);
                }
                n5 = androidComposeView.H(n4);
            }
            final long n7 = n5;
            r = n4;
            n6 = n7;
        }
        final int toolType = motionEvent.getToolType(n);
        int n9 = 0;
        Label_0352: {
            Label_0290: {
                if (toolType != 0) {
                    final int n8 = 2;
                    Label_0296: {
                        if (toolType != 1) {
                            if (toolType != 2) {
                                n9 = n8;
                                if (toolType != 3) {
                                    n9 = 4;
                                    if (toolType != 4) {
                                        break Label_0290;
                                    }
                                }
                            }
                            else {
                                n9 = 3;
                            }
                        }
                        else {
                            if (((InputEvent)motionEvent).isFromSource(8194) || ((InputEvent)motionEvent).isFromSource(1048584)) {
                                n9 = n8;
                                if (!this.h) {
                                    break Label_0296;
                                }
                                if (this.i) {
                                    n9 = n8;
                                    break Label_0296;
                                }
                            }
                            n9 = 1;
                        }
                    }
                    break Label_0352;
                }
            }
            n9 = 0;
        }
        final ArrayList list = new ArrayList(motionEvent.getHistorySize());
        final int historySize = motionEvent.getHistorySize();
        int n10 = 0;
        Float value;
        long n12;
        float floatValue;
        while (true) {
            value = null;
            final Float n11 = null;
            n12 = 0L;
            floatValue = 1.0f;
            if (n10 >= historySize) {
                break;
            }
            final float historicalX = motionEvent.getHistoricalX(n, n10);
            final float historicalY = motionEvent.getHistoricalY(n, n10);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                final long n13 = (long)Float.floatToRawIntBits(historicalX) << 32 | ((long)Float.floatToRawIntBits(historicalY) & 0xFFFFFFFFL);
                final long historicalEventTime = motionEvent.getHistoricalEventTime(n10);
                final float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, n, n10);
                Float value2 = n11;
                if (historicalAxisValue > 0.0f) {
                    value2 = historicalAxisValue;
                }
                if (value2 != null) {
                    floatValue = value2;
                }
                long n14 = n12;
                if (Build$VERSION.SDK_INT >= 29) {
                    n14 = n12;
                    if (ipe.c(motionEvent) == 3) {
                        n14 = ((long)Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, n, n10)) << 32 | ((long)Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, n, n10)) & 0xFFFFFFFFL));
                    }
                }
                list.add((Object)new zjb(historicalEventTime, n13, floatValue, n14, n13));
            }
            ++n10;
        }
        long n15;
        if (motionEvent.getActionMasked() == 8) {
            n15 = ((long)Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << 32 | ((long)Float.floatToRawIntBits(-motionEvent.getAxisValue(9) + 0.0f) & 0xFFFFFFFFL));
        }
        else {
            n15 = 0L;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        float floatValue2 = floatValue;
        if (sdk_INT >= 29) {
            floatValue2 = floatValue;
            if (ipe.c(motionEvent) == 5) {
                final float axisValue = motionEvent.getAxisValue(52, n);
                if (axisValue > 0.0f) {
                    value = axisValue;
                }
                floatValue2 = floatValue;
                if (value != null) {
                    floatValue2 = value;
                }
            }
        }
        if (sdk_INT >= 29 && ipe.c(motionEvent) == 3) {
            n12 = ((long)Float.floatToRawIntBits(motionEvent.getAxisValue(50, n)) << 32 | ((long)Float.floatToRawIntBits(motionEvent.getAxisValue(51, n)) & 0xFFFFFFFFL));
        }
        return new reh(n2, motionEvent.getEventTime(), r, n6, b, pressure, n9, this.c.get(motionEvent.getPointerId(n), false), list, n15, floatValue2, n12, n3);
    }
    
    public final void e(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final SparseBooleanArray c = this.c;
        final SparseLongArray b = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!c.get(pointerId, false)) {
                b.delete(pointerId);
                c.delete(pointerId);
            }
        }
        if (b.size() > motionEvent.getPointerCount()) {
            int n = b.size() - 1;
        Label_0082:
            while (-1 < n) {
                final int key = b.keyAt(n);
                while (true) {
                    for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                        if (motionEvent.getPointerId(i) == key) {
                            --n;
                            continue Label_0082;
                        }
                    }
                    b.removeAt(n);
                    c.delete(key);
                    continue;
                }
            }
        }
    }
}
