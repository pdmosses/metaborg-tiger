---
title: Variables.sdf3
hide:
  - toc
---

# `Variables.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Variables.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Variables.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Variables.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Variables_8_9" id="Variables_1_8" title="Referenced at ../Tiger.sdf3 line 8">Variables</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="Defined at ../Base.sdf3 line 1">Base</a>


<span class="keyword">context-free syntax</span>

  <span id="Dec_8_3" title="Not referenced">Dec</span>.<span class="cons_Constructor"><span id="VarDec_8_7" title="Not referenced">VarDec</span></span> = &lt;<span class="cons_String">var</span> &lt;<a href="../Base.sdf3/#ID_9_15" id="ID_8_22" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../Base.sdf3/#Type_5_7" id="Type_8_29" title="Defined at ../Base.sdf3 line 5">Type</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_16_3" id="Exp_8_39" title="Defined at line 16">Exp</a>&gt;&gt;

  <span id="Dec_10_3" title="Not referenced">Dec</span>.<span class="cons_Constructor"><span id="VarDecNoType_10_7" title="Not referenced">VarDecNoType</span></span> = &lt;<span class="cons_String">var</span> &lt;<a href="../Base.sdf3/#ID_9_15" id="ID_10_28" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_16_3" id="Exp_10_36" title="Defined at line 16">Exp</a>&gt;&gt;

  <a href="#Var_14_12" id="Var_12_3" title="Referenced at line 14">Var</a>.<span class="cons_Constructor"><span id="Var_12_7" title="Not referenced">Var</span></span> = <a href="../Base.sdf3/#ID_9_15" id="ID_12_13" title="Defined at ../Base.sdf3 line 9">ID</a>

  <button class="modal-open" id="LValue_14_3" title="Multi-file references" data-urls="#LValue_16_9 line 16; ../Tiger.sdf3/#LValue_35_5 line 35, 36">LValue</button> = <a href="#Var_12_3" id="Var_14_12" title="Defined at line 12">Var</a>

  <button class="modal-open" id="Exp_16_3" title="Multi-file references" data-urls="#Exp_8_39 line 8, 10; ../Tiger.sdf3/#Exp_21_16 line 21, 26, 28, 30, 34, 38, 39">Exp</button> = <a href="#LValue_14_3" id="LValue_16_9" title="Defined at line 14">LValue</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
