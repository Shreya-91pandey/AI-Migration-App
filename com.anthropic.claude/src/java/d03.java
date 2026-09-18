import java.lang.reflect.ParameterizedType;
import java.util.concurrent.CompletableFuture;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public abstract class d03
{
    public e03 a(Type r, final Annotation[] array) {
        if (ri2.S(r) != CompletableFuture.class) {
            return null;
        }
        if (!(r instanceof ParameterizedType)) {
            en9.q("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        r = ri2.R(0, (ParameterizedType)r);
        if (ri2.S(r) != rnj.class) {
            return (e03)new cvj((Object)r, (byte)16);
        }
        if (r instanceof ParameterizedType) {
            return (e03)new bgq((Object)ri2.R(0, (ParameterizedType)r));
        }
        en9.q("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
