import java.util.Objects;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.File;

public final class gth
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    
    public gth(final int a, final int b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gth a(final File file) {
        final DataInputStream dataInputStream = new DataInputStream((InputStream)new FileInputStream(file));
        try {
            final gth gth = new gth(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            ((InputStream)dataInputStream).close();
            return gth;
        }
        finally {
            try {
                ((InputStream)dataInputStream).close();
            }
            finally {
                final Throwable t;
                ((Throwable)file).addSuppressed(t);
            }
        }
    }
    
    public final void b(final File file) {
        file.delete();
        final DataOutputStream dataOutputStream = new DataOutputStream((OutputStream)new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.d);
            ((OutputStream)dataOutputStream).close();
        }
        finally {
            try {
                ((OutputStream)dataOutputStream).close();
            }
            finally {
                final Throwable t;
                ((Throwable)file).addSuppressed(t);
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (o instanceof gth) {
                final gth gth = (gth)o;
                if (this.b == gth.b && this.c == gth.c && this.a == gth.a && this.d == gth.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.b, this.c, this.a, this.d });
    }
}
