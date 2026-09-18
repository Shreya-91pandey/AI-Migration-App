import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;

public final class vsp extends aj0
{
    public final byte e;
    
    @Override
    public final boolean b() {
        final byte e = this.e;
        final boolean b = false;
        boolean b2 = false;
        final boolean b3 = false;
        switch (e) {
            default: {
                boolean b4;
                if (!wsp.a("MULTI_PROFILE")) {
                    b4 = b3;
                }
                else {
                    b4 = super.b();
                }
                return b4;
            }
            case 1: {
                boolean multiProcessEnabled;
                if (!super.b()) {
                    multiProcessEnabled = b;
                }
                else {
                    multiProcessEnabled = b;
                    if (wsp.a("MULTI_PROCESS")) {
                        final Uri a = nsp.a;
                        if (wsp.b.b()) {
                            multiProcessEnabled = xsp.a.getStatics().isMultiProcessEnabled();
                        }
                        else {
                            oyl.s("This method is not supported by the current version of the framework and the current WebView APK");
                            multiProcessEnabled = b;
                        }
                    }
                }
                return multiProcessEnabled;
            }
            case 0: {
                if (super.b()) {
                    final Uri a2 = nsp.a;
                    final PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage != null) {
                        if (miq.j(currentWebViewPackage) >= 636700000L) {
                            b2 = true;
                        }
                    }
                }
                return b2;
            }
        }
    }
}
