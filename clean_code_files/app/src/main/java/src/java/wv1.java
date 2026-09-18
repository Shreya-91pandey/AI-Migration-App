import java.io.Serializable;

public abstract class wv1 implements f07, qc7, Serializable
{
    private final f07<Object> completion;
    
    public wv1(final f07 completion) {
        this.completion = completion;
    }
    
    public f07<lqo> create(final f07<?> f07) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
    
    public f07<lqo> create(final Object o, final f07<?> f07) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
    
    @Override
    public qc7 getCallerFrame() {
        final f07<Object> completion = this.completion;
        if (completion instanceof qc7) {
            return (qc7)completion;
        }
        return null;
    }
    
    public final f07<Object> getCompletion() {
        return this.completion;
    }
    
    public StackTraceElement getStackTraceElement() {
        return c6r.g(this);
    }
    
    public Object invokeSuspend(final Object o) {
        vt4.g0(o);
        return o;
    }
    
    public void releaseIntercepted() {
    }
    
    @Override
    public final void resumeWith(Object o) {
        f07<Object> completion = this;
        do {
            final wv1 wv1 = (wv1)completion;
            completion = wv1.completion;
            ((wv1)completion).getClass();
            try {
                final Object invokeSuspend = wv1.invokeSuspend(o);
                final pc7 v = pc7.v;
                o = invokeSuspend;
                if (invokeSuspend == v) {
                    return;
                }
            }
            finally {
                final Throwable t;
                o = new jpj(t);
            }
            wv1.releaseIntercepted();
        } while (completion instanceof wv1);
        completion.resumeWith(o);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Continuation at ");
        Object o;
        if ((o = this.getStackTraceElement()) == null) {
            o = this.getClass().getName();
        }
        sb.append(o);
        return sb.toString();
    }
}
