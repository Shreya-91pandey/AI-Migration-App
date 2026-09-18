import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.Callable;
import android.util.Base64;
import android.widget.TextView;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.autofill.AutofillId;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.text.method.NumberKeyListener;
import android.text.method.KeyListener;
import android.view.inputmethod.InputMethodManager;
import com.anthropic.claude.api.experience.Experience;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter;
import kotlinx.serialization.KSerializer;
import java.lang.reflect.Type;
import android.media.AudioFormat;
import android.media.AudioFormat$Builder;
import android.os.Build$VERSION;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import android.text.SpannableString;
import android.text.Spannable;
import com.anthropic.claude.sessions.types.SessionResource;
import androidx.media3.container.ObuParser$NotYetImplementedException;
import java.util.Iterator;
import java.util.Map;
import com.connectrpc.ConnectException;
import java.util.List;
import java.util.Map$Entry;
import java.util.concurrent.Executor;
import android.util.Log;
import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import android.widget.EditText;
import android.view.View;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.ArrayList;
import android.view.ContextThemeWrapper;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.media.MediaCodec$CryptoInfo;
import android.content.Context;
import java.nio.ByteBuffer;

public final class vcc implements e8k, icn, v2k, v43, l7b, p8f, csg, e03, lu7, awi, s79
{
    public static final Object y;
    public static h4q z;
    public final byte v;
    public Object w;
    public Object x;
    
    static {
        y = new Object();
    }
    
    public vcc(final byte v) {
        switch (this.v = v) {
            default: {
                this.w = ByteBuffer.allocateDirect(500);
                return;
            }
            case 16: {
                this.w = new sn9((l1e)new Object());
                this.x = new sn9((l1e)new Object());
            }
        }
    }
    
    public vcc(Context applicationContext, final byte v) {
        switch (this.v = v) {
            default: {
                this.w = applicationContext;
                this.x = new ou0((byte)1);
                return;
            }
            case 24: {
                final cvj x = new cvj((byte)21);
                this.w = applicationContext.getApplicationContext();
                this.x = x;
                return;
            }
            case 22: {
                if (applicationContext == null) {
                    applicationContext = null;
                }
                else {
                    applicationContext = applicationContext.getApplicationContext();
                }
                this.w = applicationContext;
            }
        }
    }
    
    public vcc(final MediaCodec$CryptoInfo w) {
        this.v = 21;
        this.w = w;
        this.x = new MediaCodec$CryptoInfo$Pattern(0, 0);
    }
    
    public vcc(final ContextThemeWrapper contextThemeWrapper) {
        this.v = 25;
        final SharedPreferences sharedPreferences = ((Context)contextThemeWrapper).getSharedPreferences("androidx.emoji2.emojipicker.preferences", 0);
        this.w = sharedPreferences;
        final String string = sharedPreferences.getString("pref_key_recent_emoji", (String)null);
        ArrayList x;
        if (string != null) {
            x = new ArrayList((Collection)kym.m1((CharSequence)string, new String[] { "," }, 0, 6));
        }
        else {
            x = new ArrayList();
        }
        this.x = x;
    }
    
    public vcc(final View w) {
        this.v = 0;
        this.w = w;
        this.x = ncq.F(3, (jta)new kca((Object)this, (byte)20));
    }
    
    public vcc(final EditText w) {
        this.v = 4;
        this.w = w;
        this.x = new bgq(w);
    }
    
    public vcc(final h7g h7g) {
        this.v = 18;
        this.w = h7g;
        this.x = h7g;
    }
    
    public vcc(final iha w, final SparseArray sparseArray) {
        this.v = 2;
        this.w = w;
        final SparseBooleanArray a = w.a;
        final SparseArray x = new SparseArray(a.size());
        for (int i = 0; i < a.size(); ++i) {
            a2r.q(i, a.size());
            final int key = a.keyAt(i);
            final x10 x2 = (x10)sparseArray.get(key);
            x2.getClass();
            x.append(key, (Object)x2);
        }
        this.x = x;
    }
    
    public vcc(final thb w) {
        this.v = 14;
        this.w = w;
    }
    
    public vcc(final zta w) {
        this.v = 17;
        this.w = w;
        this.x = new ConcurrentHashMap();
    }
    
