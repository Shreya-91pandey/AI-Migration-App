import android.os.BaseBundle;
import android.os.PowerManager;
import java.util.Iterator;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudInterruptReason;
import com.anthropic.claude.bell.tts.j;
import java.util.Collection;
import java.util.HashSet;
import com.google.android.play.core.install.zza;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class dm2 extends BroadcastReceiver
{
    public final byte a;
    public final Object b;
    
    public final void onReceive(Context context, final Intent intent) {
        final byte a = this.a;
        final Boolean b = null;
        switch (a) {
            default: {
                final lmq lmq = (lmq)this.b;
                final boolean equals = context.getPackageName().equals((Object)intent.getStringExtra("package.name"));
                final xzj a2 = lmq.a;
                if (!equals) {
                    a2.k("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", new Object[] { intent.getStringExtra("package.name") });
                    return;
                }
                a2.k("List of extras in received intent:", new Object[0]);
                for (final String s : ((BaseBundle)intent.getExtras()).keySet()) {
                    lmq.a.k("Key: %s; value: %s", new Object[] { s, ((BaseBundle)intent.getExtras()).get(s) });
                }
                final zza d = zza.d(intent, lmq.a);
                lmq.a.k("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[] { d });
                final lmq lmq2;
                monitorenter(lmq2 = lmq);
                Label_0259: {
                    try {
                        final Iterator iterator2 = new HashSet((Collection)lmq.d).iterator();
                        while (iterator2.hasNext()) {
                            ((rfj)iterator2.next()).a(d);
                        }
                        break Label_0259;
                    }
                    finally {
                        monitorexit(lmq2);
                        monitorexit(lmq2);
                    }
                }
            }
            case 4: {
                String action;
                if (intent != null) {
                    action = intent.getAction();
                }
                else {
                    action = null;
                }
                if (mlc.q((Object)action, (Object)"android.media.AUDIO_BECOMING_NOISY")) {
                    a9n u = ((j)this.b).u;
                    if (u != null) {
                        if (!u.i()) {
                            u = null;
                        }
                        if (u != null) {
                            u.s(ReadAloudEvents$ReadAloudInterruptReason.z);
                        }
                    }
                    rhc.G((oc7)ien.e(), (hc7)null, 0, (zta)new dc4((j)this.b, (f07)null, (byte)1), 3);
                }
                return;
            }
            case 3: {
                context = (Context)this.b;
                if (mlc.q((Object)intent.getAction(), (Object)"android.intent.action.DOWNLOAD_COMPLETE")) {
                    final long n = -1L;
                    long n2 = 0L;
                    try {
                        intent.getLongExtra("extra_download_id", -1L);
                    }
                    finally {
                        final Throwable t;
                        rhc.C(intent, "extra_download_id", "Long", t);
                        n2 = n;
                    }
                    if (((ns8)context).c.containsKey((Object)n2)) {
                        rhc.G((oc7)((ns8)context).f, (hc7)null, 3, (zta)new ms8((byte)0, n2, (f07)null, (Object)context, (Object)this.goAsync()), 1);
                    }
                }
                return;
            }
            case 2: {
                final PowerManager x = ((g38)this.b).x;
                Boolean value = b;
                if (x != null) {
                    value = x.isPowerSaveMode();
                }
                if (value != null) {
                    ((g38)this.b).C = value;
                }
                return;
            }
            case 1: {
                ((jrh)this.b).e((Object)lqo.a);
                return;
            }
            case 0: {
                final rz1 rz1 = (rz1)this.b;
                Label_0936: {
                    switch (rz1.g) {
                        default: {
                            if (intent.getAction() == null) {
                                break;
                            }
                            final krd c = krd.c();
                            final int a3 = ptm.a;
                            intent.getAction();
                            c.getClass();
                            final String action2 = intent.getAction();
                            if (action2 == null) {
                                break;
                            }
                            final int hashCode = action2.hashCode();
                            if (hashCode != -1181163412) {
                                if (hashCode != -730838620) {
                                    break;
                                }
                                if (!action2.equals((Object)"android.intent.action.DEVICE_STORAGE_OK")) {
                                    break;
                                }
                                rz1.b(Boolean.TRUE);
                                break;
                            }
                            else {
                                if (!action2.equals((Object)"android.intent.action.DEVICE_STORAGE_LOW")) {
                                    break;
                                }
                                rz1.b(Boolean.FALSE);
                                break;
                            }
                            break;
                        }
                        case 1: {
                            if (intent.getAction() == null) {
                                break;
                            }
                            final krd c2 = krd.c();
                            final String a4 = uz1.a;
                            intent.getAction();
                            c2.getClass();
                            final String action3 = intent.getAction();
                            if (action3 == null) {
                                break;
                            }
                            final int hashCode2 = action3.hashCode();
                            if (hashCode2 != -1980154005) {
                                if (hashCode2 != 490310653) {
                                    break;
                                }
                                if (!action3.equals((Object)"android.intent.action.BATTERY_LOW")) {
                                    break;
                                }
                                rz1.b(Boolean.FALSE);
                                break;
                            }
                            else {
                                if (!action3.equals((Object)"android.intent.action.BATTERY_OKAY")) {
                                    break;
                                }
                                rz1.b(Boolean.TRUE);
                                break;
                            }
                            break;
                        }
                        case 0: {
                            final String action4 = intent.getAction();
                            if (action4 == null) {
                                break;
                            }
                            final krd c3 = krd.c();
                            final String a5 = sz1.a;
                            c3.getClass();
                            switch (action4.hashCode()) {
                                default: {
                                    break Label_0936;
                                }
                                case 1019184907: {
                                    if (!action4.equals((Object)"android.intent.action.ACTION_POWER_CONNECTED")) {
                                        break Label_0936;
                                    }
                                    rz1.b(Boolean.TRUE);
                                    break Label_0936;
                                }
                                case 948344062: {
                                    if (!action4.equals((Object)"android.os.action.CHARGING")) {
                                        break Label_0936;
                                    }
                                    rz1.b(Boolean.TRUE);
                                    break Label_0936;
                                }
                                case -54942926: {
                                    if (!action4.equals((Object)"android.os.action.DISCHARGING")) {
                                        break Label_0936;
                                    }
                                    rz1.b(Boolean.FALSE);
                                    break Label_0936;
                                }
                                case -1886648615: {
                                    if (!action4.equals((Object)"android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        break Label_0936;
                                    }
                                    rz1.b(Boolean.FALSE);
                                    break Label_0936;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
