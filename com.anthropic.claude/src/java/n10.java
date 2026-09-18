import java.lang.ref.Reference;
import java.util.List;
import kotlinx.serialization.modules.a;
import java.util.Locale;
import java.util.regex.Pattern;
import java.lang.ref.WeakReference;

public final class n10 extends qxc implements lta
{
    public static final n10 A;
    public static final n10 B;
    public static final n10 C;
    public static final n10 D;
    public static final n10 E;
    public static final n10 F;
    public static final n10 G;
    public static final n10 H;
    public static final n10 I;
    public static final n10 J;
    public static final n10 K;
    public static final n10 L;
    public static final n10 M;
    public static final n10 N;
    public static final n10 O;
    public static final n10 P;
    public static final n10 Q;
    public static final n10 R;
    public static final n10 S;
    public static final n10 T;
    public static final n10 U;
    public static final n10 V;
    public static final n10 W;
    public static final n10 X;
    public static final n10 Y;
    public static final n10 Z;
    public static final n10 a0;
    public static final n10 x;
    public static final n10 y;
    public static final n10 z;
    public final byte w;
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final lnk lnk = null;
        final Object o2 = null;
        boolean b = true;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                if (((Reference)o).get() != null) {
                    b = false;
                }
                return b;
            }
            case 28: {
                final wqc wqc = (wqc)o;
                wqc.c = true;
                wqc.d = true;
                return a;
            }
            case 27: {
                ((wqc)o).a = true;
                return a;
            }
            case 26: {
                cw8.r((cw8)o, j86.g, 0L, 0L, 0.0f, (tym)null, (he2)null, 126);
                return a;
            }
            case 25: {
                final cw8 cw8 = (cw8)o;
                return a;
            }
            case 24: {
                ((Number)o).intValue();
                return 0;
            }
            case 23: {
                final long a2 = ((chc)o).a;
                return new chc(0L);
            }
            case 22: {
                ((Number)o).intValue();
                return 0;
            }
            case 21: {
                final long a3 = ((chc)o).a;
                return new chc(0L);
            }
            case 20: {
                final fg0 fg0 = (fg0)o;
                return new jeo(ncq.h(fg0.a, fg0.b));
            }
            case 19: {
                final long a4 = ((jeo)o).a;
                return new fg0(Float.intBitsToFloat((int)(a4 >> 32)), Float.intBitsToFloat((int)(a4 & 0xFFFFFFFFL)));
            }
            case 18: {
                final fco fco = (fco)o;
                String name;
                if (py7.a[((Enum)fco).ordinal()] == 1) {
                    name = "B3SINGLE";
                }
                else {
                    name = ((Enum)fco).name();
                }
                return name;
            }
            case 17: {
                String substring;
                final String s = substring = (String)o;
                if (s.length() > 200) {
                    substring = s.substring(0, 200);
                }
                return substring;
            }
            case 16: {
                String substring2;
                final String s2 = substring2 = (String)o;
                if (kym.O0(s2, ':')) {
                    substring2 = s2.substring(0, kym.R0((CharSequence)s2));
                }
                return substring2;
            }
            case 15: {
                final String s3 = (String)o;
                final Pattern compile = Pattern.compile("[^a-z0-9_:./-]");
                compile.getClass();
                final String replaceAll = compile.matcher((CharSequence)s3).replaceAll("_");
                replaceAll.getClass();
                return replaceAll;
            }
            case 14: {
                final String s4 = (String)o;
                final ki3 ki3 = new ki3();
                final Character s5 = kym.S0(0, (CharSequence)s4);
                Object o3 = o2;
                if (s5 != null) {
                    o3 = o2;
                    if (ki3.j((char)s5)) {
                        o3 = s4;
                    }
                }
                return o3;
            }
            case 13: {
                final String s6 = (String)o;
                final Locale us = Locale.US;
                return oz1.r(us, s6, us);
            }
            case 12: {
                return new re0((tjc)o);
            }
            case 11: {
                return o;
            }
            case 9:
            case 10: {
                return a;
            }
            case 8: {
                final long a5 = j86.a(((j86)o).a, (u86)x86.x);
                return new hg0(j86.c(a5), j86.g(a5), j86.f(a5), j86.d(a5));
            }
            case 7: {
                final wqc wqc2 = (wqc)o;
                final a a6 = new a();
                a6.f((rtc)v4j.a((Class)Object.class), (lta)n10.D);
                wqc2.l = a6.a();
                return a;
            }
            case 6: {
                final List list = (List)o;
                return th0.a;
            }
            case 5: {
                final Boolean b2 = (Boolean)o;
                b2.booleanValue();
                return b2;
            }
            case 4: {
                final Boolean b3 = (Boolean)o;
                b3.booleanValue();
                return b3;
            }
            case 3: {
                final Boolean b4 = (Boolean)o;
                b4.booleanValue();
                return b4;
            }
            case 2: {
                final ee0 ee0 = (ee0)o;
                return null;
            }
            case 1: {
                return o;
            }
            case 0: {
                final deh deh = (deh)o;
                lnk lnk2 = lnk;
                if (deh instanceof lnk) {
                    lnk2 = (lnk)deh;
                }
                if (lnk2 != null) {
                    final wn9 y = lnk2.y;
                    if (y != null) {
                        ((stk)y.d).e((Object)wn9.h);
                    }
                }
                return a;
            }
        }
    }
}
