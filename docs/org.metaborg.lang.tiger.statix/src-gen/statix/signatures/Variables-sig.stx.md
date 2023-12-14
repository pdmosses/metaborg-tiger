---
title: Variables-sig.stx
hide:
  - toc
---

# `Variables-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Variables-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Variables-sig.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Variables-sig_9_3" id="signatures/Variables-sig_1_8" title="Referenced at ../Tiger-sig.stx line 9"><span class="token sort_Id">signatures/Variables-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="Defined at ../Base-sig.stx line 1"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#VarDec_181_32" id="VarDec_15_5" title="Referenced at ../../../../trans/static-semantics.stx line 181, 273"><span class="token sort_Id">VarDec</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_15_14" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_11_5" id="Type_15_19" title="Defined at ../Base-sig.stx line 11"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_15_26" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_15_33" title="Defined at ../Base-sig.stx line 8"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#VarDecNoType_187_32" id="VarDecNoType_16_5" title="Referenced at ../../../../trans/static-semantics.stx line 187, 279"><span class="token sort_Id">VarDecNoType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_16_20" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_16_25" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_16_32" title="Defined at ../Base-sig.stx line 8"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Var_313_28" id="Var_17_5" title="Referenced at ../../../../trans/static-semantics.stx line 313, 318, 349"><span class="token sort_Id">Var</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_17_11" title="Defined at ../Base-sig.stx line 13"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Var_12_5" id="Var_17_17" title="Defined at ../Base-sig.stx line 12"><span class="token sort_Id">Var</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Var2LValue_313_17" id="Var2LValue_18_5" title="Referenced at ../../../../trans/static-semantics.stx line 313, 318"><span class="token sort_Id">Var2LValue</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Var_12_5" id="Var_18_18" title="Defined at ../Base-sig.stx line 12"><span class="token sort_Id">Var</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_10_5" id="LValue_18_25" title="Defined at ../Base-sig.stx line 10"><span class="token sort_Id">LValue</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#LValue2Exp_316_16" id="LValue2Exp_19_5" title="Referenced at ../../../../trans/static-semantics.stx line 316, 318"><span class="token sort_Id">LValue2Exp</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_10_5" id="LValue_19_18" title="Defined at ../Base-sig.stx line 10"><span class="token sort_Id">LValue</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_28" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
