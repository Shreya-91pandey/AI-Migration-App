package com.anthropic.claude.app.main.loggedin;

import kotlinx.serialization.KSerializer;

@jzk
public interface LoggedInScreens extends vqd
{
    public static final j Companion = j.a;
    
    default int a() {
        return 4;
    }
    
    @jzk
    public static final class AccountVerification implements LoggedInScreens
    {
        public static final AccountVerification INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (AccountVerification)new Object();
            a = ncq.F(2, (jta)new lrc((byte)12));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof AccountVerification;
        }
        
        @Override
        public final int hashCode() {
            return 858059834;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)AccountVerification.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "AccountVerification";
        }
    }
    
    @jzk
    public static final class ClaudeApp implements LoggedInScreens
    {
        public static final ClaudeApp INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (ClaudeApp)new Object();
            a = ncq.F(2, (jta)new lrc((byte)13));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof ClaudeApp;
        }
        
        @Override
        public final int hashCode() {
            return -705092747;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)ClaudeApp.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "ClaudeApp";
        }
    }
    
    @jzk
    public static final class MinorBlocked implements LoggedInScreens
    {
        public static final MinorBlocked INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (MinorBlocked)new Object();
            a = ncq.F(2, (jta)new lrc((byte)14));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof MinorBlocked;
        }
        
        @Override
        public final int hashCode() {
            return -2079585947;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)MinorBlocked.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "MinorBlocked";
        }
    }
    
    @jzk
    public static final class Onboarding implements LoggedInScreens
    {
        public static final Onboarding INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (Onboarding)new Object();
            a = ncq.F(2, (jta)new lrc((byte)15));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof Onboarding;
        }
        
        @Override
        public final int hashCode() {
            return -1421232503;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)Onboarding.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "Onboarding";
        }
    }
}
