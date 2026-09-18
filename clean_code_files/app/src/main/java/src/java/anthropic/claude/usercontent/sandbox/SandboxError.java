package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class SandboxError extends a
{
    public static final ProtoAdapter<SandboxError> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "anthropic.claude.usercontent.sandbox.ClaudeCompletionError#ADAPTER", oneofName = "error", schemaIndex = 3, tag = 4)
    private final ClaudeCompletionError claude_completion_error;
    @h3q(adapter = "anthropic.claude.usercontent.sandbox.FileNotFoundError#ADAPTER", oneofName = "error", schemaIndex = 2, tag = 3)
    private final FileNotFoundError file_not_found;
    @h3q(adapter = "anthropic.claude.usercontent.sandbox.RuntimeError#ADAPTER", oneofName = "error", schemaIndex = 1, tag = 2)
    private final RuntimeError runtime_error;
    @h3q(adapter = "anthropic.claude.usercontent.sandbox.UnsupportedImportsError#ADAPTER", oneofName = "error", schemaIndex = 0, tag = 1)
    private final UnsupportedImportsError unsupported_imports;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new SandboxError$Companion$ADAPTER.SandboxError$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)SandboxError.class), m7n.x);
    }
    
    public SandboxError() {
        this(null, null, null, null, null, 31, null);
    }
    
    public SandboxError(final UnsupportedImportsError unsupported_imports, final RuntimeError runtime_error, final FileNotFoundError file_not_found, final ClaudeCompletionError claude_completion_error, final is2 is2) {
        super(SandboxError.ADAPTER, is2);
        this.unsupported_imports = unsupported_imports;
        this.runtime_error = runtime_error;
        this.file_not_found = file_not_found;
        this.claude_completion_error = claude_completion_error;
        if (ear.i(unsupported_imports, runtime_error, file_not_found, claude_completion_error, new Object[0]) <= 1) {
            return;
        }
        en9.s("At most one of unsupported_imports, runtime_error, file_not_found, claude_completion_error may be non-null");
        throw null;
    }
    
    public final SandboxError copy(final UnsupportedImportsError unsupportedImportsError, final RuntimeError runtimeError, final FileNotFoundError fileNotFoundError, final ClaudeCompletionError claudeCompletionError, final is2 is2) {
        return new SandboxError(unsupportedImportsError, runtimeError, fileNotFoundError, claudeCompletionError, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SandboxError)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final SandboxError sandboxError = (SandboxError)o;
        return mlc.q((Object)unknownFields, (Object)sandboxError.unknownFields()) && mlc.q((Object)this.unsupported_imports, (Object)sandboxError.unsupported_imports) && mlc.q((Object)this.runtime_error, (Object)sandboxError.runtime_error) && mlc.q((Object)this.file_not_found, (Object)sandboxError.file_not_found) && mlc.q((Object)this.claude_completion_error, (Object)sandboxError.claude_completion_error);
    }
    
    public final ClaudeCompletionError getClaude_completion_error() {
        return this.claude_completion_error;
    }
    
    public final FileNotFoundError getFile_not_found() {
        return this.file_not_found;
    }
    
    public final RuntimeError getRuntime_error() {
        return this.runtime_error;
    }
    
    public final UnsupportedImportsError getUnsupported_imports() {
        return this.unsupported_imports;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if ((hashCode = super.hashCode) == 0) {
            final int hashCode2 = this.unknownFields().hashCode();
            final UnsupportedImportsError unsupported_imports = this.unsupported_imports;
            int hashCode3 = 0;
            int hashCode4;
            if (unsupported_imports != null) {
                hashCode4 = unsupported_imports.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final RuntimeError runtime_error = this.runtime_error;
            int hashCode5;
            if (runtime_error != null) {
                hashCode5 = runtime_error.hashCode();
            }
            else {
                hashCode5 = 0;
            }
            final FileNotFoundError file_not_found = this.file_not_found;
            int hashCode6;
            if (file_not_found != null) {
                hashCode6 = file_not_found.hashCode();
            }
            else {
                hashCode6 = 0;
            }
            final ClaudeCompletionError claude_completion_error = this.claude_completion_error;
            if (claude_completion_error != null) {
                hashCode3 = claude_completion_error.hashCode();
            }
            hashCode = (((hashCode2 * 37 + hashCode4) * 37 + hashCode5) * 37 + hashCode6) * 37 + hashCode3;
            super.hashCode = hashCode;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        final UnsupportedImportsError unsupported_imports = this.unsupported_imports;
        if (unsupported_imports != null) {
            final StringBuilder sb = new StringBuilder("unsupported_imports=");
            sb.append((Object)unsupported_imports);
            list.add((Object)sb.toString());
        }
        final RuntimeError runtime_error = this.runtime_error;
        if (runtime_error != null) {
            final StringBuilder sb2 = new StringBuilder("runtime_error=");
            sb2.append((Object)runtime_error);
            list.add((Object)sb2.toString());
        }
        final FileNotFoundError file_not_found = this.file_not_found;
        if (file_not_found != null) {
            final StringBuilder sb3 = new StringBuilder("file_not_found=");
            sb3.append((Object)file_not_found);
            list.add((Object)sb3.toString());
        }
        final ClaudeCompletionError claude_completion_error = this.claude_completion_error;
        if (claude_completion_error != null) {
            final StringBuilder sb4 = new StringBuilder("claude_completion_error=");
            sb4.append((Object)claude_completion_error);
            list.add((Object)sb4.toString());
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "SandboxError{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
