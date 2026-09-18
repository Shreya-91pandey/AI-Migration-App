import android.content.SharedPreferences;
import android.content.Context;

public final class yfj extends m9f
{
    public final byte c;
    public final Context d;
    
    public yfj(final Context d) {
        this.c = 1;
        super(9, 10);
        this.d = d;
    }
    
    public yfj(final Context d, final int n, final int n2) {
        this.c = 0;
        super(n, n2);
        this.d = d;
    }
    
    @Override
    public final void a(final vsa vsa) {
        final byte c = this.c;
        final Context d = this.d;
        switch (c) {
            default: {
                vsa.q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                final SharedPreferences sharedPreferences = d.getSharedPreferences("androidx.work.util.preferences", 0);
                Label_0174: {
                    if (!sharedPreferences.contains("reschedule_needed") && !sharedPreferences.contains("last_cancel_all_time_ms")) {
                        break Label_0174;
                    }
                    long n = 0L;
                    final long long1 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        n = 1L;
                    }
                    vsa.c();
                    try {
                        vsa.t(new Object[] { "last_cancel_all_time_ms", long1 });
                        vsa.t(new Object[] { "reschedule_needed", n });
                        sharedPreferences.edit().clear().apply();
                        vsa.L();
                        vsa.p();
                        final SharedPreferences sharedPreferences2 = d.getSharedPreferences("androidx.work.util.id", 0);
                        if (!sharedPreferences2.contains("next_job_scheduler_id") && !sharedPreferences2.contains("next_job_scheduler_id")) {
                            return;
                        }
                        final int int1 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                        final int int2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                        vsa.c();
                        try {
                            vsa.t(new Object[] { "next_job_scheduler_id", int1 });
                            vsa.t(new Object[] { "next_alarm_manager_id", int2 });
                            sharedPreferences2.edit().clear().apply();
                            vsa.L();
                        }
                        finally {
                            vsa.p();
                        }
                    }
                    finally {
                        vsa.p();
                    }
                }
            }
            case 0: {
                if (super.b >= 10) {
                    vsa.t(new Object[] { "reschedule_needed", 1 });
                }
                else {
                    d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                }
            }
        }
    }
}
