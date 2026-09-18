import java.util.regex.Matcher;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import android.os.Build$VERSION;
import java.util.regex.Pattern;

public final class usp extends bj0
{
    public final Pattern d;
    
    public usp() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }
    
    @Override
    public final boolean b() {
        final boolean b = super.b();
        if (!b || Build$VERSION.SDK_INT >= 29) {
            return b;
        }
        final Uri a = nsp.a;
        final PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        final Matcher matcher = this.d.matcher((CharSequence)currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
