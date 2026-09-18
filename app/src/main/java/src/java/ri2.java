import java.util.Collection;
import java.util.Set;
import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import java.lang.reflect.GenericDeclaration;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import kotlinx.serialization.KSerializer;
import java.util.concurrent.CountDownLatch;
import android.os.Looper;
import kotlinx.serialization.json.JsonElement;
import kotlin.time.a;
import java.io.FileOutputStream;
import java.io.File;
import android.content.pm.PackageInfo;
import java.util.WeakHashMap;
import androidx.compose.foundation.layout.b;
import java.lang.reflect.Method;
import android.view.View;
import android.content.res.Configuration;
import androidx.compose.ui.node.LayoutNode;
import java.lang.annotation.Annotation;
import com.anthropic.claude.api.chat.ModelSelection;
import java.util.Map;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import android.content.Context;
import java.io.Serializable;
import java.io.DataInputStream;
import java.util.concurrent.TimeUnit;
import io.sentry.c2;
import java.util.Iterator;
import java.util.HashMap;
import java.io.IOException;
import java.io.Closeable;
import java.util.Map$Entry;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class ri2
{
    public static final f3 a;
    public static final v08 b;
    public static volatile y08 c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final wab h;
    public static final Type[] i;
    public static boolean j = true;
    
    public static final long A(final long n) {
        final awp w = lz8.w;
        final int a = nz8.a;
        return n << 1;
    }
    
    public static ygm A0(float n, float n2, Object o, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 1.0f;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 1500.0f;
        }
        if ((n3 & 0x4) != 0x0) {
            o = null;
        }
        return new ygm(n, n2, o);
    }
    
    public static boolean B(final Type type, Type ownerType) {
        if (type == ownerType) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(ownerType);
        }
        if (type instanceof ParameterizedType) {
            if (!(ownerType instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final ParameterizedType parameterizedType2 = (ParameterizedType)ownerType;
            ownerType = parameterizedType.getOwnerType();
            final Type ownerType2 = parameterizedType2.getOwnerType();
            final boolean b = ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2));
            final boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            final boolean equals2 = Arrays.equals((Object[])parameterizedType.getActualTypeArguments(), (Object[])parameterizedType2.getActualTypeArguments());
            return b && equals && equals2;
        }
        else {
            if (type instanceof GenericArrayType) {
                return ownerType instanceof GenericArrayType && B(((GenericArrayType)type).getGenericComponentType(), ((GenericArrayType)ownerType).getGenericComponentType());
            }
            if (!(type instanceof WildcardType)) {
                if (type instanceof TypeVariable) {
                    if (!(ownerType instanceof TypeVariable)) {
                        return false;
                    }
                    final TypeVariable typeVariable = (TypeVariable)type;
                    final TypeVariable typeVariable2 = (TypeVariable)ownerType;
                    if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals((Object)typeVariable2.getName())) {
                        return true;
                    }
                }
                return false;
            }
            if (!(ownerType instanceof WildcardType)) {
                return false;
            }
            final WildcardType wildcardType = (WildcardType)type;
            final WildcardType wildcardType2 = (WildcardType)ownerType;
            return Arrays.equals((Object[])wildcardType.getUpperBounds(), (Object[])wildcardType2.getUpperBounds()) && Arrays.equals((Object[])wildcardType.getLowerBounds(), (Object[])wildcardType2.getLowerBounds());
        }
    }
    
    public static void B0(final Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError)t;
        }
        if (t instanceof ThreadDeath) {
            throw (ThreadDeath)t;
        }
        if (!(t instanceof LinkageError)) {
            return;
        }
        throw (LinkageError)t;
    }
    
    public static final boolean C(final long n, final long n2) {
        return n == n2;
    }
    
    public static byte[] C0(nt7 nt7) {
        final HashMap a = nt7.a;
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            nt7 = (nt7)new DataOutputStream((OutputStream)byteArrayOutputStream);
            try {
                ((DataOutputStream)nt7).writeShort(-21521);
                ((DataOutputStream)nt7).writeShort(1);
                ((DataOutputStream)nt7).writeInt(a.size());
                for (final Map$Entry map$Entry : a.entrySet()) {
                    D0((DataOutputStream)nt7, (String)map$Entry.getKey(), map$Entry.getValue());
                }
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    zn2.r((Closeable)nt7, t);
                }
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                ((Closeable)nt7).close();
                byteArray.getClass();
                return byteArray;
                Label_0129: {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                ((DataOutputStream)nt7).flush();
                iftrue(Label_0129:)(((DataOutputStream)nt7).size() > 10240);
            }
        }
        catch (final IOException ex) {
            krd.c().b(yv7.g(), "Error in Data#toByteArray: ", (Throwable)ex);
            return new byte[0];
        }
    }
    
    public static final int D(final int n, final c4d c4d, final Object o) {
        if (o != null) {
            if (c4d.a() != 0) {
                if (n >= c4d.a() || !o.equals(c4d.b(n))) {
                    final int e = c4d.e(o);
                    if (e != -1) {
                        return e;
                    }
                }
            }
        }
        return n;
    }
    
    public static final void D0(final DataOutputStream dataOutputStream, final String s, final Object o) {
        if (o == null) {
            dataOutputStream.writeByte(0);
        }
        else if (o instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean((boolean)o);
        }
        else if (o instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte((int)((Number)o).byteValue());
        }
        else if (o instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number)o).intValue());
        }
        else if (o instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number)o).longValue());
        }
        else if (o instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number)o).floatValue());
        }
        else if (o instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number)o).doubleValue());
        }
        else if (o instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String)o);
        }
        else {
            if (!(o instanceof Object[])) {
                c2.f((Object)v4j.a((Class)o.getClass()).c(), "Unsupported value type ");
                return;
            }
            final Object[] array = (Object[])o;
            final us4 a = v4j.a((Class)array.getClass());
            int n;
            if (a.equals((Object)v4j.a((Class)Boolean[].class))) {
                n = 8;
            }
            else if (a.equals((Object)v4j.a((Class)Byte[].class))) {
                n = 9;
            }
            else if (a.equals((Object)v4j.a((Class)Integer[].class))) {
                n = 10;
            }
            else if (a.equals((Object)v4j.a((Class)Long[].class))) {
                n = 11;
            }
            else if (a.equals((Object)v4j.a((Class)Float[].class))) {
                n = 12;
            }
            else if (a.equals((Object)v4j.a((Class)Double[].class))) {
                n = 13;
            }
            else {
                if (!a.equals((Object)v4j.a((Class)String[].class))) {
                    c2.f((Object)v4j.a((Class)array.getClass()).b(), "Unsupported value type ");
                    return;
                }
                n = 14;
            }
            dataOutputStream.writeByte(n);
            dataOutputStream.writeInt(array.length);
            for (final Object o2 : array) {
                final Byte b = null;
                final Integer n2 = null;
                final Long n3 = null;
                final Float n4 = null;
                final Double n5 = null;
                String s2 = null;
                final Boolean b2 = null;
                if (n == 8) {
                    Boolean b3 = b2;
                    if (o2 instanceof Boolean) {
                        b3 = (Boolean)o2;
                    }
                    dataOutputStream.writeBoolean(b3 != null && b3);
                }
                else if (n == 9) {
                    Byte b4 = b;
                    if (o2 instanceof Byte) {
                        b4 = (Byte)o2;
                    }
                    int byteValue;
                    if (b4 != null) {
                        byteValue = b4;
                    }
                    else {
                        byteValue = 0;
                    }
                    dataOutputStream.writeByte(byteValue);
                }
                else if (n == 10) {
                    Integer n6 = n2;
                    if (o2 instanceof Integer) {
                        n6 = (Integer)o2;
                    }
                    int intValue;
                    if (n6 != null) {
                        intValue = n6;
                    }
                    else {
                        intValue = 0;
                    }
                    dataOutputStream.writeInt(intValue);
                }
                else if (n == 11) {
                    Long n7 = n3;
                    if (o2 instanceof Long) {
                        n7 = (Long)o2;
                    }
                    long longValue;
                    if (n7 != null) {
                        longValue = n7;
                    }
                    else {
                        longValue = 0L;
                    }
                    dataOutputStream.writeLong(longValue);
                }
                else if (n == 12) {
                    Float n8 = n4;
                    if (o2 instanceof Float) {
                        n8 = (Float)o2;
                    }
                    float floatValue;
                    if (n8 != null) {
                        floatValue = n8;
                    }
                    else {
                        floatValue = 0.0f;
                    }
                    dataOutputStream.writeFloat(floatValue);
                }
                else if (n == 13) {
                    Double n9 = n5;
                    if (o2 instanceof Double) {
                        n9 = (Double)o2;
                    }
                    double doubleValue;
                    if (n9 != null) {
                        doubleValue = n9;
                    }
                    else {
                        doubleValue = 0.0;
                    }
                    dataOutputStream.writeDouble(doubleValue);
                }
                else if (n == 14) {
                    if (o2 instanceof String) {
                        s2 = (String)o2;
                    }
                    String s3;
                    if ((s3 = s2) == null) {
                        s3 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(s3);
                }
            }
        }
        dataOutputStream.writeUTF(s);
    }
    
    public static long E(final int n, int min, int n2, int min2) {
        final int n3 = 262142;
        final int min3 = Math.min(n2, 262142);
        final int n4 = Integer.MAX_VALUE;
        if (min2 == Integer.MAX_VALUE) {
            min2 = Integer.MAX_VALUE;
        }
        else {
            min2 = Math.min(min2, 262142);
        }
        if (min2 == Integer.MAX_VALUE) {
            n2 = min3;
        }
        else {
            n2 = min2;
        }
        if (n2 < 8191) {
            n2 = n3;
        }
        else if (n2 < 32767) {
            n2 = 65534;
        }
        else if (n2 < 65535) {
            n2 = 32766;
        }
        else {
            if (n2 >= 262143) {
                hv6.l(n2);
                ebq.a();
                return 0L;
            }
            n2 = 8190;
        }
        if (min == Integer.MAX_VALUE) {
            min = n4;
        }
        else {
            min = Math.min(n2, min);
        }
        return hv6.a(Math.min(n2, n), min, min3, min2);
    }
    
    public static final long E0(final int n, final pz8 pz8) {
        if (((Enum)pz8).compareTo((Enum)pz8.z) <= 0) {
            return A(TimeUnit.NANOSECONDS.convert((long)n, pz8.v));
        }
        return F0(n, pz8);
    }
    
    public static long F(int n, int min, final int n2, int min2) {
        final int n3 = 262142;
        final int min3 = Math.min(n, 262142);
        final int n4 = Integer.MAX_VALUE;
        if (min == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        }
        else {
            min = Math.min(min, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            n = min3;
        }
        else {
            n = min;
        }
        if (n < 8191) {
            n = n3;
        }
        else if (n < 32767) {
            n = 65534;
        }
        else if (n < 65535) {
            n = 32766;
        }
        else {
            if (n >= 262143) {
                hv6.l(n);
                ebq.a();
                return 0L;
            }
            n = 8190;
        }
        if (min2 == Integer.MAX_VALUE) {
            min2 = n4;
        }
        else {
            min2 = Math.min(n, min2);
        }
        return hv6.a(min3, min, Math.min(n, n2), min2);
    }
    
    public static final long F0(final long n, final pz8 pz8) {
        final TimeUnit v = pz8.v;
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        final long convert = v.convert(4611686018426999999L, nanoseconds);
        if (-convert <= n && n <= convert) {
            return A(nanoseconds.convert(n, v));
        }
        if (((Enum)pz8).compareTo((Enum)pz8.y) >= 0) {
            final long n2 = Long.signum(n);
            long n3 = n;
            if (n < -9223372036854775807L) {
                n3 = -9223372036854775807L;
            }
            return y(yi2.p(Math.abs(n3), pz8) * n2);
        }
        return y(ncq.q(TimeUnit.MILLISECONDS.convert(n, v), -4611686018427387903L, 4611686018427387903L));
    }
    
    public static final ija G(final ija ija, final hc7 hc7) {
        if (hc7.M0((gc7)o55.z) != null) {
            fvd.t((Object)hc7, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (hc7.equals(o89.v)) {
            return ija;
        }
        if (ija instanceof oua) {
            return oua.b((oua)ija, hc7, 0, 0, 6);
        }
        return (ija)new gf3(ija, hc7, 0, 0, 12);
    }
    
    public static String G0(final long n) {
        return hia.i(n, "PointerId(value=", ")");
    }
    
    public static cgr H(final Exception ex) {
        final cgr cgr = new cgr();
        cgr.n(ex);
        return cgr;
    }
    
    public static final String H0(final int n, final CharSequence charSequence) {
        if (charSequence.length() <= n) {
            return charSequence.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(charSequence.subSequence(0, n).toString());
        sb.append("...");
        return sb.toString();
    }
    
    public static cgr I(final Object o) {
        final cgr cgr = new cgr();
        cgr.l(o);
        return cgr;
    }
    
    public static alo I0(int n, int n2, u09 a, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 300;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0;
        }
        if ((n3 & 0x4) != 0x0) {
            a = x09.a;
        }
        return new alo(n, n2, a);
    }
    
    public static final void J(final StringBuilder sb, final StringBuilder sb2, final int n) {
        if (n < 10) {
            sb.append('0');
        }
        sb2.append(n);
    }
    
    public static String J0(final Type type) {
        if (type instanceof Class) {
            return ((Class)type).getName();
        }
        return type.toString();
    }
    
    public static nt7 K(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: sipush          10240
        //     5: if_icmpgt       337
        //     8: aload_0        
        //     9: arraylength    
        //    10: ifne            17
        //    13: getstatic       nt7.b:Lnt7;
        //    16: areturn        
        //    17: new             Ljava/util/LinkedHashMap;
        //    20: dup            
        //    21: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    24: astore          4
        //    26: new             Ljava/io/ByteArrayInputStream;
        //    29: astore          5
        //    31: aload           5
        //    33: aload_0        
        //    34: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    37: iconst_2       
        //    38: newarray        B
        //    40: astore_0       
        //    41: aload           5
        //    43: aload_0        
        //    44: invokevirtual   java/io/InputStream.read:([B)I
        //    47: pop            
        //    48: iconst_0       
        //    49: istore_2       
        //    50: iconst_0       
        //    51: istore_3       
        //    52: aload_0        
        //    53: iconst_0       
        //    54: baload         
        //    55: bipush          -84
        //    57: if_icmpne       73
        //    60: aload_0        
        //    61: iconst_1       
        //    62: baload         
        //    63: bipush          -19
        //    65: if_icmpne       73
        //    68: iconst_1       
        //    69: istore_1       
        //    70: goto            75
        //    73: iconst_0       
        //    74: istore_1       
        //    75: aload           5
        //    77: invokevirtual   java/io/ByteArrayInputStream.reset:()V
        //    80: iload_1        
        //    81: ifeq            164
        //    84: new             Ljava/io/ObjectInputStream;
        //    87: astore_0       
        //    88: aload_0        
        //    89: aload           5
        //    91: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    94: aload_0        
        //    95: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    98: istore_2       
        //    99: iload_3        
        //   100: istore_1       
        //   101: iload_1        
        //   102: iload_2        
        //   103: if_icmpge       133
        //   106: aload           4
        //   108: aload_0        
        //   109: invokevirtual   java/io/ObjectInputStream.readUTF:()Ljava/lang/String;
        //   112: aload_0        
        //   113: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //   116: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: iinc            1, 1
        //   125: goto            101
        //   128: astore          5
        //   130: goto            150
        //   133: aload_0        
        //   134: invokevirtual   java/io/ObjectInputStream.close:()V
        //   137: goto            327
        //   140: astore          5
        //   142: goto            292
        //   145: astore          5
        //   147: goto            311
        //   150: aload           5
        //   152: athrow         
        //   153: astore          6
        //   155: aload_0        
        //   156: aload           5
        //   158: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   161: aload           6
        //   163: athrow         
        //   164: new             Ljava/io/DataInputStream;
        //   167: astore_0       
        //   168: aload_0        
        //   169: aload           5
        //   171: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   174: aload_0        
        //   175: invokevirtual   java/io/DataInputStream.readShort:()S
        //   178: istore_1       
        //   179: iload_1        
        //   180: sipush          -21521
        //   183: if_icmpne       212
        //   186: aload_0        
        //   187: invokevirtual   java/io/DataInputStream.readShort:()S
        //   190: istore_1       
        //   191: iload_1        
        //   192: iconst_1       
        //   193: if_icmpne       199
        //   196: goto            222
        //   199: iload_1        
        //   200: ldc_w           "Unsupported version number: "
        //   203: invokestatic    smk.p:(ILjava/lang/String;)Ljava/lang/String;
        //   206: invokestatic    fvd.h:(Ljava/lang/Object;)V
        //   209: goto            222
        //   212: iload_1        
        //   213: ldc_w           "Magic number doesn't match: "
        //   216: invokestatic    smk.p:(ILjava/lang/String;)Ljava/lang/String;
        //   219: invokestatic    fvd.h:(Ljava/lang/Object;)V
        //   222: aload_0        
        //   223: invokevirtual   java/io/DataInputStream.readInt:()I
        //   226: istore_3       
        //   227: iload_2        
        //   228: istore_1       
        //   229: iload_1        
        //   230: iload_3        
        //   231: if_icmpge       269
        //   234: aload_0        
        //   235: aload_0        
        //   236: invokevirtual   java/io/DataInputStream.readByte:()B
        //   239: invokestatic    ri2.L:(Ljava/io/DataInputStream;B)Ljava/io/Serializable;
        //   242: astore          5
        //   244: aload           4
        //   246: aload_0        
        //   247: invokevirtual   java/io/DataInputStream.readUTF:()Ljava/lang/String;
        //   250: aload           5
        //   252: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   257: pop            
        //   258: iinc            1, 1
        //   261: goto            229
        //   264: astore          5
        //   266: goto            278
        //   269: aload_0        
        //   270: invokeinterface java/io/Closeable.close:()V
        //   275: goto            327
        //   278: aload           5
        //   280: athrow         
        //   281: astore          6
        //   283: aload_0        
        //   284: aload           5
        //   286: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   289: aload           6
        //   291: athrow         
        //   292: invokestatic    yv7.g:()Ljava/lang/String;
        //   295: astore_0       
        //   296: invokestatic    krd.c:()Lkrd;
        //   299: aload_0        
        //   300: ldc_w           "Error in Data#fromByteArray: "
        //   303: aload           5
        //   305: invokevirtual   krd.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   308: goto            327
        //   311: invokestatic    yv7.g:()Ljava/lang/String;
        //   314: astore_0       
        //   315: invokestatic    krd.c:()Lkrd;
        //   318: aload_0        
        //   319: ldc_w           "Error in Data#fromByteArray: "
        //   322: aload           5
        //   324: invokevirtual   krd.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   327: new             Lnt7;
        //   330: dup            
        //   331: aload           4
        //   333: invokespecial   nt7.<init>:(Ljava/util/LinkedHashMap;)V
        //   336: areturn        
        //   337: ldc             "Data cannot occupy more than 10240 bytes when serialized"
        //   339: invokestatic    en9.q:(Ljava/lang/String;)V
        //   342: aconst_null    
        //   343: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  26     48     145    150    Ljava/io/IOException;
        //  26     48     140    145    Ljava/lang/ClassNotFoundException;
        //  75     80     145    150    Ljava/io/IOException;
        //  75     80     140    145    Ljava/lang/ClassNotFoundException;
        //  84     94     145    150    Ljava/io/IOException;
        //  84     94     140    145    Ljava/lang/ClassNotFoundException;
        //  94     99     128    164    Any
        //  106    122    128    164    Any
        //  133    137    145    150    Ljava/io/IOException;
        //  133    137    140    145    Ljava/lang/ClassNotFoundException;
        //  150    153    153    164    Any
        //  155    164    145    150    Ljava/io/IOException;
        //  155    164    140    145    Ljava/lang/ClassNotFoundException;
        //  164    174    145    150    Ljava/io/IOException;
        //  164    174    140    145    Ljava/lang/ClassNotFoundException;
        //  174    179    264    292    Any
        //  186    191    264    292    Any
        //  199    209    264    292    Any
        //  212    222    264    292    Any
        //  222    227    264    292    Any
        //  234    258    264    292    Any
        //  269    275    145    150    Ljava/io/IOException;
        //  269    275    140    145    Ljava/lang/ClassNotFoundException;
        //  278    281    281    292    Any
        //  283    292    145    150    Ljava/io/IOException;
        //  283    292    140    145    Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0150:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final int K0(final int n) {
        final int n2 = 0x12492492 & n;
        final int n3 = 0x24924924 & n;
        return (n & 0xC9249249) | (n3 >> 1 | n2) | (n2 << 1 & n3);
    }
    
    public static final Serializable L(final DataInputStream dataInputStream, final byte b) {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return (Serializable)Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return (Serializable)Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return (Serializable)Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return (Serializable)Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return (Serializable)Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return (Serializable)Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return (Serializable)dataInputStream.readUTF();
        }
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        final int n6 = 0;
        final int n7 = 0;
        if (b == 8) {
            final int int1 = dataInputStream.readInt();
            final Boolean[] array = new Boolean[int1];
            for (int i = n7; i < int1; ++i) {
                array[i] = dataInputStream.readBoolean();
            }
            return array;
        }
        if (b == 9) {
            final int int2 = dataInputStream.readInt();
            final Byte[] array2 = new Byte[int2];
            for (int j = n; j < int2; ++j) {
                array2[j] = dataInputStream.readByte();
            }
            return array2;
        }
        if (b == 10) {
            final int int3 = dataInputStream.readInt();
            final Integer[] array3 = new Integer[int3];
            for (int k = n2; k < int3; ++k) {
                array3[k] = dataInputStream.readInt();
            }
            return array3;
        }
        if (b == 11) {
            final int int4 = dataInputStream.readInt();
            final Long[] array4 = new Long[int4];
            for (int l = n3; l < int4; ++l) {
                array4[l] = dataInputStream.readLong();
            }
            return array4;
        }
        if (b == 12) {
            final int int5 = dataInputStream.readInt();
            final Float[] array5 = new Float[int5];
            for (int n8 = n4; n8 < int5; ++n8) {
                array5[n8] = dataInputStream.readFloat();
            }
            return array5;
        }
        if (b == 13) {
            final int int6 = dataInputStream.readInt();
            final Double[] array6 = new Double[int6];
            for (int n9 = n5; n9 < int6; ++n9) {
                array6[n9] = dataInputStream.readDouble();
            }
            return array6;
        }
        if (b == 14) {
            final int int7 = dataInputStream.readInt();
            final String[] array7 = new String[int7];
            for (int n10 = n6; n10 < int7; ++n10) {
                String utf;
                if (mlc.q(utf = dataInputStream.readUTF(), "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                array7[n10] = utf;
            }
            return array7;
        }
        en9.q(smk.p((int)b, "Unsupported type "));
        return null;
    }
    
    public static void L0(final Context p0, final Executor p1, final psh p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //     4: astore          12
        //     6: aload           12
        //     8: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    11: astore          11
        //    13: aload           12
        //    15: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    18: astore          13
        //    20: aload           12
        //    22: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //    25: astore          12
        //    27: new             Ljava/io/File;
        //    30: dup            
        //    31: aload           13
        //    33: getfield        android/content/pm/ApplicationInfo.sourceDir:Ljava/lang/String;
        //    36: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    39: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    42: astore          15
        //    44: aload_0        
        //    45: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    48: astore          13
        //    50: iconst_0       
        //    51: istore          8
        //    53: aload           13
        //    55: aload           11
        //    57: iconst_0       
        //    58: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    61: astore          13
        //    63: aload_0        
        //    64: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    67: astore          14
        //    69: iload_3        
        //    70: ifne            224
        //    73: new             Ljava/io/File;
        //    76: dup            
        //    77: aload           14
        //    79: ldc_w           "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
        //    82: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    85: astore          18
        //    87: aload           18
        //    89: invokevirtual   java/io/File.exists:()Z
        //    92: ifne            101
        //    95: iconst_0       
        //    96: istore          5
        //    98: goto            203
        //   101: new             Ljava/io/DataInputStream;
        //   104: astore          16
        //   106: new             Ljava/io/FileInputStream;
        //   109: astore          17
        //   111: aload           17
        //   113: aload           18
        //   115: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   118: aload           16
        //   120: aload           17
        //   122: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   125: aload           16
        //   127: invokevirtual   java/io/DataInputStream.readLong:()J
        //   130: lstore          9
        //   132: aload           16
        //   134: invokevirtual   java/io/InputStream.close:()V
        //   137: lload           9
        //   139: aload           13
        //   141: getfield        android/content/pm/PackageInfo.lastUpdateTime:J
        //   144: lcmp           
        //   145: ifne            154
        //   148: iconst_1       
        //   149: istore          4
        //   151: goto            157
        //   154: iconst_0       
        //   155: istore          4
        //   157: iload           4
        //   159: istore          5
        //   161: iload           4
        //   163: ifeq            203
        //   166: aload_2        
        //   167: iconst_2       
        //   168: aconst_null    
        //   169: invokeinterface psh.h:(ILjava/lang/Object;)V
        //   174: iload           4
        //   176: istore          5
        //   178: goto            203
        //   181: astore          17
        //   183: aload           16
        //   185: invokevirtual   java/io/InputStream.close:()V
        //   188: goto            200
        //   191: astore          16
        //   193: aload           17
        //   195: aload           16
        //   197: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   200: aload           17
        //   202: athrow         
        //   203: iload           5
        //   205: ifne            211
        //   208: goto            224
        //   211: aload_0        
        //   212: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   215: pop            
        //   216: aload_0        
        //   217: iconst_0       
        //   218: invokestatic    ith.c:(Landroid/content/Context;Z)V
        //   221: goto            339
        //   224: aload_0        
        //   225: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   228: pop            
        //   229: new             Lpf8;
        //   232: dup            
        //   233: aload           12
        //   235: aload_1        
        //   236: aload_2        
        //   237: aload           15
        //   239: new             Ljava/io/File;
        //   242: dup            
        //   243: new             Ljava/io/File;
        //   246: dup            
        //   247: ldc_w           "/data/misc/profiles/cur/0"
        //   250: aload           11
        //   252: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   255: ldc_w           "primary.prof"
        //   258: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   261: invokespecial   pf8.<init>:(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lpsh;Ljava/lang/String;Ljava/io/File;)V
        //   264: astore_1       
        //   265: aload_1        
        //   266: invokevirtual   pf8.a:()Z
        //   269: ifne            278
        //   272: iconst_0       
        //   273: istore          6
        //   275: goto            313
        //   278: aload_1        
        //   279: invokevirtual   pf8.c:()Lpf8;
        //   282: astore_1       
        //   283: aload_1        
        //   284: invokevirtual   pf8.e:()V
        //   287: aload_1        
        //   288: invokevirtual   pf8.f:()Z
        //   291: istore          7
        //   293: iload           7
        //   295: istore          6
        //   297: iload           7
        //   299: ifeq            313
        //   302: aload           13
        //   304: aload           14
        //   306: invokestatic    ri2.d0:(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
        //   309: iload           7
        //   311: istore          6
        //   313: iload           8
        //   315: istore          7
        //   317: iload           6
        //   319: ifeq            333
        //   322: iload           8
        //   324: istore          7
        //   326: iload_3        
        //   327: ifeq            333
        //   330: iconst_1       
        //   331: istore          7
        //   333: aload_0        
        //   334: iload           7
        //   336: invokestatic    ith.c:(Landroid/content/Context;Z)V
        //   339: return         
        //   340: astore_1       
        //   341: aload_2        
        //   342: bipush          7
        //   344: aload_1        
        //   345: invokeinterface psh.h:(ILjava/lang/Object;)V
        //   350: aload_0        
        //   351: iconst_0       
        //   352: invokestatic    ith.c:(Landroid/content/Context;Z)V
        //   355: return         
        //   356: astore          16
        //   358: goto            95
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  53     63     340    356    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  101    125    356    361    Ljava/io/IOException;
        //  125    132    181    203    Any
        //  132    137    356    361    Ljava/io/IOException;
        //  183    188    191    200    Any
        //  193    200    356    361    Ljava/io/IOException;
        //  200    203    356    361    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0101:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static lb M(final zrc zrc) {
        Label_0330: {
            Label_0321: {
                Label_0312: {
                    int n = 0;
                    int n3 = 0;
                    Object o2 = null;
                Label_0219:
                    while (true) {
                    Label_0216:
                        while (true) {
                            int n2 = 0;
                            Label_0293: {
                                while (true) {
                                    int n4;
                                    try {
                                        final String i = zrc.o("status").i();
                                        i.getClass();
                                        final int[] f = ge9.F(3);
                                        final int length = f.length;
                                        n = 0;
                                        n2 = 0;
                                        if (n2 >= length) {
                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                        }
                                        n3 = f[n2];
                                        if (!ge9.j(n3).equals(i)) {
                                            break Label_0293;
                                        }
                                        final irc o = zrc.o("interfaces");
                                        if (o == null) {
                                            break Label_0216;
                                        }
                                        final ArrayList v = o.d().v;
                                        final ArrayList list = new ArrayList(v.size());
                                        final Iterator iterator = v.iterator();
                                        while (true) {
                                            o2 = list;
                                            if (!iterator.hasNext()) {
                                                break Label_0219;
                                            }
                                            final String j = ((irc)iterator.next()).i();
                                            j.getClass();
                                            final yb[] values = yb.values();
                                            final int length2 = values.length;
                                            n4 = 0;
                                            if (n4 >= length2) {
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                            final yb yb = values[n4];
                                            if (!yb.v.equals(j)) {
                                                break;
                                            }
                                            list.add((Object)yb);
                                        }
                                    }
                                    catch (final NullPointerException ex) {
                                        break Label_0312;
                                    }
                                    catch (final NumberFormatException ex2) {
                                        break Label_0321;
                                    }
                                    catch (final IllegalStateException ex3) {
                                        break Label_0330;
                                    }
                                    ++n4;
                                    continue;
                                }
                            }
                            ++n2;
                            continue;
                        }
                        o2 = null;
                        break;
                    }
                    final irc o3 = zrc.o("effective_type");
                    int f2 = n;
                    if (o3 != null) {
                        final String k = o3.i();
                        f2 = n;
                        if (k != null) {
                            f2 = b6r.f(k);
                        }
                    }
                    final irc o4 = zrc.o("cellular");
                    ib l;
                    if (o4 != null) {
                        l = a5r.k(o4.e());
                    }
                    else {
                        l = null;
                    }
                    return new lb(n3, (List)o2, f2, l);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Connectivity", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Connectivity", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Connectivity", (Throwable)ex3);
        return null;
    }
    
    public static Object M0(final cgr cgr) {
        if (cgr.k()) {
            return cgr.i();
        }
        if (cgr.d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException((Throwable)cgr.h());
    }
    
    public static kmj N(final zrc zrc) {
        Label_0120: {
            Label_0111: {
                Label_0102: {
                    String i = null;
                    String j = null;
                    Label_0045: {
                        try {
                            i = zrc.o("id").i();
                            final irc o = zrc.o("referrer");
                            if (o != null) {
                                j = o.i();
                                break Label_0045;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0102;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0111;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0120;
                        }
                        j = null;
                    }
                    final String k = zrc.o("url").i();
                    final irc o2 = zrc.o("name");
                    String l;
                    if (o2 != null) {
                        l = o2.i();
                    }
                    else {
                        l = null;
                    }
                    i.getClass();
                    k.getClass();
                    return new kmj(i, j, k, l);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ResourceEventView", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ResourceEventView", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ResourceEventView", (Throwable)ex3);
        return null;
    }
    
    public static nap O(final zrc zrc) {
        Label_0080: {
            Label_0071: {
                Label_0062: {
                    String i = null;
                    String j = null;
                    Label_0045: {
                        try {
                            i = zrc.o("id").i();
                            final irc o = zrc.o("current_locale");
                            if (o != null) {
                                j = o.i();
                                break Label_0045;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0062;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0071;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0080;
                        }
                        j = null;
                    }
                    i.getClass();
                    return new nap(i, j);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Application", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Application", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Application", (Throwable)ex3);
        return null;
    }
    
    public static Type P(final Type type, Class clazz, final Class clazz2) {
        if (clazz2 == clazz) {
            return type;
        }
        if (clazz2.isInterface()) {
            final Class[] interfaces = clazz.getInterfaces();
            for (int length = interfaces.length, i = 0; i < length; ++i) {
                final Class cls = interfaces[i];
                if (cls == clazz2) {
                    return clazz.getGenericInterfaces()[i];
                }
                if (clazz2.isAssignableFrom(cls)) {
                    return P(clazz.getGenericInterfaces()[i], interfaces[i], clazz2);
                }
            }
        }
        if (!clazz.isInterface()) {
            while (clazz != Object.class) {
                final Class superclass = clazz.getSuperclass();
                if (superclass == clazz2) {
                    return clazz.getGenericSuperclass();
                }
                if (clazz2.isAssignableFrom(superclass)) {
                    return P(clazz.getGenericSuperclass(), superclass, clazz2);
                }
                clazz = superclass;
            }
        }
        return (Type)clazz2;
    }
    
    public static final boolean Q(final s3f s3f) {
        if (!mlc.q(s3f, r3f.a) && !mlc.q(s3f, i3f.a) && !mlc.q(s3f, o3f.a) && !(s3f instanceof q3f) && !(s3f instanceof n3f)) {
            if (s3f != null && !s3f.equals(k3f.a) && !s3f.equals(p3f.a) && !s3f.equals(j3f.a) && !s3f.equals(m3f.a) && !s3f.equals(h3f.a)) {
                if (!(s3f instanceof l3f)) {
                    en9.r();
                }
            }
            return false;
        }
        return true;
    }
    
    public static Type R(final int n, final ParameterizedType parameterizedType) {
        final Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (n >= 0 && n < actualTypeArguments.length) {
            Type type2;
            final Type type = type2 = actualTypeArguments[n];
            if (type instanceof WildcardType) {
                type2 = ((WildcardType)type).getUpperBounds()[0];
            }
            return type2;
        }
        final StringBuilder p2 = hia.p(n, "Index ", " not in range [0,");
        p2.append(actualTypeArguments.length);
        p2.append(") for ");
        p2.append((Object)parameterizedType);
        throw new IllegalArgumentException(p2.toString());
    }
    
    public static Class S(Type rawType) {
        Objects.requireNonNull((Object)rawType, "type == null");
        if (rawType instanceof Class) {
            return (Class)rawType;
        }
        if (rawType instanceof ParameterizedType) {
            rawType = ((ParameterizedType)rawType).getRawType();
            if (rawType instanceof Class) {
                return (Class)rawType;
            }
            fvd.w();
            return null;
        }
        else {
            if (rawType instanceof GenericArrayType) {
                return Array.newInstance(S(((GenericArrayType)rawType).getGenericComponentType()), 0).getClass();
            }
            if (rawType instanceof TypeVariable) {
                return Object.class;
            }
            if (rawType instanceof WildcardType) {
                return S(((WildcardType)rawType).getUpperBounds()[0]);
            }
            final StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append((Object)rawType);
            oyl.p(sb, (Object)"> is of type ", (Object)rawType.getClass().getName());
            return null;
        }
    }
    
    public static Type T(final Type type, final Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return s0(type, cls, P(type, cls, Map.class));
        }
        fvd.w();
        return null;
    }
    
    public static boolean U(final Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            final Type[] actualTypeArguments = ((ParameterizedType)type).getActualTypeArguments();
            for (int length = actualTypeArguments.length, i = 0; i < length; ++i) {
                if (U(actualTypeArguments[i])) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return U(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof TypeVariable) {
            return true;
        }
        if (type instanceof WildcardType) {
            return true;
        }
        String name;
        if (type == null) {
            name = "null";
        }
        else {
            name = type.getClass().getName();
        }
        oyl.j("Expected a Class, ParameterizedType, or GenericArrayType, but <", (Object)type, (Object)"> is of type ", (Object)name);
        return false;
    }
    
    public static final int V(final int n, final int n2) {
        return n >> n2 & 0x1F;
    }
    
    public static w8c W(final mz8 mz8, int n, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            n = 1;
        }
        return new w8c(mz8, n, 0L);
    }
    
    public static final long X(final long n) {
        if (n < 0L) {
            final awp w = lz8.w;
            return lz8.y;
        }
        final awp w2 = lz8.w;
        return lz8.x;
    }
    
    public static final Object[] Y(final Object[] array, final int n, final Object o, final Object o2) {
        final Object[] array2 = new Object[array.length + 2];
        iw0.O0(0, n, 6, array, array2);
        iw0.K0(n + 2, n, array.length, array, array2);
        array2[n] = o;
        array2[n + 1] = o2;
        return array2;
    }
    
    public static final void Z(final bnf bnf) {
        bnf.setValue((Object)lqo.a);
    }
    
    public static final void a(final flq flq, final jta jta, final jta jta2, final lta lta, final lta lta2, final jta jta3, final st4 st4, final jta jta4, final igf igf, final gva gva, final int n) {
        gva.i0(1910493892);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)flq);
            }
            else {
                b = gva.h((Object)flq);
            }
            int n2;
            if (b) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.h((Object)jta2)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        int n7 = n4;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)lta)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n4 | n8);
        }
        int n9 = n7;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.h((Object)lta2)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n9 = (n7 | n10);
        }
        int n12;
        if ((0x30000 & n) == 0x0) {
            int n11;
            if (gva.h((Object)jta3)) {
                n11 = 131072;
            }
            else {
                n11 = 65536;
            }
            n12 = (n9 | n11);
        }
        else {
            n12 = n9;
        }
        int n13 = n12;
        if ((n & 0x180000) == 0x0) {
            boolean b2;
            if ((n & 0x200000) == 0x0) {
                b2 = gva.f((Object)st4);
            }
            else {
                b2 = gva.h((Object)st4);
            }
            int n14;
            if (b2) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n13 = (n12 | n14);
        }
        int n15 = n13;
        if ((n & 0xC00000) == 0x0) {
            int n16;
            if (gva.h((Object)jta4)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n13 | n16);
        }
        int n17 = n15;
        if ((n & 0x6000000) == 0x0) {
            int n18;
            if (gva.f((Object)igf)) {
                n18 = 67108864;
            }
            else {
                n18 = 33554432;
            }
            n17 = (n15 | n18);
        }
        if (gva.W(n17 & 0x1, (n17 & 0x2492493) != 0x2492492)) {
            final int y = xc2.y((Object)flq);
            if (y != 0) {
                if (y != 1) {
                    if (y != 2) {
                        final cib a = bi6.a;
                        if (y != 3) {
                            if (y != 4) {
                                throw ge9.y(2033610435, gva, false);
                            }
                            gva.g0(-1381431978);
                            final cg2 cg2 = (cg2)flq;
                            final String y2 = cg2.y();
                            final ModelSelection b3 = cg2.B();
                            final String a2 = cg2.A();
                            final String z = cg2.z();
                            final boolean b4 = (n17 & 0x1C00000) == 0x800000;
                            final Object r = gva.R();
                            Object o;
                            if (b4 || (o = r) == a) {
                                o = new pz0(jta4, (f07)null, (byte)3);
                                gva.q0(o);
                            }
                            mlc.i(new Object[] { y2, b3, a2, z }, (zta)o, gva);
                            final String a3 = cg2.A();
                            final ModelSelection b5 = cg2.B();
                            final String z2 = cg2.z();
                            final vyo vyo = (vyo)gva.j((sei)hm6.t);
                            Object o3;
                            if (b5 != null && a3 != null) {
                                gva.g0(-1380949432);
                                final boolean b6 = (n17 & 0x1C00) == 0x800;
                                final boolean f = gva.f((Object)b5);
                                final Object r2 = gva.R();
                                Object o2;
                                if ((b6 | f) || (o2 = r2) == a) {
                                    o2 = new ty1((Object)lta, (Object)b5, (byte)8);
                                    gva.q0(o2);
                                }
                                o3 = new a6j((jta)o2, a3);
                                gva.q(false);
                            }
                            else {
                                gva.g0(-1380828966);
                                gva.q(false);
                                o3 = null;
                            }
                            final s19 x = cg2.x();
                            Object o4;
                            if (x == null) {
                                gva.g0(-1380740431);
                                gva.q(false);
                                o4 = null;
                            }
                            else {
                                gva.g0(-1380740430);
                                final boolean b7 = (n17 & 0xE000) == 0x4000;
                                final boolean h = gva.h((Object)x);
                                final Object r3 = gva.R();
                                Object o5;
                                if ((b7 | h) || (o5 = r3) == a) {
                                    o5 = new ty1((Object)lta2, (Object)x, (byte)9);
                                    gva.q0(o5);
                                }
                                o4 = new y5j((jta)o5);
                                gva.q(false);
                            }
                            List list;
                            if (((ArrayList)(list = iw0.W0((Object[])new b6j[] { (b6j)o3, (b6j)o4 }))).isEmpty()) {
                                list = lq6.X(new z5j(jta));
                            }
                            final String y3 = cg2.y();
                            final String v = cg2.v();
                            final f6j w = cg2.w();
                            final b6j b6j = (b6j)c86.G0(list);
                            final b6j b6j2 = (b6j)c86.J0(1, list);
                            String s;
                            if (z2 != null && !kym.Y0((CharSequence)z2)) {
                                s = z2;
                            }
                            else {
                                s = null;
                            }
                            jta jta5;
                            if (s == null) {
                                gva.g0(-1380084657);
                                gva.q(false);
                                jta5 = null;
                            }
                            else {
                                gva.g0(-1380084656);
                                final boolean b8 = (n17 & 0x380000) == 0x100000 || ((n17 & 0x200000) != 0x0 && gva.h((Object)st4));
                                final boolean h2 = gva.h((Object)vyo);
                                final boolean f2 = gva.f((Object)s);
                                final Object r4 = gva.R();
                                Object o6;
                                if ((b8 | h2 | f2) || (o6 = r4) == a) {
                                    o6 = new zf2(st4, vyo, s);
                                    gva.q0(o6);
                                }
                                jta5 = (jta)o6;
                                gva.q(false);
                            }
                            b9r.f(y3, w, b6j, jta3, jta5, igf, (String)null, b6j2, v, gva, (n17 >> 6 & 0x1C00) | (n17 >> 9 & 0x70000), 64);
                            gva.q(false);
                        }
                        else {
                            gva.g0(-1381977547);
                            final boolean b9 = (n17 & 0x1C00000) == 0x800000;
                            final Object r5 = gva.R();
                            Object o7;
                            if (b9 || (o7 = r5) == a) {
                                o7 = new pz0(jta4, (f07)null, (byte)2);
                                gva.q0(o7);
                            }
                            mlc.f((zta)o7, gva, flq);
                            final eg2 eg2 = (eg2)flq;
                            t8r.i(jta3, jta2, jta, eg2.w(), eg2.v(), igf, gva, (n17 >> 15 & 0xE) | (n17 >> 3 & 0x70) | (n17 << 3 & 0x380) | (n17 >> 9 & 0x70000));
                            gva.q(false);
                        }
                    }
                    else {
                        gva.g0(2033625501);
                        f(n17 >> 21 & 0x70, 0, gva, igf, soh.S(2131758243, gva));
                        gva.q(false);
                    }
                }
                else {
                    gva.g0(-1382418119);
                    d(new og0(soh.S(y1r.m((p37)gva.j((sei)q37.a())), gva)), jta, igf, gva, (n17 & 0x70) | (n17 >> 18 & 0x380), 0);
                    gva.q(false);
                }
            }
            else {
                gva.g0(-1382619867);
                g((n17 >> 3 & 0xE) | (n17 >> 21 & 0x70), 0, jta, gva, igf);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new yg(flq, jta, jta2, lta, lta2, jta3, st4, jta4, igf, n);
        }
    }
    
    public static boolean a0(final Annotation[] array, final Class clazz) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (clazz.isInstance(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static final void b(final og0 og0, final bua bua, final igf igf, dng dng, final gva gva, final int n) {
        gva.i0(-1640602758);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)og0)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)bua)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)igf)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        final int n8 = n6 | 0xC00;
        if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
            dng = (dng)new hng(12.0f, 12.0f, 12.0f, 4.0f);
            final moe c = rj2.c((gx)wab.E, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b);
            d04.e((igf)null, (qs8)null, 0L, dng, true, false, uuj.t0(251493258, (aua)new um((Object)og0, (Object)bua, (byte)9), gva), gva, (n8 & 0x1C00) | 0x1B6000, 7);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new vh((byte)6, n, (Object)og0, (Object)bua, (Object)igf, (Object)dng);
        }
    }
    
    public static final boolean b0(final gva gva) {
        return ((Configuration)gva.j((sei)q50.a)).screenHeightDp < 480;
    }
    
    public static final void c(final boolean b, final ye6 ye6, final ye6 ye7, final jta jta, igf v, long s, long x, float n, float n2, float n3, float n4, final float n5, final gva gva, final int n6, final int n7, final int n8) {
        gva.i0(-1722080608);
        int n10;
        if ((n6 & 0x6) == 0x0) {
            int n9;
            if (gva.g(b)) {
                n9 = 4;
            }
            else {
                n9 = 2;
            }
            n10 = (n9 | n6);
        }
        else {
            n10 = n6;
        }
        int n11 = n10;
        if ((n6 & 0x30) == 0x0) {
            int n12;
            if (gva.h((Object)ye6)) {
                n12 = 32;
            }
            else {
                n12 = 16;
            }
            n11 = (n10 | n12);
        }
        int n13 = n11;
        if ((n6 & 0x180) == 0x0) {
            int n14;
            if (gva.h((Object)ye7)) {
                n14 = 256;
            }
            else {
                n14 = 128;
            }
            n13 = (n11 | n14);
        }
        int n16;
        if ((n6 & 0xC00) == 0x0) {
            int n15;
            if (gva.h((Object)jta)) {
                n15 = 2048;
            }
            else {
                n15 = 1024;
            }
            n16 = (n13 | n15);
        }
        else {
            n16 = n13;
        }
        final int n17 = n8 & 0x10;
        int n18;
        if (n17 != 0) {
            n18 = (n16 | 0x6000);
        }
        else {
            n18 = n16;
            if ((n6 & 0x6000) == 0x0) {
                int n19;
                if (gva.f((Object)v)) {
                    n19 = 16384;
                }
                else {
                    n19 = 8192;
                }
                n18 = (n16 | n19);
            }
        }
        int n20 = n18 | 0x30000;
        if ((n6 & 0x180000) == 0x0) {
            int n21;
            if ((n8 & 0x40) == 0x0 && gva.e(s)) {
                n21 = 1048576;
            }
            else {
                n21 = 524288;
            }
            n20 |= n21;
        }
        if ((n6 & 0xC00000) == 0x0) {
            int n22;
            if ((n8 & 0x80) == 0x0 && gva.e(x)) {
                n22 = 8388608;
            }
            else {
                n22 = 4194304;
            }
            n20 |= n22;
        }
        final int n23 = n8 & 0x100;
        int n24;
        if (n23 != 0) {
            n24 = (n20 | 0x6000000);
        }
        else {
            n24 = n20;
            if ((n6 & 0x6000000) == 0x0) {
                int n25;
                if (gva.c(n)) {
                    n25 = 67108864;
                }
                else {
                    n25 = 33554432;
                }
                n24 = (n20 | n25);
            }
        }
        float n26 = n;
        if ((n6 & 0x30000000) == 0x0) {
            int n27;
            if ((n8 & 0x200) == 0x0 && gva.c(n2)) {
                n27 = 536870912;
            }
            else {
                n27 = 268435456;
            }
            n24 |= n27;
        }
        int n29;
        if ((n7 & 0x6) == 0x0) {
            int n28;
            if ((n8 & 0x400) == 0x0 && gva.c(n3)) {
                n28 = 4;
            }
            else {
                n28 = 2;
            }
            n29 = (n7 | n28);
        }
        else {
            n29 = n7;
        }
        if ((n7 & 0x30) == 0x0) {
            int n30;
            if ((n8 & 0x800) == 0x0 && gva.c(n4)) {
                n30 = 32;
            }
            else {
                n30 = 16;
            }
            n29 |= n30;
        }
        if ((n7 & 0x180) == 0x0) {
            int n31;
            if ((n8 & 0x1000) == 0x0 && gva.c(n5)) {
                n31 = 256;
            }
            else {
                n31 = 128;
            }
            n29 |= n31;
        }
        int n32 = n24;
        float n43;
        if (gva.W(n32 & 0x1, (n24 & 0x12492493) != 0x12492492 || (n29 & 0x93) != 0x92)) {
            gva.b0();
            int n35;
            float n40;
            if ((n6 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n33 = n32;
                if ((n8 & 0x40) != 0x0) {
                    n33 = (n32 & 0xFFC7FFFF);
                }
                int n34 = n33;
                if ((n8 & 0x80) != 0x0) {
                    n34 = (n33 & 0xFE3FFFFF);
                }
                n35 = n34;
                if ((n8 & 0x200) != 0x0) {
                    n35 = (n34 & 0x8FFFFFFF);
                }
                int n36 = n29;
                if ((n8 & 0x400) != 0x0) {
                    n36 = (n29 & 0xFFFFFFF1);
                }
                int n37 = n36;
                if ((n8 & 0x800) != 0x0) {
                    n37 = (n36 & 0xFFFFFF8F);
                }
                int n38 = n37;
                if ((n8 & 0x1000) != 0x0) {
                    n38 = (n37 & 0xFFFFFC7F);
                }
                final float n39 = n3;
                n = n4;
                n3 = n5;
                n29 = n38;
                n40 = n2;
                n2 = n39;
            }
            else {
                if (n17 != 0) {
                    v = (igf)fgf.v;
                }
                if ((n8 & 0x40) != 0x0) {
                    final cy4 a = qy4.a;
                    s = qy4.a(gva).s;
                    n32 &= 0xFFC7FFFF;
                }
                n35 = n32;
                if ((n8 & 0x80) != 0x0) {
                    final cy4 a2 = qy4.a;
                    x = qy4.a(gva).x;
                    n35 = (n32 & 0xFE3FFFFF);
                }
                if (n23 != 0) {
                    n26 = 16.0f;
                }
                if ((n8 & 0x200) != 0x0) {
                    n40 = 8.0f;
                    n35 &= 0x8FFFFFFF;
                }
                else {
                    n40 = n2;
                }
                if ((n8 & 0x400) != 0x0) {
                    n29 &= 0xFFFFFFF1;
                    n = 32.0f;
                }
                else {
                    n = n3;
                }
                if ((n8 & 0x800) != 0x0) {
                    n29 &= 0xFFFFFF8F;
                    n2 = 24.0f;
                }
                else {
                    n2 = n4;
                }
                if ((n8 & 0x1000) != 0x0) {
                    n4 = 4.0f;
                    n29 &= 0xFFFFFC7F;
                    n3 = n2;
                    n2 = n;
                    n = n3;
                    n3 = n4;
                }
                else {
                    n4 = n2;
                    n3 = n5;
                    n2 = n;
                    n = n4;
                }
            }
            gva.r();
            final Object r = gva.R();
            final cib a3 = bi6.a;
            Object q = r;
            if (r == a3) {
                q = o50.Q(null);
                gva.q0(q);
            }
            final bnf bnf = (bnf)q;
            final View rootView = ((View)gva.j((sei)q50.f)).getRootView();
            final boolean h = gva.h((Object)rootView);
            final boolean b2 = (n35 & 0x70000) == 0x20000;
            final Object r2 = gva.R();
            Object o;
            if ((h | b2) || (o = r2) == a3) {
                o = new e4((Object)rootView, (Object)bnf, (byte)7);
                gva.q0(o);
            }
            final igf d = ien.D(v, (lta)o);
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b3 = ien.B(gva, d);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b3);
            ye6.d((Object)gva, (Object)(n35 >> 3 & 0xE));
            if (b && ((xom)bnf).getValue() != null) {
                gva.g0(656891244);
                final tao tao = (tao)((xom)bnf).getValue();
                tao.getClass();
                final ye6 t0 = uuj.t0(4299776, (aua)new bc3(ye7, (byte)0), gva);
                final int n41 = n35 >> 12;
                final int n42 = n29 << 15;
                o4r.j(jta, tao, s, x, n40, n2, n, n3, n26, t0, gva, (n35 >> 9 & 0xE) | 0x30000000 | (n41 & 0x380) | (n41 & 0x1C00) | (n35 >> 15 & 0xE000) | (n42 & 0x70000) | (0x380000 & n42) | (n42 & 0x1C00000) | (n35 & 0xE000000));
                gva.q(false);
            }
            else {
                gva.g0(657358600);
                gva.q(false);
            }
            gva.q(true);
            n4 = n2;
            n2 = n40;
            n43 = n4;
        }
        else {
            gva.Z();
            n43 = n3;
            n = n4;
            n3 = n5;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new cc3(b, ye6, ye7, jta, v, s, x, n26, n2, n43, n, n3, n6, n7, n8);
        }
    }
    
    public static IllegalArgumentException c0(final Method method, final Exception ex, final String s, final Object... array) {
        final StringBuilder sb = new StringBuilder(String.format(s, array));
        sb.append("\n    for method ");
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        return new IllegalArgumentException(sb.toString(), (Throwable)ex);
    }
    
    public static final void d(final og0 og0, final jta jta, igf v, final gva gva, final int n, final int n2) {
        gva.i0(340951083);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)og0)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)jta)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        final int n7 = n2 & 0x4;
        int n8;
        if (n7 != 0) {
            n8 = (n5 | 0x180);
        }
        else {
            n8 = n5;
            if ((n & 0x180) == 0x0) {
                int n9;
                if (gva.f((Object)v)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n5 | n9);
            }
        }
        if (gva.W(n8 & 0x1, (n8 & 0x93) != 0x92)) {
            if (n7 != 0) {
                v = (igf)fgf.v;
            }
            final ye6 t0 = uuj.t0(21626550, (aua)new hy(jta, (byte)2), gva);
            final igf d = androidx.compose.foundation.layout.b.d(v, 1.0f);
            final WeakHashMap x = l2q.x;
            b(og0, (bua)t0, vt4.k0(d, (d1q)new wbd((d1q)o50.w(gva).g, xp7.q)), null, gva, (n8 & 0xE) | 0x30);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new m60((CharSequence)og0, jta, (Object)v, n, n2, (byte)3);
        }
    }
    
    public static void d0(final PackageInfo packageInfo, File file) {
        final File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            file = (File)new DataOutputStream((OutputStream)new FileOutputStream(file2));
            try {
                ((DataOutputStream)file).writeLong(packageInfo.lastUpdateTime);
                ((OutputStream)file).close();
            }
            finally {
                try {
                    ((OutputStream)file).close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)packageInfo).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    public static final b48 e(final lta lta) {
        final iv8 iv8 = new iv8();
        lta.b(iv8);
        final float[] b = iv8.b;
        final ArrayList a = iv8.a;
        final int size = a.size();
        uuj.b0(size, b.length);
        final float[] copyOfRange = Arrays.copyOfRange(b, 0, size);
        copyOfRange.getClass();
        return new b48((List)a, copyOfRange);
    }
    
    public static IllegalArgumentException e0(final Method method, final int n, final String s, final Object... array) {
        return c0(method, null, lmf.s(s, " (", rah.b.g(n, method), ")"), array);
    }
    
    public static final void f(final int n, final int n2, final gva gva, igf v, final String s) {
        gva.i0(-631372181);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)s)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x30) == 0x0) {
                int n7;
                if (gva.f((Object)v)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if (gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            final og0 og0 = new og0(s);
            final igf d = androidx.compose.foundation.layout.b.d(v, 1.0f);
            final WeakHashMap x = l2q.x;
            b(og0, null, vt4.k0(d, (d1q)new wbd((d1q)o50.w(gva).g, xp7.q)), null, gva, 48);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new ag2((byte)0, n, n2, v, s);
        }
    }
    
    public static IllegalArgumentException f0(final Method method, final Exception ex, final int n, final String s, final Object... array) {
        return c0(method, ex, lmf.s(s, " (", rah.b.g(n, method), ")"), array);
    }
    
    public static final void g(final int n, final int n2, final jta jta, final gva gva, igf v) {
        gva.i0(-485366102);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)jta)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n | n3);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x30) == 0x0) {
                int n7;
                if (gva.f((Object)v)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if (gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            final n9k z = og0.z;
            d(ncq.y(soh.S(a2r.z((p37)gva.j((sei)q37.a())), gva), new vmn(new hcm(((j86)gva.j((sei)dx6.a)).a, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, wgn.c, (rpl)null, 61438), (hcm)null, 14), 4), jta, v, gva, n6 << 3 & 0x3F0, 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new z32((byte)1, n, n2, jta, v);
        }
    }
    
    public static long g0(final String s) {
        if (s.length() == 0) {
            en9.s("The string is empty");
            return 0L;
        }
        final char char1 = s.charAt(0);
        final int n = 1;
        int n2;
        int n3;
        if (char1 != '+') {
            if (char1 != '-') {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            n3 = n2;
        }
        else {
            n3 = 0;
            n2 = 1;
        }
        if (s.length() <= n2) {
            en9.s("No components");
            return 0L;
        }
        if (s.charAt(n2) != 'P') {
            en9.s("");
            return 0L;
        }
        final int n4 = n2 + 1;
        if (n4 != s.length()) {
            int n5 = 0;
            Object o = null;
            long n6 = 0L;
            long n7 = 0L;
            final int n8 = n;
            int i = n4;
        Label_0228_Outer:
            while (i < s.length()) {
                final char char2 = s.charAt(i);
                if (char2 != 'T') {
                    final yvd d = yvd.d;
                    xkq.d();
                    final yvd d2 = yvd.d;
                    while (true) {
                        Label_0235: {
                            if (!yvd.a(d2)) {
                                break Label_0235;
                            }
                            final char char3 = s.charAt(i);
                            if (char3 == '+') {
                                final int j = i + 1;
                                break Label_0228;
                            }
                            if (char3 != '-') {
                                break Label_0235;
                            }
                            int j = i + 1;
                            int n9 = -1;
                        Label_0457_Outer:
                            while (true) {
                                while (j < s.length() && s.charAt(j) == '0') {
                                    ++j;
                                }
                                long n10 = 0L;
                                while (true) {
                                    while (j < s.length()) {
                                        int char4 = s.charAt(j);
                                        if (48 <= char4 && char4 < 58) {
                                            char4 -= 48;
                                            if (n10 <= yvd.c(d2)) {
                                                if (n10 != yvd.c(d2) || char4 <= yvd.b(d2)) {
                                                    n10 = (n10 << 3) + (n10 << n8) + char4;
                                                    ++j;
                                                    continue Label_0228_Outer;
                                                }
                                            }
                                            while (j < s.length()) {
                                                final char char5 = s.charAt(j);
                                                if ('0' > char5 || char5 >= ':') {
                                                    break;
                                                }
                                                ++j;
                                            }
                                            if (j != s.length()) {
                                                int n11;
                                                if (char2 != '+' && char2 != '-') {
                                                    n11 = 0;
                                                }
                                                else {
                                                    n11 = n8;
                                                }
                                                if (j != i + n11) {
                                                    final yvd d3 = yvd.d;
                                                    n10 = 4611686018427387903L;
                                                    final char char6 = s.charAt(j);
                                                    pz8 pz8 = pz8.z;
                                                    i = j;
                                                    if (char6 == '.') {
                                                        final int n12 = j + 1;
                                                        final int min = Math.min(j + 7, s.length());
                                                        int k = n12;
                                                        int n13 = 0;
                                                        while (k < min) {
                                                            final char char7 = s.charAt(k);
                                                            if ('0' > char7 || char7 >= ':') {
                                                                break;
                                                            }
                                                            n13 = char7 - '0' + ((n13 << 3) + (n13 << 1));
                                                            ++k;
                                                        }
                                                        final int n14 = 0;
                                                        int n15 = n13;
                                                        for (int l = n14; l < 6 - (k - n12); ++l) {
                                                            n15 = (n15 << 1) + (n15 << 3);
                                                        }
                                                        final int min2 = Math.min(k + 9, s.length());
                                                        int n16 = k;
                                                        int n17 = 0;
                                                        while (n16 < min2) {
                                                            final char char8 = s.charAt(n16);
                                                            if ('0' > char8 || char8 >= ':') {
                                                                break;
                                                            }
                                                            n17 = char8 - '0' + ((n17 << 3) + (n17 << 1));
                                                            ++n16;
                                                        }
                                                        for (int n18 = 0; n18 < 9 - (n16 - k); ++n18) {
                                                            n17 = (n17 << 1) + (n17 << 3);
                                                        }
                                                        for (i = n16; i < s.length(); ++i) {
                                                            final char char9 = s.charAt(i);
                                                            if ('0' > char9 || char9 >= ':') {
                                                                break;
                                                            }
                                                        }
                                                        if (i == n12 || i == s.length() || s.charAt(i) != 'S') {
                                                            en9.s("");
                                                            return 0L;
                                                        }
                                                        final long n19 = n15;
                                                        final long n20 = n17;
                                                        final long n21 = n9;
                                                        final double n22 = (double)(n19 * 1000000000L + n20);
                                                        long m = 0L;
                                                        Label_0977: {
                                                            double n23 = 0.0;
                                                            switch (((Enum)pz8).ordinal()) {
                                                                default: {
                                                                    uy8.g((Object)pz8, "Unknown unit: ");
                                                                    m = 0L;
                                                                    break Label_0977;
                                                                }
                                                                case 6: {
                                                                    n23 = 0.0864;
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    n23 = 0.0036;
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    n23 = 6.0E-5;
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    n23 = 1.0E-6;
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    n23 = 1.0E-9;
                                                                    break;
                                                                }
                                                                case 1: {
                                                                    n23 = 1.0E-12;
                                                                    break;
                                                                }
                                                                case 0: {
                                                                    n23 = 1.0E-15;
                                                                    break;
                                                                }
                                                            }
                                                            m = k8e.I(n22 * n23);
                                                        }
                                                        n7 = m * n21;
                                                    }
                                                    final char char10 = s.charAt(i);
                                                    final pz8 c = pz8.C;
                                                    if (char10 != 'D') {
                                                        if (char10 != 'H') {
                                                            if (char10 != 'M') {
                                                                if (char10 != 'S') {
                                                                    pz8 = null;
                                                                }
                                                            }
                                                            else {
                                                                pz8 = pz8.A;
                                                            }
                                                        }
                                                        else {
                                                            pz8 = pz8.B;
                                                        }
                                                    }
                                                    else {
                                                        pz8 = c;
                                                    }
                                                    if (pz8 == null) {
                                                        final char char11 = s.charAt(i);
                                                        final StringBuilder sb = new StringBuilder("Unknown duration unit short name: ");
                                                        sb.append(char11);
                                                        throw new IllegalArgumentException(sb.toString());
                                                    }
                                                    if (o != null && ((Enum)o).compareTo((Enum)pz8) <= 0) {
                                                        en9.s("Unexpected order of duration components");
                                                        return 0L;
                                                    }
                                                    long h;
                                                    if (pz8 == c) {
                                                        if (n5 != 0) {
                                                            en9.s("");
                                                            return 0L;
                                                        }
                                                        h = yi2.p(n10, pz8) * n9;
                                                    }
                                                    else {
                                                        if (n5 == 0) {
                                                            en9.s("");
                                                            return 0L;
                                                        }
                                                        h = h(n6, yi2.p(n10, pz8) * n9);
                                                        if (h == 9223372036854759646L) {
                                                            en9.s("");
                                                            return 0L;
                                                        }
                                                    }
                                                    ++i;
                                                    o = pz8;
                                                    n6 = h;
                                                    continue Label_0228_Outer;
                                                }
                                            }
                                            en9.s("");
                                            return 0L;
                                        }
                                        break;
                                    }
                                    if (j != s.length()) {
                                        int n24;
                                        if (char2 != '+' && char2 != '-') {
                                            n24 = 0;
                                        }
                                        else {
                                            n24 = n8;
                                        }
                                        if (j != i + n24) {
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                en9.s("");
                                return 0L;
                                n9 = n8;
                                continue Label_0457_Outer;
                            }
                        }
                        int j = i;
                        continue;
                    }
                }
                if (n5 != 0 || ++i == s.length()) {
                    en9.s("");
                    return 0L;
                }
                n5 = n8;
            }
            long n26;
            final long n25 = n26 = lz8.r(F0(n6, pz8.y), F0(n7, pz8.w));
            if (n3 != 0) {
                n26 = n25;
                if (!lz8.h(n25, lz8.z)) {
                    n26 = lz8.x(n25);
                }
            }
            return n26;
        }
        en9.s("");
        return 0L;
    }
    
    public static final long h(final long n, final long n2) {
        if (n != 4611686018427387903L && n != -4611686018427387903L) {
            if (n2 != 4611686018427387903L && n2 != -4611686018427387903L) {
                return ncq.q(n + n2, -4611686018427387903L, 4611686018427387903L);
            }
            return n2;
        }
        else {
            if (-4611686018427387903L < n2 && n2 < 4611686018427387903L) {
                return n;
            }
            if ((n2 ^ n) >= 0L) {
                return n;
            }
            return 9223372036854759646L;
        }
    }
    
    public static final lfc h0(final CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return (lfc)new a(charSequence, "An empty string is not a valid Instant");
        }
        int char1 = charSequence.charAt(0);
        int n;
        if (char1 != 43 && char1 != 45) {
            n = 0;
            char1 = 32;
        }
        else {
            n = 1;
        }
        int n2 = 0;
        int i;
        for (i = n; i < charSequence.length(); ++i) {
            final char char2 = charSequence.charAt(i);
            if ('0' > char2 || char2 >= ':') {
                break;
            }
            n2 = n2 * 10 + (charSequence.charAt(i) - '0');
        }
        final int n3 = i - n;
        if (n3 > 10) {
            final StringBuilder sb = new StringBuilder("Expected at most 10 digits for the year number, got ");
            sb.append(n3);
            sb.append(" digits");
            return (lfc)j0(charSequence, sb.toString());
        }
        if (n3 == 10 && charSequence.charAt(n) >= '2') {
            final StringBuilder sb2 = new StringBuilder("Expected at most 9 digits for the year number or year 1000000000, got ");
            sb2.append(n3);
            sb2.append(" digits");
            return (lfc)j0(charSequence, sb2.toString());
        }
        if (n3 < 4) {
            final StringBuilder sb3 = new StringBuilder("The year number must be padded to 4 digits, got ");
            sb3.append(n3);
            sb3.append(" digits");
            return (lfc)j0(charSequence, sb3.toString());
        }
        if (char1 == 43 && n3 == 4) {
            return (lfc)j0(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (char1 == 32 && n3 != 4) {
            return (lfc)j0(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        int n4 = n2;
        if (char1 == 45) {
            n4 = -n2;
        }
        final int length = charSequence.length();
        final int n5 = i + 16;
        if (length < n5) {
            return (lfc)j0(charSequence, "The input string is too short");
        }
        final a i2 = i0(charSequence, "'-'", i, (lta)new dqb((byte)19));
        if (i2 != null) {
            return (lfc)i2;
        }
        final a i3 = i0(charSequence, "'-'", i + 3, (lta)new dqb((byte)20));
        if (i3 != null) {
            return (lfc)i3;
        }
        final a i4 = i0(charSequence, "'T' or 't'", i + 6, (lta)new dqb((byte)21));
        if (i4 != null) {
            return (lfc)i4;
        }
        final a i5 = i0(charSequence, "':'", i + 9, (lta)new dqb((byte)22));
        if (i5 != null) {
            return (lfc)i5;
        }
        final a i6 = i0(charSequence, "':'", i + 12, (lta)new dqb((byte)23));
        if (i6 != null) {
            return (lfc)i6;
        }
        for (int j = 0; j < 10; ++j) {
            final a i7 = i0(charSequence, "an ASCII digit", ri2.e[j] + i, (lta)new dqb((byte)24));
            if (i7 != null) {
                return (lfc)i7;
            }
        }
        final int k0 = k0(i + 1, charSequence);
        final int k2 = k0(i + 4, charSequence);
        final int k3 = k0(i + 7, charSequence);
        final int k4 = k0(i + 10, charSequence);
        final int k5 = k0(i + 13, charSequence);
        int l = i + 15;
        int n8;
        if (charSequence.charAt(l) == '.') {
            l = n5;
            int n6 = 0;
            while (l < charSequence.length()) {
                final char char3 = charSequence.charAt(l);
                if ('0' > char3 || char3 >= ':') {
                    break;
                }
                n6 = n6 * 10 + (charSequence.charAt(l) - '0');
                ++l;
            }
            final int n7 = l - n5;
            if (1 > n7 || n7 >= 10) {
                final StringBuilder sb4 = new StringBuilder("1..9 digits are supported for the fraction of the second, got ");
                sb4.append(n7);
                sb4.append(" digits");
                return (lfc)j0(charSequence, sb4.toString());
            }
            n8 = n6 * ri2.d[9 - n7];
        }
        else {
            n8 = 0;
        }
        if (l >= charSequence.length()) {
            return (lfc)j0(charSequence, "The UTC offset at the end of the string is missing");
        }
        final char char4 = charSequence.charAt(l);
        int n9;
        if (char4 != '+' && char4 != '-') {
            if (char4 != 'Z' && char4 != 'z') {
                final StringBuilder sb5 = new StringBuilder("Expected the UTC offset at position ");
                sb5.append(l);
                sb5.append(", got '");
                sb5.append(char4);
                sb5.append('\'');
                return (lfc)j0(charSequence, sb5.toString());
            }
            final int length2 = charSequence.length();
            ++l;
            if (length2 != l) {
                final StringBuilder sb6 = new StringBuilder("Extra text after the instant at position ");
                sb6.append(l);
                return (lfc)j0(charSequence, sb6.toString());
            }
            n9 = 0;
        }
        else {
            final int n10 = charSequence.length() - l;
            if (n10 > 9) {
                final StringBuilder sb7 = new StringBuilder("The UTC offset string \"");
                sb7.append(H0(16, (CharSequence)charSequence.subSequence(l, charSequence.length()).toString()));
                sb7.append("\" is too long");
                return (lfc)j0(charSequence, sb7.toString());
            }
            if (n10 % 3 != 0) {
                final StringBuilder sb8 = new StringBuilder("Invalid UTC offset string \"");
                sb8.append(charSequence.subSequence(l, charSequence.length()).toString());
                sb8.append('\"');
                return (lfc)j0(charSequence, sb8.toString());
            }
            for (int n11 = 0; n11 < 2; ++n11) {
                final int n12 = l + ri2.f[n11];
                if (n12 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(n12) != ':') {
                    final StringBuilder p = hia.p(n12, "Expected ':' at index ", ", got '");
                    p.append(charSequence.charAt(n12));
                    p.append('\'');
                    return (lfc)j0(charSequence, p.toString());
                }
            }
            for (int n13 = 0; n13 < 6; ++n13) {
                final int n14 = ri2.g[n13] + l;
                if (n14 >= charSequence.length()) {
                    break;
                }
                final char char5 = charSequence.charAt(n14);
                if ('0' > char5 || char5 >= ':') {
                    final StringBuilder p2 = hia.p(n14, "Expected an ASCII digit at index ", ", got '");
                    p2.append(charSequence.charAt(n14));
                    p2.append('\'');
                    return (lfc)j0(charSequence, p2.toString());
                }
            }
            final int k6 = k0(l + 1, charSequence);
            int k7;
            if (n10 > 3) {
                k7 = k0(l + 4, charSequence);
            }
            else {
                k7 = 0;
            }
            int k8;
            if (n10 > 6) {
                k8 = k0(l + 7, charSequence);
            }
            else {
                k8 = 0;
            }
            if (k7 > 59) {
                final StringBuilder sb9 = new StringBuilder("Expected offset-minute-of-hour in 0..59, got ");
                sb9.append(k7);
                return (lfc)j0(charSequence, sb9.toString());
            }
            if (k8 > 59) {
                final StringBuilder sb10 = new StringBuilder("Expected offset-second-of-minute in 0..59, got ");
                sb10.append(k8);
                return (lfc)j0(charSequence, sb10.toString());
            }
            if (k6 > 17 && (k6 != 18 || k7 != 0 || k8 != 0)) {
                final StringBuilder sb11 = new StringBuilder("Expected an offset in -18:00..+18:00, got ");
                sb11.append(charSequence.subSequence(l, charSequence.length()).toString());
                return (lfc)j0(charSequence, sb11.toString());
            }
            int n15;
            if (char4 == '-') {
                n15 = -1;
            }
            else {
                n15 = 1;
            }
            n9 = (k7 * 60 + k6 * 3600 + k8) * n15;
        }
        if (1 <= k0 && k0 < 13) {
            if (1 <= k2) {
                final int n16 = n4 & 0x3;
                final boolean b = n16 == 0 && (n4 % 100 != 0 || n4 % 400 == 0);
                int n17;
                if (k0 != 2) {
                    if (k0 != 4 && k0 != 6 && k0 != 9 && k0 != 11) {
                        n17 = 31;
                    }
                    else {
                        n17 = 30;
                    }
                }
                else if (b) {
                    n17 = 29;
                }
                else {
                    n17 = 28;
                }
                if (k2 <= n17) {
                    if (k3 > 23) {
                        final StringBuilder sb12 = new StringBuilder("Expected hour in 0..23, got ");
                        sb12.append(k3);
                        return (lfc)j0(charSequence, sb12.toString());
                    }
                    if (k4 > 59) {
                        final StringBuilder sb13 = new StringBuilder("Expected minute-of-hour in 0..59, got ");
                        sb13.append(k4);
                        return (lfc)j0(charSequence, sb13.toString());
                    }
                    if (k5 > 59) {
                        final StringBuilder sb14 = new StringBuilder("Expected second-of-minute in 0..59, got ");
                        sb14.append(k5);
                        return (lfc)j0(charSequence, sb14.toString());
                    }
                    final long n18 = n4;
                    final long n19 = 365L * n18;
                    long n20;
                    if (n18 >= 0L) {
                        n20 = (n18 + 399L) / 400L + ((n18 + 3L) / 4L - (n18 + 99L) / 100L) + n19;
                    }
                    else {
                        n20 = n19 - (n18 / -400L + (n18 / -4L - n18 / -100L));
                    }
                    long n22;
                    final long n21 = n22 = n20 + (k0 * 367 - 362) / 12 + (k2 - 1);
                    if (k0 > 2) {
                        if (n16 == 0 && (n4 % 100 != 0 || n4 % 400 == 0)) {
                            n22 = -1L + n21;
                        }
                        else {
                            n22 = n21 - 2L;
                        }
                    }
                    return (lfc)new kotlin.time.b((n22 - 719528L) * 86400L + (k4 * 60 + k3 * 3600 + k5) - n9, n8);
                }
            }
            final StringBuilder o = hia.o(k0, n4, "Expected a valid day-of-month for month ", " of year ", ", got ");
            o.append(k2);
            return (lfc)j0(charSequence, o.toString());
        }
        final StringBuilder sb15 = new StringBuilder("Expected a month number in 1..12, got ");
        sb15.append(k0);
        return (lfc)j0(charSequence, sb15.toString());
    }
    
    public static igf i(final igf igf, final m30 m30, final zhg zhg, boolean b, llf llf, pi2 pi2, final int n) {
        if ((n & 0x4) != 0x0) {
            b = true;
        }
        if ((n & 0x8) != 0x0) {
            llf = null;
        }
        if ((n & 0x20) != 0x0) {
            pi2 = null;
        }
        return igf.E(new s20<Object>(m30, zhg, b, null, llf, (gia)pi2));
    }
    
    public static final a i0(final CharSequence charSequence, final String s, final int n, final lta lta) {
        final char char1 = charSequence.charAt(n);
        if (lta.b(char1)) {
            return null;
        }
        final StringBuilder sb = new StringBuilder("Expected ");
        sb.append(s);
        sb.append(", but got '");
        sb.append(char1);
        sb.append("' at position ");
        sb.append(n);
        return j0(charSequence, sb.toString());
    }
    
    public static igf j(final igf igf, final m30 m30, final boolean b, final zhg zhg, boolean b2, final int n) {
        if ((n & 0x8) != 0x0) {
            b2 = true;
        }
        return igf.E(new s20<Object>(m30, zhg, b2, b, null, null));
    }
    
    public static final a j0(final CharSequence charSequence, final String s) {
        final StringBuilder sb = new StringBuilder(s);
        sb.append(" when parsing an Instant from \"");
        sb.append(H0(64, charSequence));
        sb.append('\"');
        return new a(charSequence, sb.toString());
    }
    
    public static final Object k(final m30 m30, final float n, final l30 l30, final b48 b48, final Object o, final cg0 cg0, final m6n m6n) {
        final float f = b48.f(o);
        final Object o2 = new Object();
        float h;
        if (Float.isNaN(m30.j.h())) {
            h = 0.0f;
        }
        else {
            h = m30.j.h();
        }
        ((y3j)o2).v = h;
        if (!Float.isNaN(f)) {
            final float v = ((y3j)o2).v;
            if (v != f) {
                final Object k = uoo.k(v, f, n, cg0, (zta)new u20(l30, (y3j)o2, (byte)0), m6n);
                if (k == pc7.v) {
                    return k;
                }
            }
        }
        return lqo.a;
    }
    
    public static final int k0(final int n, final CharSequence charSequence) {
        return charSequence.charAt(n + 1) - '0' + (charSequence.charAt(n) - '0') * 10;
    }
    
    public static final Object l(final m30 m30, final Object o, float v, final cg0 cg0, final v08 v2, final h07 h07) {
        Object o2 = null;
        Label_0060: {
            if (h07 instanceof w20) {
                final w20 w20 = (w20)h07;
                final int y = w20.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    w20.y = y + Integer.MIN_VALUE;
                    o2 = w20;
                    break Label_0060;
                }
            }
            o2 = new w20(h07);
        }
        final Object x = ((w20)o2).x;
        final int y2 = ((w20)o2).y;
        y3j w21;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((w20)o2).v;
            w21 = ((w20)o2).w;
            vt4.g0(x);
        }
        else {
            vt4.g0(x);
            final Object w22 = new Object();
            ((y3j)w22).v = v;
            final y20 y3 = new y20(m30, v, cg0, (y3j)w22, v2, (f07)null);
            ((w20)o2).w = (y3j)w22;
            ((w20)o2).v = v;
            ((w20)o2).y = 1;
            final Object a = m30.a(o, lnf.v, (cua)y3, (h07)o2);
            final pc7 v3 = pc7.v;
            if (a == v3) {
                return v3;
            }
            w21 = (y3j)w22;
        }
        return new Float(v - w21.v);
    }
    
    public static final Class l0(Type type) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType)type).getRawType();
            type.getClass();
            return l0(type);
        }
        if (type instanceof WildcardType) {
            final Type[] upperBounds = ((WildcardType)type).getUpperBounds();
            upperBounds.getClass();
            final Object x0 = iw0.X0((Object[])upperBounds);
            x0.getClass();
            return l0((Type)x0);
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType)type).getGenericComponentType();
            type.getClass();
            return l0(type);
        }
        final StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append((Object)type);
        oyl.p(sb, (Object)" has type ", (Object)v4j.a((Class)type.getClass()));
        return null;
    }
    
    public static Object m(final m30 m30, final Object o, final float n, final d30 d30) {
        cg0 cg0;
        if (m30.d()) {
            cg0 = m30.d;
            if (cg0 == null) {
                mlc.j0("snapAnimationSpec");
                throw null;
            }
        }
        else {
            cg0 = r20.a;
        }
        v08 v08;
        if (m30.d()) {
            v08 = m30.e;
            if (v08 == null) {
                mlc.j0("decayAnimationSpec");
                throw null;
            }
        }
        else {
            v08 = r20.c;
        }
        return l(m30, o, n, cg0, v08, (h07)d30);
    }
    
    public static final JsonElement m0(final n48 n48, final String s, final String s2) {
        return n48.c(s, (JsonElement)jrc.c(s2));
    }
    
    public static Object n(final cgr cgr) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            en9.q("Must not be called on the main application thread");
            return null;
        }
        final Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals((Object)myLooper.getThread().getName(), (Object)"GoogleApiHandler")) {
            en9.q("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        ao2.A(cgr, "Task must not be null");
        if (cgr.j()) {
            return M0(cgr);
        }
        final gfk gfk = new gfk((byte)14);
        final bfq b = rcn.b;
        cgr.e((Executor)b, (a9g)gfk);
        cgr.d((Executor)b, (o8g)gfk);
        cgr.b.e((zer)new y2r((Executor)b, (g8g)gfk));
        cgr.p();
        ((CountDownLatch)gfk.v).await();
        return M0(cgr);
    }
    
    public static final KSerializer n0(final vee vee, final Class clazz, final List list) {
        final KSerializer[] array = (KSerializer[])((Collection)list).toArray((Object[])new KSerializer[0]);
        final KSerializer t = o50.t(clazz, (KSerializer[])Arrays.copyOf((Object[])array, array.length));
        if (t != null) {
            return t;
        }
        final us4 a = v4j.a(clazz);
        final KSerializer kSerializer = (KSerializer)roh.a.get((Object)a);
        if (kSerializer == null) {
            KSerializer v;
            if ((v = vee.v((rtc)a, list)) == null) {
                if (clazz.isInterface()) {
                    return (KSerializer)new nfh((rtc)v4j.a(clazz));
                }
                v = null;
            }
            return v;
        }
        return kSerializer;
    }
    
    public static Object o(final cgr cgr, final long n) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            en9.q("Must not be called on the main application thread");
            return null;
        }
        final Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals((Object)myLooper.getThread().getName(), (Object)"GoogleApiHandler")) {
            en9.q("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        ao2.A(cgr, "Task must not be null");
        final TimeUnit seconds = TimeUnit.SECONDS;
        ao2.A(seconds, "TimeUnit must not be null");
        if (cgr.j()) {
            return M0(cgr);
        }
        final gfk gfk = new gfk((byte)14);
        final bfq b = rcn.b;
        cgr.e((Executor)b, (a9g)gfk);
        cgr.d((Executor)b, (o8g)gfk);
        cgr.b.e((zer)new y2r((Executor)b, (g8g)gfk));
        cgr.p();
        if (((CountDownLatch)gfk.v).await(n, seconds)) {
            return M0(cgr);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
    
    public static final dlb o0(final gva gva) {
        final odk odk = (odk)gva.j((sei)ii8.a);
        final boolean h = gva.h((Object)odk);
        final Object r = gva.R();
        Object o;
        if (h || (o = r) == bi6.a) {
            o = new g64(odk, (byte)3);
            gva.q0(o);
        }
        return (dlb)rhc.S(v4j.a((Class)dlb.class), tsf.E(v4j.a((Class)dlb.class)), (lta)o, gva);
    }
    
    public static ija p(final ija ija, int n) {
        if (n < 0 && n != -2 && n != -1) {
            oyl.g((Object)smk.p(n, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        int n2;
        if (n == -1) {
            n = 0;
            n2 = 2;
        }
        else {
            n2 = 1;
        }
        if (ija instanceof oua) {
            return oua.b((oua)ija, (hc7)null, n, n2, 1);
        }
        return (ija)new gf3(ija, (hc7)null, n, n2, 2);
    }
    
    public static final Object[] p0(final int n, final Object[] array) {
        final Object[] array2 = new Object[array.length - 2];
        iw0.O0(0, n, 6, array, array2);
        iw0.K0(n, n + 2, array.length, array, array2);
        return array2;
    }
    
    public static cgr q(final Executor executor, final Callable callable) {
        ao2.A(executor, "Executor must not be null");
        final cgr cgr = new cgr();
        executor.execute((Runnable)new o98((Object)cgr, (Object)callable, false, (byte)13));
        return cgr;
    }
    
    public static final Object[] q0(final int n, final Object[] array) {
        final Object[] array2 = new Object[array.length - 1];
        iw0.O0(0, n, 6, array, array2);
        iw0.K0(n, n + 1, array.length, array, array2);
        return array2;
    }
    
    public static final n13 r(final ija ija) {
        if (ija instanceof n13) {
            return (n13)ija;
        }
        return (n13)new p13(ija);
    }
    
    public static final boolean r0(final s3f s3f, final boolean b) {
        if (Q(s3f)) {
            if (b) {
                final int z = xc2.z(x(s3f));
                if (z == -1) {
                    return false;
                }
                if (z != 0 && z != 1) {
                    if (z == 2 || z == 3) {
                        return false;
                    }
                    if (z == 4) {
                        return false;
                    }
                    en9.r();
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static void s(final Type type) {
        if (type instanceof Class) {
            if (((Class)type).isPrimitive()) {
                fvd.w();
            }
        }
    }
    
    public static Type s0(Type type, final Class clazz, Type ownerType) {
        while (true) {
            final boolean b = ownerType instanceof TypeVariable;
            int i = 0;
            int j = 0;
            if (b) {
                final TypeVariable typeVariable = (TypeVariable)ownerType;
                final GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                Class clazz2;
                if (genericDeclaration instanceof Class) {
                    clazz2 = (Class)genericDeclaration;
                }
                else {
                    clazz2 = null;
                }
                Label_0122: {
                    if (clazz2 != null) {
                        final Type p3 = P(type, clazz, clazz2);
                        if (p3 instanceof ParameterizedType) {
                            for (TypeVariable[] typeParameters = clazz2.getTypeParameters(); j < typeParameters.length; ++j) {
                                if (typeVariable.equals(typeParameters[j])) {
                                    ownerType = ((ParameterizedType)p3).getActualTypeArguments()[j];
                                    break Label_0122;
                                }
                            }
                            oyl.r();
                            return null;
                        }
                    }
                    ownerType = typeVariable;
                }
                if (ownerType == typeVariable) {
                    return (Type)ownerType;
                }
                continue;
            }
            else {
                if (ownerType instanceof Class) {
                    final Class clazz3 = (Class)ownerType;
                    if (clazz3.isArray()) {
                        final Class componentType = clazz3.getComponentType();
                        type = s0(type, clazz, (Type)componentType);
                        if (componentType == type) {
                            return (Type)clazz3;
                        }
                        return (Type)new a5p(type);
                    }
                }
                if (ownerType instanceof GenericArrayType) {
                    final GenericArrayType genericArrayType = (GenericArrayType)ownerType;
                    final Type genericComponentType = genericArrayType.getGenericComponentType();
                    type = s0(type, clazz, genericComponentType);
                    if (genericComponentType == type) {
                        return (Type)genericArrayType;
                    }
                    return (Type)new a5p(type);
                }
                else {
                    if (!(ownerType instanceof ParameterizedType)) {
                        Object o = ownerType;
                        if (ownerType instanceof WildcardType) {
                            final WildcardType wildcardType = (WildcardType)ownerType;
                            final Type[] lowerBounds = wildcardType.getLowerBounds();
                            final Type[] upperBounds = wildcardType.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                type = s0(type, clazz, lowerBounds[0]);
                                o = wildcardType;
                                if (type != lowerBounds[0]) {
                                    return (Type)new c5p(new Type[] { (Type)Object.class }, new Type[] { type });
                                }
                            }
                            else {
                                o = wildcardType;
                                if (upperBounds.length == 1) {
                                    type = s0(type, clazz, upperBounds[0]);
                                    o = wildcardType;
                                    if (type != upperBounds[0]) {
                                        return (Type)new c5p(new Type[] { type }, ri2.i);
                                    }
                                }
                            }
                        }
                        return (Type)o;
                    }
                    final ParameterizedType parameterizedType = (ParameterizedType)ownerType;
                    ownerType = parameterizedType.getOwnerType();
                    final Type s0 = s0(type, clazz, (Type)ownerType);
                    int n;
                    if (s0 != ownerType) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    Type[] actualTypeArguments;
                    int n2;
                    Type[] array;
                    for (actualTypeArguments = parameterizedType.getActualTypeArguments(); i < actualTypeArguments.length; ++i, n = n2, actualTypeArguments = array) {
                        final Type s2 = s0(type, clazz, actualTypeArguments[i]);
                        n2 = n;
                        array = actualTypeArguments;
                        if (s2 != actualTypeArguments[i]) {
                            n2 = n;
                            array = actualTypeArguments;
                            if (n == 0) {
                                array = actualTypeArguments.clone();
                                n2 = 1;
                            }
                            array[i] = s2;
                        }
                    }
                    if (n != 0) {
                        return (Type)new b5p(s0, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return (Type)parameterizedType;
                }
            }
        }
    }
    
    public static final String t(final String s, final String s2) {
        return lmf.t("Claude ", s, "/1.260911.19 (Android ", s2, ") Claude/1.260911.19");
    }
    
    public static final Object t0(final jta jta, final zta zta, final h07 h07) {
        Object o = null;
        Label_0052: {
            if (h07 instanceof z20) {
                final z20 z20 = (z20)h07;
                final int w = z20.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    z20.w = w + Integer.MIN_VALUE;
                    o = z20;
                    break Label_0052;
                }
            }
            o = new z20(h07);
        }
        final Object v = ((z20)o).v;
        final int w2 = ((z20)o).w;
        Label_0088: {
            if (w2 == 0) {
                break Label_0088;
            }
            Label_0080: {
                if (w2 != 1) {
                    break Label_0080;
                }
                try {
                    vt4.g0(v);
                    Label_0131: {
                        return lqo.a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                    vt4.g0(v);
                    final b0 b0 = new b0((Object)jta, (Object)zta, (f07)null, (byte)8);
                    ((z20)o).w = 1;
                    final Object m = ien.m((f07)o, (zta)b0);
                    final pc7 v2 = pc7.v;
                    iftrue(Label_0131:)(m != v2);
                    return v2;
                }
                catch (final AnchoredDragFinishedSignal anchoredDragFinishedSignal) {
                    return lqo.a;
                }
            }
        }
    }
    
    public static final int u(final b3k b3k, String n) {
        final int columnCount = b3k.getColumnCount();
        final int n2 = 0;
        int i = 0;
        while (true) {
            while (i < columnCount) {
                if (n.equals(b3k.getColumnName(i))) {
                    if (i >= 0) {
                        return i;
                    }
                    n = smk.n('`', "`", n);
                    final int columnCount2 = b3k.getColumnCount();
                    int j = n2;
                    while (true) {
                        while (j < columnCount2) {
                            if (n.equals(b3k.getColumnName(j))) {
                                if (j >= 0) {
                                    return j;
                                }
                                return -1;
                            }
                            else {
                                ++j;
                            }
                        }
                        j = -1;
                        continue;
                    }
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    public static final long u0(final long n, long n2, final pz8 pz8) {
        final long u = lz8.u(n2, pz8);
        if ((n - 1L | 0x1L) == Long.MAX_VALUE) {
            if (lz8.o(n2) && (n ^ u) < 0L) {
                en9.s("Summing infinities of different signs");
                return 0L;
            }
            return n;
        }
        else if ((u - 1L | 0x1L) == Long.MAX_VALUE) {
            long n3;
            if (((int)n2 & 0x1) == 0x0) {
                n3 = A((n2 >> 1) / 2L);
            }
            else if (lz8.o(n2)) {
                n3 = lz8.s(Integer.signum(2), n2);
            }
            else {
                final long n4 = n2 >> 1;
                final long n5 = n4 / 2L;
                if (-4611686018426L <= n5 && n5 < 4611686018427L) {
                    n3 = A(n5 * 1000000L + (n4 - n5 * 2L) * 1000000L / 2L);
                }
                else {
                    n3 = y(n5);
                }
            }
            final long u2 = lz8.u(n3, pz8);
            if ((0x1L | u2 - 1L) == Long.MAX_VALUE) {
                return u2;
            }
            return u0(u0(n, n3, pz8), lz8.q(n2, n3), pz8);
        }
        else {
            n2 = n + u;
            if (((u ^ n2) & (n ^ n2)) >= 0L) {
                return n2;
            }
            if (n < 0L) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }
    
    public static final Object v(final b48 b48, final float n, float f, final lta lta, final jta jta) {
        if (Float.isNaN(n)) {
            en9.s("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        final float abs = Math.abs(f);
        final int n2 = 0;
        final boolean b49 = abs > 0.0f;
        final boolean b50 = b49 && f > 0.0f;
        if (!b49) {
            final Object a = b48.a(n);
            a.getClass();
            return a;
        }
        if (Math.abs(f) >= Math.abs(((Number)jta.a()).floatValue())) {
            final Object b51 = b48.b(n, b50);
            b51.getClass();
            return b51;
        }
        final Object b52 = b48.b(n, false);
        b52.getClass();
        final float f2 = b48.f(b52);
        final Object b53 = b48.b(n, true);
        b53.getClass();
        f = b48.f(b53);
        final float abs2 = Math.abs(((Number)lta.b(Math.abs(f2 - f))).floatValue());
        if (b50) {
            f = f2;
        }
        int n3 = n2;
        if (Math.abs(f - n) >= abs2) {
            n3 = 1;
        }
        if (n3 == 1) {
            if (b50) {
                return b53;
            }
        }
        else {
            if (n3 != 0) {
                en9.r();
                return null;
            }
            if (!b50) {
                return b53;
            }
        }
        return b52;
    }
    
    public static final long v0(final long n, final long n2, final pz8 pz8) {
        final long n3 = n - n2;
        if (((n3 ^ n) & ~(n3 ^ n2)) >= 0L) {
            return F0(n3, pz8);
        }
        final pz8 y = pz8.y;
        if (((Enum)pz8).compareTo((Enum)y) < 0) {
            final long convert = pz8.v.convert(1L, TimeUnit.MILLISECONDS);
            final long n4 = n / convert;
            final long n5 = n2 / convert;
            final awp w = lz8.w;
            return lz8.r(F0(n4 - n5, y), F0(n % convert - n2 % convert, pz8));
        }
        return lz8.x(X(n3));
    }
    
    public static bnf w() {
        return (bnf)new ksg((Object)lqo.a, (q8m)cib.A);
    }
    
    public static final long w0(final long n, final long n2, final pz8 pz8) {
        if ((n2 - 1L | 0x1L) == Long.MAX_VALUE) {
            if (n == n2) {
                final awp w = lz8.w;
                return 0L;
            }
            return lz8.x(X(n2));
        }
        else {
            if ((0x1L | n - 1L) == Long.MAX_VALUE) {
                return X(n);
            }
            return v0(n, n2, pz8);
        }
    }
    
    public static final flq x(final s3f s3f) {
        if (mlc.q(s3f, r3f.a)) {
            return (flq)fg2.c;
        }
        if (mlc.q(s3f, i3f.a)) {
            return (flq)bg2.c;
        }
        if (mlc.q(s3f, o3f.a)) {
            return (flq)dg2.c;
        }
        if (s3f instanceof q3f) {
            final q3f q3f = (q3f)s3f;
            return (flq)new eg2(q3f.b(), q3f.a());
        }
        if (s3f instanceof n3f) {
            final n3f n3f = (n3f)s3f;
            return (flq)new cg2(n3f.d(), n3f.b(), n3f.g(), n3f.f(), n3f.c(), n3f.e(), n3f.a());
        }
        if (!mlc.q(s3f, k3f.a) && !mlc.q(s3f, p3f.a) && !mlc.q(s3f, j3f.a) && !mlc.q(s3f, m3f.a) && !mlc.q(s3f, h3f.a) && !(s3f instanceof l3f)) {
            if (s3f != null) {
                en9.r();
            }
        }
        return null;
    }
    
    public static final KSerializer x0(final vee vee, final Type type) {
        final KSerializer y0 = y0(vee, type, true);
        if (y0 != null) {
            return y0;
        }
        throw new IllegalArgumentException(o50.R((rtc)v4j.a(l0(type))));
    }
    
    public static final long y(final long n) {
        lz8.w.getClass();
        final int a = nz8.a;
        return (n << 1) + 1L;
    }
    
    public static final KSerializer y0(final vee vee, Type type, final boolean b) {
        if (type instanceof GenericArrayType) {
            final Type type2 = type = ((GenericArrayType)type).getGenericComponentType();
            if (type2 instanceof WildcardType) {
                final Type[] upperBounds = ((WildcardType)type2).getUpperBounds();
                upperBounds.getClass();
                type = (Type)iw0.X0((Object[])upperBounds);
            }
            type.getClass();
            KSerializer kSerializer;
            if (b) {
                kSerializer = x0(vee, type);
            }
            else if ((kSerializer = y0(vee, type, false)) == null) {
                return null;
            }
            Object a;
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType)type).getRawType();
                type.getClass();
                a = v4j.a((Class)type);
            }
            else {
                if (!(type instanceof rtc)) {
                    uy8.o((Object)v4j.a((Class)type.getClass()), "unsupported type in GenericArray: ");
                    return null;
                }
                a = type;
            }
            ((us4)a).getClass();
            return (KSerializer)new e4j((rtc)a, kSerializer);
        }
        if (type instanceof Class) {
            final Class clazz = (Class)type;
            if (clazz.isArray() && !clazz.getComponentType().isPrimitive()) {
                final Class componentType = clazz.getComponentType();
                componentType.getClass();
                KSerializer kSerializer2;
                if (b) {
                    kSerializer2 = x0(vee, (Type)componentType);
                }
                else if ((kSerializer2 = y0(vee, (Type)componentType, false)) == null) {
                    return null;
                }
                return (KSerializer)new e4j((rtc)v4j.a((Class)componentType), kSerializer2);
            }
            return n0(vee, clazz, (List)r89.v);
        }
        else if (type instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final Type rawType = parameterizedType.getRawType();
            rawType.getClass();
            final Class cls = (Class)rawType;
            final Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            actualTypeArguments.getClass();
            Iterable iterable;
            if (b) {
                final ArrayList list = new ArrayList(actualTypeArguments.length);
                final int length = actualTypeArguments.length;
                int n = 0;
                while (true) {
                    iterable = (Iterable)list;
                    if (n >= length) {
                        break;
                    }
                    type = actualTypeArguments[n];
                    type.getClass();
                    list.add((Object)x0(vee, type));
                    ++n;
                }
            }
            else {
                final ArrayList list2 = new ArrayList(actualTypeArguments.length);
                final int length2 = actualTypeArguments.length;
                int n2 = 0;
                while (true) {
                    iterable = (Iterable)list2;
                    if (n2 >= length2) {
                        break;
                    }
                    type = actualTypeArguments[n2];
                    type.getClass();
                    final KSerializer y0 = y0(vee, type, false);
                    if (y0 == null) {
                        return null;
                    }
                    list2.add((Object)y0);
                    ++n2;
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                return (KSerializer)new uv0((KSerializer)((List)iterable).get(0), (byte)1);
            }
            if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                return (KSerializer)new uv0((KSerializer)((List)iterable).get(0), (byte)0);
            }
            if (Map.class.isAssignableFrom(cls)) {
                return (KSerializer)new afd((KSerializer)((List)iterable).get(0), (KSerializer)((List)iterable).get(1));
            }
            if (Map$Entry.class.isAssignableFrom(cls)) {
                return (KSerializer)new p3e((KSerializer)((List)iterable).get(0), (KSerializer)((List)iterable).get(1), (byte)0);
            }
            if (yog.class.isAssignableFrom(cls)) {
                return (KSerializer)new p3e((KSerializer)((List)iterable).get(0), (KSerializer)((List)iterable).get(1), (byte)1);
            }
            if (cio.class.isAssignableFrom(cls)) {
                return (KSerializer)new dio((KSerializer)((List)iterable).get(0), (KSerializer)((List)iterable).get(1), (KSerializer)((List)iterable).get(2));
            }
            final ArrayList list3 = new ArrayList(d86.p0(iterable, 10));
            for (final KSerializer kSerializer3 : iterable) {
                kSerializer3.getClass();
                list3.add((Object)kSerializer3);
            }
            return n0(vee, cls, (List)list3);
        }
        else {
            if (type instanceof WildcardType) {
                final Type[] upperBounds2 = ((WildcardType)type).getUpperBounds();
                upperBounds2.getClass();
                final Object x0 = iw0.X0((Object[])upperBounds2);
                x0.getClass();
                return y0(vee, (Type)x0, true);
            }
            final StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb.append((Object)type);
            oyl.p(sb, (Object)" has type ", (Object)v4j.a((Class)type.getClass()));
            return null;
        }
        return null;
    }
    
    public static final long z(final long n) {
        if (-4611686018426L <= n && n < 4611686018427L) {
            return A(n * 1000000L);
        }
        return y(ncq.q(n, -4611686018427387903L, 4611686018427387903L));
    }
    
    public static p7m z0() {
        return new p7m(0);
    }
}
