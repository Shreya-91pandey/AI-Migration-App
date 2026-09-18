package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RenderPublicArtifactResponse extends a
{
    public static final ProtoAdapter<RenderPublicArtifactResponse> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String error;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String status;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RenderPublicArtifactResponse$Companion$ADAPTER.RenderPublicArtifactResponse$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RenderPublicArtifactResponse.class), m7n.x);
    }
    
    public RenderPublicArtifactResponse() {
        this(null, null, null, 7, null);
    }
    
    public RenderPublicArtifactResponse(final String status, final String error, final is2 is2) {
        super(RenderPublicArtifactResponse.ADAPTER, is2);
        this.status = status;
        this.error = error;
    }
    
    public final RenderPublicArtifactResponse copy(final String s, final String s2, final is2 is2) {
        return new RenderPublicArtifactResponse(s, s2, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RenderPublicArtifactResponse)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RenderPublicArtifactResponse renderPublicArtifactResponse = (RenderPublicArtifactResponse)o;
        return mlc.q((Object)unknownFields, (Object)renderPublicArtifactResponse.unknownFields()) && mlc.q((Object)this.status, (Object)renderPublicArtifactResponse.status) && mlc.q((Object)this.error, (Object)renderPublicArtifactResponse.error);
    }
    
    public final String getError() {
        return this.error;
    }
    
    public final String getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.error.hashCode() + smk.j(this.unknownFields().hashCode() * 37, 37, this.status);
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.status, "status=", list);
        ca9.t(this.error, "error=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "RenderPublicArtifactResponse{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
