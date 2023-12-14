---
title: Control-Flow-sig.stx
hide:
  - toc
---

# `Control-Flow-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Control-Flow-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Control-Flow-sig.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Control-Flow-sig_15_3" id="signatures/Control-Flow-sig_1_8" title="Referenced at ../Tiger-sig.stx line 15"><span class="token sort_Id">signatures/Control-Flow-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="Defined at ../Base-sig.stx line 1"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Seq_331_16" id="Seq_15_5" title="Referenced at ../../../../trans/static-semantics.stx line 331"><span class="token sort_Id">Seq</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_15_16" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_15_24" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#If_333_16" id="If_16_5" title="Referenced at ../../../../trans/static-semantics.stx line 333"><span class="token sort_Id">If</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_16_10" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_16_16" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_16_22" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_16_29" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#IfThen_339_16" id="IfThen_17_5" title="Referenced at ../../../../trans/static-semantics.stx line 339"><span class="token sort_Id">IfThen</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_14" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_20" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_27" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#While_343_16" id="While_18_5" title="Referenced at ../../../../trans/static-semantics.stx line 343"><span class="token sort_Id">While</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_18_13" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_18_19" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_18_26" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#For_349_16" id="For_19_5" title="Referenced at ../../../../trans/static-semantics.stx line 349"><span class="token sort_Id">For</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Var_12_5" id="Var_19_11" title="Defined at ../Base-sig.stx line 12"><span class="token sort_Id">Var</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_17" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_23" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_29" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_19_36" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Break_358_16" id="Break_20_5" title="Referenced at ../../../../trans/static-semantics.stx line 358"><span class="token sort_Id">Break</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_20_13" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Assign_306_16" id="Assign_21_5" title="Referenced at ../../../../trans/static-semantics.stx line 306"><span class="token sort_Id">Assign</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_10_5" id="LValue_21_14" title="Defined at ../Base-sig.stx line 10"><span class="token sort_Id">LValue</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_21_23" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_21_30" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
