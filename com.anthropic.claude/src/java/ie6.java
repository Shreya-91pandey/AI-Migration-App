import java.util.Set;

public interface ie6
{
    default Object d(final Class clazz) {
        return this.w(bmi.a(clazz));
    }
    
    default Set g(final bmi bmi) {
        return (Set)this.r(bmi).get();
    }
    
    default hfi i(final Class clazz) {
        return this.v(bmi.a(clazz));
    }
    
    hfi r(final bmi p0);
    
    hfi v(final bmi p0);
    
    default Object w(final bmi bmi) {
        final hfi v = this.v(bmi);
        if (v == null) {
            return null;
        }
        return v.get();
    }
}
