import java.text.CharacterIterator;

public final class li3 implements CharacterIterator
{
    public final CharSequence v;
    public final int w;
    public int x;
    
    public li3(final int w, final CharSequence v) {
        this.v = v;
        this.w = w;
        this.x = 0;
    }
    
    public final Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final char current() {
        final int x = this.x;
        if (x == this.w) {
            return '\uffff';
        }
        return this.v.charAt(x);
    }
    
    public final char first() {
        this.x = 0;
        return this.current();
    }
    
    public final int getBeginIndex() {
        return 0;
    }
    
    public final int getEndIndex() {
        return this.w;
    }
    
    public final int getIndex() {
        return this.x;
    }
    
    public final char last() {
        int w = this.w;
        if (w == 0) {
            this.x = w;
            return '\uffff';
        }
        --w;
        this.x = w;
        return this.v.charAt(w);
    }
    
    public final char next() {
        final int x = this.x + 1;
        this.x = x;
        final int w = this.w;
        if (x >= w) {
            this.x = w;
            return '\uffff';
        }
        return this.v.charAt(x);
    }
    
    public final char previous() {
        int x = this.x;
        if (x <= 0) {
            return '\uffff';
        }
        --x;
        this.x = x;
        return this.v.charAt(x);
    }
    
    public final char setIndex(final int x) {
        if (x <= this.w && x >= 0) {
            this.x = x;
            return this.current();
        }
        en9.s("invalid position");
        return '\0';
    }
}
