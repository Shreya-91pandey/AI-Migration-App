package com.anthropic.claude.analytics;

import java.util.Iterator;
import java.util.UUID;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$AddCustomConnectorWebScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$CoworkScheduledRunsListScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatListScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreen;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.KSerializer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap$KeySetView;
import java.util.List;

public final class b implements st4
{
    public final s10 a;
    public final jqc b;
    public final gy7 c;
    public final List d;
    public final ConcurrentHashMap$KeySetView e;
    
    public b(final s10 a, final jqc b, final gy7 c, final List d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final ConcurrentHashMap$KeySetView keySet = ConcurrentHashMap.newKeySet();
        keySet.getClass();
        this.e = keySet;
    }
    
    @Override
    public final Object a(final String v, final w1n w, String x, final f07 f07) {
        final s10 a = this.a;
        final tze w2 = a.w;
        ut4 ut5 = null;
        Label_0075: {
            if (f07 instanceof ut4) {
                final ut4 ut4 = (ut4)f07;
                final int a2 = ut4.A;
                if ((a2 & Integer.MIN_VALUE) != 0x0) {
                    ut4.A = a2 + Integer.MIN_VALUE;
                    ut5 = ut4;
                    break Label_0075;
                }
            }
            ut5 = new ut4(this, (h07)f07);
        }
        final Object y = ut5.y;
        final int a3 = ut5.A;
        final String s = null;
        String x2;
        w1n w3;
        if (a3 != 0) {
            if (a3 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x2 = ut5.x;
            w3 = ut5.w;
            x = ut5.v;
            vt4.g0(y);
        }
        else {
            vt4.g0(y);
            final xtm xtm = (xtm)w2.w;
            final us4 a4 = v4j.a((Class)k2p.class);
            ut5.v = v;
            ut5.w = w;
            ut5.x = x;
            ut5.A = 1;
            final Object a5 = xtm.a((rtc)a4, (h07)ut5);
            final pc7 v2 = pc7.v;
            if (a5 == v2) {
                return v2;
            }
            x2 = x;
            x = v;
            w3 = w;
        }
        final JsonObject c = a.z.c;
        if (c != null && !c.v.isEmpty()) {
            final iqc d = jqc.d;
            d.getClass();
            final tt4 companion = ClaudeAnalyticsImpl$Traits.Companion;
            final KSerializer kSerializer = companion.serializer();
            final JsonObject c2 = a.z.c;
            Object a6;
            if (c2 != null) {
                a6 = ((jqc)d).a(kSerializer, (JsonElement)c2);
            }
            else {
                a6 = null;
            }
            final ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits = (ClaudeAnalyticsImpl$Traits)a6;
            if (claudeAnalyticsImpl$Traits != null) {
                final String c3 = claudeAnalyticsImpl$Traits.c;
                final String a7 = claudeAnalyticsImpl$Traits.a;
                final String b = claudeAnalyticsImpl$Traits.b;
                if (mlc.q((Object)b, (Object)x)) {
                    if (w3 != null) {
                        x = w3.v;
                    }
                    else {
                        x = null;
                    }
                    final ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits2 = new ClaudeAnalyticsImpl$Traits(a7, b, c3, x, x2);
                    uh0.a.getClass();
                    final JsonObject i = jrc.i(x90.N((jqc)d, (Object)claudeAnalyticsImpl$Traits2, (KSerializer)companion.serializer()));
                    rhc.G((oc7)w2.y, (hc7)w2.x, 0, (zta)new p10((Object)a, (Object)i, (f07)null, (byte)0), 2);
                    a.e((BaseEvent)new IdentifyEvent("", i));
                    String v3 = s;
                    if (w3 != null) {
                        v3 = w3.v;
                    }
                    gy7.a(this.c, a7, b, c3, v3);
                }
            }
        }
        else {
            oz1.x("Cannot update subscription analytics traits, no existing traits found", (lpl)null, (List)null, 7);
        }
        return lqo.a;
    }
    
    @Override
    public final void b(final v10 v10, KSerializer iterator) {
        final JsonObject i = jrc.i(x90.N(this.b, (Object)v10, iterator));
        JsonObject d;
        if ((d = g33.d(i)) == null) {
            d = i;
        }
        final List a = adn.a;
        adn.d("\ud83d\udcca ".concat(v10.a()), "Analytics Event", y5e.b0((Map)yi2.e0(d), (Iterable)ax7.a));
        s10.g(this.a, v10.a(), i, 4);
        iterator = (KSerializer)((Iterable)this.d).iterator();
        while (((Iterator)iterator).hasNext()) {
            final w10 w10 = (w10)((Iterator)iterator).next();
            try {
                ((qvp)w10).a(v10);
            }
            catch (final Exception ex) {
                if (!this.e.add((Object)w10)) {
                    continue;
                }
                final String c = v4j.a((Class)((qvp)w10).getClass()).c();
                final String a2 = v10.a();
                final String e = t4r.e((Throwable)ex);
                final StringBuilder t = oz1.t("Analytics observer ", c, " failed on ", a2, ": ");
                t.append(e);
                SilentException.a(new SilentException(t.toString()), lpl.w, (List)null, 6);
            }
        }
    }
    
    @Override
    public final void c(final int n) {
        String s = null;
        switch (n) {
            default: {
                throw null;
            }
            case 68: {
                s = "CoworkScheduledTaskRunHistory";
                break;
            }
            case 67: {
                s = "CodeRoutineRunHistory";
                break;
            }
            case 66: {
                s = "CoworkScheduledTaskDetail";
                break;
            }
            case 65: {
                s = "CodeEnvironmentSetup";
                break;
            }
            case 64: {
                s = "HomeFeed";
                break;
            }
            case 63: {
                s = "CodeUpsell";
                break;
            }
            case 62: {
                s = "CodeRoutineDetail";
                break;
            }
            case 61: {
                s = "CodeRoutinesList";
                break;
            }
            case 60: {
                s = "CodeProjectThread";
                break;
            }
            case 59: {
                s = "CodeProjectDetail";
                break;
            }
            case 58: {
                s = "CodeProjectsGrid";
                break;
            }
            case 57: {
                s = "WatchPreCall";
                break;
            }
            case 56: {
                s = "WatchConversationList";
                break;
            }
            case 55: {
                s = "SharingSettings";
                break;
            }
            case 54: {
                s = "AgeVerification";
                break;
            }
            case 53: {
                s = "MemoryFileDetail";
                break;
            }
            case 52: {
                s = "MemoryFilesList";
                break;
            }
            case 51: {
                s = "VoiceSettings";
                break;
            }
            case 50: {
                s = "CoworkAgent";
                break;
            }
            case 49: {
                s = "StylePicker";
                break;
            }
            case 48: {
                s = "SpeechInputLanguage";
                break;
            }
            case 47: {
                s = "MoveToProject";
                break;
            }
            case 46: {
                s = "MessageFeedback";
                break;
            }
            case 45: {
                s = "ToolPermissions";
                break;
            }
            case 44: {
                s = "Usage";
                break;
            }
            case 43: {
                s = "Capabilities";
                break;
            }
            case 42: {
                s = "Connectors";
                break;
            }
            case 41: {
                s = "ProjectList";
                break;
            }
            case 40: {
                s = "GrowthBookOverride";
                break;
            }
            case 39: {
                s = "CodeOnboardingConnectGithub";
                break;
            }
            case 38: {
                s = "CodeSession";
                break;
            }
            case 37: {
                s = "CodeSessionList";
                break;
            }
            case 36: {
                s = "PrivacySettings";
                break;
            }
            case 35: {
                s = "ArtifactInspirationGallery";
                break;
            }
            case 34: {
                s = "ArtifactGallery";
                break;
            }
            case 33: {
                s = "SharedLinksSettings";
                break;
            }
            case 32: {
                s = "ViewSharedChat";
                break;
            }
            case 31: {
                s = "ViewSharedArtifact";
                break;
            }
            case 30: {
                s = "ShareArtifact";
                break;
            }
            case 29: {
                s = "NotificationSettings";
                break;
            }
            case 28: {
                s = "Settings";
                break;
            }
            case 27: {
                s = "ResearchDetails";
                break;
            }
            case 26: {
                s = "ProjectTemplateUpload";
                break;
            }
            case 25: {
                s = "ProjectTemplateCreate";
                break;
            }
            case 24: {
                s = "BellMode";
                break;
            }
            case 23: {
                s = "ManageTools";
                break;
            }
            case 22: {
                s = "StatsigOverride";
                break;
            }
            case 21: {
                s = "Home";
                break;
            }
            case 20: {
                s = "EditProjectCustomInstructions";
                break;
            }
            case 19: {
                s = "ProjectDetail";
                break;
            }
            case 18: {
                s = "ProjectDocumentList";
                break;
            }
            case 17: {
                s = "CreateProject";
                break;
            }
            case 16: {
                s = "PhoneVerification";
                break;
            }
            case 15: {
                s = "SharedChatSnapshot";
                break;
            }
            case 14: {
                s = "BillingSettings";
                break;
            }
            case 13: {
                s = "MobileAppFeedback";
                break;
            }
            case 12: {
                s = "OSSAttributions";
                break;
            }
            case 11: {
                s = "ProfileSettings";
                break;
            }
            case 10: {
                s = "DeleteAccount";
                break;
            }
            case 9: {
                s = "LoggedInSidebar";
                break;
            }
            case 8: {
                s = "Onboarding";
                break;
            }
            case 7: {
                s = "Login";
                break;
            }
            case 6: {
                s = "ArtifactPreview";
                break;
            }
            case 5: {
                s = "ClaudeStoreView";
                break;
            }
            case 4: {
                s = "ShareChat";
                break;
            }
            case 3: {
                s = "DebugMenu";
                break;
            }
            case 2: {
                s = "EndpointSelection";
                break;
            }
            case 1: {
                s = "None";
                break;
            }
        }
        s10.f(this.a, s, null, 14);
        final List a = adn.a;
        adn.e(4, "\ud83d\udcf1".concat(s), "Analytics Screen", (Map)null);
    }
    
    @Override
    public final void d(final AnalyticsScreen analyticsScreen) {
        final boolean b = analyticsScreen instanceof AnalyticsScreens$ChatScreen;
        final s10 a = this.a;
        final jqc b2 = this.b;
        if (b) {
            final AnalyticsScreens$ChatScreen analyticsScreens$ChatScreen = (AnalyticsScreens$ChatScreen)analyticsScreen;
            s10.f(a, "Chat", jrc.i(x90.N(b2, (Object)new ChatScreenAnalyticsProperties(analyticsScreens$ChatScreen.a, analyticsScreens$ChatScreen.b, analyticsScreens$ChatScreen.c), (KSerializer)ChatScreenAnalyticsProperties.Companion.serializer())), 12);
            return;
        }
        if (analyticsScreen instanceof AnalyticsScreens$ChatListScreen) {
            s10.f(a, "ChatList", jrc.i(x90.N(b2, (Object)new ChatListScreenAnalyticsProperties(((AnalyticsScreens$ChatListScreen)analyticsScreen).a()), (KSerializer)ChatListScreenAnalyticsProperties.Companion.serializer())), 12);
            return;
        }
        if (analyticsScreen instanceof AnalyticsScreens$CoworkScheduledRunsListScreen) {
            s10.f(a, "CoworkScheduledRunsList", jrc.i(x90.N(b2, (Object)new CoworkScheduledRunsListScreenAnalyticsProperties(((AnalyticsScreens$CoworkScheduledRunsListScreen)analyticsScreen).a()), (KSerializer)CoworkScheduledRunsListScreenAnalyticsProperties.Companion.serializer())), 12);
            return;
        }
        if (analyticsScreen instanceof AnalyticsScreens$AddCustomConnectorWebScreen) {
            s10.f(a, "AddCustomConnectorWeb", jrc.i(x90.N(b2, (Object)new AddCustomConnectorWebScreenAnalyticsProperties(((AnalyticsScreens$AddCustomConnectorWebScreen)analyticsScreen).a()), (KSerializer)AddCustomConnectorWebScreenAnalyticsProperties.Companion.serializer())), 12);
            return;
        }
        en9.r();
    }
    
    @Override
    public final void e(final String s, final String s2, final String s3, final w1n w1n, final String s4) {
        String v;
        if (w1n != null) {
            v = w1n.v;
        }
        else {
            v = null;
        }
        final ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits = new ClaudeAnalyticsImpl$Traits(s, s2, s3, v, s4);
        final KSerializer kSerializer = ClaudeAnalyticsImpl$Traits.Companion.serializer();
        final iqc d = jqc.d;
        d.getClass();
        final JsonObject i = jrc.i(x90.N((jqc)d, (Object)claudeAnalyticsImpl$Traits, kSerializer));
        final s10 a = this.a;
        final tze w = a.w;
        rhc.G((oc7)w.y, (hc7)w.x, 0, (zta)new o10((Object)a, (Object)s, (Object)i, (f07)null, (byte)0), 2);
        a.e((BaseEvent)new IdentifyEvent(s, i));
        String v2;
        if (w1n != null) {
            v2 = w1n.v;
        }
        else {
            v2 = null;
        }
        gy7.a(this.c, s, s2, s3, v2);
    }
    
    @Override
    public final void reset() {
        final s10 a = this.a;
        final String string = UUID.randomUUID().toString();
        string.getClass();
        a.z = new k2p(string, (String)null, (JsonObject)null);
        final tze w = a.w;
        rhc.G((oc7)w.y, (hc7)w.x, 0, (zta)new z((Object)a, (Object)string, (f07)null, (byte)17), 2);
        final gy7 c = this.c;
        synchronized (c) {
            c.b = null;
            c.f.clear();
            c.d.clear();
            if (!c.e) {
                return;
            }
            zw7.a((String)null).b();
        }
    }
}
