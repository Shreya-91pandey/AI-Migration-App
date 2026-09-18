package com.anthropic.claude.api.notification;

@jzk
public final class TestPushRequest
{
    public static final efn Companion;
    public static final d2d[] b;
    public final TestPushCategory a = a;
    
    static {
        Companion = new efn();
        b = new d2d[] { ncq.F(2, (jta)new r3n((byte)7)) };
    }
    
    public TestPushRequest(final TestPushCategory a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof TestPushRequest && this.a == ((TestPushRequest)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TestPushRequest(category=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
