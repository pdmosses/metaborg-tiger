---
title: Control-Flow.sdf3
hide:
  - toc
---

# `Control-Flow.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Control-Flow.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Control-Flow.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Control-Flow.sdf3 "The source file on GitHub"

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
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Control-Flow_14_9" id="Control-Flow_1_8" title="a definition with a single reference">Control-Flow</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="a reference to a single-file definition">Base</a>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Exp_7_3" title="a definition with multiple references" data-urls="#Exp line 9_9, 14_9, 15_8, 17_8, 21_9, 22_8, 26_12, 27_8, 31_19, 31_28, 32_8, 37_30, 42_5, 44_5, 45_5, 46_5, 47_5">Exp</button>.<span class="cons_Constructor"><span id="Seq_7_7" title="a definition with no references">Seq</span></span> = &lt;
    <span class="cons_String">(</span>
      &lt;{<a href="#Exp_7_3" id="Exp_9_9" title="a reference to a single-file definition">Exp</a> <span class="cons_Lit">";\n"</span>}*&gt;
    <span class="cons_String">)</span>
  &gt;

  <button class="modal-open" id="Exp_13_3" title="a definition with multiple references" data-urls="#Exp line 9_9, 14_9, 15_8, 17_8, 21_9, 22_8, 26_12, 27_8, 31_19, 31_28, 32_8, 37_30, 42_5, 44_5, 45_5, 46_5, 47_5">Exp</button>.<span class="cons_Constructor"><a href="#If_44_9" id="If_13_7" title="a definition with a single reference">If</a></span> = &lt;
    <span class="cons_String">if</span> &lt;<a href="#Exp_7_3" id="Exp_14_9" title="a reference to a single-file definition">Exp</a>&gt; <span class="cons_String">then</span>
      &lt;<a href="#Exp_7_3" id="Exp_15_8" title="a reference to a single-file definition">Exp</a>&gt;
    <span class="cons_String">else</span>
      &lt;<a href="#Exp_7_3" id="Exp_17_8" title="a reference to a single-file definition">Exp</a>&gt;
  &gt;

  <button class="modal-open" id="Exp_20_3" title="a definition with multiple references" data-urls="#Exp line 9_9, 14_9, 15_8, 17_8, 21_9, 22_8, 26_12, 27_8, 31_19, 31_28, 32_8, 37_30, 42_5, 44_5, 45_5, 46_5, 47_5">Exp</button>.<span class="cons_Constructor"><a href="#IfThen_45_9" id="IfThen_20_7" title="a definition with a single reference">IfThen</a></span> = &lt;
    <span class="cons_String">if</span> &lt;<a href="#Exp_7_3" id="Exp_21_9" title="a reference to a single-file definition">Exp</a>&gt; <span class="cons_String">then</span>
      &lt;<a href="#Exp_7_3" id="Exp_22_8" title="a reference to a single-file definition">Exp</a>&gt;
  &gt;

  <button class="modal-open" id="Exp_25_3" title="a definition with multiple references" data-urls="#Exp line 9_9, 14_9, 15_8, 17_8, 21_9, 22_8, 26_12, 27_8, 31_19, 31_28, 32_8, 37_30, 42_5, 44_5, 45_5, 46_5, 47_5">Exp</button>.<span class="cons_Constructor"><a href="#While_46_9" id="While_25_7" title="a definition with a single reference">While</a></span> = &lt;
    <span class="cons_String">while</span> &lt;<a href="#Exp_7_3" id="Exp_26_12" title="a reference to a single-file definition">Exp</a>&gt; <span class="cons_String">do</span>
      &lt;<a href="#Exp_7_3" id="Exp_27_8" title="a reference to a single-file definition">Exp</a>&gt;
  &gt;

  <button class="modal-open" id="Exp_30_3" title="a definition with multiple references" data-urls="#Exp line 9_9, 14_9, 15_8, 17_8, 21_9, 22_8, 26_12, 27_8, 31_19, 31_28, 32_8, 37_30, 42_5, 44_5, 45_5, 46_5, 47_5">Exp</button>.<span class="cons_Constructor"><a href="#For_47_9" id="For_30_7" title="a definition with a single reference">For</a></span> = &lt;
    <span class="cons_String">for</span> &lt;<a href="../Base.sdf3/#Var_7_7" id="Var_31_10" title="a reference to a single-file definition">Var</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_7_3" id="Exp_31_19" title="a reference to a single-file definition">Exp</a>&gt; <span class="cons_String">to</span> &lt;<a href="#Exp_7_3" id="Exp_31_28" title="a reference to a single-file definition">Exp</a>&gt; <span class="cons_String">do</span>
      &lt;<a href="#Exp_7_3" id="Exp_32_8" title="a reference to a single-file definition">Exp</a>&gt;
  &gt;

  <button class="modal-open" id="Exp_35_3" title="a definition with multiple references" data-urls="#Exp line 9_9, 14_9, 15_8, 17_8, 21_9, 22_8, 26_12, 27_8, 31_19, 31_28, 32_8, 37_30, 42_5, 44_5, 45_5, 46_5, 47_5">Exp</button>.<span class="cons_Constructor"><span id="Break_35_7" title="a definition with no references">Break</span></span> = &lt;<span class="cons_String">break</span>&gt;

  <button class="modal-open" id="Exp_37_3" title="a definition with multiple references" data-urls="#Exp line 9_9, 14_9, 15_8, 17_8, 21_9, 22_8, 26_12, 27_8, 31_19, 31_28, 32_8, 37_30, 42_5, 44_5, 45_5, 46_5, 47_5">Exp</button>.<span class="cons_Constructor"><button class="modal-open" id="Assign_37_7" title="a definition with multiple references" data-urls="#Assign line 42_9; ../Tiger.sdf3/#Assign line 30_9">Assign</button></span> = &lt;&lt;<a href="../Base.sdf3/#LValue_3_15" id="LValue_37_18" title="a reference to a single-file definition">LValue</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_7_3" id="Exp_37_30" title="a reference to a single-file definition">Exp</a>&gt;&gt;

<span class="keyword">context-free priorities</span>

  {
    <a href="#Exp_7_3" id="Exp_42_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Assign_37_7" id="Assign_42_9" title="a reference to a single-file definition">Assign</a></span>
  } &gt; { <span class="keyword">right</span>:
    <a href="#Exp_7_3" id="Exp_44_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#If_13_7" id="If_44_9" title="a reference to a single-file definition">If</a></span>
    <a href="#Exp_7_3" id="Exp_45_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#IfThen_20_7" id="IfThen_45_9" title="a reference to a single-file definition">IfThen</a></span>
    <a href="#Exp_7_3" id="Exp_46_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#While_25_7" id="While_46_9" title="a reference to a single-file definition">While</a></span>
    <a href="#Exp_7_3" id="Exp_47_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#For_30_7" id="For_47_9" title="a reference to a single-file definition">For</a></span>
  }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
