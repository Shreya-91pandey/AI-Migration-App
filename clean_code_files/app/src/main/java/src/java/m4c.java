import java.util.ArrayList;
import java.util.List;

public final class m4c
{
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;
    
    public m4c(String a, float b, float c, float d, float e, float f, float g, float h, List v, int a2) {
        if ((a2 & 0x1) != 0x0) {
            a = "";
        }
        if ((a2 & 0x2) != 0x0) {
            b = 0.0f;
        }
        if ((a2 & 0x4) != 0x0) {
            c = 0.0f;
        }
        if ((a2 & 0x8) != 0x0) {
            d = 0.0f;
        }
        if ((a2 & 0x10) != 0x0) {
            e = 1.0f;
        }
        if ((a2 & 0x20) != 0x0) {
            f = 1.0f;
        }
        if ((a2 & 0x40) != 0x0) {
            g = 0.0f;
        }
        if ((a2 & 0x80) != 0x0) {
            h = 0.0f;
        }
        if ((a2 & 0x100) != 0x0) {
            a2 = l6p.a;
            v = (List)r89.v;
        }
        final ArrayList j = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = v;
        this.j = j;
    }
}
