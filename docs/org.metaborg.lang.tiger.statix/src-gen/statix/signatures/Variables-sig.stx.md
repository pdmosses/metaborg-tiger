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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Variables-sig_167_191" id="signatures/Variables-sig_7_31" title="Referenced at ../Tiger-sig.stx line 9"><span class="token sort_ModuleID">signatures/Variables-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_7_26" id="signatures/Base-sig_43_62" title="Defined at ../Base-sig.stx line 1"><span class="token sort_ModuleID">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#VarDec_3452_3458" id="VarDec_130_136" title="Referenced at ../../../../trans/static-semantics.stx line 181, 273"><span class="token sort_OpId">VarDec</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_139_141" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_87_91" id="Type_144_148" title="Defined at ../Base-sig.stx line 11"><span class="token sort_OpId">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_151_154" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_60_63" id="Dec_158_161" title="Defined at ../Base-sig.stx line 8"><span class="token sort_OpId">Dec</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#VarDecNoType_3624_3636" id="VarDecNoType_166_178" title="Referenced at ../../../../trans/static-semantics.stx line 187, 279"><span class="token sort_OpId">VarDecNoType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_181_183" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_186_189" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_60_63" id="Dec_193_196" title="Defined at ../Base-sig.stx line 8"><span class="token sort_OpId">Dec</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#Var_7315_7318" id="Var_201_204" title="Referenced at ../../../../trans/static-semantics.stx line 313, 318, 349"><span class="token sort_OpId">Var</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_207_209" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Var_96_99" id="Var_213_216" title="Defined at ../Base-sig.stx line 12"><span class="token sort_OpId">Var</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#Var2LValue_7304_7314" id="Var2LValue_221_231" title="Referenced at ../../../../trans/static-semantics.stx line 313, 318"><span class="token sort_OpId">Var2LValue</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Var_96_99" id="Var_234_237" title="Defined at ../Base-sig.stx line 12"><span class="token sort_OpId">Var</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_76_82" id="LValue_241_247" title="Defined at ../Base-sig.stx line 10"><span class="token sort_OpId">LValue</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#LValue2Exp_7373_7383" id="LValue2Exp_252_262" title="Referenced at ../../../../trans/static-semantics.stx line 316, 318"><span class="token sort_OpId">LValue2Exp</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#LValue_76_82" id="LValue_265_271" title="Defined at ../Base-sig.stx line 10"><span class="token sort_OpId">LValue</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_275_278" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span>
</code></pre></td></tr></tbody></table></div>