import android.app.Activity;
import java.util.Map;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map$Entry;
import android.view.ViewGroup;
import android.view.View$OnLayoutChangeListener;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.content.res.Resources$Theme;
import android.content.Context;
import android.util.TypedValue;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.core.telemetry.ClaudeRegionUnavailableException;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.List;
import com.anthropic.claude.mainactivity.MainActivity;

public class kce
{
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    
    public kce(final MainActivity b) {
        this.b = b;
        this.f = new oyl((byte)2);
    }
    
    public kce(final og0 b, final xc8 d, final tna e, final mnn c, final List f, final boolean a) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public kce(final shb b, final fz6 c, final rn0 d, final boolean a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new Object();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashSet();
        this.a = a;
        x90.x(c.v).U0((lta)new p8a((Object)this, (byte)15));
    }
    
    public static zjj a(final Integer n, final String s, final Throwable t) {
        String o;
        if (n != null) {
            o = oz1.o(s, ".", ((Number)n).intValue());
        }
        else {
            o = s;
        }
        if (t == null || !t3r.i(t)) {
            if (!s.equals("WebViewHttpError")) {
                if (afe.a(n, s)) {
                    return new zjj("network", o);
                }
                if (t instanceof ClaudeRegionUnavailableException) {
                    return new zjj(t);
                }
                if (t != null) {
                    return new zjj(bk0.f(t), o);
                }
                return new zjj("client_error", o);
            }
        }
        return new zjj("server_error", o);
    }
    
    public void b(final ParsedContentBlockId parsedContentBlockId, final zjj zjj, final jta jta) {
        final Object e;
        monitorenter(e = this.e);
        Label_0117: {
            LinkedHashMap linkedHashMap = null;
            Label_0070: {
                try {
                    final jce jce = (jce)jta.a();
                    linkedHashMap = (LinkedHashMap)this.f;
                    if (jce == null) {
                        break Label_0070;
                    }
                    if (((AbstractMap)linkedHashMap).containsKey((Object)parsedContentBlockId)) {
                        ((Map)this.g).put((Object)parsedContentBlockId, (Object)jce);
                    }
                }
                finally {
                    break Label_0117;
                }
                monitorexit(e);
                return;
            }
            final Throwable t;
            final thb thb = (thb)((AbstractMap)linkedHashMap).remove((Object)t);
            thb thb2;
            if (thb != null) {
                ((AbstractMap)this.g).remove((Object)t);
                thb2 = thb;
            }
            else {
                thb2 = null;
            }
            monitorexit(e);
            if (thb2 == null) {
                return;
            }
            thb2.a((dkj)zjj);
            return;
        }
        monitorexit(e);
    }
    
