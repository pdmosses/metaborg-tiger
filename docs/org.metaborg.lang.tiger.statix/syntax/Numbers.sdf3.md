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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Numbers_141_148" id="Numbers_7_14" title="Referenced at ../Tiger.sdf3 line 10">Numbers</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_24_28" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">lexical sorts</span> <a href="#IntConst_215_223" id="IntConst_44_52" title="Referenced at line 19">IntConst</a>
<span class="keyword">lexical syntax</span>

  <a href="#IntConst_215_223" id="IntConst_71_79" title="Referenced at line 19">IntConst</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

<span class="keyword">lexical restrictions</span>

  <span class="layout">// Ensure greedy matching for lexicals</span>

  <a href="#IntConst_44_52" id="IntConst_156_164" title="Defined at line 5, 8">IntConst</a>  -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]


<span class="keyword">context-free syntax</span>

  <a href="#Exp_1471_1474" id="Exp_201_204" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><span id="Int_205_208" title="Not referenced locally, nor via imports">Int</span></span>     = <a href="#IntConst_44_52" id="IntConst_215_223" title="Defined at line 5, 8">IntConst</a>

  <a href="#Exp_1471_1474" id="Exp_227_230" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Uminus_1278_1284" id="Uminus_231_237" title="Referenced at line 51; ../Tiger.sdf3 line 34">Uminus</a></span>  = [<span class="cons_String">-</span> [<a href="#Exp_201_204" id="Exp_245_248" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]
  <a href="#Exp_1471_1474" id="Exp_253_256" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Times_1306_1311" id="Times_257_262" title="Referenced at line 53; ../Tiger.sdf3 line 38">Times</a></span>   = [[<a href="#Exp_201_204" id="Exp_269_272" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">*</span> [<a href="#Exp_201_204" id="Exp_277_280" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_1471_1474" id="Exp_294_297" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Divide_1320_1326" id="Divide_298_304" title="Referenced at line 54; ../Tiger.sdf3 line 39">Divide</a></span>  = [[<a href="#Exp_201_204" id="Exp_310_313" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">/</span> [<a href="#Exp_201_204" id="Exp_318_321" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_1471_1474" id="Exp_335_338" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Plus_1348_1352" id="Plus_339_343" title="Referenced at line 56">Plus</a></span>    = [[<a href="#Exp_201_204" id="Exp_351_354" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">+</span> [<a href="#Exp_201_204" id="Exp_359_362" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_1471_1474" id="Exp_376_379" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Minus_1361_1366" id="Minus_380_385" title="Referenced at line 57">Minus</a></span>   = [[<a href="#Exp_201_204" id="Exp_392_395" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">-</span> [<a href="#Exp_201_204" id="Exp_400_403" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}

  <a href="#Exp_1471_1474" id="Exp_418_421" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Eq_1393_1395" id="Eq_422_424" title="Referenced at line 59">Eq</a></span>      = [[<a href="#Exp_201_204" id="Exp_434_437" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">=</span> [<a href="#Exp_201_204" id="Exp_442_445" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <a href="#Exp_1471_1474" id="Exp_464_467" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Neq_1404_1407" id="Neq_468_471" title="Referenced at line 60">Neq</a></span>     = [[<a href="#Exp_201_204" id="Exp_480_483" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&lt;&gt;</span> [<a href="#Exp_201_204" id="Exp_489_492" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]  {<span class="keyword">non-assoc</span>}
  <a href="#Exp_1471_1474" id="Exp_510_513" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Gt_1416_1418" id="Gt_514_516" title="Referenced at line 61">Gt</a></span>      = [[<a href="#Exp_201_204" id="Exp_526_529" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&gt;</span> [<a href="#Exp_201_204" id="Exp_534_537" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <a href="#Exp_1471_1474" id="Exp_556_559" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Lt_1427_1429" id="Lt_560_562" title="Referenced at line 62">Lt</a></span>      = [[<a href="#Exp_201_204" id="Exp_572_575" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&lt;</span> [<a href="#Exp_201_204" id="Exp_580_583" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">non-assoc</span>}
  <a href="#Exp_1471_1474" id="Exp_602_605" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Geq_1438_1441" id="Geq_606_609" title="Referenced at line 63">Geq</a></span>     = [[<a href="#Exp_201_204" id="Exp_618_621" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&gt;=</span> [<a href="#Exp_201_204" id="Exp_627_630" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]  {<span class="keyword">non-assoc</span>}
  <a href="#Exp_1471_1474" id="Exp_648_651" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Leq_1450_1453" id="Leq_652_655" title="Referenced at line 64">Leq</a></span>     = [[<a href="#Exp_201_204" id="Exp_664_667" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&lt;=</span> [<a href="#Exp_201_204" id="Exp_673_676" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]  {<span class="keyword">non-assoc</span>}

  <a href="#Exp_1471_1474" id="Exp_695_698" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#And_1463_1466" id="And_699_702" title="Referenced at line 65">And</a></span>     = [[<a href="#Exp_201_204" id="Exp_711_714" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">&amp;</span> [<a href="#Exp_201_204" id="Exp_719_722" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}
  <a href="#Exp_1471_1474" id="Exp_736_739" title="Referenced at line 66">Exp</a>.<span class="cons_Constructor"><a href="#Or_1475_1477" id="Or_740_742" title="Referenced at line 66; ../Tiger.sdf3 line 26">Or</a></span>      = [[<a href="#Exp_201_204" id="Exp_752_755" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>] <span class="cons_String">|</span> [<a href="#Exp_201_204" id="Exp_760_763" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>]]   {<span class="keyword">left</span>}

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

  {<a href="#Exp_201_204" id="Exp_1274_1277" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Uminus_231_237" id="Uminus_1278_1284" title="Defined at line 21">Uminus</a></span>}
  &gt; {<span class="keyword">left</span> :
    <a href="#Exp_201_204" id="Exp_1302_1305" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Times_257_262" id="Times_1306_1311" title="Defined at line 22">Times</a></span>
    <a href="#Exp_201_204" id="Exp_1316_1319" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Divide_298_304" id="Divide_1320_1326" title="Defined at line 23">Divide</a></span>}
  &gt; {<span class="keyword">left</span> :
    <a href="#Exp_201_204" id="Exp_1344_1347" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Plus_339_343" id="Plus_1348_1352" title="Defined at line 24">Plus</a></span>
    <a href="#Exp_201_204" id="Exp_1357_1360" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Minus_380_385" id="Minus_1361_1366" title="Defined at line 25">Minus</a></span>}
  &gt; {<span class="keyword">non-assoc</span> :
    <a href="#Exp_201_204" id="Exp_1389_1392" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Eq_422_424" id="Eq_1393_1395" title="Defined at line 27">Eq</a></span>
    <a href="#Exp_201_204" id="Exp_1400_1403" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Neq_468_471" id="Neq_1404_1407" title="Defined at line 28">Neq</a></span>
    <a href="#Exp_201_204" id="Exp_1412_1415" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Gt_514_516" id="Gt_1416_1418" title="Defined at line 29">Gt</a></span>
    <a href="#Exp_201_204" id="Exp_1423_1426" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Lt_560_562" id="Lt_1427_1429" title="Defined at line 30">Lt</a></span>
    <a href="#Exp_201_204" id="Exp_1434_1437" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Geq_606_609" id="Geq_1438_1441" title="Defined at line 31">Geq</a></span>
    <a href="#Exp_201_204" id="Exp_1446_1449" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Leq_652_655" id="Leq_1450_1453" title="Defined at line 32">Leq</a></span>}
  &gt; <a href="#Exp_201_204" id="Exp_1459_1462" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#And_699_702" id="And_1463_1466" title="Defined at line 34">And</a></span>
  &gt; <a href="#Exp_201_204" id="Exp_1471_1474" title="Defined at line 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 34, 35">Exp</a>.<span class="cons_Constructor"><a href="#Or_740_742" id="Or_1475_1477" title="Defined at line 35">Or</a></span>

</code></pre></td></tr></tbody></table></div>