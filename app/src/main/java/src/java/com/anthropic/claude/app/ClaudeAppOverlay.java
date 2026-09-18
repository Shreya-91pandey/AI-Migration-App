package com.anthropic.claude.app;

import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.artifact.frame.CodeArtifactViewerParams;
import com.anthropic.claude.analytics.events.UsageCreditsEvents$UsageCreditsSurface;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.OriginRelativePath;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;

@jzk
public interface ClaudeAppOverlay extends vqd
{
    public static final w1 Companion = w1.a;
    
    default int a() {
        return 4;
    }
    
    @jzk
    public static final class ArtifactFullScreen implements ClaudeAppOverlay
    {
        public static final l1 Companion;
        public static final d2d[] b;
        public final ArtifactFullScreenParams a = a;
        
        static {
            Companion = new l1();
            b = new d2d[] { ncq.F(2, (jta)new kt4((byte)13)) };
        }
        
        public ArtifactFullScreen(final ArtifactFullScreenParams a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof ArtifactFullScreen && mlc.q((Object)this.a, (Object)((ArtifactFullScreen)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("ArtifactFullScreen(params=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class AuthenticatedWeb implements ClaudeAppOverlay
    {
        public static final n1 Companion;
        public final String a = a;
        public final String b = b;
        
        static {
            Companion = new n1();
        }
        
        public AuthenticatedWeb(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof AuthenticatedWeb)) {
                return false;
            }
            final AuthenticatedWeb authenticatedWeb = (AuthenticatedWeb)o;
            return OriginRelativePath.c(this.a, authenticatedWeb.a) && mlc.q((Object)this.b, (Object)authenticatedWeb.b);
        }
        
        @Override
        public final int hashCode() {
            final int e = OriginRelativePath.e(this.a);
            final String b = this.b;
            int hashCode;
            if (b == null) {
                hashCode = 0;
            }
            else {
                hashCode = b.hashCode();
            }
            return e * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            return hia.k("AuthenticatedWeb(urlPath=\u2588\u2588, title=", this.b, ")");
        }
    }
    
    @jzk
    public static final class BellMode implements ClaudeAppOverlay
    {
        public static final p1 Companion;
        public static final d2d[] h;
        public final String a = a;
        public final String b = b;
        public final String c = c;
        public final boolean d = d;
        public final String e;
        public final String f;
        public final whp g;
        
        static {
            Companion = new p1();
            h = new d2d[] { null, null, null, null, null, null, ncq.F(2, (jta)new kt4((byte)14)) };
        }
        
        public BellMode(final String a, final String b, final String c, final boolean d, final String e, final String f, final whp g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof BellMode)) {
                return false;
            }
            final BellMode bellMode = (BellMode)o;
            if (!mlc.q((Object)this.a, (Object)bellMode.a)) {
                return false;
            }
            final String b = bellMode.b;
            final String b2 = this.b;
            boolean equals = false;
            Label_0082: {
                if (b2 == null) {
                    if (b == null) {
                        equals = true;
                        break Label_0082;
                    }
                }
                else if (b != null) {
                    equals = b2.equals(b);
                    break Label_0082;
                }
                equals = false;
            }
            if (!equals) {
                return false;
            }
            final String c = bellMode.c;
            final String c2 = this.c;
            boolean equals2 = false;
            Label_0132: {
                if (c2 == null) {
                    if (c == null) {
                        equals2 = true;
                        break Label_0132;
                    }
                }
                else if (c != null) {
                    equals2 = c2.equals(c);
                    break Label_0132;
                }
                equals2 = false;
            }
            if (!equals2) {
                return false;
            }
            if (this.d != bellMode.d) {
                return false;
            }
            final String e = bellMode.e;
            final String e2 = this.e;
            boolean equals3 = false;
            Label_0195: {
                if (e2 == null) {
                    if (e == null) {
                        equals3 = true;
                        break Label_0195;
                    }
                }
                else if (e != null) {
                    equals3 = e2.equals(e);
                    break Label_0195;
                }
                equals3 = false;
            }
            if (!equals3) {
                return false;
            }
            final String f = bellMode.f;
            final String f2 = this.f;
            if (f2 == null) {
                if (f == null) {
                    final boolean equals4 = true;
                    return equals4 && this.g == bellMode.g;
                }
            }
            else if (f != null) {
                final boolean equals4 = f2.equals(f);
                return equals4 && this.g == bellMode.g;
            }
            final boolean equals4 = false;
            return equals4 && this.g == bellMode.g;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int n = 0;
            final String b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            final String c = this.c;
            int hashCode3;
            if (c == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = c.hashCode();
            }
            final int l = smk.l(((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31, 31, this.d);
            final String e = this.e;
            int hashCode4;
            if (e == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = e.hashCode();
            }
            final String f = this.f;
            int hashCode5;
            if (f == null) {
                hashCode5 = n;
            }
            else {
                hashCode5 = f.hashCode();
            }
            return this.g.hashCode() + ((l + hashCode4) * 31 + hashCode5) * 31;
        }
        
        @Override
        public final String toString() {
            final String b = ChatId.b(this.a);
            String a = "null";
            final String b2 = this.b;
            String a2;
            if (b2 == null) {
                a2 = "null";
            }
            else {
                a2 = ProjectId.a(b2);
            }
            final String c = this.c;
            String a3;
            if (c == null) {
                a3 = "null";
            }
            else {
                a3 = ModelId.a(c);
            }
            final String e = this.e;
            String a4;
            if (e == null) {
                a4 = "null";
            }
            else {
                a4 = ThinkingEffort.a(e);
            }
            final String f = this.f;
            if (f != null) {
                a = ThinkingMode.a(f);
            }
            final StringBuilder t = oz1.t("BellMode(chatId=", b, ", projectId=", a2, ", modelId=");
            a6l.j(t, a3, ", isTemporary=", this.d, ", effort=");
            oz1.A(t, a4, ", thinkingMode=", a, ", entrySource=");
            t.append((Object)this.g);
            t.append(")");
            return t.toString();
        }
    }
    
    @jzk
    public static final class BreakSuggestionSheet implements ClaudeAppOverlay
    {
        public static final BreakSuggestionSheet INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (BreakSuggestionSheet)new Object();
            a = ncq.F(2, (jta)new h64((byte)27));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof BreakSuggestionSheet;
        }
        
        @Override
        public final int hashCode() {
            return -1893517489;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)BreakSuggestionSheet.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "BreakSuggestionSheet";
        }
    }
    
