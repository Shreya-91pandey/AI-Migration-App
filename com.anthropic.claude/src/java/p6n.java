import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

public abstract class p6n
{
    public static final jeh a;
    
    static {
        a = new jeh((List)r89.v, null);
    }
    
    public static final t6n a(final PointerInputEventHandler pointerInputEventHandler) {
        return new t6n(null, null, null, pointerInputEventHandler);
    }
    
    public static final igf b(final igf igf, final Object o, final PointerInputEventHandler pointerInputEventHandler) {
        return igf.E((igf)new n6n(o, null, null, pointerInputEventHandler, 6));
    }
    
    public static final igf c(final igf igf, final Object o, final Object o2, final PointerInputEventHandler pointerInputEventHandler) {
        return igf.E((igf)new n6n(o, o2, null, pointerInputEventHandler, 4));
    }
}
