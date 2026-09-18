import androidx.datastore.preferences.protobuf.f;

public final class owa implements s5f
{
    public static final owa b;
    public final byte a;
    
    static {
        b = new owa((byte)0);
    }
    
    @Override
    public final cqi a(Class cls) {
        switch (this.a) {
            default: {
                throw new IllegalStateException("This should never be called.");
            }
            case 0: {
                final boolean assignable = f.class.isAssignableFrom((Class<?>)cls);
                final cqi cqi = null;
                if (assignable) {
                    try {
                        cls = (cqi)f.c((Class)((Class)cls).asSubclass(f.class)).b(3);
                    }
                    catch (final Exception ex) {
                        fvd.v("Unable to get message info for ".concat(((Class)cls).getName()), (Throwable)ex);
                        cls = cqi;
                    }
                }
                else {
                    en9.s("Unsupported message type: ".concat(((Class)cls).getName()));
                    cls = cqi;
                }
                return cls;
            }
        }
    }
    
    @Override
    public final boolean b(final Class cls) {
        switch (this.a) {
            default: {
                return false;
            }
            case 0: {
                return f.class.isAssignableFrom(cls);
            }
        }
    }
}