    @jzk
    public static final class BuyCreditsBottomSheet implements ClaudeAppOverlay
    {
        public static final r1 Companion;
        public static final d2d[] b;
        public final UsageCreditsEvents$UsageCreditsSurface a = a;
        
        static {
            Companion = new r1();
            b = new d2d[] { ncq.F(2, (jta)new kt4((byte)15)) };
        }
        
        public BuyCreditsBottomSheet(final UsageCreditsEvents$UsageCreditsSurface a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof BuyCreditsBottomSheet && this.a == ((BuyCreditsBottomSheet)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("BuyCreditsBottomSheet(sourceSurface=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class CodeArtifactViewer implements ClaudeAppOverlay
    {
        public static final t1 Companion;
        public final CodeArtifactViewerParams a = a;
        
        static {
            Companion = new t1();
            final x65 companion = CodeArtifactViewerParams.Companion;
        }
        
        public CodeArtifactViewer(final CodeArtifactViewerParams a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof CodeArtifactViewer && mlc.q((Object)this.a, (Object)((CodeArtifactViewer)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("CodeArtifactViewer(params=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class CreateEnvironment implements ClaudeAppOverlay
    {
        public static final CreateEnvironment INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (CreateEnvironment)new Object();
            a = ncq.F(2, (jta)new h64((byte)28));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof CreateEnvironment;
        }
        
        @Override
        public final int hashCode() {
            return -1873579068;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)CreateEnvironment.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "CreateEnvironment";
        }
    }
    
    @jzk
    public static final class CreateProject implements ClaudeAppOverlay
    {
        public static final CreateProject INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (CreateProject)new Object();
            a = ncq.F(2, (jta)new h64((byte)29));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof CreateProject;
        }
        
        @Override
        public final int hashCode() {
            return -897512118;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)CreateProject.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "CreateProject";
        }
    }
    
    @jzk
    public static final class ExperienceSpotlightSheet implements ClaudeAppOverlay
    {
        public static final y1 Companion;
        public final String a = a;
        
        static {
            Companion = new y1();
        }
        
        public ExperienceSpotlightSheet(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof ExperienceSpotlightSheet && mlc.q((Object)this.a, (Object)((ExperienceSpotlightSheet)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return hia.k("ExperienceSpotlightSheet(experienceId=", this.a, ")");
        }
    }
    
    @jzk
    public static final class FeedbackSheet implements ClaudeAppOverlay
    {
        public static final a2 Companion;
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        
        static {
            Companion = new a2();
        }
        
        public FeedbackSheet(final String a, final String b, final String c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof FeedbackSheet)) {
                return false;
            }
            final FeedbackSheet feedbackSheet = (FeedbackSheet)o;
            if (!mlc.q((Object)this.a, (Object)feedbackSheet.a)) {
                return false;
            }
            final String b = feedbackSheet.b;
            final String b2 = this.b;
            boolean equals = false;
            Label_0081: {
                if (b2 == null) {
                    if (b == null) {
                        equals = true;
                        break Label_0081;
                    }
                }
                else if (b != null) {
                    equals = b2.equals(b);
                    break Label_0081;
                }
                equals = false;
            }
            if (!equals) {
                return false;
            }
            final String c = feedbackSheet.c;
            final String c2 = this.c;
            if (c2 == null) {
                if (c == null) {
                    final boolean equals2 = true;
                    return equals2 && mlc.q((Object)this.d, (Object)feedbackSheet.d);
                }
            }
            else if (c != null) {
                final boolean equals2 = c2.equals(c);
                return equals2 && mlc.q((Object)this.d, (Object)feedbackSheet.d);
            }
            final boolean equals2 = false;
            return equals2 && mlc.q((Object)this.d, (Object)feedbackSheet.d);
        }
        
        @Override
        public final int hashCode() {
            int hashCode = 0;
            final String a = this.a;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final String b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final String d = this.d;
            if (d != null) {
                hashCode = d.hashCode();
            }
            return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            String a = "null";
            final String b = this.b;
            String b2;
            if (b == null) {
                b2 = "null";
            }
            else {
                b2 = ChatId.b(b);
            }
            final String c = this.c;
            if (c != null) {
                a = SessionId.a(c);
            }
            return oz1.q(oz1.t("FeedbackSheet(initialScreenshotUri=", this.a, ", conversationId=", b2, ", codeSessionId="), a, ", screenName=", this.d, ")");
        }
    }
    
    @jzk
    public static final class GroveNoticeBottomSheet implements ClaudeAppOverlay
    {
        public static final c2 Companion;
        public static final d2d[] b;
        public final GroveEvents$GroveLocation a = a;
        
        static {
            Companion = new c2();
            b = new d2d[] { ncq.F(2, (jta)new kt4((byte)16)) };
        }
        
        public GroveNoticeBottomSheet(final GroveEvents$GroveLocation a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof GroveNoticeBottomSheet && this.a == ((GroveNoticeBottomSheet)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("GroveNoticeBottomSheet(location=");
            sb.append((Object)this.a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @jzk
    public static final class ImageGalleryFullScreen implements ClaudeAppOverlay, xrl
    {
        public static final e2 Companion;
        public final String a = a;
        
        static {
            Companion = new e2();
        }
        
        public ImageGalleryFullScreen(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof ImageGalleryFullScreen) {
                    if (ImageGalleryItemId.b(this.a, ((ImageGalleryFullScreen)o).a)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            return ImageGalleryItemId.c(this.a);
        }
        
        @Override
        public final String toString() {
            return hia.k("ImageGalleryFullScreen(initialSelectedId=", ImageGalleryItemId.d(this.a), ")");
        }
    }
    
    @jzk
    public static final class MemoryManageWeb implements ClaudeAppOverlay
    {
        public static final g2 Companion;
        public final String a;
        
        static {
            Companion = new g2();
        }
        
        public MemoryManageWeb(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof MemoryManageWeb)) {
                return false;
            }
            final String a = ((MemoryManageWeb)o).a;
            final String a2 = this.a;
            if (a2 == null) {
                if (a == null) {
                    return true;
                }
            }
            else if (a != null) {
                return a2.equals(a);
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            if (a == null) {
                return 0;
            }
            return a.hashCode();
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            String a2;
            if (a == null) {
                a2 = "null";
            }
            else {
                a2 = ProjectId.a(a);
            }
            return hia.k("MemoryManageWeb(projectId=", a2, ")");
        }
    }
    
    @jzk
    public static final class MemoryPreview implements ClaudeAppOverlay
    {
        public static final i2 Companion;
        public final String a = a;
        public final hfc b = b;
        public final String c;
        
        static {
            Companion = new i2();
        }
        
        public MemoryPreview(final hfc b, final String a, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof MemoryPreview)) {
                return false;
            }
            final MemoryPreview memoryPreview = (MemoryPreview)o;
            if (!mlc.q((Object)this.a, (Object)memoryPreview.a)) {
                return false;
            }
            if (!mlc.q((Object)this.b, (Object)memoryPreview.b)) {
                return false;
            }
            final String c = memoryPreview.c;
            final String c2 = this.c;
            if (c2 == null) {
                if (c == null) {
                    return true;
                }
            }
            else if (c != null) {
                return c2.equals(c);
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final int e = t.e(this.a.hashCode() * 31, 31, this.b);
            final String c = this.c;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            return e + hashCode;
        }
        
        @Override
        public final String toString() {
            final String c = this.c;
            String a;
            if (c == null) {
                a = "null";
            }
            else {
                a = ProjectId.a(c);
            }
            final StringBuilder sb = new StringBuilder("MemoryPreview(memorySynthesis=");
            sb.append(this.a);
            sb.append(", updatedAt=");
            sb.append((Object)this.b);
            sb.append(", projectId=");
            return oz1.p(sb, a, ")");
        }
    }
    
    @jzk
    public static final class None implements ClaudeAppOverlay, EmptyDestination
    {
        public static final None INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (None)new Object();
            a = ncq.F(2, (jta)new lv4((byte)0));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof None;
        }
        
        @Override
        public final int hashCode() {
            return 1903085003;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)None.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "None";
        }
    }
    
    @jzk
    public static final class QuietHoursNotice implements ClaudeAppOverlay
    {
        public static final QuietHoursNotice INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (QuietHoursNotice)new Object();
            a = ncq.F(2, (jta)new lv4((byte)1));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof QuietHoursNotice;
        }
        
        @Override
        public final int hashCode() {
            return -1511412218;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)QuietHoursNotice.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "QuietHoursNotice";
        }
    }
    
    @jzk
    public static final class ShareTargetChooser implements ClaudeAppOverlay
    {
        public static final ShareTargetChooser INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (ShareTargetChooser)new Object();
            a = ncq.F(2, (jta)new lv4((byte)2));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof ShareTargetChooser;
        }
        
        @Override
        public final int hashCode() {
            return 853817886;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)ShareTargetChooser.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "ShareTargetChooser";
        }
    }
    
    @jzk
    public static final class SharedChatFullScreen implements ClaudeAppOverlay
    {
        public static final k2 Companion;
        public final String a = a;
        
        static {
            Companion = new k2();
        }
        
        public SharedChatFullScreen(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof SharedChatFullScreen && ChatSnapshotId.b(this.a, ((SharedChatFullScreen)o).a));
        }
        
        @Override
        public final int hashCode() {
            return ChatSnapshotId.c(this.a);
        }
        
        @Override
        public final String toString() {
            return hia.k("SharedChatFullScreen(snapshotId=", ChatSnapshotId.d(this.a), ")");
        }
    }
    
