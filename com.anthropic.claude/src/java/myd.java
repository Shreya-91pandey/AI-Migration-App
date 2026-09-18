import java.util.LinkedHashMap;

public final class myd
{
    public final LinkedHashMap a;
    
    public myd(final byte b) {
        switch (b) {
            default: {
                this.a = new LinkedHashMap(0, 0.75f, true);
                return;
            }
            case 1: {
                this.a = new LinkedHashMap();
            }
        }
    }
}
