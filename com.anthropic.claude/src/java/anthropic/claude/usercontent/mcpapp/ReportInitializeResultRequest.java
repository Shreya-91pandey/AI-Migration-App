package anthropic.claude.usercontent.mcpapp;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ReportInitializeResultRequest extends a
{
    public static final ProtoAdapter<ReportInitializeResultRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.x, schemaIndex = 0, tag = 1)
    private final List<String> available_display_modes;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ReportInitializeResultRequest$Companion$ADAPTER.ReportInitializeResultRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ReportInitializeResultRequest.class), m7n.x);
    }
    
    public ReportInitializeResultRequest() {
        this(null, null, 3, null);
    }
    
    public ReportInitializeResultRequest(final List<String> list, final is2 is2) {
        super(ReportInitializeResultRequest.ADAPTER, is2);
        this.available_display_modes = (List<String>)ear.l("available_display_modes", (List)list);
    }
    
    public final ReportInitializeResultRequest copy(final List<String> list, final is2 is2) {
        return new ReportInitializeResultRequest(list, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ReportInitializeResultRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ReportInitializeResultRequest reportInitializeResultRequest = (ReportInitializeResultRequest)o;
        return mlc.q((Object)unknownFields, (Object)reportInitializeResultRequest.unknownFields()) && mlc.q((Object)this.available_display_modes, (Object)reportInitializeResultRequest.available_display_modes);
    }
    
    public final List<String> getAvailable_display_modes() {
        return this.available_display_modes;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.available_display_modes.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        if (!((Collection)this.available_display_modes).isEmpty()) {
            list.add((Object)"available_display_modes=".concat(ear.p((List)this.available_display_modes)));
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "ReportInitializeResultRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
