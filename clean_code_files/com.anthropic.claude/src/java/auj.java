public final class auj implements buj
{
    @Override
    public final boolean equals(final Object o) {
        return this == o || o instanceof auj;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(0.08f);
    }
}
