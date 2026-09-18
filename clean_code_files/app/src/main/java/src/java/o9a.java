import com.anthropic.claude.artifact.model.ArtifactType$BinaryDocument;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.artifact.model.ArtifactFile;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.artifact.model.ArtifactType$Markdown;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.ArtifactUuid;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.artifact.model.c;
import com.anthropic.claude.artifact.model.ArtifactType$Code;
import com.anthropic.claude.artifact.model.ArtifactType$Mermaid;
import com.anthropic.claude.artifact.model.ArtifactType$Html;
import com.anthropic.claude.artifact.model.ArtifactType$React;
import com.anthropic.claude.artifact.model.ArtifactType;

public final class o9a
{
    public final String a;
    public final g11 b;
    public final oi0 c;
    public final k6e d;
    public final wo8 e;
    public final u88 f;
    public final x8m g;
    public final a9m h;
    public final x8m i;
    public final l7n j;
    
    public o9a(final String a, final g11 b, final oi0 c, final k6e d, final wo8 e, final u88 f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new x8m();
        this.h = new a9m();
        this.i = new x8m();
        this.j = new l7n((jta)new h87((Object)this, (byte)9));
    }
    
    public static ArtifactType a(String k) {
        final String a = iba.a(k);
        if (a.equals("jsx") || a.equals("tsx")) {
            return (ArtifactType)ArtifactType$React.INSTANCE;
        }
        if (a.equals("html") || a.equals("htm")) {
            return (ArtifactType)ArtifactType$Html.INSTANCE;
        }
        if (a.equals("mermaid") || a.equals("mmd")) {
            return (ArtifactType)ArtifactType$Mermaid.INSTANCE;
        }
        if (q5n.a().contains((Object)a)) {
            return (ArtifactType)ArtifactType$Code.INSTANCE;
        }
        k = m8r.k(k);
        ArtifactType.Companion.getClass();
        return c.a(k);
    }
    
    public static l9a g(final String s, final String s2) {
        String string = s;
        if (s.length() > 0) {
            final char upperCase = Character.toUpperCase(s.charAt(0));
            final String substring = s.substring(1);
            final StringBuilder sb = new StringBuilder();
            sb.append(upperCase);
            sb.append(substring);
            string = sb.toString();
        }
        SilentException.a(new SilentException(hia.k(string, " over the viewable size, extension: ", s2)), lpl.v, (List)null, 6);
        return new l9a(f8a.w);
    }
    
    public final qw0 b(String j, final jbr jbr, final ArtifactType artifactType, final boolean b) {
        final ArtifactMetadata artifactMetadata = new ArtifactMetadata(new ArtifactUuid(this.f.a().a()), (String)null, (String)null, artifactType, j, iba.a(j), b, 6);
        aa1 a;
        if (mlc.q((Object)artifactType, (Object)ArtifactType$Markdown.INSTANCE) && jbr instanceof px0) {
            j = ((px0)jbr).j();
            final k6e d = this.d;
            a = d.a((lta)d.a, j);
        }
        else {
            a = null;
        }
        return new qw0(jbr, artifactMetadata, a);
    }
    
