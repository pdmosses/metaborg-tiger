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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Records-sig_13_3" id="signatures/Records-sig_1_8" title="Referenced at ../Tiger-sig.stx line 13"><span class="token sort_Id">signatures/Records-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="Defined at ../Base-sig.stx line 1"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><button class="modal-open" id="Field_9_5" title="Multi-file references" data-urls="#Field_13_19 line 13, 19, 20; ../../../../trans/static-semantics.stx/#Field_433_29 line 433"><span class="token sort_Id">Field</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="InitField_10_5" title="Multi-file references" data-urls="#InitField_14_23 line 14, 22, 23; ../../../../trans/static-semantics.stx/#InitField_455_56 line 455, 461"><span class="token sort_Id">InitField</span></button></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Field-Plhdr_533_17" id="Field-Plhdr_13_5" title="Referenced at ../../../../trans/static-semantics.stx line 533"><span class="token sort_Id">Field-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Field_9_5" id="Field_13_19" title="Defined at line 9"><span class="token sort_Id">Field</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#InitField-Plhdr_519_19" id="InitField-Plhdr_14_5" title="Referenced at ../../../../trans/static-semantics.stx line 519"><span class="token sort_Id">InitField-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#InitField_10_5" id="InitField_14_23" title="Defined at line 10"><span class="token sort_Id">InitField</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#RecordTy_429_17" id="RecordTy_19_5" title="Referenced at ../../../../trans/static-semantics.stx line 429"><span class="token sort_Id">RecordTy</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Field_9_5" id="Field_19_21" title="Defined at line 9"><span class="token sort_Id">Field</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_11_5" id="Type_19_31" title="Defined at ../Base-sig.stx line 11"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Field_436_27" id="Field_20_5" title="Referenced at ../../../../trans/static-semantics.stx line 436"><span class="token sort_Id">Field</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_20_13" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_20_18" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Field_9_5" id="Field_20_24" title="Defined at line 9"><span class="token sort_Id">Field</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#NilExp_442_16" id="NilExp_21_5" title="Referenced at ../../../../trans/static-semantics.stx line 442"><span class="token sort_Id">NilExp</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_21_14" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Record_446_18" id="Record_22_5" title="Referenced at ../../../../trans/static-semantics.stx line 446"><span class="token sort_Id">Record</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_22_14" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#InitField_10_5" id="InitField_22_24" title="Defined at line 10"><span class="token sort_Id">InitField</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_22_38" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#InitField_464_28" id="InitField_23_5" title="Referenced at ../../../../trans/static-semantics.stx line 464"><span class="token sort_Id">InitField</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_23_17" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_23_22" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#InitField_10_5" id="InitField_23_29" title="Defined at line 10"><span class="token sort_Id">InitField</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#FieldVar_480_17" id="FieldVar_24_5" title="Referenced at ../../../../trans/static-semantics.stx line 480"><span class="token sort_Id">FieldVar</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_10_5" id="LValue_24_16" title="Defined at ../Base-sig.stx line 10"><span class="token sort_Id">LValue</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_24_25" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_10_5" id="LValue_24_31" title="Defined at ../Base-sig.stx line 10"><span class="token sort_Id">LValue</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
