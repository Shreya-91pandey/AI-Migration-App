public abstract class xog
{
    public y80 v;
    public boolean w;
    public he2 x;
    public float y;
    public qzc z;
    
    public xog() {
        this.y = 1.0f;
        this.z = qzc.v;
    }
    
    public boolean c(final float n) {
        return false;
    }
    
    public boolean e(final he2 he2) {
        return false;
    }
    
    public void f(final qzc qzc) {
    }
    
    public final void g(final cw8 p0, final long p1, final float p2, final he2 p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        xog.y:F
        //     4: fload           4
        //     6: fcmpg          
        //     7: ifne            13
        //    10: goto            93
        //    13: aload_0        
        //    14: fload           4
        //    16: invokevirtual   xog.c:(F)Z
        //    19: ifne            87
        //    22: aload_0        
        //    23: getfield        xog.v:Ly80;
        //    26: astore          12
        //    28: fload           4
        //    30: fconst_1       
        //    31: fcmpg          
        //    32: ifne            55
        //    35: aload           12
        //    37: ifnull          47
        //    40: aload           12
        //    42: fload           4
        //    44: invokevirtual   y80.d:(F)V
        //    47: aload_0        
        //    48: iconst_0       
        //    49: putfield        xog.w:Z
        //    52: goto            87
        //    55: aload           12
        //    57: astore          11
        //    59: aload           12
        //    61: ifnonnull       75
        //    64: invokestatic    uoo.d:()Ly80;
        //    67: astore          11
        //    69: aload_0        
        //    70: aload           11
        //    72: putfield        xog.v:Ly80;
        //    75: aload           11
        //    77: fload           4
        //    79: invokevirtual   y80.d:(F)V
        //    82: aload_0        
        //    83: iconst_1       
        //    84: putfield        xog.w:Z
        //    87: aload_0        
        //    88: fload           4
        //    90: putfield        xog.y:F
        //    93: aload_0        
        //    94: getfield        xog.x:Lhe2;
        //    97: aload           5
        //    99: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   102: ifne            182
        //   105: aload_0        
        //   106: aload           5
        //   108: invokevirtual   xog.e:(Lhe2;)Z
        //   111: ifne            176
        //   114: aload_0        
        //   115: getfield        xog.v:Ly80;
        //   118: astore          12
        //   120: aload           5
        //   122: ifnonnull       144
        //   125: aload           12
        //   127: ifnull          136
        //   130: aload           12
        //   132: aconst_null    
        //   133: invokevirtual   y80.g:(Lhe2;)V
        //   136: aload_0        
        //   137: iconst_0       
        //   138: putfield        xog.w:Z
        //   141: goto            176
        //   144: aload           12
        //   146: astore          11
        //   148: aload           12
        //   150: ifnonnull       164
        //   153: invokestatic    uoo.d:()Ly80;
        //   156: astore          11
        //   158: aload_0        
        //   159: aload           11
        //   161: putfield        xog.v:Ly80;
        //   164: aload           11
        //   166: aload           5
        //   168: invokevirtual   y80.g:(Lhe2;)V
        //   171: aload_0        
        //   172: iconst_1       
        //   173: putfield        xog.w:Z
        //   176: aload_0        
        //   177: aload           5
        //   179: putfield        xog.x:Lhe2;
        //   182: aload_1        
        //   183: invokeinterface cw8.getLayoutDirection:()Lqzc;
        //   188: astore          5
        //   190: aload_0        
        //   191: getfield        xog.z:Lqzc;
        //   194: aload           5
        //   196: if_acmpeq       211
        //   199: aload_0        
        //   200: aload           5
        //   202: invokevirtual   xog.f:(Lqzc;)V
        //   205: aload_0        
        //   206: aload           5
        //   208: putfield        xog.z:Lqzc;
        //   211: aload_1        
        //   212: invokeinterface cw8.i:()J
        //   217: bipush          32
        //   219: lshr           
        //   220: l2i            
        //   221: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   224: fstore          6
        //   226: lload_2        
        //   227: bipush          32
        //   229: lshr           
        //   230: l2i            
        //   231: istore          9
        //   233: fload           6
        //   235: iload           9
        //   237: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   240: fsub           
        //   241: fstore          6
        //   243: aload_1        
        //   244: invokeinterface cw8.i:()J
        //   249: ldc2_w          4294967295
        //   252: land           
        //   253: l2i            
        //   254: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   257: fstore          7
        //   259: lload_2        
        //   260: ldc2_w          4294967295
        //   263: land           
        //   264: l2i            
        //   265: istore          10
        //   267: fload           7
        //   269: iload           10
        //   271: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   274: fsub           
        //   275: fstore          7
        //   277: aload_1        
        //   278: invokeinterface cw8.B0:()Lzn0;
        //   283: getfield        zn0.v:Ljava/lang/Object;
        //   286: checkcast       Ljy7;
        //   289: fconst_0       
        //   290: fconst_0       
        //   291: fload           6
        //   293: fload           7
        //   295: invokevirtual   jy7.u:(FFFF)V
        //   298: fload           4
        //   300: fconst_0       
        //   301: fcmpl          
        //   302: ifle            488
        //   305: iload           9
        //   307: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   310: fconst_0       
        //   311: fcmpl          
        //   312: ifle            488
        //   315: iload           10
        //   317: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   320: fconst_0       
        //   321: fcmpl          
        //   322: ifle            488
        //   325: aload_0        
        //   326: getfield        xog.w:Z
        //   329: ifeq            454
        //   332: iload           9
        //   334: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   337: fstore          4
        //   339: iload           10
        //   341: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   344: fstore          8
        //   346: fload           4
        //   348: invokestatic    java/lang/Float.floatToRawIntBits:(F)I
        //   351: i2l            
        //   352: lstore_2       
        //   353: lconst_0       
        //   354: fload           8
        //   356: invokestatic    java/lang/Float.floatToRawIntBits:(F)I
        //   359: i2l            
        //   360: ldc2_w          4294967295
        //   363: land           
        //   364: lload_2        
        //   365: bipush          32
        //   367: lshl           
        //   368: lor            
        //   369: invokestatic    rml.f:(JJ)Lk2j;
        //   372: astore          13
        //   374: aload_1        
        //   375: invokeinterface cw8.B0:()Lzn0;
        //   380: invokevirtual   zn0.t:()Lx13;
        //   383: astore          12
        //   385: aload_0        
        //   386: getfield        xog.v:Ly80;
        //   389: astore          11
        //   391: aload           11
        //   393: astore          5
        //   395: aload           11
        //   397: ifnonnull       411
        //   400: invokestatic    uoo.d:()Ly80;
        //   403: astore          5
        //   405: aload_0        
        //   406: aload           5
        //   408: putfield        xog.v:Ly80;
        //   411: aload           12
        //   413: aload           13
        //   415: aload           5
        //   417: invokeinterface x13.r:(Lk2j;Ly80;)V
        //   422: aload_0        
        //   423: aload_1        
        //   424: invokevirtual   xog.j:(Lcw8;)V
        //   427: aload           12
        //   429: invokeinterface x13.p:()V
        //   434: goto            488
        //   437: astore          5
        //   439: goto            462
        //   442: astore          5
        //   444: aload           12
        //   446: invokeinterface x13.p:()V
        //   451: aload           5
        //   453: athrow         
        //   454: aload_0        
        //   455: aload_1        
        //   456: invokevirtual   xog.j:(Lcw8;)V
        //   459: goto            488
        //   462: aload_1        
        //   463: invokeinterface cw8.B0:()Lzn0;
        //   468: getfield        zn0.v:Ljava/lang/Object;
        //   471: checkcast       Ljy7;
        //   474: fconst_0       
        //   475: fconst_0       
        //   476: fload           6
        //   478: fneg           
        //   479: fload           7
        //   481: fneg           
        //   482: invokevirtual   jy7.u:(FFFF)V
        //   485: aload           5
        //   487: athrow         
        //   488: aload_1        
        //   489: invokeinterface cw8.B0:()Lzn0;
        //   494: getfield        zn0.v:Ljava/lang/Object;
        //   497: checkcast       Ljy7;
        //   500: fconst_0       
        //   501: fconst_0       
        //   502: fload           6
        //   504: fneg           
        //   505: fload           7
        //   507: fneg           
        //   508: invokevirtual   jy7.u:(FFFF)V
        //   511: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  305    391    437    442    Any
        //  400    411    437    442    Any
        //  411    427    442    454    Any
        //  427    434    437    442    Any
        //  444    454    437    442    Any
        //  454    459    437    442    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0411:
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
    
    public long i() {
        return 9205357640488583168L;
    }
    
    public void j(final cw8 cw8) {
    }
}
