package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class OpenExternal extends a
{
    public static final ProtoAdapter<OpenExternal> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String href;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new OpenExternal$Companion$ADAPTER.OpenExternal$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)OpenExternal.class), m7n.x);
    }
    
    public OpenExternal() {
        this(null, null, 3, null);
    }
    
    public OpenExternal(final String href, final is2 is2) {
        super(OpenExternal.ADAPTER, is2);
        this.href = href;
    }
    
    public final OpenExternal copy(final String s, final is2 is2) {
        return new OpenExternal(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpenExternal)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final OpenExternal openExternal = (OpenExternal)o;
        return mlc.q((Object)unknownFields, (Object)openExternal.unknownFields()) && mlc.q((Object)this.href, (Object)openExternal.href);
    }
    
    public final String getHref() {
        return this.href;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.href.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.href, "href=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "OpenExternal{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
