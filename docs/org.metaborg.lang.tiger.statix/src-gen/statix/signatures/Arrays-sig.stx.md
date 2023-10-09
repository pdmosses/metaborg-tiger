---
title: Arrays-sig.stx
hide:
  - toc
---

# `Arrays-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Arrays-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Arrays-sig.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Arrays-sig_296_317" id="signatures/Arrays-sig_7_28" title="Referenced at ../Tiger-sig.stx line 14"><span class="token sort_ModuleID">signatures/Arrays-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_7_26" id="signatures/Base-sig_40_59" title="Defined at ../Base-sig.stx line 1"><span class="token sort_ModuleID">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#Array_6820_6825" id="Array_127_132" title="Referenced at ../../../../trans/static-semantics.stx line 292"><span class="token sort_OpId">Array</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_135_137" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_140_143" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_146_149" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_153_156" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#ArrayTy_6652_6659" id="ArrayTy_161_168" title="Referenced at ../../../../trans/static-semantics.stx line 286"><span class="token sort_OpId">ArrayTy</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_171_173" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_87_91" id="Type_177_181" title="Defined at ../Base-sig.stx line 11"><span class="token sort_OpId">Type</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#Subscript_7028_7037" id="Subscript_186_195" title="Referenced at ../../../../trans/static-semantics.stx line 300"><span class="token sort_OpId">Subscript</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_76_82" id="LValue_198_204" title="Defined at ../Base-sig.stx line 10"><span class="token sort_OpId">LValue</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_207_210" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_76_82" id="LValue_214_220" title="Defined at ../Base-sig.stx line 10"><span class="token sort_OpId">LValue</span></a></span>
</code></pre></td></tr></tbody></table></div>