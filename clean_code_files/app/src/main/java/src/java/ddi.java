import kotlin.jvm.KotlinReflectionNotSupportedError;

public abstract class ddi extends l03 implements auc
{
    public final boolean B;
    
    public ddi(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        this.B = false;
    }
    
    public final boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof ddi) {
                final ddi ddi = (ddi)o;
                if (this.i().equals(ddi.i()) && super.y.equals((Object)ddi.y) && super.z.equals((Object)ddi.z) && mlc.q(super.w, ddi.w)) {
                    return true;
                }
            }
            else if (o instanceof auc) {
                return o.equals(this.j());
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return super.z.hashCode() + smk.j(this.i().hashCode() * 31, 31, super.y);
    }
    
    public final qtc j() {
        if (this.B) {
            return (qtc)this;
        }
        qtc v;
        if ((v = super.v) == null) {
            v = this.c();
            super.v = v;
        }
        return v;
    }
    
    public final auc k() {
        if (this.B) {
            oyl.s("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        final qtc j = this.j();
        if (j != this) {
            return (auc)j;
        }
        throw new KotlinReflectionNotSupportedError();
    }
    
    public final String toString() {
        final qtc j = this.j();
        if (j != this) {
            return j.toString();
        }
        return oz1.p(new StringBuilder("property "), super.y, " (Kotlin reflection is not available)");
    }
}
