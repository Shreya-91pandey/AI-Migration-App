import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;

public final class b40 implements zl1
{
    public final AndroidComposeView a;
    public final em1 b;
    public final AutofillId c;
    
    public b40(final AndroidComposeView a, final em1 b) {
        this.a = a;
        this.b = b;
        ((View)a).setImportantForAutofill(1);
        final AutofillId autofillId = ((View)a).getAutofillId();
        if (autofillId != null) {
            this.c = autofillId;
            return;
        }
        throw ge9.x("Required value was null.");
    }
}
