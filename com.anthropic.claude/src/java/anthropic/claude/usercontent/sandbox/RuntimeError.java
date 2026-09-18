package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RuntimeError extends a
{
    public static final ProtoAdapter<RuntimeError> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String message;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RuntimeError$Companion$ADAPTER.RuntimeError$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RuntimeError.class), m7n.x);
    }
    
    public RuntimeError() {
        this(null, null, 3, null);
    }
    
    public RuntimeError(final String message, final is2 is2) {
        super(RuntimeError.ADAPTER, is2);
        this.message = message;
    }
    
    public final RuntimeError copy(final String s, final is2 is2) {
        return new RuntimeError(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RuntimeError)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RuntimeError runtimeError = (RuntimeError)o;
        return mlc.q((Object)unknownFields, (Object)runtimeError.unknownFields()) && mlc.q((Object)this.message, (Object)runtimeError.message);
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.message.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.message, "message=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "RuntimeError{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
