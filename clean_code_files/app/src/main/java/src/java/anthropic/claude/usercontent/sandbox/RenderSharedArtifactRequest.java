package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RenderSharedArtifactRequest extends a
{
    public static final ProtoAdapter<RenderSharedArtifactRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String uuid;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RenderSharedArtifactRequest$Companion$ADAPTER.RenderSharedArtifactRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RenderSharedArtifactRequest.class), m7n.x);
    }
    
    public RenderSharedArtifactRequest() {
        this(null, null, 3, null);
    }
    
    public RenderSharedArtifactRequest(final String uuid, final is2 is2) {
        super(RenderSharedArtifactRequest.ADAPTER, is2);
        this.uuid = uuid;
    }
    
    public final RenderSharedArtifactRequest copy(final String s, final is2 is2) {
        return new RenderSharedArtifactRequest(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RenderSharedArtifactRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RenderSharedArtifactRequest renderSharedArtifactRequest = (RenderSharedArtifactRequest)o;
        return mlc.q((Object)unknownFields, (Object)renderSharedArtifactRequest.unknownFields()) && mlc.q((Object)this.uuid, (Object)renderSharedArtifactRequest.uuid);
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
        return c86.N0((Iterable)list, (CharSequence)", ", "RenderSharedArtifactRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
