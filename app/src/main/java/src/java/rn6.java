import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import java.util.regex.Matcher;
import java.util.TimeZone;
import java.lang.annotation.Annotation;
import com.segment.analytics.kotlin.core.EventType;
import java.security.SecureRandom;
import java.util.regex.Pattern;

public final class rn6 extends qxc implements jta
{
    public static final rn6 A;
    public static final rn6 B;
    public static final rn6 C;
    public static final rn6 D;
    public static final rn6 E;
    public static final rn6 F;
    public static final rn6 G;
    public static final rn6 H;
    public static final rn6 I;
    public static final rn6 J;
    public static final rn6 K;
    public static final rn6 L;
    public static final rn6 x;
    public static final rn6 y;
    public static final rn6 z;
    public final byte w;
    
    @Override
    public final Object a() {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                String s = System.getProperty("os.version");
                final Pattern compile = Pattern.compile("android[0-9][0-9]");
                compile.getClass();
                s.getClass();
                final Matcher matcher = compile.matcher((CharSequence)s);
                matcher.getClass();
                final c8e i = t08.I(matcher, 0, (CharSequence)s);
                if (i != null) {
                    s = i.c();
                }
                else {
                    final Pattern compile2 = Pattern.compile("[0-9]+");
                    compile2.getClass();
                    final Matcher matcher2 = compile2.matcher((CharSequence)s);
                    matcher2.getClass();
                    final c8e j = t08.I(matcher2, 0, (CharSequence)s);
                    if (j != null) {
                        s = j.c();
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(System.getProperty("os.name"));
                sb.append('-');
                sb.append(s);
                final yog yog = new yog((Object)"os", (Object)sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(System.getProperty("java.vendor"));
                sb2.append('-');
                sb2.append(System.getProperty("java.version"));
                return y5e.Z(new yog[] { yog, new yog((Object)"interpreter", (Object)sb2.toString()), new yog((Object)"library", (Object)"analytics.kotlin"), new yog((Object)"library_version", (Object)"1.19.2") });
            }
            case 13: {
                return null;
            }
            case 12: {
                return new y7j((byte)18);
            }
            case 11: {
                return "Slow frames monitoring enabled.";
            }
            case 10: {
                return new SecureRandom();
            }
            case 9: {
                return "[ViewNetworkSettledMetric] Not all the initial resources were stopped for this view";
            }
            case 8: {
                final EventType[] values = EventType.values();
                final rd9 rd9 = new rd9("com.segment.analytics.kotlin.core.EventType", ((Enum[])values).length);
                for (int length = ((Enum[])values).length, k = 0, n = 0; k < length; ++k, ++n) {
                    final Enum enum1 = (Enum)values[k];
                    String name;
                    if ((name = (String)iw0.a1(n, (Object[])new String[] { "track", "screen", "alias", "identify", "group" })) == null) {
                        name = enum1.name();
                    }
                    ((PluginGeneratedSerialDescriptor)rd9).l(name, false);
                    final Annotation[] array = (Annotation[])iw0.a1(n, (Object[])new Annotation[][] { null, null, null, null, null });
                    if (array != null) {
                        for (int length2 = array.length, l = 0; l < length2; ++l) {
                            ((PluginGeneratedSerialDescriptor)rd9).m(array[l]);
                        }
                    }
                }
                return new xd9("com.segment.analytics.kotlin.core.EventType", (Enum[])values, rd9);
            }
            case 7: {
                return Boolean.TRUE;
            }
            case 6: {
                return null;
            }
            case 5: {
                return TimeZone.getDefault().getID();
            }
            case 4: {
                return Runtime.getRuntime().availableProcessors();
            }
            case 3: {
                String property;
                if ((property = System.getProperty("os.arch")) == null) {
                    property = "unknown";
                }
                return property;
            }
            case 2: {
                return a;
            }
            case 1: {
                return "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
            }
            case 0: {
                return a;
            }
        }
    }
}
