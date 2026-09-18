package com.squareup.wire;

import java.io.OutputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.List;
import java.time.Instant;
import java.time.Duration;

public abstract class ProtoAdapter<E>
{
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<is2> BYTES;
    public static final ProtoAdapter<is2> BYTES_VALUE;
    public static final jdi Companion;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<double[]> DOUBLE_ARRAY;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<lqo> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<int[]> FIXED32_ARRAY;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<long[]> FIXED64_ARRAY;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<float[]> FLOAT_ARRAY;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<int[]> INT32_ARRAY;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<long[]> INT64_ARRAY;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<int[]> SFIXED32_ARRAY;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<long[]> SFIXED64_ARRAY;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<int[]> SINT32_ARRAY;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<long[]> SINT64_ARRAY;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<int[]> UINT32_ARRAY;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<long[]> UINT64_ARRAY;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final s8a fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final String sourceFile;
    private final m7n syntax;
    private final rtc type;
    private final String typeUrl;
    
    static {
        Companion = (jdi)new Object();
        final us4 a = v4j.a(Boolean.TYPE);
        final Boolean booleanFalse = Boolean.FALSE;
        final s8a w = s8a.w;
        final m7n w2 = m7n.w;
        final ProtoAdapter<Boolean> protoAdapter = BOOL = (ProtoAdapter)new nr8(w, (rtc)a, (String)null, w2, (Object)false, 32, (byte)2);
        final Class type = Integer.TYPE;
        final us4 a2 = v4j.a(type);
        final Integer value = 0;
        final ProtoAdapter<Integer> protoAdapter2 = INT32 = (ProtoAdapter)new nr8(w, (rtc)a2, (String)null, w2, (Object)value, 32, (byte)9);
        INT32_ARRAY = (ProtoAdapter)new jgc((ProtoAdapter)protoAdapter2, (byte)0);
        final ProtoAdapter<Integer> protoAdapter3 = UINT32 = (ProtoAdapter)new nr8(w, (rtc)v4j.a(type), (String)null, w2, (Object)value, 32, (byte)18);
        UINT32_ARRAY = (ProtoAdapter)new jgc((ProtoAdapter)protoAdapter3, (byte)0);
        SINT32_ARRAY = (ProtoAdapter)new jgc(SINT32 = (ProtoAdapter)new nr8(w, (rtc)v4j.a(type), (String)null, w2, (Object)value, 32, (byte)11), (byte)0);
        final us4 a3 = v4j.a(type);
        final s8a z = s8a.z;
        FIXED32_ARRAY = (ProtoAdapter)new jgc(FIXED32 = (ProtoAdapter)new nr8(z, (rtc)a3, (String)null, w2, (Object)value, 32, (byte)6), (byte)0);
        SFIXED32_ARRAY = (ProtoAdapter)new jgc(SFIXED32 = (ProtoAdapter)new nr8(z, (rtc)v4j.a(type), (String)null, w2, (Object)value, 32, (byte)6), (byte)0);
        final Class type2 = Long.TYPE;
        final us4 a4 = v4j.a(type2);
        final Long value2 = 0L;
        final ProtoAdapter<Long> protoAdapter4 = INT64 = (ProtoAdapter)new nr8(w, (rtc)a4, (String)null, w2, (Object)value2, 32, (byte)10);
        INT64_ARRAY = (ProtoAdapter)new jgc((ProtoAdapter)protoAdapter4, (byte)1);
        final ProtoAdapter<Long> protoAdapter5 = UINT64 = (ProtoAdapter)new nr8(w, (rtc)v4j.a(type2), (String)null, w2, (Object)value2, 32, (byte)19);
        UINT64_ARRAY = (ProtoAdapter)new jgc((ProtoAdapter)protoAdapter5, (byte)1);
        SINT64_ARRAY = (ProtoAdapter)new jgc(SINT64 = (ProtoAdapter)new nr8(w, (rtc)v4j.a(type2), (String)null, w2, (Object)value2, 32, (byte)12), (byte)1);
        final us4 a5 = v4j.a(type2);
        final s8a x = s8a.x;
        FIXED64_ARRAY = (ProtoAdapter)new jgc(FIXED64 = (ProtoAdapter)new nr8(x, (rtc)a5, (String)null, w2, (Object)value2, 32, (byte)7), (byte)1);
        SFIXED64_ARRAY = (ProtoAdapter)new jgc(SFIXED64 = (ProtoAdapter)new nr8(x, (rtc)v4j.a(type2), (String)null, w2, (Object)value2, 32, (byte)7), (byte)1);
        final ProtoAdapter<Float> protoAdapter6 = FLOAT = (ProtoAdapter)new nr8(z, (rtc)v4j.a(Float.TYPE), (String)null, w2, (Object)0.0f, 32, (byte)1);
        FLOAT_ARRAY = (ProtoAdapter)new hr8((nr8)protoAdapter6, (byte)0);
        final ProtoAdapter<Double> protoAdapter7 = DOUBLE = (ProtoAdapter)new nr8(x, (rtc)v4j.a(Double.TYPE), (String)null, w2, (Object)0.0, 32, (byte)0);
        DOUBLE_ARRAY = (ProtoAdapter)new hr8((nr8)protoAdapter7);
        final us4 a6 = v4j.a((Class)is2.class);
        final s8a y = s8a.y;
        final ProtoAdapter<is2> protoAdapter8 = BYTES = (ProtoAdapter)new nr8(y, (rtc)a6, (String)null, w2, (Object)is2.y, 32, (byte)3);
        final ProtoAdapter<String> protoAdapter9 = STRING = (ProtoAdapter)new nr8(y, (rtc)v4j.a((Class)String.class), (String)null, w2, (Object)"", 32, (byte)13);
        final us4 a7 = v4j.a((Class)lqo.class);
        final m7n x2 = m7n.x;
        EMPTY = (ProtoAdapter)new nr8(y, (rtc)a7, "type.googleapis.com/google.protobuf.Empty", x2, (Object)null, 48, (byte)5);
        STRUCT_MAP = (ProtoAdapter)new nr8(y, (rtc)v4j.a((Class)Map.class), "type.googleapis.com/google.protobuf.Struct", x2, (Object)null, 48, (byte)15);
        STRUCT_LIST = (ProtoAdapter)new nr8(y, (rtc)v4j.a((Class)Map.class), "type.googleapis.com/google.protobuf.ListValue", x2, (Object)null, 48, (byte)14);
        STRUCT_NULL = (ProtoAdapter)new nr8(w, (rtc)v4j.a((Class)Void.class), "type.googleapis.com/google.protobuf.NullValue", x2, (Object)null, 48, (byte)16);
        STRUCT_VALUE = (ProtoAdapter)new nr8(y, (rtc)v4j.a((Class)Object.class), "type.googleapis.com/google.protobuf.Value", x2, (Object)null, 48, (byte)17);
        DOUBLE_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter7, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter6, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter4, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter5, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter2, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter3, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter9, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = (ProtoAdapter)twl.n((ProtoAdapter)protoAdapter8, "type.googleapis.com/google.protobuf.BytesValue");
        Object duration;
        try {
            duration = new nr8(y, (rtc)v4j.a((Class)Duration.class), "type.googleapis.com/google.protobuf.Duration", x2, (Object)null, 48, (byte)4);
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            duration = new idi();
        }
        DURATION = (ProtoAdapter)duration;
        Object instant;
        try {
            instant = new nr8(y, (rtc)v4j.a((Class)Instant.class), "type.googleapis.com/google.protobuf.Timestamp", x2, (Object)null, 48, (byte)8);
        }
        catch (final NoClassDefFoundError noClassDefFoundError2) {
            instant = new idi();
        }
        INSTANT = (ProtoAdapter)instant;
    }
    
