import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import androidx.work.impl.WorkDatabase;
import java.util.AbstractSet;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import androidx.work.impl.WorkDatabase_Impl;

public final class s4q extends xuj
{
    public final WorkDatabase_Impl d;
    
    public s4q(final WorkDatabase_Impl d) {
        this.d = d;
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
    }
    
    @Override
    public final void a(final t2k t2k) {
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yi2.t(t2k, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        yi2.t(t2k, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        yi2.t(t2k, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        yi2.t(t2k, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yi2.t(t2k, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yi2.t(t2k, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        yi2.t(t2k, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        yi2.t(t2k, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }
    
    @Override
    public final void b(final t2k t2k) {
        yi2.t(t2k, "DROP TABLE IF EXISTS `Dependency`");
        yi2.t(t2k, "DROP TABLE IF EXISTS `WorkSpec`");
        yi2.t(t2k, "DROP TABLE IF EXISTS `WorkTag`");
        yi2.t(t2k, "DROP TABLE IF EXISTS `SystemIdInfo`");
        yi2.t(t2k, "DROP TABLE IF EXISTS `WorkName`");
        yi2.t(t2k, "DROP TABLE IF EXISTS `WorkProgress`");
        yi2.t(t2k, "DROP TABLE IF EXISTS `Preference`");
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d(t2k a) {
        yi2.t(a, "PRAGMA foreign_keys = ON");
        final fmc g = ((WorkDatabase)this.d).g();
        final dho b = g.b;
        b.getClass();
        Object d1 = a.d1("PRAGMA query_only");
        try {
            ((b3k)d1).Z0();
            final boolean w = ((b3k)d1).W();
            r9n.m((AutoCloseable)d1, (Throwable)null);
            if (!w) {
                yi2.t(a, "PRAGMA temp_store = MEMORY");
                yi2.t(a, "PRAGMA recursive_triggers = 1");
                yi2.t(a, "DROP TABLE IF EXISTS room_table_modification_log");
                if (b.a) {
                    yi2.t(a, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                }
                else {
                    yi2.t(a, rym.C0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                d1 = b.h;
                a = (t2k)((h5g)d1).a;
                ((ReentrantLock)a).lock();
                try {
                    ((h5g)d1).d = true;
                }
                finally {
                    ((ReentrantLock)a).unlock();
                }
            }
            final Object g2;
            monitorenter(g2 = g.g);
            monitorexit(g2);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r9n.m((AutoCloseable)d1, t);
            }
        }
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final void f(final t2k t2k) {
        w5r.e(t2k);
    }
    
    @Override
    public final wuj g(final t2k t2k) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((Map)linkedHashMap).put((Object)"work_spec_id", (Object)new ran(1, 1, "work_spec_id", "TEXT", (String)null, true));
        ((Map)linkedHashMap).put((Object)"prerequisite_id", (Object)new ran(2, 1, "prerequisite_id", "TEXT", (String)null, true));
        final LinkedHashSet set = new LinkedHashSet();
        ((Set)set).add((Object)new tan("WorkSpec", "CASCADE", "CASCADE", lq6.X((Object)"work_spec_id"), lq6.X((Object)"id")));
        ((Set)set).add((Object)new tan("WorkSpec", "CASCADE", "CASCADE", lq6.X((Object)"prerequisite_id"), lq6.X((Object)"id")));
        final LinkedHashSet set2 = new LinkedHashSet();
        ((Set)set2).add((Object)new van("index_Dependency_work_spec_id", false, lq6.X((Object)"work_spec_id"), lq6.X((Object)"ASC")));
        ((Set)set2).add((Object)new van("index_Dependency_prerequisite_id", false, lq6.X((Object)"prerequisite_id"), lq6.X((Object)"ASC")));
        final xan xan = new xan("Dependency", (Map)linkedHashMap, (AbstractSet)set, (AbstractSet)set2);
        final xan h = kbr.h(t2k, "Dependency");
        if (!xan.equals((Object)h)) {
            final StringBuilder sb = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            sb.append((Object)xan);
            sb.append("\n Found:\n");
            sb.append((Object)h);
            return new wuj(false, sb.toString());
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ((Map)linkedHashMap2).put((Object)"id", (Object)new ran(1, 1, "id", "TEXT", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"state", (Object)new ran(0, 1, "state", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"worker_class_name", (Object)new ran(0, 1, "worker_class_name", "TEXT", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"input_merger_class_name", (Object)new ran(0, 1, "input_merger_class_name", "TEXT", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"input", (Object)new ran(0, 1, "input", "BLOB", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"output", (Object)new ran(0, 1, "output", "BLOB", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"initial_delay", (Object)new ran(0, 1, "initial_delay", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"interval_duration", (Object)new ran(0, 1, "interval_duration", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"flex_duration", (Object)new ran(0, 1, "flex_duration", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"run_attempt_count", (Object)new ran(0, 1, "run_attempt_count", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"backoff_policy", (Object)new ran(0, 1, "backoff_policy", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"backoff_delay_duration", (Object)new ran(0, 1, "backoff_delay_duration", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"last_enqueue_time", (Object)new ran(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        ((Map)linkedHashMap2).put((Object)"minimum_retention_duration", (Object)new ran(0, 1, "minimum_retention_duration", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"schedule_requested_at", (Object)new ran(0, 1, "schedule_requested_at", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"run_in_foreground", (Object)new ran(0, 1, "run_in_foreground", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"out_of_quota_policy", (Object)new ran(0, 1, "out_of_quota_policy", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"period_count", (Object)new ran(0, 1, "period_count", "INTEGER", "0", true));
        ((Map)linkedHashMap2).put((Object)"generation", (Object)new ran(0, 1, "generation", "INTEGER", "0", true));
        ((Map)linkedHashMap2).put((Object)"next_schedule_time_override", (Object)new ran(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        ((Map)linkedHashMap2).put((Object)"next_schedule_time_override_generation", (Object)new ran(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        ((Map)linkedHashMap2).put((Object)"stop_reason", (Object)new ran(0, 1, "stop_reason", "INTEGER", "-256", true));
        ((Map)linkedHashMap2).put((Object)"trace_tag", (Object)new ran(0, 1, "trace_tag", "TEXT", (String)null, false));
        ((Map)linkedHashMap2).put((Object)"backoff_on_system_interruptions", (Object)new ran(0, 1, "backoff_on_system_interruptions", "INTEGER", (String)null, false));
        ((Map)linkedHashMap2).put((Object)"required_network_type", (Object)new ran(0, 1, "required_network_type", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"required_network_request", (Object)new ran(0, 1, "required_network_request", "BLOB", "x''", true));
        ((Map)linkedHashMap2).put((Object)"requires_charging", (Object)new ran(0, 1, "requires_charging", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"requires_device_idle", (Object)new ran(0, 1, "requires_device_idle", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"requires_battery_not_low", (Object)new ran(0, 1, "requires_battery_not_low", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"requires_storage_not_low", (Object)new ran(0, 1, "requires_storage_not_low", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"trigger_content_update_delay", (Object)new ran(0, 1, "trigger_content_update_delay", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"trigger_max_content_delay", (Object)new ran(0, 1, "trigger_max_content_delay", "INTEGER", (String)null, true));
        ((Map)linkedHashMap2).put((Object)"content_uri_triggers", (Object)new ran(0, 1, "content_uri_triggers", "BLOB", (String)null, true));
        final LinkedHashSet set3 = new LinkedHashSet();
        final LinkedHashSet set4 = new LinkedHashSet();
        ((Set)set4).add((Object)new van("index_WorkSpec_schedule_requested_at", false, lq6.X((Object)"schedule_requested_at"), lq6.X((Object)"ASC")));
        ((Set)set4).add((Object)new van("index_WorkSpec_last_enqueue_time", false, lq6.X((Object)"last_enqueue_time"), lq6.X((Object)"ASC")));
        final xan xan2 = new xan("WorkSpec", (Map)linkedHashMap2, (AbstractSet)set3, (AbstractSet)set4);
        final xan h2 = kbr.h(t2k, "WorkSpec");
        if (!xan2.equals((Object)h2)) {
            final StringBuilder sb2 = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            sb2.append((Object)xan2);
            sb2.append("\n Found:\n");
            sb2.append((Object)h2);
            return new wuj(false, sb2.toString());
        }
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ((Map)linkedHashMap3).put((Object)"tag", (Object)new ran(1, 1, "tag", "TEXT", (String)null, true));
        ((Map)linkedHashMap3).put((Object)"work_spec_id", (Object)new ran(2, 1, "work_spec_id", "TEXT", (String)null, true));
        final LinkedHashSet set5 = new LinkedHashSet();
        ((Set)set5).add((Object)new tan("WorkSpec", "CASCADE", "CASCADE", lq6.X((Object)"work_spec_id"), lq6.X((Object)"id")));
        final LinkedHashSet set6 = new LinkedHashSet();
        ((Set)set6).add((Object)new van("index_WorkTag_work_spec_id", false, lq6.X((Object)"work_spec_id"), lq6.X((Object)"ASC")));
        final xan xan3 = new xan("WorkTag", (Map)linkedHashMap3, (AbstractSet)set5, (AbstractSet)set6);
        final xan h3 = kbr.h(t2k, "WorkTag");
        if (!xan3.equals((Object)h3)) {
            final StringBuilder sb3 = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
            sb3.append((Object)xan3);
            sb3.append("\n Found:\n");
            sb3.append((Object)h3);
            return new wuj(false, sb3.toString());
        }
        final LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ((Map)linkedHashMap4).put((Object)"work_spec_id", (Object)new ran(1, 1, "work_spec_id", "TEXT", (String)null, true));
        ((Map)linkedHashMap4).put((Object)"generation", (Object)new ran(2, 1, "generation", "INTEGER", "0", true));
        ((Map)linkedHashMap4).put((Object)"system_id", (Object)new ran(0, 1, "system_id", "INTEGER", (String)null, true));
        final LinkedHashSet set7 = new LinkedHashSet();
        ((Set)set7).add((Object)new tan("WorkSpec", "CASCADE", "CASCADE", lq6.X((Object)"work_spec_id"), lq6.X((Object)"id")));
        final xan xan4 = new xan("SystemIdInfo", (Map)linkedHashMap4, (AbstractSet)set7, (AbstractSet)new LinkedHashSet());
        final xan h4 = kbr.h(t2k, "SystemIdInfo");
        if (!xan4.equals((Object)h4)) {
            final StringBuilder sb4 = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            sb4.append((Object)xan4);
            sb4.append("\n Found:\n");
            sb4.append((Object)h4);
            return new wuj(false, sb4.toString());
        }
        final LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        ((Map)linkedHashMap5).put((Object)"name", (Object)new ran(1, 1, "name", "TEXT", (String)null, true));
        ((Map)linkedHashMap5).put((Object)"work_spec_id", (Object)new ran(2, 1, "work_spec_id", "TEXT", (String)null, true));
        final LinkedHashSet set8 = new LinkedHashSet();
        ((Set)set8).add((Object)new tan("WorkSpec", "CASCADE", "CASCADE", lq6.X((Object)"work_spec_id"), lq6.X((Object)"id")));
        final LinkedHashSet set9 = new LinkedHashSet();
        ((Set)set9).add((Object)new van("index_WorkName_work_spec_id", false, lq6.X((Object)"work_spec_id"), lq6.X((Object)"ASC")));
        final xan xan5 = new xan("WorkName", (Map)linkedHashMap5, (AbstractSet)set8, (AbstractSet)set9);
        final xan h5 = kbr.h(t2k, "WorkName");
        if (!xan5.equals((Object)h5)) {
            final StringBuilder sb5 = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
            sb5.append((Object)xan5);
            sb5.append("\n Found:\n");
            sb5.append((Object)h5);
            return new wuj(false, sb5.toString());
        }
        final LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        ((Map)linkedHashMap6).put((Object)"work_spec_id", (Object)new ran(1, 1, "work_spec_id", "TEXT", (String)null, true));
        ((Map)linkedHashMap6).put((Object)"progress", (Object)new ran(0, 1, "progress", "BLOB", (String)null, true));
        final LinkedHashSet set10 = new LinkedHashSet();
        ((Set)set10).add((Object)new tan("WorkSpec", "CASCADE", "CASCADE", lq6.X((Object)"work_spec_id"), lq6.X((Object)"id")));
        final xan xan6 = new xan("WorkProgress", (Map)linkedHashMap6, (AbstractSet)set10, (AbstractSet)new LinkedHashSet());
        final xan h6 = kbr.h(t2k, "WorkProgress");
        if (!xan6.equals((Object)h6)) {
            final StringBuilder sb6 = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
            sb6.append((Object)xan6);
            sb6.append("\n Found:\n");
            sb6.append((Object)h6);
            return new wuj(false, sb6.toString());
        }
        final LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        ((Map)linkedHashMap7).put((Object)"key", (Object)new ran(1, 1, "key", "TEXT", (String)null, true));
        ((Map)linkedHashMap7).put((Object)"long_value", (Object)new ran(0, 1, "long_value", "INTEGER", (String)null, false));
        final xan xan7 = new xan("Preference", (Map)linkedHashMap7, (AbstractSet)new LinkedHashSet(), (AbstractSet)new LinkedHashSet());
        final xan h7 = kbr.h(t2k, "Preference");
        if (!xan7.equals((Object)h7)) {
            final StringBuilder sb7 = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
            sb7.append((Object)xan7);
            sb7.append("\n Found:\n");
            sb7.append((Object)h7);
            return new wuj(false, sb7.toString());
        }
        return new wuj(true, (String)null);
    }
}
