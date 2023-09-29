---
title: Control-Flow-sig.stx
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx#signatures/Control-Flow-sig_320_347" id="signatures/Control-Flow-sig_7_34" title="Referenced at ../Tiger-sig.stx line 15">signatures/Control-Flow-sig</a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx#signatures/Base-sig_7_26" id="signatures/Base-sig_46_65" title="Defined at ../Base-sig.stx line 1">signatures/Base-sig</a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    Seq : <span class="keyword">list</span>(<a href="../Base-sig.stx#Exp_68_71" id="Exp_144_147" title="Defined at ../Base-sig.stx line 9">Exp</a>) -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_152_155" title="Defined at ../Base-sig.stx line 9">Exp</a>
    If : <a href="../Base-sig.stx#Exp_68_71" id="Exp_165_168" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_171_174" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_177_180" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_184_187" title="Defined at ../Base-sig.stx line 9">Exp</a>
    IfThen : <a href="../Base-sig.stx#Exp_68_71" id="Exp_201_204" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_207_210" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_214_217" title="Defined at ../Base-sig.stx line 9">Exp</a>
    While : <a href="../Base-sig.stx#Exp_68_71" id="Exp_230_233" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_236_239" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_243_246" title="Defined at ../Base-sig.stx line 9">Exp</a>
    For : <a href="../Base-sig.stx#Var_96_99" id="Var_257_260" title="Defined at ../Base-sig.stx line 12">Var</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_263_266" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_269_272" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_275_278" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_282_285" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Break : <a href="../Base-sig.stx#Exp_68_71" id="Exp_298_301" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Assign : <a href="../Base-sig.stx#LValue_76_82" id="LValue_315_321" title="Defined at ../Base-sig.stx line 10">LValue</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_324_327" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_331_334" title="Defined at ../Base-sig.stx line 9">Exp</a>
</code></pre></td></tr></tbody></table></div>