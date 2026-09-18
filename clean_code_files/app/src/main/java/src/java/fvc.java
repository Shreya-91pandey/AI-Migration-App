public final class fvc
{
    public final z9m a;
    public gvc b;
    public mma c;
    
    public fvc(final z9m a) {
        this.a = a;
    }
    
    public final gvc a() {
        final gvc b = this.b;
        if (b != null) {
            return b;
        }
        mlc.j0("keyboardActions");
        throw null;
    }
    
    public final boolean b(final int n) {
        lta lta;
        if (n == 7) {
            lta = this.a().a;
        }
        else if (n == 2) {
            lta = this.a().b;
        }
        else if (n == 6) {
            lta = this.a().c;
        }
        else if (n == 5) {
            lta = this.a().d;
        }
        else if (n == 3) {
            lta = this.a().e;
        }
        else if (n == 4) {
            lta = this.a().f;
        }
        else {
            if (n != 1) {
                if (n != 0) {
                    en9.q("invalid ImeAction");
                    return false;
                }
            }
            lta = null;
        }
        if (lta != null) {
            lta.b((Object)this);
            return true;
        }
        if (n == 6) {
            final mma c = this.c;
            if (c != null) {
                c.a(1);
                return true;
            }
            mlc.j0("focusManager");
            throw null;
        }
        else {
            if (n != 5) {
                if (n == 7) {
                    final z9m a = this.a;
                    if (a != null) {
                        ((ga8)a).a();
                        return true;
                    }
                }
                return false;
            }
            final mma c2 = this.c;
            if (c2 != null) {
                c2.a(2);
                return true;
            }
            mlc.j0("focusManager");
            throw null;
        }
    }
}
