package com.anthropic.claude.app;

import java.util.List;

public abstract class a3
{
    public static final ClaudeAppDestination.List a(final v5a v5a, final krf krf) {
        if (v5a.b.getValue()) {
            return (ClaudeAppDestination.List)ClaudeAppDestination.List.AllChatsList.INSTANCE;
        }
        if (krf.g()) {
            return (ClaudeAppDestination.List)ClaudeAppDestination.List.CodeRemote.INSTANCE;
        }
        if (krf.l()) {
            return (ClaudeAppDestination.List)ClaudeAppDestination.List.CoworkRemote.INSTANCE;
        }
        if (krf.f()) {
            return (ClaudeAppDestination.List)ClaudeAppDestination.List.AgentChat.INSTANCE;
        }
        return (ClaudeAppDestination.List)new ClaudeAppDestination.List.Settings(new SettingsScreenParams((List)null, 3));
    }
    
    public static final ClaudeAppDestination.List b(final tx8 tx8, final v5a v5a, final krf krf) {
        final boolean booleanValue = (boolean)v5a.b.getValue();
        final int ordinal = ((Enum)tx8).ordinal();
        final ClaudeAppDestination.List list = null;
        Object o;
        if (ordinal != 0) {
            boolean a = true;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                en9.r();
                                return null;
                            }
                            final ClaudeAppDestination.List.AgentChat instance = ClaudeAppDestination.List.AgentChat.INSTANCE;
                            o = list;
                            if (krf.f()) {
                                o = instance;
                            }
                        }
                        else {
                            final ClaudeAppDestination.List.CoworkRemote instance2 = ClaudeAppDestination.List.CoworkRemote.INSTANCE;
                            o = list;
                            if (krf.l()) {
                                o = instance2;
                            }
                        }
                    }
                    else {
                        final ClaudeAppDestination.List.CodeRemote instance3 = ClaudeAppDestination.List.CodeRemote.INSTANCE;
                        o = list;
                        if (krf.i()) {
                            o = instance3;
                        }
                    }
                }
                else {
                    final ClaudeAppDestination.List.ArtifactGallery instance4 = ClaudeAppDestination.List.ArtifactGallery.INSTANCE;
                    o = list;
                    if (booleanValue) {
                        final j6a j6a = (j6a)krf.D.getValue();
                        if (j6a != null) {
                            a = j6a.a();
                        }
                        o = list;
                        if (a) {
                            o = instance4;
                        }
                    }
                }
            }
            else {
                final ClaudeAppDestination.List.AllProjectsList instance5 = ClaudeAppDestination.List.AllProjectsList.INSTANCE;
                o = list;
                if (booleanValue) {
                    o = list;
                    if (!krf.n()) {
                        o = instance5;
                    }
                }
            }
        }
        else {
            final ClaudeAppDestination.List.AllChatsList instance6 = ClaudeAppDestination.List.AllChatsList.INSTANCE;
            o = list;
            if (booleanValue) {
                o = instance6;
            }
        }
        if (o == null) {
            return a(v5a, krf);
        }
        return (ClaudeAppDestination.List)o;
    }
}
