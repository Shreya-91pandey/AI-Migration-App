package com.anthropic.claude.app;

import com.anthropic.claude.analytics.screens.AnalyticsScreens$ScheduledRunsEntryPoint;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.project.create.UploadMaterialsScreenParams;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeScreenParams;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.code.remote.SessionOverviewScreenParams;
import com.anthropic.claude.types.strings.TriggerId;
import com.anthropic.claude.analytics.events.CodeEvents$RoutinesEntryPoint;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.types.strings.SessionGroupingId;
import com.anthropic.claude.chat.ChatScreenParams;

@jzk
public interface ClaudeAppDestination extends vqd
{
    public static final a Companion = a.a;
    
    default boolean c() {
        return false;
    }
    
    default boolean e() {
        return false;
    }
    
    default boolean f() {
        return false;
    }
    
    @jzk
    public interface Detail extends ClaudeAppDestination
    {
        public static final p Companion = p.a;
        
        @jzk
        public static final class Chat implements Detail
        {
            public static final c Companion;
            public final ChatScreenParams a = a;
            
            static {
                Companion = (c)new Object();
            }
            
            public Chat(final ChatScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 1;
            }
            
            @Override
            public final boolean c() {
                return this.a.g;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof Chat && mlc.q((Object)this.a, (Object)((Chat)o).a));
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("Chat(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class CodeProjectLink implements Detail
        {
            public static final e Companion;
            public final String a = a;
            public final d0 b = new b0((b1i)null);
            
            static {
                Companion = new e();
            }
            
            public CodeProjectLink(final d0 b, final String a) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this != o) {
                    if (o instanceof CodeProjectLink) {
                        final CodeProjectLink codeProjectLink = (CodeProjectLink)o;
                        if (SessionGroupingId.b(this.a, codeProjectLink.a)) {
                            if (this.b.equals(codeProjectLink.b)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
            
            public final b1i g() {
                final d0 b = this.b;
                final int u = ju4.u((Object)b);
                if (u == 0) {
                    return ((b0)b).a();
                }
                if (u == 1) {
                    return (b1i)new z0i(((c0)b).a());
                }
                en9.r();
                return null;
            }
            
            @Override
            public final int hashCode() {
                return this.b.hashCode() + SessionGroupingId.c(this.a) * 31;
            }
            
            @Override
            public final String toString() {
                final String d = SessionGroupingId.d(this.a);
                final StringBuilder sb = new StringBuilder("CodeProjectLink(projectId=");
                sb.append(d);
                sb.append(", opener=");
                sb.append((Object)this.b);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class CodeRemoteSession implements Detail
        {
            public static final i Companion;
            public static final byte b;
            public final CodeRemoteSessionScreenParams a = a;
            
            static {
                Companion = new i();
                final b46 companion = CodeRemoteSessionScreenParams.Companion;
                b = 8;
            }
            
            public CodeRemoteSession(final CodeRemoteSessionScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean c() {
                return this.a.c();
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof CodeRemoteSession && mlc.q((Object)this.a, (Object)((CodeRemoteSession)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("CodeRemoteSession(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class CodeRoutineDetails implements Detail
        {
            public static final k Companion;
            public static final d2d[] c;
            public final String a = a;
            public final CodeEvents$RoutinesEntryPoint b;
            
            static {
                Companion = new k();
                c = new d2d[] { null, ncq.F(2, (jta)new kt4((byte)10)) };
            }
            
            public CodeRoutineDetails(final CodeEvents$RoutinesEntryPoint b, final String a) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof CodeRoutineDetails)) {
                    return false;
                }
                final CodeRoutineDetails codeRoutineDetails = (CodeRoutineDetails)o;
                return TriggerId.b(this.a, codeRoutineDetails.a) && this.b == codeRoutineDetails.b;
            }
            
            @Override
            public final int hashCode() {
                return this.b.hashCode() + TriggerId.c(this.a) * 31;
            }
            
            @Override
            public final String toString() {
                final String d = TriggerId.d(this.a);
                final StringBuilder sb = new StringBuilder("CodeRoutineDetails(triggerId=");
                sb.append(d);
                sb.append(", entryPoint=");
                sb.append((Object)this.b);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class CodeRoutineEditor implements Detail
        {
            public static final m Companion;
            public final String a = a;
            
            static {
                Companion = new m();
            }
            
            public CodeRoutineEditor(final String a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof CodeRoutineEditor && TriggerId.b(this.a, ((CodeRoutineEditor)o).a));
            }
            
            @Override
            public final int hashCode() {
                return TriggerId.c(this.a);
            }
            
            @Override
            public final String toString() {
                return hia.k("CodeRoutineEditor(triggerId=", TriggerId.d(this.a), ")");
            }
        }
        
        @jzk
        public static final class CodeSessionOverview implements Detail
        {
            public static final o Companion;
            public final SessionOverviewScreenParams a = a;
            
            static {
                Companion = new o();
            }
            
            public CodeSessionOverview(final SessionOverviewScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof CodeSessionOverview && mlc.q((Object)this.a, (Object)((CodeSessionOverview)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("CodeSessionOverview(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class CreateTemplateProject implements Detail
        {
            public static final w Companion;
            public final CreateTemplateProjectScreenParams a = a;
            
            static {
                Companion = new w();
            }
            
            public CreateTemplateProject(final CreateTemplateProjectScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean e() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof CreateTemplateProject && mlc.q((Object)this.a, (Object)((CreateTemplateProject)o).a));
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("CreateTemplateProject(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class ProjectDetails implements Detail
        {
            public static final y Companion;
            public final ProjectDetailsScreenParams a = a;
            
            static {
                Companion = new y();
            }
            
            public ProjectDetails(final ProjectDetailsScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean c() {
                return this.a.b();
            }
            
            @Override
            public final boolean e() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof ProjectDetails && mlc.q((Object)this.a, (Object)((ProjectDetails)o).a));
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("ProjectDetails(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class ProjectKnowledge implements Detail
        {
            public static final a0 Companion;
            public final ProjectKnowledgeScreenParams a = a;
            
            static {
                Companion = new a0();
            }
            
            public ProjectKnowledge(final ProjectKnowledgeScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean e() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof ProjectKnowledge && mlc.q((Object)this.a, (Object)((ProjectKnowledge)o).a));
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("ProjectKnowledge(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class TemplateUploadMaterialScreen implements Detail
        {
            public static final h0 Companion;
            public final UploadMaterialsScreenParams a = a;
            
            static {
                Companion = new h0();
            }
            
            public TemplateUploadMaterialScreen(final UploadMaterialsScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean e() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof TemplateUploadMaterialScreen && mlc.q((Object)this.a, (Object)((TemplateUploadMaterialScreen)o).a));
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("TemplateUploadMaterialScreen(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
    }
    
    @jzk
    public interface Extra extends ClaudeAppDestination
    {
        public static final i0 Companion = i0.a;
    }
    
    @jzk
    public interface List extends ClaudeAppDestination
    {
        public static final l0 Companion = l0.a;
        
        @jzk
        public static final class AgentChat implements List
        {
            public static final AgentChat INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (AgentChat)new Object();
                a = ncq.F(2, (jta)new h64((byte)18));
            }
            
            @Override
            public final int a() {
                return 3;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof AgentChat;
            }
            
            @Override
            public final int hashCode() {
                return -1145697438;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)AgentChat.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "AgentChat";
            }
        }
        
        @jzk
        public static final class AllChatsList implements List
        {
            public static final AllChatsList INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (AllChatsList)new Object();
                a = ncq.F(2, (jta)new h64((byte)19));
            }
            
            @Override
            public final int a() {
                return 1;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof AllChatsList;
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return 1048944947;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)AllChatsList.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "AllChatsList";
            }
        }
        
        @jzk
        public static final class AllProjectsList implements List
        {
            public static final AllProjectsList INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (AllProjectsList)new Object();
                a = ncq.F(2, (jta)new h64((byte)20));
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean e() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof AllProjectsList;
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return -1409171426;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)AllProjectsList.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "AllProjectsList";
            }
        }
        
        @jzk
        public static final class ArtifactGallery implements List
        {
            public static final ArtifactGallery INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (ArtifactGallery)new Object();
                a = ncq.F(2, (jta)new h64((byte)21));
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof ArtifactGallery;
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return -213048123;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)ArtifactGallery.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "ArtifactGallery";
            }
        }
        
        @jzk
        public static final class CodeProjects implements List
        {
            public static final CodeProjects INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (CodeProjects)new Object();
                a = ncq.F(2, (jta)new h64((byte)22));
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean c() {
                return false;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof CodeProjects;
            }
            
            @Override
            public final int hashCode() {
                return -661378046;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)CodeProjects.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "CodeProjects";
            }
        }
        
        @jzk
        public static final class CodeRemote implements List
        {
            public static final CodeRemote INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (CodeRemote)new Object();
                a = ncq.F(2, (jta)new h64((byte)23));
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof CodeRemote;
            }
            
            @Override
            public final int hashCode() {
                return -911913522;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)CodeRemote.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "CodeRemote";
            }
        }
        
        @jzk
        public static final class CodeRoutines implements List
        {
            public static final k0 Companion;
            public static final d2d[] b;
            public final CodeEvents$RoutinesEntryPoint a;
            
            static {
                Companion = new k0();
                b = new d2d[] { ncq.F(2, (jta)new kt4((byte)11)) };
            }
            
            public CodeRoutines(final CodeEvents$RoutinesEntryPoint a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean c() {
                return false;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof CodeRoutines && this.a == ((CodeRoutines)o).a);
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("CodeRoutines(entryPoint=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class CoworkRemote implements List
        {
            public static final CoworkRemote INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (CoworkRemote)new Object();
                a = ncq.F(2, (jta)new h64((byte)24));
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof CoworkRemote;
            }
            
            @Override
            public final int hashCode() {
                return -326037858;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)CoworkRemote.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "CoworkRemote";
            }
        }
        
        @jzk
        public static final class CoworkRoutines implements List
        {
            public static final CoworkRoutines INSTANCE;
            public static final d2d a;
            
            static {
                INSTANCE = (CoworkRoutines)new Object();
                a = ncq.F(2, (jta)new h64((byte)25));
            }
            
            @Override
            public final int a() {
                return 2;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || o instanceof CoworkRoutines;
            }
            
            @Override
            public final int hashCode() {
                return 728668295;
            }
            
            public final KSerializer serializer() {
                return (KSerializer)CoworkRoutines.a.getValue();
            }
            
            @Override
            public final String toString() {
                return "CoworkRoutines";
            }
        }
        
        @jzk
        public interface CoworkScheduled extends List
        {
            public static final m0 Companion = m0.a;
            
            default int a() {
                return 2;
            }
        }
        
        @jzk
        public static final class CoworkScheduledTaskRuns implements CoworkScheduled
        {
            public static final q0 Companion;
            public final String a = a;
            public final String b = b;
            
            static {
                Companion = new q0();
            }
            
            public CoworkScheduledTaskRuns(final String a, final String b) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof CoworkScheduledTaskRuns)) {
                    return false;
                }
                final CoworkScheduledTaskRuns coworkScheduledTaskRuns = (CoworkScheduledTaskRuns)o;
                return TriggerId.b(this.a, coworkScheduledTaskRuns.a) && mlc.q((Object)this.b, (Object)coworkScheduledTaskRuns.b);
            }
            
            @Override
            public final int hashCode() {
                return this.b.hashCode() + TriggerId.c(this.a) * 31;
            }
            
            @Override
            public final String toString() {
                return lmf.t("CoworkScheduledTaskRuns(triggerId=", TriggerId.d(this.a), ", taskName=", this.b, ")");
            }
        }
        
        @jzk
        public static final class CoworkScheduledTasks implements CoworkScheduled
        {
            public static final s0 Companion;
            public static final d2d[] b;
            public final AnalyticsScreens$ScheduledRunsEntryPoint a;
            
            static {
                Companion = new s0();
                b = new d2d[] { ncq.F(2, (jta)new kt4((byte)12)) };
            }
            
            public CoworkScheduledTasks(final AnalyticsScreens$ScheduledRunsEntryPoint a) {
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof CoworkScheduledTasks && this.a == ((CoworkScheduledTasks)o).a);
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("CoworkScheduledTasks(entryPoint=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class ProjectDetails implements List
        {
            public static final u0 Companion;
            public final ProjectDetailsScreenParams a = a;
            
            static {
                Companion = new u0();
            }
            
            public ProjectDetails(final ProjectDetailsScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean c() {
                return this.a.b();
            }
            
            @Override
            public final boolean e() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof ProjectDetails && mlc.q((Object)this.a, (Object)((ProjectDetails)o).a));
            }
            
            @Override
            public final boolean f() {
                return true;
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("ProjectDetails(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        @jzk
        public static final class Settings implements List
        {
            public static final w0 Companion;
            public final SettingsScreenParams a = a;
            
            static {
                Companion = new w0();
            }
            
            public Settings(final SettingsScreenParams a) {
                this.a = a;
            }
            
            @Override
            public final int a() {
                return 4;
            }
            
            @Override
            public final boolean c() {
                return true;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof Settings && mlc.q((Object)this.a, (Object)((Settings)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("Settings(params=");
                sb.append((Object)this.a);
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
