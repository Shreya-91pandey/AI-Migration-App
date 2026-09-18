package com.anthropic.claude.app.main;

import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AccountId;
import kotlinx.serialization.KSerializer;

@jzk
interface MainAppScreens extends vqd
{
    public static final m Companion = m.a;
    
    default int a() {
        return 4;
    }
    
    @jzk
    public static final class AddAccount implements MainAppScreens
    {
        public static final AddAccount INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (AddAccount)new Object();
            a = ncq.F(2, (jta)new lrc((byte)27));
        }
        
        @Override
        public final /* bridge */ int a() {
            return 4;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof AddAccount;
        }
        
        @Override
        public final int hashCode() {
            return -77970764;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)AddAccount.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "AddAccount";
        }
    }
    
    @jzk
    public static final class InternalSettings implements MainAppScreens
    {
        public static final InternalSettings INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (InternalSettings)new Object();
            a = ncq.F(2, (jta)new lrc((byte)28));
        }
        
        @Override
        public final /* bridge */ int a() {
            return 4;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof InternalSettings;
        }
        
        @Override
        public final int hashCode() {
            return 1501973608;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)InternalSettings.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "InternalSettings";
        }
    }
    
    @jzk
    public static final class LoggedIn implements MainAppScreens
    {
        public static final o Companion;
        public static final d2d[] d;
        public final String a = a;
        public final String b = b;
        public final wn c = c;
        
        static {
            Companion = (o)new Object();
            d = new d2d[] { null, null, ncq.F(2, (jta)new lrc((byte)29)) };
        }
        
        public LoggedIn(final String a, final String b, final wn c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final /* bridge */ int a() {
            return 4;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof LoggedIn)) {
                return false;
            }
            final LoggedIn loggedIn = (LoggedIn)o;
            if (!mlc.q((Object)this.a, (Object)loggedIn.a)) {
                return false;
            }
            final String b = loggedIn.b;
            final String b2 = this.b;
            if (b2 == null) {
                if (b == null) {
                    final boolean equals = true;
                    return equals && this.c == loggedIn.c;
                }
            }
            else if (b != null) {
                final boolean equals = b2.equals(b);
                return equals && this.c == loggedIn.c;
            }
            final boolean equals = false;
            return equals && this.c == loggedIn.c;
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
            return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = AccountId.a(this.a);
            final String b = this.b;
            String a2;
            if (b == null) {
                a2 = "null";
            }
            else {
                a2 = OrganizationId.a(b);
            }
            final StringBuilder t = oz1.t("LoggedIn(accountId=", a, ", initialOrganizationId=", a2, ", ageSignalsResult=");
            t.append((Object)this.c);
            t.append(")");
            return t.toString();
        }
    }
    
    @jzk
    public static final class LoggedOut implements MainAppScreens
    {
        public static final q Companion;
        public static final d2d[] b;
        public final WelcomeNotice a;
        
        static {
            Companion = (q)new Object();
            b = new d2d[] { ncq.F(2, (jta)new v0e((byte)0)) };
        }
        
        public LoggedOut(final WelcomeNotice a) {
            this.a = a;
        }
        
        @Override
        public final /* bridge */ int a() {
            return 4;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof LoggedOut && this.a == ((LoggedOut)o).a);
        }
        
        @Override
        public final int hashCode() {
            final WelcomeNotice a = this.a;
            if (a == null) {
                return 0;
            }
            return a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("LoggedOut(notice=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class RequiredUpdate implements MainAppScreens
    {
        public static final RequiredUpdate INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (RequiredUpdate)new Object();
            a = ncq.F(2, (jta)new v0e((byte)1));
        }
        
        @Override
        public final /* bridge */ int a() {
            return 4;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof RequiredUpdate;
        }
        
        @Override
        public final int hashCode() {
            return -1476671056;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)RequiredUpdate.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "RequiredUpdate";
        }
    }
    
    @jzk
    public static final class StepUpReauth implements MainAppScreens
    {
        public static final s Companion;
        public final String a = a;
        
        static {
            Companion = new s();
        }
        
        public StepUpReauth(final String a) {
            this.a = a;
        }
        
        @Override
        public final /* bridge */ int a() {
            return 4;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof StepUpReauth && mlc.q((Object)this.a, (Object)((StepUpReauth)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return hia.k("StepUpReauth(currentAccountId=", AccountId.a(this.a), ")");
        }
    }
    
    @jzk
    public static final class UiDemoApp implements MainAppScreens
    {
        public static final UiDemoApp INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (UiDemoApp)new Object();
            a = ncq.F(2, (jta)new v0e((byte)2));
        }
        
        @Override
        public final /* bridge */ int a() {
            return 4;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof UiDemoApp;
        }
        
        @Override
        public final int hashCode() {
            return -1456749918;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)UiDemoApp.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "UiDemoApp";
        }
    }
}
