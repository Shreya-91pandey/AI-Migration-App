import android.content.Intent;
import android.content.Context;

public class de extends rhc
{
    @Override
    public final Object K(final int n, Intent intent) {
        if (n != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
    
    public Intent g0(final Context context, final String type) {
        final Intent setType = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(type);
        setType.getClass();
        return setType;
    }
}
