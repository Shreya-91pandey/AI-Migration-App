import android.view.View;
import android.os.Build$VERSION;
import android.content.Context;
import android.view.View$OnAttachStateChangeListener;
import android.content.ComponentCallbacks;
import androidx.compose.ui.platform.AndroidComposeView;

public final class k70 implements d6b
{
    public static boolean g = true;
    public final AndroidComposeView a;
    public final Object b;
    public rcp c;
    public boolean d;
    public jmq e;
    public final i70 f;
    
    public k70(final AndroidComposeView a) {
        this.a = a;
        this.b = new Object();
        final i70 f = new i70(this, (byte)0);
        this.f = f;
        if (((View)a).isAttachedToWindow()) {
            final Context context = ((View)a).getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks((ComponentCallbacks)f);
                this.d = true;
            }
        }
        ((View)a).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new j70(this, (byte)0));
    }
    
    @Override
    public final void a(final g6b g6b) {
        final Object b = this.b;
        synchronized (b) {
            if (!g6b.s) {
                g6b.s = true;
                g6b.b();
            }
        }
    }
    
    @Override
    public final jmq b() {
        jmq e;
        if ((e = this.e) == null) {
            e = new jmq((byte)4);
            this.e = e;
        }
        return e;
    }
    
    @Override
    public final g6b c() {
        final Object b;
        monitorenter(b = this.b);
        Label_0214: {
            p6b p6b = null;
            Label_0200: {
                try {
                    final AndroidComposeView a = this.a;
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT >= 29) {
                        d40.b(a);
                    }
                    if (sdk_INT >= 29) {
                        final n6b n6b = new n6b();
                        break Label_0200;
                    }
                }
                finally {
                    break Label_0214;
                }
                if (k70.g) {
                    try {
                        final l6b l6b = new l6b(this.a);
                    }
                    finally {
                        k70.g = false;
                        final AndroidComposeView a2 = this.a;
                        rcp c;
                        if ((c = this.c) == null) {
                            c = new rcp(((View)a2).getContext());
                            a2.addView((View)c, -1);
                            this.c = c;
                        }
                        p6b = new p6b((zv8)c);
                    }
                }
                else {
                    final AndroidComposeView a3 = this.a;
                    rcp c2;
                    if ((c2 = this.c) == null) {
                        c2 = new rcp(((View)a3).getContext());
                        a3.addView((View)c2, -1);
                        this.c = c2;
                    }
                    p6b = new p6b((zv8)c2);
                }
            }
            final g6b g6b = new g6b((i6b)p6b);
            monitorexit(b);
            return g6b;
        }
        monitorexit(b);
    }
}
