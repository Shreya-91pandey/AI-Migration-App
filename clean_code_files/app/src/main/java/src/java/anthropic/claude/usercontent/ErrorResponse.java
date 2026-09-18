package anthropic.claude.usercontent;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ErrorResponse extends a
{
    public static final ProtoAdapter<ErrorResponse> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String error;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ErrorResponse$Companion$ADAPTER.ErrorResponse$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ErrorResponse.class), m7n.x);
    }
    
    public ErrorResponse() {
        this(null, null, 3, null);
    }
    
    public ErrorResponse(final String error, final is2 is2) {
        super(ErrorResponse.ADAPTER, is2);
        this.error = error;
    }
    
    public final ErrorResponse copy(final String s, final is2 is2) {
        return new ErrorResponse(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ErrorResponse)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ErrorResponse errorResponse = (ErrorResponse)o;
        return mlc.q((Object)unknownFields, (Object)errorResponse.unknownFields()) && mlc.q((Object)this.error, (Object)errorResponse.error);
    }
    
    public final String getError() {
        return this.error;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.error.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.error, "error=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "ErrorResponse{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
