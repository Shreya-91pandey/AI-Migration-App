import androidx.compose.ui.node.Owner;

public final class cd3
{
    public final cd3 a;
    public final ksg b;
    
    public cd3(final zz3 zz3, final cd3 a) {
        this.a = a;
        this.b = o50.Q((Object)zz3);
    }
    
    public final void a(final Owner owner, final zta zta, final h07 h07) {
        zc3 zc4 = null;
        Label_0054: {
            if (h07 instanceof zc3) {
                final zc3 zc3 = (zc3)h07;
                final int x = zc3.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    zc3.x = x + Integer.MIN_VALUE;
                    zc4 = zc3;
                    break Label_0054;
                }
            }
            zc4 = new zc3(this, h07);
        }
        final Object v = zc4.v;
        final int x2 = zc4.x;
        if (x2 == 0) {
            vt4.g0(v);
            final o10 o10 = new o10((Object)zta, (Object)this, (f07)null, (byte)8);
            zc4.x = 1;
            sbh.c(owner, this.a, (zta)o10, zc4);
            return;
        }
        if (x2 != 1) {
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        throw ge9.w(v);
    }
}