    public static cgr f(final Context context, final Intent intent, final boolean b) {
        Log.isLoggable("FirebaseMessaging", 3);
        final Object y;
        monitorenter(y = vcc.y);
        Label_0051: {
            try {
                h4q z;
                if ((z = vcc.z) == null) {
                    z = (vcc.z = new h4q(context));
                }
                break Label_0051;
            }
            finally {
                monitorexit(y);
                final h4q z;
                Label_0150: {
                    while (true) {
                        while (true) {
                            final Object c;
                            monitorenter(c = n2r.c);
                            Label_0116: {
                                try {
                                    n2r.j(context);
                                    final boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                                    if (!booleanExtra) {
                                        n2r.d.a();
                                    }
                                    break Label_0116;
                                }
                                finally {
                                    monitorexit(c);
                                    z.b(intent).a((h8g)new uxa((Object)intent, (byte)15));
                                    monitorexit(c);
                                    return ri2.I((Object)(-1));
                                }
                            }
                            break Label_0150;
                            Label_0164: {
                                return z.b(intent).f((Executor)new ou0((byte)1), (g07)new pv9((byte)3));
                            }
                            iftrue(Label_0150:)(!c2l.B().F(context));
                            continue;
                        }
                        monitorexit(y);
                        iftrue(Label_0164:)(!b);
                        continue;
                    }
                }
                z.b(intent);
                return ri2.I((Object)(-1));
            }
        }
    }
    
    public ap1 A(upo upo, final vx7 vx7) {
        final rej rej = new rej();
        for (final Map$Entry map$Entry : ((obb)upo).d.entrySet()) {
            final Iterator iterator2 = ((List)map$Entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                rej.a((String)map$Entry.getKey(), (String)iterator2.next());
            }
        }
        final an2 f = upo.f;
        final String c = rua.c(upo.g);
        Object o;
        if (ao2.Z(c)) {
            o = new gr2((Object)upo, (Object)f, (byte)1);
        }
        else {
            o = null;
        }
        final String string = ((obb)upo).a.toString();
        string.getClass();
        final hpb hpb = new hpb((byte)0);
        hpb.g((ipb)null, string);
        rej.a = hpb.b();
        rej.c(c, (xej)o);
        final dti a = ((h7g)this.w).a(new sej(rej));
        upo = (upo)new ap1((Object)a, (byte)1);
        try {
            a.c((n03)new xr5((Object)a, (Object)vx7, (byte)17));
            return (ap1)upo;
        }
        finally {
            final Object o2 = new Object();
            final Throwable t;
            final ConnectException ex = new ConnectException(b65.y, t.getMessage(), t, (Map)null, 8);
            final s89 v = s89.v;
            vx7.b((Object)new pbb((Integer)null, (Map)v, (qn2)o2, (Map)v, ex));
            return (ap1)upo;
        }
    }
    
    public void B(final ArrayList list) {
        for (int i = 0; i < list.size(); ++i) {
            if (((n5g)list.get(i)).a == 1) {
                final n5g n5g = (n5g)list.get(i);
                Object x;
                try {
                    x = new o5g(n5g);
                }
                catch (final ObuParser$NotYetImplementedException ex) {
                    x = null;
                }
                this.x = x;
            }
        }
    }
    
    public Object a() {
        return this.w;
    }
    
    public Object b(final Object o) {
        return e2r.j((SessionResource)o, (hfc)this.x);
    }
    
    public boolean c(final CharSequence charSequence, final int n, final int n2, final xmo xmo) {
        if ((xmo.c & 0x4) > 0) {
            return true;
        }
        if (this.w == null) {
            Object o;
            if (charSequence instanceof Spannable) {
                o = charSequence;
            }
            else {
                o = new SpannableString(charSequence);
            }
            this.w = new lro((Spannable)o);
        }
        this.x.getClass();
        ((lro)this.w).setSpan((Object)new ymo(xmo), n, n2, 33);
        return true;
    }
    
    public void d(final Request request) {
    }
    
