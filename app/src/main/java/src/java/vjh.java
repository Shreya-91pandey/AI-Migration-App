import androidx.datastore.preferences.protobuf.f;

public final class vjh extends f
{
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final vjh DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile gug PARSER;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_;
    private Object value_;
    
    static {
        f.j((Class)vjh.class, (f)(DEFAULT_INSTANCE = new vjh()));
    }
    
    public vjh() {
        this.valueCase_ = 0;
    }
    
    public static vjh o() {
        return vjh.DEFAULT_INSTANCE;
    }
    
    public static ujh w() {
        return (ujh)vjh.DEFAULT_INSTANCE.b(5);
    }
    
    public final void A(final float n) {
        this.valueCase_ = 2;
        this.value_ = n;
    }
    
    public final void B(final int n) {
        this.valueCase_ = 3;
        this.value_ = n;
    }
    
    public final void C(final long n) {
        this.valueCase_ = 4;
        this.value_ = n;
    }
    
    public final void D(final String value_) {
        this.valueCase_ = 5;
        this.value_ = value_;
    }
    
    public final void E(final tjh value_) {
        this.value_ = value_;
        this.valueCase_ = 6;
    }
    
    public final Object b(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return 1;
        }
        if (d == 2) {
            return new cqi(vjh.DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[] { "value_", "valueCase_", tjh.class });
        }
        if (d == 3) {
            return new vjh();
        }
        if (d == 4) {
            return new twa(vjh.DEFAULT_INSTANCE);
        }
        if (d == 5) {
            return vjh.DEFAULT_INSTANCE;
        }
        if (d == 6) {
            final gug parser = vjh.PARSER;
            if (parser == null) {
                final Class<vjh> clazz;
                monitorenter(clazz = vjh.class);
                Label_0078: {
                    try {
                        gug parser2;
                        if ((parser2 = vjh.PARSER) == null) {
                            parser2 = (vjh.PARSER = (gug)new ywa());
                        }
                        break Label_0078;
                    }
                    finally {
                        monitorexit(clazz);
                        monitorexit(clazz);
                        return;
                    }
                }
            }
            return parser;
        }
        throw null;
    }
    
    public final boolean m() {
        return this.valueCase_ == 1 && (boolean)this.value_;
    }
    
    public final fs2 n() {
        if (this.valueCase_ == 8) {
            return (fs2)this.value_;
        }
        return fs2.x;
    }
    
    public final double p() {
        if (this.valueCase_ == 7) {
            return (double)this.value_;
        }
        return 0.0;
    }
    
    public final float q() {
        if (this.valueCase_ == 2) {
            return (float)this.value_;
        }
        return 0.0f;
    }
    
    public final int r() {
        if (this.valueCase_ == 3) {
            return (int)this.value_;
        }
        return 0;
    }
    
    public final long s() {
        if (this.valueCase_ == 4) {
            return (long)this.value_;
        }
        return 0L;
    }
    
    public final String t() {
        if (this.valueCase_ == 5) {
            return (String)this.value_;
        }
        return "";
    }
    
    public final tjh u() {
        if (this.valueCase_ == 6) {
            return (tjh)this.value_;
        }
        return tjh.n();
    }
    
    public final int v() {
        switch (this.valueCase_) {
            default: {
                return 0;
            }
            case 8: {
                return 8;
            }
            case 7: {
                return 7;
            }
            case 6: {
                return 6;
            }
            case 5: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 1;
            }
            case 0: {
                return 9;
            }
        }
    }
    
    public final void x(final boolean b) {
        this.valueCase_ = 1;
        this.value_ = b;
    }
    
    public final void y(final fs2 value_) {
        this.valueCase_ = 8;
        this.value_ = value_;
    }
    
    public final void z(final double n) {
        this.valueCase_ = 7;
        this.value_ = n;
    }
}
