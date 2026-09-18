import com.anthropic.claude.types.strings.AppSessionId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.types.strings.ProjectDocId;
import com.anthropic.claude.api.project.ProjectDoc;
import com.anthropic.claude.types.strings.FileId;
import com.anthropic.claude.api.skills.Skill;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import android.content.Context;

public final class hr0 implements lta
{
    public static final hr0 A;
    public static final hr0 B;
    public static final hr0 C;
    public static final hr0 D;
    public static final hr0 E;
    public static final hr0 F;
    public static final hr0 G;
    public static final hr0 H;
    public static final hr0 I;
    public static final hr0 J;
    public static final hr0 K;
    public static final hr0 L;
    public static final hr0 M;
    public static final hr0 N;
    public static final hr0 O;
    public static final hr0 P;
    public static final hr0 Q;
    public static final hr0 R;
    public static final hr0 w;
    public static final hr0 x;
    public static final hr0 y;
    public static final hr0 z;
    public final byte v;
    
    public final Object b(final Object o) {
        switch (this.v) {
            default: {
                final odk odk = (odk)o;
                return new m4b((Context)odk.d((Class)Context.class, (emi)null), (wo8)odk.d((Class)wo8.class, (emi)null));
            }
            case 28: {
                final odk odk2 = (odk)o;
                final Context context = (Context)odk2.d((Class)Context.class, (emi)null);
                final et0 et0 = (et0)odk2.d((Class)et0.class, (emi)null);
                final wo8 wo8 = (wo8)odk2.d((Class)wo8.class, (emi)null);
                return new ech(context, et0);
            }
            case 27: {
                final odk odk3 = (odk)o;
                final Context context2 = (Context)odk3.d((Class)Context.class, (emi)null);
                final et0 et2 = (et0)odk3.d((Class)et0.class, (emi)null);
                final wo8 wo9 = (wo8)odk3.d((Class)wo8.class, (emi)null);
                return new xec(context2, et2);
            }
            case 26: {
                return new ur7((xe8)((odk)o).d((Class)xe8.class, (emi)null));
            }
            case 25: {
                final odk odk4 = (odk)o;
                return new lu((zil)odk4.d((Class)zil.class, (emi)null), (qod)odk4.d((Class)qod.class, (emi)null), (wo8)odk4.d((Class)wo8.class, (emi)null));
            }
            case 24: {
                final odk odk5 = (odk)o;
                return new u9((Context)odk5.d((Class)Context.class, (emi)null), (s3p)odk5.d((Class)s3p.class, (emi)null), (ep0)odk5.d((Class)ep0.class, (emi)null), (r6)odk5.d((Class)r6.class, (emi)null), (j6)odk5.d((Class)j6.class, (emi)null), (pgg)odk5.d((Class)pgg.class, (emi)null));
            }
            case 23: {
                final odk odk6 = (odk)o;
                return new p9((ep0)odk6.d((Class)ep0.class, (emi)null), (st4)odk6.d((Class)st4.class, (emi)null));
            }
            case 22: {
                final odk odk7 = (odk)o;
                return new r6();
            }
            case 21: {
                final i3c i3c = (i3c)o;
                return null;
            }
            case 20: {
                return new OrganizationId(((s3p)((odk)o).d((Class)s3p.class, (emi)null)).d);
            }
            case 19: {
                return new AccountId(((s3p)((odk)o).d((Class)s3p.class, (emi)null)).c);
            }
            case 18: {
                return new MessageId(((afa)o).d());
            }
            case 17: {
                final dq4 dq4 = (dq4)o;
                return null;
            }
            case 16: {
                final dq4 dq5 = (dq4)o;
                return null;
            }
            case 15: {
                return ((Skill)o).a;
            }
            case 14: {
                j86 j86;
                if (mlc.q(o, (Object)Boolean.FALSE)) {
                    j86 = new j86(j86.h);
                }
                else {
                    o.getClass();
                    j86 = new j86(t08.c((int)o));
                }
                return j86;
            }
            case 13: {
                return FileId.a(((nyh)o).a().a());
            }
            case 12: {
                return ProjectDocId.a(((ProjectDoc)o).b());
            }
            case 11: {
                return new ProjectId(((Project)o).o());
            }
            case 10: {
                return new ChatId(((ChatConversationWithProjectReference)o).a);
            }
            case 9: {
                return new AppSessionId(((u88)((odk)o).d((Class)u88.class, (emi)null)).a().a());
            }
            case 8: {
                final String a = ((OrganizationId)o).a;
                return new v5a();
            }
            case 7: {
                return new we8(((xe8)((odk)o).d((Class)xe8.class, (emi)null)).a());
            }
            case 6: {
                final float[] a2 = ((l8e)o).a;
                return lqo.a;
            }
            case 5: {
                return new ChatId(((ChatConversationWithProjectReference)o).a);
            }
            case 4: {
                return new MessageId(((afa)o).d());
            }
            case 3: {
                final String a3 = ((OrganizationId)o).a;
                return new b5h();
            }
            case 2: {
                final String a4 = ((OrganizationId)o).a;
                return new cop();
            }
            case 1: {
                final String a5 = ((OrganizationId)o).a;
                return new pgp();
            }
            case 0: {
                final String a6 = ((OrganizationId)o).a;
                return new zfg();
            }
        }
    }
}
