import java.util.Set;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import com.anthropic.claude.db.ClaudeDatabase_Impl;
import com.anthropic.claude.conversation.cache.ConversationCacheDatabase_Impl;

public final class ox4
{
    public final byte a;
    public final String b;
    public final String c;
    public final byte d;
    public final quj e;
    
    public ox4(final int a, final String b, final String c) {
        this.a = (byte)a;
        this.b = b;
        this.c = c;
    }
    
    public ox4(final ConversationCacheDatabase_Impl e) {
        this.d = 1;
        this.e = (quj)e;
        this(6, "5781d41c6e9c58b6322518e364d73366", "ec7847783acf2dd89e4b1020f46aafb5");
    }
    
    public ox4(final ClaudeDatabase_Impl e) {
        this.d = 0;
        this.e = (quj)e;
        this(4, "2f262702503f4677a3ba0532bcf1235a", "e6265c641db088b9de55fb8bdbf64463");
    }
    
    public final void a(final t2k t2k) {
        switch (this.d) {
            default: {
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `executed_client_tools` (`account_id` TEXT NOT NULL, `conversation_id` TEXT NOT NULL, `tool_use_id` TEXT NOT NULL, `executed_at` INTEGER NOT NULL, PRIMARY KEY(`account_id`, `conversation_id`, `tool_use_id`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `snapshot_headers` (`account_id` TEXT NOT NULL, `conversation_id` TEXT NOT NULL, `leaf_message_id` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, `newest_message_at` INTEGER NOT NULL, `project_id` TEXT, `facts` BLOB, `oldest_known_message_id` TEXT, PRIMARY KEY(`account_id`, `conversation_id`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `snapshot_messages` (`account_id` TEXT NOT NULL, `conversation_id` TEXT NOT NULL, `message_id` TEXT NOT NULL, `parent_message_id` TEXT, `fingerprint` INTEGER NOT NULL, `complete_blocks` INTEGER NOT NULL, `body` BLOB NOT NULL, PRIMARY KEY(`account_id`, `conversation_id`, `message_id`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                yi2.t(t2k, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5781d41c6e9c58b6322518e364d73366')");
                return;
            }
            case 0: {
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `cachedMessages` (`uuid` TEXT NOT NULL, `conversation_uuid` TEXT NOT NULL, `message_json` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                yi2.t(t2k, "CREATE INDEX IF NOT EXISTS `index_cachedMessages_conversation_uuid` ON `cachedMessages` (`conversation_uuid`)");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `cachedConversations` (`uuid` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, `conversation_json` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `chatIdListEntries` (`source` TEXT NOT NULL, `chat_uuid` TEXT NOT NULL, `type` TEXT NOT NULL DEFAULT 'chat', `position` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`source`, `chat_uuid`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `cachedCoworkSessions` (`session_id` TEXT NOT NULL, `row_json` TEXT NOT NULL, PRIMARY KEY(`session_id`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `cachedArtifacts` (`artifact_id` TEXT NOT NULL, `row_json` TEXT NOT NULL, PRIMARY KEY(`artifact_id`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `cachedProjects` (`uuid` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, `project_json` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `projectIdListEntries` (`source` TEXT NOT NULL, `project_uuid` TEXT NOT NULL, PRIMARY KEY(`source`, `project_uuid`))");
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                yi2.t(t2k, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2f262702503f4677a3ba0532bcf1235a')");
            }
        }
    }
    
    public final Object b(final t2k t2k, final h07 h07) {
        final byte d = this.d;
        final pc7 v = pc7.v;
        final quj e = this.e;
        Object a = lqo.a;
        switch (d) {
            default: {
                Object a2 = ((quj)e).e().a(t2k, h07);
                if (a2 != v) {
                    a2 = a;
                }
                if (a2 == v) {
                    a = a2;
                }
                return a;
            }
            case 0: {
                Object a3 = ((quj)e).e().a(t2k, h07);
                if (a3 != v) {
                    a3 = a;
                }
                if (a3 == v) {
                    a = a3;
                }
                return a;
            }
        }
    }
    
    public final Object c(t2k t2k, final h07 h07) {
        t2k t2k2 = t2k;
        final byte d = this.d;
        final pc7 v = pc7.v;
        switch (d) {
            default: {
                Object o = null;
                Label_0079: {
                    if (h07 instanceof y27) {
                        final y27 y27 = (y27)h07;
                        final int b = y27.B;
                        if ((b & Integer.MIN_VALUE) != 0x0) {
                            y27.B = b + Integer.MIN_VALUE;
                            o = y27;
                            break Label_0079;
                        }
                    }
                    o = new y27(this, h07);
                }
                Object o2 = ((y27)o).z;
                final int b2 = ((y27)o).B;
                Object j = null;
                wan wan = null;
                Label_1019: {
                    wan x = null;
                    Object i = null;
                    Label_0695: {
                        wan w;
                        if (b2 != 0) {
                            if (b2 != 1) {
                                if (b2 == 2) {
                                    x = ((y27)o).x;
                                    final t2k v2 = ((y27)o).v;
                                    vt4.g0(o2);
                                    i = o2;
                                    t2k = v2;
                                    break Label_0695;
                                }
                                if (b2 == 3) {
                                    final wan y28 = ((y27)o).y;
                                    vt4.g0(o2);
                                    j = o2;
                                    wan = y28;
                                    break Label_1019;
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            else {
                                w = ((y27)o).w;
                                t2k2 = ((y27)o).v;
                                vt4.g0(o2);
                            }
                        }
                        else {
                            vt4.g0(o2);
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            ((Map)linkedHashMap).put((Object)"account_id", (Object)new qan(1, 1, "account_id", "TEXT", (String)null, true));
                            ((Map)linkedHashMap).put((Object)"conversation_id", (Object)new qan(2, 1, "conversation_id", "TEXT", (String)null, true));
                            ((Map)linkedHashMap).put((Object)"tool_use_id", (Object)new qan(3, 1, "tool_use_id", "TEXT", (String)null, true));
                            ((Map)linkedHashMap).put((Object)"executed_at", (Object)new qan(0, 1, "executed_at", "INTEGER", (String)null, true));
                            w = new wan("executed_client_tools", (Map)linkedHashMap, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                            ((y27)o).v = t2k2;
                            ((y27)o).w = w;
                            ((y27)o).B = 1;
                            if ((o2 = jbr.i(t2k2, "executed_client_tools", (h07)o)) == v) {
                                return v;
                            }
                        }
                        final wan wan2 = (wan)o2;
                        if (!w.equals((Object)wan2)) {
                            final StringBuilder sb = new StringBuilder("executed_client_tools(com.anthropic.claude.conversation.cache.ExecutedClientToolEntity).\n Expected:\n");
                            sb.append((Object)w);
                            sb.append("\n Found:\n");
                            sb.append((Object)wan2);
                            return new vuj(false, sb.toString());
                        }
                        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        ((Map)linkedHashMap2).put((Object)"account_id", (Object)new qan(1, 1, "account_id", "TEXT", (String)null, true));
                        ((Map)linkedHashMap2).put((Object)"conversation_id", (Object)new qan(2, 1, "conversation_id", "TEXT", (String)null, true));
                        ((Map)linkedHashMap2).put((Object)"leaf_message_id", (Object)new qan(0, 1, "leaf_message_id", "TEXT", (String)null, true));
                        ((Map)linkedHashMap2).put((Object)"updated_at", (Object)new qan(0, 1, "updated_at", "INTEGER", (String)null, true));
                        ((Map)linkedHashMap2).put((Object)"newest_message_at", (Object)new qan(0, 1, "newest_message_at", "INTEGER", (String)null, true));
                        ((Map)linkedHashMap2).put((Object)"project_id", (Object)new qan(0, 1, "project_id", "TEXT", (String)null, false));
                        ((Map)linkedHashMap2).put((Object)"facts", (Object)new qan(0, 1, "facts", "BLOB", (String)null, false));
                        ((Map)linkedHashMap2).put((Object)"oldest_known_message_id", (Object)new qan(0, 1, "oldest_known_message_id", "TEXT", (String)null, false));
                        final wan x2 = new wan("snapshot_headers", (Map)linkedHashMap2, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                        ((y27)o).v = t2k2;
                        ((y27)o).w = null;
                        ((y27)o).x = x2;
                        ((y27)o).B = 2;
                        i = jbr.i(t2k2, "snapshot_headers", (h07)o);
                        if (i == v) {
                            return v;
                        }
                        t2k = t2k2;
                        x = x2;
                    }
                    final wan wan3 = (wan)i;
                    if (!x.equals((Object)wan3)) {
                        final StringBuilder sb2 = new StringBuilder("snapshot_headers(com.anthropic.claude.conversation.cache.SnapshotHeaderEntity).\n Expected:\n");
                        sb2.append((Object)x);
                        sb2.append("\n Found:\n");
                        sb2.append((Object)wan3);
                        return new vuj(false, sb2.toString());
                    }
                    final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ((Map)linkedHashMap3).put((Object)"account_id", (Object)new qan(1, 1, "account_id", "TEXT", (String)null, true));
                    ((Map)linkedHashMap3).put((Object)"conversation_id", (Object)new qan(2, 1, "conversation_id", "TEXT", (String)null, true));
                    ((Map)linkedHashMap3).put((Object)"message_id", (Object)new qan(3, 1, "message_id", "TEXT", (String)null, true));
                    ((Map)linkedHashMap3).put((Object)"parent_message_id", (Object)new qan(0, 1, "parent_message_id", "TEXT", (String)null, false));
                    ((Map)linkedHashMap3).put((Object)"fingerprint", (Object)new qan(0, 1, "fingerprint", "INTEGER", (String)null, true));
                    ((Map)linkedHashMap3).put((Object)"complete_blocks", (Object)new qan(0, 1, "complete_blocks", "INTEGER", (String)null, true));
                    ((Map)linkedHashMap3).put((Object)"body", (Object)new qan(0, 1, "body", "BLOB", (String)null, true));
                    final wan y29 = new wan("snapshot_messages", (Map)linkedHashMap3, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                    ((y27)o).v = null;
                    ((y27)o).w = null;
                    ((y27)o).x = null;
                    ((y27)o).y = y29;
                    ((y27)o).B = 3;
                    j = jbr.i(t2k, "snapshot_messages", (h07)o);
                    if (j == v) {
                        return v;
                    }
                    wan = y29;
                }
                final wan wan4 = (wan)j;
                Object o3;
                if (!wan.equals((Object)wan4)) {
                    final StringBuilder sb3 = new StringBuilder("snapshot_messages(com.anthropic.claude.conversation.cache.SnapshotMessageEntity).\n Expected:\n");
                    sb3.append((Object)wan);
                    sb3.append("\n Found:\n");
                    sb3.append((Object)wan4);
                    o3 = new vuj(false, sb3.toString());
                }
                else {
                    o3 = new vuj(true, (String)null);
                }
                return o3;
            }
            case 0: {
                Object o4 = null;
                Label_1139: {
                    if (h07 instanceof nx4) {
                        final nx4 nx4 = (nx4)h07;
                        final int f = nx4.F;
                        if ((f & Integer.MIN_VALUE) != 0x0) {
                            nx4.F = f + Integer.MIN_VALUE;
                            o4 = nx4;
                            break Label_1139;
                        }
                    }
                    o4 = new nx4(this, h07);
                }
                Object o5 = ((nx4)o4).D;
                Object k = null;
                wan wan5 = null;
                Label_2957: {
                    wan b3 = null;
                    Object l = null;
                    Label_2730: {
                        wan a = null;
                        Object m = null;
                        Label_2484: {
                            wan z = null;
                            Object i2 = null;
                            Label_2269: {
                                wan y30 = null;
                                Object i3 = null;
                                Label_2059: {
                                    wan x3 = null;
                                    Object i4 = null;
                                    Label_1796: {
                                        wan w2 = null;
                                        switch (((nx4)o4).F) {
                                            default: {
                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            case 7: {
                                                final wan c = ((nx4)o4).C;
                                                vt4.g0(o5);
                                                k = o5;
                                                wan5 = c;
                                                break Label_2957;
                                            }
                                            case 6: {
                                                b3 = ((nx4)o4).B;
                                                final t2k v3 = ((nx4)o4).v;
                                                vt4.g0(o5);
                                                l = o5;
                                                t2k = v3;
                                                break Label_2730;
                                            }
                                            case 5: {
                                                a = ((nx4)o4).A;
                                                final t2k v4 = ((nx4)o4).v;
                                                vt4.g0(o5);
                                                m = o5;
                                                t2k = v4;
                                                break Label_2484;
                                            }
                                            case 4: {
                                                z = ((nx4)o4).z;
                                                final t2k v5 = ((nx4)o4).v;
                                                vt4.g0(o5);
                                                i2 = o5;
                                                t2k = v5;
                                                break Label_2269;
                                            }
                                            case 3: {
                                                y30 = ((nx4)o4).y;
                                                final t2k v6 = ((nx4)o4).v;
                                                vt4.g0(o5);
                                                i3 = o5;
                                                t2k = v6;
                                                break Label_2059;
                                            }
                                            case 2: {
                                                x3 = ((nx4)o4).x;
                                                final t2k v7 = ((nx4)o4).v;
                                                vt4.g0(o5);
                                                i4 = o5;
                                                t2k = v7;
                                                break Label_1796;
                                            }
                                            case 1: {
                                                w2 = ((nx4)o4).w;
                                                t2k2 = ((nx4)o4).v;
                                                vt4.g0(o5);
                                                break;
                                            }
                                            case 0: {
                                                vt4.g0(o5);
                                                final LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                ((Map)linkedHashMap4).put((Object)"uuid", (Object)new qan(1, 1, "uuid", "TEXT", (String)null, true));
                                                ((Map)linkedHashMap4).put((Object)"conversation_uuid", (Object)new qan(0, 1, "conversation_uuid", "TEXT", (String)null, true));
                                                ((Map)linkedHashMap4).put((Object)"message_json", (Object)new qan(0, 1, "message_json", "TEXT", (String)null, true));
                                                final LinkedHashSet set = new LinkedHashSet();
                                                final LinkedHashSet set2 = new LinkedHashSet();
                                                ((Set)set2).add((Object)new uan("index_cachedMessages_conversation_uuid", false, lq6.X((Object)"conversation_uuid"), lq6.X((Object)"ASC")));
                                                w2 = new wan("cachedMessages", (Map)linkedHashMap4, (Set)set, (Set)set2);
                                                ((nx4)o4).v = t2k2;
                                                ((nx4)o4).w = w2;
                                                ((nx4)o4).F = 1;
                                                if ((o5 = jbr.i(t2k2, "cachedMessages", (h07)o4)) == v) {
                                                    return v;
                                                }
                                                break;
                                            }
                                        }
                                        final wan wan6 = (wan)o5;
                                        if (!w2.equals((Object)wan6)) {
                                            final StringBuilder sb4 = new StringBuilder("cachedMessages(com.anthropic.claude.db.CachedMessage).\n Expected:\n");
                                            sb4.append((Object)w2);
                                            sb4.append("\n Found:\n");
                                            sb4.append((Object)wan6);
                                            return new vuj(false, sb4.toString());
                                        }
                                        final LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                        ((Map)linkedHashMap5).put((Object)"uuid", (Object)new qan(1, 1, "uuid", "TEXT", (String)null, true));
                                        ((Map)linkedHashMap5).put((Object)"updated_at", (Object)new qan(0, 1, "updated_at", "INTEGER", (String)null, true));
                                        ((Map)linkedHashMap5).put((Object)"conversation_json", (Object)new qan(0, 1, "conversation_json", "TEXT", (String)null, true));
                                        final wan x4 = new wan("cachedConversations", (Map)linkedHashMap5, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                                        ((nx4)o4).v = t2k2;
                                        ((nx4)o4).w = null;
                                        ((nx4)o4).x = x4;
                                        ((nx4)o4).F = 2;
                                        i4 = jbr.i(t2k2, "cachedConversations", (h07)o4);
                                        if (i4 == v) {
                                            return v;
                                        }
                                        t2k = t2k2;
                                        x3 = x4;
                                    }
                                    final wan wan7 = (wan)i4;
                                    if (!x3.equals((Object)wan7)) {
                                        final StringBuilder sb5 = new StringBuilder("cachedConversations(com.anthropic.claude.db.CachedConversation).\n Expected:\n");
                                        sb5.append((Object)x3);
                                        sb5.append("\n Found:\n");
                                        sb5.append((Object)wan7);
                                        return new vuj(false, sb5.toString());
                                    }
                                    final LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                    ((Map)linkedHashMap6).put((Object)"source", (Object)new qan(1, 1, "source", "TEXT", (String)null, true));
                                    ((Map)linkedHashMap6).put((Object)"chat_uuid", (Object)new qan(2, 1, "chat_uuid", "TEXT", (String)null, true));
                                    ((Map)linkedHashMap6).put((Object)"type", (Object)new qan(0, 1, "type", "TEXT", "'chat'", true));
                                    ((Map)linkedHashMap6).put((Object)"position", (Object)new qan(0, 1, "position", "INTEGER", "0", true));
                                    y30 = new wan("chatIdListEntries", (Map)linkedHashMap6, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                                    ((nx4)o4).v = t2k;
                                    ((nx4)o4).w = null;
                                    ((nx4)o4).x = null;
                                    ((nx4)o4).y = y30;
                                    ((nx4)o4).F = 3;
                                    i3 = jbr.i(t2k, "chatIdListEntries", (h07)o4);
                                    if (i3 == v) {
                                        return v;
                                    }
                                }
                                final wan wan8 = (wan)i3;
                                if (!y30.equals((Object)wan8)) {
                                    final StringBuilder sb6 = new StringBuilder("chatIdListEntries(com.anthropic.claude.db.ChatIdListEntry).\n Expected:\n");
                                    sb6.append((Object)y30);
                                    sb6.append("\n Found:\n");
                                    sb6.append((Object)wan8);
                                    return new vuj(false, sb6.toString());
                                }
                                final LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                ((Map)linkedHashMap7).put((Object)"session_id", (Object)new qan(1, 1, "session_id", "TEXT", (String)null, true));
                                ((Map)linkedHashMap7).put((Object)"row_json", (Object)new qan(0, 1, "row_json", "TEXT", (String)null, true));
                                z = new wan("cachedCoworkSessions", (Map)linkedHashMap7, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                                ((nx4)o4).v = t2k;
                                ((nx4)o4).w = null;
                                ((nx4)o4).x = null;
                                ((nx4)o4).y = null;
                                ((nx4)o4).z = z;
                                ((nx4)o4).F = 4;
                                i2 = jbr.i(t2k, "cachedCoworkSessions", (h07)o4);
                                if (i2 == v) {
                                    return v;
                                }
                            }
                            final wan wan9 = (wan)i2;
                            if (!z.equals((Object)wan9)) {
                                final StringBuilder sb7 = new StringBuilder("cachedCoworkSessions(com.anthropic.claude.db.CachedSession).\n Expected:\n");
                                sb7.append((Object)z);
                                sb7.append("\n Found:\n");
                                sb7.append((Object)wan9);
                                return new vuj(false, sb7.toString());
                            }
                            final LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                            ((Map)linkedHashMap8).put((Object)"artifact_id", (Object)new qan(1, 1, "artifact_id", "TEXT", (String)null, true));
                            ((Map)linkedHashMap8).put((Object)"row_json", (Object)new qan(0, 1, "row_json", "TEXT", (String)null, true));
                            a = new wan("cachedArtifacts", (Map)linkedHashMap8, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                            ((nx4)o4).v = t2k;
                            ((nx4)o4).w = null;
                            ((nx4)o4).x = null;
                            ((nx4)o4).y = null;
                            ((nx4)o4).z = null;
                            ((nx4)o4).A = a;
                            ((nx4)o4).F = 5;
                            m = jbr.i(t2k, "cachedArtifacts", (h07)o4);
                            if (m == v) {
                                return v;
                            }
                        }
                        final wan wan10 = (wan)m;
                        if (!a.equals((Object)wan10)) {
                            final StringBuilder sb8 = new StringBuilder("cachedArtifacts(com.anthropic.claude.db.CachedArtifact).\n Expected:\n");
                            sb8.append((Object)a);
                            sb8.append("\n Found:\n");
                            sb8.append((Object)wan10);
                            return new vuj(false, sb8.toString());
                        }
                        final LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                        ((Map)linkedHashMap9).put((Object)"uuid", (Object)new qan(1, 1, "uuid", "TEXT", (String)null, true));
                        ((Map)linkedHashMap9).put((Object)"updated_at", (Object)new qan(0, 1, "updated_at", "INTEGER", (String)null, true));
                        ((Map)linkedHashMap9).put((Object)"project_json", (Object)new qan(0, 1, "project_json", "TEXT", (String)null, true));
                        b3 = new wan("cachedProjects", (Map)linkedHashMap9, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                        ((nx4)o4).v = t2k;
                        ((nx4)o4).w = null;
                        ((nx4)o4).x = null;
                        ((nx4)o4).y = null;
                        ((nx4)o4).z = null;
                        ((nx4)o4).A = null;
                        ((nx4)o4).B = b3;
                        ((nx4)o4).F = 6;
                        l = jbr.i(t2k, "cachedProjects", (h07)o4);
                        if (l == v) {
                            return v;
                        }
                    }
                    final wan wan11 = (wan)l;
                    if (!b3.equals((Object)wan11)) {
                        final StringBuilder sb9 = new StringBuilder("cachedProjects(com.anthropic.claude.db.CachedProject).\n Expected:\n");
                        sb9.append((Object)b3);
                        sb9.append("\n Found:\n");
                        sb9.append((Object)wan11);
                        return new vuj(false, sb9.toString());
                    }
                    final LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                    ((Map)linkedHashMap10).put((Object)"source", (Object)new qan(1, 1, "source", "TEXT", (String)null, true));
                    ((Map)linkedHashMap10).put((Object)"project_uuid", (Object)new qan(2, 1, "project_uuid", "TEXT", (String)null, true));
                    final wan c2 = new wan("projectIdListEntries", (Map)linkedHashMap10, (Set)new LinkedHashSet(), (Set)new LinkedHashSet());
                    ((nx4)o4).v = null;
                    ((nx4)o4).w = null;
                    ((nx4)o4).x = null;
                    ((nx4)o4).y = null;
                    ((nx4)o4).z = null;
                    ((nx4)o4).A = null;
                    ((nx4)o4).B = null;
                    ((nx4)o4).C = c2;
                    ((nx4)o4).F = 7;
                    k = jbr.i(t2k, "projectIdListEntries", (h07)o4);
                    if (k == v) {
                        return v;
                    }
                    wan5 = c2;
                }
                final wan wan12 = (wan)k;
                Object o6;
                if (!wan5.equals((Object)wan12)) {
                    final StringBuilder sb10 = new StringBuilder("projectIdListEntries(com.anthropic.claude.db.ProjectIdListEntry).\n Expected:\n");
                    sb10.append((Object)wan5);
                    sb10.append("\n Found:\n");
                    sb10.append((Object)wan12);
                    o6 = new vuj(false, sb10.toString());
                }
                else {
                    o6 = new vuj(true, (String)null);
                }
                return o6;
            }
        }
    }
}
