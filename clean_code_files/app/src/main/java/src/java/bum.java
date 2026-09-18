import java.util.concurrent.CancellationException;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.ChatEvents$Rename;

public final class bum implements p74
{
    public static final int g = 0;
    public final l7n a;
    public final qo4 b;
    public final st4 c;
    public final s3p d;
    public final toj e;
    public final u3p f;
    
    static {
        final int d = toj.d;
        final String g = qo4.G;
    }
    
    public bum(final l7n a, final qo4 b, final st4 c, final s3p d, final toj e, final u3p f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final Object a(String v, String w, h07 o) {
        Label_0054: {
            if (o instanceof ytm) {
                final ytm ytm = (ytm)o;
                final int z = ytm.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ytm.z = z + Integer.MIN_VALUE;
                    o = ytm;
                    break Label_0054;
                }
            }
            o = new ytm(this, (h07)o);
        }
        Object o2 = ((ytm)o).x;
        final int z2 = ((ytm)o).z;
        final boolean b = true;
        final pc7 v2 = pc7.v;
        boolean booleanValue = false;
        Label_0138: {
            if (z2 == 0) {
                break Label_0138;
            }
            Label_0120: {
                if (z2 == 1) {
                    break Label_0120;
                }
                Label_0112: {
                    if (z2 == 2) {
                        break Label_0112;
                    }
                    Label_0105: {
                        if (z2 != 3) {
                            break Label_0105;
                        }
                        try {
                            vt4.g0(o2);
                            final Boolean b2;
                            Label_0351: {
                                b2 = (Boolean)o2;
                            }
                            booleanValue = b;
                            if (b2 != null) {
                                booleanValue = b2;
                                return booleanValue;
                            }
                            return booleanValue;
                            final Object a;
                            Label_0227:
                            return a;
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                            vt4.g0(o2);
                            ((ytm)o).v = v;
                            ((ytm)o).w = w;
                            ((ytm)o).z = 1;
                            iftrue(Label_0135:)((o2 = this.b(v, (h07)o)) != v2);
                            return v2;
                            Block_9: {
                                while (true) {
                                    final g87 g87 = (g87)o2;
                                    iftrue(Label_0229:)(g87 != null);
                                    break Block_9;
                                    Label_0229:
                                    final ChatEvents$Rename chatEvents$Rename = new ChatEvents$Rename(this.d.d, v);
                                    final KSerializer serializer = ChatEvents$Rename.Companion.serializer();
                                    vt4.b0(serializer);
                                    this.c.b((v10)chatEvents$Rename, (KSerializer)serializer);
                                    final qg4 qg4 = new qg4(rhc.f((oc7)this.f, (hc7)null, 0, (zta)new s9l((Object)this, (Object)g87, (Object)w, (f07)null, (byte)22), 3), (f07)null, (byte)2);
                                    ((ytm)o).v = null;
                                    ((ytm)o).w = null;
                                    ((ytm)o).z = 3;
                                    iftrue(Label_0351:)((o2 = r6k.j0(90000L, (zta)qg4, (f07)o)) != v2);
                                    return v2;
                                    w = ((ytm)o).w;
                                    v = ((ytm)o).v;
                                    vt4.g0(o2);
                                    continue;
                                }
                                vt4.g0(o2);
                                return o2;
                            }
                            ((ytm)o).v = null;
                            ((ytm)o).w = null;
                            ((ytm)o).z = 2;
                            a = this.e.a(v, w, (h07)o);
                            iftrue(Label_0227:)(a != v2);
                            return v2;
                        }
                        catch (final CancellationException ex) {
                            x90.u(((f07)o).getContext());
                            booleanValue = b;
                        }
                    }
                }
            }
        }
        return booleanValue;
    }
    
    public final Object b(final String s, final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof aum) {
                final aum aum = (aum)h07;
                final int x = aum.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    aum.x = x + Integer.MIN_VALUE;
                    o = aum;
                    break Label_0051;
                }
            }
            o = new aum(this, h07);
        }
        final Object v = ((aum)o).v;
        final int x2 = ((aum)o).x;
        Object o2;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o2 = v;
        }
        else {
            vt4.g0(v);
            final n87 n87 = (n87)this.a.getValue();
            ((aum)o).x = 1;
            final Object d = n87.d(s, (h07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = d) == v2) {
                return v2;
            }
        }
        final g87 g87 = (g87)o2;
        if (g87 != null && g87.d()) {
            return g87;
        }
        return null;
    }
}
