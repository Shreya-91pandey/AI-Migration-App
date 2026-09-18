public final class via implements mia
{
    public final float a;
    public final xgm b;
    
    public via(final float c, final float n, final float a) {
        this.a = a;
        final Object b = new Object();
        ((xgm)b).a = 1.0f;
        ((xgm)b).b = Math.sqrt(50.0);
        ((xgm)b).c = 1.0f;
        if (c < 0.0f) {
            rih.a("Damping ratio must be non-negative");
        }
        ((xgm)b).c = c;
        final double b2 = ((xgm)b).b;
        if ((float)(b2 * b2) <= 0.0f) {
            rih.a("Spring stiffness constant must be positive.");
        }
        ((xgm)b).b = Math.sqrt((double)n);
        this.b = (xgm)b;
    }
    
    @Override
    public final float b(long n, final float n2, final float a, final float n3) {
        n /= 1000000L;
        final xgm b = this.b;
        b.a = a;
        return Float.intBitsToFloat((int)(b.a(n, n2, n3) & 0xFFFFFFFFL));
    }
    
    @Override
    public final long c(float n, float n2, final float n3) {
        final xgm b = this.b;
        final double b2 = b.b;
        final float n4 = (float)(b2 * b2);
        final float c = b.c;
        final float a = this.a;
        n = (n - n2) / a;
        n2 = n3 / a;
        long n5;
        if (c == 0.0f) {
            n5 = 9223372036854L;
        }
        else {
            final double n6 = n4;
            final double n7 = c;
            final double n8 = n2;
            final double n9 = n;
            final double n10 = Math.sqrt(n6) * (n7 * 2.0);
            final double n11 = n10 * n10 - n6 * 4.0;
            final double n12 = dcmpg(n11, 0.0);
            double sqrt;
            if (n12 < 0) {
                sqrt = 0.0;
            }
            else {
                sqrt = Math.sqrt(n11);
            }
            double sqrt2;
            if (n12 < 0) {
                sqrt2 = Math.sqrt(Math.abs(n11));
            }
            else {
                sqrt2 = 0.0;
            }
            final double n13 = -n10;
            final double n14 = (n13 + sqrt) * 0.5;
            final double n15 = (n13 - sqrt) * 0.5;
            final double n16 = dcmpg(n9, 0.0);
            if (n16 == 0 && n8 == 0.0) {
                n5 = 0L;
            }
            else {
                double n17 = n8;
                if (n16 < 0) {
                    n17 = -n8;
                }
                final double abs = Math.abs(n9);
                double n18 = 1.0;
                final double n19 = -1.0;
                double n20 = Double.MAX_VALUE;
                double n29 = 0.0;
                if (n7 > 1.0) {
                    final double n21 = n14 - n15;
                    final double n22 = (n14 * abs - n17) / n21;
                    final double n23 = abs - n22;
                    final double n24 = Math.log(Math.abs(1.0 / n23)) / n14;
                    final double n25 = Math.log(Math.abs(1.0 / n22)) / n15;
                    double max;
                    if ((Double.doubleToRawLongBits(n24) & Long.MAX_VALUE) < 9218868437227405312L) {
                        max = n24;
                        if ((Double.doubleToRawLongBits(n25) & Long.MAX_VALUE) < 9218868437227405312L) {
                            max = Math.max(n24, n25);
                        }
                    }
                    else {
                        max = n25;
                    }
                    final double n26 = n23 * n14;
                    final double n27 = Math.log(n26 / (-n22 * n15)) / (n15 - n14);
                    double n28 = max;
                    Label_0505: {
                        if (!Double.isNaN(n27)) {
                            if (n27 <= 0.0) {
                                n28 = max;
                            }
                            else {
                                if (n27 <= 0.0 || -(Math.exp(n27 * n15) * n22 + Math.exp(n14 * n27) * n23) >= 1.0) {
                                    n29 = Math.log(-(n22 * n15 * n15) / (n26 * n14)) / n21;
                                    break Label_0505;
                                }
                                if (n22 > 0.0 && n23 < 0.0) {
                                    max = 0.0;
                                }
                                n28 = max;
                            }
                        }
                        n18 = -1.0;
                        n29 = n28;
                    }
                    final double exp = Math.exp(n14 * n29);
                    final double n30 = n22 * n15;
                    if (Math.abs(Math.exp(n15 * n29) * n30 + exp * n26) >= 1.0E-4) {
                        int n31 = 0;
                        double n32 = n29;
                        while (true) {
                            n29 = n32;
                            if (n20 <= 0.001) {
                                break;
                            }
                            n29 = n32;
                            if (n31 >= 100) {
                                break;
                            }
                            ++n31;
                            final double n33 = n14 * n32;
                            final double exp2 = Math.exp(n33);
                            final double n34 = n15 * n32;
                            final double n35 = n32 - (Math.exp(n34) * n22 + exp2 * n23 + n18) / (Math.exp(n34) * n30 + Math.exp(n33) * n26);
                            n20 = Math.abs(n32 - n35);
                            n32 = n35;
                        }
                    }
                }
                else if (n7 < 1.0) {
                    final double n36 = (n17 - n14 * abs) / (sqrt2 * 0.5);
                    n29 = Math.log(1.0 / Math.sqrt(n36 * n36 + abs * abs)) / n14;
                }
                else {
                    final double n37 = n14 * abs;
                    final double n38 = n17 - n37;
                    final double n39 = Math.log(Math.abs(1.0 / abs)) / n14;
                    double log;
                    final double n40 = log = Math.log(Math.abs(1.0 / n38));
                    for (int i = 0; i < 6; ++i) {
                        log = n40 - Math.log(Math.abs(log / n14));
                    }
                    final double n41 = log / n14;
                    double max2;
                    if ((Double.doubleToRawLongBits(n39) & Long.MAX_VALUE) < 9218868437227405312L) {
                        max2 = n39;
                        if ((Double.doubleToRawLongBits(n41) & Long.MAX_VALUE) < 9218868437227405312L) {
                            max2 = Math.max(n39, n41);
                        }
                    }
                    else {
                        max2 = n41;
                    }
                    final double n42 = -(n37 + n38) / (n14 * n38);
                    final double n43 = n14 * n42;
                    final double exp3 = Math.exp(n43);
                    final double exp4 = Math.exp(n43);
                    double n44 = max2;
                    double n45 = n19;
                    if (!Double.isNaN(n42)) {
                        if (n42 <= 0.0) {
                            n44 = max2;
                            n45 = n19;
                        }
                        else if (n42 > 0.0 && -(exp4 * (n38 * n42) + exp3 * abs) < 1.0) {
                            if (n38 < 0.0 && abs > 0.0) {
                                max2 = 0.0;
                            }
                            n44 = max2;
                            n45 = n19;
                        }
                        else {
                            n44 = -(2.0 / n14) - abs / n38;
                            n45 = 1.0;
                        }
                    }
                    int n46 = 0;
                    while (true) {
                        n29 = n44;
                        if (n20 <= 0.001) {
                            break;
                        }
                        n29 = n44;
                        if (n46 >= 100) {
                            break;
                        }
                        ++n46;
                        final double n47 = n14 * n44;
                        final double n48 = n44 - (Math.exp(n47) * (n38 * n44 + abs) + n45) / (Math.exp(n47) * ((n47 + 1.0) * n38 + n37));
                        n20 = Math.abs(n44 - n48);
                        n44 = n48;
                    }
                }
                n5 = (long)(n29 * 1000.0);
            }
        }
        return n5 * 1000000L;
    }
    
    @Override
    public final float d(final float n, final float n2, final float n3) {
        return 0.0f;
    }
    
    @Override
    public final float e(long n, final float n2, final float a, final float n3) {
        n /= 1000000L;
        final xgm b = this.b;
        b.a = a;
        return Float.intBitsToFloat((int)(b.a(n, n2, n3) >> 32));
    }
}
