import com.anthropic.claude.api.project.Project;
import java.io.Serializable;
import java.util.Iterator;
import android.os.Trace;
import java.util.Collection;
import java.util.Set;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ProjectId;

public final class yb0 implements u4c, k8o
{
    public final Object A;
    public final Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object v;
    public Object w;
    public final Object x;
    public Object y;
    public Object z;
    
    public yb0() {
        final inf inf = new inf(0, (Object[])new kva[16]);
        this.x = inf;
        final umf a = kak.a;
        this.y = new umf();
        this.z = inf;
        this.A = new inf(0, new Object[16]);
        this.B = new inf(0, (Object[])new jta[16]);
    }
    
    public yb0(final kn3 v, final String s, final kn3 w, final tz3 x, final g84 y, final qo4 z, final gci a, final fz6 b) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        ProjectId projectId;
        if (s != null) {
            projectId = new ProjectId(s);
        }
        else {
            projectId = null;
        }
        this.C = o50.Q((Object)projectId);
        this.D = o50.Q((Object)Boolean.FALSE);
        final def d = def.D;
        final nr nr = new nr(this, (byte)2);
        final tze a2 = r8m.a;
        this.E = new sd8((jta)nr, (q8m)d);
        this.F = new sd8((jta)new p1((Object)this, (byte)12), (q8m)d);
    }
    
    public yb0(final vhk vhk, final jta e, final jta x, final jta y, final jta b, final lta z, final zta c, final lta a, final jta d, final lta f) {
        this.w = vhk;
        this.E = e;
        this.x = x;
        this.y = y;
        this.B = b;
        this.z = z;
        this.C = c;
        this.A = a;
        this.D = d;
        this.F = f;
        this.v = vhk;
    }
    
    public yb0(final z48 z48, final peo x, final ko1 y, final lta z49, final d09 b, final nr7 c, final qmn d, final jta e, final jap f, final lta a) {
        this.w = z48;
        this.x = x;
        this.y = y;
        this.z = z49;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.A = a;
        this.v = z48;
    }
    
    public static final boolean o(final kva kva, inf c) {
        final Object[] v = c.v;
        for (int x = c.x, i = 0; i < x; ++i) {
            final f8j a = ((kva)v[i]).a;
            if (a instanceof jwg) {
                c = ((jwg)a).c();
                if (!c.k((Object)kva)) {
                    if (!o(kva, c)) {
                        continue;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public int b() {
        return ((z48)this.w).b();
    }
    
    public boolean c(final String s, final lef lef) {
        final jta jta = (jta)this.D;
        if (this.e(s, lef) != 0) {
            return false;
        }
        if (s == null) {
            return (boolean)jta.a();
        }
        final Boolean b = (Boolean)((lta)this.A).b((Object)new ChatId(s));
        if (b != null) {
            return b;
        }
        return (boolean)jta.a();
    }
    
    public long d(final long n) {
        return ((z48)this.v).d(n);
    }
    
    public int e(final String s, final lef lef) {
        int n;
        if (((jta)this.y).a()) {
            n = 2131758507;
        }
        else if (!(boolean)((jta)this.B).a()) {
            n = 2131756808;
        }
        else if (lef instanceof jef && !(boolean)((lta)this.z).b((Object)lef)) {
            n = 2131758508;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return n;
        }
        final zta zta = (zta)this.C;
        if (zta != null) {
            Object o;
            if (s != null) {
                o = new ChatId(s);
            }
            else {
                o = null;
            }
            return ((Number)zta.d(o, (Object)lef)).intValue();
        }
        return 0;
    }
    
    public void f(final lta lta) {
        ((z48)this.v).f(lta);
    }
    
    public boolean g() {
        return (boolean)((jta)this.x).a();
    }
    
    public long i(final long n) {
        return ((z48)this.v).i(n);
    }
    
    public boolean isVisible() {
        return (boolean)((jta)this.E).a();
    }
    
    public void j() {
        this.v = null;
        this.w = null;
        final inf z = (inf)this.x;
        z.h();
        ((umf)this.y).b();
        this.z = z;
        ((inf)this.A).h();
        ((inf)this.B).h();
        this.C = null;
        this.D = null;
        this.E = null;
    }
    
    public void k() {
        final Set set = (Set)this.v;
        if (set != null) {
            if (!((Collection)set).isEmpty()) {
                Trace.beginSection("Compose:abandons");
                try {
                    final Iterator iterator = set.iterator();
                    while (iterator.hasNext()) {
                        final f8j f8j = (f8j)iterator.next();
                        iterator.remove();
                        f8j.a();
                    }
                }
                finally {
                    Trace.endSection();
                }
            }
        }
    }
    
    public void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        yb0.x:Ljava/lang/Object;
        //     4: checkcast       Linf;
        //     7: astore          4
        //     9: aload_0        
        //    10: getfield        yb0.A:Ljava/lang/Object;
        //    13: checkcast       Linf;
        //    16: astore          8
        //    18: aload_0        
        //    19: getfield        yb0.v:Ljava/lang/Object;
        //    22: checkcast       Ljava/util/Set;
        //    25: astore          5
        //    27: aload           5
        //    29: ifnonnull       35
        //    32: goto            369
        //    35: aload_0        
        //    36: aconst_null    
        //    37: putfield        yb0.F:Ljava/lang/Object;
        //    40: aload           8
        //    42: getfield        inf.x:I
        //    45: ifeq            224
        //    48: ldc             "Compose:onForgotten"
        //    50: invokestatic    android/os/Trace.beginSection:(Ljava/lang/String;)V
        //    53: aload_0        
        //    54: getfield        yb0.C:Ljava/lang/Object;
        //    57: checkcast       Lumf;
        //    60: astore          7
        //    62: aload           8
        //    64: getfield        inf.x:I
        //    67: iconst_1       
        //    68: isub           
        //    69: istore_1       
        //    70: iconst_m1      
        //    71: iload_1        
        //    72: if_icmpge       212
        //    75: aload           8
        //    77: getfield        inf.v:[Ljava/lang/Object;
        //    80: iload_1        
        //    81: aaload         
        //    82: astore_3       
        //    83: aload_3        
        //    84: instanceof      Lkva;
        //    87: ifeq            124
        //    90: aload_3        
        //    91: checkcast       Lkva;
        //    94: getfield        kva.a:Lf8j;
        //    97: astore          6
        //    99: aload           5
        //   101: aload           6
        //   103: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   108: pop            
        //   109: aload           6
        //   111: invokeinterface f8j.b:()V
        //   116: goto            124
        //   119: astore          5
        //   121: goto            172
        //   124: aload_3        
        //   125: instanceof      Lkh6;
        //   128: ifeq            166
        //   131: aload           7
        //   133: ifnull          157
        //   136: aload           7
        //   138: aload_3        
        //   139: invokevirtual   umf.c:(Ljava/lang/Object;)Z
        //   142: ifeq            157
        //   145: aload_3        
        //   146: checkcast       Lkh6;
        //   149: invokeinterface kh6.a:()V
        //   154: goto            166
        //   157: aload_3        
        //   158: checkcast       Lkh6;
        //   161: invokeinterface kh6.b:()V
        //   166: iinc            1, -1
        //   169: goto            70
        //   172: aload_0        
        //   173: getfield        yb0.w:Ljava/lang/Object;
        //   176: checkcast       Lwl6;
        //   179: astore          6
        //   181: aload           6
        //   183: ifnull          209
        //   186: new             Lcw5;
        //   189: astore          4
        //   191: aload           4
        //   193: aload           6
        //   195: aload_3        
        //   196: bipush          15
        //   198: invokespecial   cw5.<init>:(Ljava/lang/Object;Ljava/lang/Object;B)V
        //   201: aload           5
        //   203: aload           4
        //   205: invokestatic    kkq.w:(Ljava/lang/Throwable;Ljta;)Z
        //   208: pop            
        //   209: aload           5
        //   211: athrow         
        //   212: invokestatic    android/os/Trace.endSection:()V
        //   215: goto            224
        //   218: astore_3       
        //   219: invokestatic    android/os/Trace.endSection:()V
        //   222: aload_3        
        //   223: athrow         
        //   224: aload           4
        //   226: getfield        inf.x:I
        //   229: ifeq            369
        //   232: ldc             "Compose:onRemembered"
        //   234: invokestatic    android/os/Trace.beginSection:(Ljava/lang/String;)V
        //   237: aload_0        
        //   238: getfield        yb0.v:Ljava/lang/Object;
        //   241: checkcast       Ljava/util/Set;
        //   244: astore          6
        //   246: aload           6
        //   248: ifnonnull       254
        //   251: goto            360
        //   254: aload           4
        //   256: getfield        inf.v:[Ljava/lang/Object;
        //   259: astore          5
        //   261: aload           4
        //   263: getfield        inf.x:I
        //   266: istore_2       
        //   267: iconst_0       
        //   268: istore_1       
        //   269: iload_1        
        //   270: iload_2        
        //   271: if_icmpge       360
        //   274: aload           5
        //   276: iload_1        
        //   277: aaload         
        //   278: checkcast       Lkva;
        //   281: astore_3       
        //   282: aload_3        
        //   283: getfield        kva.a:Lf8j;
        //   286: astore          4
        //   288: aload           6
        //   290: aload           4
        //   292: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   297: pop            
        //   298: aload           4
        //   300: invokeinterface f8j.d:()V
        //   305: iinc            1, 1
        //   308: goto            269
        //   311: astore          4
        //   313: aload_0        
        //   314: getfield        yb0.w:Ljava/lang/Object;
        //   317: checkcast       Lwl6;
        //   320: astore          6
        //   322: aload           6
        //   324: ifnull          357
        //   327: new             Lcw5;
        //   330: astore          5
        //   332: aload           5
        //   334: aload           6
        //   336: aload_3        
        //   337: bipush          15
        //   339: invokespecial   cw5.<init>:(Ljava/lang/Object;Ljava/lang/Object;B)V
        //   342: aload           4
        //   344: aload           5
        //   346: invokestatic    kkq.w:(Ljava/lang/Throwable;Ljta;)Z
        //   349: pop            
        //   350: goto            357
        //   353: astore_3       
        //   354: goto            364
        //   357: aload           4
        //   359: athrow         
        //   360: invokestatic    android/os/Trace.endSection:()V
        //   363: return         
        //   364: invokestatic    android/os/Trace.endSection:()V
        //   367: aload_3        
        //   368: athrow         
        //   369: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  53     70     218    224    Any
        //  75     83     218    224    Any
        //  83     116    119    212    Any
        //  124    131    119    212    Any
        //  136    154    119    212    Any
        //  157    166    119    212    Any
        //  172    181    218    224    Any
        //  186    209    218    224    Any
        //  209    212    218    224    Any
        //  237    246    353    357    Any
        //  254    267    353    357    Any
        //  274    298    353    357    Any
        //  298    305    311    353    Any
        //  313    322    353    357    Any
        //  327    350    353    357    Any
        //  357    360    353    357    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public void m() {
        final inf inf = (inf)this.B;
        if (inf.x != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                final Object[] v = inf.v;
                for (int x = inf.x, i = 0; i < x; ++i) {
                    ((jta)v[i]).a();
                }
                inf.h();
            }
            finally {
                Trace.endSection();
            }
        }
    }
    
    public void n(final kva kva) {
        final inf inf = (inf)this.x;
        if (((umf)this.y).c((Object)kva)) {
            ((umf)this.y).l((Object)kva);
            if (!((inf)this.z).k((Object)kva)) {
                if (!inf.k((Object)kva)) {
                    o(kva, inf);
                }
            }
            final Set set = (Set)this.v;
            if (set != null) {
                set.add((Object)kva.a);
            }
        }
        else {
            final umf umf = (umf)this.F;
            if (umf == null || !umf.c((Object)kva)) {
                ((inf)this.A).b((Object)kva);
            }
        }
    }
    
    public nwh p() {
        return (nwh)((sd8)this.F).getValue();
    }
    
    public String q() {
        final ProjectId projectId = (ProjectId)((ksg)this.C).getValue();
        if (projectId != null) {
            return projectId.a;
        }
        return null;
    }
    
    public String r() {
        final ProjectId projectId = (ProjectId)((sd8)this.E).getValue();
        if (projectId != null) {
            return projectId.a;
        }
        return null;
    }
    
    public void s(final Set v, final wl6 w) {
        this.j();
        this.v = v;
        this.w = w;
    }
    
    public Object t(final boolean b, final xr5 xr5, final m6n m6n) {
        ((lta)this.F).b((Object)b);
        final Object y = ((vhk)this.w).y((Serializable)b, xr5, m6n);
        if (y == pc7.v) {
            return y;
        }
        return lqo.a;
    }
    
    public void u(final Project project) {
        String o;
        if (project != null) {
            o = project.o();
        }
        else {
            o = null;
        }
        final String q = this.q();
        final ksg ksg = (ksg)this.C;
        Object value;
        if (o != null) {
            value = new ProjectId(o);
        }
        else {
            value = null;
        }
        ksg.setValue(value);
        final ChatId chatId = (ChatId)((kn3)this.v).a();
        String a;
        if (chatId != null) {
            a = chatId.a;
        }
        else {
            a = null;
        }
        if (a != null) {
            ((ksg)this.D).setValue((Object)Boolean.TRUE);
            rhc.G((oc7)this.B, (hc7)null, 0, (zta)new sr(this, a, o, project, q, (f07)null), 3);
        }
    }
}
