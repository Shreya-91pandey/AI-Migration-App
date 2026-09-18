public final class xgm
{
    public float a;
    public double b;
    public float c;
    
    public final long a(long n, float n2, float n3) {
        n2 -= this.a;
        final double n4 = n / 1000.0;
        final float c = this.c;
        final double n5 = c * (double)c;
        final double n6 = -c;
        final double b = this.b;
        final double n7 = n6 * b;
        double n16 = 0.0;
        double n26 = 0.0;
        Label_0404: {
            double n17;
            double n18;
            if (c > 1.0f) {
                final double n8 = Math.sqrt(n5 - 1.0) * b;
                final double n9 = n7 + n8;
                final double n10 = n7 - n8;
                final double n11 = n2;
                final double n12 = (n10 * n11 - n3) / (n10 - n9);
                final double n13 = n11 - n12;
                final double n14 = n10 * n4;
                final double exp = Math.exp(n14);
                final double n15 = n4 * n9;
                n16 = Math.exp(n15) * n12 + exp * n13;
                n17 = Math.exp(n14) * (n13 * n10);
                n18 = Math.exp(n15) * (n12 * n9);
            }
            else {
                if (c != 1.0f) {
                    final double n19 = Math.sqrt(1.0 - n5) * b;
                    final double n20 = 1.0 / n19;
                    final double n21 = -n7;
                    final double n22 = n2;
                    final double n23 = (n21 * n22 + n3) * n20;
                    final double n24 = n19 * n4;
                    final double n25 = n4 * n7;
                    n16 = (Math.sin(n24) * n23 + Math.cos(n24) * n22) * Math.exp(n25);
                    n26 = (Math.cos(n24) * (n19 * n23) + Math.sin(n24) * (-n19 * n22)) * Math.exp(n25) + n7 * n16;
                    break Label_0404;
                }
                final double n27 = n3;
                final double n28 = n2;
                final double n29 = b * n28 + n27;
                final double n30 = -b * n4;
                final double n31 = n4 * n29 + n28;
                n16 = Math.exp(n30) * n31;
                n17 = Math.exp(n30) * n31 * -this.b;
                n18 = Math.exp(n30) * n29;
            }
            n26 = n18 + n17;
        }
        n2 = (float)(n16 + this.a);
        n3 = (float)n26;
        n = Float.floatToRawIntBits(n2);
        return ((long)Float.floatToRawIntBits(n3) & 0xFFFFFFFFL) | n << 32;
    }
}
