import android.view.inputmethod.InputMethodManager;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class ko1
{
    public final Object a;
    public Object b;
    
    public ko1() {
        this.a = new CopyOnWriteArraySet();
        this.b = new CopyOnWriteArraySet();
    }
    
    public ko1(final View a) {
        this.a = a;
    }
    
    public ko1(final ncq ncq) {
        this.a = new jo1(this, (byte)0);
        this.b = new io1(this, ncq);
    }
    
    public void a(final String s) {
        ((CopyOnWriteArraySet)this.a).add((Object)s);
        ((CopyOnWriteArraySet)this.b).remove((Object)s);
    }
    
    public boolean b() {
        return ((jo1)this.a).b && ((io1)this.b).b;
    }
    
    public void c() {
    }
    
    public abstract void d();
    
    public void e(final go1 go1) {
    }
    
    public void f() {
    }
    
    public InputMethodManager g() {
        InputMethodManager b;
        if ((b = (InputMethodManager)this.b) == null) {
            final Object systemService = ((View)this.a).getContext().getSystemService("input_method");
            systemService.getClass();
            b = (InputMethodManager)systemService;
            this.b = b;
        }
        return b;
    }
    
    public void h(final boolean b) {
        final CopyOnWriteArraySet set = (CopyOnWriteArraySet)this.b;
        final CopyOnWriteArraySet set2 = (CopyOnWriteArraySet)this.a;
        if (b) {
            set2.add((Object)"android.widget.ImageView");
            set.remove((Object)"android.widget.ImageView");
            return;
        }
        set.add((Object)"android.widget.ImageView");
        set2.remove((Object)"android.widget.ImageView");
    }
    
    public void i(final boolean b) {
        final CopyOnWriteArraySet set = (CopyOnWriteArraySet)this.b;
        final CopyOnWriteArraySet set2 = (CopyOnWriteArraySet)this.a;
        if (b) {
            set2.add((Object)"android.widget.TextView");
            set.remove((Object)"android.widget.TextView");
            return;
        }
        set.add((Object)"android.widget.TextView");
        set2.remove((Object)"android.widget.TextView");
    }
    
    public void j() {
    }
    
    public void k() {
    }
}
