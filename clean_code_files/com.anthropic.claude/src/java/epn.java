import kotlinx.serialization.KSerializer;

public final class epn
{
    public final <ID> KSerializer serializer(final KSerializer kSerializer) {
        return (KSerializer)new dpn(kSerializer);
    }
}
