---
title: Records-sig.stx
hide:
  - toc
---

# `Records-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Records-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Records-sig.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Records-sig_271_293" id="signatures/Records-sig_7_29" title="Referenced at ../Tiger-sig.stx line 13"><span class="token sort_Id">signatures/Records-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_7_26" id="signatures/Base-sig_41_60" title="Defined at ../Base-sig.stx line 1"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#Field_139_144" id="Field_85_90" title="Referenced at line 13, 19, 20; ../../../../trans/static-semantics.stx line 433"><span class="token sort_Id">Field</span></a></span>
    <span class="cons_SortDecl"><a href="#InitField_167_176" id="InitField_95_104" title="Referenced at line 14, 22, 23; ../../../../trans/static-semantics.stx line 455, 461"><span class="token sort_Id">InitField</span></a></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Field-Plhdr_12871_12882" id="Field-Plhdr_125_136" title="Referenced at ../../../../trans/static-semantics.stx line 533"><span class="token sort_Id">Field-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Field_85_90" id="Field_139_144" title="Defined at line 9"><span class="token sort_Id">Field</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#InitField-Plhdr_12607_12622" id="InitField-Plhdr_149_164" title="Referenced at ../../../../trans/static-semantics.stx line 519"><span class="token sort_Id">InitField-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#InitField_95_104" id="InitField_167_176" title="Defined at line 10"><span class="token sort_Id">InitField</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#RecordTy_10102_10110" id="RecordTy_208_216" title="Referenced at ../../../../trans/static-semantics.stx line 429"><span class="token sort_Id">RecordTy</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Field_85_90" id="Field_224_229" title="Defined at line 9"><span class="token sort_Id">Field</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_87_91" id="Type_234_238" title="Defined at ../Base-sig.stx line 11"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Field_10287_10292" id="Field_243_248" title="Referenced at ../../../../trans/static-semantics.stx line 436"><span class="token sort_Id">Field</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_251_253" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_256_258" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Field_85_90" id="Field_262_267" title="Defined at line 9"><span class="token sort_Id">Field</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#NilExp_10411_10417" id="NilExp_272_278" title="Referenced at ../../../../trans/static-semantics.stx line 442"><span class="token sort_Id">NilExp</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_281_284" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Record_10474_10480" id="Record_289_295" title="Referenced at ../../../../trans/static-semantics.stx line 446"><span class="token sort_Id">Record</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_298_300" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#InitField_95_104" id="InitField_308_317" title="Defined at line 10"><span class="token sort_Id">InitField</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_322_325" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#InitField_11004_11013" id="InitField_330_339" title="Referenced at ../../../../trans/static-semantics.stx line 464"><span class="token sort_Id">InitField</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_342_344" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_347_350" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#InitField_95_104" id="InitField_354_363" title="Defined at line 10"><span class="token sort_Id">InitField</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#FieldVar_11471_11479" id="FieldVar_368_376" title="Referenced at ../../../../trans/static-semantics.stx line 480"><span class="token sort_Id">FieldVar</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_76_82" id="LValue_379_385" title="Defined at ../Base-sig.stx line 10"><span class="token sort_Id">LValue</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_388_390" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_76_82" id="LValue_394_400" title="Defined at ../Base-sig.stx line 10"><span class="token sort_Id">LValue</span></a></span></span>
</code></pre></td></tr></tbody></table></div>