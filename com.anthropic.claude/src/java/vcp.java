public interface vcp
{
    default tcp a(final Class clazz) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
    
    default tcp b(final Class clazz, final elf elf) {
        return this.a(clazz);
    }
    
    default tcp c(final us4 us4, final elf elf) {
        return this.b(qt7.z((rtc)us4), elf);
    }
}
