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
<td class="code"><pre><code><span class="keyword">module</span> <span id="Tiger_7_12" title="Not referenced locally, nor via imports">Tiger</span>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_22_26" title="Defined at ../Base.sdf3 line 1">Base</a>
<span class="keyword">imports</span> <a href="../Whitespace.sdf3#Whitespace_7_17" id="Whitespace_35_45" title="Defined at ../Whitespace.sdf3 line 1">Whitespace</a>
<span class="keyword">imports</span> <a href="../Types.sdf3#Types_7_12" id="Types_54_59" title="Defined at ../Types.sdf3 line 1">Types</a>
<span class="keyword">imports</span> <a href="../Identifiers.sdf3#Identifiers_7_18" id="Identifiers_68_79" title="Defined at ../Identifiers.sdf3 line 1">Identifiers</a>
<span class="keyword">imports</span> <a href="../Bindings.sdf3#Bindings_7_15" id="Bindings_88_96" title="Defined at ../Bindings.sdf3 line 1">Bindings</a>
<span class="keyword">imports</span> <a href="../Variables.sdf3#Variables_7_16" id="Variables_105_114" title="Defined at ../Variables.sdf3 line 1">Variables</a>
<span class="keyword">imports</span> <a href="../Functions.sdf3#Functions_7_16" id="Functions_123_132" title="Defined at ../Functions.sdf3 line 1">Functions</a>
<span class="keyword">imports</span> <a href="../Numbers.sdf3#Numbers_7_14" id="Numbers_141_148" title="Defined at ../Numbers.sdf3 line 1">Numbers</a>
<span class="keyword">imports</span> <a href="../Strings.sdf3#Strings_7_14" id="Strings_157_164" title="Defined at ../Strings.sdf3 line 1">Strings</a>
<span class="keyword">imports</span> <a href="../Records.sdf3#Records_7_14" id="Records_173_180" title="Defined at ../Records.sdf3 line 1">Records</a>
<span class="keyword">imports</span> <a href="../Arrays.sdf3#Arrays_7_13" id="Arrays_189_195" title="Defined at ../Arrays.sdf3 line 1">Arrays</a>
<span class="keyword">imports</span> <a href="../Control-Flow.sdf3#Control-Flow_7_19" id="Control-Flow_204_216" title="Defined at ../Control-Flow.sdf3 line 1">Control-Flow</a>

<span class="keyword">context-free start-symbols</span> <a href="#Module_259_265" id="Module_245_251" title="Defined at line 18, 21">Module</a>

<span class="keyword">sorts</span> <a href="#Module_245_251" id="Module_259_265" title="Referenced at line 16">Module</a>
<span class="keyword">context-free syntax</span>

  <a href="#Module_245_251" id="Module_289_295" title="Referenced at line 16">Module</a>.<span class="cons_Constructor"><span id="Mod_296_299" title="Not referenced locally, nor via imports">Mod</span></span> = <a href="../Variables.sdf3#Exp_175_178" id="Exp_302_305" title="Defined at ../Variables.sdf3 line 16">Exp</a>

<span class="keyword">context-free priorities</span>

  {
    <a href="../Variables.sdf3#Exp_175_178" id="Exp_340_343" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3#Or_740_742" id="Or_344_346" title="Defined at ../Numbers.sdf3 line 35">Or</a></span>
  } &gt; {
    <a href="../Variables.sdf3#Exp_175_178" id="Exp_359_362" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Arrays.sdf3#Array_66_71" id="Array_363_368" title="Defined at ../Arrays.sdf3 line 8">Array</a></span>
  } &gt; {
    <a href="../Variables.sdf3#Exp_175_178" id="Exp_381_384" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Control-Flow.sdf3#Assign_376_382" id="Assign_385_391" title="Defined at ../Control-Flow.sdf3 line 37">Assign</a></span>
  },

  {
    <a href="../Variables.sdf3#Exp_175_178" id="Exp_406_409" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3#Uminus_231_237" id="Uminus_410_416" title="Defined at ../Numbers.sdf3 line 21">Uminus</a></span>
    <a href="../Variables.sdf3#LValue_159_165" id="LValue_421_427" title="Defined at ../Variables.sdf3 line 14">LValue</a>.<span class="cons_Constructor"><a href="../Records.sdf3#FieldVar_295_303" id="FieldVar_428_436" title="Defined at ../Records.sdf3 line 24">FieldVar</a></span>
    <a href="../Variables.sdf3#LValue_159_165" id="LValue_441_447" title="Defined at ../Variables.sdf3 line 14">LValue</a>.<span class="cons_Constructor"><a href="../Arrays.sdf3#Subscript_141_150" id="Subscript_448_457" title="Defined at ../Arrays.sdf3 line 12">Subscript</a></span>
  } &gt; {<span class="keyword">left</span>:
    <a href="../Variables.sdf3#Exp_175_178" id="Exp_475_478" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3#Times_257_262" id="Times_479_484" title="Defined at ../Numbers.sdf3 line 22">Times</a></span>
    <a href="../Variables.sdf3#Exp_175_178" id="Exp_489_492" title="Defined at ../Variables.sdf3 line 16">Exp</a>.<span class="cons_Constructor"><a href="../Numbers.sdf3#Divide_298_304" id="Divide_493_499" title="Defined at ../Numbers.sdf3 line 23">Divide</a></span>
  }

</code></pre></td></tr></tbody></table></div>