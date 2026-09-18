public final class b09 extends sei
{
    public final byte b;
    
    @Override
    public final ffi a(final Object o) {
        switch (this.b) {
            default: {
                return new ffi(this, o, o == null, null, null, false);
            }
            case 0: {
                return new ffi(this, o, o == null, (q8m)def.D, null, true);
            }
        }
    }
}
