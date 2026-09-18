package com.anthropic.claude.app.main.loggedout;

import kotlinx.serialization.KSerializer;

@jzk
public interface LoggedOutAppDestination extends vqd
{
    public static final a Companion = a.a;
    
    default int a() {
        return 4;
    }
    
    @jzk
    public static final class LoginApp implements LoggedOutAppDestination
    {
        public static final LoginApp INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (LoginApp)new Object();
            a = ncq.F(2, (jta)new lrc((byte)16));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof LoginApp;
        }
        
        @Override
        public final int hashCode() {
            return -2008847818;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)LoginApp.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "LoginApp";
        }
    }
}
