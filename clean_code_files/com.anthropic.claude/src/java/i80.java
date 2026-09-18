public final class i80 extends m6n implements lta
{
    public final Object A;
    public final byte w;
    public byte x;
    public Object y;
    public Object z;
    
    public i80(final j80 y, final String z, final String a, final f07 f07) {
        this.w = 0;
        this.y = y;
        this.z = z;
        this.A = a;
        super(1, f07);
    }
    
    public i80(final rca a, final f07 f07) {
        this.w = 2;
        this.A = a;
        super(1, f07);
    }
    
    public i80(final rv7 z, final o1f a, final f07 f07) {
        this.w = 1;
        this.z = z;
        this.A = a;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((i80)this.create(f07)).invokeSuspend(a);
            }
            case 1: {
                return ((i80)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((i80)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object a = this.A;
        switch (w) {
            default: {
                return (f07)new i80((rca)a, f07);
            }
            case 1: {
                return (f07)new i80((rv7)this.z, (o1f)a, f07);
            }
            case 0: {
                return (f07)new i80((j80)this.y, (String)this.z, (String)a, f07);
            }
        }
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        i80.w:B
        //     4: istore_2       
        //     5: getstatic       pc7.v:Lpc7;
        //     8: astore          4
        //    10: aload_0        
        //    11: getfield        i80.A:Ljava/lang/Object;
        //    14: astore          6
        //    16: iload_2        
        //    17: tableswitch {
        //                0: 643
        //                1: 398
        //          default: 40
        //        }
        //    40: aload           6
        //    42: checkcast       Lrca;
        //    45: astore          7
        //    47: aload_0        
        //    48: getfield        i80.x:B
        //    51: istore_2       
        //    52: iload_2        
        //    53: ifeq            136
        //    56: iload_2        
        //    57: iconst_1       
        //    58: if_icmpeq       108
        //    61: iload_2        
        //    62: iconst_2       
        //    63: if_icmpne       98
        //    66: aload_0        
        //    67: getfield        i80.z:Ljava/lang/Object;
        //    70: checkcast       Ljava/io/FileInputStream;
        //    73: astore          4
        //    75: aload_0        
        //    76: getfield        i80.y:Ljava/lang/Object;
        //    79: checkcast       Ljava/io/FileInputStream;
        //    82: checkcast       Ljava/io/FileNotFoundException;
        //    85: astore          5
        //    87: aload_1        
        //    88: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //    91: goto            319
        //    94: astore_1       
        //    95: goto            345
        //    98: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   100: invokestatic    en9.q:(Ljava/lang/String;)V
        //   103: aconst_null    
        //   104: astore_1       
        //   105: goto            396
        //   108: aload_0        
        //   109: getfield        i80.y:Ljava/lang/Object;
        //   112: checkcast       Ljava/io/FileInputStream;
        //   115: astore          6
        //   117: aload           6
        //   119: astore          5
        //   121: aload_1        
        //   122: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   125: aload           6
        //   127: astore          5
        //   129: goto            219
        //   132: astore_1       
        //   133: goto            228
        //   136: aload_1        
        //   137: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   140: new             Ljava/io/FileInputStream;
        //   143: dup            
        //   144: aload           7
        //   146: getfield        rca.a:Ljava/io/File;
        //   149: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   152: astore_1       
        //   153: aload_1        
        //   154: astore          5
        //   156: aload           7
        //   158: getfield        rca.b:Lwzk;
        //   161: astore          6
        //   163: aload_1        
        //   164: astore          5
        //   166: aload_0        
        //   167: aload_1        
        //   168: putfield        i80.y:Ljava/lang/Object;
        //   171: aload_1        
        //   172: astore          5
        //   174: aload_0        
        //   175: aconst_null    
        //   176: putfield        i80.z:Ljava/lang/Object;
        //   179: aload_1        
        //   180: astore          5
        //   182: aload_0        
        //   183: iconst_1       
        //   184: putfield        i80.x:B
        //   187: aload_1        
        //   188: astore          5
        //   190: aload           6
        //   192: aload_1        
        //   193: invokeinterface wzk.i:(Ljava/io/FileInputStream;)Ljava/lang/Object;
        //   198: astore          6
        //   200: aload_1        
        //   201: astore          5
        //   203: aload           6
        //   205: astore_1       
        //   206: aload           6
        //   208: aload           4
        //   210: if_acmpne       219
        //   213: aload           4
        //   215: astore_1       
        //   216: goto            396
        //   219: aload           5
        //   221: aconst_null    
        //   222: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   225: goto            396
        //   228: aload_1        
        //   229: athrow         
        //   230: astore          6
        //   232: aload           5
        //   234: aload_1        
        //   235: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   238: aload           6
        //   240: athrow         
        //   241: astore_1       
        //   242: aload           7
        //   244: getfield        rca.a:Ljava/io/File;
        //   247: astore_1       
        //   248: aload           7
        //   250: getfield        rca.b:Lwzk;
        //   253: astore          5
        //   255: aload_1        
        //   256: invokevirtual   java/io/File.exists:()Z
        //   259: ifeq            388
        //   262: new             Ljava/io/FileInputStream;
        //   265: dup            
        //   266: aload           7
        //   268: getfield        rca.a:Ljava/io/File;
        //   271: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   274: astore_1       
        //   275: aload_0        
        //   276: aconst_null    
        //   277: putfield        i80.y:Ljava/lang/Object;
        //   280: aload_0        
        //   281: aload_1        
        //   282: putfield        i80.z:Ljava/lang/Object;
        //   285: aload_0        
        //   286: iconst_2       
        //   287: putfield        i80.x:B
        //   290: aload           5
        //   292: aload_1        
        //   293: invokeinterface wzk.i:(Ljava/io/FileInputStream;)Ljava/lang/Object;
        //   298: astore          5
        //   300: aload           5
        //   302: aload           4
        //   304: if_acmpne       313
        //   307: aload           4
        //   309: astore_1       
        //   310: goto            396
        //   313: aload_1        
        //   314: astore          4
        //   316: aload           5
        //   318: astore_1       
        //   319: aload           4
        //   321: aconst_null    
        //   322: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   325: goto            225
        //   328: astore          4
        //   330: goto            358
        //   333: astore          4
        //   335: aload_1        
        //   336: astore          5
        //   338: aload           4
        //   340: astore_1       
        //   341: aload           5
        //   343: astore          4
        //   345: aload_1        
        //   346: athrow         
        //   347: astore          5
        //   349: aload           4
        //   351: aload_1        
        //   352: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   355: aload           5
        //   357: athrow         
        //   358: aload           4
        //   360: astore_1       
        //   361: aload           4
        //   363: instanceof      Ljava/io/FileNotFoundException;
        //   366: ifeq            386
        //   369: aload           7
        //   371: getfield        rca.a:Ljava/io/File;
        //   374: invokevirtual   java/io/File.getParent:()Ljava/lang/String;
        //   377: aload           4
        //   379: checkcast       Ljava/io/FileNotFoundException;
        //   382: invokestatic    l7r.o:(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;
        //   385: astore_1       
        //   386: aload_1        
        //   387: athrow         
        //   388: aload           5
        //   390: invokeinterface wzk.f:()Ljava/lang/Object;
        //   395: astore_1       
        //   396: aload_1        
        //   397: areturn        
        //   398: aload_0        
        //   399: getfield        i80.z:Ljava/lang/Object;
        //   402: checkcast       Lrv7;
        //   405: astore          5
        //   407: aload_0        
        //   408: getfield        i80.x:B
        //   411: istore_2       
        //   412: iload_2        
        //   413: ifeq            475
        //   416: iload_2        
        //   417: iconst_1       
        //   418: if_icmpeq       468
        //   421: iload_2        
        //   422: iconst_2       
        //   423: if_icmpne       457
        //   426: aload_0        
        //   427: getfield        i80.y:Ljava/lang/Object;
        //   430: checkcast       Lvc6;
        //   433: astore          4
        //   435: aload_1        
        //   436: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   439: aload_1        
        //   440: astore          5
        //   442: goto            592
        //   445: astore          5
        //   447: aload           4
        //   449: astore_1       
        //   450: aload           5
        //   452: astore          4
        //   454: goto            578
        //   457: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   459: invokestatic    en9.q:(Ljava/lang/String;)V
        //   462: aconst_null    
        //   463: astore          4
        //   465: goto            640
        //   468: aload_1        
        //   469: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   472: goto            486
        //   475: aload_1        
        //   476: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   479: aload_0        
        //   480: iconst_1       
        //   481: putfield        i80.x:B
        //   484: aconst_null    
        //   485: astore_1       
        //   486: aload_1        
        //   487: checkcast       Lyci;
        //   490: astore          7
        //   492: aload           6
        //   494: checkcast       Lo1f;
        //   497: astore          6
        //   499: aload           6
        //   501: getfield        o1f.b:Lvc6;
        //   504: astore_1       
        //   505: aload           6
        //   507: getfield        o1f.d:Lhc7;
        //   510: aload_0        
        //   511: invokeinterface f07.getContext:()Lhc7;
        //   516: invokeinterface hc7.F0:(Lhc7;)Lhc7;
        //   521: astore          9
        //   523: new             Lxb0;
        //   526: astore          8
        //   528: aload           8
        //   530: aload           5
        //   532: aload           6
        //   534: aload           7
        //   536: aconst_null    
        //   537: invokespecial   xb0.<init>:(Lrv7;Lo1f;Lyci;Lf07;)V
        //   540: aload_0        
        //   541: aload_1        
        //   542: putfield        i80.y:Ljava/lang/Object;
        //   545: aload_0        
        //   546: iconst_2       
        //   547: putfield        i80.x:B
        //   550: aload           9
        //   552: aload           8
        //   554: aload_0        
        //   555: invokestatic    rhc.f0:(Lhc7;Lzta;Lf07;)Ljava/lang/Object;
        //   558: astore          5
        //   560: aload           5
        //   562: aload           4
        //   564: if_acmpne       570
        //   567: goto            640
        //   570: aload_1        
        //   571: astore          4
        //   573: goto            592
        //   576: astore          4
        //   578: new             Ljpj;
        //   581: dup            
        //   582: aload           4
        //   584: invokespecial   jpj.<init>:(Ljava/lang/Throwable;)V
        //   587: astore          5
        //   589: aload_1        
        //   590: astore          4
        //   592: aload           5
        //   594: invokestatic    kpj.a:(Ljava/lang/Object;)Ljava/lang/Throwable;
        //   597: astore_1       
        //   598: aload_1        
        //   599: ifnonnull       613
        //   602: aload           4
        //   604: aload           5
        //   606: invokevirtual   bqc.S:(Ljava/lang/Object;)Z
        //   609: istore_3       
        //   610: goto            634
        //   613: aload           4
        //   615: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   618: pop            
        //   619: aload           4
        //   621: new             Lcd6;
        //   624: dup            
        //   625: aload_1        
        //   626: iconst_0       
        //   627: invokespecial   cd6.<init>:(Ljava/lang/Throwable;Z)V
        //   630: invokevirtual   bqc.S:(Ljava/lang/Object;)Z
        //   633: istore_3       
        //   634: iload_3        
        //   635: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   638: astore          4
        //   640: aload           4
        //   642: areturn        
        //   643: aload_0        
        //   644: getfield        i80.y:Ljava/lang/Object;
        //   647: checkcast       Lj80;
        //   650: astore          5
        //   652: aload_0        
        //   653: getfield        i80.x:B
        //   656: istore_2       
        //   657: iload_2        
        //   658: ifeq            696
        //   661: iload_2        
        //   662: iconst_1       
        //   663: if_icmpeq       689
        //   666: iload_2        
        //   667: iconst_2       
        //   668: if_icmpne       678
        //   671: aload_1        
        //   672: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   675: goto            792
        //   678: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   680: invokestatic    en9.q:(Ljava/lang/String;)V
        //   683: aconst_null    
        //   684: astore          4
        //   686: goto            797
        //   689: aload_1        
        //   690: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   693: goto            750
        //   696: aload_1        
        //   697: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   700: aload           5
        //   702: getfield        j80.F:Latm;
        //   705: astore_1       
        //   706: aload_1        
        //   707: ifnull          807
        //   710: aload_0        
        //   711: getfield        i80.z:Ljava/lang/Object;
        //   714: checkcast       Ljava/lang/String;
        //   717: astore          7
        //   719: aload           7
        //   721: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   724: pop            
        //   725: aload_0        
        //   726: iconst_1       
        //   727: putfield        i80.x:B
        //   730: aload_1        
        //   731: checkcast       Lntm;
        //   734: bipush          6
        //   736: aload_0        
        //   737: aload           7
        //   739: invokevirtual   ntm.i:(ILh07;Ljava/lang/String;)Ljava/lang/Object;
        //   742: aload           4
        //   744: if_acmpne       750
        //   747: goto            797
        //   750: aload           5
        //   752: getfield        j80.F:Latm;
        //   755: astore_1       
        //   756: aload_1        
        //   757: ifnull          800
        //   760: aload           6
        //   762: checkcast       Ljava/lang/String;
        //   765: astore          5
        //   767: aload_0        
        //   768: iconst_2       
        //   769: putfield        i80.x:B
        //   772: aload_1        
        //   773: checkcast       Lntm;
        //   776: bipush          7
        //   778: aload_0        
        //   779: aload           5
        //   781: invokevirtual   ntm.i:(ILh07;Ljava/lang/String;)Ljava/lang/Object;
        //   784: aload           4
        //   786: if_acmpne       792
        //   789: goto            797
        //   792: getstatic       lqo.a:Llqo;
        //   795: astore          4
        //   797: aload           4
        //   799: areturn        
        //   800: ldc             "storage"
        //   802: invokestatic    mlc.j0:(Ljava/lang/String;)V
        //   805: aconst_null    
        //   806: athrow         
        //   807: ldc             "storage"
        //   809: invokestatic    mlc.j0:(Ljava/lang/String;)V
        //   812: aconst_null    
        //   813: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  87     91     94     98     Any
        //  121    125    132    241    Any
        //  140    153    241    396    Ljava/io/FileNotFoundException;
        //  156    163    132    241    Any
        //  166    171    132    241    Any
        //  174    179    132    241    Any
        //  182    187    132    241    Any
        //  190    200    132    241    Any
        //  219    225    241    396    Ljava/io/FileNotFoundException;
        //  228    230    230    241    Any
        //  232    241    241    396    Ljava/io/FileNotFoundException;
        //  262    275    328    388    Ljava/lang/Exception;
        //  275    300    333    345    Any
        //  319    325    328    388    Ljava/lang/Exception;
        //  345    347    347    358    Any
        //  349    358    328    388    Ljava/lang/Exception;
        //  435    439    445    457    Any
        //  505    560    576    578    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 395 out of bounds for length 395
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.util.Objects.checkIndex(Objects.java:371)
        //     at java.util.ArrayList.get(ArrayList.java:435)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
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
}
