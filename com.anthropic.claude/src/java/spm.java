import java.util.ArrayList;
import android.text.Spanned;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.concurrent.CancellationException;
import android.view.View;
import android.os.CancellationSignal;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.function.IntConsumer;
import java.util.concurrent.Executor;
import android.view.inputmethod.HandwritingGesture;
import android.os.Handler;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.view.inputmethod.TextAttribute;
import android.view.inputmethod.CorrectionInfo;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import java.util.Objects;
import android.view.inputmethod.CompletionInfo;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public final class spm implements InputConnection
{
    public final yb0 a;
    public final inf b;
    public final occ c;
    
    public spm(final yb0 a, final EditorInfo editorInfo) {
        this.a = a;
        this.b = new inf(0, (Object[])new lta[16]);
        final InputConnectionWrapper inputConnectionWrapper = new InputConnectionWrapper((InputConnection)this, false);
        final xzj xzj = new xzj((Object)this);
        if (editorInfo != null) {
            this.c = new occ((InputConnection)inputConnectionWrapper, (pcc)xzj);
            return;
        }
        fvd.k("editorInfo must be non-null");
        throw null;
    }
    
    public final hhn a() {
        return ((peo)this.a.x).f();
    }
    
    public final void b(final int n) {
        this.sendKeyEvent(new KeyEvent(0, n));
        this.sendKeyEvent(new KeyEvent(1, n));
    }
    
    public final boolean beginBatchEdit() {
        final z48 z48 = (z48)this.a.v;
        ++z48.w;
        return true;
    }
    
    public final boolean clearMetaKeyStates(final int n) {
        return false;
    }
    
    public final void closeConnection() {
        this.b.h();
    }
    
    public final boolean commitCompletion(final CompletionInfo completionInfo) {
        CharSequence text;
        if (completionInfo != null) {
            text = completionInfo.getText();
        }
        else {
            text = null;
        }
        Objects.toString((Object)text);
        return false;
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
        Objects.toString((Object)inputContentInfo);
        Objects.toString((Object)bundle);
        return w9r.c(this.c, inputContentInfo, n, bundle);
    }
    
    public final boolean commitCorrection(final CorrectionInfo correctionInfo) {
        return true;
    }
    
    public final boolean commitText(final CharSequence charSequence, final int n) {
        Objects.toString((Object)charSequence);
        if (charSequence == null) {
            return true;
        }
        q8r.i((u4c)this.a, charSequence.toString(), n);
        return true;
    }
    
    public final boolean commitText(final CharSequence charSequence, final int n, final TextAttribute textAttribute) {
        Objects.toString((Object)charSequence);
        Objects.toString((Object)textAttribute);
        q8r.h((u4c)this.a, charSequence.toString(), n, Build$VERSION.SDK_INT >= 37 && textAttribute != null && z9r.e(textAttribute));
        return true;
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        q8r.j((u4c)this.a, n, n2);
        return true;
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        q8r.k((u4c)this.a, n, n2);
        return true;
    }
    
    public final boolean endBatchEdit() {
        return ((z48)this.a.v).a();
    }
    
    public final boolean finishComposingText() {
        q8r.l((u4c)this.a);
        return true;
    }
    
    public final int getCursorCapsMode(final int n) {
        return TextUtils.getCapsMode((CharSequence)this.a(), dnn.g(this.a().y), n);
    }
    
    public final ExtractedText getExtractedText(final ExtractedTextRequest extractedTextRequest, final int n) {
        Objects.toString((Object)extractedTextRequest);
        return j9r.f(this.a());
    }
    
    public final Handler getHandler() {
        return null;
    }
    
    public final CharSequence getSelectedText(int g) {
        if (dnn.d(this.a().y)) {
            return null;
        }
        final hhn a = this.a();
        g = dnn.g(a.y);
        return (CharSequence)a.x.subSequence(g, dnn.f(a.y)).toString();
    }
    
    public final CharSequence getTextAfterCursor(final int n, int length) {
        final hhn a = this.a();
        final long y = a.y;
        final CharSequence x = a.x;
        final int f = dnn.f(y);
        final int f2 = dnn.f(a.y);
        final int n2 = length = f2 + n;
        if (((f2 ^ n2) & (n ^ n2)) < 0) {
            length = x.length();
        }
        return (CharSequence)x.subSequence(f, Math.min(length, x.length())).toString();
    }
    
    public final CharSequence getTextBeforeCursor(int max, int g) {
        final hhn a = this.a();
        final int g2 = dnn.g(a.y);
        if (((max ^ g2) & (g2 ^ (g = g2 - max))) < 0) {
            g = 0;
        }
        max = Math.max(0, g);
        g = dnn.g(a.y);
        return (CharSequence)a.x.subSequence(max, g).toString();
    }
    
    public final boolean performContextMenuAction(int length) {
        switch (length) {
            default: {
                return false;
            }
            case 16908322: {
                this.b(279);
                return false;
            }
            case 16908321: {
                this.b(278);
                return false;
            }
            case 16908320: {
                this.b(277);
                return false;
            }
            case 16908319: {
                length = this.a().x.length();
                q8r.y((u4c)this.a, 0, length);
                return false;
            }
        }
    }
    
    public final boolean performEditorAction(int n) {
        Label_0078: {
            if (n != 0) {
                switch (n) {
                    case 7: {
                        n = 5;
                        break Label_0078;
                    }
                    case 6: {
                        n = 7;
                        break Label_0078;
                    }
                    case 5: {
                        n = 6;
                        break Label_0078;
                    }
                    case 4: {
                        n = 4;
                        break Label_0078;
                    }
                    case 3: {
                        n = 3;
                        break Label_0078;
                    }
                    case 2: {
                        n = 2;
                        break Label_0078;
                    }
                }
            }
            n = 1;
        }
        final lta lta = (lta)this.a.z;
        if (lta != null) {
            lta.b((Object)new t4c(n));
        }
        return true;
    }
    
    public final void performHandwritingGesture(final HandwritingGesture handwritingGesture, final Executor executor, final IntConsumer intConsumer) {
        Objects.toString((Object)handwritingGesture);
        Objects.toString((Object)executor);
        Objects.toString((Object)intConsumer);
        if (Build$VERSION.SDK_INT < 34) {
            return;
        }
        y9r.n(this.a, handwritingGesture, executor, intConsumer);
    }
    
    public final boolean performPrivateCommand(final String s, final Bundle bundle) {
        Objects.toString((Object)bundle);
        return ((InputConnectionWrapper)this.c).performPrivateCommand(s, bundle);
    }
    
    public final boolean previewHandwritingGesture(final PreviewableHandwritingGesture previewableHandwritingGesture, final CancellationSignal cancellationSignal) {
        Objects.toString((Object)previewableHandwritingGesture);
        Objects.toString((Object)cancellationSignal);
        return Build$VERSION.SDK_INT >= 34 && y9r.o(this.a, previewableHandwritingGesture, cancellationSignal);
    }
    
    public final boolean reportFullscreenMode(final boolean b) {
        return false;
    }
    
    public final boolean requestCursorUpdates(final int n) {
        final nr7 nr7 = (nr7)this.a.C;
        boolean b = false;
        final boolean b2 = false;
        final boolean b3 = (n & 0x1) != 0x0;
        final boolean b4 = (n & 0x2) != 0x0;
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean a = false;
        boolean b5 = false;
        boolean c = false;
        boolean d = false;
        Label_0190: {
            if (sdk_INT >= 33) {
                a = ((n & 0x10) != 0x0);
                b5 = ((n & 0x8) != 0x0);
                c = ((n & 0x4) != 0x0);
                d = b2;
                if (sdk_INT >= 34) {
                    d = b2;
                    if ((n & 0x20) != 0x0) {
                        d = true;
                    }
                }
                if (a || b5 || c || d) {
                    break Label_0190;
                }
                if (sdk_INT >= 34) {
                    d = true;
                }
                b = true;
            }
            else {
                d = false;
            }
            final boolean b6 = true;
            b5 = true;
            c = b;
            a = b6;
        }
        nr7.a = a;
        nr7.b = b5;
        nr7.c = c;
        nr7.d = d;
        if (b3) {
            final CursorAnchorInfo a2 = nr7.a();
            if (a2 != null) {
                final ko1 ko1 = (ko1)nr7.g;
                ko1.g().updateCursorAnchorInfo((View)ko1.a, a2);
            }
        }
        final wmm wmm = (wmm)nr7.i;
        if (!b4) {
            if (wmm != null) {
                ((bqc)wmm).g((CancellationException)null);
            }
            nr7.i = null;
            return true;
        }
        if (wmm != null && ((bqc)wmm).c()) {
            return true;
        }
        nr7.i = rhc.G((oc7)nr7.h, (hc7)null, 4, (zta)new pn((byte)10, (f07)null, (Object)nr7), 1);
        return true;
    }
    
    public final boolean sendKeyEvent(final KeyEvent keyEvent) {
        Objects.toString((Object)keyEvent);
        ((ih6)this.a.y).l(keyEvent);
        return true;
    }
    
    public final boolean setComposingRegion(final int n, final int n2) {
        q8r.w((u4c)this.a, n, n2);
        return true;
    }
    
    public final boolean setComposingText(final CharSequence charSequence, final int n) {
        Objects.toString((Object)charSequence);
        if (charSequence == null) {
            return true;
        }
        final String string = charSequence.toString();
        final boolean b = charSequence instanceof Spanned;
        ArrayList n2 = null;
        Spanned spanned;
        if (b) {
            spanned = (Spanned)charSequence;
        }
        else {
            spanned = null;
        }
        if (spanned != null) {
            n2 = j9r.n(spanned);
        }
        q8r.x((u4c)this.a, string, n, n2, false, 8);
        return true;
    }
    
    public final boolean setComposingText(final CharSequence charSequence, final int n, final TextAttribute textAttribute) {
        Objects.toString((Object)charSequence);
        Objects.toString((Object)textAttribute);
        q8r.x((u4c)this.a, charSequence.toString(), n, (ArrayList)null, Build$VERSION.SDK_INT >= 37 && textAttribute != null && z9r.e(textAttribute), 4);
        return true;
    }
    
    public final boolean setSelection(final int n, final int n2) {
        final yb0 a = this.a;
        q8r.y((u4c)a, n, n2);
        ((lta)a.A).b((Object)Boolean.FALSE);
        return true;
    }
}
