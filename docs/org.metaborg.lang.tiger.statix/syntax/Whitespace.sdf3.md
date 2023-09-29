---
title: Whitespace.sdf3
---

# `Whitespace.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Whitespace.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Whitespace.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Whitespace.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Whitespace_35_45" id="Whitespace_7_17" title="Referenced at ../Tiger.sdf3 line 4">Whitespace</a>

<span class="keyword">lexical sorts</span>
  <a href="#CommentChar_486_497" id="CommentChar_35_46" title="Referenced at line 23">CommentChar</a> <a href="#InsideComment_191_204" id="InsideComment_47_60" title="Referenced at line 10">InsideComment</a> <a href="#SingleLineComment_286_303" id="SingleLineComment_61_78" title="Referenced at line 13">SingleLineComment</a> <a href="#NewLineEOF_340_350" id="NewLineEOF_79_89" title="Referenced at line 14">NewLineEOF</a> <a href="#EOF_511_514" id="EOF_90_93" title="Referenced at line 24">EOF</a>
  
<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span>         = [\ \t\n\r]
  <a href="#CommentChar_486_497" id="CommentChar_145_156" title="Referenced at line 23">CommentChar</a>    = [\*]
  <span class="keyword">LAYOUT</span>         = <span class="cons_Lit">"/*"</span> <a href="#InsideComment_47_60" id="InsideComment_191_204" title="Defined at line 4, 11, 12">InsideComment</a>* <span class="cons_Lit">"*/"</span>
  <a href="#InsideComment_191_204" id="InsideComment_213_226" title="Referenced at line 10">InsideComment</a>  = ~[\*]
  <a href="#InsideComment_191_204" id="InsideComment_238_251" title="Referenced at line 10">InsideComment</a>  = <a href="#CommentChar_35_46" id="CommentChar_255_266" title="Defined at line 4, 9">CommentChar</a>
  <span class="keyword">LAYOUT</span>         = <a href="#SingleLineComment_61_78" id="SingleLineComment_286_303" title="Defined at line 4, 14">SingleLineComment</a>
  <a href="#SingleLineComment_286_303" id="SingleLineComment_306_323" title="Referenced at line 13">SingleLineComment</a> = <span class="cons_Lit">"//"</span> ~[\n\r]* <a href="#NewLineEOF_79_89" id="NewLineEOF_340_350" title="Defined at line 4, 15, 16">NewLineEOF</a>
  <a href="#NewLineEOF_340_350" id="NewLineEOF_353_363" title="Referenced at line 14">NewLineEOF</a>     = [\n\r]
  <a href="#NewLineEOF_340_350" id="NewLineEOF_379_389" title="Referenced at line 14">NewLineEOF</a>     = <a href="#EOF_90_93" id="EOF_396_399" title="Defined at line 4, 17">EOF</a>
  <a href="#EOF_511_514" id="EOF_402_405" title="Referenced at line 24">EOF</a>            =

<span class="keyword">lexical restrictions</span>

  <span class="layout">// Ensure greedy matching for lexicals</span>

  <a href="#CommentChar_35_46" id="CommentChar_486_497" title="Defined at line 4, 9">CommentChar</a>   -/- [\/]
  <a href="#EOF_90_93" id="EOF_511_514" title="Defined at line 4, 17">EOF</a> -/- ~[]

<span class="keyword">context-free restrictions</span>

  <span class="layout">// Ensure greedy matching for comments</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]

</code></pre></td></tr></tbody></table></div>