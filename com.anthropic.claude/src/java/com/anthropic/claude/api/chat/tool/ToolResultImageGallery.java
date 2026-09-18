package com.anthropic.claude.api.chat.tool;

import java.util.ArrayList;
import java.util.List;

@jzk
public final class ToolResultImageGallery implements ToolResultContent
{
    public static final c7o Companion;
    public static final d2d[] b;
    public final List a = a;
    
    static {
        Companion = (c7o)new Object();
        b = new d2d[] { ncq.F(2, (jta)new smn((byte)21)) };
    }
    
    public ToolResultImageGallery(final ArrayList a) {
        this.a = (List)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ToolResultImageGallery && mlc.q((Object)this.a, (Object)((ToolResultImageGallery)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.l("ToolResultImageGallery(images=", ")", this.a);
    }
}
