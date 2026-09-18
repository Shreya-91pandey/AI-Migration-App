import com.anthropic.claude.api.result.ApiResult;
import java.lang.reflect.ParameterizedType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class sj0 extends d03
{
    public final fu4 a;
    public final zta b;
    
    public sj0(final fu4 a, final zta b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final e03 a(Type type, final Annotation[] array) {
        if (mlc.q((Object)ri2.S(type), (Object)sej.class)) {
            return (e03)hzn.J;
        }
        if (mlc.q((Object)ri2.S(type), (Object)c03.class)) {
            if (!(type instanceof ParameterizedType)) {
                en9.q("Call must have generic type (e.g., Call<ApiResult<...>>)");
                return null;
            }
            type = ri2.R(0, (ParameterizedType)type);
            if (mlc.q((Object)ri2.S(type), (Object)ApiResult.class)) {
                if (type instanceof ParameterizedType) {
                    type = ri2.R(0, (ParameterizedType)type);
                    type.getClass();
                    return (e03)new zn0((Object)type, (Object)this.a, (Object)this.b);
                }
                en9.q("ApiResult must have generic type (e.g., Call<ApiResult<MyResponse>>).");
                return null;
            }
        }
        return null;
    }
}
