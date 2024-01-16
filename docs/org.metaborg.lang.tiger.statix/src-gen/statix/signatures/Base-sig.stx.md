---
title: Base-sig.stx
hide:
  - toc
---

# `Base-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Base-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Base-sig.stx "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="signatures/Base-sig_1_8" title="Multi-file references" data-urls="../Arrays-sig.stx/#signatures/Base-sig_4_3 line 4; ../Bindings-sig.stx/#signatures/Base-sig_4_3 line 4; ../Control-Flow-sig.stx/#signatures/Base-sig_4_3 line 4; ../Functions-sig.stx/#signatures/Base-sig_4_3 line 4; ../Identifiers-sig.stx/#signatures/Base-sig_4_3 line 4; ../Numbers-sig.stx/#signatures/Base-sig_4_3 line 4; ../Records-sig.stx/#signatures/Base-sig_4_3 line 4; ../Strings-sig.stx/#signatures/Base-sig_4_3 line 4; ../Tiger-sig.stx/#signatures/Base-sig_4_3 line 4; ../Types-sig.stx/#signatures/Base-sig_4_3 line 4; ../Variables-sig.stx/#signatures/Base-sig_4_3 line 4"><span class="token sort_Id">signatures/Base-sig</span></button>

<span class="keyword">imports</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><button class="modal-open" id="Dec_8_5" title="Multi-file references" data-urls="#Dec_16_17 line 16; ../Bindings-sig.stx/#Dec_17_16 line 17, 18; ../Functions-sig.stx/#Dec_17_40 line 17, 18; ../Types-sig.stx/#Dec_15_28 line 15; ../Variables-sig.stx/#Dec_15_33 line 15, 16; ../../../../trans/static-semantics.stx/#Dec_177_37 line 177, 178"><span class="token sort_Id">Dec</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="Exp_9_5" title="Multi-file references" data-urls="#Exp_17_17 line 17; ../Arrays-sig.stx/#Exp_15_18 line 15, 17; ../Bindings-sig.stx/#Exp_17_28 line 17; ../Control-Flow-sig.stx/#Exp_15_16 line 15, 16, 17, 18, 19, 20, 21; ../Functions-sig.stx/#Exp_17_33 line 17, 18, 20; ../Numbers-sig.stx/#Exp_16_23 line 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29; ../Records-sig.stx/#Exp_21_14 line 21, 22, 23; ../Strings-sig.stx/#Exp_17_26 line 17; ../Tiger-sig.stx/#Exp_28_11 line 28; ../Variables-sig.stx/#Exp_15_26 line 15, 16, 19; ../../../../trans/static-semantics.stx/#Exp_160_24 line 160, 164"><span class="token sort_Id">Exp</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="LValue_10_5" title="Multi-file references" data-urls="#LValue_18_20 line 18; ../Arrays-sig.stx/#LValue_17_17 line 17; ../Control-Flow-sig.stx/#LValue_21_14 line 21; ../Records-sig.stx/#LValue_24_16 line 24; ../Variables-sig.stx/#LValue_18_25 line 18, 19; ../../../../trans/static-semantics.stx/#LValue_165_24 line 165"><span class="token sort_Id">LValue</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="Type_11_5" title="Multi-file references" data-urls="#Type_19_18 line 19; ../Arrays-sig.stx/#Type_16_21 line 16; ../Functions-sig.stx/#Type_18_32 line 18, 19; ../Records-sig.stx/#Type_19_31 line 19; ../Types-sig.stx/#Type_15_20 line 15, 16; ../Variables-sig.stx/#Type_15_19 line 15; ../../../../trans/static-semantics.stx/#Type_222_24 line 222"><span class="token sort_Id">Type</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="Var_12_5" title="Multi-file references" data-urls="#Var_20_17 line 20; ../Control-Flow-sig.stx/#Var_19_11 line 19; ../Variables-sig.stx/#Var_17_17 line 17, 18"><span class="token sort_Id">Var</span></button></span>
    <span class="cons_SortAlias"><button class="modal-open" id="ID_13_5" title="Multi-file references" data-urls="../Arrays-sig.stx/#ID_15_13 line 15, 16; ../Functions-sig.stx/#ID_17_15 line 17, 18, 19, 20; ../Records-sig.stx/#ID_20_13 line 20, 22, 23, 24; ../Types-sig.stx/#ID_15_15 line 15, 16; ../Variables-sig.stx/#ID_15_14 line 15, 16, 17; ../../../../trans/static-semantics.stx/#ID_24_27 line 24, 25, 28, 29, 37, 40, 49, 50, 51, 73, 74, 92, 93, 95, 455, 470"><span class="token sort_Id">ID</span></button> <span class="operator">=</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Dec-Plhdr_525_15" id="Dec-Plhdr_16_5" title="Referenced at ../../../../trans/static-semantics.stx line 525"><span class="token sort_Id">Dec-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Dec_8_5" id="Dec_16_17" title="Defined at line 8"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Exp-Plhdr_535_16" id="Exp-Plhdr_17_5" title="Referenced at ../../../../trans/static-semantics.stx line 535"><span class="token sort_Id">Exp-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_9_5" id="Exp_17_17" title="Defined at line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#LValue-Plhdr_523_17" id="LValue-Plhdr_18_5" title="Referenced at ../../../../trans/static-semantics.stx line 523"><span class="token sort_Id">LValue-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#LValue_10_5" id="LValue_18_20" title="Defined at line 10"><span class="token sort_Id">LValue</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Type-Plhdr_527_17" id="Type-Plhdr_19_5" title="Referenced at ../../../../trans/static-semantics.stx line 527"><span class="token sort_Id">Type-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_11_5" id="Type_19_18" title="Defined at line 11"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><span id="Var-Plhdr_20_5" title="Not referenced"><span class="token sort_Id">Var-Plhdr</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Var_12_5" id="Var_20_17" title="Defined at line 12"><span class="token sort_Id">Var</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
