public abstract class puj
{
    public void a(final vsa vsa) {
        vsa.c();
        try {
            final StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            sb.append(System.currentTimeMillis() - 86400000L);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            vsa.q(sb.toString());
            vsa.L();
        }
        finally {
            vsa.p();
        }
    }
}
