import java.util.concurrent.CancellationException;
import android.net.Uri$Builder;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.OriginRelativePath;
import com.anthropic.claude.api.chat.MessageBlobFile;

public final class anh
{
    public final oi0 a;
    public final s3p b;
    public final ymh c;
    public final daa d;
    
    public anh(final b03 b03, final oi0 a, final s3p b4, final ymh c) {
        this.a = a;
        this.b = b4;
        this.c = c;
        final o68 a2 = vo8.a;
        final d58 w = d58.w;
        this.d = new daa(b03);
    }
    
    public final String a(final MessageBlobFile messageBlobFile, final oca oca) {
        String s;
        if (oca instanceof mca) {
            s = this.b(messageBlobFile, (mca)oca);
        }
        else {
            if (!oca.equals(nca.a)) {
                en9.r();
                return null;
            }
            String d = messageBlobFile.d;
            if (messageBlobFile.g != null) {
                d = null;
            }
            final String a = messageBlobFile.a;
            if (d == null) {
                s = ekq.H(this.b.d, a);
                OriginRelativePath.b(s);
            }
            else {
                SilentException.a(new SilentException(smk.s("Preview: wiggle blob on non-chat surface, file_uuid=", a)), lpl.w, (List)null, 6);
                s = null;
            }
        }
        if (s != null) {
            return bar.k(this.a, s);
        }
        return null;
    }
    
    public final String b(final MessageBlobFile messageBlobFile, final mca mca) {
        final String d = this.b.d;
        final String b = mca.b();
        if (b != null) {
            return b;
        }
        String d2 = messageBlobFile.d;
        if (messageBlobFile.g != null) {
            d2 = null;
        }
        if (d2 == null) {
            final String h = ekq.H(d, messageBlobFile.a);
            OriginRelativePath.b(h);
            return h;
        }
        final String string = new Uri$Builder().path(lmf.t("/api/organizations/", d, "/conversations/", mca.a(), "/wiggle/download-file")).appendQueryParameter("path", d2).build().toString();
        string.getClass();
        OriginRelativePath.b(string);
        return string;
    }
    
    public final Object c(oca v, MessageBlobFile messageBlobFile, final h07 h07) {
        final zn0 a = this.c.a;
        zmh zmh2 = null;
        Label_0063: {
            if (h07 instanceof zmh) {
                final zmh zmh = (zmh)h07;
                final int y = zmh.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    zmh.y = y + Integer.MIN_VALUE;
                    zmh2 = zmh;
                    break Label_0063;
                }
            }
            zmh2 = new zmh(this, h07);
        }
        final Object w = zmh2.w;
        final int y2 = zmh2.y;
        final lpl w2 = lpl.w;
        if (y2 == 0 || y2 != 1) {
            goto Label_0126;
        }
        messageBlobFile = (MessageBlobFile)(v = (oca)zmh2.v);
        try {
            vt4.g0(w);
            goto Label_0277;
        }
        catch (final Exception ex) {
            goto Label_0755;
        }
        catch (final CancellationException ex2) {
            throw ex2;
        }
    }
}
