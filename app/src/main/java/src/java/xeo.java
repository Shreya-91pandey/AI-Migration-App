public interface xeo
{
    Object d();
    
    default boolean e(final Object o, final Object o2) {
        return o.equals(this.d()) && o2.equals(this.h());
    }
    
    Object h();
}
