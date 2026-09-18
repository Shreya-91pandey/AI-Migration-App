public final class q68 implements tfk
{
    public final r68 a;
    
    public q68(final r68 a) {
        this.a = a;
    }
    
    @Override
    public final float b(float floatValue) {
        if (Float.isNaN(floatValue)) {
            return 0.0f;
        }
        final r68 a = this.a;
        floatValue = ((Number)a.a.b((Object)floatValue)).floatValue();
        final ksg e = a.e;
        final boolean b = false;
        e.setValue((Object)(floatValue > 0.0f));
        final ksg f = a.f;
        boolean b2 = b;
        if (floatValue < 0.0f) {
            b2 = true;
        }
        f.setValue((Object)b2);
        return floatValue;
    }
}
