package anthropic.claude.usercontent.sandbox;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RunCodeResponse extends a
{
    public static final ProtoAdapter<RunCodeResponse> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 3, tag = 4)
    private final String error;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.x, schemaIndex = 2, tag = 3)
    private final List<String> logs;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String result;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String status;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RunCodeResponse$Companion$ADAPTER.RunCodeResponse$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RunCodeResponse.class), m7n.x);
    }
    
    public RunCodeResponse() {
        this(null, null, null, null, null, 31, null);
    }
    
    public RunCodeResponse(final String status, final String result, final List<String> list, final String error, final is2 is2) {
        super(RunCodeResponse.ADAPTER, is2);
        this.status = status;
        this.result = result;
        this.error = error;
        this.logs = (List<String>)ear.l("logs", (List)list);
    }
    
    public final RunCodeResponse copy(final String s, final String s2, final List<String> list, final String s3, final is2 is2) {
        return new RunCodeResponse(s, s2, list, s3, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RunCodeResponse)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RunCodeResponse runCodeResponse = (RunCodeResponse)o;
        return mlc.q((Object)unknownFields, (Object)runCodeResponse.unknownFields()) && mlc.q((Object)this.status, (Object)runCodeResponse.status) && mlc.q((Object)this.result, (Object)runCodeResponse.result) && mlc.q((Object)this.logs, (Object)runCodeResponse.logs) && mlc.q((Object)this.error, (Object)runCodeResponse.error);
    }
    
    public final String getError() {
        return this.error;
    }
    
    public final List<String> getLogs() {
        return this.logs;
    }
    
    public final String getResult() {
        return this.result;
    }
    
    public final String getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.error.hashCode() + smk.k(smk.j(smk.j(this.unknownFields().hashCode() * 37, 37, this.status), 37, this.result), 37, (List)this.logs);
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.status, "status=", list);
        ca9.t(this.result, "result=", list);
        if (!((Collection)this.logs).isEmpty()) {
            list.add((Object)"logs=".concat(ear.p((List)this.logs)));
        }
        ca9.t(this.error, "error=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "RunCodeResponse{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
