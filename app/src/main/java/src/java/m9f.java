public abstract class m9f
{
    public final byte a;
    public final byte b;
    
    public m9f(final int a, final int b) {
        this.a = (byte)a;
        this.b = (byte)b;
    }
    
    public void a(final vsa vsa) {
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
    
    public void b(final t2k t2k) {
        if (t2k instanceof g5n) {
            this.a(((g5n)t2k).v);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
