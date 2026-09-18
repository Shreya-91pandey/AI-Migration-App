import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import android.content.Context;

public final class u69 implements p69
{
    public final Context a;
    
    public u69(final Context a, final byte b) {
        switch (b) {
            default: {
                this.a = a.getApplicationContext();
                return;
            }
            case 1: {
                this.a = a;
            }
        }
    }
    
    @Override
    public void a(final jar jar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingDeque(), (ThreadFactory)new rm6("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute((Runnable)new n68((Object)this, (Object)jar, (Object)threadPoolExecutor, (byte)1));
    }
}
