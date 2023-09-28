---
title: Numbers-sig.stx
---

# `Numbers-sig.stx`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Numbers-sig.stx]

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
    <a href="../../../../trans/static-semantics.stx#Int_8550_8553" id="Int_150_153" title="Referenced at ../../../../trans/static-semantics.stx line 366">Int</a> : <a href="#IntConst_85_93" id="IntConst_156_164" title="Defined at line 9">IntConst</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_168_171" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Uminus_8622_8628" id="Uminus_176_182" title="Referenced at ../../../../trans/static-semantics.stx line 371">Uminus</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_185_188" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_192_195" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Times_8795_8800" id="Times_200_205" title="Referenced at ../../../../trans/static-semantics.stx line 378">Times</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_208_211" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_214_217" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_221_224" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Divide_8690_8696" id="Divide_229_235" title="Referenced at ../../../../trans/static-semantics.stx line 374">Divide</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_238_241" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_244_247" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_251_254" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Plus_9003_9007" id="Plus_259_263" title="Referenced at ../../../../trans/static-semantics.stx line 386">Plus</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_266_269" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_272_275" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_279_282" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Minus_8899_8904" id="Minus_287_292" title="Referenced at ../../../../trans/static-semantics.stx line 382">Minus</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_295_298" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_301_304" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_308_311" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Eq_9106_9108" id="Eq_316_318" title="Referenced at ../../../../trans/static-semantics.stx line 390">Eq</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_321_324" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_327_330" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_334_337" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Neq_9266_9269" id="Neq_342_345" title="Referenced at ../../../../trans/static-semantics.stx line 396">Neq</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_348_351" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_354_357" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_361_364" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Gt_9428_9430" id="Gt_369_371" title="Referenced at ../../../../trans/static-semantics.stx line 402">Gt</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_374_377" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_380_383" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_387_390" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Lt_9571_9573" id="Lt_395_397" title="Referenced at ../../../../trans/static-semantics.stx line 407">Lt</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_400_403" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_406_409" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_413_416" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Geq_9672_9675" id="Geq_421_424" title="Referenced at ../../../../trans/static-semantics.stx line 411">Geq</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_427_430" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_433_436" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_440_443" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Leq_9774_9777" id="Leq_448_451" title="Referenced at ../../../../trans/static-semantics.stx line 415">Leq</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_454_457" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_460_463" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_467_470" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#And_9977_9980" id="And_475_478" title="Referenced at ../../../../trans/static-semantics.stx line 423">And</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_481_484" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_487_490" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_494_497" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <a href="../../../../trans/static-semantics.stx#Or_9876_9878" id="Or_502_504" title="Referenced at ../../../../trans/static-semantics.stx line 419">Or</a> : <a href="../Base-sig.stx#Exp_68_71" id="Exp_507_510" title="Defined at ../Base-sig.stx line 9">Exp</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_513_516" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_520_523" title="Defined at ../Base-sig.stx line 9">Exp</a>
</code></pre></td></tr></tbody></table></div>