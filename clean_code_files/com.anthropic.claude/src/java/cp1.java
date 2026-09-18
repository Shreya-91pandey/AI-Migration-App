import java.lang.reflect.Modifier;
import java.io.Writer;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.ArrayList;

public final class cp1 implements sra
{
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final vra q;
    public boolean r;
    public int s;
    
    public cp1(final vra q) {
        q.G();
        final jra w = q.w;
        if (w != null) {
            w.y.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = q;
    }
    
    @Override
    public final boolean a(final ArrayList list, final ArrayList list2) {
        if (vra.I(2)) {
            this.toString();
        }
        list.add((Object)this);
        list2.add((Object)Boolean.FALSE);
        if (this.g) {
            this.q.d.add((Object)this);
        }
        return true;
    }
    
    public final void b(final dsa dsa) {
        this.a.add((Object)dsa);
        dsa.d = this.b;
        dsa.e = this.c;
        dsa.f = this.d;
        dsa.g = this.e;
    }
    
    public final void c(final int n) {
        if (this.g) {
            if (vra.I(2)) {
                this.toString();
            }
            final ArrayList a = this.a;
            for (int size = a.size(), i = 0; i < size; ++i) {
                final dsa dsa = (dsa)a.get(i);
                final hra b = dsa.b;
                if (b != null) {
                    b.N += n;
                    if (vra.I(2)) {
                        Objects.toString((Object)dsa.b);
                        final int n2 = dsa.b.N;
                    }
                }
            }
        }
    }
    
    public final void d() {
        final ArrayList a = this.a;
        int n;
        for (int i = a.size() - 1; i >= 0; i = n - 1) {
            final dsa dsa = (dsa)a.get(i);
            if (!dsa.c) {
                n = i;
            }
            else if (dsa.a == 8) {
                dsa.c = false;
                a.remove(i - 1);
                n = i - 1;
            }
            else {
                final int t = dsa.b.T;
                dsa.a = 2;
                dsa.c = false;
                int n2 = i - 1;
                while (true) {
                    n = i;
                    if (n2 < 0) {
                        break;
                    }
                    final dsa dsa2 = (dsa)a.get(n2);
                    int n3 = i;
                    if (dsa2.c) {
                        n3 = i;
                        if (dsa2.b.T == t) {
                            a.remove(n2);
                            n3 = i - 1;
                        }
                    }
                    --n2;
                    i = n3;
                }
            }
        }
    }
    
    public final int e(final boolean b, final boolean b2) {
        if (!this.r) {
            if (vra.I(2)) {
                this.toString();
                final PrintWriter printWriter = new PrintWriter((Writer)new sqd());
                this.g("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            final boolean g = this.g;
            final vra q = this.q;
            if (g) {
                this.s = q.k.getAndIncrement();
            }
            else {
                this.s = -1;
            }
            if (b2) {
                q.y(this, b);
            }
            return this.s;
        }
        en9.q("commit already called");
        return 0;
    }
    
    public final void f(final int n, final hra hra, String canonicalName) {
        final String g0 = hra.g0;
        if (g0 != null) {
            csa.c(hra, g0);
        }
        final Class<? extends hra> class1 = hra.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (canonicalName != null) {
                final String u = hra.U;
                if (u != null && !canonicalName.equals((Object)u)) {
                    final StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append((Object)hra);
                    sb.append(": was ");
                    en9.q(lmf.u(sb, hra.U, " now ", canonicalName));
                    return;
                }
                hra.U = canonicalName;
            }
            if (n != 0) {
                if (n == -1) {
                    final StringBuilder sb2 = new StringBuilder("Can't add fragment ");
                    sb2.append((Object)hra);
                    sb2.append(" with tag ");
                    sb2.append(canonicalName);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int s = hra.S;
                if (s != 0 && s != n) {
                    final StringBuilder sb3 = new StringBuilder("Can't change container ID of fragment ");
                    sb3.append((Object)hra);
                    final int s2 = hra.S;
                    sb3.append(": was ");
                    sb3.append(s2);
                    sb3.append(" now ");
                    sb3.append(n);
                    throw new IllegalStateException(sb3.toString());
                }
                hra.S = n;
                hra.T = n;
            }
            this.b(new dsa(1, hra));
            hra.O = this.q;
            return;
        }
        canonicalName = class1.getCanonicalName();
        final StringBuilder sb4 = new StringBuilder("Fragment ");
        sb4.append(canonicalName);
        sb4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(sb4.toString());
    }
    
    public final void g(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println((Object)this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println((Object)this.l);
            }
        }
        final ArrayList a = this.a;
        if (!a.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = a.size(), i = 0; i < size; ++i) {
                final dsa dsa = (dsa)a.get(i);
                String string = null;
                switch (dsa.a) {
                    default: {
                        final StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(dsa.a);
                        string = sb.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println((Object)dsa.b);
                if (b) {
                    if (dsa.d != 0 || dsa.e != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(dsa.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(dsa.e));
                    }
                    if (dsa.f != 0 || dsa.g != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(dsa.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(dsa.g));
                    }
                }
            }
        }
    }
    
    public final void h(final hra hra) {
        final vra o = hra.O;
        if (o != null && o != this.q) {
            final StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(hra.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        this.b(new dsa(3, hra));
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
