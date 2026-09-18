public final class ahk
{
    public final chk a;
    
    public ahk(final chk a) {
        this.a = a;
    }
    
    public final long a(final int j, long n) {
        final chk a = this.a;
        a.j = (byte)j;
        final w60 b = a.b;
        if (b != null && a.b()) {
            final byte i = a.j;
            final e0j m = a.m;
            final k19 c = b.c;
            if (!yzl.d(b.g)) {
                if (!b.f) {
                    if (k19.g(c.f)) {
                        b.g(0L);
                    }
                    if (k19.g(c.g)) {
                        b.h(0L);
                    }
                    if (k19.g(c.d)) {
                        b.i(0L);
                    }
                    if (k19.g(c.e)) {
                        b.f(0L);
                    }
                    b.f = true;
                }
                final int a2 = x80.a;
                float n2;
                if (i == 2) {
                    n2 = 4.0f;
                }
                else {
                    n2 = 1.0f;
                }
                final long k = l6g.j(n2, n);
                final int n3 = (int)(n & 0xFFFFFFFFL);
                float n4 = 0.0f;
                Label_0395: {
                    if (Float.intBitsToFloat(n3) != 0.0f) {
                        if (k19.g(c.d) && Float.intBitsToFloat(n3) < 0.0f) {
                            final float l = b.i(k);
                            if (!k19.g(c.d)) {
                                c.e().finish();
                            }
                            if (l == Float.intBitsToFloat((int)(k & 0xFFFFFFFFL))) {
                                n4 = Float.intBitsToFloat(n3);
                                break Label_0395;
                            }
                            n4 = l / n2;
                            break Label_0395;
                        }
                        else if (k19.g(c.e) && Float.intBitsToFloat(n3) > 0.0f) {
                            final float f = b.f(k);
                            if (!k19.g(c.e)) {
                                c.b().finish();
                            }
                            if (f == Float.intBitsToFloat((int)(k & 0xFFFFFFFFL))) {
                                n4 = Float.intBitsToFloat(n3);
                                break Label_0395;
                            }
                            n4 = f / n2;
                            break Label_0395;
                        }
                    }
                    n4 = 0.0f;
                }
                final int n5 = (int)(n >> 32);
                float n7 = 0.0f;
                Label_0581: {
                    Label_0412: {
                        if (Float.intBitsToFloat(n5) != 0.0f) {
                            float n6;
                            if (k19.g(c.f) && Float.intBitsToFloat(n5) < 0.0f) {
                                final float g = b.g(k);
                                if (!k19.g(c.f)) {
                                    c.c().finish();
                                }
                                n6 = g;
                                if (g == Float.intBitsToFloat((int)(k >> 32))) {
                                    n7 = Float.intBitsToFloat(n5);
                                    break Label_0581;
                                }
                            }
                            else {
                                if (!k19.g(c.g) || Float.intBitsToFloat(n5) <= 0.0f) {
                                    break Label_0412;
                                }
                                final float h = b.h(k);
                                if (!k19.g(c.g)) {
                                    c.d().finish();
                                }
                                n6 = h;
                                if (h == Float.intBitsToFloat((int)(k >> 32))) {
                                    n7 = Float.intBitsToFloat(n5);
                                    break Label_0581;
                                }
                            }
                            n7 = n6 / n2;
                            break Label_0581;
                        }
                    }
                    n7 = 0.0f;
                }
                final long n8 = (long)Float.floatToRawIntBits(n7) << 32 | ((long)Float.floatToRawIntBits(n4) & 0xFFFFFFFFL);
                if (!l6g.c(n8, 0L)) {
                    b.d();
                }
                final long h2 = l6g.h(n, n8);
                final long a3 = ((l6g)((lta)m).b((Object)new l6g(h2))).a;
                n = l6g.h(h2, a3);
                if (Float.intBitsToFloat((int)(h2 >> 32)) != 0.0f || Float.intBitsToFloat((int)(h2 & 0xFFFFFFFFL)) != 0.0f) {
                    if (Float.intBitsToFloat((int)(a3 >> 32)) != 0.0f || Float.intBitsToFloat((int)(a3 & 0xFFFFFFFFL)) != 0.0f) {
                        if (k19.g(c.f) || k19.g(c.d) || k19.g(c.g) || k19.g(c.e)) {
                            b.a();
                        }
                    }
                }
                while (true) {
                    Label_0903: {
                        if (i != 1) {
                            break Label_0903;
                        }
                        final int n9 = (int)(n >> 32);
                        boolean b2 = false;
                        Label_0831: {
                            if (Float.intBitsToFloat(n9) > 0.5f) {
                                b.g(n);
                            }
                            else {
                                if (Float.intBitsToFloat(n9) >= -0.5f) {
                                    b2 = false;
                                    break Label_0831;
                                }
                                b.h(n);
                            }
                            b2 = true;
                        }
                        final int n10 = (int)(n & 0xFFFFFFFFL);
                        boolean b3 = false;
                        Label_0887: {
                            if (Float.intBitsToFloat(n10) > 0.5f) {
                                b.i(n);
                            }
                            else {
                                if (Float.intBitsToFloat(n10) >= -0.5f) {
                                    b3 = false;
                                    break Label_0887;
                                }
                                b.f(n);
                            }
                            b3 = true;
                        }
                        if (!b2 && !b3) {
                            break Label_0903;
                        }
                        final int n11 = 1;
                        int n12 = n11;
                        if (!l6g.c(h2, 0L)) {
                            int f2;
                            if (k19.f(c.f) && Float.intBitsToFloat(n5) < 0.0f) {
                                y9r.m(c.c(), Float.intBitsToFloat(n5));
                                f2 = (k19.f(c.f) ? 1 : 0);
                            }
                            else {
                                f2 = 0;
                            }
                            int n13 = f2;
                            if (k19.f(c.g)) {
                                n13 = f2;
                                if (Float.intBitsToFloat(n5) > 0.0f) {
                                    y9r.m(c.d(), Float.intBitsToFloat(n5));
                                    n13 = ((f2 || k19.f(c.g)) ? 1 : 0);
                                }
                            }
                            int n14 = n13;
                            if (k19.f(c.d)) {
                                n14 = n13;
                                if (Float.intBitsToFloat(n3) < 0.0f) {
                                    y9r.m(c.e(), Float.intBitsToFloat(n3));
                                    n14 = ((n13 || k19.f(c.d)) ? 1 : 0);
                                }
                            }
                            int n15 = n14;
                            if (k19.f(c.e)) {
                                n15 = n14;
                                if (Float.intBitsToFloat(n3) > 0.0f) {
                                    y9r.m(c.b(), Float.intBitsToFloat(n3));
                                    n15 = ((n14 || k19.f(c.e)) ? 1 : 0);
                                }
                            }
                            int n16;
                            if (n15 == 0 && n11 == 0) {
                                n16 = 0;
                            }
                            else {
                                n16 = 1;
                            }
                            n12 = n16;
                        }
                        if (n12 != 0) {
                            b.d();
                        }
                        n = l6g.i(n8, a3);
                        return n;
                    }
                    final int n11 = 0;
                    continue;
                }
            }
            n = ((l6g)((lta)m).b((Object)new l6g(n))).a;
            return n;
        }
        return a.d(a.k, n, j);
    }
}
