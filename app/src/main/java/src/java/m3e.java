import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.e;

public final class m3e
{
    public final zn0 a;
    
    public m3e(final w3q w3q, final w3q w3q2, final vjh vjh) {
        this.a = new zn0((Object)w3q, (Object)w3q2, (Object)vjh);
    }
    
    public static int a(final zn0 zn0, final Object o, final Object o2) {
        final w3q w3q = (w3q)zn0.v;
        final int c = d9a.c;
        final int n = 1;
        final int h = e.h(1);
        final n3q y = w3q.y;
        int n2 = h;
        if (w3q == y) {
            n2 = h * 2;
        }
        int n3 = 0;
        Label_0459: {
            int n4 = 0;
            int n5 = 0;
            Label_0265: {
                Label_0210: {
                    switch (w3q.ordinal()) {
                        default: {
                            fvd.u("There is no way to get here, but the compiler thinks otherwise.");
                            return 0;
                        }
                        case 17: {
                            final long longValue = (long)o;
                            n3 = e.j(longValue >> 63 ^ longValue << 1);
                            break Label_0459;
                        }
                        case 16: {
                            final int intValue = (int)o;
                            n3 = e.i(intValue >> 31 ^ intValue << 1);
                            break Label_0459;
                        }
                        case 15: {
                            o.getClass();
                            break;
                        }
                        case 14: {
                            o.getClass();
                            break Label_0210;
                        }
                        case 13: {
                            n3 = e.j((long)(int)o);
                            break Label_0459;
                        }
                        case 12: {
                            n3 = e.i((int)o);
                            break Label_0459;
                        }
                        case 11: {
                            if (o instanceof fs2) {
                                n4 = ((fs2)o).size();
                                n5 = e.i(n4);
                                break Label_0265;
                            }
                            n4 = ((byte[])o).length;
                            n5 = e.i(n4);
                            break Label_0265;
                        }
                        case 10: {
                            n4 = ((f)o).a((bdk)null);
                            n5 = e.i(n4);
                            break Label_0265;
                        }
                        case 9: {
                            n3 = ((f)o).a((bdk)null);
                            break Label_0459;
                        }
                        case 8: {
                            if (o instanceof fs2) {
                                n4 = ((fs2)o).size();
                                n5 = e.i(n4);
                                break Label_0265;
                            }
                            n3 = e.g((String)o);
                            break Label_0459;
                        }
                        case 7: {
                            o.getClass();
                            n3 = 1;
                            break Label_0459;
                        }
                        case 6: {
                            o.getClass();
                            break Label_0210;
                        }
                        case 5: {
                            o.getClass();
                            break;
                        }
                        case 4: {
                            n3 = e.j((long)(int)o);
                            break Label_0459;
                        }
                        case 3: {
                            n3 = e.j((long)o);
                            break Label_0459;
                        }
                        case 2: {
                            n3 = e.j((long)o);
                            break Label_0459;
                        }
                        case 1: {
                            o.getClass();
                            break Label_0210;
                        }
                        case 0: {
                            o.getClass();
                            break;
                        }
                    }
                    n3 = 8;
                    break Label_0459;
                }
                n3 = 4;
                break Label_0459;
            }
            n3 = n4 + n5;
        }
        final w3q w3q2 = (w3q)zn0.w;
        int h2 = e.h(2);
        if (w3q2 == y) {
            h2 *= 2;
        }
        int n7 = 0;
        int n8 = 0;
        Label_0724: {
            Label_0664: {
                switch (w3q2.ordinal()) {
                    default: {
                        fvd.u("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                    }
                    case 17: {
                        final long longValue2 = (long)o2;
                        final int n6 = e.j(longValue2 >> 63 ^ longValue2 << 1);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 16: {
                        final int intValue2 = (int)o2;
                        final int n6 = e.i(intValue2 >> 31 ^ intValue2 << 1);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 15: {
                        o2.getClass();
                        break;
                    }
                    case 14: {
                        o2.getClass();
                        break Label_0664;
                    }
                    case 13: {
                        final int n6 = e.j((long)(int)o2);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 12: {
                        final int n6 = e.i((int)o2);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 11: {
                        if (o2 instanceof fs2) {
                            n7 = ((fs2)o2).size();
                            n8 = e.i(n7);
                            break Label_0724;
                        }
                        n7 = ((byte[])o2).length;
                        n8 = e.i(n7);
                        break Label_0724;
                    }
                    case 10: {
                        n7 = ((f)o2).a((bdk)null);
                        n8 = e.i(n7);
                        break Label_0724;
                    }
                    case 9: {
                        final int n6 = ((f)o2).a((bdk)null);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 8: {
                        if (o2 instanceof fs2) {
                            n7 = ((fs2)o2).size();
                            n8 = e.i(n7);
                            break Label_0724;
                        }
                        final int n6 = e.g((String)o2);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 7: {
                        o2.getClass();
                        final int n6 = n;
                        return n6 + h2 + (n3 + n2);
                    }
                    case 6: {
                        o2.getClass();
                        break Label_0664;
                    }
                    case 5: {
                        o2.getClass();
                        break;
                    }
                    case 4: {
                        final int n6 = e.j((long)(int)o2);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 3: {
                        final int n6 = e.j((long)o2);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 2: {
                        final int n6 = e.j((long)o2);
                        return n6 + h2 + (n3 + n2);
                    }
                    case 1: {
                        o2.getClass();
                        break Label_0664;
                    }
                    case 0: {
                        o2.getClass();
                        break;
                    }
                }
                final int n6 = 8;
                return n6 + h2 + (n3 + n2);
            }
            final int n6 = 4;
            return n6 + h2 + (n3 + n2);
        }
        final int n6 = n8 + n7;
        return n6 + h2 + (n3 + n2);
    }
}
