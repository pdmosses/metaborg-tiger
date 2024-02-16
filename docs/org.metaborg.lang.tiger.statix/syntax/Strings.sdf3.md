---
title: Strings.sdf3
hide:
  - toc
---

# `Strings.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Strings.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Strings.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Strings.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Strings_11_9" id="Strings_1_8" title="a definition with a single reference">Strings</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="a reference to a single-file definition">Base</a>

<span class="keyword">lexical sorts</span> <a href="#StrConst_28_16" id="StrConst_5_15" title="a definition with a single reference">StrConst</a> <a href="#StrChar_9_19" id="StrChar_5_24" title="a definition with a single reference">StrChar</a>

<span class="keyword">lexical syntax</span>

  <a href="#StrConst_28_16" id="StrConst_9_3" title="a definition with a single reference">StrConst</a> = <span class="cons_Lit">"\""</span> <a href="#StrChar_5_24" id="StrChar_9_19" title="a reference to a single-file definition">StrChar</a>* <span class="cons_Lit">"\""</span>
  <a href="#StrChar_9_19" id="StrChar_10_3" title="a definition with a single reference">StrChar</a> = ~[\\\"\r\n]
  <a href="#StrChar_9_19" id="StrChar_11_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">a</span>]
  <a href="#StrChar_9_19" id="StrChar_12_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">b</span>]
  <a href="#StrChar_9_19" id="StrChar_13_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">f</span>]
  <a href="#StrChar_9_19" id="StrChar_14_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">n</span>]
  <a href="#StrChar_9_19" id="StrChar_15_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">r</span>]
  <a href="#StrChar_9_19" id="StrChar_16_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">t</span>]
  <a href="#StrChar_9_19" id="StrChar_17_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">v</span>]
  <a href="#StrChar_9_19" id="StrChar_18_3" title="a definition with a single reference">StrChar</a> = [\\] [\^] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]
  <a href="#StrChar_9_19" id="StrChar_19_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
  <a href="#StrChar_9_19" id="StrChar_20_3" title="a definition with a single reference">StrChar</a> = [\\] [<span class="cons_Regular">x</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span>]
  <a href="#StrChar_9_19" id="StrChar_21_3" title="a definition with a single reference">StrChar</a> = [\\] [\\]
  <a href="#StrChar_9_19" id="StrChar_22_3" title="a definition with a single reference">StrChar</a> = [\\] [\"]

  <a href="#StrChar_9_19" id="StrChar_24_3" title="a definition with a single reference">StrChar</a> = [\\] [\ \t\r\n]+ [\\]

<span class="keyword">context-free syntax</span>

  <span id="Exp_28_3" title="a definition with no references">Exp</span>.<span class="cons_Constructor"><span id="String_28_7" title="a definition with no references">String</span></span> = <a href="#StrConst_5_15" id="StrConst_28_16" title="a reference to a single-file definition">StrConst</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
