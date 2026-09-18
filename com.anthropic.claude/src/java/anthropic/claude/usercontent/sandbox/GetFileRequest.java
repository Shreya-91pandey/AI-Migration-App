package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class GetFileRequest extends a
{
    public static final ProtoAdapter<GetFileRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String key;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new GetFileRequest$Companion$ADAPTER.GetFileRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)GetFileRequest.class), m7n.x);
    }
    
    public GetFileRequest() {
        this(null, null, 3, null);
    }
    
    public GetFileRequest(final String key, final is2 is2) {
        super(GetFileRequest.ADAPTER, is2);
        this.key = key;
    }
    
    public final GetFileRequest copy(final String s, final is2 is2) {
        return new GetFileRequest(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetFileRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final GetFileRequest getFileRequest = (GetFileRequest)o;
        return mlc.q((Object)unknownFields, (Object)getFileRequest.unknownFields()) && mlc.q((Object)this.key, (Object)getFileRequest.key);
    }
    
    public final String getKey() {
        return this.key;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.key.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.key, "key=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "GetFileRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
