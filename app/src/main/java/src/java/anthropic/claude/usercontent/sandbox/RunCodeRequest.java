package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RunCodeRequest extends a
{
    public static final ProtoAdapter<RunCodeRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String code;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RunCodeRequest$Companion$ADAPTER.RunCodeRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RunCodeRequest.class), m7n.x);
    }
    
    public RunCodeRequest() {
        this(null, null, 3, null);
    }
    
    public RunCodeRequest(final String code, final is2 is2) {
        super(RunCodeRequest.ADAPTER, is2);
        this.code = code;
    }
    
    public final RunCodeRequest copy(final String s, final is2 is2) {
        return new RunCodeRequest(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RunCodeRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RunCodeRequest runCodeRequest = (RunCodeRequest)o;
        return mlc.q((Object)unknownFields, (Object)runCodeRequest.unknownFields()) && mlc.q((Object)this.code, (Object)runCodeRequest.code);
    }
    
    public final String getCode() {
        return this.code;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.code.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.code, "code=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "RunCodeRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
