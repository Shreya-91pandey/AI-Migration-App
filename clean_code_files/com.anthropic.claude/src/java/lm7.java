import java.util.concurrent.Executor;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import android.os.CancellationSignal;
import android.content.Context;

public final class lm7
{
    public final Context a;
    
    public lm7(final Context a) {
        this.a = a;
    }
    
    public static Object a(final lm7 lm7, final z25 z25, final y6 y6) {
        final l13 l13 = new l13(1, ljq.K((f07)y6));
        l13.r();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        l13.v((lta)new jm7(cancellationSignal, (byte)0));
        final f03 f03 = new f03(l13);
        final e12 e12 = new e12((byte)1);
        final nm7 a = q5b.a(new q5b(lm7.a, '\0'), (Object)z25.a());
        if (a == null) {
            f03.a((Object)new ClearCredentialProviderConfigurationException());
        }
        else {
            a.onClearCredential(z25, cancellationSignal, (Executor)e12, (km7)f03);
        }
        final Object p3 = l13.p();
        if (p3 == pc7.v) {
            return p3;
        }
        return lqo.a;
    }
}