    @jzk
    public static final class UpgradeToProBottomSheet implements ClaudeAppOverlay
    {
        public static final m2 Companion;
        public static final d2d[] e;
        public final ewo a;
        public final String b;
        public final String c;
        public final boolean d;
        
        static {
            Companion = new m2();
            e = new d2d[] { ncq.F(2, (jta)new kt4((byte)17)), null, null, null };
        }
        
        public UpgradeToProBottomSheet(final int n, String b, String c, boolean d) {
            ewo a;
            if ((n & 0x1) != 0x0) {
                a = ewo.v;
            }
            else {
                a = ewo.w;
            }
            if ((n & 0x2) != 0x0) {
                b = null;
            }
            if ((n & 0x4) != 0x0) {
                c = null;
            }
            if ((n & 0x8) != 0x0) {
                d = false;
            }
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof UpgradeToProBottomSheet)) {
                return false;
            }
            final UpgradeToProBottomSheet upgradeToProBottomSheet = (UpgradeToProBottomSheet)o;
            if (this.a != upgradeToProBottomSheet.a) {
                return false;
            }
            if (!mlc.q((Object)this.b, (Object)upgradeToProBottomSheet.b)) {
                return false;
            }
            final String c = upgradeToProBottomSheet.c;
            final String c2 = this.c;
            if (c2 == null) {
                if (c == null) {
                    final boolean equals = true;
                    return equals && this.d == upgradeToProBottomSheet.d;
                }
            }
            else if (c != null) {
                final boolean equals = c2.equals(c);
                return equals && this.d == upgradeToProBottomSheet.d;
            }
            final boolean equals = false;
            return equals && this.d == upgradeToProBottomSheet.d;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            int hashCode2 = 0;
            final String b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return Boolean.hashCode(this.d) + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31;
        }
        
        @Override
        public final String toString() {
            final String c = this.c;
            String a;
            if (c == null) {
                a = "null";
            }
            else {
                a = ModelId.a(c);
            }
            final StringBuilder sb = new StringBuilder("UpgradeToProBottomSheet(subtitle=");
            sb.append((Object)this.a);
            sb.append(", initialPromptAfterUpgrade=");
            sb.append(this.b);
            sb.append(", modelIdToSelectAfterUpgrade=");
            return xc2.l(sb, a, ", savesModelAsDefaultAfterUpgrade=", this.d, ")");
        }
    }
    
    @jzk
    public static final class VoiceSettings implements ClaudeAppOverlay
    {
        public static final VoiceSettings INSTANCE;
        public static final d2d a;
        
        static {
            INSTANCE = (VoiceSettings)new Object();
            a = ncq.F(2, (jta)new lv4((byte)3));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || o instanceof VoiceSettings;
        }
        
        @Override
        public final int hashCode() {
            return 413250;
        }
        
        public final KSerializer serializer() {
            return (KSerializer)VoiceSettings.a.getValue();
        }
        
        @Override
        public final String toString() {
            return "VoiceSettings";
        }
    }
}
