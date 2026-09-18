import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;

public final class u8m implements Parcelable$ClassLoaderCreator
{
    public static v8m a(final Parcel parcel, final ClassLoader classLoader) {
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = u8m.class.getClassLoader();
        }
        final int int1 = parcel.readInt();
        final u9l u9l = new u9l((Object)parcel, (Object)classLoader2, (byte)16);
        if (int1 == 0) {
            return new v8m();
        }
        final v4h o = f6m.w.o();
        for (int i = 0; i < int1; ++i) {
            o.add(u9l.b((Object)i));
        }
        return new v8m(o.j());
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        return a(parcel, null);
    }
    
    public final Object[] newArray(final int n) {
        return new v8m[n];
    }
}
