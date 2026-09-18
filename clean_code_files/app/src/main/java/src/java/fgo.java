import java.util.Arrays;

public final class fgo
{
    public static final fgo e;
    public int a;
    public int b;
    public final eup c;
    public Object[] d;
    
    static {
        e = new fgo(0, 0, new Object[0], null);
    }
    
    public fgo(final int a, final int b, final Object[] d, final eup c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static fgo j(final int n, final Object o, final Object o2, final int n2, final Object o3, final Object o4, final int n3, final eup eup) {
        if (n3 > 30) {
            return new fgo(0, 0, new Object[] { o, o2, o3, o4 }, eup);
        }
        final int c = yi2.C(n, n3);
        final int c2 = yi2.C(n2, n3);
        if (c != c2) {
            Object[] array;
            if (c < c2) {
                array = new Object[] { o, o2, o3, o4 };
            }
            else {
                array = new Object[] { o3, o4, o, o2 };
            }
            return new fgo(1 << c | 1 << c2, 0, array, eup);
        }
        return new fgo(0, 1 << c, new Object[] { j(n, o, o2, n2, o3, o4, n3 + 5, eup) }, eup);
    }
    
    public final Object[] a(final int n, int n2, int t, final Object o, final Object o2, final int n3, final eup eup) {
        final Object o3 = this.d[n];
        int hashCode;
        if (o3 != null) {
            hashCode = o3.hashCode();
        }
        else {
            hashCode = 0;
        }
        final fgo j = j(hashCode, o3, this.x(n), t, o, o2, n3 + 5, eup);
        t = this.t(n2);
        n2 = t + 1;
        final Object[] d = this.d;
        final Object[] array = new Object[d.length - 1];
        iw0.O0(0, n, 6, d, array);
        iw0.K0(n, n + 2, n2, d, array);
        array[t - 1] = j;
        iw0.K0(t, n2, d.length, d, array);
        return array;
    }
    
    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        for (int i = bitCount * 2; i < this.d.length; ++i) {
            bitCount += this.s(i).b();
        }
        return bitCount;
    }
    
    public final boolean c(final Object o) {
        final vgc o2 = ncq.O(2, ncq.T(0, this.d.length));
        final int v = o2.v;
        final int w = o2.w;
        final int x = o2.x;
        int n;
        if (x <= 0 || (n = v) > w) {
            if (x >= 0 || w > v) {
                return false;
            }
            n = v;
        }
        while (!mlc.q(o, this.d[n])) {
            if (n == w) {
                return false;
            }
            n += x;
        }
        return true;
    }
    
    public final boolean d(int f, final int n, final Object o) {
        final int n2 = 1 << yi2.C(f, n);
        if (this.h(n2)) {
            f = this.f(n2);
            return mlc.q(o, this.d[f]);
        }
        if (!this.i(n2)) {
            return false;
        }
        final fgo s = this.s(this.t(n2));
        if (n == 30) {
            return s.c(o);
        }
        return s.d(f, n + 5, o);
    }
    
