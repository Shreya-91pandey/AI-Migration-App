public final class ev0 implements jv0
{
    public final byte v;
    
    public final void r(final xc8 xc8, int n, final int[] array, final int[] array2) {
        final byte v = this.v;
        final int n2 = 0;
        int i = 0;
        switch (v) {
            default: {
                final int length = array.length;
                n = 0;
                int n3 = 0;
                while (i < length) {
                    final int n4 = array[i];
                    array2[n] = n3;
                    n3 += n4;
                    ++i;
                    ++n;
                }
                return;
            }
            case 0: {
                final int length2 = array.length;
                int j = 0;
                int n5 = 0;
                while (j < length2) {
                    n5 += array[j];
                    ++j;
                }
                final int length3 = array.length;
                int n6 = n - n5;
                n = 0;
                for (int k = n2; k < length3; ++k, ++n) {
                    final int n7 = array[k];
                    array2[n] = n6;
                    n6 += n7;
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.v) {
            default: {
                return "Arrangement#Top";
            }
            case 0: {
                return "Arrangement#Bottom";
            }
        }
    }
}
