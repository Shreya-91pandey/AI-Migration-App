package com.anthropic.claude.app;

import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import java.util.List;
import com.anthropic.claude.settings.b;

public abstract class b1
{
    public static final void a(final ClaudeAppDestination claudeAppDestination, final frg frg, final gwj gwj, final xv4 xv4, final jta jta, final nx8 nx8, final jta jta2, final igf igf, final jj4 jj4, final ax3 ax3, final l9o l9o, qdg qdg, final st4 st4, final u88 u88, vk6 vk6, final dh7 dh7, final gva gva, final int n) {
        gva.i0(859255439);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)claudeAppDestination);
            }
            else {
                b = gva.h((Object)claudeAppDestination);
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
                b2 = gva.f((Object)frg);
            }
            else {
                b2 = gva.h((Object)frg);
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
                b3 = gva.f((Object)gwj);
            }
            else {
                b3 = gva.h((Object)gwj);
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
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            boolean b4;
            if ((n & 0x1000) == 0x0) {
                b4 = gva.f((Object)xv4);
            }
            else {
                b4 = gva.h((Object)xv4);
            }
            int n9;
            if (b4) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.h((Object)jta)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if ((0x30000 & n) == 0x0) {
            int n12;
            if (gva.f((Object)nx8)) {
                n12 = 131072;
            }
            else {
                n12 = 65536;
            }
            n10 |= n12;
        }
        if ((0x180000 & n) == 0x0) {
            int n13;
            if (gva.h((Object)jta2)) {
                n13 = 1048576;
            }
            else {
                n13 = 524288;
            }
            n10 |= n13;
        }
        int n14 = 0xC00000 | n10;
        if ((0x6000000 & n) == 0x0) {
            n14 = (0x2C00000 | n10);
        }
        int n15 = n14;
        if ((0x30000000 & n) == 0x0) {
            n15 = (n14 | 0x10000000);
        }
        igf igf2;
        dh7 dh8;
        jj4 jj7;
        l9o l9o3;
        ax3 ax7;
        st4 st6;
        u88 u93;
        vk6 vk10;
        if (gva.W(n15 & 0x1, (0x12492493 & n15) != 0x12492492)) {
            gva.b0();
            final cib a = bi6.a;
            int n16;
            st4 st5;
            vk6 vk7;
            jj4 jj5;
            ax3 ax4;
            u88 u89;
            l9o l9o2;
            qdg qdg3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n16 = (n15 & 0x81FFFFFF);
                final qdg qdg2 = qdg;
                st5 = st4;
                vk7 = vk6;
                jj5 = jj4;
                igf2 = igf;
                ax4 = ax3;
                u89 = u88;
                dh8 = dh7;
                l9o2 = l9o;
                qdg3 = qdg2;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                Object o;
                if ((f | f2) || (o = r) == a) {
                    o = a2.d((Class)jj4.class, (emi)null);
                    gva.q0(o);
                }
                jj5 = (jj4)o;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)ax3.class, (emi)null);
                    gva.q0(o2);
                }
                ax4 = (ax3)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)l9o.class, (emi)null);
                    gva.q0(o3);
                }
                l9o2 = (l9o)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                Object r4 = gva.R();
                if ((f7 | f8) || r4 == a) {
                    r4 = a5.d((Class)qdg.class, (emi)null);
                    gva.q0(r4);
                }
                qdg3 = (qdg)r4;
                final odk a6 = ii8.a(gva);
                final boolean f9 = gva.f((Object)null);
                final boolean f10 = gva.f((Object)a6);
                Object r5 = gva.R();
                if ((f9 | f10) || r5 == a) {
                    r5 = a6.d((Class)st4.class, (emi)null);
                    gva.q0(r5);
                }
                st5 = (st4)r5;
                final odk a7 = ii8.a(gva);
                final boolean f11 = gva.f((Object)null);
                final boolean f12 = gva.f((Object)a7);
                Object r6 = gva.R();
                if ((f11 | f12) || r6 == a) {
                    r6 = a7.d((Class)u88.class, (emi)null);
                    gva.q0(r6);
                }
                final u88 u90 = (u88)r6;
                final odk a8 = ii8.a(gva);
                final boolean f13 = gva.f((Object)null);
                final boolean f14 = gva.f((Object)a8);
                Object r7 = gva.R();
                if ((f13 | f14) || r7 == a) {
                    r7 = a8.d((Class)vk6.class, (emi)null);
                    gva.q0(r7);
                }
                vk7 = (vk6)r7;
                final odk a9 = ii8.a(gva);
                final boolean f15 = gva.f((Object)null);
                final boolean f16 = gva.f((Object)a9);
                Object r8 = gva.R();
                if ((f15 | f16) || r8 == a) {
                    r8 = a9.d((Class)dh7.class, (emi)null);
                    gva.q0(r8);
                }
                dh8 = (dh7)r8;
                final fgf v = fgf.v;
                u89 = u90;
                igf2 = (igf)v;
                n16 = (n15 & 0x81FFFFFF);
            }
            gva.r();
            uoo.g(6, gva);
            final int n17 = n16 & 0x380;
            final boolean b5 = n17 == 256 || ((n16 & 0x200) != 0x0 && gva.h((Object)gwj));
            final Object r9 = gva.R();
            Object o4;
            if (b5 || (o4 = r9) == a) {
                o4 = new rn3(gwj, (byte)12);
                gva.q0(o4);
            }
            final lta lta = (lta)o4;
            Label_4389: {
                if (claudeAppDestination instanceof ClaudeAppDestination.List.AllChatsList) {
                    gva.g0(1110802174);
                    final ClaudeAppDestination.List.AllChatsList list = (ClaudeAppDestination.List.AllChatsList)claudeAppDestination;
                    final byte e = xv4.e;
                    final int n18 = n16 >> 6;
                    jo3.a(list, frg, xv4, nx8, jta2, jj5, ax4, vk7, igf2, gva, (n16 & 0x7E) | e << 6 | (n16 >> 3 & 0x380) | (n18 & 0x1C00) | (n18 & 0xE000) | 0x1040000 | (n16 << 3 & 0xE000000));
                    gva.q(false);
                }
                else {
                    final jj4 jj6 = jj5;
                    final ax3 ax5 = ax4;
                    if (claudeAppDestination instanceof ClaudeAppDestination.Detail.Chat) {
                        gva.g0(1110816647);
                        final ClaudeAppDestination.Detail.Chat chat = (ClaudeAppDestination.Detail.Chat)claudeAppDestination;
                        final c companion = ClaudeAppDestination.Detail.Chat.Companion;
                        final byte e2 = xv4.e;
                        final int n19 = n16 >> 3;
                        jo3.b(chat, frg, gwj, xv4, nx8, jta2, lta, jj6, ax5, u89, dh8, igf2, gva, (n16 & 0x3FE) | e2 << 9 | (n16 & 0x1C00) | (n19 & 0xE000) | (0x70000 & n19) | 0x1000000, n16 >> 18 & 0x70);
                        gva.q(false);
                    }
                    else {
                        if (!(claudeAppDestination instanceof ClaudeAppDestination.List.AllProjectsList)) {
                            Label_2219: {
                                if (!(claudeAppDestination instanceof ClaudeAppDestination.List.ArtifactGallery)) {
                                    if (claudeAppDestination instanceof ClaudeAppDestination.List.CodeRemote) {
                                        gva.g0(1110892898);
                                        final ClaudeAppDestination.List.CodeRemote codeRemote = (ClaudeAppDestination.List.CodeRemote)claudeAppDestination;
                                        final int n20 = n16 >> 6;
                                        r85.d(codeRemote, frg, gwj, nx8, jta2, vk7, igf2, gva, 0x40000 | ((n16 & 0x3FE) | (n20 & 0x1C00) | (n20 & 0xE000)) | (n16 >> 3 & 0x380000));
                                        gva.q(false);
                                    }
                                    else if (claudeAppDestination instanceof ClaudeAppDestination.List.CodeRoutines) {
                                        gva.g0(1110904316);
                                        final ClaudeAppDestination.List.CodeRoutines codeRoutines = (ClaudeAppDestination.List.CodeRoutines)claudeAppDestination;
                                        final k0 companion2 = ClaudeAppDestination.List.CodeRoutines.Companion;
                                        r85.h(codeRoutines, frg, igf2, gva, (n16 & 0x7E) | (n16 >> 15 & 0x380));
                                        gva.q(false);
                                    }
                                    else if (claudeAppDestination instanceof ClaudeAppDestination.List.CodeProjects) {
                                        gva.g0(1110910705);
                                        final ClaudeAppDestination.List.CodeProjects codeProjects = (ClaudeAppDestination.List.CodeProjects)claudeAppDestination;
                                        final int n21 = n16 >> 9;
                                        r85.b(codeProjects, frg, nx8, jta2, l9o2, igf2, gva, (n16 & 0x7E) | (n21 & 0x380) | (n21 & 0x1C00) | (n16 >> 6 & 0x70000));
                                        gva.q(false);
                                    }
                                    else {
                                        if (claudeAppDestination instanceof ClaudeAppDestination.List.CoworkRemote) {
                                            gva.g0(1110920862);
                                            final ClaudeAppDestination.List.CoworkRemote coworkRemote = (ClaudeAppDestination.List.CoworkRemote)claudeAppDestination;
                                            final int n22 = n16 >> 9;
                                            ne7.a(coworkRemote, frg, nx8, jta2, jj6, ax5, st5, vk7, igf2, gva, (n16 & 0x7E) | (n22 & 0x380) | (n22 & 0x1C00) | 0x1008000 | (n16 << 3 & 0xE000000));
                                            gva.q(false);
                                            break Label_2219;
                                        }
                                        final vk6 vk8 = vk7;
                                        final igf igf3 = igf2;
                                        if (claudeAppDestination.equals(ClaudeAppDestination.List.CoworkRoutines.INSTANCE)) {
                                            gva.g0(1110935241);
                                            final int n23 = n16 >> 9;
                                            ne7.b(claudeAppDestination, frg, nx8, jta2, jj6, igf3, gva, (n16 & 0x7E) | (n23 & 0x380) | (n23 & 0x1C00) | 0x8000 | (n16 >> 6 & 0x70000));
                                            gva.q(false);
                                            igf2 = igf3;
                                            break Label_2219;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination.List.CoworkScheduled) {
                                            gva.g0(1110946210);
                                            final ClaudeAppDestination.List.CoworkScheduled coworkScheduled = (ClaudeAppDestination.List.CoworkScheduled)claudeAppDestination;
                                            final int n24 = n16 >> 9;
                                            ne7.c(coworkScheduled, frg, nx8, jta2, jj6, ax5, vk8, igf3, gva, (n16 & 0x7E) | (n24 & 0x380) | (n24 & 0x1C00) | 0x208000 | (n16 & 0x1C00000));
                                            gva.q(false);
                                            igf2 = igf3;
                                            break Label_2219;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination$Detail$CoworkScheduledTask) {
                                            gva.g0(1110960130);
                                            final ClaudeAppDestination$Detail$CoworkScheduledTask claudeAppDestination$Detail$CoworkScheduledTask = (ClaudeAppDestination$Detail$CoworkScheduledTask)claudeAppDestination;
                                            final s companion3 = ClaudeAppDestination$Detail$CoworkScheduledTask.Companion;
                                            final int n25 = n16 >> 9;
                                            ne7.d(claudeAppDestination$Detail$CoworkScheduledTask, frg, nx8, jta2, jj6, ax5, vk8, igf3, gva, (n16 & 0x7E) | (n25 & 0x380) | (n25 & 0x1C00) | 0x208000 | (n16 & 0x1C00000));
                                            gva.q(false);
                                            igf2 = igf3;
                                            break Label_2219;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination$Detail$CoworkScheduledTaskHistory) {
                                            gva.g0(1110974281);
                                            final ClaudeAppDestination$Detail$CoworkScheduledTaskHistory claudeAppDestination$Detail$CoworkScheduledTaskHistory = (ClaudeAppDestination$Detail$CoworkScheduledTaskHistory)claudeAppDestination;
                                            final u companion4 = ClaudeAppDestination$Detail$CoworkScheduledTaskHistory.Companion;
                                            final int n26 = n16 >> 9;
                                            ne7.e(claudeAppDestination$Detail$CoworkScheduledTaskHistory, frg, nx8, jta2, jj6, ax5, vk8, igf3, gva, (n16 & 0x7E) | (n26 & 0x380) | (n26 & 0x1C00) | 0x208000 | (n16 & 0x1C00000));
                                            gva.q(false);
                                            igf2 = igf3;
                                            break Label_2219;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination.List.ProjectDetails || claudeAppDestination instanceof ClaudeAppDestination.Detail.ProjectDetails) {
                                            gva.g0(1110989771);
                                            final byte e3 = xv4.e;
                                            final int n27 = n16 >> 3;
                                            fwh.c(claudeAppDestination, frg, gwj, xv4, nx8, jta2, jj6, ax5, vk8, igf3, gva, (n16 & 0x3FE) | e3 << 9 | (n16 & 0x1C00) | (n27 & 0xE000) | (n27 & 0x70000) | 0x8200000 | (0x70000000 & n16 << 6));
                                            igf2 = igf3;
                                            gva.u();
                                            break Label_4389;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination.Detail.ProjectKnowledge) {
                                            gva.g0(1111005632);
                                            final ClaudeAppDestination.Detail.ProjectKnowledge projectKnowledge = (ClaudeAppDestination.Detail.ProjectKnowledge)claudeAppDestination;
                                            final a0 companion5 = ClaudeAppDestination.Detail.ProjectKnowledge.Companion;
                                            fwh.d(projectKnowledge, frg, igf3, gva, (n16 >> 15 & 0x380) | (n16 & 0x7E));
                                            gva.q(false);
                                            igf2 = igf3;
                                            break Label_2219;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination.Detail.CreateTemplateProject) {
                                            gva.g0(1111012389);
                                            final ClaudeAppDestination.Detail.CreateTemplateProject createTemplateProject = (ClaudeAppDestination.Detail.CreateTemplateProject)claudeAppDestination;
                                            final w companion6 = ClaudeAppDestination.Detail.CreateTemplateProject.Companion;
                                            fwh.b(createTemplateProject, frg, igf3, gva, (n16 >> 15 & 0x380) | (n16 & 0x7E));
                                            gva.q(false);
                                            igf2 = igf3;
                                            break Label_2219;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination.Detail.TemplateUploadMaterialScreen) {
                                            gva.g0(1111019485);
                                            final ClaudeAppDestination.Detail.TemplateUploadMaterialScreen templateUploadMaterialScreen = (ClaudeAppDestination.Detail.TemplateUploadMaterialScreen)claudeAppDestination;
                                            final h0 companion7 = ClaudeAppDestination.Detail.TemplateUploadMaterialScreen.Companion;
                                            fwh.e(templateUploadMaterialScreen, frg, gva, n16 & 0x7E);
                                            gva.q(false);
                                            igf2 = igf3;
                                            break Label_2219;
                                        }
                                        if (claudeAppDestination instanceof ClaudeAppDestination.Detail.CodeRemoteSession) {
                                            gva.g0(1111025223);
                                            r85.e((ClaudeAppDestination.Detail.CodeRemoteSession)claudeAppDestination, frg, gwj, lta, qdg3, vk8, igf3, gva, (n16 >> 3 & 0x380000) | (ClaudeAppDestination.Detail.CodeRemoteSession.b | (n16 & 0xE) | (n16 & 0x70) | n17 | 0x40000));
                                            gva.q(false);
                                        }
                                        else {
                                            final qdg qdg4 = qdg3;
                                            if (claudeAppDestination instanceof ClaudeAppDestination$Detail$SessionRouterLoadingScreen) {
                                                gva.g0(1111038475);
                                                final ClaudeAppDestination$Detail$SessionRouterLoadingScreen claudeAppDestination$Detail$SessionRouterLoadingScreen = (ClaudeAppDestination$Detail$SessionRouterLoadingScreen)claudeAppDestination;
                                                final f0 companion8 = ClaudeAppDestination$Detail$SessionRouterLoadingScreen.Companion;
                                                r85.j(claudeAppDestination$Detail$SessionRouterLoadingScreen, frg, jj6, ax5, dh8, igf3, gva, (n16 & 0x7E) | 0x200 | (n16 >> 6 & 0x70000));
                                                gva.q(false);
                                            }
                                            else if (claudeAppDestination instanceof ClaudeAppDestination.Detail.CodeProjectLink) {
                                                gva.g0(1111050411);
                                                final ClaudeAppDestination.Detail.CodeProjectLink codeProjectLink = (ClaudeAppDestination.Detail.CodeProjectLink)claudeAppDestination;
                                                final e companion9 = ClaudeAppDestination.Detail.CodeProjectLink.Companion;
                                                r85.a(codeProjectLink, frg, l9o2, st5, igf3, gva, (n16 & 0xE) | 0x8 | (n16 & 0x70) | (n16 >> 9 & 0xE000));
                                                gva.q(false);
                                            }
                                            else if (claudeAppDestination instanceof ClaudeAppDestination.Detail.CodeSessionOverview) {
                                                gva.g0(1111059468);
                                                final ClaudeAppDestination.Detail.CodeSessionOverview codeSessionOverview = (ClaudeAppDestination.Detail.CodeSessionOverview)claudeAppDestination;
                                                final o companion10 = ClaudeAppDestination.Detail.CodeSessionOverview.Companion;
                                                r85.i(codeSessionOverview, frg, l9o2, igf3, gva, (n16 & 0x7E) | (n16 >> 12 & 0x1C00));
                                                gva.q(false);
                                            }
                                            else {
                                                if (!(claudeAppDestination instanceof ClaudeAppDestination$Detail$CodePullRequest)) {
                                                    if (claudeAppDestination instanceof ClaudeAppDestination.Detail.CodeRoutineDetails) {
                                                        gva.g0(1111074165);
                                                        final ClaudeAppDestination.Detail.CodeRoutineDetails codeRoutineDetails = (ClaudeAppDestination.Detail.CodeRoutineDetails)claudeAppDestination;
                                                        final k companion11 = ClaudeAppDestination.Detail.CodeRoutineDetails.Companion;
                                                        r85.f(codeRoutineDetails, frg, jj6, ax5, vk8, igf3, gva, (n16 >> 6 & 0x70000) | ((n16 & 0x7E) | 0x8200));
                                                        gva.q(false);
                                                    }
                                                    else {
                                                        if (!(claudeAppDestination instanceof ClaudeAppDestination.Detail.CodeRoutineEditor)) {
                                                            if (claudeAppDestination instanceof ClaudeAppDestination.List.Settings) {
                                                                gva.g0(84154833);
                                                                final List a10 = ((ClaudeAppDestination.List.Settings)claudeAppDestination).a.a();
                                                                final w0 companion12 = ClaudeAppDestination.List.Settings.Companion;
                                                                final px4 a11 = ox8.a(nx8, jta2, frg, claudeAppDestination, null, gva, (n16 >> 15 & 0x7E) | (n16 << 3 & 0x380) | (n16 << 9 & 0x1C00), 48);
                                                                final boolean b6 = n17 == 256 || ((n16 & 0x200) != 0x0 && gva.h((Object)gwj));
                                                                final Object r10 = gva.R();
                                                                Object o5;
                                                                if (b6 || (o5 = r10) == a) {
                                                                    o5 = new ei4(gwj, (byte)6);
                                                                    gva.q0(o5);
                                                                }
                                                                final jta jta3 = (jta)o5;
                                                                final boolean b7 = n17 == 256 || ((n16 & 0x200) != 0x0 && gva.h((Object)gwj));
                                                                final Object r11 = gva.R();
                                                                Object o6;
                                                                if (b7 || (o6 = r11) == a) {
                                                                    o6 = new z0(gwj);
                                                                    gva.q0(o6);
                                                                }
                                                                final lta lta2 = (lta)o6;
                                                                final boolean b8 = n17 == 256 || ((n16 & 0x200) != 0x0 && gva.h((Object)gwj));
                                                                final Object r12 = gva.R();
                                                                Object o7;
                                                                if (b8 || (o7 = r12) == a) {
                                                                    o7 = new u84(gwj, (byte)5);
                                                                    gva.q0(o7);
                                                                }
                                                                final zta zta = (zta)o7;
                                                                final boolean b9 = n17 == 256 || ((n16 & 0x200) != 0x0 && gva.h((Object)gwj));
                                                                final Object r13 = gva.R();
                                                                Object o8;
                                                                if (b9 || (o8 = r13) == a) {
                                                                    o8 = new ei4(gwj, (byte)7);
                                                                    gva.q0(o8);
                                                                }
                                                                final jta jta4 = (jta)o8;
                                                                final ye6 a12 = k1r.a;
                                                                final ye6 b10 = k1r.b;
                                                                final px4 f17 = px4.f;
                                                                b.a(a10, a11, jta3, lta, jta, lta2, zta, jta4, a12, (bua)b10, gva, (n16 & 0xE000) | 0x36000000, 0);
                                                                gva.q(false);
                                                            }
                                                            else {
                                                                if (!(claudeAppDestination instanceof ClaudeAppDestination.List.AgentChat)) {
                                                                    gva.g0(1110811064);
                                                                    gva.u();
                                                                    en9.r();
                                                                    return;
                                                                }
                                                                gva.g0(85921616);
                                                                final boolean b11 = (n16 & 0x70) == 0x20 || ((n16 & 0x40) != 0x0 && gva.h((Object)frg));
                                                                final Object r14 = gva.R();
                                                                Object o9;
                                                                if (b11 || (o9 = r14) == a) {
                                                                    o9 = new a1(frg);
                                                                    gva.q0(o9);
                                                                }
                                                                final lta lta3 = (lta)o9;
                                                                final px4 a13 = ox8.a(nx8, jta2, frg, claudeAppDestination, null, gva, (n16 >> 15 & 0x7E) | (n16 << 3 & 0x380) | (n16 << 9 & 0x1C00), 48);
                                                                final px4 f18 = px4.f;
                                                                fp.a(a13, lta3, (igf)null, gva, 0);
                                                                gva.u();
                                                            }
                                                            qdg3 = qdg4;
                                                            break Label_4389;
                                                        }
                                                        gva.g0(1111085409);
                                                        final ClaudeAppDestination.Detail.CodeRoutineEditor codeRoutineEditor = (ClaudeAppDestination.Detail.CodeRoutineEditor)claudeAppDestination;
                                                        final m companion13 = ClaudeAppDestination.Detail.CodeRoutineEditor.Companion;
                                                        r85.g(codeRoutineEditor, frg, igf3, gva, (n16 >> 15 & 0x380) | (n16 & 0x7E));
                                                        gva.q(false);
                                                    }
                                                    qdg3 = qdg4;
                                                    break Label_4389;
                                                }
                                                gva.g0(1111067391);
                                                final ClaudeAppDestination$Detail$CodePullRequest claudeAppDestination$Detail$CodePullRequest = (ClaudeAppDestination$Detail$CodePullRequest)claudeAppDestination;
                                                final g companion14 = ClaudeAppDestination$Detail$CodePullRequest.Companion;
                                                r85.c(claudeAppDestination$Detail$CodePullRequest, frg, igf3, gva, (n16 >> 15 & 0x380) | (n16 & 0x7E));
                                                gva.q(false);
                                            }
                                        }
                                        igf2 = igf3;
                                        break Label_4389;
                                    }
                                    vk6 = vk7;
                                    break Label_4389;
                                }
                                gva.g0(76512837);
                                final odk a14 = ii8.a(gva);
                                final boolean f19 = gva.f((Object)null);
                                final boolean f20 = gva.f((Object)a14);
                                final Object r15 = gva.R();
                                Object o10;
                                if ((f19 | f20) || (o10 = r15) == a) {
                                    o10 = a14.d((Class)krf.class, (emi)null);
                                    gva.q0(o10);
                                }
                                final krf krf = (krf)o10;
                                final j6a j6a = (j6a)krf.D.getValue();
                                if (j6a != null && !j6a.a()) {
                                    gva.g0(76701782);
                                    final odk a15 = ii8.a(gva);
                                    final boolean f21 = gva.f((Object)null);
                                    final boolean f22 = gva.f((Object)a15);
                                    final Object r16 = gva.R();
                                    Object o11;
                                    if ((f21 | f22) || (o11 = r16) == a) {
                                        o11 = a15.d((Class)v5a.class, (emi)null);
                                        gva.q0(o11);
                                    }
                                    final v5a v5a = (v5a)o11;
                                    final boolean b12 = (n16 & 0x70) == 0x20 || ((n16 & 0x40) != 0x0 && gva.h((Object)frg));
                                    final boolean f23 = gva.f((Object)v5a);
                                    final boolean h = gva.h((Object)krf);
                                    final Object r17 = gva.R();
                                    Object o12;
                                    if ((b12 | f23 | h) || (o12 = r17) == a) {
                                        o12 = new x0((f07)null, v5a, krf, frg);
                                        gva.q0(o12);
                                    }
                                    mlc.f((zta)o12, gva, (Object)lqo.a);
                                    gva.q(false);
                                    gva.q(false);
                                    final b0j v2 = gva.v();
                                    if (v2 != null) {
                                        v2.d = (zta)new ku4(claudeAppDestination, frg, gwj, xv4, jta, nx8, jta2, igf2, jj6, ax5, l9o2, qdg3, st5, u89, vk7, dh8, n, (byte)0);
                                    }
                                    return;
                                }
                                else {
                                    gva.g0(76914163);
                                    gva.q(false);
                                    final int n28 = n16 >> 15;
                                    final px4 a16 = ox8.a(nx8, jta2, frg, claudeAppDestination, null, gva, (n28 & 0x7E) | (n16 << 3 & 0x380) | (n16 << 9 & 0x1C00), 48);
                                    final boolean b13 = (n16 & 0x70) == 0x20 || ((n16 & 0x40) != 0x0 && gva.h((Object)frg));
                                    final boolean h2 = gva.h((Object)jj6);
                                    final Object r18 = gva.R();
                                    Object o13;
                                    if ((b13 | h2) || (o13 = r18) == a) {
                                        o13 = new y0(frg, jj6);
                                        gva.q0(o13);
                                    }
                                    final zta zta2 = (zta)o13;
                                    final px4 f24 = px4.f;
                                    l01.a(a16, zta2, igf2, (st4)null, (i01)null, gva, n28 & 0x380);
                                    gva.q(false);
                                }
                            }
                            vk6 = vk7;
                            break Label_4389;
                        }
                        gva.g0(1110835382);
                        final ClaudeAppDestination.List.AllProjectsList list2 = (ClaudeAppDestination.List.AllProjectsList)claudeAppDestination;
                        final int n29 = n16 >> 6;
                        fwh.a(list2, frg, gwj, nx8, jta2, igf2, gva, (n29 & 0x70000) | ((n16 & 0x3FE) | (n29 & 0x1C00) | (n29 & 0xE000)));
                        gva.q(false);
                    }
                }
                vk6 = vk7;
            }
            final u88 u91 = u89;
            final vk6 vk9 = vk7;
            jj7 = jj5;
            final ax3 ax6 = ax4;
            final u88 u92 = u91;
            l9o3 = l9o2;
            final qdg qdg5 = qdg3;
            ax7 = ax6;
            qdg = qdg5;
            st6 = st5;
            u93 = u92;
            vk10 = vk9;
        }
        else {
            gva.Z();
            u93 = u88;
            dh8 = dh7;
            vk10 = vk6;
            st6 = st4;
            l9o3 = l9o;
            ax7 = ax3;
            jj7 = jj4;
            igf2 = igf;
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new ku4(claudeAppDestination, frg, gwj, xv4, jta, nx8, jta2, igf2, jj7, ax7, l9o3, qdg, st6, u93, vk10, dh8, n, (byte)1);
        }
    }
    
    public static final void b(final frg frg, final jj4 jj4, final String s) {
        r6k.Y((brg)frg, (ClaudeAppDestination.Detail)new ClaudeAppDestination.Detail.Chat(jj4.b(jj4, (String)null, s, (String)null, false, true, (String)null, (whp)null, 236)));
    }
    
    public static final void c(final frg frg, final String s) {
        final ProjectDetailsScreenParams projectDetailsScreenParams = new ProjectDetailsScreenParams(s);
        if (((rp4)frg.w.getValue()).d == zp4.v) {
            r6k.N((brg)frg, (ClaudeAppDestination.Detail)new ClaudeAppDestination.Detail.ProjectDetails(projectDetailsScreenParams), 6);
            return;
        }
        r6k.O((brg)frg, (ClaudeAppDestination.List)new ClaudeAppDestination.List.ProjectDetails(projectDetailsScreenParams));
    }
}
