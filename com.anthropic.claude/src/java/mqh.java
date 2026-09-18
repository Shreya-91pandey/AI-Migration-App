import java.nio.channels.spi.AbstractInterruptibleChannel;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;
import java.io.File;
import java.util.HashMap;

public final class mqh
{
    public static final HashMap e;
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;
    
    static {
        e = new HashMap();
    }
    
    public mqh(final String s, File value, final boolean a) {
        this.a = a;
        if (value != null) {
            value = new File(value, s.concat(".lck"));
        }
        else {
            value = null;
        }
        this.b = value;
        final HashMap e = mqh.e;
        final HashMap hashMap;
        monitorenter(hashMap = e);
        Label_0102: {
            try {
                if ((value = (File)e.get((Object)s)) == null) {
                    value = (File)new ReentrantLock();
                    e.put((Object)s, (Object)value);
                }
            }
            finally {
                break Label_0102;
            }
            final Lock c = (Lock)value;
            monitorexit(hashMap);
            this.c = c;
            return;
        }
        monitorexit(hashMap);
    }
    
    public final void a(final boolean b) {
        this.c.lock();
        if (b) {
            final File b2 = this.b;
            if (b2 == null) {
                throw new IOException("No lock directory was provided.");
            }
            Label_0080: {
                try {
                    final File parentFile = b2.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                }
                catch (final IOException ex) {
                    break Label_0080;
                }
                final FileChannel channel = new FileOutputStream(b2).getChannel();
                channel.lock();
                this.d = channel;
                return;
            }
            this.d = null;
            final IOException ex;
            Log.w("SupportSQLiteLock", "Unable to grab file lock.", (Throwable)ex);
        }
    }
    
    public final void b() {
        while (true) {
            try {
                final FileChannel d = this.d;
                if (d != null) {
                    ((AbstractInterruptibleChannel)d).close();
                }
                this.c.unlock();
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
}
