package com.anthropic.claude.api.model;

import java.util.List;

@jzk
public final class ModelSelectorConfig
{
    public static final bff Companion;
    public static final d2d[] c;
    public final String a = a;
    public final List b;
    
    static {
        Companion = (bff)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new v0e((byte)26)) };
    }
    
    public ModelSelectorConfig(final String a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelSelectorConfig)) {
            return false;
        }
        final ModelSelectorConfig modelSelectorConfig = (ModelSelectorConfig)o;
        return mlc.q((Object)this.a, (Object)modelSelectorConfig.a) && mlc.q((Object)this.b, (Object)modelSelectorConfig.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return rua.i("ModelSelectorConfig(id=", ModelSelectorSurface.a(this.a), ", models=", this.b, ")");
    }
}
