import java.util.ArrayList;

public final class eh0 extends m6n implements zta
{
    public Object A;
    public Object B;
    public final Object C;
    public final byte w;
    public boolean x;
    public Object y;
    public Object z;
    
    public eh0(final vqn c, final f07 f07) {
        this.w = 10;
        this.C = c;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final Object c = this.C;
        switch (w) {
            default: {
                final eh0 eh0 = new eh0(this.B, c, f07, (byte)11);
                eh0.y = o;
                return (f07)eh0;
            }
            case 10: {
                return (f07)new eh0((vqn)c, f07);
            }
            case 9: {
                return (f07)new eh0(this.y, this.z, this.A, this.B, c, f07, (byte)9);
            }
            case 8: {
                final eh0 eh2 = new eh0(this.B, c, f07, (byte)8);
                eh2.y = o;
                return (f07)eh2;
            }
            case 7: {
                return (f07)new eh0(this.A, this.B, c, f07, (byte)7);
            }
            case 6: {
                final eh0 eh3 = new eh0(this.A, this.B, c, f07, (byte)6);
                eh3.y = o;
                return (f07)eh3;
            }
            case 5: {
                final eh0 eh4 = new eh0(this.z, this.A, this.B, c, f07, (byte)5);
                eh4.y = o;
                return (f07)eh4;
            }
            case 4: {
                return (f07)new eh0(this.y, this.z, this.A, this.B, c, f07, (byte)4);
            }
            case 3: {
                final eh0 eh5 = new eh0(this.z, this.A, this.B, c, f07, (byte)3);
                eh5.y = o;
                return (f07)eh5;
            }
            case 2: {
                return (f07)new eh0(this.y, this.z, this.A, this.B, c, f07, (byte)2);
            }
            case 1: {
                return (f07)new eh0(this.B, c, f07, (byte)1);
            }
            case 0: {
                final eh0 eh6 = new eh0(this.z, this.A, this.B, c, f07, (byte)0);
                eh6.y = o;
                return (f07)eh6;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 10: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 9: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 8: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 7: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 5: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((eh0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        eh0.w:B
        //     4: istore          4
        //     6: iconst_0       
        //     7: istore_2       
        //     8: iconst_0       
        //     9: istore_3       
        //    10: aconst_null    
        //    11: astore          13
        //    13: aconst_null    
        //    14: astore          9
        //    16: aconst_null    
        //    17: astore          10
        //    19: aconst_null    
        //    20: astore          11
        //    22: aconst_null    
        //    23: astore          18
        //    25: aconst_null    
        //    26: astore          15
        //    28: aconst_null    
        //    29: astore          17
        //    31: aconst_null    
        //    32: astore          12
        //    34: aconst_null    
        //    35: astore          14
        //    37: aconst_null    
        //    38: astore          16
        //    40: aconst_null    
        //    41: astore          8
        //    43: aconst_null    
        //    44: astore          7
        //    46: iload           4
        //    48: tableswitch {
        //                0: 3401
        //                1: 3080
        //                2: 2921
        //                3: 2787
        //                4: 2668
        //                5: 2529
        //                6: 1670
        //                7: 1308
        //                8: 884
        //                9: 690
        //               10: 388
        //          default: 108
        //        }
        //   108: aload_0        
        //   109: getfield        eh0.B:Ljava/lang/Object;
        //   112: checkcast       Lcjo;
        //   115: astore          9
        //   117: aload           9
        //   119: getfield        cjo.c:Lejo;
        //   122: astore          10
        //   124: aload_0        
        //   125: getfield        eh0.y:Ljava/lang/Object;
        //   128: checkcast       Loc7;
        //   131: astore          11
        //   133: getstatic       pc7.v:Lpc7;
        //   136: astore          8
        //   138: aload_0        
        //   139: getfield        eh0.x:Z
        //   142: istore          6
        //   144: iload           6
        //   146: ifeq            194
        //   149: iload           6
        //   151: iconst_1       
        //   152: if_icmpne       183
        //   155: aload_0        
        //   156: getfield        eh0.A:Ljava/lang/Object;
        //   159: checkcast       Lm7d;
        //   162: astore          7
        //   164: aload_0        
        //   165: getfield        eh0.z:Ljava/lang/Object;
        //   168: checkcast       Lcof;
        //   171: astore          8
        //   173: aload_1        
        //   174: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   177: aload           8
        //   179: astore_1       
        //   180: goto            251
        //   183: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   185: invokestatic    en9.q:(Ljava/lang/String;)V
        //   188: aload           7
        //   190: astore_1       
        //   191: goto            371
        //   194: aload_1        
        //   195: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   198: aload           9
        //   200: getfield        cjo.q:Lcof;
        //   203: astore_1       
        //   204: aload_0        
        //   205: getfield        eh0.C:Ljava/lang/Object;
        //   208: checkcast       Lm7d;
        //   211: astore          7
        //   213: aload_0        
        //   214: aload           11
        //   216: putfield        eh0.y:Ljava/lang/Object;
        //   219: aload_0        
        //   220: aload_1        
        //   221: putfield        eh0.z:Ljava/lang/Object;
        //   224: aload_0        
        //   225: aload           7
        //   227: putfield        eh0.A:Ljava/lang/Object;
        //   230: aload_0        
        //   231: iconst_1       
        //   232: putfield        eh0.x:Z
        //   235: aload_1        
        //   236: aload_0        
        //   237: invokevirtual   cof.c:(Lf07;)Ljava/lang/Object;
        //   240: aload           8
        //   242: if_acmpne       251
        //   245: aload           8
        //   247: astore_1       
        //   248: goto            371
        //   251: aload           7
        //   253: invokevirtual   m7d.a:()V
        //   256: aload_1        
        //   257: aconst_null    
        //   258: invokeinterface aof.g:(Ljava/lang/Object;)V
        //   263: aload           10
        //   265: invokevirtual   ejo.f:()Z
        //   268: ifeq            309
        //   271: aload           10
        //   273: invokevirtual   ejo.g:()Landroid/content/SharedPreferences;
        //   276: ifnull          284
        //   279: iconst_1       
        //   280: istore_2       
        //   281: goto            286
        //   284: iconst_0       
        //   285: istore_2       
        //   286: iload_2        
        //   287: ifeq            367
        //   290: aload           10
        //   292: invokevirtual   ejo.i:()Ljava/lang/String;
        //   295: astore_1       
        //   296: aload_1        
        //   297: ifnonnull       367
        //   300: goto            309
        //   303: astore_1       
        //   304: iload_3        
        //   305: istore_2       
        //   306: goto            326
        //   309: aload           9
        //   311: getfield        cjo.f:Lo8k;
        //   314: invokevirtual   o8k.f:()V
        //   317: goto            367
        //   320: astore_1       
        //   321: iconst_1       
        //   322: istore_2       
        //   323: goto            306
        //   326: iload_2        
        //   327: ifeq            337
        //   330: ldc             "Trusted-device cookie drop faulted at store build; the unusable cookie is retained"
        //   332: astore          7
        //   334: goto            344
        //   337: ldc             "Trusted-device row read faulted at store build; keeping the cookie"
        //   339: astore          7
        //   341: goto            334
        //   344: getstatic       uqd.l:Ltqd;
        //   347: astore          8
        //   349: getstatic       adn.a:Ljava/util/List;
        //   352: astore          8
        //   354: aload_1        
        //   355: aload           7
        //   357: getstatic       lpl.w:Llpl;
        //   360: aconst_null    
        //   361: aconst_null    
        //   362: bipush          56
        //   364: invokestatic    adn.f:(Ljava/lang/Throwable;Ljava/lang/String;Llpl;Ljava/util/Map;Ljava/util/List;I)V
        //   367: getstatic       lqo.a:Llqo;
        //   370: astore_1       
        //   371: aload_1        
        //   372: areturn        
        //   373: astore_1       
        //   374: aload_1        
        //   375: athrow         
        //   376: astore          7
        //   378: aload_1        
        //   379: aconst_null    
        //   380: invokeinterface aof.g:(Ljava/lang/Object;)V
        //   385: aload           7
        //   387: athrow         
        //   388: aload_0        
        //   389: getfield        eh0.C:Ljava/lang/Object;
        //   392: checkcast       Lvqn;
        //   395: astore          9
        //   397: getstatic       pc7.v:Lpc7;
        //   400: astore          12
        //   402: aload_0        
        //   403: getfield        eh0.x:Z
        //   406: istore          6
        //   408: iload           6
        //   410: ifeq            479
        //   413: iload           6
        //   415: iconst_1       
        //   416: if_icmpne       468
        //   419: aload_0        
        //   420: getfield        eh0.B:Ljava/lang/Object;
        //   423: checkcast       Ljava/util/Iterator;
        //   426: astore          8
        //   428: aload_0        
        //   429: getfield        eh0.A:Ljava/lang/Object;
        //   432: checkcast       Ljava/util/Collection;
        //   435: astore          7
        //   437: aload_0        
        //   438: getfield        eh0.z:Ljava/lang/Object;
        //   441: checkcast       Lvqn;
        //   444: astore          9
        //   446: aload_0        
        //   447: getfield        eh0.y:Ljava/lang/Object;
        //   450: checkcast       Landroid/content/pm/PackageManager;
        //   453: astore          10
        //   455: aload_1        
        //   456: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   459: aload_1        
        //   460: astore          11
        //   462: aload           7
        //   464: astore_1       
        //   465: goto            667
        //   468: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   470: invokestatic    en9.q:(Ljava/lang/String;)V
        //   473: aload           13
        //   475: astore_1       
        //   476: goto            688
        //   479: aload_1        
        //   480: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   483: aload           9
        //   485: getfield        vqn.a:Landroid/content/Context;
        //   488: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   491: astore          7
        //   493: aload           7
        //   495: new             Landroid/content/Intent;
        //   498: dup            
        //   499: ldc             "com.anthropic.claude.tool.DISCOVER_TOOLS"
        //   501: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   504: sipush          128
        //   507: invokevirtual   android/content/pm/PackageManager.queryIntentContentProviders:(Landroid/content/Intent;I)Ljava/util/List;
        //   510: astore          8
        //   512: aload           8
        //   514: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   517: pop            
        //   518: new             Ljava/util/ArrayList;
        //   521: dup            
        //   522: invokespecial   java/util/ArrayList.<init>:()V
        //   525: astore_1       
        //   526: aload           8
        //   528: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   533: astore          8
        //   535: aload           8
        //   537: invokeinterface java/util/Iterator.hasNext:()Z
        //   542: ifeq            683
        //   545: aload           8
        //   547: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   552: checkcast       Landroid/content/pm/ResolveInfo;
        //   555: getfield        android/content/pm/ResolveInfo.providerInfo:Landroid/content/pm/ProviderInfo;
        //   558: astore          13
        //   560: aload           7
        //   562: aload           13
        //   564: getfield        android/content/pm/ProviderInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   567: invokevirtual   android/content/pm/PackageManager.getApplicationLabel:(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
        //   570: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   573: astore          10
        //   575: aload           13
        //   577: getfield        android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
        //   580: astore          11
        //   582: aload           11
        //   584: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   587: pop            
        //   588: aload           13
        //   590: getfield        android/content/pm/ProviderInfo.authority:Ljava/lang/String;
        //   593: astore          13
        //   595: aload           13
        //   597: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   600: pop            
        //   601: aload_0        
        //   602: aload           7
        //   604: putfield        eh0.y:Ljava/lang/Object;
        //   607: aload_0        
        //   608: aload           9
        //   610: putfield        eh0.z:Ljava/lang/Object;
        //   613: aload_0        
        //   614: aload_1        
        //   615: checkcast       Ljava/util/Collection;
        //   618: putfield        eh0.A:Ljava/lang/Object;
        //   621: aload_0        
        //   622: aload           8
        //   624: putfield        eh0.B:Ljava/lang/Object;
        //   627: aload_0        
        //   628: iconst_1       
        //   629: putfield        eh0.x:Z
        //   632: aload           9
        //   634: aload           11
        //   636: aload           10
        //   638: aload           13
        //   640: aload_0        
        //   641: invokevirtual   vqn.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh07;)Ljava/lang/Object;
        //   644: astore          13
        //   646: aload           7
        //   648: astore          10
        //   650: aload           13
        //   652: astore          11
        //   654: aload           13
        //   656: aload           12
        //   658: if_acmpne       667
        //   661: aload           12
        //   663: astore_1       
        //   664: goto            688
        //   667: aload_1        
        //   668: aload           11
        //   670: checkcast       Ljava/lang/Iterable;
        //   673: invokestatic    h86.t0:(Ljava/util/Collection;Ljava/lang/Iterable;)V
        //   676: aload           10
        //   678: astore          7
        //   680: goto            535
        //   683: aload_1        
        //   684: checkcast       Ljava/util/List;
        //   687: astore_1       
        //   688: aload_1        
        //   689: areturn        
        //   690: getstatic       lqo.a:Llqo;
        //   693: astore          7
        //   695: aload_0        
        //   696: getfield        eh0.y:Ljava/lang/Object;
        //   699: checkcast       Ljta;
        //   702: astore          10
        //   704: getstatic       pc7.v:Lpc7;
        //   707: astore          8
        //   709: aload_0        
        //   710: getfield        eh0.x:Z
        //   713: istore          6
        //   715: iload           6
        //   717: ifeq            744
        //   720: iload           6
        //   722: iconst_1       
        //   723: if_icmpne       733
        //   726: aload_1        
        //   727: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   730: goto            840
        //   733: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   735: invokestatic    en9.q:(Ljava/lang/String;)V
        //   738: aload           9
        //   740: astore_1       
        //   741: goto            882
        //   744: aload_1        
        //   745: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   748: aload           10
        //   750: invokeinterface jta.a:()Ljava/lang/Object;
        //   755: checkcast       Ljava/lang/Boolean;
        //   758: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   761: ifeq            767
        //   764: goto            879
        //   767: aload_0        
        //   768: getfield        eh0.z:Ljava/lang/Object;
        //   771: checkcast       Lx6m;
        //   774: astore          9
        //   776: aload_0        
        //   777: getfield        eh0.A:Ljava/lang/Object;
        //   780: checkcast       Ljava/lang/String;
        //   783: astore_1       
        //   784: aload_0        
        //   785: getfield        eh0.B:Ljava/lang/Object;
        //   788: checkcast       Ljava/lang/String;
        //   791: astore          11
        //   793: getstatic       r6m.w:Lr6m;
        //   796: astore          12
        //   798: aload_0        
        //   799: iconst_1       
        //   800: putfield        eh0.x:Z
        //   803: aload           9
        //   805: new             Lv6m;
        //   808: dup            
        //   809: aload_1        
        //   810: aload           11
        //   812: iconst_1       
        //   813: aload           12
        //   815: invokespecial   v6m.<init>:(Ljava/lang/String;Ljava/lang/String;ZLr6m;)V
        //   818: aload_0        
        //   819: invokevirtual   x6m.a:(Le7m;Lf07;)Ljava/lang/Object;
        //   822: astore          9
        //   824: aload           9
        //   826: astore_1       
        //   827: aload           9
        //   829: aload           8
        //   831: if_acmpne       840
        //   834: aload           8
        //   836: astore_1       
        //   837: goto            882
        //   840: aload_1        
        //   841: checkcast       Ld7m;
        //   844: getstatic       d7m.w:Ld7m;
        //   847: if_acmpne       879
        //   850: aload           10
        //   852: invokeinterface jta.a:()Ljava/lang/Object;
        //   857: checkcast       Ljava/lang/Boolean;
        //   860: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   863: ifne            879
        //   866: aload_0        
        //   867: getfield        eh0.C:Ljava/lang/Object;
        //   870: checkcast       Ljta;
        //   873: invokeinterface jta.a:()Ljava/lang/Object;
        //   878: pop            
        //   879: aload           7
        //   881: astore_1       
        //   882: aload_1        
        //   883: areturn        
        //   884: getstatic       lqo.a:Llqo;
        //   887: astore          9
        //   889: aload_0        
        //   890: getfield        eh0.B:Ljava/lang/Object;
        //   893: checkcast       Luad;
        //   896: astore          11
        //   898: getstatic       pc7.v:Lpc7;
        //   901: astore          8
        //   903: aload_0        
        //   904: getfield        eh0.x:Z
        //   907: istore          6
        //   909: iload           6
        //   911: ifeq            973
        //   914: iload           6
        //   916: iconst_1       
        //   917: if_icmpne       962
        //   920: aload_0        
        //   921: getfield        eh0.A:Ljava/lang/Object;
        //   924: checkcast       Lb4j;
        //   927: astore          8
        //   929: aload_0        
        //   930: getfield        eh0.z:Ljava/lang/Object;
        //   933: checkcast       Lb4j;
        //   936: astore          7
        //   938: aload_0        
        //   939: getfield        eh0.y:Ljava/lang/Object;
        //   942: checkcast       Loc7;
        //   945: astore          10
        //   947: aload_1        
        //   948: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   951: goto            1181
        //   954: astore_1       
        //   955: aload           8
        //   957: astore          9
        //   959: goto            1247
        //   962: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   964: invokestatic    en9.q:(Ljava/lang/String;)V
        //   967: aload           10
        //   969: astore_1       
        //   970: goto            1237
        //   973: aload_1        
        //   974: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   977: aload_0        
        //   978: getfield        eh0.y:Ljava/lang/Object;
        //   981: checkcast       Loc7;
        //   984: astore          13
        //   986: aload           11
        //   988: invokeinterface uad.c:()Lsad;
        //   993: getstatic       sad.v:Lsad;
        //   996: if_acmpne       1005
        //   999: aload           9
        //  1001: astore_1       
        //  1002: goto            1237
        //  1005: new             Ljava/lang/Object;
        //  1008: dup            
        //  1009: invokespecial   java/lang/Object.<init>:()V
        //  1012: astore          7
        //  1014: new             Ljava/lang/Object;
        //  1017: dup            
        //  1018: invokespecial   java/lang/Object.<init>:()V
        //  1021: astore_1       
        //  1022: new             Lcof;
        //  1025: dup            
        //  1026: invokespecial   cof.<init>:()V
        //  1029: astore          14
        //  1031: aload_0        
        //  1032: getfield        eh0.C:Ljava/lang/Object;
        //  1035: checkcast       Lzta;
        //  1038: astore          15
        //  1040: aload_0        
        //  1041: aload           13
        //  1043: putfield        eh0.y:Ljava/lang/Object;
        //  1046: aload_0        
        //  1047: aload           7
        //  1049: putfield        eh0.z:Ljava/lang/Object;
        //  1052: aload_0        
        //  1053: aload_1        
        //  1054: putfield        eh0.A:Ljava/lang/Object;
        //  1057: aload_0        
        //  1058: iconst_1       
        //  1059: putfield        eh0.x:Z
        //  1062: new             Ll13;
        //  1065: astore          10
        //  1067: aload           10
        //  1069: iconst_1       
        //  1070: aload_0        
        //  1071: invokestatic    ljq.K:(Lf07;)Lf07;
        //  1074: invokespecial   l13.<init>:(ILf07;)V
        //  1077: aload           10
        //  1079: invokevirtual   l13.r:()V
        //  1082: new             Lrbj;
        //  1085: astore          12
        //  1087: aload           12
        //  1089: aload_1        
        //  1090: aload           13
        //  1092: aload           14
        //  1094: aload           15
        //  1096: invokespecial   rbj.<init>:(Lb4j;Loc7;Lcof;Lzta;)V
        //  1099: new             Lnr;
        //  1102: astore          14
        //  1104: aload           14
        //  1106: aload_1        
        //  1107: bipush          11
        //  1109: invokespecial   nr.<init>:(Ljava/lang/Object;B)V
        //  1112: new             Lnr;
        //  1115: astore          15
        //  1117: aload           15
        //  1119: aload           10
        //  1121: bipush          12
        //  1123: invokespecial   nr.<init>:(Ljava/lang/Object;B)V
        //  1126: new             Lpbj;
        //  1129: astore          13
        //  1131: aload           13
        //  1133: aload           15
        //  1135: aload           12
        //  1137: aload           14
        //  1139: invokespecial   pbj.<init>:(Lnr;Lrbj;Lnr;)V
        //  1142: aload           7
        //  1144: aload           13
        //  1146: putfield        b4j.v:Ljava/lang/Object;
        //  1149: aload           11
        //  1151: aload           13
        //  1153: invokeinterface uad.h:(Load;)V
        //  1158: aload           10
        //  1160: invokevirtual   l13.p:()Ljava/lang/Object;
        //  1163: astore          10
        //  1165: aload           10
        //  1167: aload           8
        //  1169: if_acmpne       1178
        //  1172: aload           8
        //  1174: astore_1       
        //  1175: goto            1237
        //  1178: aload_1        
        //  1179: astore          8
        //  1181: aload           8
        //  1183: getfield        b4j.v:Ljava/lang/Object;
        //  1186: checkcast       Lopc;
        //  1189: astore_1       
        //  1190: aload_1        
        //  1191: ifnull          1201
        //  1194: aload_1        
        //  1195: aconst_null    
        //  1196: invokeinterface opc.g:(Ljava/util/concurrent/CancellationException;)V
        //  1201: aload           8
        //  1203: aconst_null    
        //  1204: putfield        b4j.v:Ljava/lang/Object;
        //  1207: aload           7
        //  1209: getfield        b4j.v:Ljava/lang/Object;
        //  1212: checkcast       Load;
        //  1215: astore_1       
        //  1216: aload_1        
        //  1217: ifnull          1228
        //  1220: aload           11
        //  1222: aload_1        
        //  1223: invokeinterface uad.e:(Load;)V
        //  1228: aload           7
        //  1230: aconst_null    
        //  1231: putfield        b4j.v:Ljava/lang/Object;
        //  1234: goto            999
        //  1237: aload_1        
        //  1238: areturn        
        //  1239: astore          8
        //  1241: aload_1        
        //  1242: astore          9
        //  1244: aload           8
        //  1246: astore_1       
        //  1247: aload           9
        //  1249: getfield        b4j.v:Ljava/lang/Object;
        //  1252: checkcast       Lopc;
        //  1255: astore          8
        //  1257: aload           8
        //  1259: ifnull          1270
        //  1262: aload           8
        //  1264: aconst_null    
        //  1265: invokeinterface opc.g:(Ljava/util/concurrent/CancellationException;)V
        //  1270: aload           9
        //  1272: aconst_null    
        //  1273: putfield        b4j.v:Ljava/lang/Object;
        //  1276: aload           7
        //  1278: getfield        b4j.v:Ljava/lang/Object;
        //  1281: checkcast       Load;
        //  1284: astore          8
        //  1286: aload           8
        //  1288: ifnull          1300
        //  1291: aload           11
        //  1293: aload           8
        //  1295: invokeinterface uad.e:(Load;)V
        //  1300: aload           7
        //  1302: aconst_null    
        //  1303: putfield        b4j.v:Ljava/lang/Object;
        //  1306: aload_1        
        //  1307: athrow         
        //  1308: getstatic       lqo.a:Llqo;
        //  1311: astore          9
        //  1313: aload_0        
        //  1314: getfield        eh0.A:Ljava/lang/Object;
        //  1317: checkcast       Lvad;
        //  1320: astore          10
        //  1322: getstatic       pc7.v:Lpc7;
        //  1325: astore          8
        //  1327: aload_0        
        //  1328: getfield        eh0.x:Z
        //  1331: istore          6
        //  1333: iload           6
        //  1335: ifeq            1388
        //  1338: iload           6
        //  1340: iconst_1       
        //  1341: if_icmpne       1377
        //  1344: aload_0        
        //  1345: getfield        eh0.z:Ljava/lang/Object;
        //  1348: checkcast       Lb4j;
        //  1351: astore          7
        //  1353: aload_0        
        //  1354: getfield        eh0.y:Ljava/lang/Object;
        //  1357: checkcast       Lb4j;
        //  1360: astore          8
        //  1362: aload_1        
        //  1363: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  1366: goto            1571
        //  1369: astore_1       
        //  1370: aload           8
        //  1372: astore          9
        //  1374: goto            1623
        //  1377: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  1379: invokestatic    en9.q:(Ljava/lang/String;)V
        //  1382: aload           11
        //  1384: astore_1       
        //  1385: goto            1613
        //  1388: aload_1        
        //  1389: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  1392: aload           10
        //  1394: invokevirtual   vad.b:()Ltad;
        //  1397: getstatic       tad.v:Ltad;
        //  1400: if_acmpne       1406
        //  1403: goto            1610
        //  1406: new             Ljava/lang/Object;
        //  1409: dup            
        //  1410: invokespecial   java/lang/Object.<init>:()V
        //  1413: astore_1       
        //  1414: new             Ljava/lang/Object;
        //  1417: dup            
        //  1418: invokespecial   java/lang/Object.<init>:()V
        //  1421: astore          7
        //  1423: getstatic       tad.z:Ltad;
        //  1426: astore          15
        //  1428: aload_0        
        //  1429: getfield        eh0.B:Ljava/lang/Object;
        //  1432: checkcast       Loc7;
        //  1435: astore          14
        //  1437: aload_0        
        //  1438: getfield        eh0.C:Ljava/lang/Object;
        //  1441: checkcast       Lzta;
        //  1444: astore          12
        //  1446: aload_0        
        //  1447: aload_1        
        //  1448: putfield        eh0.y:Ljava/lang/Object;
        //  1451: aload_0        
        //  1452: aload           7
        //  1454: putfield        eh0.z:Ljava/lang/Object;
        //  1457: aload_0        
        //  1458: iconst_1       
        //  1459: putfield        eh0.x:Z
        //  1462: new             Ll13;
        //  1465: astore          11
        //  1467: aload           11
        //  1469: iconst_1       
        //  1470: aload_0        
        //  1471: invokestatic    ljq.K:(Lf07;)Lf07;
        //  1474: invokespecial   l13.<init>:(ILf07;)V
        //  1477: aload           11
        //  1479: invokevirtual   l13.r:()V
        //  1482: getstatic       rad.Companion:Lpad;
        //  1485: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1488: pop            
        //  1489: getstatic       rad.ON_RESUME:Lrad;
        //  1492: astore          13
        //  1494: aload           15
        //  1496: invokestatic    pad.a:(Ltad;)Lrad;
        //  1499: astore          16
        //  1501: new             Lcof;
        //  1504: astore          17
        //  1506: aload           17
        //  1508: invokespecial   cof.<init>:()V
        //  1511: new             Lqbj;
        //  1514: astore          15
        //  1516: aload           15
        //  1518: aload           13
        //  1520: aload_1        
        //  1521: aload           14
        //  1523: aload           16
        //  1525: aload           11
        //  1527: aload           17
        //  1529: aload           12
        //  1531: invokespecial   qbj.<init>:(Lrad;Lb4j;Loc7;Lrad;Ll13;Lcof;Lzta;)V
        //  1534: aload           7
        //  1536: aload           15
        //  1538: putfield        b4j.v:Ljava/lang/Object;
        //  1541: aload           10
        //  1543: aload           15
        //  1545: invokevirtual   vad.a:(Lfbd;)V
        //  1548: aload           11
        //  1550: invokevirtual   l13.p:()Ljava/lang/Object;
        //  1553: astore          11
        //  1555: aload           11
        //  1557: aload           8
        //  1559: if_acmpne       1568
        //  1562: aload           8
        //  1564: astore_1       
        //  1565: goto            1613
        //  1568: aload_1        
        //  1569: astore          8
        //  1571: aload           8
        //  1573: getfield        b4j.v:Ljava/lang/Object;
        //  1576: checkcast       Lopc;
        //  1579: astore_1       
        //  1580: aload_1        
        //  1581: ifnull          1591
        //  1584: aload_1        
        //  1585: aconst_null    
        //  1586: invokeinterface opc.g:(Ljava/util/concurrent/CancellationException;)V
        //  1591: aload           7
        //  1593: getfield        b4j.v:Ljava/lang/Object;
        //  1596: checkcast       Lcbd;
        //  1599: astore_1       
        //  1600: aload_1        
        //  1601: ifnull          1610
        //  1604: aload           10
        //  1606: aload_1        
        //  1607: invokevirtual   vad.d:(Lfbd;)V
        //  1610: aload           9
        //  1612: astore_1       
        //  1613: aload_1        
        //  1614: areturn        
        //  1615: astore          8
        //  1617: aload_1        
        //  1618: astore          9
        //  1620: aload           8
        //  1622: astore_1       
        //  1623: aload           9
        //  1625: getfield        b4j.v:Ljava/lang/Object;
        //  1628: checkcast       Lopc;
        //  1631: astore          8
        //  1633: aload           8
        //  1635: ifnull          1646
        //  1638: aload           8
        //  1640: aconst_null    
        //  1641: invokeinterface opc.g:(Ljava/util/concurrent/CancellationException;)V
        //  1646: aload           7
        //  1648: getfield        b4j.v:Ljava/lang/Object;
        //  1651: checkcast       Lcbd;
        //  1654: astore          7
        //  1656: aload           7
        //  1658: ifnull          1668
        //  1661: aload           10
        //  1663: aload           7
        //  1665: invokevirtual   vad.d:(Lfbd;)V
        //  1668: aload_1        
        //  1669: athrow         
        //  1670: getstatic       pc7.v:Lpc7;
        //  1673: astore          9
        //  1675: aload_0        
        //  1676: getfield        eh0.x:Z
        //  1679: istore          6
        //  1681: iload           6
        //  1683: ifeq            1736
        //  1686: iload           6
        //  1688: iconst_1       
        //  1689: if_icmpne       1725
        //  1692: aload_0        
        //  1693: getfield        eh0.z:Ljava/lang/Object;
        //  1696: checkcast       Lre;
        //  1699: astore          8
        //  1701: aload_0        
        //  1702: getfield        eh0.y:Ljava/lang/Object;
        //  1705: checkcast       Lopc;
        //  1708: astore          7
        //  1710: aload_1        
        //  1711: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  1714: goto            2211
        //  1717: astore_1       
        //  1718: aload           8
        //  1720: astore          9
        //  1722: goto            2352
        //  1725: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  1727: invokestatic    en9.q:(Ljava/lang/String;)V
        //  1730: aload           18
        //  1732: astore_1       
        //  1733: goto            2336
        //  1736: aload_1        
        //  1737: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  1740: aload_0        
        //  1741: getfield        eh0.y:Ljava/lang/Object;
        //  1744: checkcast       Loc7;
        //  1747: invokeinterface oc7.getCoroutineContext:()Lhc7;
        //  1752: invokestatic    x90.x:(Lhc7;)Lopc;
        //  1755: astore_1       
        //  1756: aload_0        
        //  1757: getfield        eh0.A:Ljava/lang/Object;
        //  1760: checkcast       Lj0j;
        //  1763: astore          8
        //  1765: getstatic       j0j.B:Lapm;
        //  1768: astore          7
        //  1770: aload           8
        //  1772: getfield        j0j.d:Ljava/lang/Object;
        //  1775: astore          7
        //  1777: aload           7
        //  1779: dup            
        //  1780: astore          19
        //  1782: monitorenter   
        //  1783: aload           8
        //  1785: getfield        j0j.f:Ljava/lang/Throwable;
        //  1788: astore          10
        //  1790: aload           10
        //  1792: ifnonnull       2521
        //  1795: aload           8
        //  1797: getfield        j0j.w:Lapm;
        //  1800: invokevirtual   apm.getValue:()Ljava/lang/Object;
        //  1803: checkcast       Lg0j;
        //  1806: getstatic       g0j.w:Lg0j;
        //  1809: invokevirtual   java/lang/Enum.compareTo:(Ljava/lang/Enum;)I
        //  1812: ifle            2508
        //  1815: aload           8
        //  1817: getfield        j0j.e:Lopc;
        //  1820: ifnonnull       2495
        //  1823: aload           8
        //  1825: aload_1        
        //  1826: putfield        j0j.e:Lopc;
        //  1829: aload           8
        //  1831: invokevirtual   j0j.C:()Lk13;
        //  1834: ifnull          1850
        //  1837: ldc_w           "called outside of runRecomposeAndApplyChanges"
        //  1840: invokestatic    ti6.a:(Ljava/lang/String;)V
        //  1843: goto            1850
        //  1846: astore_1       
        //  1847: goto            2524
        //  1850: aload           19
        //  1852: monitorexit    
        //  1853: new             Ll0;
        //  1856: dup            
        //  1857: aload_0        
        //  1858: getfield        eh0.A:Ljava/lang/Object;
        //  1861: checkcast       Lj0j;
        //  1864: bipush          27
        //  1866: invokespecial   l0.<init>:(Ljava/lang/Object;B)V
        //  1869: astore          8
        //  1871: getstatic       g8m.a:Lcyl;
        //  1874: invokestatic    g8m.b:(Llta;)Ljava/lang/Object;
        //  1877: pop            
        //  1878: getstatic       g8m.c:Ljava/lang/Object;
        //  1881: astore          7
        //  1883: aload           7
        //  1885: dup            
        //  1886: astore          19
        //  1888: monitorenter   
        //  1889: getstatic       g8m.h:Ljava/util/List;
        //  1892: aload           8
        //  1894: invokestatic    c86.a1:(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;
        //  1897: putstatic       g8m.h:Ljava/util/List;
        //  1900: aload           19
        //  1902: monitorexit    
        //  1903: new             Lre;
        //  1906: dup            
        //  1907: aload           8
        //  1909: bipush          13
        //  1911: invokespecial   re.<init>:(Ljava/lang/Object;B)V
        //  1914: astore          7
        //  1916: aload_0        
        //  1917: getfield        eh0.A:Ljava/lang/Object;
        //  1920: checkcast       Lj0j;
        //  1923: getfield        j0j.A:Leup;
        //  1926: astore          12
        //  1928: getstatic       j0j.B:Lapm;
        //  1931: astore          10
        //  1933: aload           10
        //  1935: invokevirtual   apm.getValue:()Ljava/lang/Object;
        //  1938: checkcast       Ln4h;
        //  1941: astore          8
        //  1943: aload           8
        //  1945: aload           12
        //  1947: invokevirtual   n4h.d:(Ljava/lang/Object;)Ln4h;
        //  1950: astore          11
        //  1952: aload           8
        //  1954: aload           11
        //  1956: if_acmpeq       1971
        //  1959: aload           10
        //  1961: aload           8
        //  1963: aload           11
        //  1965: invokevirtual   apm.j:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1968: ifeq            1928
        //  1971: aload_0        
        //  1972: getfield        eh0.A:Ljava/lang/Object;
        //  1975: checkcast       Lj0j;
        //  1978: astore          10
        //  1980: aload           10
        //  1982: getfield        j0j.d:Ljava/lang/Object;
        //  1985: astore          8
        //  1987: aload           8
        //  1989: dup            
        //  1990: astore          20
        //  1992: monitorenter   
        //  1993: aload           10
        //  1995: invokevirtual   j0j.H:()Ljava/util/List;
        //  1998: astore          10
        //  2000: aload           20
        //  2002: monitorexit    
        //  2003: aload           10
        //  2005: invokeinterface java/util/Collection.size:()I
        //  2010: istore          4
        //  2012: iconst_0       
        //  2013: istore_2       
        //  2014: iload_2        
        //  2015: iload           4
        //  2017: if_icmpge       2141
        //  2020: aload           10
        //  2022: iload_2        
        //  2023: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2028: checkcast       Lyl6;
        //  2031: getfield        yl6.A:Lv5m;
        //  2034: getfield        v5m.x:[Ljava/lang/Object;
        //  2037: astore          11
        //  2039: aload           11
        //  2041: arraylength    
        //  2042: istore          5
        //  2044: iconst_0       
        //  2045: istore_3       
        //  2046: iload_3        
        //  2047: iload           5
        //  2049: if_icmpge       2113
        //  2052: aload           11
        //  2054: iload_3        
        //  2055: aaload         
        //  2056: astore          8
        //  2058: aload           8
        //  2060: instanceof      Lb0j;
        //  2063: ifeq            2076
        //  2066: aload           8
        //  2068: checkcast       Lb0j;
        //  2071: astore          8
        //  2073: goto            2079
        //  2076: aconst_null    
        //  2077: astore          8
        //  2079: aload           8
        //  2081: ifnull          2107
        //  2084: aload           8
        //  2086: getfield        b0j.a:Lc0j;
        //  2089: astore          12
        //  2091: aload           12
        //  2093: ifnull          2107
        //  2096: aload           12
        //  2098: aload           8
        //  2100: aconst_null    
        //  2101: invokeinterface c0j.d:(Lb0j;Ljava/lang/Object;)I
        //  2106: pop            
        //  2107: iinc            3, 1
        //  2110: goto            2046
        //  2113: iinc            2, 1
        //  2116: goto            2014
        //  2119: aload_1        
        //  2120: astore          8
        //  2122: aload           9
        //  2124: astore_1       
        //  2125: aload           7
        //  2127: astore          9
        //  2129: aload           8
        //  2131: astore          7
        //  2133: goto            2352
        //  2136: astore          9
        //  2138: goto            2119
        //  2141: new             Ldjh;
        //  2144: astore          8
        //  2146: aload           8
        //  2148: aload_0        
        //  2149: getfield        eh0.B:Ljava/lang/Object;
        //  2152: checkcast       Li0j;
        //  2155: aload_0        
        //  2156: getfield        eh0.C:Ljava/lang/Object;
        //  2159: checkcast       Lahf;
        //  2162: aconst_null    
        //  2163: iconst_3       
        //  2164: invokespecial   djh.<init>:(Ljava/lang/Object;Ljava/lang/Object;Lf07;B)V
        //  2167: aload_0        
        //  2168: aload_1        
        //  2169: putfield        eh0.y:Ljava/lang/Object;
        //  2172: aload_0        
        //  2173: aload           7
        //  2175: putfield        eh0.z:Ljava/lang/Object;
        //  2178: aload_0        
        //  2179: iconst_1       
        //  2180: putfield        eh0.x:Z
        //  2183: aload_0        
        //  2184: aload           8
        //  2186: invokestatic    ien.m:(Lf07;Lzta;)Ljava/lang/Object;
        //  2189: astore          8
        //  2191: aload           8
        //  2193: aload           9
        //  2195: if_acmpne       2204
        //  2198: aload           9
        //  2200: astore_1       
        //  2201: goto            2336
        //  2204: aload           7
        //  2206: astore          8
        //  2208: aload_1        
        //  2209: astore          7
        //  2211: aload           8
        //  2213: invokevirtual   re.i:()V
        //  2216: aload_0        
        //  2217: getfield        eh0.A:Ljava/lang/Object;
        //  2220: checkcast       Lj0j;
        //  2223: astore          8
        //  2225: aload           8
        //  2227: getfield        j0j.d:Ljava/lang/Object;
        //  2230: astore_1       
        //  2231: aload_1        
        //  2232: dup            
        //  2233: astore          21
        //  2235: monitorenter   
        //  2236: aload           8
        //  2238: getfield        j0j.e:Lopc;
        //  2241: aload           7
        //  2243: if_acmpne       2260
        //  2246: aload           8
        //  2248: aconst_null    
        //  2249: putfield        j0j.e:Lopc;
        //  2252: goto            2260
        //  2255: astore          7
        //  2257: goto            2338
        //  2260: aload           8
        //  2262: invokevirtual   j0j.C:()Lk13;
        //  2265: ifnull          2274
        //  2268: ldc_w           "called outside of runRecomposeAndApplyChanges"
        //  2271: invokestatic    ti6.a:(Ljava/lang/String;)V
        //  2274: aload           21
        //  2276: monitorexit    
        //  2277: getstatic       j0j.B:Lapm;
        //  2280: astore_1       
        //  2281: aload_0        
        //  2282: getfield        eh0.A:Ljava/lang/Object;
        //  2285: checkcast       Lj0j;
        //  2288: getfield        j0j.A:Leup;
        //  2291: astore          8
        //  2293: getstatic       j0j.B:Lapm;
        //  2296: astore          7
        //  2298: aload           7
        //  2300: invokevirtual   apm.getValue:()Ljava/lang/Object;
        //  2303: checkcast       Ln4h;
        //  2306: astore_1       
        //  2307: aload_1        
        //  2308: aload           8
        //  2310: invokevirtual   n4h.j:(Ljava/lang/Object;)Ln4h;
        //  2313: astore          9
        //  2315: aload_1        
        //  2316: aload           9
        //  2318: if_acmpeq       2332
        //  2321: aload           7
        //  2323: aload_1        
        //  2324: aload           9
        //  2326: invokevirtual   apm.j:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2329: ifeq            2293
        //  2332: getstatic       lqo.a:Llqo;
        //  2335: astore_1       
        //  2336: aload_1        
        //  2337: areturn        
        //  2338: aload           21
        //  2340: monitorexit    
        //  2341: aload           7
        //  2343: athrow         
        //  2344: astore          9
        //  2346: aload           20
        //  2348: monitorexit    
        //  2349: aload           9
        //  2351: athrow         
        //  2352: aload           9
        //  2354: invokevirtual   re.i:()V
        //  2357: aload_0        
        //  2358: getfield        eh0.A:Ljava/lang/Object;
        //  2361: checkcast       Lj0j;
        //  2364: astore          9
        //  2366: aload           9
        //  2368: getfield        j0j.d:Ljava/lang/Object;
        //  2371: astore          8
        //  2373: aload           8
        //  2375: dup            
        //  2376: astore          20
        //  2378: monitorenter   
        //  2379: aload           9
        //  2381: getfield        j0j.e:Lopc;
        //  2384: aload           7
        //  2386: if_acmpne       2402
        //  2389: aload           9
        //  2391: aconst_null    
        //  2392: putfield        j0j.e:Lopc;
        //  2395: goto            2402
        //  2398: astore_1       
        //  2399: goto            2484
        //  2402: aload           9
        //  2404: invokevirtual   j0j.C:()Lk13;
        //  2407: ifnull          2416
        //  2410: ldc_w           "called outside of runRecomposeAndApplyChanges"
        //  2413: invokestatic    ti6.a:(Ljava/lang/String;)V
        //  2416: aload           20
        //  2418: monitorexit    
        //  2419: getstatic       j0j.B:Lapm;
        //  2422: astore          7
        //  2424: aload_0        
        //  2425: getfield        eh0.A:Ljava/lang/Object;
        //  2428: checkcast       Lj0j;
        //  2431: getfield        j0j.A:Leup;
        //  2434: astore          7
        //  2436: getstatic       j0j.B:Lapm;
        //  2439: astore          8
        //  2441: aload           8
        //  2443: invokevirtual   apm.getValue:()Ljava/lang/Object;
        //  2446: checkcast       Ln4h;
        //  2449: astore          9
        //  2451: aload           9
        //  2453: aload           7
        //  2455: invokevirtual   n4h.j:(Ljava/lang/Object;)Ln4h;
        //  2458: astore          10
        //  2460: aload           9
        //  2462: aload           10
        //  2464: if_acmpeq       2482
        //  2467: aload           8
        //  2469: aload           9
        //  2471: aload           10
        //  2473: invokevirtual   apm.j:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2476: ifne            2482
        //  2479: goto            2436
        //  2482: aload_1        
        //  2483: athrow         
        //  2484: aload           20
        //  2486: monitorexit    
        //  2487: aload_1        
        //  2488: athrow         
        //  2489: astore_1       
        //  2490: aload           19
        //  2492: monitorexit    
        //  2493: aload_1        
        //  2494: athrow         
        //  2495: new             Ljava/lang/IllegalStateException;
        //  2498: astore_1       
        //  2499: aload_1        
        //  2500: ldc_w           "Recomposer already running"
        //  2503: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  2506: aload_1        
        //  2507: athrow         
        //  2508: new             Ljava/lang/IllegalStateException;
        //  2511: astore_1       
        //  2512: aload_1        
        //  2513: ldc_w           "Recomposer shut down"
        //  2516: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  2519: aload_1        
        //  2520: athrow         
        //  2521: aload           10
        //  2523: athrow         
        //  2524: aload           19
        //  2526: monitorexit    
        //  2527: aload_1        
        //  2528: athrow         
        //  2529: aload_0        
        //  2530: getfield        eh0.y:Ljava/lang/Object;
        //  2533: checkcast       Ljrh;
        //  2536: astore          8
        //  2538: getstatic       pc7.v:Lpc7;
        //  2541: astore          7
        //  2543: aload_0        
        //  2544: getfield        eh0.x:Z
        //  2547: istore          6
        //  2549: iload           6
        //  2551: ifeq            2578
        //  2554: iload           6
        //  2556: iconst_1       
        //  2557: if_icmpne       2567
        //  2560: aload_1        
        //  2561: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2564: goto            2662
        //  2567: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  2569: invokestatic    en9.q:(Ljava/lang/String;)V
        //  2572: aload           15
        //  2574: astore_1       
        //  2575: goto            2666
        //  2578: aload_1        
        //  2579: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2582: new             Lip9;
        //  2585: dup            
        //  2586: aload_0        
        //  2587: getfield        eh0.B:Ljava/lang/Object;
        //  2590: checkcast       Ljta;
        //  2593: aload           8
        //  2595: aload_0        
        //  2596: getfield        eh0.C:Ljava/lang/Object;
        //  2599: checkcast       Lfu4;
        //  2602: invokespecial   ip9.<init>:(Ljta;Ljrh;Lfu4;)V
        //  2605: astore_1       
        //  2606: new             Lh87;
        //  2609: dup            
        //  2610: aload_0        
        //  2611: getfield        eh0.z:Ljava/lang/Object;
        //  2614: checkcast       Ljp9;
        //  2617: aload_0        
        //  2618: getfield        eh0.A:Ljava/lang/Object;
        //  2621: checkcast       Lsej;
        //  2624: aload_1        
        //  2625: invokevirtual   jp9.a:(Lsej;Ltsf;)Liti;
        //  2628: bipush          7
        //  2630: invokespecial   h87.<init>:(Ljava/lang/Object;B)V
        //  2633: astore_1       
        //  2634: aload_0        
        //  2635: aconst_null    
        //  2636: putfield        eh0.y:Ljava/lang/Object;
        //  2639: aload_0        
        //  2640: iconst_1       
        //  2641: putfield        eh0.x:Z
        //  2644: aload           8
        //  2646: aload_1        
        //  2647: aload_0        
        //  2648: invokestatic    uuj.U:(Ljrh;Ljta;Lf07;)Ljava/lang/Object;
        //  2651: aload           7
        //  2653: if_acmpne       2662
        //  2656: aload           7
        //  2658: astore_1       
        //  2659: goto            2666
        //  2662: getstatic       lqo.a:Llqo;
        //  2665: astore_1       
        //  2666: aload_1        
        //  2667: areturn        
        //  2668: getstatic       pc7.v:Lpc7;
        //  2671: astore          7
        //  2673: aload_0        
        //  2674: getfield        eh0.x:Z
        //  2677: istore          6
        //  2679: iload           6
        //  2681: ifeq            2708
        //  2684: iload           6
        //  2686: iconst_1       
        //  2687: if_icmpne       2697
        //  2690: aload_1        
        //  2691: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2694: goto            2781
        //  2697: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  2699: invokestatic    en9.q:(Ljava/lang/String;)V
        //  2702: aload           17
        //  2704: astore_1       
        //  2705: goto            2785
        //  2708: aload_1        
        //  2709: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2712: aload_0        
        //  2713: getfield        eh0.y:Ljava/lang/Object;
        //  2716: checkcast       Lgbd;
        //  2719: astore_1       
        //  2720: new             Lsr;
        //  2723: dup            
        //  2724: aload_0        
        //  2725: getfield        eh0.z:Ljava/lang/Object;
        //  2728: checkcast       Lns8;
        //  2731: aload_0        
        //  2732: getfield        eh0.A:Ljava/lang/Object;
        //  2735: checkcast       Ljava/lang/String;
        //  2738: aload_0        
        //  2739: getfield        eh0.B:Ljava/lang/Object;
        //  2742: checkcast       Landroid/content/Context;
        //  2745: aload_0        
        //  2746: getfield        eh0.C:Ljava/lang/Object;
        //  2749: checkcast       Lxd3;
        //  2752: aconst_null    
        //  2753: invokespecial   sr.<init>:(Lns8;Ljava/lang/String;Landroid/content/Context;Lxd3;Lf07;)V
        //  2756: astore          8
        //  2758: aload_0        
        //  2759: iconst_1       
        //  2760: putfield        eh0.x:Z
        //  2763: aload_1        
        //  2764: aload           8
        //  2766: aload_0        
        //  2767: invokestatic    soh.H:(Lgbd;Lzta;Lm6n;)Ljava/lang/Object;
        //  2770: aload           7
        //  2772: if_acmpne       2781
        //  2775: aload           7
        //  2777: astore_1       
        //  2778: goto            2785
        //  2781: getstatic       lqo.a:Llqo;
        //  2784: astore_1       
        //  2785: aload_1        
        //  2786: areturn        
        //  2787: aload_0        
        //  2788: getfield        eh0.y:Ljava/lang/Object;
        //  2791: checkcast       Ldeo;
        //  2794: astore          8
        //  2796: getstatic       pc7.v:Lpc7;
        //  2799: astore          7
        //  2801: aload_0        
        //  2802: getfield        eh0.x:Z
        //  2805: istore          6
        //  2807: iload           6
        //  2809: ifeq            2836
        //  2812: iload           6
        //  2814: iconst_1       
        //  2815: if_icmpne       2825
        //  2818: aload_1        
        //  2819: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2822: goto            2915
        //  2825: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  2827: invokestatic    en9.q:(Ljava/lang/String;)V
        //  2830: aload           12
        //  2832: astore_1       
        //  2833: goto            2919
        //  2836: aload_1        
        //  2837: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2840: getstatic       beo.w:Lbeo;
        //  2843: astore_1       
        //  2844: new             Ll10;
        //  2847: dup            
        //  2848: aload_0        
        //  2849: getfield        eh0.z:Ljava/lang/Object;
        //  2852: checkcast       Lxw7;
        //  2855: aload_0        
        //  2856: getfield        eh0.A:Ljava/lang/Object;
        //  2859: checkcast       Ljava/util/ArrayList;
        //  2862: aload_0        
        //  2863: getfield        eh0.B:Ljava/lang/Object;
        //  2866: checkcast       Lqzh;
        //  2869: aload_0        
        //  2870: getfield        eh0.C:Ljava/lang/Object;
        //  2873: checkcast       Ljava/util/ArrayList;
        //  2876: aconst_null    
        //  2877: iconst_3       
        //  2878: invokespecial   l10.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf07;B)V
        //  2881: astore          9
        //  2883: aload_0        
        //  2884: aconst_null    
        //  2885: putfield        eh0.y:Ljava/lang/Object;
        //  2888: aload_0        
        //  2889: iconst_1       
        //  2890: putfield        eh0.x:Z
        //  2893: aload           8
        //  2895: aload_1        
        //  2896: aload           9
        //  2898: aload_0        
        //  2899: invokeinterface deo.d:(Lbeo;Lzta;Lf07;)Ljava/lang/Object;
        //  2904: aload           7
        //  2906: if_acmpne       2915
        //  2909: aload           7
        //  2911: astore_1       
        //  2912: goto            2919
        //  2915: getstatic       lqo.a:Llqo;
        //  2918: astore_1       
        //  2919: aload_1        
        //  2920: areturn        
        //  2921: aload_0        
        //  2922: getfield        eh0.y:Ljava/lang/Object;
        //  2925: checkcast       Lj7d;
        //  2928: astore          8
        //  2930: getstatic       pc7.v:Lpc7;
        //  2933: astore          7
        //  2935: aload_0        
        //  2936: getfield        eh0.x:Z
        //  2939: istore          6
        //  2941: iload           6
        //  2943: ifeq            2974
        //  2946: iload           6
        //  2948: iconst_1       
        //  2949: if_icmpne       2963
        //  2952: aload_1        
        //  2953: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2956: goto            3062
        //  2959: astore_1       
        //  2960: goto            3073
        //  2963: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  2965: invokestatic    en9.q:(Ljava/lang/String;)V
        //  2968: aload           14
        //  2970: astore_1       
        //  2971: goto            3071
        //  2974: aload_1        
        //  2975: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  2978: aload_0        
        //  2979: getfield        eh0.z:Ljava/lang/Object;
        //  2982: checkcast       Lbnf;
        //  2985: astore          9
        //  2987: new             Lny1;
        //  2990: astore_1       
        //  2991: aload_1        
        //  2992: aload           9
        //  2994: bipush          8
        //  2996: invokespecial   ny1.<init>:(Lbnf;B)V
        //  2999: aload_1        
        //  3000: invokestatic    ljq.a0:(Ljta;)Ln6k;
        //  3003: astore          9
        //  3005: new             Ll33;
        //  3008: astore_1       
        //  3009: aload_1        
        //  3010: aload           8
        //  3012: aload_0        
        //  3013: getfield        eh0.A:Ljava/lang/Object;
        //  3016: checkcast       Lamn;
        //  3019: aload_0        
        //  3020: getfield        eh0.B:Ljava/lang/Object;
        //  3023: checkcast       Ldkn;
        //  3026: aload_0        
        //  3027: getfield        eh0.C:Ljava/lang/Object;
        //  3030: checkcast       Ly4c;
        //  3033: iconst_3       
        //  3034: invokespecial   l33.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
        //  3037: aload_0        
        //  3038: iconst_1       
        //  3039: putfield        eh0.x:Z
        //  3042: aload           9
        //  3044: aload_1        
        //  3045: aload_0        
        //  3046: invokevirtual   n6k.a:(Ljja;Lf07;)Ljava/lang/Object;
        //  3049: astore_1       
        //  3050: aload_1        
        //  3051: aload           7
        //  3053: if_acmpne       3062
        //  3056: aload           7
        //  3058: astore_1       
        //  3059: goto            3071
        //  3062: aload           8
        //  3064: invokestatic    eqi.V:(Lj7d;)V
        //  3067: getstatic       lqo.a:Llqo;
        //  3070: astore_1       
        //  3071: aload_1        
        //  3072: areturn        
        //  3073: aload           8
        //  3075: invokestatic    eqi.V:(Lj7d;)V
        //  3078: aload_1        
        //  3079: athrow         
        //  3080: getstatic       pc7.v:Lpc7;
        //  3083: astore          7
        //  3085: aload_0        
        //  3086: getfield        eh0.x:Z
        //  3089: istore          6
        //  3091: iload           6
        //  3093: ifeq            3150
        //  3096: iload           6
        //  3098: iconst_1       
        //  3099: if_icmpne       3139
        //  3102: aload_0        
        //  3103: getfield        eh0.A:Ljava/lang/Object;
        //  3106: checkcast       Ljava/lang/String;
        //  3109: astore          7
        //  3111: aload_0        
        //  3112: getfield        eh0.z:Ljava/lang/Object;
        //  3115: checkcast       Ln87;
        //  3118: astore          8
        //  3120: aload_0        
        //  3121: getfield        eh0.y:Ljava/lang/Object;
        //  3124: checkcast       Lcof;
        //  3127: astore          9
        //  3129: aload_1        
        //  3130: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  3133: aload           9
        //  3135: astore_1       
        //  3136: goto            3220
        //  3139: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  3141: invokestatic    en9.q:(Ljava/lang/String;)V
        //  3144: aload           16
        //  3146: astore_1       
        //  3147: goto            3389
        //  3150: aload_1        
        //  3151: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  3154: aload_0        
        //  3155: getfield        eh0.B:Ljava/lang/Object;
        //  3158: checkcast       Ln87;
        //  3161: astore          8
        //  3163: aload           8
        //  3165: getfield        n87.e:Lcof;
        //  3168: astore_1       
        //  3169: aload_0        
        //  3170: getfield        eh0.C:Ljava/lang/Object;
        //  3173: checkcast       Ljava/lang/String;
        //  3176: astore          9
        //  3178: aload_0        
        //  3179: aload_1        
        //  3180: putfield        eh0.y:Ljava/lang/Object;
        //  3183: aload_0        
        //  3184: aload           8
        //  3186: putfield        eh0.z:Ljava/lang/Object;
        //  3189: aload_0        
        //  3190: aload           9
        //  3192: putfield        eh0.A:Ljava/lang/Object;
        //  3195: aload_0        
        //  3196: iconst_1       
        //  3197: putfield        eh0.x:Z
        //  3200: aload_1        
        //  3201: aload_0        
        //  3202: invokevirtual   cof.c:(Lf07;)Ljava/lang/Object;
        //  3205: aload           7
        //  3207: if_acmpne       3216
        //  3210: aload           7
        //  3212: astore_1       
        //  3213: goto            3389
        //  3216: aload           9
        //  3218: astore          7
        //  3220: aload           8
        //  3222: getfield        n87.f:Ljava/util/LinkedHashMap;
        //  3225: astore          10
        //  3227: new             Lcom/anthropic/claude/types/strings/ChatId;
        //  3230: astore          9
        //  3232: aload           9
        //  3234: aload           7
        //  3236: invokespecial   com/anthropic/claude/types/strings/ChatId.<init>:(Ljava/lang/String;)V
        //  3239: aload           10
        //  3241: aload           9
        //  3243: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3246: checkcast       Ljava/lang/Integer;
        //  3249: astore          9
        //  3251: aload           9
        //  3253: ifnull          3270
        //  3256: aload           9
        //  3258: invokevirtual   java/lang/Integer.intValue:()I
        //  3261: istore_2       
        //  3262: goto            3270
        //  3265: astore          7
        //  3267: goto            3391
        //  3270: aload           8
        //  3272: getfield        n87.f:Ljava/util/LinkedHashMap;
        //  3275: astore          9
        //  3277: new             Lcom/anthropic/claude/types/strings/ChatId;
        //  3280: astore          11
        //  3282: aload           11
        //  3284: aload           7
        //  3286: invokespecial   com/anthropic/claude/types/strings/ChatId.<init>:(Ljava/lang/String;)V
        //  3289: new             Ljava/lang/Integer;
        //  3292: astore          10
        //  3294: aload           10
        //  3296: iload_2        
        //  3297: iconst_1       
        //  3298: iadd           
        //  3299: invokespecial   java/lang/Integer.<init>:(I)V
        //  3302: aload           9
        //  3304: aload           11
        //  3306: aload           10
        //  3308: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3313: pop            
        //  3314: iload_2        
        //  3315: ifne            3378
        //  3318: aload           8
        //  3320: getfield        n87.g:Z
        //  3323: ifeq            3378
        //  3326: aload           8
        //  3328: getfield        n87.d:Ljava/util/Map;
        //  3331: astore          8
        //  3333: new             Lcom/anthropic/claude/types/strings/ChatId;
        //  3336: astore          9
        //  3338: aload           9
        //  3340: aload           7
        //  3342: invokespecial   com/anthropic/claude/types/strings/ChatId.<init>:(Ljava/lang/String;)V
        //  3345: aload           8
        //  3347: aload           9
        //  3349: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3354: checkcast       Lx4g;
        //  3357: astore          7
        //  3359: aload           7
        //  3361: ifnull          3378
        //  3364: aload           7
        //  3366: getfield        x4g.b:Luy7;
        //  3369: getfield        uy7.x:Ljava/lang/Object;
        //  3372: checkcast       La09;
        //  3375: invokevirtual   a09.d:()V
        //  3378: aload_1        
        //  3379: aconst_null    
        //  3380: invokeinterface aof.g:(Ljava/lang/Object;)V
        //  3385: getstatic       lqo.a:Llqo;
        //  3388: astore_1       
        //  3389: aload_1        
        //  3390: areturn        
        //  3391: aload_1        
        //  3392: aconst_null    
        //  3393: invokeinterface aof.g:(Ljava/lang/Object;)V
        //  3398: aload           7
        //  3400: athrow         
        //  3401: aload_0        
        //  3402: getfield        eh0.C:Ljava/lang/Object;
        //  3405: checkcast       Lao9;
        //  3408: astore          11
        //  3410: aload_0        
        //  3411: getfield        eh0.B:Ljava/lang/Object;
        //  3414: checkcast       Lcom/anthropic/claude/core/events/b;
        //  3417: astore          10
        //  3419: getstatic       lqo.a:Llqo;
        //  3422: astore          7
        //  3424: aload_0        
        //  3425: getfield        eh0.y:Ljava/lang/Object;
        //  3428: checkcast       Loc7;
        //  3431: astore          12
        //  3433: getstatic       pc7.v:Lpc7;
        //  3436: astore          9
        //  3438: aload_0        
        //  3439: getfield        eh0.x:Z
        //  3442: istore          6
        //  3444: iload           6
        //  3446: ifeq            3481
        //  3449: iload           6
        //  3451: iconst_1       
        //  3452: if_icmpne       3470
        //  3455: aload_1        
        //  3456: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  3459: aload           7
        //  3461: astore_1       
        //  3462: goto            3619
        //  3465: astore          8
        //  3467: goto            3576
        //  3470: ldc             "call to 'resume' before 'invoke' with coroutine"
        //  3472: invokestatic    en9.q:(Ljava/lang/String;)V
        //  3475: aload           8
        //  3477: astore_1       
        //  3478: goto            3619
        //  3481: aload_1        
        //  3482: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //  3485: aload_0        
        //  3486: getfield        eh0.z:Ljava/lang/Object;
        //  3489: checkcast       Ldh0;
        //  3492: getfield        dh0.a:Lpm9;
        //  3495: astore          8
        //  3497: aload_0        
        //  3498: getfield        eh0.A:Ljava/lang/Object;
        //  3501: checkcast       Lcom/anthropic/claude/api/events/EventLoggingRequest;
        //  3504: astore_1       
        //  3505: aload_0        
        //  3506: aload           12
        //  3508: putfield        eh0.y:Ljava/lang/Object;
        //  3511: aload_0        
        //  3512: iconst_1       
        //  3513: putfield        eh0.x:Z
        //  3516: aload           8
        //  3518: getfield        pm9.D:Lic7;
        //  3521: astore          13
        //  3523: new             Lrf0;
        //  3526: astore          12
        //  3528: aload           12
        //  3530: aload           8
        //  3532: aload_1        
        //  3533: aconst_null    
        //  3534: bipush          11
        //  3536: invokespecial   rf0.<init>:(Ljava/lang/Object;Ljava/lang/Object;Lf07;B)V
        //  3539: aload           13
        //  3541: aload           12
        //  3543: aload_0        
        //  3544: invokestatic    rhc.f0:(Lhc7;Lzta;Lf07;)Ljava/lang/Object;
        //  3547: astore_1       
        //  3548: aload_1        
        //  3549: aload           9
        //  3551: if_acmpne       3557
        //  3554: goto            3560
        //  3557: aload           7
        //  3559: astore_1       
        //  3560: aload_1        
        //  3561: aload           9
        //  3563: if_acmpne       3459
        //  3566: aload           9
        //  3568: astore_1       
        //  3569: goto            3619
        //  3572: astore_1       
        //  3573: goto            3621
        //  3576: aload           10
        //  3578: getfield        com/anthropic/claude/core/events/b.g:Lken;
        //  3581: bipush          7
        //  3583: iconst_1       
        //  3584: lconst_0       
        //  3585: aload           11
        //  3587: invokestatic    mlc.L:(Lao9;)Ljava/lang/String;
        //  3590: invokeinterface ken.a:(IIJLjava/lang/String;)V
        //  3595: aload           10
        //  3597: getfield        com/anthropic/claude/core/events/b.l:Lfvd;
        //  3600: aload           11
        //  3602: invokestatic    mlc.L:(Lao9;)Ljava/lang/String;
        //  3605: ldc_w           " store write failed"
        //  3608: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  3611: aload           8
        //  3613: invokevirtual   fvd.a:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3616: goto            3459
        //  3619: aload_1        
        //  3620: areturn        
        //  3621: aload_1        
        //  3622: athrow         
        //  3623: astore_1       
        //  3624: goto            3595
        //  3627: astore_1       
        //  3628: goto            3459
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  251    256    376    388    Any
        //  263    279    373    376    Ljava/util/concurrent/CancellationException;
        //  263    279    303    306    Ljava/lang/Exception;
        //  290    296    373    376    Ljava/util/concurrent/CancellationException;
        //  290    296    303    306    Ljava/lang/Exception;
        //  309    317    373    376    Ljava/util/concurrent/CancellationException;
        //  309    317    320    326    Ljava/lang/Exception;
        //  947    951    954    962    Any
        //  1031   1165   1239   1247   Any
        //  1362   1366   1369   1377   Any
        //  1423   1555   1615   1623   Any
        //  1710   1714   1717   1725   Any
        //  1783   1790   1846   1850   Any
        //  1795   1843   1846   1850   Any
        //  1889   1900   2489   2495   Any
        //  1971   1993   2136   2141   Any
        //  1993   2000   2344   2352   Any
        //  2000   2012   2136   2141   Any
        //  2020   2044   2136   2141   Any
        //  2058   2073   2136   2141   Any
        //  2084   2091   2136   2141   Any
        //  2096   2107   2136   2141   Any
        //  2141   2191   2136   2141   Any
        //  2236   2252   2255   2260   Any
        //  2260   2274   2255   2260   Any
        //  2346   2352   2136   2141   Any
        //  2379   2395   2398   2402   Any
        //  2402   2416   2398   2402   Any
        //  2495   2508   1846   1850   Any
        //  2508   2521   1846   1850   Any
        //  2521   2524   1846   1850   Any
        //  2952   2956   2959   2963   Any
        //  2978   3050   2959   2963   Any
        //  3220   3251   3265   3270   Any
        //  3256   3262   3265   3270   Any
        //  3270   3314   3265   3270   Any
        //  3318   3359   3265   3270   Any
        //  3364   3378   3265   3270   Any
        //  3455   3459   3572   3576   Ljava/util/concurrent/CancellationException;
        //  3455   3459   3465   3631   Ljava/lang/Exception;
        //  3485   3548   3572   3576   Ljava/util/concurrent/CancellationException;
        //  3485   3548   3465   3631   Ljava/lang/Exception;
        //  3576   3595   3623   3627   Any
        //  3595   3616   3627   3631   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_2014:
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
