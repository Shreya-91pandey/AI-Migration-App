import com.anthropic.claude.api.account.UpdateAccountProfileRequest;
import com.anthropic.claude.api.account.AccountProfile;
import com.anthropic.claude.api.account.AvatarImageResponse;
import kotlinx.serialization.KSerializer;

public final class j8 implements i8
{
    public final vi0 a;
    
    public j8(final vi0 a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final okf okf, final f07 f07) {
        final lj0 lj0 = new lj0(2, "account_avatar_image");
        sbr.k(lj0, lq6.X((Object)okf));
        return this.a.a(lj0.b(), (KSerializer)AvatarImageResponse.Companion.serializer(), f07);
    }
    
    @Override
    public final Object b(final f07 f07) {
        return this.a.a(new lj0(1, "account_profile").b(), (KSerializer)AccountProfile.Companion.serializer(), f07);
    }
    
    @Override
    public final Object c(final f07 f07) {
        return this.a.a(new lj0(5, "account_avatar_image").b(), (KSerializer)mqo.b, f07);
    }
    
    @Override
    public final Object d(final UpdateAccountProfileRequest updateAccountProfileRequest, final f07 f07) {
        final lj0 lj0 = new lj0(3, "account_profile");
        lj0.d((Object)updateAccountProfileRequest, (KSerializer)UpdateAccountProfileRequest.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)AccountProfile.Companion.serializer(), f07);
    }
}
