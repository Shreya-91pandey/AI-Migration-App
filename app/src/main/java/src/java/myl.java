import java.util.Arrays;
import java.util.Map;

public class myl
{
    public int[] v;
    public Object[] w;
    public int x;
    
    public myl(final int n) {
        int[] c;
        if (n == 0) {
            c = o50.c;
        }
        else {
            c = new int[n];
        }
        this.v = c;
        Object[] e;
        if (n == 0) {
            e = o50.e;
        }
        else {
            e = new Object[n << 1];
        }
        this.w = e;
    }
    
    public final int a(final Object o) {
        final int n = this.x * 2;
        final Object[] w = this.w;
        if (o == null) {
            for (int i = 1; i < n; i += 2) {
                if (w[i] == null) {
                    return i >> 1;
                }
            }
        }
        else {
            for (int j = 1; j < n; j += 2) {
                if (o.equals(w[j])) {
                    return j >> 1;
                }
            }
        }
        return -1;
    }
    
    public final int c(final int n, final Object o) {
        final int x = this.x;
        if (x == 0) {
            return -1;
        }
        int o2 = o50.o(x, n, this.v);
        if (o2 >= 0) {
            if (!mlc.q(o, this.w[o2 << 1])) {
                int n2;
                for (n2 = o2 + 1; n2 < x && this.v[n2] == n; ++n2) {
                    if (mlc.q(o, this.w[n2 << 1])) {
                        return n2;
                    }
                }
                --o2;
                while (o2 >= 0 && this.v[o2] == n) {
                    if (mlc.q(o, this.w[o2 << 1])) {
                        return o2;
                    }
                    --o2;
                }
                return ~n2;
            }
        }
        return o2;
    }
    
    public final void clear() {
        int x;
        if ((x = this.x) > 0) {
            this.v = o50.c;
            this.w = o50.e;
            x = 0;
            this.x = 0;
        }
        if (x <= 0) {
            return;
        }
        en9.c();
    }
    
    public boolean containsKey(final Object o) {
        return this.d(o) >= 0;
    }
    
    public boolean containsValue(final Object o) {
        return this.a(o) >= 0;
    }
    
    public final int d(final Object o) {
        if (o == null) {
            return this.f();
        }
        return this.c(o.hashCode(), o);
    }
    
