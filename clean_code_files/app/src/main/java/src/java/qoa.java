public abstract class qoa
{
    public static final float[] a;
    public static volatile wcm b;
    public static final Object[] c;
    
    static {
        a = new float[] { 8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f };
        qoa.b = new wcm(0);
        final Object[] c2 = new Object[0];
        synchronized (c = c2) {
            qoa.b.c(115, (Object)new roa(new float[] { 8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f }, new float[] { 9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f }));
            qoa.b.c(130, (Object)new roa(new float[] { 8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f }, new float[] { 10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f }));
            qoa.b.c(150, (Object)new roa(new float[] { 8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f }, new float[] { 12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f }));
            qoa.b.c(180, (Object)new roa(new float[] { 8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f }, new float[] { 14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f }));
            qoa.b.c(200, (Object)new roa(new float[] { 8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f }, new float[] { 16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f }));
            monitorexit(c2);
            if (qoa.b.b(0) / 100.0f - 0.01f > 1.03f) {
                return;
            }
            iac.b("You should only apply non-linear scaling to font scales > 1");
        }
    }
    
    public static poa a(final float n) {
        final float[] a = qoa.a;
        if (n < 1.03f) {
            return null;
        }
        final wcm b = qoa.b;
        final int n2 = (int)(n * 100.0f);
        b.getClass();
        final poa poa = (poa)k1r.e(b, n2);
        if (poa != null) {
            return poa;
        }
        final wcm b2 = qoa.b;
        final int o = o50.o(b2.x, n2, b2.v);
        if (o >= 0) {
            return (poa)qoa.b.d(o);
        }
        final int n3 = -(o + 1);
        final int n4 = n3 - 1;
        final int x = qoa.b.x;
        int i = 0;
        if (n3 >= x) {
            final roa roa = new roa(new float[] { 1.0f }, new float[] { n });
            b(n, roa);
            return roa;
        }
        poa poa2;
        float n5;
        if (n4 < 0) {
            poa2 = new roa(a, a);
            n5 = 1.0f;
        }
        else {
            n5 = qoa.b.b(n4) / 100.0f;
            poa2 = (poa)qoa.b.d(n4);
        }
        final float f = l3r.f(0.0f, 1.0f, n5, qoa.b.b(n3) / 100.0f, n);
        final poa poa3 = (poa)qoa.b.d(n3);
        final float[] array = new float[9];
        while (i < 9) {
            final float n6 = a[i];
            array[i] = l3r.i(poa2.b(n6), poa3.b(n6), f);
            ++i;
        }
        final roa roa2 = new roa(a, array);
        b(n, roa2);
        return roa2;
    }
    
    public static void b(final float n, final roa roa) {
        final Object[] c = qoa.c;
        synchronized (c) {
            final wcm a = qoa.b.a();
            a.c((int)(n * 100.0f), (Object)roa);
            qoa.b = a;
        }
    }
}
