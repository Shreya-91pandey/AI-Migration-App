package com.anthropic.claude.app;

import com.anthropic.claude.code.remote.stores.b;

public abstract class o2
{
    public static final void a(final gwj gwj, final frg frg, b b, rx0 rx0, jj4 jj4, final unm unm, final st4 st4, final u88 u88, final gva gva, final int n) {
        gva.i0(1290138829);
        int n2;
        if (gva.f((Object)gwj)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)frg)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n | n2 | n3 | 0x492480;
        st4 st6;
        u88 u90;
        unm unm4;
        if (gva.W(n4 & 0x1, (0x492493 & n4) != 0x492492)) {
            gva.b0();
            final cib a = bi6.a;
            st4 st5;
            u88 u89;
            int n5;
            unm unm2;
            Object o;
            jj4 jj6;
            rx0 rx3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final b b2 = b;
                final rx0 rx2 = rx0;
                final jj4 jj5 = jj4;
                st5 = st4;
                u89 = u88;
                n5 = (n4 & 0xFE00007F);
                unm2 = unm;
                o = b2;
                jj6 = jj5;
                rx3 = rx2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (b = (b)r) == a) {
                    b = (b)a2.d((Class)b.class, (emi)null);
                    gva.q0((Object)b);
                }
                o = b;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)rx0.class, (emi)null);
                    gva.q0(o2);
                }
                rx3 = (rx0)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)jj4.class, (emi)null);
                    gva.q0(o3);
                }
                jj6 = (jj4)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                final Object r4 = gva.R();
                Object o4;
                if ((f7 | f8) || (o4 = r4) == a) {
                    o4 = a5.d((Class)unm.class, (emi)null);
                    gva.q0(o4);
                }
                unm2 = (unm)o4;
                final odk a6 = ii8.a(gva);
                final boolean f9 = gva.f((Object)null);
                final boolean f10 = gva.f((Object)a6);
                final Object r5 = gva.R();
                Object o5;
                if ((f9 | f10) || (o5 = r5) == a) {
                    o5 = a6.d((Class)st4.class, (emi)null);
                    gva.q0(o5);
                }
                st5 = (st4)o5;
                final odk a7 = ii8.a(gva);
                final boolean f11 = gva.f((Object)null);
                final boolean f12 = gva.f((Object)a7);
                final Object r6 = gva.R();
                Object o6;
                if ((f11 | f12) || (o6 = r6) == a) {
                    o6 = a7.d((Class)u88.class, (emi)null);
                    gva.q0(o6);
                }
                u89 = (u88)o6;
                n5 = (n4 & 0xFE00007F);
            }
            gva.r();
            final ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay)qt7.y(gwj);
            boolean b3 = false;
            Label_0867: {
                if (!mlc.q((Object)claudeAppOverlay, (Object)ClaudeAppOverlay.None.INSTANCE)) {
                    if (!(claudeAppOverlay instanceof ClaudeAppOverlay.UpgradeToProBottomSheet)) {
                        if (!(claudeAppOverlay instanceof ClaudeAppOverlay.BuyCreditsBottomSheet)) {
                            if (!(claudeAppOverlay instanceof ClaudeAppOverlay.ExperienceSpotlightSheet)) {
                                if (!(claudeAppOverlay instanceof ClaudeAppOverlay.GroveNoticeBottomSheet)) {
                                    if (!mlc.q((Object)claudeAppOverlay, (Object)ClaudeAppOverlay.QuietHoursNotice.INSTANCE)) {
                                        if (!mlc.q((Object)claudeAppOverlay, (Object)ClaudeAppOverlay.BreakSuggestionSheet.INSTANCE)) {
                                            if (!mlc.q((Object)claudeAppOverlay, (Object)ClaudeAppOverlay.ShareTargetChooser.INSTANCE)) {
                                                if (!(claudeAppOverlay instanceof ClaudeAppOverlay.BellMode)) {
                                                    if (!(claudeAppOverlay instanceof ClaudeAppOverlay.ArtifactFullScreen)) {
                                                        if (!(claudeAppOverlay instanceof ClaudeAppOverlay.SharedChatFullScreen)) {
                                                            if (!(claudeAppOverlay instanceof ClaudeAppOverlay.CodeArtifactViewer)) {
                                                                if (!mlc.q((Object)claudeAppOverlay, (Object)ClaudeAppOverlay.VoiceSettings.INSTANCE)) {
                                                                    if (mlc.q((Object)claudeAppOverlay, (Object)ClaudeAppOverlay.CreateProject.INSTANCE) || claudeAppOverlay instanceof ClaudeAppOverlay.MemoryPreview) {
                                                                        b3 = true;
                                                                        break Label_0867;
                                                                    }
                                                                    if (!(claudeAppOverlay instanceof ClaudeAppOverlay.MemoryManageWeb)) {
                                                                        if (!(claudeAppOverlay instanceof ClaudeAppOverlay.AuthenticatedWeb)) {
                                                                            if (!mlc.q((Object)claudeAppOverlay, (Object)ClaudeAppOverlay.CreateEnvironment.INSTANCE)) {
                                                                                if (!(claudeAppOverlay instanceof ClaudeAppOverlay.ImageGalleryFullScreen)) {
                                                                                    if (!(claudeAppOverlay instanceof ClaudeAppOverlay.FeedbackSheet)) {
                                                                                        if (!(claudeAppOverlay instanceof ClaudeAppOverlay$CodeSessionFeedback)) {
                                                                                            en9.r();
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                b3 = false;
            }
            soh.e(0, 6, (jta)null, gva, (igf)null, b3);
            final mma mma = (mma)gva.j((sei)hm6.i);
            final Object y = qt7.y(gwj);
            final boolean h = gva.h((Object)mma);
            final Object r7 = gva.R();
            Object o7;
            if (h || (o7 = r7) == a) {
                o7 = new qv4(mma, null, (byte)0);
                gva.q0(o7);
            }
            mlc.f((zta)o7, gva, y);
            Object o8;
            if ((o8 = gva.R()) == a) {
                o8 = mlc.z((hc7)o89.v, gva);
                gva.q0(o8);
            }
            final oc7 oc7 = (oc7)o8;
            final int n6 = n5 & 0xE;
            final lta t = soh.t(gwj, (ho1)null, gva, n6 | 0x180, 2);
            final boolean f13 = gva.f((Object)t);
            final Object r8 = gva.R();
            Object o9;
            if (f13 || (o9 = r8) == a) {
                o9 = new mv2(t, (byte)4);
                gva.q0(o9);
            }
            final lta lta = (lta)o9;
            Object r9 = gva.R();
            if (r9 == a) {
                r9 = new hu4((byte)1);
                gva.q0(r9);
            }
            mlc.k(gwj, (igf)null, (vlm)ao2.b0(1, lta, (cua)r9), uuj.t0(-2101980103, (aua)new ov4(gwj, unm2, frg, st5, oc7, u89, jj6, rx3, (b)o), gva), gva, n6 | 0xC00, 2);
            final rx0 rx4 = rx3;
            final b b4 = (b)o;
            final unm unm3 = unm2;
            st6 = st5;
            u90 = u89;
            b = b4;
            rx0 = rx4;
            jj4 = jj6;
            unm4 = unm3;
        }
        else {
            gva.Z();
            st6 = st4;
            u90 = u88;
            unm4 = unm;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new tnd((Object)gwj, (Object)frg, (Object)b, (Object)rx0, (Object)jj4, (Object)unm4, (Object)st6, (Object)u90, n, (byte)2);
        }
    }
    
    public static final boolean b(final ClaudeAppOverlay claudeAppOverlay) {
        if (!(claudeAppOverlay instanceof ClaudeAppOverlay.BellMode) && !(claudeAppOverlay instanceof ClaudeAppOverlay.ArtifactFullScreen) && !(claudeAppOverlay instanceof ClaudeAppOverlay.SharedChatFullScreen) && !(claudeAppOverlay instanceof ClaudeAppOverlay.ImageGalleryFullScreen) && !(claudeAppOverlay instanceof ClaudeAppOverlay.FeedbackSheet) && !(claudeAppOverlay instanceof ClaudeAppOverlay$CodeSessionFeedback) && !(claudeAppOverlay instanceof ClaudeAppOverlay.MemoryManageWeb) && !(claudeAppOverlay instanceof ClaudeAppOverlay.AuthenticatedWeb) && !claudeAppOverlay.equals(ClaudeAppOverlay.CreateEnvironment.INSTANCE) && !claudeAppOverlay.equals(ClaudeAppOverlay.QuietHoursNotice.INSTANCE)) {
            if (!claudeAppOverlay.equals(ClaudeAppOverlay.None.INSTANCE) && !(claudeAppOverlay instanceof ClaudeAppOverlay.UpgradeToProBottomSheet) && !(claudeAppOverlay instanceof ClaudeAppOverlay.BuyCreditsBottomSheet) && !(claudeAppOverlay instanceof ClaudeAppOverlay.GroveNoticeBottomSheet) && !(claudeAppOverlay instanceof ClaudeAppOverlay.ExperienceSpotlightSheet) && !claudeAppOverlay.equals(ClaudeAppOverlay.CreateProject.INSTANCE) && !(claudeAppOverlay instanceof ClaudeAppOverlay.MemoryPreview) && !claudeAppOverlay.equals(ClaudeAppOverlay.BreakSuggestionSheet.INSTANCE) && !claudeAppOverlay.equals(ClaudeAppOverlay.ShareTargetChooser.INSTANCE) && !(claudeAppOverlay instanceof ClaudeAppOverlay.CodeArtifactViewer)) {
                if (!claudeAppOverlay.equals(ClaudeAppOverlay.VoiceSettings.INSTANCE)) {
                    en9.r();
                }
            }
            return false;
        }
        return true;
    }
}
