import java.util.ListIterator;

public final class xgd implements ListIterator, stc
{
    public final byte v;
    public int w;
    public int x;
    public int y;
    public final Object z;
    
    public xgd(final v8m z, final int n) {
        this.v = 1;
        this.z = z;
        this.w = n - 1;
        this.x = -1;
        this.y = r6k.y(z);
    }
    
    public xgd(final ygd z, final int w) {
        this.v = 0;
        this.z = z;
        this.w = w;
        this.x = -1;
        this.y = ygd.j(z);
    }
    
    public void a() {
        if (ygd.j((ygd)this.z) == this.y) {
            return;
        }
        en9.c();
    }
    
    public final void add(final Object o) {
        final byte v = this.v;
        final Object z = this.z;
        switch (v) {
            default: {
                this.c();
                final v8m v8m = (v8m)z;
                v8m.add(this.w + 1, o);
                this.x = -1;
                ++this.w;
                this.y = r6k.y(v8m);
                return;
            }
            case 0: {
                this.a();
                final ygd ygd = (ygd)z;
                ygd.add(this.w++, o);
                this.x = -1;
                this.y = ygd.j(ygd);
            }
        }
    }
    
    public void c() {
        if (r6k.y((v8m)this.z) == this.y) {
            return;
        }
        en9.c();
    }
    
    public final boolean hasNext() {
        final byte v = this.v;
        boolean b = false;
        final boolean b2 = false;
        final Object z = this.z;
        switch (v) {
            default: {
                boolean b3 = b2;
                if (this.w < ((v8m)z).size() - 1) {
                    b3 = true;
                }
                return b3;
            }
            case 0: {
                if (this.w < ((ygd)z).w) {
                    b = true;
                }
                return b;
            }
        }
    }
    
    public final boolean hasPrevious() {
        switch (this.v) {
            default: {
                return this.w >= 0;
            }
            case 0: {
                return this.w > 0;
            }
        }
    }
    
    public final Object next() {
        final byte v = this.v;
        final Object z = this.z;
        switch (v) {
            default: {
                this.c();
                final int n = this.w + 1;
                this.x = n;
                final v8m v8m = (v8m)z;
                r6k.g0(n, v8m.size());
                final Object value = v8m.get(n);
                this.w = n;
                return value;
            }
            case 0: {
                this.a();
                final int w = this.w;
                final ygd ygd = (ygd)z;
                Object o;
                if (w < ygd.w) {
                    this.w = w + 1;
                    this.x = w;
                    o = ygd.v[w];
                }
                else {
                    oyl.r();
                    o = null;
                }
                return o;
            }
        }
    }
    
    public final int nextIndex() {
        switch (this.v) {
            default: {
                return this.w + 1;
            }
            case 0: {
                return this.w;
            }
        }
    }
    
    public final Object previous() {
        final byte v = this.v;
        final Object z = this.z;
        switch (v) {
            default: {
                this.c();
                final int w = this.w;
                final v8m v8m = (v8m)z;
                r6k.g0(w, v8m.size());
                final int w2 = this.w;
                this.x = w2;
                final Object value = v8m.get(w2);
                --this.w;
                return value;
            }
            case 0: {
                this.a();
                int w3 = this.w;
                Object o;
                if (w3 > 0) {
                    --w3;
                    this.w = w3;
                    this.x = w3;
                    o = ((ygd)z).v[w3];
                }
                else {
                    oyl.r();
                    o = null;
                }
                return o;
            }
        }
    }
    
    public final int previousIndex() {
        switch (this.v) {
            default: {
                return this.w;
            }
            case 0: {
                return this.w - 1;
            }
        }
    }
    
    public final void remove() {
        final byte v = this.v;
        final Object z = this.z;
        switch (v) {
            default: {
                this.c();
                final v8m v8m = (v8m)z;
                v8m.remove(this.x);
                --this.w;
                this.x = -1;
                this.y = r6k.y(v8m);
                return;
            }
            case 0: {
                final ygd ygd = (ygd)z;
                this.a();
                final int x = this.x;
                if (x != -1) {
                    ygd.d(x);
                    this.w = this.x;
                    this.x = -1;
                    this.y = ygd.j(ygd);
                }
                else {
                    en9.q("Call next() or previous() before removing element from the iterator.");
                }
            }
        }
    }
    
    public final void set(final Object o) {
        final byte v = this.v;
        final Object z = this.z;
        switch (v) {
            default: {
                final v8m v8m = (v8m)z;
                this.c();
                final int x = this.x;
                if (x >= 0) {
                    v8m.set(x, o);
                    this.y = r6k.y(v8m);
                }
                else {
                    en9.q("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                return;
            }
            case 0: {
                this.a();
                final int x2 = this.x;
                if (x2 != -1) {
                    ((ygd)z).set(x2, o);
                }
                else {
                    en9.q("Call next() or previous() before replacing element from the iterator.");
                }
            }
        }
    }
}
