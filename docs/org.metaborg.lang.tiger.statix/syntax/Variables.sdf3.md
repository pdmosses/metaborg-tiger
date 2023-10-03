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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Variables_105_114" id="Variables_7_16" title="Referenced at ../Tiger.sdf3 line 8">Variables</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_26_30" title="Defined at ../Base.sdf3 line 1">Base</a>


<span class="keyword">context-free syntax</span>

  <span id="Dec_56_59" title="Not referenced locally, nor via imports">Dec</span>.<span class="cons_Constructor"><span id="VarDec_60_66" title="Not referenced locally, nor via imports">VarDec</span></span> = &lt;<span class="cons_String">var</span> &lt;<a href="../Base.sdf3#ID_72_74" id="ID_75_77" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../Base.sdf3#Type_41_45" id="Type_82_86" title="Defined at ../Base.sdf3 line 5">Type</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_175_178" id="Exp_92_95" title="Defined at line 16">Exp</a>&gt;&gt;

  <span id="Dec_101_104" title="Not referenced locally, nor via imports">Dec</span>.<span class="cons_Constructor"><span id="VarDecNoType_105_117" title="Not referenced locally, nor via imports">VarDecNoType</span></span> = &lt;<span class="cons_String">var</span> &lt;<a href="../Base.sdf3#ID_72_74" id="ID_126_128" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_175_178" id="Exp_134_137" title="Defined at line 16">Exp</a>&gt;&gt;

  <a href="#Var_168_171" id="Var_143_146" title="Referenced at line 14">Var</a>.<span class="cons_Constructor"><span id="Var_147_150" title="Not referenced locally, nor via imports">Var</span></span> = <a href="../Base.sdf3#ID_72_74" id="ID_153_155" title="Defined at ../Base.sdf3 line 9">ID</a>

  <a href="#LValue_181_187" id="LValue_159_165" title="Referenced at line 16; ../Tiger.sdf3 line 36">LValue</a> = <a href="#Var_143_146" id="Var_168_171" title="Defined at line 12">Var</a>

  <a href="#Exp_134_137" id="Exp_175_178" title="Referenced at line 10; ../Tiger.sdf3 line 39">Exp</a> = <a href="#LValue_159_165" id="LValue_181_187" title="Defined at line 14">LValue</a>

</code></pre></td></tr></tbody></table></div>