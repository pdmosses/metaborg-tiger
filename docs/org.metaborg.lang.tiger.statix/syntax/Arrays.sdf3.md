---
title: Arrays.sdf3
hide:
  - toc
---

# `Arrays.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Arrays.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Arrays.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Arrays.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Arrays_13_9" id="Arrays_1_8" title="a definition with a single reference">Arrays</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="a reference to a single-file definition">Base</a>

<span class="layout">// Arrays</span>
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Exp_8_3" title="a definition with multiple references" data-urls="#Exp line 8_22, 8_32, 12_33">Exp</button>.<span class="cons_Constructor"><a href="../Tiger.sdf3/#Array_28_9" id="Array_8_7" title="a definition with a single reference">Array</a></span> = &lt;&lt;<a href="../Base.sdf3/#ID_9_15" id="ID_8_17" title="a reference to a single-file definition">ID</a>&gt;<span class="cons_String">[</span>&lt;<a href="#Exp_8_3" id="Exp_8_22" title="a reference to a single-file definition">Exp</a>&gt;<span class="cons_String">]</span> <span class="cons_String">of</span> &lt;<a href="#Exp_8_3" id="Exp_8_32" title="a reference to a single-file definition">Exp</a>&gt;&gt;

  <span id="Type_10_3" title="a definition with no references">Type</span>.<span class="cons_Constructor"><span id="ArrayTy_10_8" title="a definition with no references">ArrayTy</span></span> = &lt;<span class="cons_String">array</span> <span class="cons_String">of</span> &lt;<a href="../Base.sdf3/#ID_9_15" id="ID_10_29" title="a reference to a single-file definition">ID</a>&gt;&gt;

  <a href="#LValue_12_24" id="LValue_12_3" title="a definition with a single reference">LValue</a>.<span class="cons_Constructor"><a href="../Tiger.sdf3/#Subscript_36_12" id="Subscript_12_10" title="a definition with a single reference">Subscript</a></span> = &lt;&lt;<a href="#LValue_12_3" id="LValue_12_24" title="a reference to a single-file definition">LValue</a>&gt;<span class="cons_String">[</span>&lt;<a href="#Exp_8_3" id="Exp_12_33" title="a reference to a single-file definition">Exp</a>&gt;<span class="cons_String">]</span>&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