    public final boolean e(final fgo fgo) {
        if (this != fgo) {
            if (this.b == fgo.b) {
                if (this.a == fgo.a) {
                    for (int length = this.d.length, i = 0; i < length; ++i) {
                        if (this.d[i] != fgo.d[i]) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int f(final int n) {
        return Integer.bitCount(this.a & n - 1) * 2;
    }
    
    public final Object g(int f, int v, final Object o) {
        final int n = 1 << yi2.C(f, v);
        if (this.h(n)) {
            f = this.f(n);
            if (mlc.q(o, this.d[f])) {
                return this.x(f);
            }
        }
        else if (this.i(n)) {
            final fgo s = this.s(this.t(n));
            if (v == 30) {
                final vgc o2 = ncq.O(2, ncq.T(0, s.d.length));
                v = o2.v;
                final int w = o2.w;
                final int x = o2.x;
                if (x <= 0 || (f = v) > w) {
                    if (x >= 0 || w > v) {
                        return null;
                    }
                    f = v;
                }
                while (!mlc.q(o, s.d[f])) {
                    if (f == w) {
                        return null;
                    }
                    f += x;
                }
                return s.x(f);
            }
            return s.g(f, v + 5, o);
        }
        return null;
    }
    
    public final boolean h(final int n) {
        return (this.a & n) != 0x0;
    }
    
    public final boolean i(final int n) {
        return (this.b & n) != 0x0;
    }
    
    public final fgo k(final int n, final k3h k3h) {
        k3h.m(k3h.A - 1);
        k3h.y = this.x(n);
        final Object[] d = this.d;
        if (d.length == 2) {
            return null;
        }
        if (this.c == k3h.w) {
            this.d = yi2.O(n, d);
            return this;
        }
        return new fgo(0, 0, yi2.O(n, d), k3h.w);
    }
    
    public final fgo l(int f, Object l, final Object o, int v, final k3h k3h) {
        final int n = 1 << yi2.C(f, v);
        final boolean h = this.h(n);
        final eup c = this.c;
        if (h) {
            final int f2 = this.f(n);
            if (mlc.q(l, this.d[f2])) {
                k3h.y = this.x(f2);
                if (this.x(f2) != o) {
                    if (c == k3h.w) {
                        this.d[f2 + 1] = o;
                        return this;
                    }
                    ++k3h.z;
                    final Object[] d = this.d;
                    final Object[] copy = Arrays.copyOf(d, d.length);
                    copy[f2 + 1] = o;
                    return new fgo(this.a, this.b, copy, k3h.w);
                }
            }
            else {
                k3h.m(k3h.A + 1);
                final eup w = k3h.w;
                if (c == w) {
                    this.d = this.a(f2, n, f, l, o, v, w);
                    this.a ^= n;
                    this.b |= n;
                    return this;
                }
                return new fgo(this.a ^ n, this.b | n, this.a(f2, n, f, l, o, v, w), w);
            }
        }
        else if (this.i(n)) {
            final int t = this.t(n);
            final fgo s = this.s(t);
            if (v == 30) {
                final vgc o2 = ncq.O(2, ncq.T(0, s.d.length));
                v = o2.v;
                final int w2 = o2.w;
                final int x = o2.x;
                Label_0515: {
                    Label_0477: {
                        if (x <= 0 || (f = v) > w2) {
                            if (x >= 0 || w2 > v) {
                                break Label_0477;
                            }
                            f = v;
                        }
                        while (!mlc.q(l, s.d[f])) {
                            if (f == w2) {
                                break Label_0477;
                            }
                            f += x;
                        }
                        k3h.y = s.x(f);
                        if (s.c == k3h.w) {
                            s.d[f + 1] = o;
                            l = s;
                            break Label_0515;
                        }
                        ++k3h.z;
                        final Object[] d2 = s.d;
                        final Object[] copy2 = Arrays.copyOf(d2, d2.length);
                        copy2[f + 1] = o;
                        l = new fgo(0, 0, copy2, k3h.w);
                        break Label_0515;
                    }
                    k3h.m(k3h.A + 1);
                    l = new fgo(0, 0, yi2.D(s.d, 0, l, o), k3h.w);
                }
            }
            else {
                l = s.l(f, l, o, v + 5, k3h);
            }
            if (s != l) {
                return this.r(t, (fgo)l, k3h.w);
            }
        }
        else {
            k3h.m(k3h.A + 1);
            final eup w3 = k3h.w;
            f = this.f(n);
            final Object[] d3 = this.d;
            if (c == w3) {
                this.d = yi2.D(d3, f, l, o);
                this.a |= n;
                return this;
            }
            return new fgo(this.a | n, this.b, yi2.D(d3, f, l, o), w3);
        }
        return this;
    }
    
    public final fgo m(final fgo fgo, int n, final uc8 uc8, final k3h k3h) {
        if (this == fgo) {
            n = this.b();
            uc8.a += n;
            return this;
        }
        if (n > 30) {
            final eup w = k3h.w;
            final Object[] d = this.d;
            final Object[] copy = Arrays.copyOf(d, d.length + fgo.d.length);
            n = this.d.length;
            final vgc o = ncq.O(2, ncq.T(0, fgo.d.length));
            final int v = o.v;
            final int w2 = o.w;
            final int x = o.x;
            int n4 = 0;
        Label_0231:
            while (true) {
                Label_0118: {
                    if (x <= 0) {
                        break Label_0118;
                    }
                    int n2 = n;
                    int n3;
                    if ((n3 = v) > w2) {
                        break Label_0118;
                    }
                    while (true) {
                        if (!this.c(fgo.d[n3])) {
                            final Object[] d2 = fgo.d;
                            copy[n2] = d2[n3];
                            copy[n2 + 1] = d2[n3 + 1];
                            n = n2 + 2;
                        }
                        else {
                            ++uc8.a;
                            n = n2;
                        }
                        n4 = n;
                        if (n3 == w2) {
                            break Label_0231;
                        }
                        n3 += x;
                        n2 = n;
                    }
                }
                n4 = n;
                if (x < 0) {
                    n4 = n;
                    if (w2 <= v) {
                        final int n3 = v;
                        final int n2 = n;
                        continue;
                    }
                }
                break;
            }
            if (n4 != this.d.length) {
                if (n4 == fgo.d.length) {
                    return fgo;
                }
                if (n4 == copy.length) {
                    return new fgo(0, 0, copy, w);
                }
                return new fgo(0, 0, Arrays.copyOf(copy, n4), w);
            }
        }
        else {
            int n5 = this.b | fgo.b;
            final int a = this.a;
            final int a2 = fgo.a;
            int i = a & a2;
            int j = (a ^ a2) & ~n5;
            while (i != 0) {
                final int lowestOneBit = Integer.lowestOneBit(i);
                if (mlc.q(this.d[this.f(lowestOneBit)], fgo.d[fgo.f(lowestOneBit)])) {
                    j |= lowestOneBit;
                }
                else {
                    n5 |= lowestOneBit;
                }
                i ^= lowestOneBit;
            }
            if ((n5 & j) != 0x0) {
                pih.b("Check failed.");
            }
            fgo fgo2;
            if (mlc.q((Object)this.c, (Object)k3h.w) && this.a == j && this.b == n5) {
                fgo2 = this;
            }
            else {
                fgo2 = new fgo(j, n5, new Object[Integer.bitCount(n5) + Integer.bitCount(j) * 2], null);
            }
            int k = n5;
            int n6 = 0;
            while (k != 0) {
                final int lowestOneBit2 = Integer.lowestOneBit(k);
                final Object[] d3 = fgo2.d;
                final int length = d3.length;
                fgo fgo3;
                if (this.i(lowestOneBit2)) {
                    fgo3 = this.s(this.t(lowestOneBit2));
                    if (fgo.i(lowestOneBit2)) {
                        fgo3 = fgo3.m(fgo.s(fgo.t(lowestOneBit2)), n + 5, uc8, k3h);
                    }
                    else if (fgo.h(lowestOneBit2)) {
                        final int f = fgo.f(lowestOneBit2);
                        final Object o2 = fgo.d[f];
                        final Object x2 = fgo.x(f);
                        final int a3 = k3h.A;
                        int hashCode;
                        if (o2 != null) {
                            hashCode = o2.hashCode();
                        }
                        else {
                            hashCode = 0;
                        }
                        final fgo fgo4 = fgo3 = fgo3.l(hashCode, o2, x2, n + 5, k3h);
                        if (k3h.A == a3) {
                            ++uc8.a;
                            fgo3 = fgo4;
                        }
                    }
                }
                else if (fgo.i(lowestOneBit2)) {
                    fgo3 = fgo.s(fgo.t(lowestOneBit2));
                    if (this.h(lowestOneBit2)) {
                        final int f2 = this.f(lowestOneBit2);
                        final Object o3 = this.d[f2];
                        int hashCode2;
                        if (o3 != null) {
                            hashCode2 = o3.hashCode();
                        }
                        else {
                            hashCode2 = 0;
                        }
                        final int n7 = n + 5;
                        if (fgo3.d(hashCode2, n7, o3)) {
                            ++uc8.a;
                        }
                        else {
                            final Object x3 = this.x(f2);
                            int hashCode3;
                            if (o3 != null) {
                                hashCode3 = o3.hashCode();
                            }
                            else {
                                hashCode3 = 0;
                            }
                            fgo3 = fgo3.l(hashCode3, o3, x3, n7, k3h);
                        }
                    }
                }
                else {
                    final int f3 = this.f(lowestOneBit2);
                    final Object o4 = this.d[f3];
                    final Object x4 = this.x(f3);
                    final int f4 = fgo.f(lowestOneBit2);
                    final Object o5 = fgo.d[f4];
                    final Object x5 = fgo.x(f4);
                    int hashCode4;
                    if (o4 != null) {
                        hashCode4 = o4.hashCode();
                    }
                    else {
                        hashCode4 = 0;
                    }
                    int hashCode5;
                    if (o5 != null) {
                        hashCode5 = o5.hashCode();
                    }
                    else {
                        hashCode5 = 0;
                    }
                    fgo3 = j(hashCode4, o4, x4, hashCode5, o5, x5, n + 5, k3h.w);
                }
                d3[length - 1 - n6] = fgo3;
                ++n6;
                k ^= lowestOneBit2;
            }
            n = 0;
            while (j != 0) {
                final int lowestOneBit3 = Integer.lowestOneBit(j);
                final int n8 = n * 2;
                if (!fgo.h(lowestOneBit3)) {
                    final int f5 = this.f(lowestOneBit3);
                    final Object[] d4 = fgo2.d;
                    d4[n8] = this.d[f5];
                    d4[n8 + 1] = this.x(f5);
                }
                else {
                    final int f6 = fgo.f(lowestOneBit3);
                    final Object[] d5 = fgo2.d;
                    d5[n8] = fgo.d[f6];
                    d5[n8 + 1] = fgo.x(f6);
                    if (this.h(lowestOneBit3)) {
                        ++uc8.a;
                    }
                }
                ++n;
                j ^= lowestOneBit3;
            }
            if (!this.e(fgo2)) {
                if (fgo.e(fgo2)) {
                    return fgo;
                }
                return fgo2;
            }
        }
        return this;
    }
    
    public final fgo n(int f, final Object o, int v, final k3h k3h) {
        final int n = 1 << yi2.C(f, v);
        if (this.h(n)) {
            f = this.f(n);
            if (mlc.q(o, this.d[f])) {
                return this.p(f, n, k3h);
            }
        }
        else if (this.i(n)) {
            final int t = this.t(n);
            final fgo s = this.s(t);
            fgo fgo;
            if (v == 30) {
                final vgc o2 = ncq.O(2, ncq.T(0, s.d.length));
                v = o2.v;
                final int w = o2.w;
                final int x = o2.x;
                Label_0184: {
                    if (x <= 0 || (f = v) > w) {
                        if (x >= 0 || w > v) {
                            break Label_0184;
                        }
                        f = v;
                    }
                    while (!mlc.q(o, s.d[f])) {
                        if (f == w) {
                            break Label_0184;
                        }
                        f += x;
                    }
                    fgo = s.k(f, k3h);
                    return this.q(s, fgo, t, n, k3h.w);
                }
                fgo = s;
            }
            else {
                fgo = s.n(f, o, v + 5, k3h);
            }
            return this.q(s, fgo, t, n, k3h.w);
        }
        return this;
    }
    
    public final fgo o(int f, final Object o, final Object o2, int v, final k3h k3h) {
        final int n = 1 << yi2.C(f, v);
        fgo q;
        if (this.h(n)) {
            f = this.f(n);
            q = this;
            if (mlc.q(o, this.d[f])) {
                q = this;
                if (mlc.q(o2, this.x(f))) {
                    return this.p(f, n, k3h);
                }
            }
        }
        else {
            q = this;
            if (this.i(n)) {
                final int t = this.t(n);
                final fgo s = this.s(t);
                fgo fgo = null;
                Label_0225: {
                    if (v == 30) {
                        final vgc o3 = ncq.O(2, ncq.T(0, s.d.length));
                        v = o3.v;
                        final int w = o3.w;
                        final int x = o3.x;
                        Label_0222: {
                            if (x <= 0 || (f = v) > w) {
                                if (x >= 0 || w > v) {
                                    break Label_0222;
                                }
                                f = v;
                            }
                            while (!mlc.q(o, s.d[f]) || !mlc.q(o2, s.x(f))) {
                                if (f == w) {
                                    break Label_0222;
                                }
                                f += x;
                            }
                            fgo = s.k(f, k3h);
                            break Label_0225;
                        }
                        fgo = s;
                    }
                    else {
                        fgo = s.o(f, o, o2, v + 5, k3h);
                    }
                }
                q = this.q(s, fgo, t, n, k3h.w);
            }
        }
        return q;
    }
    
    public final fgo p(final int n, final int n2, final k3h k3h) {
        k3h.m(k3h.A - 1);
        k3h.y = this.x(n);
        final Object[] d = this.d;
        if (d.length == 2) {
            return null;
        }
        if (this.c == k3h.w) {
            this.d = yi2.O(n, d);
            this.a ^= n2;
            return this;
        }
        return new fgo(n2 ^ this.a, this.b, yi2.O(n, d), k3h.w);
    }
    
    public final fgo q(final fgo fgo, final fgo fgo2, final int n, final int n2, final eup eup) {
        final eup c = this.c;
        if (fgo2 == null) {
            final Object[] d = this.d;
            if (d.length == 1) {
                return null;
            }
            if (c == eup) {
                this.d = yi2.P(n, d);
                this.b ^= n2;
                return this;
            }
            return new fgo(this.a, this.b ^ n2, yi2.P(n, d), eup);
        }
        else {
            if (c != eup && fgo == fgo2) {
                return this;
            }
            return this.r(n, fgo2, eup);
        }
    }
    
    public final fgo r(final int n, final fgo fgo, final eup eup) {
        final Object[] d = this.d;
        if (d.length == 1 && fgo.d.length == 2 && fgo.b == 0) {
            fgo.a = this.b;
            return fgo;
        }
        if (this.c == eup) {
            d[n] = fgo;
            return this;
        }
        final Object[] copy = Arrays.copyOf(d, d.length);
        copy[n] = fgo;
        return new fgo(this.a, this.b, copy, eup);
    }
    
    public final fgo s(final int n) {
        final Object o = this.d[n];
        o.getClass();
        return (fgo)o;
    }
    
    public final int t(final int n) {
        return this.d.length - 1 - Integer.bitCount(this.b & n - 1);
    }
    
    public final ci6 u(int f, int v, Object o, Object u) {
        final int n = 1 << yi2.C(f, v);
        if (this.h(n)) {
            final int f2 = this.f(n);
            if (!mlc.q(o, this.d[f2])) {
                return new ci6(1, new fgo(this.a ^ n, this.b | n, this.a(f2, n, f, o, u, v, null), null));
            }
            if (this.x(f2) != u) {
                final Object[] d = this.d;
                final Object[] copy = Arrays.copyOf(d, d.length);
                copy[f2 + 1] = u;
                return new ci6(0, new fgo(this.a, this.b, copy, null));
            }
        }
        else {
            if (this.i(n)) {
                final int t = this.t(n);
                final fgo s = this.s(t);
                if (v == 30) {
                    final vgc o2 = ncq.O(2, ncq.T(0, s.d.length));
                    v = o2.v;
                    final int w = o2.w;
                    final int x = o2.x;
                    Label_0358: {
                        Label_0327: {
                            if (x <= 0 || (f = v) > w) {
                                if (x >= 0 || w > v) {
                                    break Label_0327;
                                }
                                f = v;
                            }
                            while (!mlc.q(o, s.d[f])) {
                                if (f == w) {
                                    break Label_0327;
                                }
                                f += x;
                            }
                            if (u == s.x(f)) {
                                o = null;
                                break Label_0358;
                            }
                            final Object[] d2 = s.d;
                            final Object[] copy2 = Arrays.copyOf(d2, d2.length);
                            copy2[f + 1] = u;
                            o = new ci6(0, new fgo(0, 0, copy2, null));
                            break Label_0358;
                        }
                        o = new ci6(1, new fgo(0, 0, yi2.D(s.d, 0, o, u), null));
                    }
                    u = o;
                    if (o == null) {
                        return null;
                    }
                }
                else if ((u = s.u(f, v + 5, o, u)) == null) {
                    return null;
                }
                ((ci6)u).b = this.w(t, n, (fgo)((ci6)u).b);
                return (ci6)u;
            }
            f = this.f(n);
            return new ci6(1, new fgo(this.a | n, this.b, yi2.D(this.d, f, o, u), null));
        }
        return null;
    }
    
    public final fgo v(int f, int v, Object v2) {
        final int n = 1 << yi2.C(f, v);
        if (this.h(n)) {
            f = this.f(n);
            final fgo w = this;
            if (!mlc.q(v2, this.d[f])) {
                return w;
            }
            final Object[] d = this.d;
            if (d.length != 2) {
                return new fgo(this.a ^ n, this.b, yi2.O(f, d), null);
            }
        }
        else {
            fgo w = this;
            if (!this.i(n)) {
                return w;
            }
            final int t = this.t(n);
            final fgo s = this.s(t);
            Label_0259: {
                if (v == 30) {
                    final vgc o = ncq.O(2, ncq.T(0, s.d.length));
                    v = o.v;
                    final int w2 = o.w;
                    final int x = o.x;
                    Label_0242: {
                        if (x <= 0 || (f = v) > w2) {
                            if (x >= 0 || w2 > v) {
                                break Label_0242;
                            }
                            f = v;
                        }
                        while (!mlc.q(v2, s.d[f])) {
                            if (f == w2) {
                                break Label_0242;
                            }
                            f += x;
                        }
                        final Object[] d2 = s.d;
                        if (d2.length == 2) {
                            v2 = null;
                            break Label_0259;
                        }
                        v2 = new fgo(0, 0, yi2.O(f, d2), null);
                        break Label_0259;
                    }
                    v2 = s;
                }
                else {
                    v2 = s.v(f, v + 5, v2);
                }
            }
            if (v2 == null) {
                final Object[] d3 = this.d;
                if (d3.length != 1) {
                    return new fgo(this.a, this.b ^ n, yi2.P(t, d3), null);
                }
            }
            else {
                w = this;
                if (s != v2) {
                    w = this.w(t, n, (fgo)v2);
                    return w;
                }
                return w;
            }
        }
        return null;
    }
    
    public final fgo w(final int n, final int n2, final fgo fgo) {
        final Object[] d = fgo.d;
        if (d.length != 2 || fgo.b != 0) {
            final Object[] d2 = this.d;
            final Object[] copy = Arrays.copyOf(d2, d2.length);
            copy[n] = fgo;
            return new fgo(this.a, this.b, copy, null);
        }
        if (this.d.length == 1) {
            fgo.a = this.b;
            return fgo;
        }
        final int f = this.f(n2);
        final Object[] d3 = this.d;
        final Object o = d[0];
        final Object o2 = d[1];
        final Object[] copy2 = Arrays.copyOf(d3, d3.length + 1);
        iw0.K0(n + 2, n + 1, d3.length, copy2, copy2);
        iw0.K0(f + 2, f, n, copy2, copy2);
        copy2[f] = o;
        copy2[f + 1] = o2;
        return new fgo(this.a ^ n2, this.b ^ n2, copy2, null);
    }
    
    public final Object x(final int n) {
        return this.d[n + 1];
    }
}
