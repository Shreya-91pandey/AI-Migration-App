import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ksg extends kpm implements Parcelable, o8m
{
    public static final Parcelable$Creator<ksg> CREATOR;
    public final q8m w;
    public p8m x;
    
    static {
        CREATOR = (Parcelable$Creator)new jsg((byte)0);
    }
    
    public ksg(final Object o, final q8m w) {
        this.w = w;
        final r7m h = g8m.h();
        final p8m x = new p8m(h.g(), o);
        if (!(h instanceof b3b)) {
            x.b = new p8m(1L, o);
        }
        this.x = x;
    }
    
    public final lpm a() {
        return this.x;
    }
    
    public final q8m c() {
        return this.w;
    }
    
    public final lpm d(final lpm lpm, final lpm lpm2, final lpm lpm3) {
        final p8m p8m = (p8m)lpm;
        if (this.w.n(((p8m)lpm2).c, ((p8m)lpm3).c)) {
            return lpm2;
        }
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void f(final lpm lpm) {
        this.x = (p8m)lpm;
    }
    
    public final Object getValue() {
        return ((p8m)g8m.s(this.x, (jpm)this)).c;
    }
    
    public final void setValue(final Object c) {
        final p8m p8m = (p8m)g8m.f(this.x);
        if (!this.w.n(p8m.c, c)) {
            final p8m x = this.x;
            final Object c2 = g8m.c;
            synchronized (c2) {
                final r7m h = g8m.h();
                ((p8m)g8m.n(x, this, h, p8m)).c = c;
                monitorexit(c2);
                g8m.l(h, (jpm)this);
            }
        }
    }
    
    public final String toString() {
        final Object c = ((p8m)g8m.f(this.x)).c;
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder("MutableState(value=");
        sb.append(c);
        sb.append(")@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        parcel.writeValue(this.getValue());
        final cib a = cib.A;
        final q8m w = this.w;
        if (w.equals(a)) {
            n = 0;
        }
        else if (w.equals(def.D)) {
            n = 1;
        }
        else {
            if (!w.equals(awp.H)) {
                en9.q("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            n = 2;
        }
        parcel.writeInt(n);
    }
}
