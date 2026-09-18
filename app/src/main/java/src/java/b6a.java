import kotlinx.serialization.json.JsonElement;

public final class b6a
{
    public final JsonElement a;
    public final String b;
    public final Integer c;
    
    public b6a(final JsonElement a, final String b, final Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b6a)) {
            return false;
        }
        final b6a b6a = (b6a)o;
        return mlc.q((Object)this.a, (Object)b6a.a) && mlc.q((Object)this.b, (Object)b6a.b) && mlc.q((Object)this.c, (Object)b6a.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FeatureExposureState(value=");
        sb.append((Object)this.a);
        sb.append(", experimentKey=");
        sb.append(this.b);
        sb.append(", variationId=");
        return ju4.c(sb, this.c, ")");
    }
}
