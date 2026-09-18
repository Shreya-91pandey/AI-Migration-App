import android.os.BaseBundle;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class q69
{
    public static final Object j;
    public static volatile q69 k;
    public final ReentrantReadWriteLock a;
    public final fw0 b;
    public volatile byte c;
    public final Handler d;
    public final l69 e;
    public final p69 f;
    public final wab g;
    public final boolean h;
    public final r48 i;
    
    static {
        j = new Object();
    }
    
    public q69(final s69 s69) {
        final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
        this.a = a;
        this.c = 3;
        final p69 a2 = s69.a;
        this.f = a2;
        final boolean b = s69.b;
        this.h = b;
        this.i = s69.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new fw0(0);
        this.g = new wab((byte)16);
        final l69 e = new l69(this);
        this.e = e;
        a.writeLock().lock();
        if (!b) {
            try {
                this.c = 0;
            }
            finally {
                this.a.writeLock().unlock();
            }
        }
        a.writeLock().unlock();
        if (this.c() == 0) {
            try {
                a2.a(new k69(e));
            }
            finally {
                final Throwable t;
                this.g(t);
            }
        }
    }
    
    public static q69 a() {
        final Object j = q69.j;
        synchronized (j) {
            final q69 k = q69.k;
            lq6.v("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", k != null);
            return k;
        }
    }
    
    public static boolean d() {
        return q69.k != null;
    }
    
    public final int b(final int n, final CharSequence charSequence) {
        lq6.v("Not initialized yet", this.e());
        lq6.t((Object)charSequence, "charSequence cannot be null");
        return this.e.b.q(n, charSequence);
    }
    
    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        }
        finally {
            this.a.readLock().unlock();
        }
    }
    
    public final boolean e() {
        return this.c() == 1;
    }
    
    public final void f() {
        final boolean h = this.h;
        boolean b = true;
        if (!h) {
            b = false;
        }
        lq6.v("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", b);
        if (this.e()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            final l69 e = this.e;
            final q69 a = e.a;
            try {
                a.f.a(new k69(e));
            }
            finally {
                final Throwable t;
                a.g(t);
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void g(final Throwable t) {
        final ArrayList list = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            list.addAll((Collection)this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post((Runnable)new o69((List)list, this.c, t));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final CharSequence h(final int n, final int n2, final int n3, final CharSequence charSequence) {
        lq6.v("Not initialized yet", this.e());
        if (n < 0) {
            en9.s("start cannot be negative");
            return null;
        }
        if (n2 < 0) {
            en9.s("end cannot be negative");
            return null;
        }
        final boolean b = false;
        lq6.r("start should be <= than end", n <= n2);
        if (charSequence == null) {
            return null;
        }
        lq6.r("start should be < than charSequence length", n <= charSequence.length());
        lq6.r("end should be < than charSequence length", n2 <= charSequence.length());
        if (charSequence.length() != 0 && n != n2) {
            return this.e.b.z(charSequence, n, n2, n3 == 1 || b);
        }
        return charSequence;
    }
    
    public final void i(final n69 n69) {
        this.a.writeLock().lock();
        Label_0100: {
            Label_0087: {
                try {
                    if (this.c != 1) {
                        if (this.c != 2) {
                            this.b.add((Object)n69);
                            break Label_0087;
                        }
                    }
                }
                finally {
                    break Label_0100;
                }
                final n69 n70;
                this.d.post((Runnable)new o69(Arrays.asList((Object[])new n69[] { n70 }), this.c, null));
            }
            this.a.writeLock().unlock();
            return;
        }
        this.a.writeLock().unlock();
    }
    
    public final void j(final EditorInfo editorInfo) {
        if (this.e()) {
            if (editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                final l69 e = this.e;
                e.getClass();
                ((BaseBundle)editorInfo.extras).putInt("android.support.text.emoji.emojiCompat_metadataVersion", e.c.n());
                ((BaseBundle)editorInfo.extras).putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }
}