    public void c() {
        final TypedValue typedValue = new TypedValue();
        final MainActivity mainActivity = (MainActivity)this.b;
        final Resources$Theme theme = ((Context)mainActivity).getTheme();
        if (theme.resolveAttribute(2130969078, typedValue, true)) {
            this.c = typedValue.resourceId;
            this.d = typedValue.data;
        }
        if (theme.resolveAttribute(2130969076, typedValue, true)) {
            this.e = gar.f((Context)mainActivity, typedValue.resourceId);
        }
        if (theme.resolveAttribute(2130968982, typedValue, true)) {
            this.a = (typedValue.resourceId == 2131165345);
        }
        if (theme.resolveAttribute(2130968947, typedValue, true)) {
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                ((Activity)mainActivity).setTheme(resourceId);
            }
        }
    }
    
    public void d(final qzc h) {
        final uy7 uy7 = (uy7)this.g;
        uy7 g = null;
        Label_0092: {
            if (uy7 != null && h == this.h) {
                g = uy7;
                if (!uy7.e()) {
                    break Label_0092;
                }
            }
            this.h = h;
            g = new uy7((og0)this.b, (xc8)this.d, (tna)this.e, k8e.F((mnn)this.c, h), (List)this.f, this.a);
        }
        this.g = g;
    }
    
    public void e(final ParsedContentBlockId parsedContentBlockId) {
        final Object e = this.e;
        synchronized (e) {
            ((AbstractMap)this.g).remove((Object)parsedContentBlockId);
            final thb thb = (thb)((AbstractMap)this.f).remove((Object)parsedContentBlockId);
            monitorexit(e);
            if (thb != null) {
                thb.a((dkj)akj.a);
            }
        }
    }
    
    public void f(final e0e f) {
        this.f = f;
        final View viewById = ((Activity)this.b).findViewById(16908290);
        viewById.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ufm(this, viewById));
    }
    
    public void g(final e0e g) {
        this.g = g;
        final MainActivity mainActivity = (MainActivity)this.b;
        final vre vre = new vre(mainActivity);
        final Integer n = (Integer)this.c;
        final Integer n2 = (Integer)this.d;
        final ViewGroup p = vre.p();
        if (n != null && n != 0) {
            ((View)p).setBackgroundResource((int)n);
        }
        else if (n2 != null) {
            ((View)p).setBackgroundColor((int)n2);
        }
        else {
            ((View)p).setBackground(((Activity)mainActivity).getWindow().getDecorView().getBackground());
        }
        final Drawable drawable = (Drawable)this.e;
        if (drawable != null) {
            final ImageView imageView = (ImageView)((View)p).findViewById(2131297077);
            float n4;
            if (this.a) {
                final Drawable f = gar.f(((View)imageView).getContext(), 2131231275);
                final float n3 = n4 = ((View)imageView).getResources().getDimension(2131165345) * 0.6666667f;
                if (f != null) {
                    ((View)imageView).setBackground((Drawable)new d7e(f, n3));
                    n4 = n3;
                }
            }
            else {
                n4 = ((View)imageView).getResources().getDimension(2131165344) * 0.6666667f;
            }
            imageView.setImageDrawable((Drawable)new d7e(drawable, n4));
        }
        ((View)p).addOnLayoutChangeListener((View$OnLayoutChangeListener)new vfm(this, vre));
    }
    
    public void h(final ParsedContentBlockId parsedContentBlockId) {
        final Object e;
        monitorenter(e = this.e);
        Label_0100: {
            final yog yog2;
            Label_0074: {
                try {
                    final jce jce = (jce)((AbstractMap)this.g).remove((Object)parsedContentBlockId);
                    if (jce == null) {
                        monitorexit(e);
                        return;
                    }
                    final thb thb = (thb)((AbstractMap)this.f).remove((Object)parsedContentBlockId);
                    if (thb != null) {
                        final yog yog = new yog((Object)thb, (Object)jce.c());
                        break Label_0074;
                    }
                }
                finally {
                    break Label_0100;
                }
                yog2 = null;
            }
            monitorexit(e);
            if (yog2 == null) {
                return;
            }
            ((thb)yog2.v).a((dkj)yog2.w);
            return;
        }
        monitorexit(e);
    }
    
    public void i(final lta lta) {
        final Object e;
        monitorenter(e = this.e);
        Label_0156: {
            LinkedHashMap linkedHashMap2;
            try {
                final LinkedHashMap linkedHashMap = (LinkedHashMap)this.g;
                linkedHashMap2 = new LinkedHashMap();
                for (final Map$Entry map$Entry : linkedHashMap.entrySet()) {
                    if (lta.b(map$Entry.getValue())) {
                        ((AbstractMap)linkedHashMap2).put(map$Entry.getKey(), map$Entry.getValue());
                    }
                }
            }
            finally {
                break Label_0156;
            }
            final List s1 = c86.s1((Iterable)linkedHashMap2.keySet());
            monitorexit(e);
            final Iterator iterator2 = ((Iterable)s1).iterator();
            while (iterator2.hasNext()) {
                this.h((ParsedContentBlockId)iterator2.next());
            }
            return;
        }
        monitorexit(e);
    }
}
