package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ReportErrorRequest extends a
{
    public static final ProtoAdapter<ReportErrorRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "anthropic.claude.usercontent.sandbox.SandboxError#ADAPTER", label = g3q.A, schemaIndex = 0, tag = 1)
    private final SandboxError error;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ReportErrorRequest$Companion$ADAPTER.ReportErrorRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ReportErrorRequest.class), m7n.x);
    }
    
    public ReportErrorRequest() {
        this(null, null, 3, null);
    }
    
    public ReportErrorRequest(final SandboxError error, final is2 is2) {
        super(ReportErrorRequest.ADAPTER, is2);
        this.error = error;
    }
    
    public final ReportErrorRequest copy(final SandboxError sandboxError, final is2 is2) {
        return new ReportErrorRequest(sandboxError, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ReportErrorRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ReportErrorRequest reportErrorRequest = (ReportErrorRequest)o;
        return mlc.q((Object)unknownFields, (Object)reportErrorRequest.unknownFields()) && mlc.q((Object)this.error, (Object)reportErrorRequest.error);
    }
    
    public final SandboxError getError() {
        return this.error;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if ((hashCode = super.hashCode) == 0) {
            final int hashCode2 = this.unknownFields().hashCode();
            final SandboxError error = this.error;
            int hashCode3;
            if (error != null) {
                hashCode3 = error.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            hashCode = hashCode2 * 37 + hashCode3;
            super.hashCode = hashCode;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        final SandboxError error = this.error;
        if (error != null) {
            final StringBuilder sb = new StringBuilder("error=");
            sb.append((Object)error);
            list.add((Object)sb.toString());
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "ReportErrorRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