    @Override
    public final boolean equals(Object n) {
        if (this == n) {
            return true;
        }
        try {
            if (n instanceof myl) {
                final int x = this.x;
                if (x != ((myl)n).x) {
                    return false;
                }
                final myl myl = (myl)n;
                for (int i = 0; i < x; ++i) {
                    final Object g = this.g(i);
                    n = this.n(i);
                    final Object value = myl.get(g);
                    if (n == null) {
                        if (value != null || !myl.containsKey(g)) {
                            return false;
                        }
                    }
                    else if (!n.equals(value)) {
                        return false;
                    }
                }
                return true;
            }
            else {
                if (!(n instanceof Map)) {
                    return false;
                }
                if (this.x != ((Map)n).size()) {
                    return false;
                }
                for (int x2 = this.x, j = 0; j < x2; ++j) {
                    final Object g2 = this.g(j);
                    final Object n2 = this.n(j);
                    final Object value2 = ((Map)n).get(g2);
                    if (n2 == null) {
                        if (value2 != null || !((Map)n).containsKey(g2)) {
                            return false;
                        }
                    }
                    else if (!n2.equals(value2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public final int f() {
        final int x = this.x;
        if (x == 0) {
            return -1;
        }
        final int o = o50.o(x, 0, this.v);
        if (o >= 0) {
            if (this.w[o << 1] != null) {
                int n;
                for (n = o + 1; n < x && this.v[n] == 0; ++n) {
                    if (this.w[n << 1] == null) {
                        return n;
                    }
                }
                for (int n2 = o - 1; n2 >= 0 && this.v[n2] == 0; --n2) {
                    if (this.w[n2 << 1] == null) {
                        return n2;
                    }
                }
                return ~n;
            }
        }
        return o;
    }
    
    public final Object g(final int n) {
        if (n >= 0 && n < this.x) {
            return this.w[n << 1];
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        qiq.r(sb.toString());
        throw null;
    }
    
    public Object get(final Object o) {
        final int d = this.d(o);
        if (d >= 0) {
            return this.w[(d << 1) + 1];
        }
        return null;
    }
    
    public final Object getOrDefault(final Object o, final Object o2) {
        final int d = this.d(o);
        if (d >= 0) {
            return this.w[(d << 1) + 1];
        }
        return o2;
    }
    
    @Override
    public final int hashCode() {
        final int[] v = this.v;
        final Object[] w = this.w;
        final int x = this.x;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < x) {
            final Object o = w[n];
            final int n3 = v[i];
            int hashCode;
            if (o != null) {
                hashCode = o.hashCode();
            }
            else {
                hashCode = 0;
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    public final boolean isEmpty() {
        return this.x <= 0;
    }
    
    public final Object j(int n) {
        if (n >= 0) {
            final int x = this.x;
            if (n < x) {
                final Object[] w = this.w;
                final int n2 = n << 1;
                final Object o = w[n2 + 1];
                if (x <= 1) {
                    this.clear();
                    return o;
                }
                final int x2 = x - 1;
                final int[] v = this.v;
                final int length = v.length;
                int n3 = 8;
                if (length > 8 && x < v.length / 3) {
                    if (x > 8) {
                        n3 = x + (x >> 1);
                    }
                    this.v = Arrays.copyOf(v, n3);
                    this.w = Arrays.copyOf(this.w, n3 << 1);
                    if (x != this.x) {
                        en9.c();
                        return null;
                    }
                    if (n > 0) {
                        iw0.J0(0, 0, n, v, this.v);
                        iw0.K0(0, 0, n2, w, this.w);
                    }
                    if (n < x2) {
                        final int[] v2 = this.v;
                        final int n4 = n + 1;
                        iw0.J0(n, n4, x, v, v2);
                        iw0.K0(n2, n4 << 1, x << 1, w, this.w);
                    }
                }
                else {
                    if (n < x2) {
                        final int n5 = n + 1;
                        iw0.J0(n, n5, x, v, v);
                        final Object[] w2 = this.w;
                        iw0.K0(n2, n5 << 1, x << 1, w2, w2);
                    }
                    final Object[] w3 = this.w;
                    n = x2 << 1;
                    w3[n + 1] = (w3[n] = null);
                }
                if (x == this.x) {
                    this.x = x2;
                    return o;
                }
                en9.c();
                return null;
            }
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        qiq.r(sb.toString());
        throw null;
    }
    
    public final Object m(int n, final Object o) {
        if (n >= 0 && n < this.x) {
            n = (n << 1) + 1;
            final Object[] w = this.w;
            final Object o2 = w[n];
            w[n] = o;
            return o2;
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        qiq.r(sb.toString());
        throw null;
    }
    
    public final Object n(final int n) {
        if (n >= 0 && n < this.x) {
            return this.w[(n << 1) + 1];
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        qiq.r(sb.toString());
        throw null;
    }
    
    public final Object put(Object o, final Object o2) {
        final int x = this.x;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        int n;
        if (o != null) {
            n = this.c(hashCode, o);
        }
        else {
            n = this.f();
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] w = this.w;
            o = w[n2];
            w[n2] = o2;
            return o;
        }
        final int n3 = ~n;
        final int[] v = this.v;
        if (x >= v.length) {
            int n4 = 8;
            if (x >= 8) {
                n4 = (x >> 1) + x;
            }
            else if (x < 4) {
                n4 = 4;
            }
            this.v = Arrays.copyOf(v, n4);
            this.w = Arrays.copyOf(this.w, n4 << 1);
            if (x != this.x) {
                en9.c();
                return null;
            }
        }
        if (n3 < x) {
            final int[] v2 = this.v;
            final int n5 = n3 + 1;
            iw0.J0(n5, n3, x, v2, v2);
            final Object[] w2 = this.w;
            iw0.K0(n5 << 1, n3 << 1, this.x << 1, w2, w2);
        }
        final int x2 = this.x;
        if (x == x2) {
            final int[] v3 = this.v;
            if (n3 < v3.length) {
                v3[n3] = hashCode;
                final Object[] w3 = this.w;
                final int n6 = n3 << 1;
                w3[n6] = o;
                w3[n6 + 1] = o2;
                this.x = x2 + 1;
                return null;
            }
        }
        en9.c();
        return null;
    }
    
    public final Object putIfAbsent(final Object o, final Object o2) {
        final Object value = this.get(o);
        if (value == null) {
            return this.put(o, o2);
        }
        return value;
    }
    
    public Object remove(final Object o) {
        final int d = this.d(o);
        if (d >= 0) {
            return this.j(d);
        }
        return null;
    }
    
    public final boolean remove(final Object o, final Object o2) {
        final int d = this.d(o);
        if (d >= 0 && mlc.q(o2, this.n(d))) {
            this.j(d);
            return true;
        }
        return false;
    }
    
    public final Object replace(final Object o, final Object o2) {
        final int d = this.d(o);
        if (d >= 0) {
            return this.m(d, o2);
        }
        return null;
    }
    
    public final boolean replace(final Object o, final Object o2, final Object o3) {
        final int d = this.d(o);
        if (d >= 0 && mlc.q(o2, this.n(d))) {
            this.m(d, o3);
            return true;
        }
        return false;
    }
    
    public final int size() {
        return this.x;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.x * 28);
        sb.append('{');
        for (int x = this.x, i = 0; i < x; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object g = this.g(i);
            if (g != sb) {
                sb.append(g);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final Object n = this.n(i);
            if (n != sb) {
                sb.append(n);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
