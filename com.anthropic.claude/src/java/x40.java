import androidx.compose.ui.platform.AndroidComposeView;

public final class x40 extends ogf
{
    public final AndroidComposeView v;
    
    public x40(final AndroidComposeView v) {
        this.v = v;
    }
    
    public final hgf create() {
        return (hgf)new u40(this.v);
    }
    
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
}
