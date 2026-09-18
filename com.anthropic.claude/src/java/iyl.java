import java.util.concurrent.CancellationException;

public final class iyl implements kgl
{
    public final r6 a;
    public final u3p b;
    
    public iyl(final r6 a, final u3p b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object a(h07 h07) {
        Object o = null;
        Label_0049: {
            if (h07 instanceof hyl) {
                o = h07;
                final int y = ((hyl)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((hyl)o).y = y + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new hyl(this, h07);
        }
        final Object w = ((hyl)o).w;
        final int y2 = ((hyl)o).y;
        boolean booleanValue = false;
        Label_0105: {
            if (y2 == 0) {
                break Label_0105;
            }
            Label_0098: {
                if (y2 != 1) {
                    break Label_0098;
                }
                final Object o2 = h07 = (h07)((hyl)o).v;
                try {
                    vt4.g0(w);
                    h07 = (h07)o2;
                    Boolean b = (Boolean)w;
                    Label_0188: {
                        booleanValue = b;
                    }
                    return booleanValue;
                    vt4.g0(w);
                    h07 = (h07)new lqi((byte)25, (f07)null, (Object)this);
                    final Object v = h07 = (h07)rhc.f((oc7)this.b, (hc7)null, 0, (zta)h07, 3);
                    ((hyl)o).v = (b98)v;
                    h07 = (h07)v;
                    ((hyl)o).y = 1;
                    h07 = (h07)v;
                    final Object r = ((bqc)v).r((f07)o);
                    final pc7 v2 = pc7.v;
                    h07 = (h07)v;
                    iftrue(Label_0188:)((b = (Boolean)r) != v2);
                    return v2;
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                catch (final CancellationException ex) {
                    ((bqc)h07).g((CancellationException)null);
                    x90.u(((f07)o).getContext());
                }
            }
        }
        return booleanValue;
    }
}
