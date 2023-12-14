---
title: Numbers-sig.stx
hide:
  - toc
---

# `Numbers-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Numbers-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Numbers-sig.stx "The source file on GitHub"

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
25
26
27
28
29
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Numbers-sig_11_3" id="signatures/Numbers-sig_1_8" title="Referenced at ../Tiger-sig.stx line 11"><span class="token sort_Id">signatures/Numbers-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="Defined at ../Base-sig.stx line 1"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortAlias"><a href="#IntConst_16_11" id="IntConst_9_5" title="Referenced at line 16"><span class="token sort_Id">IntConst</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Int_366_16" id="Int_16_5" title="Referenced at ../../../../trans/static-semantics.stx line 366"><span class="token sort_Id">Int</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#IntConst_9_5" id="IntConst_16_11" title="Defined at line 9"><span class="token sort_Id">IntConst</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_16_23" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Uminus_371_16" id="Uminus_17_5" title="Referenced at ../../../../trans/static-semantics.stx line 371"><span class="token sort_Id">Uminus</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_14" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_21" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Times_378_16" id="Times_18_5" title="Referenced at ../../../../trans/static-semantics.stx line 378"><span class="token sort_Id">Times</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_18_13" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_18_19" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_18_26" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Divide_374_16" id="Divide_19_5" title="Referenced at ../../../../trans/static-semantics.stx line 374"><span class="token sort_Id">Divide</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_14" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_20" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_27" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Plus_386_16" id="Plus_20_5" title="Referenced at ../../../../trans/static-semantics.stx line 386"><span class="token sort_Id">Plus</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_20_12" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_20_18" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_20_25" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Minus_382_16" id="Minus_21_5" title="Referenced at ../../../../trans/static-semantics.stx line 382"><span class="token sort_Id">Minus</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_21_13" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_21_19" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_21_26" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Eq_390_16" id="Eq_22_5" title="Referenced at ../../../../trans/static-semantics.stx line 390"><span class="token sort_Id">Eq</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_22_10" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_22_16" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_22_23" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Neq_396_16" id="Neq_23_5" title="Referenced at ../../../../trans/static-semantics.stx line 396"><span class="token sort_Id">Neq</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_23_11" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_23_17" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_23_24" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Gt_402_16" id="Gt_24_5" title="Referenced at ../../../../trans/static-semantics.stx line 402"><span class="token sort_Id">Gt</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_24_10" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_24_16" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_24_23" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Lt_407_16" id="Lt_25_5" title="Referenced at ../../../../trans/static-semantics.stx line 407"><span class="token sort_Id">Lt</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_25_10" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_25_16" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_25_23" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Geq_411_16" id="Geq_26_5" title="Referenced at ../../../../trans/static-semantics.stx line 411"><span class="token sort_Id">Geq</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_26_11" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_26_17" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_26_24" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Leq_415_16" id="Leq_27_5" title="Referenced at ../../../../trans/static-semantics.stx line 415"><span class="token sort_Id">Leq</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_27_11" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_27_17" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_27_24" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#And_423_16" id="And_28_5" title="Referenced at ../../../../trans/static-semantics.stx line 423"><span class="token sort_Id">And</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_28_11" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_28_17" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_28_24" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Or_419_16" id="Or_29_5" title="Referenced at ../../../../trans/static-semantics.stx line 419"><span class="token sort_Id">Or</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_29_10" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_29_16" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_29_23" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
