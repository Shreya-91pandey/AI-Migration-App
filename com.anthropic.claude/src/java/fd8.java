public final class fd8 extends t08
{
    public final byte k;
    
    public final String B() {
        switch (this.k) {
            default: {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }
            case 4: {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            case 3: {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
            case 2: {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }
            case 1: {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }
            case 0: {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
        }
    }
    
    public final void r(final b3k b3k, final Object o) {
        final byte k = this.k;
        final int n = 1;
        switch (k) {
            default: {
                final a6q a6q = (a6q)o;
                b3k.U(1, a6q.a);
                b3k.U(2, a6q.b);
                return;
            }
            case 4: {
                final v5q v5q = (v5q)o;
                b3k.U(1, v5q.a);
                b3k.k(2, vt4.f0(v5q.b));
                b3k.U(3, v5q.c);
                b3k.U(4, v5q.d);
                final nt7 b = nt7.b;
                b3k.l(ri2.C0(v5q.e), 5);
                b3k.l(ri2.C0(v5q.f), 6);
                b3k.k(7, v5q.g);
                b3k.k(8, v5q.h);
                b3k.k(9, v5q.i);
                b3k.k(10, v5q.k);
                final int d = ge9.D(v5q.l);
                int n2;
                if (d != 0) {
                    if (d != 1) {
                        en9.r();
                        return;
                    }
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                b3k.k(11, n2);
                b3k.k(12, v5q.m);
                b3k.k(13, v5q.n);
                b3k.k(14, v5q.o);
                b3k.k(15, v5q.p);
                b3k.k(16, v5q.q ? 1 : 0);
                final int d2 = ge9.D(v5q.r);
                int n3;
                if (d2 != 0) {
                    if (d2 != 1) {
                        en9.r();
                        return;
                    }
                    n3 = n;
                }
                else {
                    n3 = 0;
                }
                b3k.k(17, n3);
                b3k.k(18, v5q.s);
                b3k.k(19, v5q.t);
                b3k.k(20, v5q.u);
                b3k.k(21, v5q.v);
                b3k.k(22, v5q.w);
                final String x = v5q.x;
                if (x == null) {
                    b3k.m(23);
                }
                else {
                    b3k.U(23, x);
                }
                final Boolean y = v5q.y;
                Integer value;
                if (y != null) {
                    value = (((boolean)y) ? 1 : 0);
                }
                else {
                    value = null;
                }
                if (value == null) {
                    b3k.m(24);
                }
                else {
                    b3k.k(24, value);
                }
                final fv6 j = v5q.j;
                b3k.k(25, vt4.V(j.a));
                b3k.l(vt4.F(j.b), 26);
                b3k.k(27, j.c ? 1 : 0);
                b3k.k(28, j.d ? 1 : 0);
                b3k.k(29, j.e ? 1 : 0);
                b3k.k(30, j.f ? 1 : 0);
                b3k.k(31, j.g);
                b3k.k(32, j.h);
                b3k.l(vt4.e0(j.i), 33);
                return;
            }
            case 3: {
                final l5q l5q = (l5q)o;
                b3k.U(1, l5q.a);
                b3k.U(2, l5q.b);
                return;
            }
            case 2: {
                final c8n c8n = (c8n)o;
                b3k.U(1, c8n.a);
                b3k.k(2, c8n.b);
                b3k.k(3, c8n.c);
                return;
            }
            case 1: {
                final ejh ejh = (ejh)o;
                b3k.U(1, ejh.a);
                b3k.k(2, ejh.b);
                return;
            }
            case 0: {
                final ed8 ed8 = (ed8)o;
                b3k.U(1, ed8.b());
                b3k.U(2, ed8.a());
            }
        }
    }
}
