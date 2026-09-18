import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

public final class s7m extends uoo
{
    public final zmf e;
    
    public s7m(final zmf e) {
        this.e = e;
    }
    
    public final void v() {
        this.e.c();
        throw new SnapshotApplyConflictException();
    }
}
