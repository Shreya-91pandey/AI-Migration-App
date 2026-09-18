import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.CodeEvents$SessionReattestSkipped;
import com.anthropic.claude.analytics.events.CodeEvents$ReattestSkipReason;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.analytics.events.CodeEvents$ReattestTrigger;

public final class tui implements kgl
{
    public final l7n a;
    public final iyl b;
    public final u3p c;
    public final ax3 d;
    
    public tui(final l7n a, final iyl b, final wo8 wo8, final u3p c, final ax3 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final Object a(final h07 h07) {
        return this.e(CodeEvents$ReattestTrigger.w, h07);
    }
    
    @Override
    public final Object b(final pn4 pn4) {
        return this.e(CodeEvents$ReattestTrigger.x, (h07)pn4);
    }
    
    @Override
    public final Object c(final f07 f07) {
        Object o = null;
        Label_0054: {
            if (f07 instanceof qui) {
                final qui qui = (qui)f07;
                final int x = qui.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    qui.x = x + Integer.MIN_VALUE;
                    o = qui;
                    break Label_0054;
                }
            }
            o = new qui(this, (h07)f07);
        }
        final Object v = ((qui)o).v;
        final int x2 = ((qui)o).x;
        boolean b = true;
        Label_0187: {
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
                if (!ien.y((oc7)this.c) || !this.d.a.h("claudeai_chat_step_up_biometric")) {
                    break Label_0187;
                }
                ((qui)o).x = 1;
                final o68 a = vo8.a;
                final Object f8 = rhc.f0((hc7)d58.w, (zta)new nee((byte)10, (f07)null, (Object)this), (f07)o);
                final pc7 v2 = pc7.v;
                if ((o2 = f8) == v2) {
                    return v2;
                }
            }
            if (((yog)o2).w == null) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final Object d(final cjo cjo, final CodeEvents$ReattestTrigger codeEvents$ReattestTrigger, h07 o) {
        Label_0054: {
            if (o instanceof rui) {
                final rui rui = (rui)o;
                final int x = rui.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    rui.x = x + Integer.MIN_VALUE;
                    o = rui;
                    break Label_0054;
                }
            }
            o = new rui(this, (h07)o);
        }
        final Object v = ((rui)o).v;
        final int x2 = ((rui)o).x;
        Label_0095: {
            if (x2 == 0) {
                break Label_0095;
            }
            Label_0088: {
                if (x2 != 1) {
                    break Label_0088;
                }
                try {
                    vt4.g0(v);
                    Object o2 = v;
                    final Object v2;
                    Label_0152: {
                        v2 = ((kpj)o2).v;
                    }
                    final Throwable a = kpj.a(v2);
                    if (a == null) {
                        return v2;
                    }
                    if (a instanceof CancellationException) {
                        return Boolean.FALSE;
                    }
                    throw a;
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                    vt4.g0(v);
                    final b98 f = rhc.f((oc7)this.c, (hc7)null, 0, (zta)new jzg((Object)cjo, (Object)codeEvents$ReattestTrigger, (f07)null, (byte)9), 3);
                    ((rui)o).x = 1;
                    final Object r = ((bqc)f).r((f07)o);
                    final pc7 v3 = pc7.v;
                    iftrue(Label_0152:)((o2 = r) != v3);
                    return v3;
                }
                catch (final CancellationException ex) {
                    x90.u(((f07)o).getContext());
                    return Boolean.FALSE;
                }
            }
        }
    }
    
    public final Object e(CodeEvents$ReattestTrigger v, final h07 h07) {
        sui sui = null;
        Label_0049: {
            if (h07 instanceof sui) {
                sui = (sui)h07;
                final int z = sui.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    sui.z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            sui = new sui(this, h07);
        }
        Object o = sui.x;
        final int z2 = sui.z;
        final iyl b = this.b;
        final pc7 v2 = pc7.v;
        cjo w = null;
        Label_0446: {
            Label_0406: {
                Label_0392: {
                    if (z2 != 0) {
                        if (z2 == 1) {
                            vt4.g0(o);
                            return o;
                        }
                        if (z2 != 2) {
                            if (z2 == 3) {
                                w = sui.w;
                                vt4.g0(o);
                                break Label_0392;
                            }
                            if (z2 == 4) {
                                w = sui.w;
                                vt4.g0(o);
                                break Label_0446;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            v = sui.v;
                            vt4.g0(o);
                        }
                    }
                    else {
                        vt4.g0(o);
                        if (!ien.y((oc7)this.c)) {
                            sui.v = null;
                            sui.z = 1;
                            final Object a = b.a((h07)sui);
                            if (a == v2) {
                                return v2;
                            }
                            return a;
                        }
                        else {
                            sui.v = v;
                            sui.z = 2;
                            final o68 a2 = vo8.a;
                            if ((o = rhc.f0((hc7)d58.w, (zta)new nee((byte)10, (f07)null, (Object)this), (f07)sui)) == v2) {
                                return v2;
                            }
                        }
                    }
                    final yog yog = (yog)o;
                    final cjo w2 = (cjo)yog.v;
                    CodeEvents$ReattestSkipReason x = (CodeEvents$ReattestSkipReason)yog.w;
                    if (!this.d.a.h("claudeai_chat_step_up_biometric")) {
                        x = CodeEvents$ReattestSkipReason.x;
                    }
                    if (x != null) {
                        final st4 g = w2.g;
                        final CodeEvents$SessionReattestSkipped codeEvents$SessionReattestSkipped = new CodeEvents$SessionReattestSkipped(w2.i, x, v);
                        final KSerializer serializer = CodeEvents$SessionReattestSkipped.Companion.serializer();
                        vt4.b0(serializer);
                        g.b((v10)codeEvents$SessionReattestSkipped, (KSerializer)serializer);
                        w = w2;
                        break Label_0406;
                    }
                    sui.v = null;
                    sui.w = w2;
                    sui.z = 3;
                    final Object d = this.d(w2, v, (h07)sui);
                    if (d == v2) {
                        return v2;
                    }
                    w = w2;
                    o = d;
                }
                if (o) {
                    return Boolean.TRUE;
                }
            }
            sui.v = null;
            sui.w = w;
            sui.z = 4;
            if ((o = b.a((h07)sui)) != v2) {
                break Label_0446;
            }
            return v2;
        }
        if (!(boolean)o) {
            return Boolean.FALSE;
        }
        if (j7r.d(w)) {
            w.w((String)null, true);
        }
        return Boolean.TRUE;
    }
}
