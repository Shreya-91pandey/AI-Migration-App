package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RenderPublicArtifactRequest extends a
{
    public static final ProtoAdapter<RenderPublicArtifactRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String uuid;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RenderPublicArtifactRequest$Companion$ADAPTER.RenderPublicArtifactRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RenderPublicArtifactRequest.class), m7n.x);
    }
    
    public RenderPublicArtifactRequest() {
        this(null, null, 3, null);
    }
    
    public RenderPublicArtifactRequest(final String uuid, final is2 is2) {
        super(RenderPublicArtifactRequest.ADAPTER, is2);
        this.uuid = uuid;
    }
    
    public final RenderPublicArtifactRequest copy(final String s, final is2 is2) {
        return new RenderPublicArtifactRequest(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RenderPublicArtifactRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RenderPublicArtifactRequest renderPublicArtifactRequest = (RenderPublicArtifactRequest)o;
        return mlc.q((Object)unknownFields, (Object)renderPublicArtifactRequest.unknownFields()) && mlc.q((Object)this.uuid, (Object)renderPublicArtifactRequest.uuid);
    }
    
    public final String getUuid() {
        return this.uuid;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.uuid.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.uuid, "uuid=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "RenderPublicArtifactRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
