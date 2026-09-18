import java.io.Serializable;

public class gf implements kua, Serializable
{
    public final byte A;
    public final int B;
    public final Object v;
    public final Class w;
    public final String x;
    public final String y;
    public final boolean z;
    
    public gf() {
        this(1, k03.v, x90.class, "androidPredictiveBackAnimatableV1", "androidPredictiveBackAnimatableV1(Lcom/arkivanov/essenty/backhandler/BackEvent;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/arkivanov/decompose/extensions/compose/stack/animation/predictiveback/PredictiveBackAnimatable;", 1);
    }
    
    public gf(final int a, final Object v, final Class w, final String x, final String y, final int n) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = ((n & 0x1) == 0x1);
        this.A = (byte)a;
        this.B = n >> 1;
    }
    
    public final int e() {
        return this.A;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof gf) {
                final gf gf = (gf)o;
                if (this.z == gf.z && this.A == gf.A && this.B == gf.B && mlc.q(this.v, gf.v) && mlc.q((Object)this.w, (Object)gf.w) && this.x.equals((Object)gf.x) && this.y.equals((Object)gf.y)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Object v = this.v;
        int hashCode2;
        if (v != null) {
            hashCode2 = v.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Class w = this.w;
        if (w != null) {
            hashCode = w.hashCode();
        }
        final int j = smk.j(smk.j((hashCode2 * 31 + hashCode) * 31, 31, this.x), 31, this.y);
        int n;
        if (this.z) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return ((j + n) * 31 + this.A) * 31 + this.B;
    }
    
    @Override
    public final String toString() {
        v4j.a.getClass();
        return w4j.a((kua)this);
    }
}
