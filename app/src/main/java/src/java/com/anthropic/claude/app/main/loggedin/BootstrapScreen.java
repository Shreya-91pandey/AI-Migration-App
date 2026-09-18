package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.types.strings.OrganizationId;

@jzk
public interface BootstrapScreen extends vqd
{
    public static final c Companion = c.a;
    
    default int a() {
        return 4;
    }
    
    @jzk
    public static final class Bootstrapped implements BootstrapScreen
    {
        public static final b Companion;
        public static final d2d[] c;
        public final String a = a;
        public final wn b = b;
        
        static {
            Companion = (b)new Object();
            c = new d2d[] { null, ncq.F(2, (jta)new kc2((byte)1)) };
        }
        
        public Bootstrapped(final String a, final wn b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Bootstrapped)) {
                return false;
            }
            final Bootstrapped bootstrapped = (Bootstrapped)o;
            return mlc.q((Object)this.a, (Object)bootstrapped.a) && this.b == bootstrapped.b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = OrganizationId.a(this.a);
            final StringBuilder sb = new StringBuilder("Bootstrapped(organizationId=");
            sb.append(a);
            sb.append(", ageSignalsResult=");
            sb.append((Object)this.b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class NeedsBootstrap implements BootstrapScreen
    {
        public static final e Companion;
        public static final d2d[] c;
        public final String a = a;
        public final wn b = b;
        
        static {
            Companion = (e)new Object();
            c = new d2d[] { null, ncq.F(2, (jta)new kc2((byte)2)) };
        }
        
        public NeedsBootstrap(final String a, final wn b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof NeedsBootstrap)) {
                return false;
            }
            final NeedsBootstrap needsBootstrap = (NeedsBootstrap)o;
            final String a = needsBootstrap.a;
            final String a2 = this.a;
            if (a2 == null) {
                if (a == null) {
                    final boolean equals = true;
                    return equals && this.b == needsBootstrap.b;
                }
            }
            else if (a != null) {
                final boolean equals = a2.equals(a);
                return equals && this.b == needsBootstrap.b;
            }
            final boolean equals = false;
            return equals && this.b == needsBootstrap.b;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return this.b.hashCode() + hashCode * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            String a2;
            if (a == null) {
                a2 = "null";
            }
            else {
                a2 = OrganizationId.a(a);
            }
            final StringBuilder sb = new StringBuilder("NeedsBootstrap(organizationId=");
            sb.append(a2);
            sb.append(", ageSignalsResult=");
            sb.append((Object)this.b);
            sb.append(")");
            return sb.toString();
        }
    }
}
