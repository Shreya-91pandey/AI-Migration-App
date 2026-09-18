public final class sdc
{
    public final boolean a;
    public final boolean b;
    
    public sdc(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sdc)) {
            return false;
        }
        final sdc sdc = (sdc)o;
        return this.a == sdc.a && this.b == sdc.b;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.b) + Boolean.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return rua.j("InputTextSuggestionState(isCommittedByInputMethodEditor=", ", suggestionSelected=", ")", this.a, this.b);
    }
}
