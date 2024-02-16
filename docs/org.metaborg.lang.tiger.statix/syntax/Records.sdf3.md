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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Records_12_9" id="Records_1_8" title="a definition with a single reference">Records</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="a reference to a single-file definition">Base</a>

<span class="keyword">sorts</span> <a href="#Field_12_10" id="Field_5_7" title="a definition with a single reference">Field</a> <a href="#InitField_20_25" id="InitField_5_13" title="a definition with a single reference">InitField</a>

<span class="layout">// Records</span>
<span class="keyword">context-free syntax</span>

  <span id="Type_10_3" title="a definition with no references">Type</span>.<span class="cons_Constructor"><span id="RecordTy_10_8" title="a definition with no references">RecordTy</span></span> = &lt;
    <span class="cons_String">{</span>
       &lt;{<a href="#Field_5_7" id="Field_12_10" title="a reference to a single-file definition">Field</a> <span class="cons_Lit">", \n"</span>}*&gt;
    <span class="cons_String">}</span>
  &gt;

  <a href="#Field_12_10" id="Field_16_3" title="a definition with a single reference">Field</a>.<span class="cons_Constructor"><span id="Field_16_9" title="a definition with no references">Field</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_16_19" title="a reference to a single-file definition">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../Base.sdf3/#ID_9_15" id="ID_16_26" title="a reference to a single-file definition">ID</a>&gt;&gt;

  <a href="#Exp_22_34" id="Exp_18_3" title="a definition with a single reference">Exp</a>.<span class="cons_Constructor"><span id="NilExp_18_7" title="a definition with no references">NilExp</span></span> = &lt;<span class="cons_String">nil</span>&gt;

  <a href="#Exp_22_34" id="Exp_20_3" title="a definition with a single reference">Exp</a>.<span class="cons_Constructor"><span id="Record_20_7" title="a definition with no references">Record</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_20_18" title="a reference to a single-file definition">ID</a>&gt;<span class="cons_String">{</span> &lt;{<a href="#InitField_5_13" id="InitField_20_25" title="a reference to a single-file definition">InitField</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">}</span>&gt;

  <a href="#InitField_20_25" id="InitField_22_3" title="a definition with a single reference">InitField</a>.<span class="cons_Constructor"><span id="InitField_22_13" title="a definition with no references">InitField</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_22_27" title="a reference to a single-file definition">ID</a>&gt; <span class="cons_String">=</span> &lt;<a href="#Exp_18_3" id="Exp_22_34" title="a reference to a single-file definition">Exp</a>&gt;&gt;

  <a href="#LValue_24_23" id="LValue_24_3" title="a definition with a single reference">LValue</a>.<span class="cons_Constructor"><a href="../Tiger.sdf3/#FieldVar_35_12" id="FieldVar_24_10" title="a definition with a single reference">FieldVar</a></span> = &lt;&lt;<a href="#LValue_24_3" id="LValue_24_23" title="a reference to a single-file definition">LValue</a>&gt;<span class="cons_String">.</span>&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_24_32" title="a reference to a single-file definition">ID</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
