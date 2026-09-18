package com.anthropic.claude.app;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

public final class l0
{
    public static final l0 a;
    
    static {
        a = (l0)new Object();
    }
    
    public final KSerializer serializer() {
        return (KSerializer)new mkk("com.anthropic.claude.app.ClaudeAppDestination.List", v4j.a((Class)ClaudeAppDestination.List.class), new rtc[] { (rtc)v4j.a((Class)ClaudeAppDestination.List.AgentChat.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.AllChatsList.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.AllProjectsList.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.ArtifactGallery.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.CodeProjects.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.CodeRemote.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.CodeRoutines.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.CoworkRemote.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.CoworkRoutines.class), (rtc)v4j.a((Class)ClaudeAppDestination$List$CoworkScheduledTaskHistory.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.CoworkScheduledTaskRuns.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.CoworkScheduledTasks.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.ProjectDetails.class), (rtc)v4j.a((Class)ClaudeAppDestination.List.Settings.class) }, new KSerializer[] { (KSerializer)new xd9("com.anthropic.claude.app.ClaudeAppDestination.List.AgentChat", (Object)ClaudeAppDestination.List.AgentChat.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.ClaudeAppDestination.List.AllChatsList", (Object)ClaudeAppDestination.List.AllChatsList.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.ClaudeAppDestination.List.AllProjectsList", (Object)ClaudeAppDestination.List.AllProjectsList.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.ClaudeAppDestination.List.ArtifactGallery", (Object)ClaudeAppDestination.List.ArtifactGallery.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.ClaudeAppDestination.List.CodeProjects", (Object)ClaudeAppDestination.List.CodeProjects.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.ClaudeAppDestination.List.CodeRemote", (Object)ClaudeAppDestination.List.CodeRemote.INSTANCE, new Annotation[0]), (KSerializer)j0.a, (KSerializer)new xd9("dramaticShrimp", (Object)ClaudeAppDestination.List.CoworkRemote.INSTANCE, new Annotation[0]), (KSerializer)new xd9("com.anthropic.claude.app.ClaudeAppDestination.List.CoworkRoutines", (Object)ClaudeAppDestination.List.CoworkRoutines.INSTANCE, new Annotation[0]), (KSerializer)n0.a, (KSerializer)p0.a, (KSerializer)r0.a, (KSerializer)t0.a, (KSerializer)v0.a }, new Annotation[0]);
    }
}
