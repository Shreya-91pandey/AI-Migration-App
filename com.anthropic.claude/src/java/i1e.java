public final class i1e implements s5f
{
    public s5f[] a;
    
    @Override
    public final cqi a(final Class clazz) {
        for (final s5f s5f : this.a) {
            if (s5f.b(clazz)) {
                return s5f.a(clazz);
            }
        }
        oyl.s("No factory is available for message type: ".concat(clazz.getName()));
        return null;
    }
    
    @Override
    public final boolean b(final Class clazz) {
        final s5f[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
