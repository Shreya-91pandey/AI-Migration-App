import java.io.FileOutputStream;
import java.io.OutputStream;

public final class wsi extends OutputStream
{
    public final byte v;
    public final Object w;
    
    public wsi(final FileOutputStream w) {
        this.v = 1;
        this.w = w;
    }
    
    public wsi(final xsi w) {
        this.v = 0;
        this.w = w;
    }
    
    private final void c() {
    }
    
    public final void close() {
        switch (this.v) {
            default: {
                return;
            }
            case 0: {
                ((xsi)this.w).close();
            }
        }
    }
    
    public final void flush() {
        final byte v = this.v;
        final Object w = this.w;
        switch (v) {
            default: {
                ((OutputStream)w).flush();
                return;
            }
            case 0: {
                final xsi xsi = (xsi)w;
                if (!xsi.x) {
                    xsi.flush();
                }
            }
        }
    }
    
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)this.w);
                sb.append(".outputStream()");
                return sb.toString();
            }
        }
    }
    
    public final void write(final int n) {
        final byte v = this.v;
        final Object w = this.w;
        switch (v) {
            default: {
                ((FileOutputStream)w).write(n);
                return;
            }
            case 0: {
                final xsi xsi = (xsi)w;
                if (!xsi.x) {
                    xsi.w.g1((int)(byte)n);
                    xsi.c();
                }
                else {
                    uy8.h("closed");
                }
            }
        }
    }
    
    public void write(final byte[] array) {
        switch (this.v) {
            default: {
                super.write(array);
                return;
            }
            case 1: {
                ((FileOutputStream)this.w).write(array);
            }
        }
    }
    
    public final void write(final byte[] array, final int n, final int n2) {
        final byte v = this.v;
        final Object w = this.w;
        switch (v) {
            default: {
                ((FileOutputStream)w).write(array, n, n2);
                return;
            }
            case 0: {
                final xsi xsi = (xsi)w;
                if (!xsi.x) {
                    xsi.w.write(array, n, n2);
                    xsi.c();
                }
                else {
                    uy8.h("closed");
                }
            }
        }
    }
}
