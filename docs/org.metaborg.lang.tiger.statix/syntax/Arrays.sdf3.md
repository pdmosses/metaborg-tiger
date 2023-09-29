---
title: Arrays.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Arrays_189_195" id="Arrays_7_13" title="Referenced at ../Tiger.sdf3 line 13">Arrays</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_23_27" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="layout">// Arrays</span>
<span class="keyword">context-free syntax</span>

  <a href="#Exp_164_167" id="Exp_62_65" title="Referenced at line 12">Exp</a>.<span class="cons_Constructor"><a href="../Tiger.sdf3#Array_363_368" id="Array_66_71" title="Referenced at ../Tiger.sdf3 line 28">Array</a></span> = &lt;&lt;<a href="../Base.sdf3#ID_72_74" id="ID_76_78" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;<span class="cons_String">[</span>&lt;<a href="#Exp_62_65" id="Exp_81_84" title="Defined at line 8">Exp</a>&gt;<span class="cons_String">]</span> <span class="cons_String">of</span> &lt;<a href="#Exp_62_65" id="Exp_91_94" title="Defined at line 8">Exp</a>&gt;&gt;

  <span id="Type_100_104" title="Not referenced locally, nor via imports">Type</span>.<span class="cons_Constructor"><span id="ArrayTy_105_112" title="Not referenced locally, nor via imports">ArrayTy</span></span> = &lt;<span class="cons_String">array</span> <span class="cons_String">of</span> &lt;<a href="../Base.sdf3#ID_72_74" id="ID_126_128" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;&gt;

  <a href="#LValue_155_161" id="LValue_134_140" title="Referenced at line 12">LValue</a>.<span class="cons_Constructor"><a href="../Tiger.sdf3#Subscript_448_457" id="Subscript_141_150" title="Referenced at ../Tiger.sdf3 line 36">Subscript</a></span> = &lt;&lt;<a href="#LValue_134_140" id="LValue_155_161" title="Defined at line 12">LValue</a>&gt;<span class="cons_String">[</span>&lt;<a href="#Exp_62_65" id="Exp_164_167" title="Defined at line 8">Exp</a>&gt;<span class="cons_String">]</span>&gt;

</code></pre></td></tr></tbody></table></div>