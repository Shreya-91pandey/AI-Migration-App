package com.anthropic.claude.api.model;

import kotlinx.serialization.KSerializer;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ThinkingEffort;

@jzk
@yqc(discriminator = "type")
public interface ThinkingState
{
    public static final b Companion = b.a;
    
    @jzk
    public static final class Effort implements ThinkingState
    {
        public static final d Companion;
        public final String a = a;
        
        static {
            Companion = (d)new Object();
        }
        
        public Effort(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof Effort && mlc.q((Object)this.a, (Object)((Effort)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return hia.k("Effort(effort=", ThinkingEffort.a(this.a), ")");
        }
    }
    
    @jzk
    public static final class EffortAndMode implements ThinkingState
    {
        public static final g Companion;
        public final String a = a;
        public final String b = b;
        
        static {
            Companion = (g)new Object();
        }
        
        public EffortAndMode(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof EffortAndMode)) {
                return false;
            }
            final EffortAndMode effortAndMode = (EffortAndMode)o;
            return mlc.q((Object)this.a, (Object)effortAndMode.a) && mlc.q((Object)this.b, (Object)effortAndMode.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return lmf.t("EffortAndMode(effort=", ThinkingEffort.a(this.a), ", mode=", ThinkingMode.a(this.b), ")");
        }
    }
    
    @jzk
    public static final class Mode implements ThinkingState
    {
        public static final i Companion;
        public final String a = a;
        
        static {
            Companion = (i)new Object();
        }
        
        public Mode(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof Mode && mlc.q((Object)this.a, (Object)((Mode)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return hia.k("Mode(mode=", ThinkingMode.a(this.a), ")");
        }
    }
    
    @jzk
    public static final class Unknown implements ThinkingState
    {
        public static final Unknown INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (Unknown)new Object();
            a = ncq.F(2, (jta)new smn((byte)13));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof Unknown;
        }
        
        @Override
        public final int hashCode() {
            return 1372970051;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)Unknown.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "Unknown";
        }
    }
}
