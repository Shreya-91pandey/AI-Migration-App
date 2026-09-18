import java.util.LinkedHashMap;
import java.util.Map;

public final class elf extends im7
{
    public elf(final im7 im7) {
        final LinkedHashMap a = im7.a;
        ((Map)super.a).putAll((Map)a);
    }
    
    public final void a(final hm7 hm7, final Object o) {
        ((Map)super.a).put((Object)hm7, o);
    }
}
