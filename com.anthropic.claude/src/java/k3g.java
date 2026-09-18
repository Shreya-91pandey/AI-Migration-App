import android.view.KeyEvent;
import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.InputConnection;

public abstract class k3g implements InputConnection
{
    public final p8a a;
    public InputConnection b;
    
    public k3g(final InputConnection b, final p8a a) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean beginBatchEdit() {
        final InputConnection b = this.b;
        return b != null && b.beginBatchEdit();
    }
    
    public final boolean clearMetaKeyStates(final int n) {
        final InputConnection b = this.b;
        return b != null && b.clearMetaKeyStates(n);
    }
    
    public final void closeConnection() {
        final InputConnection b = this.b;
        if (b != null) {
            if (b != null) {
                b.closeConnection();
                this.b = null;
            }
            this.a.b((Object)this);
        }
    }
    
    public final boolean commitCompletion(final CompletionInfo completionInfo) {
        final InputConnection b = this.b;
        return b != null && b.commitCompletion(completionInfo);
    }
    
    public final boolean commitCorrection(final CorrectionInfo correctionInfo) {
        final InputConnection b = this.b;
        return b != null && b.commitCorrection(correctionInfo);
    }
    
    public final boolean commitText(final CharSequence charSequence, final int n) {
        final InputConnection b = this.b;
        return b != null && b.commitText(charSequence, n);
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        final InputConnection b = this.b;
        return b != null && b.deleteSurroundingText(n, n2);
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        final InputConnection b = this.b;
        return b != null && b.deleteSurroundingTextInCodePoints(n, n2);
    }
    
    public final boolean endBatchEdit() {
        final InputConnection b = this.b;
        return b != null && b.endBatchEdit();
    }
    
    public final boolean finishComposingText() {
        final InputConnection b = this.b;
        return b != null && b.finishComposingText();
    }
    
    public final int getCursorCapsMode(final int n) {
        final InputConnection b = this.b;
        if (b != null) {
            return b.getCursorCapsMode(n);
        }
        return 0;
    }
    
    public final ExtractedText getExtractedText(final ExtractedTextRequest extractedTextRequest, final int n) {
        final InputConnection b = this.b;
        if (b != null) {
            return b.getExtractedText(extractedTextRequest, n);
        }
        return null;
    }
    
    public final Handler getHandler() {
        final InputConnection b = this.b;
        if (b != null) {
            return b.getHandler();
        }
        return null;
    }
    
    public final CharSequence getSelectedText(final int n) {
        final InputConnection b = this.b;
        if (b != null) {
            return b.getSelectedText(n);
        }
        return null;
    }
    
    public final CharSequence getTextAfterCursor(final int n, final int n2) {
        final InputConnection b = this.b;
        if (b != null) {
            return b.getTextAfterCursor(n, n2);
        }
        return null;
    }
    
    public final CharSequence getTextBeforeCursor(final int n, final int n2) {
        final InputConnection b = this.b;
        if (b != null) {
            return b.getTextBeforeCursor(n, n2);
        }
        return null;
    }
    
    public final boolean performContextMenuAction(final int n) {
        final InputConnection b = this.b;
        return b != null && b.performContextMenuAction(n);
    }
    
    public final boolean performEditorAction(final int n) {
        final InputConnection b = this.b;
        return b != null && b.performEditorAction(n);
    }
    
    public final boolean performPrivateCommand(final String s, final Bundle bundle) {
        final InputConnection b = this.b;
        return b != null && b.performPrivateCommand(s, bundle);
    }
    
    public final boolean reportFullscreenMode(final boolean b) {
        final InputConnection b2 = this.b;
        return b2 != null && b2.reportFullscreenMode(b);
    }
    
    public final boolean requestCursorUpdates(final int n) {
        final InputConnection b = this.b;
        return b != null && b.requestCursorUpdates(n);
    }
    
    public final boolean sendKeyEvent(final KeyEvent keyEvent) {
        final InputConnection b = this.b;
        return b != null && b.sendKeyEvent(keyEvent);
    }
    
    public final boolean setComposingRegion(final int n, final int n2) {
        final InputConnection b = this.b;
        return b != null && b.setComposingRegion(n, n2);
    }
    
    public final boolean setComposingText(final CharSequence charSequence, final int n) {
        final InputConnection b = this.b;
        return b != null && b.setComposingText(charSequence, n);
    }
    
    public final boolean setSelection(final int n, final int n2) {
        final InputConnection b = this.b;
        return b != null && b.setSelection(n, n2);
    }
}
