package anthropic.claude.usercontent.mcpapp;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class OpenLinkRequest extends a
{
    public static final ProtoAdapter<OpenLinkRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = g3q.A, schemaIndex = 1, tag = 2)
    private final boolean skip_confirmation;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String url;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new OpenLinkRequest$Companion$ADAPTER.OpenLinkRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)OpenLinkRequest.class), m7n.x);
    }
    
    public OpenLinkRequest() {
        this(null, false, null, 7, null);
    }
    
    public OpenLinkRequest(final String url, final boolean skip_confirmation, final is2 is2) {
        super(OpenLinkRequest.ADAPTER, is2);
        this.url = url;
        this.skip_confirmation = skip_confirmation;
    }
    
    public final OpenLinkRequest copy(final String s, final boolean b, final is2 is2) {
        return new OpenLinkRequest(s, b, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpenLinkRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final OpenLinkRequest openLinkRequest = (OpenLinkRequest)o;
        return mlc.q((Object)unknownFields, (Object)openLinkRequest.unknownFields()) && mlc.q((Object)this.url, (Object)openLinkRequest.url) && this.skip_confirmation == openLinkRequest.skip_confirmation;
    }
    
    public final boolean getSkip_confirmation() {
        return this.skip_confirmation;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = Boolean.hashCode(this.skip_confirmation) + smk.j(this.unknownFields().hashCode() * 37, 37, this.url);
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.url, "url=", list);
        o47.d("skip_confirmation=", this.skip_confirmation, list);
        return c86.N0((Iterable)list, (CharSequence)", ", "OpenLinkRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
