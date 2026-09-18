import java.util.Map;

public interface ooe extends flc
{
    noe J0(final int p0, final int p1, final Map p2, final lta p3, final lta p4);
    
    default noe Y(final int n, final int n2, final Map map, final lta lta) {
        return this.J0(n, n2, map, null, lta);
    }
}
