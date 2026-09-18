import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ae implements Parcelable
{
    public static final Parcelable$Creator<ae> CREATOR;
    public final int v;
    public final Intent w;
    
    static {
        CREATOR = (Parcelable$Creator)new lgq((byte)1);
    }
    
    public ae(final int v, final Intent w) {
        this.v = v;
        this.w = w;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        sb.append(m6r.s(this.v));
        sb.append(", data=");
        sb.append((Object)this.w);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.v);
        final Intent w = this.w;
        int n2;
        if (w == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        if (w != null) {
            w.writeToParcel(parcel, n);
        }
    }
}
