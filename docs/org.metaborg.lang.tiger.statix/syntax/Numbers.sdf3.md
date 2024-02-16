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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Numbers_10_9" id="Numbers_1_8" title="a definition with a single reference">Numbers</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="a reference to a single-file definition">Base</a>

<span class="keyword">lexical sorts</span> <button class="modal-open" id="IntConst_5_15" title="a definition with multiple references" data-urls="#IntConst line 14_3, 19_17">IntConst</button>
<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="IntConst_8_3" title="a definition with multiple references" data-urls="#IntConst line 14_3, 19_17">IntConst</button> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

<span class="keyword">lexical restrictions</span>

  <span class="layout">// Ensure greedy matching for lexicals</span>

  <a href="#IntConst_5_15" id="IntConst_14_3" title="a reference to a single-file definition">IntConst</a>  -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]


<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Exp_19_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><span id="Int_19_7" title="a definition with no references">Int</span></span>     = <a href="#IntConst_5_15" id="IntConst_19_17" title="a reference to a single-file definition">IntConst</a>

  <button class="modal-open" id="Exp_21_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><button class="modal-open" id="Uminus_21_7" title="a definition with multiple references" data-urls="#Uminus line 51_8; ../Tiger.sdf3/#Uminus line 34_9">Uminus</button></span>  = [<span class="cons_String">-</span> [<a href="#Exp_19_3" id="Exp_21_21" title="a reference to a single-file definition">Exp</a>]]
  <button class="modal-open" id="Exp_22_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><button class="modal-open" id="Times_22_7" title="a definition with multiple references" data-urls="#Times line 53_9; ../Tiger.sdf3/#Times line 38_9">Times</button></span>   = [[<a href="#Exp_19_3" id="Exp_22_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">*</span> [<a href="#Exp_19_3" id="Exp_22_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">left</span>}
  <button class="modal-open" id="Exp_23_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><button class="modal-open" id="Divide_23_7" title="a definition with multiple references" data-urls="#Divide line 54_9; ../Tiger.sdf3/#Divide line 39_9">Divide</button></span>  = [[<a href="#Exp_19_3" id="Exp_23_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">/</span> [<a href="#Exp_19_3" id="Exp_23_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">left</span>}
  <button class="modal-open" id="Exp_24_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Plus_56_9" id="Plus_24_7" title="a definition with a single reference">Plus</a></span>    = [[<a href="#Exp_19_3" id="Exp_24_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">+</span> [<a href="#Exp_19_3" id="Exp_24_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">left</span>}
  <button class="modal-open" id="Exp_25_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Minus_57_9" id="Minus_25_7" title="a definition with a single reference">Minus</a></span>   = [[<a href="#Exp_19_3" id="Exp_25_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">-</span> [<a href="#Exp_19_3" id="Exp_25_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">left</span>}

  <button class="modal-open" id="Exp_27_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Eq_59_9" id="Eq_27_7" title="a definition with a single reference">Eq</a></span>      = [[<a href="#Exp_19_3" id="Exp_27_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">=</span> [<a href="#Exp_19_3" id="Exp_27_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Exp_28_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Neq_60_9" id="Neq_28_7" title="a definition with a single reference">Neq</a></span>     = [[<a href="#Exp_19_3" id="Exp_28_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">&lt;&gt;</span> [<a href="#Exp_19_3" id="Exp_28_28" title="a reference to a single-file definition">Exp</a>]]  {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Exp_29_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Gt_61_9" id="Gt_29_7" title="a definition with a single reference">Gt</a></span>      = [[<a href="#Exp_19_3" id="Exp_29_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">&gt;</span> [<a href="#Exp_19_3" id="Exp_29_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Exp_30_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Lt_62_9" id="Lt_30_7" title="a definition with a single reference">Lt</a></span>      = [[<a href="#Exp_19_3" id="Exp_30_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">&lt;</span> [<a href="#Exp_19_3" id="Exp_30_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Exp_31_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Geq_63_9" id="Geq_31_7" title="a definition with a single reference">Geq</a></span>     = [[<a href="#Exp_19_3" id="Exp_31_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">&gt;=</span> [<a href="#Exp_19_3" id="Exp_31_28" title="a reference to a single-file definition">Exp</a>]]  {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Exp_32_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#Leq_64_9" id="Leq_32_7" title="a definition with a single reference">Leq</a></span>     = [[<a href="#Exp_19_3" id="Exp_32_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">&lt;=</span> [<a href="#Exp_19_3" id="Exp_32_28" title="a reference to a single-file definition">Exp</a>]]  {<span class="keyword">non-assoc</span>}

  <button class="modal-open" id="Exp_34_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><a href="#And_65_9" id="And_34_7" title="a definition with a single reference">And</a></span>     = [[<a href="#Exp_19_3" id="Exp_34_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">&amp;</span> [<a href="#Exp_19_3" id="Exp_34_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">left</span>}
  <button class="modal-open" id="Exp_35_3" title="a definition with multiple references" data-urls="#Exp line 21_21, 22_19, 22_27, 23_19, 23_27, 24_19, 24_27, 25_19, 25_27, 27_19, 27_27, 28_19, 28_28, 29_19, 29_27, 30_19, 30_27, 31_19, 31_28, 32_19, 32_28, 34_19, 34_27, 35_19, 35_27, 51_4, 53_5, 54_5, 56_5, 57_5, 59_5, 60_5, 61_5, 62_5, 63_5, 64_5, 65_5, 66_5">Exp</button>.<span class="cons_Constructor"><button class="modal-open" id="Or_35_7" title="a definition with multiple references" data-urls="#Or line 66_9; ../Tiger.sdf3/#Or line 26_9">Or</button></span>      = [[<a href="#Exp_19_3" id="Exp_35_19" title="a reference to a single-file definition">Exp</a>] <span class="cons_String">|</span> [<a href="#Exp_19_3" id="Exp_35_27" title="a reference to a single-file definition">Exp</a>]]   {<span class="keyword">left</span>}

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

  {<a href="#Exp_19_3" id="Exp_51_4" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Uminus_21_7" id="Uminus_51_8" title="a reference to a single-file definition">Uminus</a></span>}
  &gt; {<span class="keyword">left</span> :
    <a href="#Exp_19_3" id="Exp_53_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Times_22_7" id="Times_53_9" title="a reference to a single-file definition">Times</a></span>
    <a href="#Exp_19_3" id="Exp_54_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Divide_23_7" id="Divide_54_9" title="a reference to a single-file definition">Divide</a></span>}
  &gt; {<span class="keyword">left</span> :
    <a href="#Exp_19_3" id="Exp_56_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Plus_24_7" id="Plus_56_9" title="a reference to a single-file definition">Plus</a></span>
    <a href="#Exp_19_3" id="Exp_57_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Minus_25_7" id="Minus_57_9" title="a reference to a single-file definition">Minus</a></span>}
  &gt; {<span class="keyword">non-assoc</span> :
    <a href="#Exp_19_3" id="Exp_59_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Eq_27_7" id="Eq_59_9" title="a reference to a single-file definition">Eq</a></span>
    <a href="#Exp_19_3" id="Exp_60_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Neq_28_7" id="Neq_60_9" title="a reference to a single-file definition">Neq</a></span>
    <a href="#Exp_19_3" id="Exp_61_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Gt_29_7" id="Gt_61_9" title="a reference to a single-file definition">Gt</a></span>
    <a href="#Exp_19_3" id="Exp_62_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Lt_30_7" id="Lt_62_9" title="a reference to a single-file definition">Lt</a></span>
    <a href="#Exp_19_3" id="Exp_63_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Geq_31_7" id="Geq_63_9" title="a reference to a single-file definition">Geq</a></span>
    <a href="#Exp_19_3" id="Exp_64_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Leq_32_7" id="Leq_64_9" title="a reference to a single-file definition">Leq</a></span>}
  &gt; <a href="#Exp_19_3" id="Exp_65_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#And_34_7" id="And_65_9" title="a reference to a single-file definition">And</a></span>
  &gt; <a href="#Exp_19_3" id="Exp_66_5" title="a reference to a single-file definition">Exp</a>.<span class="cons_Constructor"><a href="#Or_35_7" id="Or_66_9" title="a reference to a single-file definition">Or</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
