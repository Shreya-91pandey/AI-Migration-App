import java.io.InputStream;
import java.util.List;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;

public abstract class g66
{
    public int v;
    public Object w;
    
    public g66(final byte b) {
        switch (b) {
            default: {
                return;
            }
            case 1: {
                this.v = 1;
            }
        }
    }
    
    public g66(final int v) {
        this.v = v;
    }
    
    public static int e(int read, final FileInputStream fileInputStream) {
        if ((read & 0x80) == 0x0) {
            return read;
        }
        int n = read & 0x7F;
        read = 7;
        int i;
        while (true) {
            i = read;
            if (read >= 32) {
                break;
            }
            final int read2 = ((InputStream)fileInputStream).read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.e();
            }
            n |= (read2 & 0x7F) << read;
            if ((read2 & 0x80) == 0x0) {
                return n;
            }
            read += 7;
        }
        while (i < 64) {
            read = ((InputStream)fileInputStream).read();
            if (read == -1) {
                throw InvalidProtocolBufferException.e();
            }
            if ((read & 0x80) == 0x0) {
                return n;
            }
            i += 7;
        }
        throw InvalidProtocolBufferException.c();
    }
    
    public void a(final l1q l1q) {
    }
    
    public void b(final l1q l1q) {
    }
    
    public abstract h2q c(final h2q p0, final List p1);
    
    public abstract vhk d(final l1q p0, final vhk p1);
    
    public void f() {
        if (this.v == 1) {
            jac.c("ToolbarRequester is not initialized.");
        }
        final vgn vgn = (vgn)this.w;
        if (vgn != null && ((hgf)vgn).I) {
            final wmm p = vgn.P;
            if (p == null || !((bqc)p).c()) {
                final pgn pgn = (pgn)uoo.z((zl6)vgn, (sei)qgn.a());
                if (pgn != null) {
                    vgn.P = rhc.G(((hgf)vgn).c1(), (hc7)null, 4, (zta)new gzh((Object)vgn, (Object)pgn, (f07)null, (byte)10), 1);
                }
            }
        }
    }
}
