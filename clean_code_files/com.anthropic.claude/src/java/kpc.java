import java.io.Serializable;

public enum kpc
{
    A("DOUBLE", 4, (Class)Double.class, (Serializable)0.0), 
    B("BOOLEAN", 5, (Class)Boolean.class, (Serializable)Boolean.FALSE), 
    C("STRING", 6, (Class)String.class, (Serializable)""), 
    D("BYTE_STRING", 7, (Class)fs2.class, (Serializable)fs2.x), 
    E("ENUM", 8, (Class)Integer.class, (Serializable)null), 
    F("MESSAGE", 9, (Class)Object.class, (Serializable)null);
    
    public static final kpc[] G;
    
    w("VOID", 0, (Class)Void.class, (Serializable)null), 
    x("INT", 1, (Class)Integer.class, (Serializable)0), 
    y("LONG", 2, (Class)Long.class, (Serializable)0L), 
    z("FLOAT", 3, (Class)Float.class, (Serializable)0.0f);
    
    public final Class v;
    
    public kpc(final String s, final int n, final Class v, final Serializable s2) {
        this.v = v;
    }
}
