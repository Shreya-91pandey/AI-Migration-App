public final class jtl implements atl
{
    @Override
    public final g90 a(etl l, final k2j k2j, final qzc qzc, final xc8 xc8) {
        final vrl vrl = (vrl)l.c.getValue();
        if (vrl != null) {
            final vrl g = vrl.G;
            if (g != null) {
                l = g.l();
            }
            else {
                l = null;
            }
            if (l != null) {
                final vrl vrl2 = (vrl)l.c.getValue();
                if (vrl2 != null) {
                    return vrl2.F;
                }
                en9.s("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
            }
            return null;
        }
        en9.s("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
        return null;
    }
}
