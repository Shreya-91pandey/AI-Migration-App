import java.util.Arrays;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Iterator;
import kotlinx.serialization.SerializationException;
import com.anthropic.claude.api.Iso8601ParseException;
import java.time.format.DateTimeParseException;
import kotlinx.serialization.json.JsonElement;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.encoding.Decoder;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public class xd9 implements KSerializer
{
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public xd9(final Object b, final String s) {
        this.a = 1;
        this.b = b;
        this.c = r89.v;
        this.d = ncq.F(2, (jta)new nob((Object)s, (Object)this, (byte)21));
    }
    
    public xd9(final String s, final Object o, final Annotation[] array) {
        this.a = 1;
        this(o, s);
        this.c = iw0.E0((Object[])array);
    }
    
    public xd9(final String s, final Enum[] b) {
        this.a = 0;
        this.b = b;
        this.d = new l7n((jta)new jd0((Object)this, (Object)s, (byte)26));
    }
    
    public xd9(final String s, final Enum[] array, final rd9 c) {
        this.a = 0;
        this(s, array);
        this.c = c;
    }
    
    public xd9(final KSerializer b) {
        this.a = 2;
        this.b = b;
        final uv0 c = new uv0(b, (byte)0);
        this.c = c;
        this.d = c.c;
    }
    
    public lpl a() {
        return lpl.x;
    }
    
    public String b() {
        return ((KSerializer)this.b).getDescriptor().a();
    }
    
    public boolean c() {
        return true;
    }
    
    public void d(final String s, final String s2, final int n, final Exception ex, final boolean b) {
        final String c = v4j.a((Class)ex.getClass()).c();
        Object p5 = ex;
        if (b) {
            p5 = ien.P(0, (Throwable)ex);
        }
        final List a = adn.a;
        adn.f((Throwable)new SilentException(smk.q(n, "]", oz1.t("Dropping ", s, " ", s2, " entry at [")), (Throwable)p5), (String)null, this.a(), y5e.Z(new yog[] { new yog((Object)"error_class", (Object)c), new yog((Object)"outcome", (Object)"salvaged") }), (List)null, 50);
    }
    
    public final Object deserialize(Decoder decoder) {
    Label_0293:
        while (true) {
            String b = null;
            int n = 0;
            switch (this.a) {
                default: {
                    final r89 v = r89.v;
                    grc grc;
                    if (decoder instanceof grc) {
                        grc = (grc)decoder;
                    }
                    else {
                        grc = null;
                    }
                    Object o;
                    if (grc == null) {
                        o = ((k0)this.c).deserialize(decoder);
                    }
                    else {
                        b = this.b();
                        final JsonElement k = grc.k();
                        if (k instanceof JsonNull) {
                            o = v;
                        }
                        else if (!(k instanceof JsonArray)) {
                            final List a = adn.a;
                            adn.e(6, lmf.t("Expected JSON array of ", b, " but got ", v4j.a((Class)k.getClass()).c(), "; decoded as empty list"), (String)null, (Map)null);
                            final z08 z = z08.z;
                            try {
                                ri2.c.h(z, b, (String)null);
                            }
                            finally {
                                final tqd l = uqd.l;
                                o = v;
                            }
                        }
                        else {
                            final Iterable iterable = (Iterable)k;
                            final ArrayList list = new ArrayList();
                            final Iterator iterator = iterable.iterator();
                            n = 0;
                            decoder = (Decoder)this;
                            while (iterator.hasNext()) {
                                final Object next = iterator.next();
                                if (n < 0) {
                                    lq6.n0();
                                    throw null;
                                }
                                final JsonElement jsonElement = (JsonElement)next;
                                Object a2 = null;
                                Label_0383: {
                                    Label_0280: {
                                        try {
                                            a2 = grc.c().a((KSerializer)((xd9)decoder).b, jsonElement);
                                            break Label_0383;
                                        }
                                        catch (final Exception ex) {
                                            break Label_0280;
                                        }
                                        catch (final DateTimeParseException ex2) {
                                            if (!((xd9)decoder).c()) {
                                                ((xd9)decoder).d("undecodable", b, n, (Exception)ex2, true);
                                                a2 = null;
                                                break Label_0383;
                                            }
                                            throw ex2;
                                            final Exception ex;
                                            ((xd9)decoder).d("undecodable", b, n, ex, true);
                                            continue Label_0293;
                                        }
                                        catch (final Iso8601ParseException ex3) {
                                            final Exception ex4;
                                            if (!((xd9)decoder).c()) {
                                                ((xd9)decoder).d("undecodable", b, n, ex4, true);
                                                continue Label_0293;
                                            }
                                            throw ex4;
                                        }
                                        catch (final IllegalArgumentException ex5) {}
                                        catch (final SerializationException ex6) {}
                                    }
                                    final Exception ex7;
                                    ((xd9)decoder).d("invalid", b, n, ex7, true);
                                    continue Label_0293;
                                }
                                if (a2 != null) {
                                    list.add(a2);
                                }
                                ++n;
                            }
                            o = list;
                        }
                    }
                    return o;
                }
                case 1: {
                    final SerialDescriptor descriptor = this.getDescriptor();
                    final jl6 b2 = decoder.b(descriptor);
                    final int u = b2.u(this.getDescriptor());
                    if (u == -1) {
                        b2.i(descriptor);
                        return this.b;
                    }
                    throw new IllegalArgumentException(smk.p(u, "Unexpected index "));
                }
                case 0: {
                    final Enum[] array = (Enum[])this.b;
                    final int g = decoder.g(this.getDescriptor());
                    if (g >= 0 && g < array.length) {
                        return array[g];
                    }
                    final String a3 = this.getDescriptor().a();
                    final int length = array.length;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(g);
                    sb.append(" is not among valid ");
                    sb.append(a3);
                    sb.append(" enum values, values size is ");
                    sb.append(length);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            final Exception ex8;
            ((xd9)decoder).d("malformed", b, n, ex8, false);
            continue Label_0293;
        }
    }
    
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
            default: {
                return (SerialDescriptor)this.d;
            }
            case 1: {
                return (SerialDescriptor)((d2d)this.d).getValue();
            }
            case 0: {
                return (SerialDescriptor)((l7n)this.d).getValue();
            }
        }
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        switch (this.a) {
            default: {
                ((x76)this.c).serialize(encoder, (Object)o);
                return;
            }
            case 1: {
                final kl6 b = encoder.b(this.getDescriptor());
                this.getDescriptor();
                b.g();
                return;
            }
            case 0: {
                final Enum enum1 = (Enum)o;
                final Enum[] array = (Enum[])this.b;
                final int b2 = iw0.b1((Object[])array, (Object)enum1);
                if (b2 != -1) {
                    encoder.C(this.getDescriptor(), b2);
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)enum1);
                final String a = this.getDescriptor().a();
                final String string = Arrays.toString((Object[])array);
                string.getClass();
                sb.append(" is not a valid enum ");
                sb.append(a);
                sb.append(", must be one of ");
                sb.append(string);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder("kotlinx.serialization.internal.EnumSerializer<");
                sb.append(this.getDescriptor().a());
                sb.append('>');
                return sb.toString();
            }
        }
    }
}
