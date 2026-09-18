public final class rig extends k8e
{
    public final k2j e;
    
    public rig(final k2j e) {
        this.e = e;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof rig) {
                if (this.e.equals(((rig)o).e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.e.hashCode();
    }
    
    public final k2j u() {
        return this.e;
    }
}
