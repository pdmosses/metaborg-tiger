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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="signatures/Base-sig_1_8" title="a definition with multiple references" data-urls="../Arrays-sig.stx/#signatures/Base-sig line 4_3; ../Bindings-sig.stx/#signatures/Base-sig line 4_3; ../Control-Flow-sig.stx/#signatures/Base-sig line 4_3; ../Functions-sig.stx/#signatures/Base-sig line 4_3; ../Identifiers-sig.stx/#signatures/Base-sig line 4_3; ../Numbers-sig.stx/#signatures/Base-sig line 4_3; ../Records-sig.stx/#signatures/Base-sig line 4_3; ../Strings-sig.stx/#signatures/Base-sig line 4_3; ../Tiger-sig.stx/#signatures/Base-sig line 4_3; ../Types-sig.stx/#signatures/Base-sig line 4_3; ../Variables-sig.stx/#signatures/Base-sig line 4_3"><span class="token sort_Id">signatures/Base-sig</span></button>

<span class="keyword">imports</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><button class="modal-open" id="Dec_8_5" title="a definition with multiple references" data-urls="#Dec line 16_17; ../Bindings-sig.stx/#Dec line 17_16, 18_25; ../Functions-sig.stx/#Dec line 17_40, 18_46; ../Types-sig.stx/#Dec line 15_28; ../Variables-sig.stx/#Dec line 15_33, 16_32; ../../../../trans/static-semantics.stx/#Dec line 177_37, 178_32"><span class="token sort_Id">Dec</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="Exp_9_5" title="a definition with multiple references" data-urls="#Exp line 17_17; ../Arrays-sig.stx/#Exp line 15_18, 15_24, 15_31, 17_26; ../Bindings-sig.stx/#Exp line 17_28, 17_36; ../Control-Flow-sig.stx/#Exp line 15_16, 15_24, 16_10, 16_16, 16_22, 16_29, 17_14, 17_20, 17_27, 18_13, 18_19, 18_26, 19_17, 19_23, 19_29, 19_36, 20_13, 21_23, 21_30; ../Functions-sig.stx/#Exp line 17_33, 18_39, 20_22, 20_30; ../Numbers-sig.stx/#Exp line 16_23, 17_14, 17_21, 18_13, 18_19, 18_26, 19_14, 19_20, 19_27, 20_12, 20_18, 20_25, 21_13, 21_19, 21_26, 22_10, 22_16, 22_23, 23_11, 23_17, 23_24, 24_10, 24_16, 24_23, 25_10, 25_16, 25_23, 26_11, 26_17, 26_24, 27_11, 27_17, 27_24, 28_11, 28_17, 28_24, 29_10, 29_16, 29_23; ../Records-sig.stx/#Exp line 21_14, 22_38, 23_22; ../Strings-sig.stx/#Exp line 17_26; ../Tiger-sig.stx/#Exp line 28_11; ../Variables-sig.stx/#Exp line 15_26, 16_25, 19_28; ../../../../trans/static-semantics.stx/#Exp line 160_24, 164_29"><span class="token sort_Id">Exp</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="LValue_10_5" title="a definition with multiple references" data-urls="#LValue line 18_20; ../Arrays-sig.stx/#LValue line 17_17, 17_33; ../Control-Flow-sig.stx/#LValue line 21_14; ../Records-sig.stx/#LValue line 24_16, 24_31; ../Variables-sig.stx/#LValue line 18_25, 19_18; ../../../../trans/static-semantics.stx/#LValue line 165_24"><span class="token sort_Id">LValue</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="Type_11_5" title="a definition with multiple references" data-urls="#Type line 19_18; ../Arrays-sig.stx/#Type line 16_21; ../Functions-sig.stx/#Type line 18_32, 19_17; ../Records-sig.stx/#Type line 19_31; ../Types-sig.stx/#Type line 15_20, 16_17; ../Variables-sig.stx/#Type line 15_19; ../../../../trans/static-semantics.stx/#Type line 222_24"><span class="token sort_Id">Type</span></button></span>
    <span class="cons_SortDecl"><button class="modal-open" id="Var_12_5" title="a definition with multiple references" data-urls="#Var line 20_17; ../Control-Flow-sig.stx/#Var line 19_11; ../Variables-sig.stx/#Var line 17_17, 18_18"><span class="token sort_Id">Var</span></button></span>
    <span class="cons_SortAlias"><button class="modal-open" id="ID_13_5" title="a definition with multiple references" data-urls="../Arrays-sig.stx/#ID line 15_13, 16_15; ../Functions-sig.stx/#ID line 17_15, 18_14, 19_12, 20_12; ../Records-sig.stx/#ID line 20_13, 20_18, 22_14, 23_17, 24_25; ../Types-sig.stx/#ID line 15_15, 16_11; ../Variables-sig.stx/#ID line 15_14, 16_20, 17_11; ../../../../trans/static-semantics.stx/#ID line 24_27, 25_27, 28_13, 29_13, 37_28, 40_12, 49_24, 50_24, 51_24, 73_25, 74_25, 92_31, 93_31, 95_31, 455_36, 470_22, 470_36"><span class="token sort_Id">ID</span></button> <span class="operator">=</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Dec-Plhdr_525_15" id="Dec-Plhdr_16_5" title="a definition with a single reference"><span class="token sort_Id">Dec-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Dec_8_5" id="Dec_16_17" title="a reference to a single-file definition"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Exp-Plhdr_535_16" id="Exp-Plhdr_17_5" title="a definition with a single reference"><span class="token sort_Id">Exp-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_9_5" id="Exp_17_17" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#LValue-Plhdr_523_17" id="LValue-Plhdr_18_5" title="a definition with a single reference"><span class="token sort_Id">LValue-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#LValue_10_5" id="LValue_18_20" title="a reference to a single-file definition"><span class="token sort_Id">LValue</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Type-Plhdr_527_17" id="Type-Plhdr_19_5" title="a definition with a single reference"><span class="token sort_Id">Type-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_11_5" id="Type_19_18" title="a reference to a single-file definition"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><span id="Var-Plhdr_20_5" title="a definition with no references"><span class="token sort_Id">Var-Plhdr</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Var_12_5" id="Var_20_17" title="a reference to a single-file definition"><span class="token sort_Id">Var</span></a></span></span>

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
