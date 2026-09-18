import com.anthropic.claude.code.remote.CodeSessionListScope$DramaticShrimp;
import com.anthropic.claude.code.remote.CodeSessionListScope$Code;
import java.util.Iterator;
import java.util.ArrayList;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.analytics.events.CodeEvents$CodeSessionListEntrySource;
import com.anthropic.claude.app.ClaudeAppDestination;

public abstract class mal
{
    public static final void a(final frg frg, final ClaudeAppDestination.List list, final t46 t46, final CodeEvents$CodeSessionListEntrySource codeEvents$CodeSessionListEntrySource, final krf krf) {
        b(frg, list, t46, codeEvents$CodeSessionListEntrySource, krf);
        frg.b((lta)new qcg(list, frg, (byte)1), (zta)htj.x);
    }
    
    public static final void b(final frg frg, final ClaudeAppDestination.List list, final t46 t46, final CodeEvents$CodeSessionListEntrySource codeEvents$CodeSessionListEntrySource, final krf krf) {
        final CodeSessionListScope c = c(list, krf);
        if (c != null) {
            final ArrayList a = ((rp4)frg.w.getValue()).a;
            if (!a.isEmpty()) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    if (mlc.q(((fp4)iterator.next()).a, (Object)list)) {
                        final s46 a2 = t46.a;
                        CodeSessionListScope a3;
                        if (a2 != null) {
                            a3 = a2.a();
                        }
                        else {
                            a3 = null;
                        }
                        if (!mlc.q((Object)a3, (Object)c)) {
                            return;
                        }
                        break;
                    }
                }
            }
            t46.a = new s46(codeEvents$CodeSessionListEntrySource, c);
        }
    }
    
    public static final CodeSessionListScope c(final ClaudeAppDestination.List list, final krf krf) {
        if (mlc.q((Object)list, (Object)ClaudeAppDestination.List.CodeRemote.INSTANCE)) {
            final CodeSessionListScope$Code instance = CodeSessionListScope$Code.INSTANCE;
            if (krf.g()) {
                return (CodeSessionListScope)instance;
            }
            return null;
        }
        else if (mlc.q((Object)list, (Object)ClaudeAppDestination.List.CoworkRemote.INSTANCE)) {
            final CodeSessionListScope$DramaticShrimp instance2 = CodeSessionListScope$DramaticShrimp.INSTANCE;
            if (krf.l()) {
                return (CodeSessionListScope)instance2;
            }
            return null;
        }
        else {
            if (!mlc.q((Object)list, (Object)ClaudeAppDestination.List.AllChatsList.INSTANCE) && !mlc.q((Object)list, (Object)ClaudeAppDestination.List.AllProjectsList.INSTANCE) && !mlc.q((Object)list, (Object)ClaudeAppDestination.List.ArtifactGallery.INSTANCE) && !(list instanceof ClaudeAppDestination.List.CodeRoutines) && !mlc.q((Object)list, (Object)ClaudeAppDestination.List.CodeProjects.INSTANCE) && !mlc.q((Object)list, (Object)ClaudeAppDestination.List.CoworkRoutines.INSTANCE) && !(list instanceof ClaudeAppDestination.List.CoworkScheduled) && !(list instanceof ClaudeAppDestination.List.ProjectDetails) && !mlc.q((Object)list, (Object)ClaudeAppDestination.List.AgentChat.INSTANCE) && !(list instanceof ClaudeAppDestination.List.Settings)) {
                en9.r();
                return null;
            }
            return null;
        }
    }
    
    public static final CodeEvents$CodeSessionListEntrySource d(final String s) {
        if (s.equals("Widget") || s.equals("WidgetTile") || s.equals("Shortcut")) {
            return CodeEvents$CodeSessionListEntrySource.A;
        }
        if (s.equals("DeepLink")) {
            return CodeEvents$CodeSessionListEntrySource.z;
        }
        if (!s.equals("Notification") && !s.equals("ResearchPush")) {
            return CodeEvents$CodeSessionListEntrySource.w;
        }
        return CodeEvents$CodeSessionListEntrySource.y;
    }
}
