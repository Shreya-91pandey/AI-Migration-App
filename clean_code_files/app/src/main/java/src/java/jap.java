public interface jap
{
    long a();
    
    long b();
    
    default float c() {
        return 0.0f;
    }
    
    default float d() {
        return 2.0f;
    }
    
    default long e() {
        return ncq.b(48.0f, 48.0f);
    }
    
    default float f() {
        return Float.MAX_VALUE;
    }
    
    float g();
    
    default float h() {
        return 16.0f;
    }
}
