import java.lang.annotation.Annotation;
import com.anthropic.claude.api.experience.UnknownContent;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.experience.ChatInputBannerContent;
import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.api.experience.ChatTooltipContent;
import com.anthropic.claude.api.experience.SpotlightContent;
import com.anthropic.claude.api.experience.ExperienceContent;
import kotlinx.serialization.modules.a;

public final class qx9
{
    public static final qx9 a;
    public static final vee b;
    
    static {
        a = (qx9)new Object();
        final a a2 = new a();
        final tze tze = new tze(v4j.a((Class)ExperienceContent.class));
        tze.m(v4j.a((Class)SpotlightContent.class), SpotlightContent.Companion.serializer());
        tze.m(v4j.a((Class)ChatTooltipContent.class), ChatTooltipContent.Companion.serializer());
        tze.m(v4j.a((Class)BannerContent.class), BannerContent.Companion.serializer());
        tze.m(v4j.a((Class)ChatInputBannerContent.class), ChatInputBannerContent.Companion.serializer());
        t08.D(tze, "ExperienceContent", (lta)new yp7((byte)29));
        tze.b(a2);
        b = a2.a();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.api.experience.ExperienceContent", v4j.a((Class)ExperienceContent.class), new rtc[] { (rtc)v4j.a((Class)BannerContent.class), (rtc)v4j.a((Class)ChatInputBannerContent.class), (rtc)v4j.a((Class)ChatTooltipContent.class), (rtc)v4j.a((Class)SpotlightContent.class), (rtc)v4j.a((Class)UnknownContent.class) }, new KSerializer[] { (KSerializer)is1.a, (KSerializer)iy3.a, (KSerializer)an4.a, (KSerializer)tgm.a, (KSerializer)new xd9("com.anthropic.claude.api.experience.UnknownContent", UnknownContent.INSTANCE, new Annotation[] { (Annotation)new fz2((byte)5) }) }, new Annotation[] { (Annotation)new fz2((byte)5) });
    }
}
