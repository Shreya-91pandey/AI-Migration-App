import java.util.LinkedHashMap;

public final class dpm
{
    public final String a;
    public final String b;
    
    static {
        new LinkedHashMap();
    }
    
    public dpm(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!dpm.class.equals(class1)) {
            return false;
        }
        o.getClass();
        final dpm dpm = (dpm)o;
        return mlc.q((Object)this.a, (Object)dpm.a) && mlc.q((Object)this.b, (Object)dpm.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(": ");
        sb.append(this.b);
        return sb.toString();
    }
}
