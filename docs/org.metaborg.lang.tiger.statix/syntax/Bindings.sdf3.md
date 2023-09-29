---
title: Bindings.sdf3
---

# `Bindings.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Bindings.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Bindings.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Bindings.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Bindings_88_96" id="Bindings_7_15" title="Referenced at ../Tiger.sdf3 line 7">Bindings</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_25_29" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">sorts</span> <span id="Declarations_37_49" title="Not referenced locally, nor via imports">Declarations</span>

<span class="keyword">context-free syntax</span>

  <a href="#Exp_130_133" id="Exp_74_77" title="Referenced at line 13">Exp</a>.<span class="cons_Constructor"><span id="Let_78_81" title="Not referenced locally, nor via imports">Let</span></span> = &lt;
    <span class="cons_String">let</span>
      &lt;{<a href="../Base.sdf3#Dec_19_22" id="Dec_102_105" title="Defined at ../Base.sdf3 line 3">Dec</a> <span class="cons_Lit">"\n"</span>}*&gt;
     <span class="cons_String">in</span>
      &lt;{<a href="#Exp_74_77" id="Exp_130_133" title="Defined at line 9">Exp</a> <span class="cons_Lit">";\n"</span>}*&gt;
    <span class="cons_String">end</span>
  &gt;

  <span id="Declarations_158_170" title="Not referenced locally, nor via imports">Declarations</span>.<span class="cons_Constructor"><span id="Declarations_171_183" title="Not referenced locally, nor via imports">Declarations</span></span> = &lt;
    <span class="cons_String">declarations</span> &lt;{<a href="../Base.sdf3#Dec_19_22" id="Dec_207_210" title="Defined at ../Base.sdf3 line 3">Dec</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;




</code></pre></td></tr></tbody></table></div>