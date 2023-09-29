---
title: Records-sig.stx
---

# `Records-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Records-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Records-sig.stx "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx#signatures/Records-sig_271_293" id="signatures/Records-sig_7_29" title="Referenced at ../Tiger-sig.stx line 13">signatures/Records-sig</a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx#signatures/Base-sig_7_26" id="signatures/Base-sig_41_60" title="Defined at ../Base-sig.stx line 1">signatures/Base-sig</a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <a href="#Field_139_144" id="Field_85_90" title="Referenced at line 13, 19, 20; ../../../../trans/static-semantics.stx line 433">Field</a>
    <a href="#InitField_167_176" id="InitField_95_104" title="Referenced at line 14, 22, 23; ../../../../trans/static-semantics.stx line 455, 461">InitField</a>

  <span class="keyword">constructors</span>
    Field-Plhdr : <a href="#Field_85_90" id="Field_139_144" title="Defined at line 9">Field</a>
    InitField-Plhdr : <a href="#InitField_95_104" id="InitField_167_176" title="Defined at line 10">InitField</a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    RecordTy : <span class="keyword">list</span>(<a href="#Field_85_90" id="Field_224_229" title="Defined at line 9">Field</a>) -&gt; <a href="../Base-sig.stx#Type_87_91" id="Type_234_238" title="Defined at ../Base-sig.stx line 11">Type</a>
    Field : <a href="../Base-sig.stx#ID_104_106" id="ID_251_253" title="Defined at ../Base-sig.stx line 13">ID</a> * <a href="../Base-sig.stx#ID_104_106" id="ID_256_258" title="Defined at ../Base-sig.stx line 13">ID</a> -&gt; <a href="#Field_85_90" id="Field_262_267" title="Defined at line 9">Field</a>
    NilExp : <a href="../Base-sig.stx#Exp_68_71" id="Exp_281_284" title="Defined at ../Base-sig.stx line 9">Exp</a>
    Record : <a href="../Base-sig.stx#ID_104_106" id="ID_298_300" title="Defined at ../Base-sig.stx line 13">ID</a> * <span class="keyword">list</span>(<a href="#InitField_95_104" id="InitField_308_317" title="Defined at line 10">InitField</a>) -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_322_325" title="Defined at ../Base-sig.stx line 9">Exp</a>
    InitField : <a href="../Base-sig.stx#ID_104_106" id="ID_342_344" title="Defined at ../Base-sig.stx line 13">ID</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_347_350" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="#InitField_95_104" id="InitField_354_363" title="Defined at line 10">InitField</a>
    FieldVar : <a href="../Base-sig.stx#LValue_76_82" id="LValue_379_385" title="Defined at ../Base-sig.stx line 10">LValue</a> * <a href="../Base-sig.stx#ID_104_106" id="ID_388_390" title="Defined at ../Base-sig.stx line 13">ID</a> -&gt; <a href="../Base-sig.stx#LValue_76_82" id="LValue_394_400" title="Defined at ../Base-sig.stx line 10">LValue</a>
</code></pre></td></tr></tbody></table></div>