import java.io.IOException;
import java.io.Closeable;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;

public final class iti implements n03
{
    public volatile boolean v;
    public final Object w;
    public final Object x;
    public Cloneable y;
    
    public iti() {
        this.w = new awp((byte)25);
        this.x = new LinkedHashMap();
        this.y = (Cloneable)new LinkedHashSet();
    }
    
    public iti(final sej w, final tsf x) {
        this.w = w;
        this.x = x;
    }
    
    public static void b(final AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                gcp.e(autoCloseable);
            }
            catch (final Exception ex) {
                uy8.i((Throwable)ex);
            }
        }
    }
    
    public void a() {
        this.v = true;
        final dti dti = (dti)this.y;
        if (dti != null) {
            dti.cancel();
        }
    }
    
    public void h(final dti dti, final snj snj) {
        Label_0029: {
            try {
                if (!snj.K) {
                    ((tsf)this.x).O(this, (Throwable)null, snj);
                    snj.close();
                    return;
                }
                break Label_0029;
            }
            finally {
                try {}
                finally {
                    zn2.r((Closeable)snj, (Throwable)dti);
                }
            Label_0105_Outer:
                while (true) {
                Block_7_Outer:
                    while (true) {
                        while (true) {
                            final tsf tsf = (tsf)this.x;
                            final StringBuilder sb = new StringBuilder("Invalid content-type: ");
                            final unj b;
                            sb.append((Object)b.n());
                            tsf.O(this, (Throwable)new IllegalStateException(sb.toString()), snj);
                            snj.close();
                            return;
                            continue Label_0105_Outer;
                            final snj a0 = rhc.a0(snj);
                            final u1l u1l = new u1l(b.Y0(), this);
                            Label_0167: {
                                try {
                                    if (!this.v) {
                                        ((tsf)this.x).P();
                                        while (!this.v && u1l.a()) {}
                                    }
                                    break Label_0167;
                                }
                                catch (final Exception ex) {
                                    Object o = ex;
                                    if (this.v) {
                                        o = new IOException("canceled", (Throwable)ex);
                                    }
                                    ((tsf)this.x).O(this, (Throwable)o, a0);
                                    snj.close();
                                    return;
                                    while (true) {
                                        snj.close();
                                        return;
                                        final boolean v = this.v;
                                        final tsf tsf2 = (tsf)this.x;
                                        iftrue(Label_0207:)(!v);
                                        tsf2.O(this, (Throwable)new IOException("canceled"), a0);
                                        continue Block_7_Outer;
                                        Label_0207: {
                                            tsf2.M();
                                        }
                                        continue Block_7_Outer;
                                    }
                                }
                            }
                            continue Label_0105_Outer;
                        }
                        cti a2 = null;
                    Block_8:
                        while (true) {
                            final dti dti2;
                            a2 = dti2.A;
                            iftrue(Label_0105:)(a2 == null);
                            break Block_8;
                            Label_0048: {
                                final ire n;
                                iftrue(Label_0260:)(!n.b.equals("text") || !n.c.equals("event-stream"));
                            }
                            dti2 = (dti)this.y;
                            iftrue(Label_0105:)(dti2 == null);
                            continue;
                        }
                        ((pb1)a2).b();
                        continue Block_7_Outer;
                    }
                    final unj b = snj.B;
                    final ire n = b.n();
                    iftrue(Label_0048:)(n != null);
                    continue Label_0105_Outer;
                }
            }
        }
    }
    
    public void l(final dti dti, final IOException ex) {
        ((tsf)this.x).O(this, (Throwable)ex, (snj)null);
    }
}
