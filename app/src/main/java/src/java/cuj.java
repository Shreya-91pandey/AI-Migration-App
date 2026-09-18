public final class cuj implements duj
{
    @Override
    public final boolean equals(final Object o) {
        return this == o || o instanceof cuj;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(0.1f);
    }
}
