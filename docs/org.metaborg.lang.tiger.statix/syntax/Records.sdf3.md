---
title: Records.sdf3
---

# `Records.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Records.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Records.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Records.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Records_173_180" id="Records_7_14" title="Referenced at ../Tiger.sdf3 line 12">Records</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_24_28" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">sorts</span> <a href="#Field_120_125" id="Field_36_41" title="Referenced at line 12">Field</a> <a href="#InitField_224_233" id="InitField_42_51" title="Referenced at line 20">InitField</a>

<span class="layout">// Records</span>
<span class="keyword">context-free syntax</span>

  <span id="Type_87_91" title="Not referenced locally, nor via imports">Type</span>.<span class="cons_Constructor"><span id="RecordTy_92_100" title="Not referenced locally, nor via imports">RecordTy</span></span> = &lt;
    <span class="cons_String">{</span>
       &lt;{<a href="#Field_36_41" id="Field_120_125" title="Defined at line 5, 16">Field</a> <span class="cons_Lit">", \n"</span>}*&gt;
    <span class="cons_String">}</span>
  &gt;

  <a href="#Field_120_125" id="Field_149_154" title="Referenced at line 12">Field</a>.<span class="cons_Constructor"><span id="Field_155_160" title="Not referenced locally, nor via imports">Field</span></span> = &lt;&lt;<a href="../Base.sdf3#ID_72_74" id="ID_165_167" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../Base.sdf3#ID_72_74" id="ID_172_174" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;&gt;

  <a href="#Exp_279_282" id="Exp_180_183" title="Referenced at line 22">Exp</a>.<span class="cons_Constructor"><span id="NilExp_184_190" title="Not referenced locally, nor via imports">NilExp</span></span> = &lt;<span class="cons_String">nil</span>&gt;

  <a href="#Exp_279_282" id="Exp_202_205" title="Referenced at line 22">Exp</a>.<span class="cons_Constructor"><span id="Record_206_212" title="Not referenced locally, nor via imports">Record</span></span> = &lt;&lt;<a href="../Base.sdf3#ID_72_74" id="ID_217_219" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;<span class="cons_String">{</span> &lt;{<a href="#InitField_42_51" id="InitField_224_233" title="Defined at line 5, 22">InitField</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">}</span>&gt;

  <a href="#InitField_224_233" id="InitField_248_257" title="Referenced at line 20">InitField</a>.<span class="cons_Constructor"><span id="InitField_258_267" title="Not referenced locally, nor via imports">InitField</span></span> = &lt;&lt;<a href="../Base.sdf3#ID_72_74" id="ID_272_274" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">=</span> &lt;<a href="#Exp_180_183" id="Exp_279_282" title="Defined at line 18, 20">Exp</a>&gt;&gt;

  <a href="#LValue_308_314" id="LValue_288_294" title="Referenced at line 24">LValue</a>.<span class="cons_Constructor"><a href="../Tiger.sdf3#FieldVar_428_436" id="FieldVar_295_303" title="Referenced at ../Tiger.sdf3 line 35">FieldVar</a></span> = &lt;&lt;<a href="#LValue_288_294" id="LValue_308_314" title="Defined at line 24">LValue</a>&gt;<span class="cons_String">.</span>&lt;<a href="../Base.sdf3#ID_72_74" id="ID_317_319" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>