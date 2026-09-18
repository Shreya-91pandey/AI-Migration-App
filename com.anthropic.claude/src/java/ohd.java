import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.app.ClaudeAppDestination$Detail$CodePullRequest;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.app.ClaudeAppDestination$Detail$SessionRouterLoadingScreen;
import com.anthropic.claude.types.strings.SessionGroupingId;
import java.util.List;
import com.anthropic.claude.app.ClaudeAppDestination;

public abstract class ohd
{
    public static final void a(final frg frg, final gwj gwj, final xv4 xv4, final nx8 nx8, final jta jta, final jta jta2, final pqg pqg, final hwj hwj, final igf igf, krf r, final gva gva, final int n) {
        final je6 a = hwj.a;
        gva.i0(1442702410);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)frg);
            }
            else {
                b = gva.h((Object)frg);
            }
            int n2;
            if (b) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            boolean b2;
            if ((n & 0x40) == 0x0) {
                b2 = gva.f((Object)gwj);
            }
            else {
                b2 = gva.h((Object)gwj);
            }
            int n5;
            if (b2) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            boolean b3;
            if ((n & 0x200) == 0x0) {
                b3 = gva.f((Object)xv4);
            }
            else {
                b3 = gva.h((Object)xv4);
            }
            int n7;
            if (b3) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.f((Object)nx8)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n6 |= n8;
        }
        if ((n & 0x6000) == 0x0) {
            int n9;
            if (gva.h((Object)jta)) {
                n9 = 16384;
            }
            else {
                n9 = 8192;
            }
            n6 |= n9;
        }
        int n11;
        if ((0x30000 & n) == 0x0) {
            int n10;
            if (gva.h((Object)jta2)) {
                n10 = 131072;
            }
            else {
                n10 = 65536;
            }
            n11 = (n6 | n10);
        }
        else {
            n11 = n6;
        }
        if ((0x180000 & n) == 0x0) {
            int n12;
            if (gva.f((Object)pqg)) {
                n12 = 1048576;
            }
            else {
                n12 = 524288;
            }
            n11 |= n12;
        }
        int n13 = n11;
        if ((0xC00000 & n) == 0x0) {
            boolean b4;
            if ((0x1000000 & n) == 0x0) {
                b4 = gva.f((Object)hwj);
            }
            else {
                b4 = gva.h((Object)hwj);
            }
            int n14;
            if (b4) {
                n14 = 8388608;
            }
            else {
                n14 = 4194304;
            }
            n13 = (n11 | n14);
        }
        if ((0x6000000 & n) == 0x0) {
            int n15;
            if (gva.f((Object)igf)) {
                n15 = 67108864;
            }
            else {
                n15 = 33554432;
            }
            n13 |= n15;
        }
        int n16 = n13;
        if ((0x30000000 & n) == 0x0) {
            n16 = (n13 | 0x10000000);
        }
        if (gva.W(n16 & 0x1, (0x12492493 & n16) != 0x12492492)) {
            gva.b0();
            final cib a2 = bi6.a;
            int n17;
            Object o;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n17 = (n16 & 0x8FFFFFFF);
                o = r;
            }
            else {
                final odk a3 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a3);
                r = (krf)gva.R();
                if ((f | f2) || r == a2) {
                    r = (krf)a3.d((Class)krf.class, (emi)null);
                    gva.q0((Object)r);
                }
                o = r;
                n17 = (n16 & 0x8FFFFFFF);
            }
            gva.r();
            final rp4 rp4 = (rp4)frg.w.getValue();
            final ClaudeAppDestination.List.AllChatsList instance = ClaudeAppDestination.List.AllChatsList.INSTANCE;
            Object r2;
            if ((r2 = gva.R()) == a2) {
                r2 = new sp4(new hu4((byte)0));
                gva.q0(r2);
            }
            final sp4 sp4 = (sp4)r2;
            final boolean f3 = gva.f((Object)a.g());
            final int n18 = n17 & 0xE;
            final boolean b5 = n18 == 4 || ((n17 & 0x8) != 0x0 && gva.f((Object)frg));
            final Object r3 = gva.R();
            cjh cjh;
            if ((f3 | b5) || (cjh = (cjh)r3) == a2) {
                cjh = new cjh(a.g(), (jta)new qn3(frg, (byte)10), (lta)nhd.C);
                gva.q0((Object)cjh);
            }
            final cjh cjh2 = cjh;
            final fp4 fp4 = (fp4)c86.R0((List)rp4.b);
            Object o2 = null;
            Label_1214: {
                if (fp4 != null) {
                    final ClaudeAppDestination.Detail detail = (ClaudeAppDestination.Detail)fp4.a;
                    if (detail != null) {
                        o2 = detail;
                        while (true) {
                            switch (guc.y((Object)detail)) {
                                default: {
                                    en9.r();
                                    return;
                                }
                                case 8: {
                                    o2 = SessionGroupingId.a(((ClaudeAppDestination.Detail.CodeProjectLink)detail).a);
                                }
                                case 9:
                                case 10:
                                case 11:
                                case 12: {
                                    break;
                                }
                                case 7: {
                                    o2 = new SessionId(((ClaudeAppDestination$Detail$SessionRouterLoadingScreen)detail).g());
                                    break;
                                }
                                case 6: {
                                    final ClaudeAppDestination$Detail$CodePullRequest claudeAppDestination$Detail$CodePullRequest = (ClaudeAppDestination$Detail$CodePullRequest)detail;
                                    o2 = new yog((Object)claudeAppDestination$Detail$CodePullRequest.g().b(), (Object)claudeAppDestination$Detail$CodePullRequest.g().a());
                                    break;
                                }
                                case 5: {
                                    o2 = new SessionId(((ClaudeAppDestination.Detail.CodeSessionOverview)detail).a.a());
                                    break;
                                }
                                case 4: {
                                    final String b6 = ((ClaudeAppDestination.Detail.CodeRemoteSession)detail).a.b();
                                    o2 = detail;
                                    if (b6 != null) {
                                        o2 = new SessionId(b6);
                                    }
                                    continue;
                                }
                                case 3: {
                                    o2 = new ProjectId(((ClaudeAppDestination.Detail.TemplateUploadMaterialScreen)detail).a.a());
                                    break;
                                }
                                case 2: {
                                    o2 = new ProjectId(((ClaudeAppDestination.Detail.ProjectKnowledge)detail).a.a());
                                    break;
                                }
                                case 1: {
                                    o2 = new ProjectId(((ClaudeAppDestination.Detail.ProjectDetails)detail).a.a());
                                    break;
                                }
                                case 0: {
                                    final ChatScreenParams a4 = ((ClaudeAppDestination.Detail.Chat)detail).a;
                                    if (a4.c) {
                                        o2 = null;
                                        break;
                                    }
                                    o2 = a4.a;
                                    continue;
                                }
                            }
                            break;
                        }
                        break Label_1214;
                    }
                }
                o2 = null;
            }
            final boolean b7 = rp4.d == zp4.w && (boolean)((krf)o).g.getValue();
            final boolean l = u8r.l(gva);
            final boolean b8 = n18 == 4 || ((n17 & 0x8) != 0x0 && gva.h((Object)frg));
            final Object r4 = gva.R();
            Object o3;
            if (b8 || (o3 = r4) == a2) {
                o3 = new qn3(frg, (byte)11);
                gva.q0(o3);
            }
            ach.g(rp4, (jta)o3, uuj.t0(-1385813878, (aua)new mhd(frg, gwj, xv4, jta2, nx8, jta, (byte)0), gva), uuj.t0(1225584376, (aua)new mhd(frg, gwj, xv4, jta2, nx8, jta, (byte)1), gva), uuj.t0(-662673298, (aua)new mhd(frg, gwj, xv4, jta2, nx8, jta, (byte)2), gva), sp4, (Object)instance, igf, pqg, cjh2, (m0q)null, o2, b7, l, gva, (n17 >> 3 & 0x1C00000) | 0x186D80 | (0xE000000 & n17 << 6) | 0x40000000);
            r = (krf)o;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new f00(frg, gwj, xv4, nx8, jta, jta2, pqg, hwj, igf, r, n);
        }
    }
}
