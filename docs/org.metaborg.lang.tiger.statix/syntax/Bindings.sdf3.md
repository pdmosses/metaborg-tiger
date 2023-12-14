---
title: Bindings.sdf3
hide:
  - toc
---

# `Bindings.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Bindings.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Bindings.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Bindings.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Bindings_7_9" id="Bindings_1_8" title="Referenced at ../Tiger.sdf3 line 7">Bindings</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">sorts</span> <span id="Declarations_5_7" title="Not referenced">Declarations</span>

<span class="keyword">context-free syntax</span>

  <a href="#Exp_13_9" id="Exp_9_3" title="Referenced at line 13">Exp</a>.<span class="cons_Constructor"><span id="Let_9_7" title="Not referenced">Let</span></span> = &lt;
    <span class="cons_String">let</span>
      &lt;{<a href="../Base.sdf3/#Dec_3_7" id="Dec_11_9" title="Defined at ../Base.sdf3 line 3">Dec</a> <span class="cons_Lit">"\n"</span>}*&gt;
     <span class="cons_String">in</span>
      &lt;{<a href="#Exp_9_3" id="Exp_13_9" title="Defined at line 9">Exp</a> <span class="cons_Lit">";\n"</span>}*&gt;
    <span class="cons_String">end</span>
  &gt;

  <span id="Declarations_17_3" title="Not referenced">Declarations</span>.<span class="cons_Constructor"><span id="Declarations_17_16" title="Not referenced">Declarations</span></span> = &lt;
    <span class="cons_String">declarations</span> &lt;{<a href="../Base.sdf3/#Dec_3_7" id="Dec_18_20" title="Defined at ../Base.sdf3 line 3">Dec</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;




</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
