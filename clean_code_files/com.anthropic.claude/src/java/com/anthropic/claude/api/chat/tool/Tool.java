package com.anthropic.claude.api.chat.tool;

@jzk(with = e.class)
public abstract class Tool
{
    public static final w1o Companion;
    
    static {
        Companion = (w1o)new Object();
    }
    
    @jzk
    public static final class CustomTool extends Tool
    {
        public static final b Companion;
        public final String a;
        public final String b;
        public final String c;
        public final InputSchema d;
        
        static {
            Companion = (b)new Object();
        }
        
        public CustomTool(final int n, final String a, final String b, final String c, final InputSchema d) {
            if (0xF == (n & 0xF)) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                return;
            }
            iwq.r(n, 15, a.a.getDescriptor());
            throw null;
        }
        
        public CustomTool(final String a, final String b, final String c, final InputSchema d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof CustomTool)) {
                return false;
            }
            final CustomTool customTool = (CustomTool)o;
            return mlc.q((Object)this.a, (Object)customTool.a) && mlc.q((Object)this.b, (Object)customTool.b) && mlc.q((Object)this.c, (Object)customTool.c) && mlc.q((Object)this.d, (Object)customTool.d);
        }
        
        @Override
        public final int hashCode() {
            return this.d.hashCode() + smk.j(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = oz1.t("CustomTool(name=", this.a, ", title=", this.b, ", description=");
            t.append(this.c);
            t.append(", input_schema=");
            t.append((Object)this.d);
            t.append(")");
            return t.toString();
        }
    }
    
    @jzk
    public static final class KnownTool extends Tool
    {
        public static final d Companion;
        public final String a;
        public final String b;
        
        static {
            Companion = (d)new Object();
        }
        
        public KnownTool(final int n, final String a, final String b) {
            if (0x3 == (n & 0x3)) {
                this.a = a;
                this.b = b;
                return;
            }
            iwq.r(n, 3, c.a.getDescriptor());
            throw null;
        }
        
        public KnownTool(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof KnownTool)) {
                return false;
            }
            final KnownTool knownTool = (KnownTool)o;
            return mlc.q((Object)this.a, (Object)knownTool.a) && mlc.q((Object)this.b, (Object)knownTool.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return lmf.t("KnownTool(name=", this.a, ", type=", this.b, ")");
        }
    }
}
