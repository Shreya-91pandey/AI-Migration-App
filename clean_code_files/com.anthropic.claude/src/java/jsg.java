import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;

public final class jsg implements Parcelable$ClassLoaderCreator
{
    public final byte a;
    
    public static ksg a(final Parcel parcel, final ClassLoader classLoader) {
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = jsg.class.getClassLoader();
        }
        final Object value = parcel.readValue(classLoader2);
        final int int1 = parcel.readInt();
        Object o;
        if (int1 != 0) {
            if (int1 != 1) {
                if (int1 != 2) {
                    en9.q(oz1.n("Unsupported MutableState policy ", int1, " was restored"));
                    return null;
                }
                o = awp.H;
            }
            else {
                o = def.D;
            }
        }
        else {
            o = cib.A;
        }
        return new ksg(value, (q8m)o);
    }
    
    public static a9m b(final Parcel parcel, final ClassLoader classLoader) {
        final a9m a9m = new a9m();
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = a9m.class.getClassLoader();
        }
        for (int int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            a9m.add(parcel.readValue(classLoader2));
        }
        return a9m;
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            default: {
                return b(parcel, null);
            }
            case 0: {
                return a(parcel, null);
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new a9m[n];
            }
            case 0: {
                return new ksg[n];
            }
        }
    }
}
