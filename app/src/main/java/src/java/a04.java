import java.util.Map;

public final class a04 implements aq8
{
    public final byte a;
    public final bnf b;
    public final bnf c;
    
    public final void a() {
        final byte a = this.a;
        final bnf c = this.c;
        final bnf b = this.b;
        switch (a) {
            default: {
                final Map value = (Map)((xom)b).getValue();
                if (value != null) {
                    c.setValue((Object)value);
                }
                b.setValue((Object)null);
                return;
            }
            case 0: {
                final lta lta = (lta)((xom)b).getValue();
                final Boolean booleanFalse = Boolean.FALSE;
                lta.b((Object)false);
                ((lta)((xom)c).getValue()).b((Object)false);
            }
        }
    }
}
