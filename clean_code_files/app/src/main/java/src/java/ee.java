import java.util.AbstractCollection;
import android.content.ClipData;
import android.net.Uri;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import android.content.Intent;
import android.content.Context;

public class ee extends rhc
{
    @Override
    public final Object K(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        Object v;
        final r89 r89 = (r89)(v = r89.v);
        if (intent != null) {
            final LinkedHashSet set = new LinkedHashSet();
            final Uri data = intent.getData();
            if (data != null) {
                ((AbstractCollection)set).add((Object)data);
            }
            final ClipData clipData = intent.getClipData();
            if (clipData == null && ((AbstractCollection)set).isEmpty()) {
                return r89;
            }
            if (clipData != null) {
                int itemCount;
                Uri uri;
                for (itemCount = clipData.getItemCount(), i = 0; i < itemCount; ++i) {
                    uri = clipData.getItemAt(i).getUri();
                    if (uri != null) {
                        ((AbstractCollection)set).add((Object)uri);
                    }
                }
            }
            v = new ArrayList((Collection)set);
        }
        return v;
    }
    
    public Intent g0(final Context context, final String type) {
        final Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(type).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        putExtra.getClass();
        return putExtra;
    }
}