    public mln e(List w) {
        final List list = null;
        Object o = null;
        Object o2 = null;
        Label_0223: {
            try {
                final int size = ((Collection)w).size();
                int i = 0;
                o = null;
                while (i < size) {
                    try {
                        final t19 t19 = (t19)w.get(i);
                        try {
                            t19.a((f29)this.x);
                            ++i;
                            o = t19;
                        }
                        catch (Exception o) {
                            final Throwable t20 = (Throwable)t19;
                            o2 = o;
                            o = t20;
                        }
                    }
                    catch (final Exception o2) {
                        break Label_0223;
                    }
                    break;
                }
                w = (List)this.x;
                w.getClass();
                final og0 og0 = new og0(((f29)w).a.toString());
                w = (List)this.x;
                final long c = rhc.c(((f29)w).b, ((f29)w).c);
                final Object o3 = new dnn(c);
                w = list;
                if (!dnn.h(((mln)this.w).b)) {
                    w = (List)o3;
                }
                long n;
                if (w != null) {
                    n = ((dnn)w).a;
                }
                else {
                    n = rhc.c(dnn.f(c), dnn.g(c));
                }
                w = (List)new mln(og0, n, ((f29)this.x).c());
                return (mln)(this.w = w);
            }
            catch (final Exception o2) {
                o = null;
            }
        }
        final StringBuilder sb = new StringBuilder();
        final int s = ((f29)this.x).a.s();
        final dnn c2 = ((f29)this.x).c();
        final f29 f29 = (f29)this.x;
        final String j = dnn.i(rhc.c(f29.b, f29.c));
        final StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
        sb2.append(s);
        sb2.append(", composition=");
        sb2.append((Object)c2);
        sb2.append(", selection=");
        sb2.append(j);
        sb2.append("):");
        sb.append(sb2.toString());
        sb.append('\n');
        c86.M0(w, sb, new mv5(o, (Object)this, (byte)17), 60);
        throw new RuntimeException(sb.toString(), (Throwable)o2);
    }
    
    public boolean g(final int n) {
        return ((iha)this.w).a.get(n);
    }
    
    public void h() {
        final bnf bnf = (bnf)this.x;
        if (!(boolean)((xom)bnf).getValue()) {
            bnf.setValue(Boolean.TRUE);
            final List a = adn.a;
            adn.b(1);
            ((jta)this.w).a();
        }
    }
    
