public final class fv0 implements gv0
{
    public final byte v;
    
    public final void h(final xc8 xc8, int n, final int[] array, final qzc qzc, final int[] array2) {
        final byte v = this.v;
        final qzc v2 = qzc.v;
        final int n2 = 0;
        final int n3 = 0;
        int n4 = 0;
        int i = 0;
        switch (v) {
            default: {
                if (qzc == v2) {
                    final int length = array.length;
                    n = 0;
                    int n5 = 0;
                    while (i < length) {
                        final int n6 = array[i];
                        array2[n] = n5;
                        n5 += n6;
                        ++i;
                        ++n;
                    }
                }
                else {
                    final int length2 = array.length;
                    int n7 = 0;
                    for (int j = n2; j < length2; ++j) {
                        n7 += array[j];
                    }
                    int n8 = n - n7;
                    int n9;
                    for (n = array.length - 1; -1 < n; --n) {
                        n9 = array[n];
                        array2[n] = n8;
                        n8 += n9;
                    }
                }
                return;
            }
            case 0: {
                if (qzc == v2) {
                    final int length3 = array.length;
                    int k = 0;
                    int n10 = 0;
                    while (k < length3) {
                        n10 += array[k];
                        ++k;
                    }
                    int n11 = n - n10;
                    final int length4 = array.length;
                    n = 0;
                    for (int l = n3; l < length4; ++l, ++n) {
                        final int n12 = array[l];
                        array2[n] = n11;
                        n11 += n12;
                    }
                }
                else {
                    int n13;
                    for (n = array.length - 1; -1 < n; --n) {
                        n13 = array[n];
                        array2[n] = n4;
                        n4 += n13;
                    }
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.v) {
            default: {
                return "Arrangement#Start";
            }
            case 0: {
                return "Arrangement#End";
            }
        }
    }
}
