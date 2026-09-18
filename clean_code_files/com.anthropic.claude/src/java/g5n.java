import java.io.Closeable;
import java.util.Locale;

public final class g5n implements t2k
{
    public final vsa v;
    
    public g5n(final vsa v) {
        this.v = v;
    }
    
    @Override
    public final boolean H0() {
        return this.v.H0();
    }
    
    public final void close() {
        ((Closeable)this.v).close();
    }
    
    @Override
    public final b3k d1(final String s) {
        final vsa v = this.v;
        final boolean open = v.isOpen();
        final eup eup = null;
        if (!open) {
            tiq.l(21, "connection is closed");
            throw null;
        }
        final String upperCase = kym.B1((CharSequence)s).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        final int length = upperCase.length();
        final int n = 2;
        final int n2 = length - 2;
        final int n3 = -1;
        int n4 = 0;
        Label_0234: {
            if (n2 < 0) {
                n4 = n3;
            }
            else {
                int n5 = 0;
                while (true) {
                    n4 = n3;
                    if (n5 >= n2) {
                        break Label_0234;
                    }
                    final char char1 = upperCase.charAt(n5);
                    if (mlc.u((int)char1, 32) > 0) {
                        if (char1 == '-') {
                            if (upperCase.charAt(n5 + 1) != '-') {
                                break;
                            }
                            if ((n5 = kym.V0((CharSequence)upperCase, '\n', n5 + 2, 4)) < 0) {
                                n4 = n3;
                                break Label_0234;
                            }
                        }
                        else {
                            if (char1 != '/') {
                                break;
                            }
                            int n6;
                            if (upperCase.charAt(n6 = n5 + 1) != '*') {
                                break;
                            }
                            int n7;
                            do {
                                n5 = kym.V0((CharSequence)upperCase, '*', n6 + 1, 4);
                                if (n5 < 0) {
                                    n4 = n3;
                                    break Label_0234;
                                }
                                n7 = n5 + 1;
                                if (n7 >= n2) {
                                    break;
                                }
                                n6 = n5;
                            } while (upperCase.charAt(n7) != '/');
                            n5 += 2;
                            continue;
                        }
                    }
                    ++n5;
                }
                n4 = n5;
            }
        }
        String substring;
        if (n4 >= 0 && n4 <= upperCase.length()) {
            substring = upperCase.substring(n4, Math.min(n4 + 3, upperCase.length()));
        }
        else {
            substring = null;
        }
        if (substring == null) {
            return new l5n(v, s);
        }
        int n8 = 0;
        Label_0453: {
            while (true) {
                Label_0401: {
                    switch (substring.hashCode()) {
                        case 81327: {
                            if (!substring.equals((Object)"ROL")) {
                                break;
                            }
                            n8 = n;
                            if (kym.I0((CharSequence)upperCase, (CharSequence)" TO ", false)) {
                                break;
                            }
                            break Label_0453;
                        }
                        case 68795: {
                            if (!substring.equals((Object)"END")) {
                                break;
                            }
                            break Label_0401;
                        }
                        case 66913: {
                            if (!substring.equals((Object)"COM")) {
                                break;
                            }
                            break Label_0401;
                        }
                        case 65636: {
                            if (!substring.equals((Object)"BEG")) {
                                break;
                            }
                            if (kym.I0((CharSequence)upperCase, (CharSequence)"EXCLUSIVE", false)) {
                                n8 = 3;
                                break Label_0453;
                            }
                            if (kym.I0((CharSequence)upperCase, (CharSequence)"IMMEDIATE", false)) {
                                n8 = 4;
                                break Label_0453;
                            }
                            n8 = 5;
                            break Label_0453;
                        }
                    }
                    n8 = 0;
                    break Label_0453;
                }
                n8 = 1;
                break Label_0453;
                continue;
            }
        }
        if (n8 != 0) {
            return new n5n(v, s, n8);
        }
        eup d = eup;
        if (substring.equals("PRA")) {
            final String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            d = eup;
            if (kym.I0((CharSequence)kym.r1(lowerCase, "journal_mode", ""), (CharSequence)"=", false)) {
                d = eup.D;
            }
        }
        if (d != null) {
            return (b3k)new k5n(v, s, new m5n(v, s));
        }
        final int hashCode = substring.hashCode();
        if (hashCode != 79487) {
            if (hashCode != 81978) {
                if (hashCode != 85954) {
                    return new l5n(v, s);
                }
                if (!substring.equals((Object)"WIT")) {
                    return new l5n(v, s);
                }
            }
            else if (!substring.equals((Object)"SEL")) {
                return new l5n(v, s);
            }
        }
        else if (!substring.equals((Object)"PRA")) {
            return new l5n(v, s);
        }
        return new m5n(v, s);
    }
}
