package com.anthropic.claude.app;

import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.types.strings.NewSessionComposerId;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.chat.ChatScreenParams;

public abstract class c1
{
    public static final String a(final ClaudeAppDestination.Detail detail) {
        ClaudeAppDestination.Detail.Chat chat;
        if (detail instanceof ClaudeAppDestination.Detail.Chat) {
            chat = (ClaudeAppDestination.Detail.Chat)detail;
        }
        else {
            chat = null;
        }
        pm4 a2 = null;
        Label_0040: {
            if (chat != null) {
                final ChatScreenParams a = chat.a;
                if (a != null) {
                    a2 = a.a;
                    break Label_0040;
                }
            }
            a2 = null;
        }
        final int m = ju4.m(a2);
        if (m != -1) {
            if (m == 0) {
                return ((nm4)a2).a;
            }
            if (m != 1) {
                en9.r();
                return null;
            }
        }
        return null;
    }
    
    public static final String b(final ClaudeAppDestination.Detail detail, final vk6 vk6) {
        if (detail != null) {
            if (detail instanceof ClaudeAppDestination.Detail.CodeRemoteSession) {
                final CodeRemoteSessionScreenParams a = ((ClaudeAppDestination.Detail.CodeRemoteSession)detail).a;
                final String b = a.b();
                if (b != null) {
                    return b;
                }
                final String a2 = a.a();
                if (a2 != null) {
                    final SessionId sessionId = (SessionId)vk6.b.get((Object)NewSessionComposerId.a(a2));
                    String a3;
                    if (sessionId != null) {
                        a3 = sessionId.a;
                    }
                    else {
                        a3 = null;
                    }
                    SessionId sessionId2;
                    if (a3 != null) {
                        sessionId2 = new SessionId(a3);
                    }
                    else {
                        sessionId2 = null;
                    }
                    if (sessionId2 != null) {
                        return sessionId2.a;
                    }
                }
            }
            else {
                if (detail instanceof ClaudeAppDestination.Detail.CodeSessionOverview) {
                    return ((ClaudeAppDestination.Detail.CodeSessionOverview)detail).a.a();
                }
                if (detail instanceof ClaudeAppDestination$Detail$CodePullRequest) {
                    return ((ClaudeAppDestination$Detail$CodePullRequest)detail).g().c();
                }
                if (detail instanceof ClaudeAppDestination$Detail$SessionRouterLoadingScreen) {
                    return ((ClaudeAppDestination$Detail$SessionRouterLoadingScreen)detail).g();
                }
                if (detail instanceof ClaudeAppDestination.Detail.Chat) {
                    final ChatScreenParams a4 = ((ClaudeAppDestination.Detail.Chat)detail).a;
                    final pm4 a5 = a4.a;
                    if (a5 != null) {
                        if (a5 instanceof om4) {
                            return ((om4)a5).a;
                        }
                        if (a5 instanceof nm4) {
                            return a4.h;
                        }
                    }
                    en9.r();
                    return null;
                }
                if (!(detail instanceof ClaudeAppDestination.Detail.ProjectKnowledge)) {
                    if (!(detail instanceof ClaudeAppDestination.Detail.ProjectDetails)) {
                        if (!(detail instanceof ClaudeAppDestination.Detail.CreateTemplateProject)) {
                            if (!(detail instanceof ClaudeAppDestination.Detail.TemplateUploadMaterialScreen)) {
                                if (!(detail instanceof ClaudeAppDestination.Detail.CodeRoutineDetails)) {
                                    if (!(detail instanceof ClaudeAppDestination.Detail.CodeRoutineEditor)) {
                                        if (!(detail instanceof ClaudeAppDestination.Detail.CodeProjectLink)) {
                                            if (!(detail instanceof ClaudeAppDestination$Detail$CoworkScheduledTask)) {
                                                if (!(detail instanceof ClaudeAppDestination$Detail$CoworkScheduledTaskHistory)) {
                                                    en9.r();
                                                    return null;
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
        return null;
    }
}
