public final class v8p implements u18
{
    @Override
    public final v18 a(final qam qam, final pfg pfg) {
        final String b = qam.b();
        if (b != null && rym.E0(b, "video/", false)) {
            return (v18)new w8p(qam.c(), pfg);
        }
        return null;
    }
}
