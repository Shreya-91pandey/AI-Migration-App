import android.view.View;
import com.anthropic.claude.types.strings.ChatId;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.SoundEffectConstants;
import android.os.Build$VERSION;

public final class s8o implements zta
{
    public final byte v;
    public final Object w;
    
    public final Object d(final Object o, final Object o2) {
        final byte v = this.v;
        int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = 0;
        final String s = null;
        final String s2 = null;
        final String s3 = null;
        final String s4 = null;
        final Object w = this.w;
        switch (v) {
            default: {
                final int a = ((sla)o).a;
                final boolean booleanValue = (boolean)o2;
                final Integer c = jma.c(a);
                if (c != null) {
                    final int intValue = c;
                    int n5;
                    if (Build$VERSION.SDK_INT >= 31) {
                        n5 = ei0.a.a(intValue, booleanValue);
                    }
                    else {
                        n5 = SoundEffectConstants.getContantForFocusDirection(intValue);
                    }
                    ((View)w).playSoundEffect(n5);
                }
                return lqo.a;
            }
            case 3: {
                final ChatId chatId = (ChatId)o;
                String a2 = s4;
                if (chatId != null) {
                    a2 = chatId.a;
                }
                final lef lef = (lef)o2;
                final a9o a9o = (a9o)w;
                int n6 = n4;
                if (!a9o.l.a().v) {
                    if (a9o.v.c(a2, lef)) {
                        n6 = n4;
                    }
                    else {
                        n6 = 2131755111;
                    }
                }
                return n6;
            }
            case 2: {
                final ChatId chatId2 = (ChatId)o;
                String a3 = s;
                if (chatId2 != null) {
                    a3 = chatId2.a;
                }
                if (!((a9o)w).w.c(a3, (lef)o2)) {
                    n = 2131755211;
                }
                return n;
            }
            case 1: {
                final ChatId chatId3 = (ChatId)o;
                String a4 = s2;
                if (chatId3 != null) {
                    a4 = chatId3.a;
                }
                final lef lef2 = (lef)o2;
                final a9o a9o2 = (a9o)w;
                if (!(boolean)a9o2.k.g.getValue()) {
                    final int n7 = n2;
                    if (!a9o2.B.c(a4, lef2)) {
                        return n7;
                    }
                }
                return 2131755213;
            }
            case 0: {
                final ChatId chatId4 = (ChatId)o;
                String a5 = s3;
                if (chatId4 != null) {
                    a5 = chatId4.a;
                }
                final lef lef3 = (lef)o2;
                int n8 = n3;
                if (!((a9o)w).w.c(a5, lef3)) {
                    n8 = 2131755114;
                }
                return n8;
            }
        }
    }
}
