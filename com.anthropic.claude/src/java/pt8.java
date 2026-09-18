import java.util.ArrayList;

public final class pt8 implements jja
{
    public final byte v;
    public final ArrayList w;
    public final bnf x;
    
    public final Object l(final Object o, final f07 f07) {
        final byte v = this.v;
        final lqo a = lqo.a;
        final bnf x = this.x;
        final ArrayList w = this.w;
        switch (v) {
            default: {
                final eic eic = (eic)o;
                if (eic instanceof gma) {
                    w.add((Object)eic);
                }
                else if (eic instanceof hma) {
                    w.remove((Object)((hma)eic).a());
                }
                x.setValue((Object)(w.isEmpty() ^ true));
                return a;
            }
            case 1: {
                final eic eic2 = (eic)o;
                if (eic2 instanceof ev8) {
                    w.add((Object)eic2);
                }
                else if (eic2 instanceof fv8) {
                    w.remove((Object)((fv8)eic2).a());
                }
                else if (eic2 instanceof dv8) {
                    w.remove((Object)((dv8)eic2).a());
                }
                x.setValue((Object)(w.isEmpty() ^ true));
                return a;
            }
            case 0: {
                final eic eic3 = (eic)o;
                if (eic3 instanceof nt8) {
                    w.add((Object)eic3);
                }
                else if (eic3 instanceof ot8) {
                    w.remove((Object)((ot8)eic3).a());
                }
                x.setValue((Object)(w.isEmpty() ^ true));
                return a;
            }
        }
    }
}
