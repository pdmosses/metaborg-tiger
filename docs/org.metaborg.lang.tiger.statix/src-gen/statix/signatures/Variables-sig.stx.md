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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Variables-sig_9_3" id="signatures/Variables-sig_1_8" title="a definition with a single reference"><span class="token sort_Id">signatures/Variables-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="VarDec_15_5" title="a definition with multiple references" data-urls="../../../../trans/static-semantics.stx/#VarDec line 181_32, 273_21"><span class="token sort_Id">VarDec</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_15_14" title="a reference to a single-file definition"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_11_5" id="Type_15_19" title="a reference to a single-file definition"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_15_26" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_15_33" title="a reference to a single-file definition"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="VarDecNoType_16_5" title="a definition with multiple references" data-urls="../../../../trans/static-semantics.stx/#VarDecNoType line 187_32, 279_21"><span class="token sort_Id">VarDecNoType</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_16_20" title="a reference to a single-file definition"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_16_25" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_16_32" title="a reference to a single-file definition"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="Var_17_5" title="a definition with multiple references" data-urls="../../../../trans/static-semantics.stx/#Var line 313_28, 318_38, 349_20"><span class="token sort_Id">Var</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_17_11" title="a reference to a single-file definition"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Var_12_5" id="Var_17_17" title="a reference to a single-file definition"><span class="token sort_Id">Var</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="Var2LValue_18_5" title="a definition with multiple references" data-urls="../../../../trans/static-semantics.stx/#Var2LValue line 313_17, 318_27"><span class="token sort_Id">Var2LValue</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Var_12_5" id="Var_18_18" title="a reference to a single-file definition"><span class="token sort_Id">Var</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_10_5" id="LValue_18_25" title="a reference to a single-file definition"><span class="token sort_Id">LValue</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="LValue2Exp_19_5" title="a definition with multiple references" data-urls="../../../../trans/static-semantics.stx/#LValue2Exp line 316_16, 318_16"><span class="token sort_Id">LValue2Exp</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_10_5" id="LValue_19_18" title="a reference to a single-file definition"><span class="token sort_Id">LValue</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_28" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
