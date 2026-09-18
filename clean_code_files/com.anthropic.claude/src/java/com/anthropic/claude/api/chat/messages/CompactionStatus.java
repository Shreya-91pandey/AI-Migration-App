package com.anthropic.claude.api.chat.messages;

@jzk
public final class CompactionStatus
{
    public static final yb6 Companion;
    public static final d2d[] c;
    public final Status a = a;
    public final String b;
    
    static {
        Companion = new yb6();
        c = new d2d[] { ncq.F(2, (jta)new q76((byte)21)), null };
    }
    
    public CompactionStatus(final Status a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompactionStatus)) {
            return false;
        }
        final CompactionStatus compactionStatus = (CompactionStatus)o;
        return this.a == compactionStatus.a && mlc.q((Object)this.b, (Object)compactionStatus.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CompactionStatus(status=");
        sb.append((Object)this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
    
    @jzk
    public enum Status
    {
        public static final b Companion;
        public static final d2d v;
        
        w("COMPACTING", 0), 
        x("COMPLETE", 1), 
        y("FAILED", 2);
        
        public static final Status[] z;
        
        static {
            Companion = (b)new Object();
            v = ncq.F(2, (jta)new lv4((byte)12));
        }
    }
}