    public final m9a c(final WiggleArtifactIdentifier p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: aload_1        
        //     5: invokestatic    ckq.c:(Lcom/anthropic/claude/artifact/model/ArtifactFile;)Ljava/lang/String;
        //     8: astore          5
        //    10: aload_1        
        //    11: invokevirtual   com/anthropic/claude/artifact/model/WiggleArtifactIdentifier.getFileName:()Ljava/lang/String;
        //    14: invokestatic    iba.b:(Ljava/lang/String;)Ljava/lang/String;
        //    17: astore          4
        //    19: new             Lrej;
        //    22: astore          6
        //    24: aload           6
        //    26: invokespecial   rej.<init>:()V
        //    29: aload           6
        //    31: aload_0        
        //    32: getfield        o9a.c:Loi0;
        //    35: aload_1        
        //    36: aload_0        
        //    37: getfield        o9a.a:Ljava/lang/String;
        //    40: invokevirtual   com/anthropic/claude/artifact/model/WiggleArtifactIdentifier.b:(Ljava/lang/String;)Ljava/lang/String;
        //    43: invokestatic    bar.k:(Loi0;Ljava/lang/String;)Ljava/lang/String;
        //    46: invokevirtual   rej.e:(Ljava/lang/String;)V
        //    49: new             Lsej;
        //    52: astore_1       
        //    53: aload_1        
        //    54: aload           6
        //    56: invokespecial   sej.<init>:(Lrej;)V
        //    59: aload_0        
        //    60: getfield        o9a.b:Lg11;
        //    63: invokevirtual   g11.a:()Ljava/lang/Object;
        //    66: checkcast       Lb03;
        //    69: aload_1        
        //    70: invokeinterface b03.a:(Lsej;)Ldti;
        //    75: invokevirtual   dti.d:()Lsnj;
        //    78: astore          6
        //    80: aload           6
        //    82: getfield        snj.K:Z
        //    85: ifne            178
        //    88: getstatic       adn.a:Ljava/util/List;
        //    91: astore_1       
        //    92: aload           6
        //    94: getfield        snj.y:I
        //    97: istore_2       
        //    98: new             Ljava/lang/StringBuilder;
        //   101: astore_1       
        //   102: aload_1        
        //   103: ldc_w           "Failed to fetch "
        //   106: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   109: aload_1        
        //   110: aload           5
        //   112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: pop            
        //   116: aload_1        
        //   117: ldc_w           " (HTTP "
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: pop            
        //   124: aload_1        
        //   125: iload_2        
        //   126: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   129: pop            
        //   130: aload_1        
        //   131: ldc_w           "), extension: "
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: pop            
        //   138: aload_1        
        //   139: aload           4
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: iconst_4       
        //   146: aload_1        
        //   147: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   150: ldc_w           "network"
        //   153: aconst_null    
        //   154: invokestatic    adn.e:(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
        //   157: new             Ll9a;
        //   160: astore_1       
        //   161: aload_1        
        //   162: aload_3        
        //   163: invokespecial   l9a.<init>:(Lf8a;)V
        //   166: goto            236
        //   169: astore          6
        //   171: goto            256
        //   174: astore_1       
        //   175: goto            243
        //   178: aload           6
        //   180: getfield        snj.B:Lunj;
        //   183: invokevirtual   unj.Y0:()Lqn2;
        //   186: astore_1       
        //   187: aload_1        
        //   188: ldc2_w          2000001
        //   191: invokeinterface qn2.x0:(J)Z
        //   196: ifeq            210
        //   199: aload           5
        //   201: aload           4
        //   203: invokestatic    o9a.g:(Ljava/lang/String;Ljava/lang/String;)Ll9a;
        //   206: astore_1       
        //   207: goto            236
        //   210: new             Lox0;
        //   213: astore          7
        //   215: aload           7
        //   217: aload_1        
        //   218: invokeinterface qn2.u0:()Lis2;
        //   223: invokespecial   ox0.<init>:(Lis2;)V
        //   226: new             Lk9a;
        //   229: dup            
        //   230: aload           7
        //   232: invokespecial   k9a.<init>:(Ljbr;)V
        //   235: astore_1       
        //   236: aload           6
        //   238: invokevirtual   snj.close:()V
        //   241: aload_1        
        //   242: areturn        
        //   243: aload_1        
        //   244: athrow         
        //   245: astore          7
        //   247: aload           6
        //   249: aload_1        
        //   250: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   253: aload           7
        //   255: athrow         
        //   256: aload           6
        //   258: invokestatic    ssf.f:(Ljava/lang/Throwable;)Z
        //   261: ifeq            315
        //   264: getstatic       adn.a:Ljava/util/List;
        //   267: astore_1       
        //   268: aload           6
        //   270: invokestatic    t4r.e:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   273: astore_1       
        //   274: ldc_w           "Network error fetching "
        //   277: aload           5
        //   279: ldc_w           " (extension: "
        //   282: aload           4
        //   284: ldc_w           "): "
        //   287: invokestatic    oz1.t:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: astore          4
        //   292: aload           4
        //   294: aload_1        
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: pop            
        //   299: iconst_4       
        //   300: aload           4
        //   302: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   305: ldc_w           "network"
        //   308: aconst_null    
        //   309: invokestatic    adn.e:(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
        //   312: goto            365
        //   315: aload           6
        //   317: invokestatic    t4r.e:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   320: astore_1       
        //   321: ldc_w           "Error fetching "
        //   324: aload           5
        //   326: ldc_w           " (extension: "
        //   329: aload           4
        //   331: ldc_w           "): "
        //   334: invokestatic    oz1.t:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   337: astore          4
        //   339: aload           4
        //   341: aload_1        
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: pop            
        //   346: new             Lcom/anthropic/claude/core/telemetry/SilentException;
        //   349: dup            
        //   350: aload           4
        //   352: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   355: invokespecial   com/anthropic/claude/core/telemetry/SilentException.<init>:(Ljava/lang/String;)V
        //   358: aconst_null    
        //   359: aconst_null    
        //   360: bipush          7
        //   362: invokestatic    com/anthropic/claude/core/telemetry/SilentException.a:(Lcom/anthropic/claude/core/telemetry/SilentException;Llpl;Ljava/util/List;I)V
        //   365: new             Ll9a;
        //   368: dup            
        //   369: aload_3        
        //   370: invokespecial   l9a.<init>:(Lf8a;)V
        //   373: areturn        
        //   374: astore_1       
        //   375: aload_1        
        //   376: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  19     80     374    377    Ljava/util/concurrent/CancellationException;
        //  19     80     169    374    Ljava/lang/Exception;
        //  80     166    174    256    Any
        //  178    207    174    256    Any
        //  210    236    174    256    Any
        //  236    241    374    377    Ljava/util/concurrent/CancellationException;
        //  236    241    169    374    Ljava/lang/Exception;
        //  243    245    245    256    Any
        //  247    256    374    377    Ljava/util/concurrent/CancellationException;
        //  247    256    169    374    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 177 out of bounds for length 177
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.util.Objects.checkIndex(Objects.java:371)
        //     at java.util.ArrayList.get(ArrayList.java:435)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
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
    
    public final Object d(ArtifactFile ex, h07 w) {
        Object o = null;
        Label_0051: {
            if (w instanceof n9a) {
                o = w;
                final int z = ((n9a)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((n9a)o).z = z + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            o = new n9a(this, w);
        }
        Object o2 = ((n9a)o).x;
        final int z2 = ((n9a)o).z;
        final f8a v = f8a.v;
        if (z2 != 0 && z2 == 1) {
            w = (h07)((n9a)o).w;
            ex = (Exception)((n9a)o).v;
            Object o3 = w;
            Object w2 = ex;
            Label_0218: {
                try {
                    vt4.g0(o2);
                    break Label_0218;
                }
                catch (final Exception ex) {
                    break Label_0218;
                }
                catch (final CancellationException ex2) {
                    throw ex2;
                }
                while (true) {
                    try {
                        ex = (Exception)this.j.getValue();
                        try {
                            ((n9a)o).v = (String)w;
                            ((n9a)o).w = (String)w2;
                            ((n9a)o).z = 1;
                            final String s;
                            o2 = ((daa)ex).a(2000000L, (h07)o, s);
                            ex = (Exception)pc7.v;
                            if (o2 == ex) {
                                return ex;
                            }
                            ex = (Exception)w;
                            w = (h07)w2;
                            w2 = ex;
                            final baa baa = (baa)o2;
                            if (baa instanceof z9a) {
                                return new k9a((jbr)new px0(((z9a)baa).a()));
                            }
                            if (baa instanceof x9a) {
                                w2 = adn.a;
                                ex = (Exception)oz1.s(((x9a)baa).a(), "Failed to fetch ", (String)ex, " (HTTP ", "), extension: ");
                                ((StringBuilder)ex).append((String)w);
                                adn.e(4, ((StringBuilder)ex).toString(), "network", (Map)null);
                                return new l9a(v);
                            }
                            if (baa instanceof y9a) {
                                w2 = adn.a;
                                w2 = t4r.e((Throwable)((y9a)baa).a());
                                ex = (Exception)oz1.t("Network error fetching ", (String)ex, " (extension: ", (String)w, "): ");
                                ((StringBuilder)ex).append((String)w2);
                                adn.e(4, ((StringBuilder)ex).toString(), "network", (Map)null);
                                return new l9a(v);
                            }
                            if (baa instanceof aaa) {
                                return g((String)ex, (String)w);
                            }
                            if (mlc.q((Object)baa, (Object)w9a.a)) {
                                w2 = ex;
                                if (((String)ex).length() > 0) {
                                    final char upperCase = Character.toUpperCase(((String)ex).charAt(0));
                                    ex = (Exception)((String)ex).substring(1);
                                    w2 = new StringBuilder();
                                    ((StringBuilder)w2).append((char)upperCase);
                                    ((StringBuilder)w2).append((String)ex);
                                    w2 = ((StringBuilder)w2).toString();
                                }
                                SilentException.a(new SilentException(hia.k((String)w2, " is binary, extension: ", (String)w)), lpl.v, (List)null, 6);
                                return new l9a(f8a.w);
                            }
                            en9.r();
                            return null;
                        }
                        catch (final Exception ex3) {}
                        while (true) {
                            o3 = w2;
                            w2 = w;
                            break Label_0218;
                            continue;
                        }
                    }
                    catch (final Exception ex) {
                        continue;
                    }
                    break;
                }
            }
            final String e = t4r.e((Throwable)ex);
            final StringBuilder t = oz1.t("Error fetching ", (String)w2, " (extension: ", (String)o3, "): ");
            t.append(e);
            SilentException.a(new SilentException(t.toString()), (lpl)null, (List)null, 7);
            return new l9a(v);
        }
        goto Label_0116;
    }
    
    public final void e(final String s) {
        final x8m g = this.g;
        final h8m x = g.x;
        final Iterable iterable = (Iterable)((Map)g.g().c).keySet();
        final ArrayList list = new ArrayList();
        for (final Object next : iterable) {
            if (mlc.q((Object)((ArtifactFile)next).a(), (Object)s)) {
                list.add(next);
            }
        }
        x.removeAll((Collection)list);
        final a9m h = this.h;
        h.getClass();
        final n4h c = ((npm)g8m.s((lpm)h.v, (jpm)h)).c;
        final ArrayList list2 = new ArrayList();
        for (final Object next2 : c) {
            if (mlc.q((Object)((ArtifactFile)next2).a(), (Object)s)) {
                list2.add(next2);
            }
        }
        h.removeAll((Collection)list2);
        final x8m i = this.i;
        final h8m x2 = i.x;
        final Iterable iterable2 = (Iterable)((Map)i.g().c).keySet();
        final ArrayList list3 = new ArrayList();
        for (final Object next3 : iterable2) {
            if (mlc.q((Object)((ArtifactFile)next3).a(), (Object)s)) {
                list3.add(next3);
            }
        }
        x2.removeAll((Collection)list3);
    }
    
    public final void f(final WiggleArtifactIdentifier wiggleArtifactIdentifier, final String s, final String s2, final boolean b) {
        final ArtifactType a = a(s2);
        if (a instanceof ArtifactType$BinaryDocument) {
            SilentException.a(new SilentException(smk.s("Unsupported type to cache ", a.a())), lpl.w, (List)null, 6);
            return;
        }
        this.g.put((Object)wiggleArtifactIdentifier, (Object)this.b(wiggleArtifactIdentifier.getFileName(), (jbr)new px0(s), a, b));
    }
}
