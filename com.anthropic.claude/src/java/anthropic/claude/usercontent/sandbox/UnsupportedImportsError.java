package anthropic.claude.usercontent.sandbox;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class UnsupportedImportsError extends a
{
    public static final ProtoAdapter<UnsupportedImportsError> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.x, schemaIndex = 1, tag = 2)
    private final List<String> non_existent_icons;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.x, schemaIndex = 0, tag = 1)
    private final List<String> unsupported_modules;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new UnsupportedImportsError$Companion$ADAPTER.UnsupportedImportsError$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)UnsupportedImportsError.class), m7n.x);
    }
    
    public UnsupportedImportsError() {
        this(null, null, null, 7, null);
    }
    
    public UnsupportedImportsError(final List<String> list, final List<String> list2, final is2 is2) {
        super(UnsupportedImportsError.ADAPTER, is2);
        this.unsupported_modules = (List<String>)ear.l("unsupported_modules", (List)list);
        this.non_existent_icons = (List<String>)ear.l("non_existent_icons", (List)list2);
    }
    
    public final UnsupportedImportsError copy(final List<String> list, final List<String> list2, final is2 is2) {
        return new UnsupportedImportsError(list, list2, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UnsupportedImportsError)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final UnsupportedImportsError unsupportedImportsError = (UnsupportedImportsError)o;
        return mlc.q((Object)unknownFields, (Object)unsupportedImportsError.unknownFields()) && mlc.q((Object)this.unsupported_modules, (Object)unsupportedImportsError.unsupported_modules) && mlc.q((Object)this.non_existent_icons, (Object)unsupportedImportsError.non_existent_icons);
    }
    
    public final List<String> getNon_existent_icons() {
        return this.non_existent_icons;
    }
    
    public final List<String> getUnsupported_modules() {
        return this.unsupported_modules;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.non_existent_icons.hashCode() + smk.k(this.unknownFields().hashCode() * 37, 37, (List)this.unsupported_modules);
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        if (!((Collection)this.unsupported_modules).isEmpty()) {
            list.add((Object)"unsupported_modules=".concat(ear.p((List)this.unsupported_modules)));
        }
        if (!((Collection)this.non_existent_icons).isEmpty()) {
            list.add((Object)"non_existent_icons=".concat(ear.p((List)this.non_existent_icons)));
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "UnsupportedImportsError{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