    public ProtoAdapter(final s8a fieldEncoding, final rtc type, final String typeUrl, final m7n syntax, final Object identity, final String sourceFile) {
        this.fieldEncoding = fieldEncoding;
        this.type = type;
        this.typeUrl = typeUrl;
        this.syntax = syntax;
        this.identity = (E)identity;
        this.sourceFile = sourceFile;
        final boolean b = this instanceof xmg;
        final ProtoAdapter<List<E>> protoAdapter = null;
        Object packedAdapter = null;
        Label_0102: {
            if (!b) {
                if (!(this instanceof sbj)) {
                    final s8a y = s8a.y;
                    if (fieldEncoding != y) {
                        if (this.getFieldEncoding$wire_runtime() != y) {
                            packedAdapter = new xmg(this);
                            break Label_0102;
                        }
                        en9.s("Unable to pack a length-delimited type.");
                        throw null;
                    }
                }
            }
            packedAdapter = null;
        }
        this.packedAdapter = (ProtoAdapter<List<E>>)packedAdapter;
        Object repeatedAdapter = protoAdapter;
        if (!(this instanceof sbj)) {
            if (b) {
                repeatedAdapter = protoAdapter;
            }
            else {
                repeatedAdapter = new sbj(this);
            }
        }
        this.repeatedAdapter = (ProtoAdapter<List<E>>)repeatedAdapter;
    }
    
