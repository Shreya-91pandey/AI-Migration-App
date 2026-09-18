import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

public final class r69 implements DefaultLifecycleObserver
{
    public final vad v;
    
    public r69(final EmojiCompatInitializer emojiCompatInitializer, final vad v) {
        this.v = v;
    }
    
    public final void onResume(final gbd gbd) {
        Handler a;
        if (Build$VERSION.SDK_INT >= 28) {
            a = sm6.a(Looper.getMainLooper());
        }
        else {
            a = new Handler(Looper.getMainLooper());
        }
        a.postDelayed((Runnable)new v69((byte)0), 500L);
        this.v.d((fbd)this);
    }
}
