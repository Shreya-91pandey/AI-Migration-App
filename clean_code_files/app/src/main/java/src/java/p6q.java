import java.util.concurrent.CancellationException;
import androidx.work.impl.WorkerStoppedException;

public final class p6q extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final r6q y;
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final r6q y = this.y;
        switch (w) {
            default: {
                return (f07)new p6q(y, f07, (byte)1);
            }
            case 0: {
                return (f07)new p6q(y, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                return ((p6q)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((p6q)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final pc7 v = pc7.v;
        final r6q y = this.y;
        switch (w) {
            default: {
                final boolean x = this.x;
                Label_0188: {
                    Label_0075: {
                        if (!x) {
                            break Label_0075;
                        }
                        Label_0065: {
                            if (!x) {
                                break Label_0065;
                            }
                            Label_0129: {
                                while (true) {
                                    try {
                                        vt4.g0(o);
                                        break Label_0129;
                                    }
                                    catch (final WorkerStoppedException ex) {
                                        break Label_0075;
                                        vt4.g0(o);
                                        final ppc l = y.l;
                                        final p6q p6q = new p6q(y, null, (byte)0);
                                        this.x = true;
                                        iftrue(Label_0129:)((o = rhc.f0((hc7)l, (zta)p6q, (f07)this)) != v);
                                        return o;
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        return o;
                                        krd.c().b(s6q.a, "Unexpected error in WorkerWrapper", (Throwable)o);
                                        final l6q l6q = new l6q();
                                        break Label_0188;
                                        final o6q o6q = (o6q)o;
                                        break Label_0188;
                                    }
                                    catch (final CancellationException ex2) {
                                        final l6q l6q2 = new l6q();
                                        break Label_0188;
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    o = new n6q(((WorkerStoppedException)o).v);
                }
                o = y.g.p((jta)new lce((Object)new dx7(o, (Object)y, (byte)2), (byte)20));
                o.getClass();
                return o;
            }
            case 0: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    this.x = true;
                    if ((o = y.c((h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
        }
    }
}
