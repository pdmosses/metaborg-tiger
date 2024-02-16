---
title: Functions.sdf3
hide:
  - toc
---

# `Functions.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Functions.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Functions.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Functions.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Functions_9_9" id="Functions_1_8" title="a definition with a single reference">Functions</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="a reference to a single-file definition">Base</a>

<span class="keyword">sorts</span> <button class="modal-open" id="FArg_5_7" title="a definition with multiple references" data-urls="#FArg line 9_21, 14_21">FArg</button>
<span class="keyword">context-free syntax</span>

  <span id="Dec_8_3" title="a definition with no references">Dec</span>.<span class="cons_Constructor"><span id="ProcDec_8_7" title="a definition with no references">ProcDec</span></span> = &lt;
    <span class="cons_String">function</span> &lt;<a href="../Base.sdf3/#ID_9_15" id="ID_9_15" title="a reference to a single-file definition">ID</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#FArg_5_7" id="FArg_9_21" title="a reference to a single-file definition">FArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
      &lt;<a href="#Exp_20_3" id="Exp_10_8" title="a reference to a single-file definition">Exp</a>&gt;
  &gt;

  <span id="Dec_13_3" title="a definition with no references">Dec</span>.<span class="cons_Constructor"><span id="FunDec_13_7" title="a definition with no references">FunDec</span></span> = &lt;
    <span class="cons_String">function</span> &lt;<a href="../Base.sdf3/#ID_9_15" id="ID_14_15" title="a reference to a single-file definition">ID</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#FArg_5_7" id="FArg_14_21" title="a reference to a single-file definition">FArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">:</span> &lt;<a href="../Base.sdf3/#Type_5_7" id="Type_14_38" title="a reference to a single-file definition">Type</a>&gt; <span class="cons_String">=</span>
      &lt;<a href="#Exp_20_3" id="Exp_15_8" title="a reference to a single-file definition">Exp</a>&gt;
  &gt;

  <button class="modal-open" id="FArg_18_3" title="a definition with multiple references" data-urls="#FArg line 9_21, 14_21">FArg</button>.<span class="cons_Constructor"><span id="FArg_18_8" title="a definition with no references">FArg</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_18_17" title="a reference to a single-file definition">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../Base.sdf3/#Type_5_7" id="Type_18_24" title="a reference to a single-file definition">Type</a>&gt;&gt;

  <button class="modal-open" id="Exp_20_3" title="a definition with multiple references" data-urls="#Exp line 10_8, 15_8, 20_22">Exp</button>.<span class="cons_Constructor"><span id="Call_20_7" title="a definition with no references">Call</span></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_20_16" title="a reference to a single-file definition">ID</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Exp_20_3" id="Exp_20_22" title="a reference to a single-file definition">Exp</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
