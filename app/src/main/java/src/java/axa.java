import kotlinx.serialization.KSerializer;

public interface axa extends KSerializer
{
    KSerializer[] childSerializers();
    
    default KSerializer[] typeParametersSerializers() {
        return xp7.j;
    }
}
