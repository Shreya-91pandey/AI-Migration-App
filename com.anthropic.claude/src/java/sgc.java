public abstract class sgc
{
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;
    
    public final boolean a(int n) {
        final int n2 = Integer.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = this.d;
        int n4 = n3 >>> 7 & d;
        int n5 = 0;
    Label_0195:
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & d;
                if (this.b[n11] == n) {
                    n = n11;
                    break Label_0195;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & d);
        }
        return n >= 0;
    }
    
    public final Object b(int n) {
        final int n2 = Integer.hashCode(n) * -862048943;
        final int n3 = n2 ^ n2 << 16;
        final int d = this.d;
        int n4 = n3 >>> 7 & d;
        int n5 = 0;
    Label_0195:
        while (true) {
            final long[] a = this.a;
            final int n6 = n4 >> 3;
            final int n7 = (n4 & 0x7) << 3;
            final long n8 = (a[n6 + 1] << 64 - n7 & -n7 >> 63) | a[n6] >>> n7;
            final long n9 = (n3 & 0x7F) * 72340172838076673L ^ n8;
            for (long n10 = ~n9 & n9 - 72340172838076673L & 0x8080808080808080L; n10 != 0L; n10 &= n10 - 1L) {
                final int n11 = (Long.numberOfTrailingZeros(n10) >> 3) + n4 & d;
                if (this.b[n11] == n) {
                    n = n11;
                    break Label_0195;
                }
            }
            if ((n8 & ~n8 << 6 & 0x8080808080808080L) != 0x0L) {
                n = -1;
                break;
            }
            n5 += 8;
            n4 = (n4 + n5 & d);
        }
        if (n >= 0) {
            return this.c[n];
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof sgc)) {
            return false;
        }
        final sgc sgc = (sgc)o;
        if (sgc.e != this.e) {
            return false;
        }
        final int[] b = this.b;
        final Object[] c = this.c;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final int n6 = b[n5];
                            final Object o2 = c[n5];
                            if (o2 == null) {
                                if (sgc.b(n6) != null || !sgc.a(n6)) {
                                    return false;
                                }
                            }
                            else if (!o2.equals(sgc.b(n6))) {
                                return false;
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int[] b = this.b;
        final Object[] c = this.c;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n < 0) {
            return 0;
        }
        int n2 = 0;
        int n3 = 0;
        while (true) {
            long n4 = a[n2];
            int n5 = n3;
            if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                final int n6 = 8 - (~(n2 - n) >>> 31);
                int n7;
                for (int i = 0; i < n6; ++i, n3 = n7) {
                    n7 = n3;
                    if ((0xFFL & n4) < 128L) {
                        final int n8 = (n2 << 3) + i;
                        final int n9 = b[n8];
                        final Object o = c[n8];
                        final int hashCode = Integer.hashCode(n9);
                        int hashCode2;
                        if (o != null) {
                            hashCode2 = o.hashCode();
                        }
                        else {
                            hashCode2 = 0;
                        }
                        n7 = n3 + (hashCode2 ^ hashCode);
                    }
                    n4 >>= 8;
                }
                if (n6 != 8) {
                    return n3;
                }
                n5 = n3;
            }
            if (n2 == n) {
                return n5;
            }
            ++n2;
            n3 = n5;
        }
    }
    
    @Override
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder("{");
        final int[] b = this.b;
        final Object[] c = this.c;
        final long[] a = this.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            int n3 = 0;
            while (true) {
                long n4 = a[n2];
                int n5 = n3;
                if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n6 = 8 - (~(n2 - n) >>> 31);
                    int n7;
                    for (int i = 0; i < n6; ++i, n3 = n7) {
                        n7 = n3;
                        if ((0xFFL & n4) < 128L) {
                            final int n8 = (n2 << 3) + i;
                            final int n9 = b[n8];
                            final Object o = c[n8];
                            sb.append(n9);
                            sb.append("=");
                            Object o2;
                            if ((o2 = o) == this) {
                                o2 = "(this)";
                            }
                            sb.append(o2);
                            n7 = ++n3;
                            if (n3 < this.e) {
                                sb.append(", ");
                                n7 = n3;
                            }
                        }
                        n4 >>= 8;
                    }
                    if (n6 != 8) {
                        break;
                    }
                    n5 = n3;
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
                n3 = n5;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
