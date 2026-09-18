package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class FileNotFoundError extends a
{
    public static final ProtoAdapter<FileNotFoundError> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String file_name;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new FileNotFoundError$Companion$ADAPTER.FileNotFoundError$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)FileNotFoundError.class), m7n.x);
    }
    
    public FileNotFoundError() {
        this(null, null, 3, null);
    }
    
    public FileNotFoundError(final String file_name, final is2 is2) {
        super(FileNotFoundError.ADAPTER, is2);
        this.file_name = file_name;
    }
    
    public final FileNotFoundError copy(final String s, final is2 is2) {
        return new FileNotFoundError(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FileNotFoundError)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final FileNotFoundError fileNotFoundError = (FileNotFoundError)o;
        return mlc.q((Object)unknownFields, (Object)fileNotFoundError.unknownFields()) && mlc.q((Object)this.file_name, (Object)fileNotFoundError.file_name);
    }
    
    public final String getFile_name() {
        return this.file_name;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.file_name.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.file_name, "file_name=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "FileNotFoundError{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
