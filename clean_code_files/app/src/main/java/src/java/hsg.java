import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class hsg extends kpm implements Parcelable, o8m, bnf, xom
{
    public static final Parcelable$Creator<hsg> CREATOR;
    public m8m w;
    
    static {
        CREATOR = (Parcelable$Creator)new fsg((byte)1);
    }
    
    public hsg(final int n) {
        final r7m h = g8m.h();
        final m8m w = new m8m(h.g(), n);
        if (!(h instanceof b3b)) {
            w.b = new m8m(1L, n);
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
        if (((m8m)lpm2).c == ((m8m)lpm3).c) {
            return lpm2;
        }
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void f(final lpm lpm) {
        this.w = (m8m)lpm;
    }
    
    public Object getValue() {
        return this.h();
    }
    
    public final int h() {
        return ((m8m)g8m.s(this.w, (jpm)this)).c;
    }
    
    public final void i(final int c) {
        final m8m m8m = (m8m)g8m.f(this.w);
        if (m8m.c != c) {
            final m8m w = this.w;
            final Object c2 = g8m.c;
            synchronized (c2) {
                final r7m h = g8m.h();
                ((m8m)g8m.n(w, this, h, m8m)).c = c;
                monitorexit(c2);
                g8m.l(h, (jpm)this);
            }
        }
    }
    
    public void setValue(final Object o) {
        this.i(((Number)o).intValue());
    }
    
    public final String toString() {
        return smk.o(((m8m)g8m.f(this.w)).c, this.hashCode(), "MutableIntState(value=", ")@");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.h());
    }
}
