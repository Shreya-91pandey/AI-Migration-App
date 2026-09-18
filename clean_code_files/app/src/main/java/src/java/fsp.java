import java.util.Objects;

public final class fsp
{
    public final boolean a;
    public final String b;
    
    public fsp(final String b, final k3p[] array) {
        this.b = b;
        this.a = false;
    }
    
    public fsp(final boolean a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public fsp(final byte[] array, final k3p[] array2) {
        Objects.requireNonNull((Object)array);
        this.b = null;
        this.a = true;
    }
    
    public String a() {
        final boolean a = this.a;
        if (!a) {
            return this.b;
        }
        final StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        String s;
        if (a) {
            if (!a) {
                s = "Unknown";
            }
            else {
                s = "ArrayBuffer";
            }
        }
        else {
            s = "String";
        }
        throw new IllegalStateException(oz1.p(sb, s, " expected, but got String"));
    }
}
