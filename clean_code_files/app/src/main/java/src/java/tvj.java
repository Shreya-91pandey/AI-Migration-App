import java.util.concurrent.CancellationException;

public abstract class tvj implements efc
{
    public final fz6 v;
    
    public tvj(final wo8 wo8) {
        final fz6 a = k8e.A(wo8);
        this.v = a;
    }
    
    @Override
    public void onDestroy() {
        ien.i((oc7)this.v, (CancellationException)null);
    }
}
