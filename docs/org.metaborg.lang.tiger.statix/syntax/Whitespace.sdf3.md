---
title: Whitespace.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Whitespace_4_9" id="Whitespace_1_8" title="a definition with a single reference">Whitespace</a>

<span class="keyword">lexical sorts</span>
  <button class="modal-open" id="CommentChar_4_3" title="a definition with multiple references" data-urls="#CommentChar line 12_20, 23_3">CommentChar</button> <a href="#InsideComment_10_25" id="InsideComment_4_15" title="a definition with a single reference">InsideComment</a> <a href="#SingleLineComment_13_20" id="SingleLineComment_4_29" title="a definition with a single reference">SingleLineComment</a> <a href="#NewLineEOF_14_37" id="NewLineEOF_4_47" title="a definition with a single reference">NewLineEOF</a> <button class="modal-open" id="EOF_4_58" title="a definition with multiple references" data-urls="#EOF line 16_20, 24_3">EOF</button>
  
<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span>         = [\ \t\n\r]
  <button class="modal-open" id="CommentChar_9_3" title="a definition with multiple references" data-urls="#CommentChar line 12_20, 23_3">CommentChar</button>    = [\*]
  <span class="keyword">LAYOUT</span>         = <span class="cons_Lit">"/*"</span> <a href="#InsideComment_4_15" id="InsideComment_10_25" title="a reference to a single-file definition">InsideComment</a>* <span class="cons_Lit">"*/"</span>
  <a href="#InsideComment_10_25" id="InsideComment_11_3" title="a definition with a single reference">InsideComment</a>  = ~[\*]
  <a href="#InsideComment_10_25" id="InsideComment_12_3" title="a definition with a single reference">InsideComment</a>  = <a href="#CommentChar_4_3" id="CommentChar_12_20" title="a reference to a single-file definition">CommentChar</a>
  <span class="keyword">LAYOUT</span>         = <a href="#SingleLineComment_4_29" id="SingleLineComment_13_20" title="a reference to a single-file definition">SingleLineComment</a>
  <a href="#SingleLineComment_13_20" id="SingleLineComment_14_3" title="a definition with a single reference">SingleLineComment</a> = <span class="cons_Lit">"//"</span> ~[\n\r]* <a href="#NewLineEOF_4_47" id="NewLineEOF_14_37" title="a reference to a single-file definition">NewLineEOF</a>
  <a href="#NewLineEOF_14_37" id="NewLineEOF_15_3" title="a definition with a single reference">NewLineEOF</a>     = [\n\r]
  <a href="#NewLineEOF_14_37" id="NewLineEOF_16_3" title="a definition with a single reference">NewLineEOF</a>     = <a href="#EOF_4_58" id="EOF_16_20" title="a reference to a single-file definition">EOF</a>
  <button class="modal-open" id="EOF_17_3" title="a definition with multiple references" data-urls="#EOF line 16_20, 24_3">EOF</button>            =

<span class="keyword">lexical restrictions</span>

  <span class="layout">// Ensure greedy matching for lexicals</span>

  <a href="#CommentChar_4_3" id="CommentChar_23_3" title="a reference to a single-file definition">CommentChar</a>   -/- [\/]
  <a href="#EOF_4_58" id="EOF_24_3" title="a reference to a single-file definition">EOF</a> -/- ~[]

<span class="keyword">context-free restrictions</span>

  <span class="layout">// Ensure greedy matching for comments</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