    public static final <M extends a> ProtoAdapter<M> get(final M m) {
        final jdi companion = ProtoAdapter.Companion;
        final Class<? extends a> class1 = m.getClass();
        companion.getClass();
        return jdi.a((Class)class1);
    }
    
    public static final <M> ProtoAdapter<M> get(final Class<M> clazz) {
        ProtoAdapter.Companion.getClass();
        return jdi.a((Class)clazz);
    }
    
    public static final ProtoAdapter<?> get(final String s) {
        ProtoAdapter.Companion.getClass();
        return jdi.b(s, ProtoAdapter.class.getClassLoader());
    }
    
    public static final ProtoAdapter<?> get(final String s, final ClassLoader classLoader) {
        ProtoAdapter.Companion.getClass();
        return jdi.b(s, classLoader);
    }
    
    public static final <E extends e3q> pd9 newEnumAdapter(final Class<E> clazz) {
        ProtoAdapter.Companion.getClass();
        return (pd9)new q2k((Class)clazz);
    }
    
    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(final ProtoAdapter<K> protoAdapter, final ProtoAdapter<V> protoAdapter2) {
        ProtoAdapter.Companion.getClass();
        return (ProtoAdapter<Map<K, V>>)new w4e((ProtoAdapter)protoAdapter, (ProtoAdapter)protoAdapter2);
    }
    
    public static final <M extends a, B extends j1f> ProtoAdapter<M> newMessageAdapter(final Class<M> clazz) {
        ProtoAdapter.Companion.getClass();
        return (ProtoAdapter<M>)lq6.D((Class)clazz, (String)null, m7n.w, (ClassLoader)null, 56);
    }
    
    public static final <M extends a, B extends j1f> ProtoAdapter<M> newMessageAdapter(final Class<M> clazz, final String s) {
        ProtoAdapter.Companion.getClass();
        return (ProtoAdapter<M>)lq6.D((Class)clazz, s, m7n.w, (ClassLoader)null, 56);
    }
    
    public static final <M extends a, B extends j1f> ProtoAdapter<M> newMessageAdapter(final Class<M> clazz, final String s, final m7n m7n) {
        ProtoAdapter.Companion.getClass();
        return (ProtoAdapter<M>)lq6.D((Class)clazz, s, m7n, (ClassLoader)null, 56);
    }
    
