import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class occ extends InputConnectionWrapper
{
    public final pcc a;
    
    public occ(final InputConnection inputConnection, final pcc a) {
        this.a = a;
        super(inputConnection, false);
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
        return this.a.a(xa9.P(inputContentInfo), n, bundle) || super.commitContent(inputContentInfo, n, bundle);
    }
}
