import java.util.Collections;
import java.util.Map;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.c;
import java.io.FileInputStream;
import androidx.datastore.preferences.protobuf.f;

public final class rjh extends f
{
    private static final rjh DEFAULT_INSTANCE;
    private static volatile gug PARSER;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private u3e preferences_;
    
    static {
        f.j((Class)rjh.class, (f)(DEFAULT_INSTANCE = new rjh()));
    }
    
    public rjh() {
        this.preferences_ = u3e.w;
    }
    
    public static pjh o() {
        return (pjh)rjh.DEFAULT_INSTANCE.b(5);
    }
    
    public static rjh p(final FileInputStream fileInputStream) {
        final rjh default_INSTANCE = rjh.DEFAULT_INSTANCE;
        final c c = new c(fileInputStream);
        final c2a a = c2a.a();
        final f i = default_INSTANCE.i();
        try {
            final dei c2 = dei.c;
            c2.getClass();
            final bdk a2 = c2.a(((rjh)i).getClass());
            d c3 = ((h66)c).c;
            if (c3 == null) {
                c3 = new d((h66)c);
            }
            a2.e(i, c3, a);
            a2.b(i);
            if (f.e(i, true)) {
                return (rjh)i;
            }
            throw new IOException(((Throwable)new UninitializedMessageException()).getMessage());
        }
        catch (final RuntimeException ex) {
            if (((Throwable)ex).getCause() instanceof InvalidProtocolBufferException) {
                throw (InvalidProtocolBufferException)((Throwable)ex).getCause();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (((Throwable)ex2).getCause() instanceof InvalidProtocolBufferException) {
                throw (InvalidProtocolBufferException)((Throwable)ex2).getCause();
            }
            throw new IOException(((Throwable)ex2).getMessage(), (Throwable)ex2);
        }
        catch (final UninitializedMessageException ex3) {
            throw new IOException(((Throwable)ex3).getMessage());
        }
        catch (final InvalidProtocolBufferException ex4) {
            Object o = ex4;
            if (ex4.v) {
                o = new IOException(((Throwable)ex4).getMessage(), (Throwable)ex4);
            }
            throw o;
        }
    }
    
    public final Object b(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return 1;
        }
        if (d == 2) {
            return new cqi(rjh.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "preferences_", qjh.a });
        }
        if (d == 3) {
            return new rjh();
        }
        if (d == 4) {
            return new twa(rjh.DEFAULT_INSTANCE);
        }
        if (d == 5) {
            return rjh.DEFAULT_INSTANCE;
        }
        if (d == 6) {
            final gug parser = rjh.PARSER;
            if (parser == null) {
                final Class<rjh> clazz;
                monitorenter(clazz = rjh.class);
                Label_0078: {
                    try {
                        gug parser2;
                        if ((parser2 = rjh.PARSER) == null) {
                            parser2 = (rjh.PARSER = (gug)new ywa());
                        }
                        break Label_0078;
                    }
                    finally {
                        monitorexit(clazz);
                        monitorexit(clazz);
                        return;
                    }
                }
            }
            return parser;
        }
        throw null;
    }
    
    public final Map m() {
        return Collections.unmodifiableMap((Map)this.preferences_);
    }
    
    public final u3e n() {
        u3e preferences_;
        final u3e u3e = preferences_ = this.preferences_;
        if (!u3e.v) {
            preferences_ = u3e.c();
            this.preferences_ = preferences_;
        }
        return preferences_;
    }
}
