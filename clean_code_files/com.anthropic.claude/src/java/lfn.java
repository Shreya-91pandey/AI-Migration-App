import android.text.Layout$Alignment;

public abstract class lfn
{
    public static final Layout$Alignment a;
    public static final Layout$Alignment b;
    
    static {
        final Layout$Alignment[] values = Layout$Alignment.values();
        Layout$Alignment align_NORMAL = Layout$Alignment.ALIGN_NORMAL;
        final int length = values.length;
        int i = 0;
        Layout$Alignment b2 = align_NORMAL;
        while (i < length) {
            final Layout$Alignment layout$Alignment = values[i];
            Layout$Alignment layout$Alignment2;
            if (mlc.q((Object)((Enum)layout$Alignment).name(), (Object)"ALIGN_LEFT")) {
                layout$Alignment2 = layout$Alignment;
            }
            else {
                layout$Alignment2 = align_NORMAL;
                if (mlc.q((Object)((Enum)layout$Alignment).name(), (Object)"ALIGN_RIGHT")) {
                    b2 = layout$Alignment;
                    layout$Alignment2 = align_NORMAL;
                }
            }
            ++i;
            align_NORMAL = layout$Alignment2;
        }
        a = align_NORMAL;
        b = b2;
    }
}
