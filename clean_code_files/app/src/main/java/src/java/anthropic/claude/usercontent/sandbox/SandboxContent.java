package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class SandboxContent extends a
{
    public static final ProtoAdapter<SandboxContent> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String content;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 2, tag = 3)
    private final String conversation_uuid;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", oneofName = "storage_key", schemaIndex = 4, tag = 5)
    private final String file_path;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 5, tag = 6)
    private final String snapshot_uuid;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String type;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", oneofName = "storage_key", schemaIndex = 3, tag = 4)
    private final String version_uuid;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new SandboxContent$Companion$ADAPTER.SandboxContent$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)SandboxContent.class), m7n.x);
    }
    
    public SandboxContent() {
        this(null, null, null, null, null, null, null, 127, null);
    }
    
    public SandboxContent(final String content, final String type, final String conversation_uuid, final String version_uuid, final String file_path, final String snapshot_uuid, final is2 is2) {
        super(SandboxContent.ADAPTER, is2);
        this.content = content;
        this.type = type;
        this.conversation_uuid = conversation_uuid;
        this.version_uuid = version_uuid;
        this.file_path = file_path;
        this.snapshot_uuid = snapshot_uuid;
        if (ear.j(version_uuid, file_path) <= 1) {
            return;
        }
        en9.s("At most one of version_uuid, file_path may be non-null");
        throw null;
    }
    
    public final SandboxContent copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final is2 is2) {
        return new SandboxContent(s, s2, s3, s4, s5, s6, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SandboxContent)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final SandboxContent sandboxContent = (SandboxContent)o;
        return mlc.q((Object)unknownFields, (Object)sandboxContent.unknownFields()) && mlc.q((Object)this.content, (Object)sandboxContent.content) && mlc.q((Object)this.type, (Object)sandboxContent.type) && mlc.q((Object)this.conversation_uuid, (Object)sandboxContent.conversation_uuid) && mlc.q((Object)this.version_uuid, (Object)sandboxContent.version_uuid) && mlc.q((Object)this.file_path, (Object)sandboxContent.file_path) && mlc.q((Object)this.snapshot_uuid, (Object)sandboxContent.snapshot_uuid);
    }
    
    public final String getContent() {
        return this.content;
    }
    
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }
    
    public final String getFile_path() {
        return this.file_path;
    }
    
    public final String getSnapshot_uuid() {
        return this.snapshot_uuid;
    }
    
    public final String getType() {
        return this.type;
    }
    
    public final String getVersion_uuid() {
        return this.version_uuid;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            final int j = smk.j(smk.j(smk.j(this.unknownFields().hashCode() * 37, 37, this.content), 37, this.type), 37, this.conversation_uuid);
            final String version_uuid = this.version_uuid;
            int hashCode2 = 0;
            int hashCode3;
            if (version_uuid != null) {
                hashCode3 = version_uuid.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final String file_path = this.file_path;
            if (file_path != null) {
                hashCode2 = file_path.hashCode();
            }
            return super.hashCode = this.snapshot_uuid.hashCode() + ((j + hashCode3) * 37 + hashCode2) * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.content, "content=", list);
        ca9.t(this.type, "type=", list);
        ca9.t(this.conversation_uuid, "conversation_uuid=", list);
        final String version_uuid = this.version_uuid;
        if (version_uuid != null) {
            ca9.t(version_uuid, "version_uuid=", list);
        }
        final String file_path = this.file_path;
        if (file_path != null) {
            ca9.t(file_path, "file_path=", list);
        }
        ca9.t(this.snapshot_uuid, "snapshot_uuid=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "SandboxContent{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
