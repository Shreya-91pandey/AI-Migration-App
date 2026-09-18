import java.util.Locale;

public final class hpd
{
    public final Locale a;
    
    public hpd(final Locale a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof hpd && (this == o || mlc.q((Object)this.a.toLanguageTag(), (Object)((hpd)o).a.toLanguageTag()));
    }
    
    @Override
    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toLanguageTag();
    }
}
