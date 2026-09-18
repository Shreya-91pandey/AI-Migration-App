import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class mg0 implements Appendable
{
    public final StringBuilder v;
    public final ArrayList w;
    public final ArrayList x;
    
    public mg0(final int n) {
        this.v = new StringBuilder(n);
        this.w = new ArrayList();
        this.x = new ArrayList();
        new ArrayList();
    }
    
    public mg0(final og0 og0) {
        this();
        this.e(og0);
    }
    
    public final void a(final udd udd, final int n, final int n2) {
        this.x.add((Object)new lg0(n, n2, 8, udd, null));
    }
    
    public final Appendable append(final char c) {
        this.v.append(c);
        return (Appendable)this;
    }
    
    public final void b(final hcm hcm, final int n, final int n2) {
        this.x.add((Object)new lg0(n, n2, 8, hcm, null));
    }
    
    public final void c(final char c) {
        this.v.append(c);
    }
    
    public final void d(final int n, final int n2, final CharSequence charSequence) {
        if (charSequence instanceof og0) {
            this.f((og0)charSequence, n, n2);
            return;
        }
        this.v.append(charSequence, n, n2);
    }
    
    public final void e(final og0 og0) {
        final StringBuilder v = this.v;
        final int length = v.length();
        v.append(og0.w);
        final List v2 = og0.v;
        if (v2 != null) {
            for (int size = ((Collection)v2).size(), i = 0; i < size; ++i) {
                final ng0 ng0 = (ng0)v2.get(i);
                this.x.add((Object)new lg0(ng0.b + length, ng0.c + length, ng0.a, ng0.d));
            }
        }
    }
    
    public final void f(final og0 og0, int i, int size) {
        final StringBuilder v = this.v;
        final int length = v.length();
        v.append((CharSequence)og0.w, i, size);
        final List b = pg0.b(og0, i, size, null);
        if (b != null) {
            ng0 ng0;
            for (size = ((Collection)b).size(), i = 0; i < size; ++i) {
                ng0 = (ng0)b.get(i);
                this.x.add((Object)new lg0(ng0.b + length, ng0.c + length, ng0.a, ng0.d));
            }
        }
    }
    
    public final void g(final CharSequence charSequence) {
        if (charSequence instanceof og0) {
            this.e((og0)charSequence);
            return;
        }
        this.v.append(charSequence);
    }
    
    public final void h(final String s) {
        this.v.append(s);
    }
    
    public final void i() {
        final ArrayList w = this.w;
        if (w.isEmpty()) {
            hac.c("Nothing to pop.");
        }
        ((lg0)w.remove(w.size() - 1)).c = this.v.length();
    }
    
    public final void j(final int n) {
        final ArrayList w = this.w;
        if (n >= w.size()) {
            final int size = w.size();
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append(" should be less than ");
            sb.append(size);
            hac.c(sb.toString());
        }
        while (w.size() - 1 >= n) {
            this.i();
        }
    }
    
    public final int k(final vdd vdd) {
        final lg0 lg0 = new lg0(this.v.length(), 0, 12, vdd, null);
        final ArrayList w = this.w;
        w.add((Object)lg0);
        this.x.add((Object)lg0);
        return w.size() - 1;
    }
    
    public final int l(final String s, final String s2) {
        final lg0 lg0 = new lg0(this.v.length(), 0, 4, sxm.a(s2), s);
        final ArrayList w = this.w;
        w.add((Object)lg0);
        this.x.add((Object)lg0);
        return w.size() - 1;
    }
    
    public final int m(final hcm hcm) {
        final lg0 lg0 = new lg0(this.v.length(), 0, 12, hcm, null);
        final ArrayList w = this.w;
        w.add((Object)lg0);
        this.x.add((Object)lg0);
        return w.size() - 1;
    }
    
    public final og0 n() {
        final StringBuilder v = this.v;
        final String string = v.toString();
        final ArrayList x = this.x;
        final ArrayList list = new ArrayList(x.size());
        for (int size = ((Collection)x).size(), i = 0; i < size; ++i) {
            list.add((Object)((lg0)x.get(i)).a(v.length()));
        }
        return new og0(string, (List)list);
    }
}
