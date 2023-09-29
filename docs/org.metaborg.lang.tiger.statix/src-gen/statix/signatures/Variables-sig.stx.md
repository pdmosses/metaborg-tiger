---
title: Variables-sig.stx
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx#signatures/Variables-sig_167_191" id="signatures/Variables-sig_7_31" title="Referenced at ../Tiger-sig.stx line 9">signatures/Variables-sig</a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx#signatures/Base-sig_7_26" id="signatures/Base-sig_43_62" title="Defined at ../Base-sig.stx line 1">signatures/Base-sig</a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    VarDec : <a href="../Base-sig.stx#ID_104_106" id="ID_139_141" title="Defined at ../Base-sig.stx line 13">ID</a> * <a href="../Base-sig.stx#Type_87_91" id="Type_144_148" title="Defined at ../Base-sig.stx line 11">Type</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_151_154" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Dec_60_63" id="Dec_158_161" title="Defined at ../Base-sig.stx line 8">Dec</a>
    VarDecNoType : <a href="../Base-sig.stx#ID_104_106" id="ID_181_183" title="Defined at ../Base-sig.stx line 13">ID</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_186_189" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Dec_60_63" id="Dec_193_196" title="Defined at ../Base-sig.stx line 8">Dec</a>
    Var : <a href="../Base-sig.stx#ID_104_106" id="ID_207_209" title="Defined at ../Base-sig.stx line 13">ID</a> -&gt; <a href="../Base-sig.stx#Var_96_99" id="Var_213_216" title="Defined at ../Base-sig.stx line 12">Var</a>
    Var2LValue : <a href="../Base-sig.stx#Var_96_99" id="Var_234_237" title="Defined at ../Base-sig.stx line 12">Var</a> -&gt; <a href="../Base-sig.stx#LValue_76_82" id="LValue_241_247" title="Defined at ../Base-sig.stx line 10">LValue</a>
    LValue2Exp : <a href="../Base-sig.stx#LValue_76_82" id="LValue_265_271" title="Defined at ../Base-sig.stx line 10">LValue</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_275_278" title="Defined at ../Base-sig.stx line 9">Exp</a>
</code></pre></td></tr></tbody></table></div>