public final class qkf implements fp6
{
    @Override
    public final boolean equals(final Object o) {
        return this == o || o instanceof qkf;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(1) + Integer.hashCode(4) * 31;
    }
    
    @Override
    public final String toString() {
        return "MultipleConnection(numOfReaders=4, numOfWriters=1)";
    }
}
