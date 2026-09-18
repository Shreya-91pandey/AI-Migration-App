package com.agog.mathdisplay;

public interface MathDisplayLogger
{
    public static final Companion Companion = MathDisplayLogger.Companion.$$INSTANCE;
    
    void warn(final String p0);
    
    public static final class Companion
    {
        static final Companion $$INSTANCE;
        private static volatile MathDisplayLogger instance;
        
        static {
            $$INSTANCE = new Companion();
        }
        
        private Companion() {
        }
        
        public final void set(final MathDisplayLogger instance) {
            Companion.instance = instance;
        }
        
        public final void warn$mathdisplaylib(final String s) {
            final MathDisplayLogger instance = Companion.instance;
            if (instance != null) {
                instance.warn(s);
            }
        }
    }
}
