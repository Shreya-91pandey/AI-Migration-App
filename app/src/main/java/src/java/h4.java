import java.util.Map;
import java.util.WeakHashMap;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import com.anthropic.claude.types.strings.ChatId;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;

public final class h4 implements aq8
{
    public final byte a;
    public final Object b;
    public final Object c;
    
    @Override
    public final void a() {
        final byte a = this.a;
        final Object c = this.c;
        final Object b = this.b;
        switch (a) {
            default: {
                final l2q l2q = (l2q)b;
                final View view = (View)c;
                final int v = l2q.v - 1;
                l2q.v = v;
                if (v == 0) {
                    final WeakHashMap a2 = gap.a;
                    w9p.c(view, (u7g)null);
                    l1q.a(view, (g66)null);
                    view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)l2q.w);
                }
                return;
            }
            case 14: {
                ((efo)b).j.remove((Object)c);
                return;
            }
            case 13: {
                final efo efo = (efo)b;
                final veo veo = (veo)c;
                efo.getClass();
                final ueo ueo = (ueo)veo.b.getValue();
                if (ueo != null) {
                    efo.j.remove((Object)ueo.v);
                }
                return;
            }
            case 12: {
                ((efo)b).k.remove((Object)c);
                return;
            }
            case 11: {
                ((umn)b).c.remove((Object)c);
                return;
            }
            case 10: {
                final bnf bnf = (bnf)b;
                final vlh vlh = (vlh)((xom)bnf).getValue();
                if (vlh != null) {
                    final ulh ulh = new ulh(vlh);
                    final llf llf = (llf)c;
                    if (llf != null) {
                        llf.b((eic)ulh);
                    }
                    bnf.setValue((Object)null);
                }
                return;
            }
            case 9: {
                ((lo1)b).b((ko1)c);
                return;
            }
            case 8: {
                ((vad)b).d((fbd)c);
                return;
            }
            case 7: {
                ((kd)b).c(c);
                return;
            }
            case 6: {
                final String s = (String)b;
                if (s != null) {
                    ((lta)((xom)c).getValue()).b(new ChatId(s));
                }
                return;
            }
            case 5: {
                ((b6d)b).x.k(c);
                return;
            }
            case 4: {
                ((z8c)b).a.k((Object)c);
                return;
            }
            case 3: {
                ((ho1)b).c((co1)c);
                return;
            }
            case 2: {
                ((Map)((qkb)b).a).remove(c);
                return;
            }
            case 1: {
                ((lo1)b).b((ko1)c);
                return;
            }
            case 0: {
                ((AccessibilityManager)b).removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)c);
            }
        }
    }
}
