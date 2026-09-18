public final class a3q implements cbd
{
    public final fz6 v;
    public final ic0 w;
    public final j0j x;
    public final b4j y;
    
    public a3q(final fz6 v, final ic0 w, final j0j x, final b4j y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final void g(final gbd p0, final rad p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_2        
        //     4: invokevirtual   java/lang/Enum.ordinal:()I
        //     7: iaload         
        //     8: istore_3       
        //     9: aconst_null    
        //    10: astore_2       
        //    11: iload_3        
        //    12: tableswitch {
        //                2: 331
        //                3: 98
        //                4: 68
        //                5: 60
        //                6: 325
        //                7: 325
        //                8: 325
        //          default: 56
        //        }
        //    56: invokestatic    en9.r:()V
        //    59: return         
        //    60: aload_0        
        //    61: getfield        a3q.x:Lj0j;
        //    64: invokevirtual   j0j.A:()V
        //    67: return         
        //    68: aload_0        
        //    69: getfield        a3q.x:Lj0j;
        //    72: astore_2       
        //    73: aload_2        
        //    74: getfield        j0j.d:Ljava/lang/Object;
        //    77: astore_1       
        //    78: aload_1        
        //    79: dup            
        //    80: astore          8
        //    82: monitorenter   
        //    83: aload_2        
        //    84: iconst_1       
        //    85: putfield        j0j.v:Z
        //    88: aload           8
        //    90: monitorexit    
        //    91: return         
        //    92: astore_2       
        //    93: aload           8
        //    95: monitorexit    
        //    96: aload_2        
        //    97: athrow         
        //    98: aload_0        
        //    99: getfield        a3q.w:Lic0;
        //   102: astore_1       
        //   103: aload_1        
        //   104: ifnull          258
        //   107: aload_1        
        //   108: getfield        ic0.x:Ljava/lang/Object;
        //   111: checkcast       Lrfa;
        //   114: astore          6
        //   116: aload           6
        //   118: getfield        rfa.b:Ljava/lang/Object;
        //   121: astore_1       
        //   122: aload_1        
        //   123: dup            
        //   124: astore          8
        //   126: monitorenter   
        //   127: aload           6
        //   129: getfield        rfa.b:Ljava/lang/Object;
        //   132: astore          7
        //   134: aload           7
        //   136: dup            
        //   137: astore          9
        //   139: monitorenter   
        //   140: aload           6
        //   142: getfield        rfa.a:Z
        //   145: istore          5
        //   147: aload           9
        //   149: monitorexit    
        //   150: iload           5
        //   152: ifeq            161
        //   155: aload           8
        //   157: monitorexit    
        //   158: goto            258
        //   161: aload           6
        //   163: getfield        rfa.c:Ljava/lang/Object;
        //   166: checkcast       Ljava/util/ArrayList;
        //   169: astore          7
        //   171: aload           6
        //   173: aload           6
        //   175: getfield        rfa.d:Ljava/lang/Object;
        //   178: checkcast       Ljava/util/ArrayList;
        //   181: putfield        rfa.c:Ljava/lang/Object;
        //   184: aload           6
        //   186: aload           7
        //   188: putfield        rfa.d:Ljava/lang/Object;
        //   191: aload           6
        //   193: iconst_1       
        //   194: putfield        rfa.a:Z
        //   197: aload           7
        //   199: invokevirtual   java/util/ArrayList.size:()I
        //   202: istore          4
        //   204: iconst_0       
        //   205: istore_3       
        //   206: iload_3        
        //   207: iload           4
        //   209: if_icmpge       239
        //   212: aload           7
        //   214: iload_3        
        //   215: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   218: checkcast       Lf07;
        //   221: getstatic       lqo.a:Llqo;
        //   224: invokeinterface f07.resumeWith:(Ljava/lang/Object;)V
        //   229: iinc            3, 1
        //   232: goto            206
        //   235: astore_2       
        //   236: goto            253
        //   239: aload           7
        //   241: invokevirtual   java/util/ArrayList.clear:()V
        //   244: goto            155
        //   247: astore_2       
        //   248: aload           9
        //   250: monitorexit    
        //   251: aload_2        
        //   252: athrow         
        //   253: aload           8
        //   255: monitorexit    
        //   256: aload_2        
        //   257: athrow         
        //   258: aload_0        
        //   259: getfield        a3q.x:Lj0j;
        //   262: astore          7
        //   264: aload           7
        //   266: getfield        j0j.d:Ljava/lang/Object;
        //   269: astore          6
        //   271: aload           6
        //   273: dup            
        //   274: astore          10
        //   276: monitorenter   
        //   277: aload_2        
        //   278: astore_1       
        //   279: aload           7
        //   281: getfield        j0j.v:Z
        //   284: ifeq            306
        //   287: aload           7
        //   289: iconst_0       
        //   290: putfield        j0j.v:Z
        //   293: aload           7
        //   295: invokevirtual   j0j.C:()Lk13;
        //   298: astore_1       
        //   299: goto            306
        //   302: astore_1       
        //   303: goto            326
        //   306: aload           10
        //   308: monitorexit    
        //   309: aload_1        
        //   310: ifnull          325
        //   313: getstatic       lqo.a:Llqo;
        //   316: astore_2       
        //   317: aload_1        
        //   318: checkcast       Ll13;
        //   321: aload_2        
        //   322: invokevirtual   l13.resumeWith:(Ljava/lang/Object;)V
        //   325: return         
        //   326: aload           10
        //   328: monitorexit    
        //   329: aload_1        
        //   330: athrow         
        //   331: aload_0        
        //   332: getfield        a3q.v:Lfz6;
        //   335: aconst_null    
        //   336: iconst_4       
        //   337: new             Lkd0;
        //   340: dup            
        //   341: aload_0        
        //   342: getfield        a3q.y:Lb4j;
        //   345: aload_0        
        //   346: getfield        a3q.x:Lj0j;
        //   349: aload_1        
        //   350: aload_0        
        //   351: aconst_null    
        //   352: bipush          10
        //   354: invokespecial   kd0.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf07;B)V
        //   357: iconst_1       
        //   358: invokestatic    rhc.G:(Loc7;Lhc7;ILzta;I)Lwmm;
        //   361: pop            
        //   362: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  83     88     92     98     Any
        //  127    140    235    239    Any
        //  140    147    247    253    Any
        //  147    150    235    239    Any
        //  161    204    235    239    Any
        //  212    229    235    239    Any
        //  239    244    235    239    Any
        //  248    253    235    239    Any
        //  279    299    302    306    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0155:
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
}
