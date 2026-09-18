import android.view.Window;
import android.view.View;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

public final class jra extends uuj implements i8g, ycp, f8g, te, j9k, yra
{
    public final vra A;
    public final kra B;
    public final Activity x;
    public final Context y;
    public final Handler z;
    
    public jra(final kra y) {
        this.B = y;
        final Handler z = new Handler();
        this.x = (Activity)y;
        this.y = (Context)y;
        this.z = z;
        this.A = new vra();
    }
    
    public final void A(final yv6 yv6) {
        this.B.A(yv6);
    }
    
    public final void B(final yv6 yv6) {
        this.B.B(yv6);
    }
    
    public final void J() {
    }
    
    public final vad d() {
        return this.B.R;
    }
    
    public final d8g e() {
        return this.B.e();
    }
    
    public final ee6 p() {
        return this.B.D;
    }
    
    public final View p0(final int n) {
        return ((Activity)this.B).findViewById(n);
    }
    
    public final boolean q0() {
        final Window window = ((Activity)this.B).getWindow();
        return window != null && window.peekDecorView() != null;
    }
    
    public final xcp s() {
        return this.B.s();
    }
    
    public final e3a x() {
        return (e3a)this.B.y.x;
    }
}
