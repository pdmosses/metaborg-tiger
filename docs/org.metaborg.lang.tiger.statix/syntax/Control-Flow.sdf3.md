---
title: Control-Flow.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Control-Flow_204_216" id="Control-Flow_7_19" title="Referenced at ../Tiger.sdf3 line 14">Control-Flow</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_29_33" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">context-free syntax</span>

  <a href="#Exp_509_512" id="Exp_58_61" title="Referenced at line 47">Exp</a>.<span class="cons_Constructor"><span id="Seq_62_65" title="Not referenced locally, nor via imports">Seq</span></span> = &lt;
    <span class="cons_String">(</span>
      &lt;{<a href="#Exp_58_61" id="Exp_84_87" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a> <span class="cons_Lit">";\n"</span>}*&gt;
    <span class="cons_String">)</span>
  &gt;

  <a href="#Exp_509_512" id="Exp_110_113" title="Referenced at line 47">Exp</a>.<span class="cons_Constructor"><a href="#If_473_475" id="If_114_116" title="Referenced at line 44">If</a></span> = &lt;
    <span class="cons_String">if</span> &lt;<a href="#Exp_58_61" id="Exp_129_132" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt; <span class="cons_String">then</span>
      &lt;<a href="#Exp_58_61" id="Exp_146_149" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt;
    <span class="cons_String">else</span>
      &lt;<a href="#Exp_58_61" id="Exp_167_170" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt;
  &gt;

  <a href="#Exp_509_512" id="Exp_179_182" title="Referenced at line 47">Exp</a>.<span class="cons_Constructor"><a href="#IfThen_484_490" id="IfThen_183_189" title="Referenced at line 45">IfThen</a></span> = &lt;
    <span class="cons_String">if</span> &lt;<a href="#Exp_58_61" id="Exp_202_205" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt; <span class="cons_String">then</span>
      &lt;<a href="#Exp_58_61" id="Exp_219_222" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt;
  &gt;

  <a href="#Exp_509_512" id="Exp_231_234" title="Referenced at line 47">Exp</a>.<span class="cons_Constructor"><a href="#While_499_504" id="While_235_240" title="Referenced at line 46">While</a></span> = &lt;
    <span class="cons_String">while</span> &lt;<a href="#Exp_58_61" id="Exp_256_259" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt; <span class="cons_String">do</span>
      &lt;<a href="#Exp_58_61" id="Exp_271_274" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt;
  &gt;

  <a href="#Exp_509_512" id="Exp_283_286" title="Referenced at line 47">Exp</a>.<span class="cons_Constructor"><a href="#For_513_516" id="For_287_290" title="Referenced at line 47">For</a></span> = &lt;
    <span class="cons_String">for</span> &lt;<a href="../Base.sdf3#Var_53_56" id="Var_304_307" title="Defined at ../Base.sdf3 line 7">Var</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_58_61" id="Exp_313_316" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt; <span class="cons_String">to</span> &lt;<a href="#Exp_58_61" id="Exp_322_325" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt; <span class="cons_String">do</span>
      &lt;<a href="#Exp_58_61" id="Exp_337_340" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt;
  &gt;

  <a href="#Exp_509_512" id="Exp_349_352" title="Referenced at line 47">Exp</a>.<span class="cons_Constructor"><span id="Break_353_358" title="Not referenced locally, nor via imports">Break</span></span> = &lt;<span class="cons_String">break</span>&gt;

  <a href="#Exp_509_512" id="Exp_372_375" title="Referenced at line 47">Exp</a>.<span class="cons_Constructor"><a href="#Assign_443_449" id="Assign_376_382" title="Referenced at line 42; ../Tiger.sdf3 line 30">Assign</a></span> = &lt;&lt;<a href="../Base.sdf3#LValue_27_33" id="LValue_387_393" title="Defined at ../Base.sdf3 line 3">LValue</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#Exp_58_61" id="Exp_399_402" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>&gt;&gt;

<span class="keyword">context-free priorities</span>

  {
    <a href="#Exp_58_61" id="Exp_439_442" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>.<span class="cons_Constructor"><a href="#Assign_376_382" id="Assign_443_449" title="Defined at line 37">Assign</a></span>
  } &gt; { <span class="keyword">right</span>:
    <a href="#Exp_58_61" id="Exp_469_472" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>.<span class="cons_Constructor"><a href="#If_114_116" id="If_473_475" title="Defined at line 13">If</a></span>
    <a href="#Exp_58_61" id="Exp_480_483" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>.<span class="cons_Constructor"><a href="#IfThen_183_189" id="IfThen_484_490" title="Defined at line 20">IfThen</a></span>
    <a href="#Exp_58_61" id="Exp_495_498" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>.<span class="cons_Constructor"><a href="#While_235_240" id="While_499_504" title="Defined at line 25">While</a></span>
    <a href="#Exp_58_61" id="Exp_509_512" title="Defined at line 7, 13, 20, 25, 30, 35, 37">Exp</a>.<span class="cons_Constructor"><a href="#For_287_290" id="For_513_516" title="Defined at line 30">For</a></span>
  }

</code></pre></td></tr></tbody></table></div>