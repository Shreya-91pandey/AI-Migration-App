package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class GetFileResponse extends a
{
    public static final ProtoAdapter<GetFileResponse> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = "value", label = g3q.A, schemaIndex = 0, tag = 1)
    private final is2 value_;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new GetFileResponse$Companion$ADAPTER.GetFileResponse$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)GetFileResponse.class), m7n.x);
    }
    
    public GetFileResponse() {
        this(null, null, 3, null);
    }
    
    public GetFileResponse(final is2 value_, final is2 is2) {
        super(GetFileResponse.ADAPTER, is2);
        this.value_ = value_;
    }
    
    public final GetFileResponse copy(final is2 is2, final is2 is3) {
        return new GetFileResponse(is2, is3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetFileResponse)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final GetFileResponse getFileResponse = (GetFileResponse)o;
        return mlc.q((Object)unknownFields, (Object)getFileResponse.unknownFields()) && mlc.q((Object)this.value_, (Object)getFileResponse.value_);
    }
    
    public final is2 getValue_() {
        return this.value_;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.value_.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        final is2 value_ = this.value_;
        final StringBuilder sb = new StringBuilder("value_=");
        sb.append((Object)value_);
        list.add((Object)sb.toString());
        return c86.N0((Iterable)list, (CharSequence)", ", "GetFileResponse{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
