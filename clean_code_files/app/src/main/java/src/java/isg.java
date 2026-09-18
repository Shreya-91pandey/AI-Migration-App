import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class isg extends kpm implements Parcelable, o8m, xom, bnf
{
    public static final Parcelable$Creator<isg> CREATOR;
    public n8m w;
    
    static {
        CREATOR = (Parcelable$Creator)new fsg((byte)2);
    }
    
    public isg(final long n) {
        final r7m h = g8m.h();
        final n8m w = new n8m(h.g(), n);
        if (!(h instanceof b3b)) {
            w.b = new n8m(1L, n);
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
        if (((n8m)lpm2).c == ((n8m)lpm3).c) {
            return lpm2;
        }
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void f(final lpm lpm) {
        this.w = (n8m)lpm;
    }
    
    public final Object getValue() {
        return this.h();
    }
    
    public final long h() {
        return ((n8m)g8m.s(this.w, (jpm)this)).c;
    }
    
    public final void i(final long c) {
        final n8m n8m = (n8m)g8m.f(this.w);
        if (n8m.c != c) {
            final n8m w = this.w;
            final Object c2 = g8m.c;
            synchronized (c2) {
                final r7m h = g8m.h();
                ((n8m)g8m.n(w, this, h, n8m)).c = c;
                monitorexit(c2);
                g8m.l(h, (jpm)this);
            }
        }
    }
    
    public final void setValue(final Object o) {
        this.i(((Number)o).longValue());
    }
    
    public final String toString() {
        final long c = ((n8m)g8m.f(this.w)).c;
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder("MutableLongState(value=");
        sb.append(c);
        sb.append(")@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.h());
    }
}
