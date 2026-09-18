package com.anthropic.claude.api.chat.tool;

@jzk
public final class BooleanProperty implements PropertyDefinition
{
    public static final oh2 Companion;
    public final String a;
    
    static {
        Companion = (oh2)new Object();
    }
    
    public BooleanProperty(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof BooleanProperty && mlc.q((Object)this.a, (Object)((BooleanProperty)o).a));
    }
    
    @Override
    public final String getDescription() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("BooleanProperty(description=", this.a, ")");
    }
}
