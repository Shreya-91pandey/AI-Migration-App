package com.anthropic.claude.api.chat.tool;

import com.anthropic.claude.types.strings.FileId;

@jzk
public final class ToolResultImage implements ToolResultContent
{
    public static final a7o Companion;
    public final String a;
    
    static {
        Companion = (a7o)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolResultImage)) {
            return false;
        }
        final String a = ((ToolResultImage)o).a;
        final String a2 = this.a;
        if (a2 == null) {
            if (a == null) {
                return true;
            }
        }
        else if (a != null) {
            return FileId.b(a2, a);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        if (a == null) {
            return 0;
        }
        return FileId.c(a);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        String d;
        if (a == null) {
            d = "null";
        }
        else {
            d = FileId.d(a);
        }
        return hia.k("ToolResultImage(file_uuid=", d, ")");
    }
}
