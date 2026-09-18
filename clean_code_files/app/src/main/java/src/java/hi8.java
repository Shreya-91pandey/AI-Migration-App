public interface hi8
{
    default di8 f() {
        final di8 z = vzq.z;
        if (z != null) {
            return z;
        }
        throw new RuntimeException("No global Di: call startDi { } first", (Throwable)null);
    }
}
