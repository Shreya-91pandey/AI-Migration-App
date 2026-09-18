import java.lang.annotation.Annotation;
import com.anthropic.claude.api.experience.RemoteAction;
import com.anthropic.claude.api.experience.RefreshCacheAction;
import com.anthropic.claude.api.experience.OpenLinkAction;
import com.anthropic.claude.api.experience.OpenAuthenticatedWebviewAction;
import com.anthropic.claude.api.experience.NewChatAction;
import com.anthropic.claude.api.experience.ExperienceClientAction;
import kotlinx.serialization.KSerializer;

public final class nx9
{
    public static final nx9 a;
    
    static {
        a = (nx9)new Object();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.experience.ExperienceClientAction", v4j.a((Class)ExperienceClientAction.class), new rtc[] { (rtc)v4j.a((Class)NewChatAction.class), (rtc)v4j.a((Class)OpenAuthenticatedWebviewAction.class), (rtc)v4j.a((Class)OpenLinkAction.class), (rtc)v4j.a((Class)RefreshCacheAction.class), (rtc)v4j.a((Class)RemoteAction.class) }, new KSerializer[] { (KSerializer)huf.a, (KSerializer)ccg.a, (KSerializer)bdg.a, (KSerializer)p5j.a, (KSerializer)j8j.a }, new Annotation[] { (Annotation)new fz2((byte)4) });
    }
}
