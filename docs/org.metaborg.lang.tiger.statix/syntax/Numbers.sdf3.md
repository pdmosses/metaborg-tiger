---
title: Numbers.sdf3
hide:
  - toc
---

# `Numbers.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Numbers.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Numbers.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Numbers.sdf3 "The source file on GitHub"

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
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Numbers_10_9" id="Numbers_1_8" title="Referenced at ../Tiger.sdf3 line 10">Numbers</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">lexical sorts</span> <a href="#IntConst_14_3" id="IntConst_5_15" title="Referenced at line 14, 19">IntConst</a>
<span class="keyword">lexical syntax</span>

  <a href="#IntConst_14_3" id="IntConst_8_3" title="Referenced at line 14, 19">IntConst</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

<span class="keyword">lexical restrictions</span>

  <span class="layout">// Ensure greedy matching for lexicals</span>

  <a href="#IntConst_5_15" id="IntConst_14_3" title="Defined at line 5, 8">IntConst</a>  -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]


<span class="keyword">context-free syntax</span>

  <a href="#Exp_21_21" id="Exp_19_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><span id="Int_19_7" title="Not referenced">Int</span></span>     = <a href="#IntConst_5_15" id="IntConst_19_17" title="Defined at line 5, 8">IntConst</a>

  <a href="#Exp_21_21" id="Exp_21_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><button class="modal-open" id="Uminus_21_7" title="Multi-file references" data-urls="#Uminus_51_8 line 51; ../Tiger.sdf3/#Uminus_34_9 line 34">Uminus</button></span>  = [<span class="cons_String">-</span> [<a href="#Exp_19_3" id="Exp_21_21" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]
  <a href="#Exp_21_21" id="Exp_22_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><button class="modal-open" id="Times_22_7" title="Multi-file references" data-urls="#Times_53_9 line 53; ../Tiger.sdf3/#Times_38_9 line 38">Times</button></span>   = [[<a href="#Exp_19_3" id="Exp_22_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">*</span> [<a href="#Exp_19_3" id="Exp_22_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_21_21" id="Exp_23_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><button class="modal-open" id="Divide_23_7" title="Multi-file references" data-urls="#Divide_54_9 line 54; ../Tiger.sdf3/#Divide_39_9 line 39">Divide</button></span>  = [[<a href="#Exp_19_3" id="Exp_23_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">/</span> [<a href="#Exp_19_3" id="Exp_23_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_21_21" id="Exp_24_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Plus_56_9" id="Plus_24_7" title="Referenced at line 56">Plus</a></span>    = [[<a href="#Exp_19_3" id="Exp_24_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">+</span> [<a href="#Exp_19_3" id="Exp_24_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_21_21" id="Exp_25_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Minus_57_9" id="Minus_25_7" title="Referenced at line 57">Minus</a></span>   = [[<a href="#Exp_19_3" id="Exp_25_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">-</span> [<a href="#Exp_19_3" id="Exp_25_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}

  <a href="#Exp_21_21" id="Exp_27_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Eq_59_9" id="Eq_27_7" title="Referenced at line 59">Eq</a></span>      = [[<a href="#Exp_19_3" id="Exp_27_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">=</span> [<a href="#Exp_19_3" id="Exp_27_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <a href="#Exp_21_21" id="Exp_28_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Neq_60_9" id="Neq_28_7" title="Referenced at line 60">Neq</a></span>     = [[<a href="#Exp_19_3" id="Exp_28_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&lt;&gt;</span> [<a href="#Exp_19_3" id="Exp_28_28" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]  {<span class="keyword">non-assoc</span>}
  <a href="#Exp_21_21" id="Exp_29_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Gt_61_9" id="Gt_29_7" title="Referenced at line 61">Gt</a></span>      = [[<a href="#Exp_19_3" id="Exp_29_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&gt;</span> [<a href="#Exp_19_3" id="Exp_29_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <a href="#Exp_21_21" id="Exp_30_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Lt_62_9" id="Lt_30_7" title="Referenced at line 62">Lt</a></span>      = [[<a href="#Exp_19_3" id="Exp_30_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&lt;</span> [<a href="#Exp_19_3" id="Exp_30_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <a href="#Exp_21_21" id="Exp_31_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Geq_63_9" id="Geq_31_7" title="Referenced at line 63">Geq</a></span>     = [[<a href="#Exp_19_3" id="Exp_31_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&gt;=</span> [<a href="#Exp_19_3" id="Exp_31_28" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]  {<span class="keyword">non-assoc</span>}
  <a href="#Exp_21_21" id="Exp_32_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#Leq_64_9" id="Leq_32_7" title="Referenced at line 64">Leq</a></span>     = [[<a href="#Exp_19_3" id="Exp_32_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&lt;=</span> [<a href="#Exp_19_3" id="Exp_32_28" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]  {<span class="keyword">non-assoc</span>}

  <a href="#Exp_21_21" id="Exp_34_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><a href="#And_65_9" id="And_34_7" title="Referenced at line 65">And</a></span>     = [[<a href="#Exp_19_3" id="Exp_34_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&amp;</span> [<a href="#Exp_19_3" id="Exp_34_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_21_21" id="Exp_35_3" title="Referenced at line 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35, 51, 53, 54, 56, 57, 59, 60, 61, 62, 63, 64, 65, 66">Exp</a>.<span class="cons_Constructor"><button class="modal-open" id="Or_35_7" title="Multi-file references" data-urls="#Or_66_9 line 66; ../Tiger.sdf3/#Or_26_9 line 26">Or</button></span>      = [[<a href="#Exp_19_3" id="Exp_35_19" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">|</span> [<a href="#Exp_19_3" id="Exp_35_27" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}

  <span class="layout">//Exp = [([Exp])] {bracket, avoid}</span>

<span class="keyword">context-free priorities</span>

  <span class="layout">// Precedence of operators: Unary minus has the highest</span>
  <span class="layout">// precedence. The operators *, / have the next highest</span>
  <span class="layout">// (tightest binding) precedence, followed by +, -, then</span>
  <span class="layout">// by =, &lt;&gt;, &gt;, &lt;, &gt;=, &lt;=, then by &amp;, then by |.</span>

  <span class="layout">// Associativity of operators: The operators *, /, +, -</span>
  <span class="layout">// are all left associative. The comparison operators do</span>
  <span class="layout">// not associate, so a = b = c is not a legal expression,</span>
  <span class="layout">// a = (b = c) is legal.</span>

  {<a href="#Exp_19_3" id="Exp_51_4" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Uminus_21_7" id="Uminus_51_8" title="Defined at line 21">Uminus</a></span>}
  &gt; {<span class="keyword">left</span> :
    <a href="#Exp_19_3" id="Exp_53_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Times_22_7" id="Times_53_9" title="Defined at line 22">Times</a></span>
    <a href="#Exp_19_3" id="Exp_54_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Divide_23_7" id="Divide_54_9" title="Defined at line 23">Divide</a></span>}
  &gt; {<span class="keyword">left</span> :
    <a href="#Exp_19_3" id="Exp_56_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Plus_24_7" id="Plus_56_9" title="Defined at line 24">Plus</a></span>
    <a href="#Exp_19_3" id="Exp_57_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Minus_25_7" id="Minus_57_9" title="Defined at line 25">Minus</a></span>}
  &gt; {<span class="keyword">non-assoc</span> :
    <a href="#Exp_19_3" id="Exp_59_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Eq_27_7" id="Eq_59_9" title="Defined at line 27">Eq</a></span>
    <a href="#Exp_19_3" id="Exp_60_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Neq_28_7" id="Neq_60_9" title="Defined at line 28">Neq</a></span>
    <a href="#Exp_19_3" id="Exp_61_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Gt_29_7" id="Gt_61_9" title="Defined at line 29">Gt</a></span>
    <a href="#Exp_19_3" id="Exp_62_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Lt_30_7" id="Lt_62_9" title="Defined at line 30">Lt</a></span>
    <a href="#Exp_19_3" id="Exp_63_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Geq_31_7" id="Geq_63_9" title="Defined at line 31">Geq</a></span>
    <a href="#Exp_19_3" id="Exp_64_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Leq_32_7" id="Leq_64_9" title="Defined at line 32">Leq</a></span>}
  &gt; <a href="#Exp_19_3" id="Exp_65_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#And_34_7" id="And_65_9" title="Defined at line 34">And</a></span>
  &gt; <a href="#Exp_19_3" id="Exp_66_5" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Or_35_7" id="Or_66_9" title="Defined at line 35">Or</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