    public ah1 i(final hqa hqa, final cf1 cf1) {
        hqa.getClass();
        final int l = hqa.L;
        cf1.getClass();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29 && l != -1) {
            final Context context = (Context)this.w;
            final Boolean b = (Boolean)this.x;
            final boolean b2 = false;
            boolean b3 = false;
            boolean c;
            if (b != null) {
                c = b;
            }
            else {
                Boolean b4;
                if (context != null) {
                    final String parameters = xg1.h(context).getParameters("offloadVariableRateSupported");
                    b4 = (parameters != null && parameters.equals((Object)"offloadVariableRateSupported=1"));
                    this.x = b4;
                }
                else {
                    b4 = Boolean.FALSE;
                    this.x = b4;
                }
                c = b4;
            }
            final String p2 = hqa.p;
            p2.getClass();
            final int b5 = o9f.b(p2, hqa.l);
            if (b5 != 0) {
                if (sdk_INT >= z4p.l(b5)) {
                    int channelMask = hqa.K;
                    if (channelMask == -1) {
                        channelMask = z4p.m(hqa.J);
                    }
                    if (channelMask == 0) {
                        return ah1.d;
                    }
                    try {
                        final AudioFormat build = new AudioFormat$Builder().setSampleRate(l).setChannelMask(channelMask).setEncoding(b5).build();
                        if (sdk_INT >= 33) {
                            final int b6 = od.b(build, cf1.a());
                            if ((b6 & 0x1) == 0x0) {
                                return ah1.d;
                            }
                            if ((b6 & 0x3) == 0x3) {
                                b3 = true;
                            }
                            final Object o = new Object();
                            ((zg1)o).a = true;
                            ((zg1)o).b = b3;
                            ((zg1)o).c = c;
                            return ((zg1)o).a();
                        }
                        else if (sdk_INT >= 31) {
                            final int a = dw1.a(build, cf1.a());
                            if (a == 0) {
                                return ah1.d;
                            }
                            final Object o2 = new Object();
                            boolean b7 = b2;
                            if (sdk_INT > 32) {
                                b7 = b2;
                                if (a == 2) {
                                    b7 = true;
                                }
                            }
                            ((zg1)o2).a = true;
                            ((zg1)o2).b = b7;
                            ((zg1)o2).c = c;
                            return ((zg1)o2).a();
                        }
                        else {
                            if (!zp6.t(build, cf1.a())) {
                                return ah1.d;
                            }
                            final Object o3 = new Object();
                            ((zg1)o3).a = true;
                            ((zg1)o3).c = c;
                            return ((zg1)o3).a();
                        }
                    }
                    catch (final IllegalArgumentException ex) {
                        return ah1.d;
                    }
                }
            }
            return ah1.d;
        }
        return ah1.d;
    }
    
    public Type j() {
        return (Type)this.w;
    }
    
    public Object k(final rtc rtc, final ArrayList list) {
        final ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.x;
        final Class z = qt7.z(rtc);
        Object value;
        if ((value = concurrentHashMap.get((Object)z)) == null) {
            value = new bsg();
            final Object putIfAbsent = concurrentHashMap.putIfAbsent((Object)z, value);
            if (putIfAbsent != null) {
                value = putIfAbsent;
            }
        }
        final bsg bsg = (bsg)value;
        final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add((Object)new euc((buc)iterator.next()));
        }
        final ConcurrentHashMap a = bsg.a;
        Object value2;
        if ((value2 = a.get((Object)list2)) == null) {
            jpj jpj = null;
            try {
                final KSerializer kSerializer = (KSerializer)((zta)this.w).d((Object)rtc, (Object)list);
            }
            finally {
                final Throwable t;
                jpj = new jpj(t);
            }
            value2 = new kpj((Object)jpj);
            final Object putIfAbsent2 = a.putIfAbsent((Object)list2, value2);
            if (putIfAbsent2 != null) {
                value2 = putIfAbsent2;
            }
        }
        return ((kpj)value2).v;
    }
    
    public Object l(final f7g f7g) {
        final Executor executor = (Executor)this.x;
        if (executor == null) {
            return f7g;
        }
        return new i38(executor, (c03)f7g);
    }
    
    public t2k m(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        vcc.x:Ljava/lang/Object;
        //     4: checkcast       Luba;
        //     7: astore          6
        //     9: aload           6
        //    11: getfield        uba.d:Ljava/lang/Object;
        //    14: checkcast       Law7;
        //    17: astore          7
        //    19: aload_1        
        //    20: astore          4
        //    22: aload_1        
        //    23: ldc_w           ":memory:"
        //    26: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    29: ifne            52
        //    32: aload           7
        //    34: getfield        aw7.a:Landroid/content/Context;
        //    37: aload_1        
        //    38: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //    41: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    44: astore          4
        //    46: aload           4
        //    48: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    51: pop            
        //    52: aload           6
        //    54: getfield        uba.b:Z
        //    57: istore_3       
        //    58: iconst_1       
        //    59: istore_2       
        //    60: iload_3        
        //    61: ifne            88
        //    64: aload           6
        //    66: getfield        uba.c:Z
        //    69: ifne            88
        //    72: aload           4
        //    74: ldc_w           ":memory:"
        //    77: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    80: ifne            88
        //    83: iconst_1       
        //    84: istore_3       
        //    85: goto            90
        //    88: iconst_0       
        //    89: istore_3       
        //    90: new             Lht9;
        //    93: dup            
        //    94: aload           4
        //    96: iload_3        
        //    97: invokespecial   ht9.<init>:(Ljava/lang/String;Z)V
        //   100: astore_1       
        //   101: aload_1        
        //   102: getfield        ht9.a:Ljava/util/concurrent/locks/ReentrantLock;
        //   105: astore          5
        //   107: aload           5
        //   109: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //   112: aload_1        
        //   113: getfield        ht9.b:Lsn9;
        //   116: astore_1       
        //   117: aload_1        
        //   118: ifnull          134
        //   121: aload_1        
        //   122: invokevirtual   sn9.X:()V
        //   125: goto            134
        //   128: astore_1       
        //   129: iconst_0       
        //   130: istore_2       
        //   131: goto            365
        //   134: aload           6
        //   136: getfield        uba.c:Z
        //   139: ifne            299
        //   142: aload_0        
        //   143: getfield        vcc.w:Ljava/lang/Object;
        //   146: checkcast       Lv2k;
        //   149: aload           4
        //   151: invokeinterface v2k.m:(Ljava/lang/String;)Lt2k;
        //   156: astore          8
        //   158: aload           6
        //   160: getfield        uba.b:Z
        //   163: istore_3       
        //   164: iload_3        
        //   165: ifne            201
        //   168: aload           6
        //   170: iconst_1       
        //   171: putfield        uba.c:Z
        //   174: aload           6
        //   176: aload           8
        //   178: invokevirtual   uba.c:(Lt2k;)V
        //   181: aload           6
        //   183: iconst_0       
        //   184: putfield        uba.c:Z
        //   187: goto            247
        //   190: astore          7
        //   192: aload           6
        //   194: iconst_0       
        //   195: putfield        uba.c:Z
        //   198: aload           7
        //   200: athrow         
        //   201: aload           8
        //   203: invokestatic    uba.b:(Lt2k;)V
        //   206: aload           7
        //   208: getfield        aw7.g:I
        //   211: iconst_3       
        //   212: if_icmpne       226
        //   215: aload           8
        //   217: ldc_w           "PRAGMA synchronous = NORMAL"
        //   220: invokestatic    yi2.t:(Lt2k;Ljava/lang/String;)V
        //   223: goto            234
        //   226: aload           8
        //   228: ldc_w           "PRAGMA synchronous = FULL"
        //   231: invokestatic    yi2.t:(Lt2k;Ljava/lang/String;)V
        //   234: aload           6
        //   236: getfield        uba.e:Ljava/lang/Object;
        //   239: checkcast       Lxuj;
        //   242: aload           8
        //   244: invokevirtual   xuj.d:(Lt2k;)V
        //   247: aload_1        
        //   248: ifnull          291
        //   251: aload_1        
        //   252: getfield        sn9.x:Ljava/lang/Object;
        //   255: checkcast       Ljava/nio/channels/FileChannel;
        //   258: astore          6
        //   260: aload           6
        //   262: ifnonnull       268
        //   265: goto            291
        //   268: aload           6
        //   270: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   273: aload_1        
        //   274: aconst_null    
        //   275: putfield        sn9.x:Ljava/lang/Object;
        //   278: goto            291
        //   281: astore          6
        //   283: aload_1        
        //   284: aconst_null    
        //   285: putfield        sn9.x:Ljava/lang/Object;
        //   288: aload           6
        //   290: athrow         
        //   291: aload           5
        //   293: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   296: aload           8
        //   298: areturn        
        //   299: new             Ljava/lang/IllegalStateException;
        //   302: astore          6
        //   304: aload           6
        //   306: ldc_w           "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"
        //   309: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   312: aload           6
        //   314: athrow         
        //   315: astore          6
        //   317: aload_1        
        //   318: ifnull          361
        //   321: aload_1        
        //   322: getfield        sn9.x:Ljava/lang/Object;
        //   325: checkcast       Ljava/nio/channels/FileChannel;
        //   328: astore          7
        //   330: aload           7
        //   332: ifnonnull       338
        //   335: goto            361
        //   338: aload           7
        //   340: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   343: aload_1        
        //   344: aconst_null    
        //   345: putfield        sn9.x:Ljava/lang/Object;
        //   348: goto            361
        //   351: astore          6
        //   353: aload_1        
        //   354: aconst_null    
        //   355: putfield        sn9.x:Ljava/lang/Object;
        //   358: aload           6
        //   360: athrow         
        //   361: aload           6
        //   363: athrow         
        //   364: astore_1       
        //   365: iload_2        
        //   366: ifeq            375
        //   369: aload_1        
        //   370: athrow         
        //   371: astore_1       
        //   372: goto            424
        //   375: new             Ljava/lang/IllegalStateException;
        //   378: astore          7
        //   380: new             Ljava/lang/StringBuilder;
        //   383: astore          6
        //   385: aload           6
        //   387: ldc_w           "Unable to open database '"
        //   390: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   393: aload           6
        //   395: aload           4
        //   397: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   400: pop            
        //   401: aload           6
        //   403: ldc_w           "'. Was a proper path / name used in Room's database builder?"
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: pop            
        //   410: aload           7
        //   412: aload           6
        //   414: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   417: aload_1        
        //   418: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   421: aload           7
        //   423: athrow         
        //   424: aload           5
        //   426: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   429: aload_1        
        //   430: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  121    125    128    134    Any
        //  134    164    315    364    Any
        //  168    181    190    201    Any
        //  181    187    315    364    Any
        //  192    201    315    364    Any
        //  201    223    315    364    Any
        //  226    234    315    364    Any
        //  234    247    315    364    Any
        //  251    260    364    365    Any
        //  268    273    281    291    Any
        //  273    278    364    365    Any
        //  283    291    364    365    Any
        //  299    315    315    364    Any
        //  321    330    364    365    Any
        //  338    343    351    361    Any
        //  343    348    364    365    Any
        //  353    361    364    365    Any
        //  361    364    364    365    Any
        //  369    371    371    375    Any
        //  375    424    371    375    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0268:
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
    
    public boolean n() {
        return ((v2k)this.w).n();
    }
    
    public void o(final j63 p0, final pv1 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        vcc.v:B
        //     4: tableswitch {
        //               24: 85
        //          default: 24
        //        }
        //    24: aload_0        
        //    25: getfield        vcc.w:Ljava/lang/Object;
        //    28: checkcast       Lo63;
        //    31: astore          9
        //    33: aload           9
        //    35: ifnull          77
        //    38: aload_0        
        //    39: getfield        vcc.x:Ljava/lang/Object;
        //    42: checkcast       Lalf;
        //    45: astore          10
        //    47: aload           10
        //    49: ifnull          69
        //    52: aload_1        
        //    53: ifnonnull       59
        //    56: goto            68
        //    59: aload_2        
        //    60: aload           9
        //    62: aload           10
        //    64: aload_1        
        //    65: invokevirtual   pv1.h:(Lo63;Lalf;Lj63;)V
        //    68: return         
        //    69: ldc_w           "layerDimensions"
        //    72: invokestatic    mlc.j0:(Ljava/lang/String;)V
        //    75: aconst_null    
        //    76: athrow         
        //    77: ldc_w           "context"
        //    80: invokestatic    mlc.j0:(Ljava/lang/String;)V
        //    83: aconst_null    
        //    84: athrow         
        //    85: aload_0        
        //    86: getfield        vcc.w:Ljava/lang/Object;
        //    89: checkcast       Ld63;
        //    92: astore          9
        //    94: aload           9
        //    96: ifnull          516
        //    99: aload_1        
        //   100: ifnonnull       106
        //   103: goto            492
        //   106: aload_2        
        //   107: getfield        pv1.a:Lpw0;
        //   110: astore          10
        //   112: aload           10
        //   114: fconst_0       
        //   115: putfield        pw0.b:F
        //   118: aload           10
        //   120: fconst_0       
        //   121: putfield        pw0.c:F
        //   124: aload           10
        //   126: fconst_0       
        //   127: putfield        pw0.d:F
        //   130: aload           10
        //   132: fconst_0       
        //   133: putfield        pw0.e:F
        //   136: aload_2        
        //   137: aload           9
        //   139: aload           10
        //   141: aload           9
        //   143: getfield        d63.d:Lalf;
        //   146: aload_1        
        //   147: invokevirtual   pv1.a:(Lo63;Lpw0;Lalf;Ljava/lang/Object;)V
        //   150: aload           9
        //   152: getfield        d63.c:Lk2j;
        //   155: astore          12
        //   157: aload           12
        //   159: getfield        k2j.a:F
        //   162: fstore          4
        //   164: aload           9
        //   166: getfield        d63.a:Lo63;
        //   169: astore          11
        //   171: aload           11
        //   173: invokeinterface toe.g:()Z
        //   178: ifeq            190
        //   181: aload           10
        //   183: getfield        pw0.b:F
        //   186: fstore_3       
        //   187: goto            196
        //   190: aload           10
        //   192: getfield        pw0.d:F
        //   195: fstore_3       
        //   196: fload           4
        //   198: fload_3        
        //   199: fsub           
        //   200: fstore          4
        //   202: aload           12
        //   204: getfield        k2j.b:F
        //   207: aload           10
        //   209: getfield        pw0.c:F
        //   212: fsub           
        //   213: fstore          5
        //   215: aload           12
        //   217: getfield        k2j.c:F
        //   220: fstore          6
        //   222: aload           11
        //   224: invokeinterface toe.g:()Z
        //   229: ifeq            241
        //   232: aload           10
        //   234: getfield        pw0.d:F
        //   237: fstore_3       
        //   238: goto            247
        //   241: aload           10
        //   243: getfield        pw0.b:F
        //   246: fstore_3       
        //   247: fload_3        
        //   248: fload           6
        //   250: fadd           
        //   251: fstore_3       
        //   252: aload           12
        //   254: getfield        k2j.d:F
        //   257: aload           10
        //   259: getfield        pw0.e:F
        //   262: fadd           
        //   263: fstore          6
        //   265: aload           9
        //   267: getfield        d63.g:Lflf;
        //   270: getfield        flf.v:Lcw8;
        //   273: invokeinterface cw8.B0:()Lzn0;
        //   278: astore          10
        //   280: aload           10
        //   282: invokevirtual   zn0.A:()J
        //   285: lstore          7
        //   287: aload           10
        //   289: invokevirtual   zn0.t:()Lx13;
        //   292: invokeinterface x13.g:()V
        //   297: aload           10
        //   299: getfield        zn0.v:Ljava/lang/Object;
        //   302: checkcast       Ljy7;
        //   305: fload           4
        //   307: fload           5
        //   309: fload_3        
        //   310: fload           6
        //   312: iconst_1       
        //   313: invokevirtual   jy7.m:(FFFFI)V
        //   316: aload           9
        //   318: getfield        d63.b:Lx13;
        //   321: astore          11
        //   323: aload           11
        //   325: invokeinterface x13.g:()V
        //   330: aload           11
        //   332: fload           4
        //   334: fload           5
        //   336: fload_3        
        //   337: fload           6
        //   339: iconst_1       
        //   340: invokeinterface x13.m:(FFFFI)V
        //   345: aload_2        
        //   346: aload           9
        //   348: aload_1        
        //   349: invokevirtual   pv1.b:(Ld63;Lj63;)V
        //   352: aload           11
        //   354: invokeinterface x13.p:()V
        //   359: aload           10
        //   361: invokevirtual   zn0.t:()Lx13;
        //   364: invokeinterface x13.p:()V
        //   369: aload           10
        //   371: lload           7
        //   373: invokevirtual   zn0.J:(J)V
        //   376: aload_2        
        //   377: invokevirtual   pv1.d:()Ljava/util/LinkedHashMap;
        //   380: astore_1       
        //   381: aload_0        
        //   382: getfield        vcc.x:Ljava/lang/Object;
        //   385: checkcast       Lx43;
        //   388: astore          9
        //   390: aload_1        
        //   391: invokevirtual   java/util/LinkedHashMap.entrySet:()Ljava/util/Set;
        //   394: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   399: astore          10
        //   401: aload           10
        //   403: invokeinterface java/util/Iterator.hasNext:()Z
        //   408: ifeq            492
        //   411: aload           10
        //   413: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   418: checkcast       Ljava/util/Map$Entry;
        //   421: astore          11
        //   423: aload           9
        //   425: getfield        x43.k:Ljava/util/LinkedHashMap;
        //   428: astore          12
        //   430: aload           11
        //   432: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   437: astore          13
        //   439: aload           12
        //   441: aload           13
        //   443: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   446: astore_2       
        //   447: aload_2        
        //   448: astore_1       
        //   449: aload_2        
        //   450: ifnonnull       472
        //   453: new             Ljava/util/ArrayList;
        //   456: dup            
        //   457: invokespecial   java/util/ArrayList.<init>:()V
        //   460: astore_1       
        //   461: aload           12
        //   463: aload           13
        //   465: aload_1        
        //   466: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   471: pop            
        //   472: aload_1        
        //   473: checkcast       Ljava/util/Collection;
        //   476: aload           11
        //   478: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   483: checkcast       Ljava/lang/Iterable;
        //   486: invokestatic    h86.t0:(Ljava/util/Collection;Ljava/lang/Iterable;)V
        //   489: goto            401
        //   492: return         
        //   493: astore_1       
        //   494: goto            507
        //   497: astore_1       
        //   498: aload           11
        //   500: invokeinterface x13.p:()V
        //   505: aload_1        
        //   506: athrow         
        //   507: aload           10
        //   509: lload           7
        //   511: invokestatic    oz1.w:(Lzn0;J)V
        //   514: aload_1        
        //   515: athrow         
        //   516: ldc_w           "context"
        //   519: invokestatic    mlc.j0:(Ljava/lang/String;)V
        //   522: aconst_null    
        //   523: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  297    323    493    497    Any
        //  323    352    497    507    Any
        //  352    359    493    497    Any
        //  498    507    493    497    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0401:
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
    
    public void onError(final a1c a1c) {
    }
    
    public void onStart(final a1c a1c) {
        final i3c i3c = (i3c)this.w;
        final AsyncImagePainter asyncImagePainter = (AsyncImagePainter)this.x;
        xog n;
        if (a1c != null) {
            n = s7r.n(a1c, i3c.a, asyncImagePainter.K);
        }
        else {
            n = null;
        }
        xog xog = n;
        if (n == null) {
            xog = n;
            if (r9n.B(i3c, ek.b)) {
                final xog k = asyncImagePainter.k();
                xog = n;
                if (k != null) {
                    xog = k;
                }
            }
        }
        asyncImagePainter.o((ib1)new AsyncImagePainter$State$Loading(xog));
    }
    
    public void onSuccess(final a1c a1c) {
    }
    
    public zta p() {
        return (zta)this.w;
    }
    
    public Experience q() {
        return (Experience)this.x;
    }
    
    public InputMethodManager r() {
        return (InputMethodManager)((d2d)this.x).getValue();
    }
    
    public KeyListener s(final KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        if (keyListener instanceof c79) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return (KeyListener)new c79(keyListener);
    }
    
    public Iterator t() {
        return ((Iterable)this.w).iterator();
    }
    
    public void u(final AttributeSet set, final int n) {
        final TypedArray obtainStyledAttributes = ((View)this.w).getContext().obtainStyledAttributes(set, boi.i, n, 0);
        Label_0064: {
            boolean boolean1;
            try {
                final boolean hasValue = obtainStyledAttributes.hasValue(14);
                boolean1 = true;
                if (hasValue) {
                    boolean1 = obtainStyledAttributes.getBoolean(14, true);
                }
            }
            finally {
                break Label_0064;
            }
            obtainStyledAttributes.recycle();
            this.z(boolean1);
            return;
        }
        obtainStyledAttributes.recycle();
    }
    
    public AutofillId v(final long n) {
        if (Build$VERSION.SDK_INT >= 29) {
            return bi0.i(zp6.g(this.x), ((View)this.w).getAutofillId(), n);
        }
        return null;
    }
    
    public z69 w(InputConnection inputConnection, final EditorInfo editorInfo) {
        final bgq bgq = (bgq)this.x;
        if (inputConnection == null) {
            inputConnection = null;
        }
        else {
            final xr5 xr5 = (xr5)bgq.v;
            if (!(inputConnection instanceof z69)) {
                inputConnection = (InputConnection)new z69(editorInfo, inputConnection, (TextView)xr5.w);
            }
        }
        return (z69)inputConnection;
    }
    
    public cgr x(final Intent intent) {
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean b = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context)this.w;
        final ou0 ou0 = (ou0)this.x;
        final boolean b2 = context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 0x10000000) != 0x0) {
            b = true;
        }
        if (b2 && !b) {
            return f(context, intent, b);
        }
        return ri2.q((Executor)ou0, (Callable)new fx7((Object)context, (Object)intent, (byte)1)).g((Executor)ou0, (g07)new d5a(context, intent, b));
    }
    
    public mu7 y() {
        return (mu7)new q38((Context)this.w, ((cvj)this.x).y());
    }
    
    public void z(final boolean x) {
        final Object o = ((xr5)((bgq)this.x).v).x;
        if (((z79)o).x != x) {
            if (((z79)o).w != null) {
                final q69 a = q69.a();
                final y79 w = ((z79)o).w;
                a.getClass();
                lq6.t((Object)w, "initCallback cannot be null");
                final ReentrantReadWriteLock a2 = a.a;
                a2.writeLock().lock();
                try {
                    a.b.remove((Object)w);
                }
                finally {
                    a2.writeLock().unlock();
                }
            }
            ((z79)o).x = x;
            if (x) {
                z79.a(((z79)o).v, q69.a().c());
            }
        }
    }
}
