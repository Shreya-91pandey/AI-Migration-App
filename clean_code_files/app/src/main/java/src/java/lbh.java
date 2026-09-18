import java.util.Locale;
import android.os.LocaleList;
import android.graphics.drawable.Icon;
import android.app.RemoteAction;
import java.util.ArrayList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.content.Context;

public final class lbh
{
    public final hc7 a;
    public final Context b;
    public final upk c;
    public final jpd d;
    public final cof e;
    public TextClassifier f;
    public final ksg g;
    public final Object h;
    
    public lbh(final hc7 a, final Context b, final upk c, final jpd d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new cof();
        this.g = o50.Q((Object)null);
        this.h = new Object();
    }
    
    public final Object a(CharSequence value, long y, TextClassifier w, h07 o) {
        Label_0059: {
            if (o instanceof ibh) {
                final ibh ibh = (ibh)o;
                final int b = ibh.B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    ibh.B = b + Integer.MIN_VALUE;
                    o = ibh;
                    break Label_0059;
                }
            }
            o = new ibh(this, (h07)o);
        }
        final Object z = ((ibh)o).z;
        final int b2 = ((ibh)o).B;
        final ksg g = this.g;
        final lqo a = lqo.a;
        final cof e = this.e;
        final pc7 v = pc7.v;
        Label_0422: {
            Object o2;
            Object o3;
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2) {
                        w = ((ibh)o).w;
                        value = (CharSequence)((ibh)o).v;
                        vt4.g0(z);
                        break Label_0422;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    y = ((ibh)o).y;
                    value = (CharSequence)((ibh)o).x;
                    o2 = ((ibh)o).w;
                    o3 = ((ibh)o).v;
                    vt4.g0(z);
                }
            }
            else {
                vt4.g0(z);
                ((ibh)o).v = value;
                ((ibh)o).w = w;
                ((ibh)o).x = e;
                ((ibh)o).y = y;
                ((ibh)o).B = 1;
                if (e.c((f07)o) == v) {
                    return v;
                }
                final CharSequence charSequence = value;
                o2 = w;
                value = (CharSequence)e;
                o3 = charSequence;
            }
            try {
                final agn agn = (agn)g.getValue();
                Label_0332: {
                    if (agn != null) {
                        while (true) {
                            try {
                                if (dnn.c(y, agn.b()) && mlc.q(o3, (Object)agn.c())) {
                                    ((aof)value).g((Object)null);
                                    return a;
                                }
                                break Label_0332;
                            }
                            finally {}
                            final Throwable t;
                            o3 = t;
                            continue;
                        }
                    }
                }
                ((aof)value).g((Object)null);
                roe.p();
                value = (CharSequence)this.b((CharSequence)o3, y, roe.n((TextClassifier)o2, roe.m(roe.l(roe.k(dnn.g(y), dnn.f(y), (CharSequence)o3), this.c()))));
                ((ibh)o).v = value;
                ((ibh)o).w = e;
                ((ibh)o).x = null;
                ((ibh)o).B = 2;
                w = e;
                if (e.c((f07)o) == v) {
                    return v;
                }
                try {
                    g.setValue((Object)value);
                    return a;
                }
                finally {
                    ((aof)w).g((Object)null);
                }
            }
            finally {}
        }
        ((aof)value).g((Object)null);
    }
    
    public final agn b(final CharSequence charSequence, final long n, final TextClassification textClassification) {
        final int size = roe.o(textClassification).size();
        final ArrayList list = new ArrayList(size);
        for (int i = 0; i < size; ++i) {
            final Object value = roe.o(textClassification).get(i);
            final RemoteAction remoteAction = (RemoteAction)value;
            final Object o = null;
            RemoteAction remoteAction2 = (RemoteAction)value;
            if (i != 0) {
                if (roe.w(remoteAction)) {
                    remoteAction2 = (RemoteAction)value;
                }
                else {
                    remoteAction2 = null;
                }
            }
            final RemoteAction remoteAction3 = remoteAction2;
            Object loadDrawable = o;
            if (remoteAction3 != null) {
                final Icon icon = remoteAction3.getIcon();
                loadDrawable = o;
                if (icon != null) {
                    loadDrawable = icon.loadDrawable(this.b);
                }
            }
            list.add(loadDrawable);
        }
        return new agn(charSequence, n, textClassification, list);
    }
    
    public final LocaleList c() {
        final jpd d = this.d;
        if (d != null) {
            return ai0.w(d);
        }
        return new LocaleList(new Locale[] { zah.a.v().a().a });
    }
    
    public final Object d(final CharSequence charSequence, final long n, final m6n m6n) {
        if (charSequence.length() != 0) {
            if (!dnn.d(n)) {
                return rhc.f0(this.a, (zta)new fh((Object)this, (Object)new jbh(n, (f07)null, this, charSequence), (f07)null, (byte)18), (f07)m6n);
            }
        }
        return lqo.a;
    }
    
    public final Object e(final CharSequence charSequence, final long n, final m6n m6n) {
        if (charSequence.length() != 0) {
            if (!dnn.d(n)) {
                return rhc.f0(this.a, (zta)new fh((Object)this, (Object)new kbh(n, (f07)null, this, charSequence), (f07)null, (byte)18), (f07)m6n);
            }
        }
        return null;
    }
}
