import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;

public final class lc0
{
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    
    public lc0(final byte b) {
        switch (b) {
            default: {
                this.c = new Object();
                return;
            }
            case 3: {
                this.c = new Object();
            }
        }
    }
    
    public int a(final long n) {
        final int a = this.a;
        final long[] array = (long[])this.c;
        final int length = array.length;
        if (a + 1 > length) {
            final int n2 = length * 2;
            final long[] c = new long[n2];
            final int[] d = new int[n2];
            System.arraycopy((Object)array, 0, (Object)c, 0, array.length);
            iw0.N0(0, 0, 14, (int[])this.d, d);
            this.c = c;
            this.d = d;
        }
        final int n3 = this.a++;
        int[] e = (int[])this.e;
        final int length2 = e.length;
        if (this.b >= length2) {
            final int n4 = length2 * 2;
            e = new int[n4];
            int n5;
            for (int i = 0; i < n4; i = n5) {
                n5 = i + 1;
                e[i] = n5;
            }
            iw0.N0(0, 0, 14, (int[])this.e, e);
            this.e = e;
        }
        final int b = this.b;
        this.b = e[b];
        final long[] array2 = (long[])this.c;
        array2[n3] = n;
        e[((int[])this.d)[n3] = b] = n3;
        int n6;
        for (int j = n3; j > 0; j = n6) {
            n6 = (j + 1 >> 1) - 1;
            if (mlc.v(array2[n6], n) <= 0) {
                break;
            }
            this.d(n6, j);
        }
        return b;
    }
    
    public qd6 b(final TypedArray typedArray, final Resources$Theme resources$Theme, final String s, int resourceId) {
        qd6 l = null;
        Label_0122: {
            if (vt4.M((XmlPullParser)this.c, s)) {
                final TypedValue typedValue = new TypedValue();
                typedArray.getValue(resourceId, typedValue);
                final int type = typedValue.type;
                if (type >= 28 && type <= 31) {
                    l = new qd6((Object)null, typedValue.data, (byte)0);
                    break Label_0122;
                }
                final Resources resources = typedArray.getResources();
                resourceId = typedArray.getResourceId(resourceId, 0);
                try {
                    l = qd6.l(resources, resourceId, resources$Theme);
                }
                catch (final Exception ex) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", (Throwable)ex);
                    l = null;
                }
                if (l != null) {
                    break Label_0122;
                }
            }
            l = new qd6((Object)null, 0, (byte)0);
        }
        this.e(typedArray.getChangingConfigurations());
        return l;
    }
    
    public float c(final TypedArray typedArray, final String s, final int n, float float1) {
        if (vt4.M((XmlPullParser)this.c, s)) {
            float1 = typedArray.getFloat(n, float1);
        }
        this.e(typedArray.getChangingConfigurations());
        return float1;
    }
    
    public void d(final int n, final int n2) {
        final long[] array = (long[])this.c;
        final int[] array2 = (int[])this.d;
        final int[] array3 = (int[])this.e;
        final long n3 = array[n];
        array[n] = array[n2];
        array[n2] = n3;
        final int n4 = array2[n];
        final int n5 = array2[n2];
        array2[n] = n5;
        array2[n2] = n4;
        array3[n5] = n;
        array3[n4] = n2;
    }
    
    public void e(final int n) {
        this.a |= n;
    }
}
