import kotlinx.serialization.KSerializer;

public final class uw2
{
    public final <T> KSerializer serializer(final KSerializer kSerializer) {
        return (KSerializer)new tw2(kSerializer);
    }
}
