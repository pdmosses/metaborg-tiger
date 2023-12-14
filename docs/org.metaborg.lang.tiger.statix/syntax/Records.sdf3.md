---
title: Records.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Records_12_9" id="Records_1_8" title="Referenced at ../Tiger.sdf3 line 12">Records</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">sorts</span> <a href="#Field_12_10" id="Field_5_7" title="Referenced at line 12">Field</a> <a href="#InitField_20_25" id="InitField_5_13" title="Referenced at line 20">InitField</a>

<span class="layout">// Records</span>
<span class="keyword">context-free syntax</span>

  <span id="Type_10_3" title="Not referenced">Type</span>.<span class="cons_Constructor"><span id="RecordTy_10_8" title="Not referenced">RecordTy</span></span> = &lt;
    <span class="cons_String">{</span>
       &lt;{<a href="#Field_5_7" id="Field_12_10" title="Defined at line 5, 16">Field</a> <span class="cons_Lit">", \n"</span>}*&gt;
    <span class="cons_String">}</span>
  &gt;

  <a href="#Field_12_10" id="Field_16_3" title="Referenced at line 12">Field</a>.<span class="cons_Constructor"><span id="Field_16_9" title="Not referenced">Field</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_16_19" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../Base.sdf3/#ID_9_15" id="ID_16_26" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;&gt;

  <a href="#Exp_22_34" id="Exp_18_3" title="Referenced at line 22">Exp</a>.<span class="cons_Constructor"><span id="NilExp_18_7" title="Not referenced">NilExp</span></span> = &lt;<span class="cons_String">nil</span>&gt;

  <a href="#Exp_22_34" id="Exp_20_3" title="Referenced at line 22">Exp</a>.<span class="cons_Constructor"><span id="Record_20_7" title="Not referenced">Record</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_20_18" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;<span class="cons_String">{</span> &lt;{<a href="#InitField_5_13" id="InitField_20_25" title="Defined at line 5, 22">InitField</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">}</span>&gt;

  <a href="#InitField_20_25" id="InitField_22_3" title="Referenced at line 20">InitField</a>.<span class="cons_Constructor"><span id="InitField_22_13" title="Not referenced">InitField</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_22_27" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">=</span> &lt;<a href="#Exp_18_3" id="Exp_22_34" title="Defined at line 18, 20">Exp</a>&gt;&gt;

  <a href="#LValue_24_23" id="LValue_24_3" title="Referenced at line 24">LValue</a>.<span class="cons_Constructor"><a href="../Tiger.sdf3/#FieldVar_35_12" id="FieldVar_24_10" title="Referenced at ../Tiger.sdf3 line 35">FieldVar</a></span> = &lt;&lt;<a href="#LValue_24_3" id="LValue_24_23" title="Defined at line 24">LValue</a>&gt;<span class="cons_String">.</span>&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_24_32" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
