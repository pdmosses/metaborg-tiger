---
title: Functions.sdf3
---

# `Functions.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Functions.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Functions.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Functions.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Functions_123_132" id="Functions_7_16" title="Referenced at ../Tiger.sdf3 line 9">Functions</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_26_30" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">sorts</span> <a href="#FArg_172_176" id="FArg_38_42" title="Referenced at line 14">FArg</a>
<span class="keyword">context-free syntax</span>

  <span id="Dec_66_69" title="Not referenced locally, nor via imports">Dec</span>.<span class="cons_Constructor"><span id="ProcDec_70_77" title="Not referenced locally, nor via imports">ProcDec</span></span> = &lt;
    <span class="cons_String">function</span> &lt;<a href="../Base.sdf3#ID_72_74" id="ID_96_98" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#FArg_38_42" id="FArg_102_106" title="Defined at line 5, 18">FArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
      &lt;<a href="#Exp_247_250" id="Exp_125_128" title="Defined at line 20">Exp</a>&gt;
  &gt;

  <span id="Dec_137_140" title="Not referenced locally, nor via imports">Dec</span>.<span class="cons_Constructor"><span id="FunDec_141_147" title="Not referenced locally, nor via imports">FunDec</span></span> = &lt;
    <span class="cons_String">function</span> &lt;<a href="../Base.sdf3#ID_72_74" id="ID_166_168" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#FArg_38_42" id="FArg_172_176" title="Defined at line 5, 18">FArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">:</span> &lt;<a href="../Base.sdf3#Type_41_45" id="Type_189_193" title="Defined at ../Base.sdf3 line 5">Type</a>&gt; <span class="cons_String">=</span>
      &lt;<a href="#Exp_247_250" id="Exp_204_207" title="Defined at line 20">Exp</a>&gt;
  &gt;

  <a href="#FArg_172_176" id="FArg_216_220" title="Referenced at line 14">FArg</a>.<span class="cons_Constructor"><span id="FArg_221_225" title="Not referenced locally, nor via imports">FArg</span></span> = &lt;&lt;<a href="../Base.sdf3#ID_72_74" id="ID_230_232" title="Defined at ../Base.sdf3 line 9">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../Base.sdf3#Type_41_45" id="Type_237_241" title="Defined at ../Base.sdf3 line 5">Type</a>&gt;&gt;

  <a href="#Exp_266_269" id="Exp_247_250" title="Referenced at line 20">Exp</a>.<span class="cons_Constructor"><span id="Call_251_255" title="Not referenced locally, nor via imports">Call</span></span> = &lt;&lt;<a href="../Base.sdf3#ID_72_74" id="ID_260_262" title="Defined at ../Base.sdf3 line 9">ID</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Exp_247_250" id="Exp_266_269" title="Defined at line 20">Exp</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

</code></pre></td></tr></tbody></table></div>