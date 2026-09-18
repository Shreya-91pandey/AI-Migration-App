import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public abstract class wsp
{
    public static final aj0 a;
    public static final aj0 b;
    public static final aj0 c;
    public static final aj0 d;
    public static final aj0 e;
    public static final aj0 f;
    public static final aj0 g;
    public static final aj0 h;
    public static final tom i;
    
    static {
        new aj0("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", (byte)0);
        new aj0("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", (byte)0);
        new aj0("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", (byte)4);
        new aj0("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", (byte)1);
        new aj0("START_SAFE_BROWSING", "START_SAFE_BROWSING", (byte)5);
        new aj0("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", (byte)5);
        new aj0("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", (byte)5);
        new aj0("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", (byte)5);
        new aj0("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", (byte)5);
        new aj0("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", (byte)5);
        new aj0("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", (byte)1);
        new aj0("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", (byte)1);
        new aj0("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", (byte)1);
        new aj0("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", (byte)1);
        new aj0("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", (byte)1);
        new aj0("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", (byte)1);
        new aj0("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", (byte)0);
        new aj0("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", (byte)0);
        new aj0("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", (byte)1);
        new aj0("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", (byte)5);
        new aj0("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", (byte)1);
        new aj0("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", (byte)0);
        new aj0("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", (byte)0);
        new aj0("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", (byte)5);
        new aj0("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", (byte)5);
        new aj0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", (byte)5);
        new aj0("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", (byte)0);
        new aj0("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", (byte)0);
        a = new aj0("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", (byte)2);
        new aj0("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", (byte)0);
        new aj0("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", (byte)0);
        new aj0("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", (byte)0);
        new aj0("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", (byte)0);
        new aj0("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", (byte)4);
        new aj0("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", (byte)4);
        new aj0("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", (byte)7);
        new aj0("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", (byte)7);
        new aj0("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", (byte)6);
        new tom("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", (byte)1);
        new tom("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH", (byte)0);
        new tom("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", (byte)0);
        new aj0("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", (byte)7);
        new usp();
        new aj0("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", (byte)2);
        b = new aj0("MULTI_PROCESS", "MULTI_PROCESS_QUERY", (byte)2);
        new aj0("FORCE_DARK", "FORCE_DARK", (byte)7);
        new aj0("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", (byte)2);
        c = new aj0("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", (byte)2);
        d = new aj0("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", (byte)2);
        new aj0("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", (byte)2);
        new aj0("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", (byte)2);
        new aj0("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", (byte)2);
        new aj0("GET_COOKIE_INFO", "GET_COOKIE_INFO", (byte)2);
        new aj0("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", (byte)2);
        new aj0("USER_AGENT_METADATA", "USER_AGENT_METADATA", (byte)2);
        new vsp("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA", (byte)0);
        new vsp("MULTI_PROFILE", "MULTI_PROFILE", (byte)1);
        new aj0("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", (byte)2);
        new aj0("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", (byte)2);
        new aj0("MUTE_AUDIO", "MUTE_AUDIO", (byte)2);
        new aj0("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", (byte)2);
        new aj0("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", (byte)2);
        new aj0("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", (byte)2);
        new aj0("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS", (byte)2);
        new aj0("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V3", "BACK_FORWARD_CACHE_SETTINGS_V3", (byte)2);
        new aj0("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V4", "BACK_FORWARD_CACHE_SETTINGS_V4", (byte)2);
        new aj0("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", (byte)2);
        new vsp("PREFETCH_URL_V5", "PREFETCH_URL_V5", (byte)2);
        e = new aj0("ASYNC_WEBVIEW_STARTUP_V2");
        f = new aj0("ASYNC_WEBVIEW_STARTUP");
        g = new aj0("ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        new aj0("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", (byte)2);
        new aj0("PRERENDER_URL_V2", "PRERENDER_URL_V3", (byte)2);
        new aj0("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", (byte)2);
        new aj0("PREFETCH_CACHE_V1", "PREFETCH_CACHE_V1", (byte)2);
        new aj0("PREFETCH_WITH_CALLBACK_RESULT_V1");
        new aj0("SET_MAX_PRERENDERS_V1", "SET_MAX_PRERENDERS_V1", (byte)2);
        new aj0("SAVE_STATE", "SAVE_STATE", (byte)2);
        new aj0("NAVIGATION_GET_WEB_RESOURCE_ERROR", "NAVIGATION_GET_WEB_RESOURCE_ERROR", (byte)2);
        new aj0("NAVIGATION_LISTENER", "PAGE_GET_URL", (byte)2);
        h = new aj0("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW", (byte)2);
        new aj0("PAYMENT_REQUEST", "PAYMENT_REQUEST", (byte)2);
        new aj0("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1", (byte)2);
        new aj0("WEBVIEW_BUILDER_EXPERIMENTAL_V2", "WEBVIEW_BUILDER_V2", (byte)2);
        new aj0("COOKIE_INTERCEPT", "COOKIE_INTERCEPT", (byte)2);
        new aj0("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS", (byte)2);
        new aj0("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS", (byte)2);
        new tom("STARTUP_FEATURE_SET_PROFILES_TO_LOAD", "STARTUP_FEATURE_SET_PROFILES_TO_LOAD", (byte)0);
        new tom("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE", (byte)0);
        i = new tom("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2", (byte)0);
        new aj0("PRECONNECT", "PRECONNECT", (byte)2);
        new aj0("ENQUEUE_PRECONNECT", "ENQUEUE_PRECONNECT", (byte)2);
        new aj0("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1", (byte)2);
        new aj0("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS", (byte)2);
        new aj0("JS_INJECTION_IN_FRAME_AND_WORLD", "JS_INJECTION_IN_FRAME_AND_WORLD", (byte)2);
        new aj0("WEBVIEW_NAVIGATE_EXPERIMENTAL_V1", "WEBVIEW_NAVIGATE_V1", (byte)2);
        new aj0("DOWNLOAD_FAVICONS_ENABLED", "DOWNLOAD_FAVICONS_ENABLED", (byte)2);
        new aj0("HTTP_CACHE_MANAGER", "HTTP_CACHE_MANAGER", (byte)2);
    }
    
    public static boolean a(final String s) {
        final Set unmodifiableSet = Collections.unmodifiableSet((Set)bj0.c);
        final HashSet set = new HashSet();
        for (final bj0 bj0 : unmodifiableSet) {
            if (bj0.a.equals((Object)s)) {
                set.add((Object)bj0);
            }
        }
        if (!set.isEmpty()) {
            for (final bj0 bj2 : set) {
                if (bj2.a() || bj2.b()) {
                    return true;
                }
            }
            return false;
        }
        fvd.u("Unknown feature ".concat(s));
        return false;
    }
}
