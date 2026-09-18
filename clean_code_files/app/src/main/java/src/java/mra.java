import android.app.Activity;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater$Factory2;

public final class mra implements LayoutInflater$Factory2
{
    public final vra v;
    
    public mra(final vra v) {
        this.v = v;
    }
    
    public final View onCreateView(final View view, String attributeValue, Context y, final AttributeSet set) {
        final boolean equals = lra.class.getName().equals((Object)attributeValue);
        final vra v = this.v;
        if (equals) {
            return (View)new lra(y, set, v);
        }
        if ("fragment".equals((Object)attributeValue)) {
            attributeValue = set.getAttributeValue((String)null, "class");
            final TypedArray obtainStyledAttributes = y.obtainStyledAttributes(set, zni.a);
            int id = 0;
            String string;
            if ((string = attributeValue) == null) {
                string = obtainStyledAttributes.getString(0);
            }
            final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            final String string2 = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (string != null) {
                final ClassLoader classLoader = y.getClassLoader();
                boolean assignable;
                try {
                    assignable = hra.class.isAssignableFrom(pra.b(string, classLoader));
                }
                catch (final ClassNotFoundException ex) {
                    assignable = false;
                }
                if (assignable) {
                    if (view != null) {
                        id = view.getId();
                    }
                    if (id == -1 && resourceId == -1 && string2 == null) {
                        final String positionDescription = set.getPositionDescription();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(positionDescription);
                        sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                        sb.append(string);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    hra c;
                    if (resourceId != -1) {
                        c = v.C(resourceId);
                    }
                    else {
                        c = null;
                    }
                    hra d = c;
                    if (c == null) {
                        d = c;
                        if (string2 != null) {
                            d = v.D(string2);
                        }
                    }
                    hra c2;
                    if ((c2 = d) == null) {
                        c2 = d;
                        if (id != -1) {
                            c2 = v.C(id);
                        }
                    }
                    hra hra;
                    asa asa;
                    if (c2 == null) {
                        final pra g = v.G();
                        y.getClassLoader();
                        final hra a = g.a(string);
                        a.I = true;
                        int s;
                        if (resourceId != 0) {
                            s = resourceId;
                        }
                        else {
                            s = id;
                        }
                        a.S = s;
                        a.T = id;
                        a.U = string2;
                        a.J = true;
                        a.O = v;
                        final jra w = v.w;
                        a.P = w;
                        final Context y2 = w.y;
                        a.Z = true;
                        Activity x;
                        if (w == null) {
                            x = null;
                        }
                        else {
                            x = w.x;
                        }
                        if (x != null) {
                            a.Z = true;
                        }
                        final asa a2 = v.a(a);
                        hra = a;
                        asa = a2;
                        if (vra.I(2)) {
                            a.toString();
                            Integer.toHexString(resourceId);
                            hra = a;
                            asa = a2;
                        }
                    }
                    else {
                        if (c2.J) {
                            final String positionDescription2 = set.getPositionDescription();
                            final String hexString = Integer.toHexString(resourceId);
                            final String hexString2 = Integer.toHexString(id);
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(positionDescription2);
                            sb2.append(": Duplicate id 0x");
                            sb2.append(hexString);
                            sb2.append(", tag ");
                            sb2.append(string2);
                            sb2.append(", or parent id 0x");
                            sb2.append(hexString2);
                            sb2.append(" with another fragment for ");
                            sb2.append(string);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        c2.J = true;
                        c2.O = v;
                        final jra w2 = v.w;
                        c2.P = w2;
                        y = w2.y;
                        c2.Z = true;
                        Activity x2;
                        if (w2 == null) {
                            x2 = null;
                        }
                        else {
                            x2 = w2.x;
                        }
                        if (x2 != null) {
                            c2.Z = true;
                        }
                        final asa h = v.h(c2);
                        hra = c2;
                        asa = h;
                        if (vra.I(2)) {
                            c2.toString();
                            Integer.toHexString(resourceId);
                            asa = h;
                            hra = c2;
                        }
                    }
                    final ViewGroup a3 = (ViewGroup)view;
                    csa.d(hra, a3);
                    hra.a0 = a3;
                    asa.k();
                    asa.i();
                    en9.q(hia.k("Fragment ", string, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
