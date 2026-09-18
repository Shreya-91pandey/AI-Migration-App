import java.io.Serializable;

public final class mcc
{
    public final byte a;
    public final wlb b;
    public final wlb c;
    public final wlb d;
    public final wlb e;
    public final Serializable f;
    
    public mcc(final String f) {
        this.a = 1;
        this.f = (Serializable)f;
        this.b = new wlb(null, (byte)1);
        this.c = new wlb(null, (byte)0);
        this.d = new wlb(null, (byte)1);
        this.e = new wlb(null, (byte)0);
    }
    
    public mcc(final mcc[] f) {
        this.a = 0;
        this.f = f;
        final int length = f.length;
        final wlb[] array = new wlb[length];
        for (int i = 0; i < length; ++i) {
            array[i] = ((mcc[])(Object)this.f)[i].b();
        }
        this.b = new wlb((zta)new m8p(array, (byte)1), (byte)1);
        final int length2 = ((mcc[])(Object)this.f).length;
        final wlb[] array2 = new wlb[length2];
        for (int j = 0; j < length2; ++j) {
            array2[j] = ((mcc[])(Object)this.f)[j].d();
        }
        this.c = new wlb((zta)new vlb(array2, (byte)1), (byte)0);
        final int length3 = ((mcc[])(Object)this.f).length;
        final wlb[] array3 = new wlb[length3];
        for (int k = 0; k < length3; ++k) {
            array3[k] = ((mcc[])(Object)this.f)[k].c();
        }
        this.d = new wlb((zta)new m8p(array3, (byte)0), (byte)1);
        final int length4 = ((mcc[])(Object)this.f).length;
        final wlb[] array4 = new wlb[length4];
        for (int l = 0; l < length4; ++l) {
            array4[l] = ((mcc[])(Object)this.f)[l].a();
        }
        this.e = new wlb((zta)new vlb(array4, (byte)0), (byte)0);
    }
    
    public final wlb a() {
        final byte a = this.a;
        return this.e;
    }
    
    public final wlb b() {
        final byte a = this.a;
        return this.b;
    }
    
    public final wlb c() {
        final byte a = this.a;
        return this.d;
    }
    
    public final wlb d() {
        final byte a = this.a;
        return this.c;
    }
    
    @Override
    public final String toString() {
        final byte a = this.a;
        final Serializable f = this.f;
        switch (a) {
            default: {
                return hia.k("RectRulers(", (String)f, ")");
            }
            case 0: {
                return iw0.e1((Object[])(Object)f, "innermostOf(", (lta)null, 57);
            }
        }
    }
}
