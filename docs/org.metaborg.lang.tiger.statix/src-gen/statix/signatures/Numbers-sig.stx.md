---
title: Numbers-sig.stx
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx#signatures/Numbers-sig_221_243" id="signatures/Numbers-sig_7_29" title="Referenced at ../Tiger-sig.stx line 11">signatures/Numbers-sig</a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx#signatures/Base-sig_7_26" id="signatures/Base-sig_41_60" title="Defined at ../Base-sig.stx line 1">signatures/Base-sig</a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <a href="#IntConst_156_164" id="IntConst_85_93" title="Referenced at line 16">IntConst</a> = <span class="keyword">string</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    Int : <a href="#IntConst_85_93" id="IntConst_156_164" title="Defined at line 9">IntConst</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_168_171" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Uminus : <a href="../Base-sig.stx#Exp_68_71" id="Exp_185_188" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_192_195" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Times : <a href="../Base-sig.stx#Exp_68_71" id="Exp_208_211" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_214_217" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_221_224" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Divide : <a href="../Base-sig.stx#Exp_68_71" id="Exp_238_241" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_244_247" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_251_254" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Plus : <a href="../Base-sig.stx#Exp_68_71" id="Exp_266_269" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_272_275" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_279_282" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Minus : <a href="../Base-sig.stx#Exp_68_71" id="Exp_295_298" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_301_304" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_308_311" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Eq : <a href="../Base-sig.stx#Exp_68_71" id="Exp_321_324" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_327_330" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_334_337" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Neq : <a href="../Base-sig.stx#Exp_68_71" id="Exp_348_351" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_354_357" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_361_364" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Gt : <a href="../Base-sig.stx#Exp_68_71" id="Exp_374_377" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_380_383" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_387_390" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Lt : <a href="../Base-sig.stx#Exp_68_71" id="Exp_400_403" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_406_409" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_413_416" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Geq : <a href="../Base-sig.stx#Exp_68_71" id="Exp_427_430" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_433_436" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_440_443" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Leq : <a href="../Base-sig.stx#Exp_68_71" id="Exp_454_457" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_460_463" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_467_470" title="Defined at ../Base-sig.stx line 9">Exp</a>
    And : <a href="../Base-sig.stx#Exp_68_71" id="Exp_481_484" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_487_490" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_494_497" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Or : <a href="../Base-sig.stx#Exp_68_71" id="Exp_507_510" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_513_516" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_520_523" title="Defined at ../Base-sig.stx line 9">Exp</a>
</code></pre></td></tr></tbody></table></div>