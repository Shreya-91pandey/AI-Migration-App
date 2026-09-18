public final class lo1
{
    public final c2l a;
    public final d8g b;
    
    public lo1(final c2l a, final d8g b) {
        this.a = a;
        this.b = b;
        Object o = a;
        if (a == null) {
            o = b;
        }
        if (o != null) {
            return;
        }
        en9.s("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
    
    public final void a(final ko1 ko1) {
        final c2l a = this.a;
        if (a != null) {
            c2l.f(a, (drf)ko1.b);
            return;
        }
        final d8g b = this.b;
        if (b != null) {
            final jo1 jo1 = (jo1)ko1.a;
            final y7g y7g = new y7g(jo1, new a8g(null, jo1));
            jo1.a.add((Object)y7g);
            c2l.f(b.b().c, y7g);
            return;
        }
        en9.q("Unreachable");
    }
    
    public final void b(final ko1 ko1) {
        if (this.a != null) {
            ((io1)ko1.b).e();
            return;
        }
        if (this.b != null) {
            ((jo1)ko1.a).e();
            return;
        }
        en9.q("Unreachable");
    }
}
