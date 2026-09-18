import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

public final class rz1 extends cv6
{
    public final dm2 f;
    public final byte g;
    
    public rz1(final Context context, final f5q f5q, final byte g) {
        this.g = g;
        super(context, f5q);
        this.f = new dm2(this, (byte)0);
    }
    
    @Override
    public final Object a() {
        final byte g = this.g;
        final Context b = super.b;
        final boolean b2 = true;
        final boolean b3 = true;
        final boolean b4 = true;
        switch (g) {
            default: {
                final Intent registerReceiver = b.registerReceiver((BroadcastReceiver)null, this.e());
                boolean b5 = b4;
                if (registerReceiver != null) {
                    if (registerReceiver.getAction() == null) {
                        b5 = b4;
                    }
                    else {
                        final String action = registerReceiver.getAction();
                        if (action != null) {
                            final int hashCode = action.hashCode();
                            if (hashCode != -1181163412) {
                                if (hashCode == -730838620) {
                                    b5 = b4;
                                    if (action.equals((Object)"android.intent.action.DEVICE_STORAGE_OK")) {
                                        return b5;
                                    }
                                }
                            }
                            else {
                                action.equals((Object)"android.intent.action.DEVICE_STORAGE_LOW");
                            }
                        }
                        b5 = false;
                    }
                }
                return b5;
            }
            case 1: {
                final Intent registerReceiver2 = b.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                Boolean b6;
                if (registerReceiver2 == null) {
                    krd.c().a(uz1.a(), "getInitialState - null intent received");
                    b6 = Boolean.FALSE;
                }
                else {
                    final int intExtra = registerReceiver2.getIntExtra("status", -1);
                    final float n = registerReceiver2.getIntExtra("level", -1) / (float)registerReceiver2.getIntExtra("scale", -1);
                    boolean b7 = b2;
                    if (intExtra != 1) {
                        b7 = (n > 0.15f && b2);
                    }
                    b6 = b7;
                }
                return b6;
            }
            case 0: {
                final Intent registerReceiver3 = b.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                Boolean b8;
                if (registerReceiver3 == null) {
                    krd.c().a(sz1.a(), "getInitialState - null intent received");
                    b8 = Boolean.FALSE;
                }
                else {
                    final int intExtra2 = registerReceiver3.getIntExtra("status", -1);
                    boolean b9 = b3;
                    if (intExtra2 != 2) {
                        b9 = (intExtra2 == 5 && b3);
                    }
                    b8 = b9;
                }
                return b8;
            }
        }
    }
    
    @Override
    public final void c() {
        final krd c = krd.c();
        final int a = em2.a;
        c.getClass();
        super.b.registerReceiver((BroadcastReceiver)this.f, this.e());
    }
    
    @Override
    public final void d() {
        final krd c = krd.c();
        final int a = em2.a;
        c.getClass();
        super.b.unregisterReceiver((BroadcastReceiver)this.f);
    }
    
    public final IntentFilter e() {
        switch (this.g) {
            default: {
                final IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter;
            }
            case 1: {
                final IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            }
            case 0: {
                final IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.os.action.CHARGING");
                intentFilter3.addAction("android.os.action.DISCHARGING");
                return intentFilter3;
            }
        }
    }
}