    public static final <M extends a, B extends j1f> ProtoAdapter<M> newMessageAdapter(final Class<M> clazz, final String s, final m7n m7n, final ClassLoader classLoader) {
        ProtoAdapter.Companion.getClass();
        return (ProtoAdapter<M>)lq6.D((Class)clazz, s, m7n, classLoader, 48);
    }
    
    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == s8a.y) {
            en9.s("Unable to pack a length-delimited type.");
            return null;
        }
        final ProtoAdapter<List<E>> packedAdapter = this.packedAdapter;
        if (packedAdapter != null) {
            return packedAdapter;
        }
        oyl.s("Can't create a packed adapter from a packed or repeated adapter.");
        return null;
    }
    
    public final ProtoAdapter<List<E>> asRepeated() {
        final ProtoAdapter<List<E>> repeatedAdapter = this.repeatedAdapter;
        if (repeatedAdapter != null) {
            return repeatedAdapter;
        }
        oyl.s("Can't create a repeated adapter from a repeated or packed adapter.");
        return null;
    }
    
    public final E decode(final is2 is2) {
        return this.decode((sdi)m6r.f(is2));
    }
    
    public final E decode(final InputStream inputStream) {
        return this.decode((qn2)new zsi((nam)zn2.Q(inputStream)));
    }
    
    public final E decode(final qn2 qn2) {
        return (E)this.decode(new udi(qn2));
    }
    
    public E decode(final sdi sdi) {
        return (E)this.decode((udi)((kr2)sdi).c());
    }
    
    public abstract Object decode(final udi p0);
    
    public final E decode(final byte[] array) {
        return this.decode((sdi)m6r.g(array));
    }
    
    public final void encode(final OutputStream outputStream, final E e) {
        final ljg ljg = new ljg(outputStream, (jzn)new Object());
        final xsi xsi = new xsi((vzl)ljg);
        this.encode((pn2)xsi, e);
        if (!xsi.x) {
            final an2 w = xsi.w;
            final long w2 = w.w;
            if (w2 > 0L) {
                ljg.S0(w, w2);
            }
            return;
        }
        en9.q("closed");
    }
    
    public final void encode(final pn2 pn2, final E e) {
        final sqj sqj = new sqj();
        this.encode(sqj, e);
        sqj.a();
        pn2.R((nam)sqj.a);
    }
    
    public void encode(final sqj sqj, final Object o) {
        new kdi((Object)this, o, (byte)0).b((Object)sqj.g.getValue());
        final an2 an2 = (an2)sqj.f.getValue();
        sqj.d(an2.u(an2.w));
    }
    
    public abstract void encode(final vdi p0, final Object p1);
    
    public final byte[] encode(final E e) {
        final Object o = new Object();
        this.encode((pn2)o, e);
        return ((an2)o).Z(((an2)o).w);
    }
    
    public final is2 encodeByteString(final E e) {
        final Object o = new Object();
        this.encode((pn2)o, e);
        return ((an2)o).u(((an2)o).w);
    }
    
    public void encodeWithTag(final sqj sqj, final int n, final E e) {
        if (e != null) {
            if (this.getFieldEncoding$wire_runtime() == s8a.y) {
                final int b = sqj.b();
                this.encode(sqj, e);
                sqj.g(sqj.b() - b);
            }
            else {
                this.encode(sqj, e);
            }
            sqj.g(q6r.p(n, this.getFieldEncoding$wire_runtime()));
        }
    }
    
    public void encodeWithTag(final vdi vdi, final int n, final E e) {
        if (e != null) {
            vdi.f(n, this.getFieldEncoding$wire_runtime());
            if (this.getFieldEncoding$wire_runtime() == s8a.y) {
                vdi.g(this.encodedSize(e));
            }
            this.encode(vdi, e);
        }
    }
    
    public abstract int encodedSize(final Object p0);
    
    public int encodedSizeWithTag(final int n, final E e) {
        if (e == null) {
            return 0;
        }
        int encodedSize;
        final int n2 = encodedSize = this.encodedSize(e);
        if (this.getFieldEncoding$wire_runtime() == s8a.y) {
            encodedSize = n2 + q6r.t(n2);
        }
        return q6r.s(n) + encodedSize;
    }
    
    public final s8a getFieldEncoding$wire_runtime() {
        return this.fieldEncoding;
    }
    
    public final E getIdentity() {
        return this.identity;
    }
    
    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }
    
    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }
    
    public final String getSourceFile() {
        return this.sourceFile;
    }
    
    public final m7n getSyntax() {
        return this.syntax;
    }
    
    public final rtc getType() {
        return this.type;
    }
    
    public final String getTypeUrl() {
        return this.typeUrl;
    }
    
    public final boolean isStruct$wire_runtime() {
        return this.equals(ProtoAdapter.STRUCT_MAP) || this.equals(ProtoAdapter.STRUCT_LIST) || this.equals(ProtoAdapter.STRUCT_VALUE) || this.equals(ProtoAdapter.STRUCT_NULL);
    }
    
    public abstract Object redact(final Object p0);
    
    public String toString(final E e) {
        return String.valueOf((Object)e);
    }
    
    public final void tryDecode(final sdi sdi, final List<E> list) {
        if (((kr2)sdi).e()) {
            list.add(this.decode(sdi));
        }
    }
    
    public final void tryDecode(final udi udi, final List<E> list) {
        if (udi.d()) {
            list.add(this.decode(udi));
        }
    }
    
    public final ProtoAdapter<?> withLabel$wire_runtime(final g3q g3q) {
        ProtoAdapter<List<E>> repeated = (ProtoAdapter<List<E>>)this;
        if (g3q.a()) {
            if (g3q == g3q.z) {
                return this.asPacked();
            }
            repeated = this.asRepeated();
        }
        return repeated;
    }
}
