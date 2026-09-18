package anthropic.claude.usercontent.mcpapp;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ReportHandshakeResultRequest extends a
{
    public static final ProtoAdapter<ReportHandshakeResultRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "anthropic.claude.usercontent.mcpapp.HandshakeError#ADAPTER", schemaIndex = 2, tag = 3)
    private final HandshakeError error;
    @h3q(adapter = "anthropic.claude.usercontent.mcpapp.DeclaredPermissions#ADAPTER", schemaIndex = 0, tag = 1)
    private final DeclaredPermissions permissions;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    private final Boolean prefers_border;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ReportHandshakeResultRequest$Companion$ADAPTER.ReportHandshakeResultRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ReportHandshakeResultRequest.class), m7n.x);
    }
    
    public ReportHandshakeResultRequest() {
        this(null, null, null, null, 15, null);
    }
    
    public ReportHandshakeResultRequest(final DeclaredPermissions permissions, final Boolean prefers_border, final HandshakeError error, final is2 is2) {
        super(ReportHandshakeResultRequest.ADAPTER, is2);
        this.permissions = permissions;
        this.prefers_border = prefers_border;
        this.error = error;
    }
    
    public final ReportHandshakeResultRequest copy(final DeclaredPermissions declaredPermissions, final Boolean b, final HandshakeError handshakeError, final is2 is2) {
        return new ReportHandshakeResultRequest(declaredPermissions, b, handshakeError, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ReportHandshakeResultRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ReportHandshakeResultRequest reportHandshakeResultRequest = (ReportHandshakeResultRequest)o;
        return mlc.q((Object)unknownFields, (Object)reportHandshakeResultRequest.unknownFields()) && mlc.q((Object)this.permissions, (Object)reportHandshakeResultRequest.permissions) && mlc.q((Object)this.prefers_border, (Object)reportHandshakeResultRequest.prefers_border) && mlc.q((Object)this.error, (Object)reportHandshakeResultRequest.error);
    }
    
    public final HandshakeError getError() {
        return this.error;
    }
    
    public final DeclaredPermissions getPermissions() {
        return this.permissions;
    }
    
    public final Boolean getPrefers_border() {
        return this.prefers_border;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if ((hashCode = super.hashCode) == 0) {
            final int hashCode2 = this.unknownFields().hashCode();
            final DeclaredPermissions permissions = this.permissions;
            int hashCode3 = 0;
            int hashCode4;
            if (permissions != null) {
                hashCode4 = permissions.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final Boolean prefers_border = this.prefers_border;
            int hashCode5;
            if (prefers_border != null) {
                hashCode5 = Boolean.hashCode((boolean)prefers_border);
            }
            else {
                hashCode5 = 0;
            }
            final HandshakeError error = this.error;
            if (error != null) {
                hashCode3 = error.hashCode();
            }
            hashCode = ((hashCode2 * 37 + hashCode4) * 37 + hashCode5) * 37 + hashCode3;
            super.hashCode = hashCode;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        final DeclaredPermissions permissions = this.permissions;
        if (permissions != null) {
            final StringBuilder sb = new StringBuilder("permissions=");
            sb.append((Object)permissions);
            list.add((Object)sb.toString());
        }
        final Boolean prefers_border = this.prefers_border;
        if (prefers_border != null) {
            y1j.h("prefers_border=", prefers_border, list);
        }
        final HandshakeError error = this.error;
        if (error != null) {
            final StringBuilder sb2 = new StringBuilder("error=");
            sb2.append((Object)error);
            list.add((Object)sb2.toString());
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "ReportHandshakeResultRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
