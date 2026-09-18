import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class gsg extends kpm implements Parcelable, o8m, bnf, xom
{
    public static final Parcelable$Creator<gsg> CREATOR;
    public l8m w;
    
    static {
        CREATOR = (Parcelable$Creator)new fsg((byte)0);
    }
    
    public gsg(final float n) {
        final r7m h = g8m.h();
        final l8m w = new l8m(n, h.g());
        if (!(h instanceof b3b)) {
            w.b = new l8m(n, 1L);
        }
        this.w = w;
    }
    
    public final lpm a() {
        return this.w;
    }
    
    public final q8m c() {
        return (q8m)def.D;
    }
    
    public final lpm d(final lpm lpm, final lpm lpm2, final lpm lpm3) {
        if (((l8m)lpm2).c == ((l8m)lpm3).c) {
            return lpm2;
        }
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void f(final lpm lpm) {
        this.w = (l8m)lpm;
    }
    
    public Object getValue() {
        return this.h();
    }
    
    public final float h() {
        return ((l8m)g8m.s(this.w, (jpm)this)).c;
    }
    
    public final void i(final float c) {
        final l8m l8m = (l8m)g8m.f(this.w);
        if (l8m.c == c) {
            return;
        }
        final l8m w = this.w;
        final Object c2 = g8m.c;
        synchronized (c2) {
            final r7m h = g8m.h();
            ((l8m)g8m.n(w, this, h, l8m)).c = c;
            monitorexit(c2);
            g8m.l(h, (jpm)this);
        }
    }
    
    public void setValue(final Object o) {
        this.i(((Number)o).floatValue());
    }
    
    public final String toString() {
        final float c = ((l8m)g8m.f(this.w)).c;
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder("MutableFloatState(value=");
        sb.append(c);
        sb.append(")@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.h());
    }
}
