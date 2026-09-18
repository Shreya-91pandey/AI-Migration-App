public final class pad
{
    public static rad a(final tad tad) {
        final int ordinal = tad.ordinal();
        if (ordinal == 2) {
            return rad.ON_DESTROY;
        }
        if (ordinal == 3) {
            return rad.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return rad.ON_PAUSE;
    }
    
    public static rad b(final tad tad) {
        final int ordinal = tad.ordinal();
        if (ordinal == 1) {
            return rad.ON_CREATE;
        }
        if (ordinal == 2) {
            return rad.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return rad.ON_RESUME;
    }
}
