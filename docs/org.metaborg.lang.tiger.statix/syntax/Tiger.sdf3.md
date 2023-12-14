---
title: Tiger.sdf3
hide:
  - toc
---

# `Tiger.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Tiger.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Tiger.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Tiger.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="Tiger_1_8" title="Not referenced">Tiger</span>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="Defined at ../Base.sdf3 line 1">Base</a>
<span class="keyword">imports</span> <a href="../Whitespace.sdf3/#Whitespace_1_8" id="Whitespace_4_9" title="Defined at ../Whitespace.sdf3 line 1">Whitespace</a>
<span class="keyword">imports</span> <a href="../Types.sdf3/#Types_1_8" id="Types_5_9" title="Defined at ../Types.sdf3 line 1">Types</a>
<span class="keyword">imports</span> <a href="../Identifiers.sdf3/#Identifiers_1_8" id="Identifiers_6_9" title="Defined at ../Identifiers.sdf3 line 1">Identifiers</a>
<span class="keyword">imports</span> <a href="../Bindings.sdf3/#Bindings_1_8" id="Bindings_7_9" title="Defined at ../Bindings.sdf3 line 1">Bindings</a>
<span class="keyword">imports</span> <a href="../Variables.sdf3/#Variables_1_8" id="Variables_8_9" title="Defined at ../Variables.sdf3 line 1">Variables</a>
<span class="keyword">imports</span> <a href="../Functions.sdf3/#Functions_1_8" id="Functions_9_9" title="Defined at ../Functions.sdf3 line 1">Functions</a>
<span class="keyword">imports</span> <a href="../Numbers.sdf3/#Numbers_1_8" id="Numbers_10_9" title="Defined at ../Numbers.sdf3 line 1">Numbers</a>
<span class="keyword">imports</span> <a href="../Strings.sdf3/#Strings_1_8" id="Strings_11_9" title="Defined at ../Strings.sdf3 line 1">Strings</a>
<span class="keyword">imports</span> <a href="../Records.sdf3/#Records_1_8" id="Records_12_9" title="Defined at ../Records.sdf3 line 1">Records</a>
<span class="keyword">imports</span> <a href="../Arrays.sdf3/#Arrays_1_8" id="Arrays_13_9" title="Defined at ../Arrays.sdf3 line 1">Arrays</a>
<span class="keyword">imports</span> <a href="../Control-Flow.sdf3/#Control-Flow_1_8" id="Control-Flow_14_9" title="Defined at ../Control-Flow.sdf3 line 1">Control-Flow</a>

<span class="keyword">context-free start-symbols</span> <a href="#Module_18_7" id="Module_16_28" title="Defined at line 18, 21">Module</a>

<span class="keyword">sorts</span> <a href="#Module_16_28" id="Module_18_7" title="Referenced at line 16">Module</a>
<span class="keyword">context-free syntax</span>

  <a href="#Module_16_28" id="Module_21_3" title="Referenced at line 16">Module</a>.<span class="cons_Constructor"><span id="Mod_21_10" title="Not referenced">Mod</span></span> = <a href="../Variables.sdf3/#Exp_16_3" id="Exp_21_16" title="Defined at ../Variables.sdf3 line 16">Exp</a>

<span class="keyword">context-free priorities</span>

  {
    <a href="../Variables.sdf3/#Exp_16_3" id="Exp_26_5" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3/#Or_35_7" id="Or_26_9" title="Defined at ../Numbers.sdf3 line 35">Or</a></span>
  } &gt; {
    <a href="../Variables.sdf3/#Exp_16_3" id="Exp_28_5" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Arrays.sdf3/#Array_8_7" id="Array_28_9" title="Defined at ../Arrays.sdf3 line 8">Array</a></span>
  } &gt; {
    <a href="../Variables.sdf3/#Exp_16_3" id="Exp_30_5" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Control-Flow.sdf3/#Assign_37_7" id="Assign_30_9" title="Defined at ../Control-Flow.sdf3 line 37">Assign</a></span>
  },

  {
    <a href="../Variables.sdf3/#Exp_16_3" id="Exp_34_5" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3/#Uminus_21_7" id="Uminus_34_9" title="Defined at ../Numbers.sdf3 line 21">Uminus</a></span>
    <a href="../Variables.sdf3/#LValue_14_3" id="LValue_35_5" title="Defined at ../Variables.sdf3 line 14">LValue</a>.<span class="cons_Constructor"><a href="../Records.sdf3/#FieldVar_24_10" id="FieldVar_35_12" title="Defined at ../Records.sdf3 line 24">FieldVar</a></span>
    <a href="../Variables.sdf3/#LValue_14_3" id="LValue_36_5" title="Defined at ../Variables.sdf3 line 14">LValue</a>.<span class="cons_Constructor"><a href="../Arrays.sdf3/#Subscript_12_10" id="Subscript_36_12" title="Defined at ../Arrays.sdf3 line 12">Subscript</a></span>
  } &gt; {<span class="keyword">left</span>:
    <a href="../Variables.sdf3/#Exp_16_3" id="Exp_38_5" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3/#Times_22_7" id="Times_38_9" title="Defined at ../Numbers.sdf3 line 22">Times</a></span>
    <a href="../Variables.sdf3/#Exp_16_3" id="Exp_39_5" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3/#Divide_23_7" id="Divide_39_9" title="Defined at ../Numbers.sdf3 line 23">Divide</a></span>
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
