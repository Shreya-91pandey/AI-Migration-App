public final class q9k implements zta
{
    public static final q9k w;
    public static final q9k x;
    public final byte v;
    
    public final Object d(final Object o, final Object o2) {
        switch (this.v) {
            default: {
                final t3 t3 = (t3)o;
                final t3 t4 = (t3)o2;
                String s;
                if (t3 == null || (s = t3.a) == null) {
                    s = t4.a;
                }
                aua aua;
                if (t3 == null || (aua = t3.b) == null) {
                    aua = t4.b;
                }
                return new t3(s, aua);
            }
            case 0: {
                final p8k p8k = (p8k)o;
                final long a = ((j86)o2).a;
                Object o3;
                if (a == 16L) {
                    o3 = Boolean.FALSE;
                }
                else {
                    o3 = t08.o0(a);
                }
                return o3;
            }
        }
    }
}
