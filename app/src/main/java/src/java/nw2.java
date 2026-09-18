import java.util.ArrayList;
import java.util.Set;

public final class nw2 extends m6n implements zta
{
    public final byte w;
    public Object x;
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                final nw2 nw2 = new nw2(2, f07, (byte)7);
                nw2.x = o;
                return (f07)nw2;
            }
            case 6: {
                final nw2 nw3 = new nw2(2, f07, (byte)6);
                nw3.x = o;
                return (f07)nw3;
            }
            case 5: {
                final nw2 nw4 = new nw2(2, f07, (byte)5);
                nw4.x = o;
                return (f07)nw4;
            }
            case 4: {
                final nw2 nw5 = new nw2(2, f07, (byte)4);
                nw5.x = o;
                return (f07)nw5;
            }
            case 3: {
                final nw2 nw6 = new nw2(2, f07, (byte)3);
                nw6.x = o;
                return (f07)nw6;
            }
            case 2: {
                final nw2 nw7 = new nw2(2, f07, (byte)2);
                nw7.x = o;
                return (f07)nw7;
            }
            case 1: {
                final nw2 nw8 = new nw2(2, f07, (byte)1);
                nw8.x = o;
                return (f07)nw8;
            }
            case 0: {
                final nw2 nw9 = new nw2(2, f07, (byte)0);
                nw9.x = o;
                return (f07)nw9;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                return ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 5: {
                return ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                return ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 0: {
                return ((nw2)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        switch (w) {
            default: {
                vt4.g0(o);
                final b3k b3k = (b3k)this.x;
                final xll xll = new xll();
                while (b3k.Z0()) {
                    xll.add((Object)new Integer((int)b3k.getLong(0)));
                }
                return rml.j((Set)xll);
            }
            case 6: {
                final ttl ttl = (ttl)this.x;
                vt4.g0(o);
                if (ttl == ttl.v) {
                    b3 = false;
                }
                return b3;
            }
            case 5: {
                vt4.g0(o);
                return this.x == g0j.v && b;
            }
            case 4: {
                final s2b s2b = (s2b)this.x;
                vt4.g0(o);
                boolean b4 = b2;
                if (!(s2b instanceof r2b)) {
                    b4 = (s2b instanceof o2b && b2);
                }
                return b4;
            }
            case 3: {
                final b3k b3k2 = (b3k)this.x;
                vt4.g0(o);
                return b3k2.Z0();
            }
            case 2: {
                final vom vom = (vom)this.x;
                vt4.g0(o);
                return vom instanceof nea ^ true;
            }
            case 1: {
                final t2k t2k = (t2k)this.x;
                vt4.g0(o);
                o = t2k.d1("DELETE FROM cachedProjects WHERE uuid NOT IN (SELECT project_uuid FROM projectIdListEntries)");
                try {
                    ((b3k)o).Z0();
                    return lqo.a;
                }
                finally {
                    ((AutoCloseable)o).close();
                }
            }
            case 0: {
                final t2k t2k2 = (t2k)this.x;
                vt4.g0(o);
                o = t2k2.d1("SELECT uuid FROM cachedConversations WHERE uuid NOT IN (SELECT chat_uuid FROM chatIdListEntries WHERE type = 'chat')");
                Label_0393: {
                    try {
                        final ArrayList list = new ArrayList();
                        while (((b3k)o).Z0()) {
                            list.add((Object)((b3k)o).t0(0));
                        }
                    }
                    finally {
                        break Label_0393;
                    }
                    ((AutoCloseable)o).close();
                    return;
                }
                ((AutoCloseable)o).close();
                break;
            }
        }
    }
}
