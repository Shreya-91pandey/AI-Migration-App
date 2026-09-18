public final class nvc
{
    public final int a = a;
    
    public static String a(final int n) {
        if (n == 0) {
            return "Unspecified";
        }
        if (n == 1) {
            return "Text";
        }
        if (n == 2) {
            return "Ascii";
        }
        if (n == 3) {
            return "Number";
        }
        if (n == 4) {
            return "Phone";
        }
        if (n == 5) {
            return "Uri";
        }
        if (n == 6) {
            return "Email";
        }
        if (n == 7) {
            return "Password";
        }
        if (n == 8) {
            return "NumberPassword";
        }
        if (n == 9) {
            return "Decimal";
        }
        if (n == 10) {
            return "PasswordVisible";
        }
        if (n == 11) {
            return "PostalAddress";
        }
        if (n == 12) {
            return "PersonName";
        }
        if (n == 13) {
            return "EmailSubject";
        }
        if (n == 14) {
            return "ShortMessage";
        }
        if (n == 15) {
            return "LongMessage";
        }
        if (n == 16) {
            return "Filter";
        }
        if (n == 17) {
            return "Phonetic";
        }
        if (n == 18) {
            return "DateTime";
        }
        if (n == 19) {
            return "Date";
        }
        if (n == 20) {
            return "Time";
        }
        if (n == 21) {
            return "NumberSigned";
        }
        if (n == 22) {
            return "DecimalSigned";
        }
        if (n == 23) {
            return "DecimalPassword";
        }
        if (n == 24) {
            return "NumberPasswordSigned";
        }
        if (n == 25) {
            return "DecimalPasswordSigned";
        }
        return "Invalid";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nvc) {
            if (this.a == ((nvc)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return a(this.a);
    }
}
