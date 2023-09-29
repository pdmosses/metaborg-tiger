---
title: Strings.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Strings_157_164" id="Strings_7_14" title="Referenced at ../Tiger.sdf3 line 11">Strings</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_24_28" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">lexical sorts</span> <a href="#StrConst_505_513" id="StrConst_44_52" title="Referenced at line 28">StrConst</a> <a href="#StrChar_96_103" id="StrChar_53_60" title="Referenced at line 9">StrChar</a>

<span class="keyword">lexical syntax</span>

  <a href="#StrConst_505_513" id="StrConst_80_88" title="Referenced at line 28">StrConst</a> = <span class="cons_Lit">"\""</span> <a href="#StrChar_53_60" id="StrChar_96_103" title="Defined at line 5, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24">StrChar</a>* <span class="cons_Lit">"\""</span>
  <a href="#StrChar_96_103" id="StrChar_112_119" title="Referenced at line 9">StrChar</a> = ~[\\\"\r\n]
  <a href="#StrChar_96_103" id="StrChar_136_143" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">a</span>]
  <a href="#StrChar_96_103" id="StrChar_157_164" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">b</span>]
  <a href="#StrChar_96_103" id="StrChar_178_185" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">f</span>]
  <a href="#StrChar_96_103" id="StrChar_199_206" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">n</span>]
  <a href="#StrChar_96_103" id="StrChar_220_227" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">r</span>]
  <a href="#StrChar_96_103" id="StrChar_241_248" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">t</span>]
  <a href="#StrChar_96_103" id="StrChar_262_269" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">v</span>]
  <a href="#StrChar_96_103" id="StrChar_283_290" title="Referenced at line 9">StrChar</a> = [\\] [\^] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]
  <a href="#StrChar_96_103" id="StrChar_311_318" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
  <a href="#StrChar_96_103" id="StrChar_346_353" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">x</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span>]
  <a href="#StrChar_96_103" id="StrChar_391_398" title="Referenced at line 9">StrChar</a> = [\\] [\\]
  <a href="#StrChar_96_103" id="StrChar_413_420" title="Referenced at line 9">StrChar</a> = [\\] [\"]

  <a href="#StrChar_96_103" id="StrChar_436_443" title="Referenced at line 9">StrChar</a> = [\\] [\ \t\r\n]+ [\\]

<span class="keyword">context-free syntax</span>

  <span id="Exp_492_495" title="Not referenced locally, nor via imports">Exp</span>.<span class="cons_Constructor"><span id="String_496_502" title="Not referenced locally, nor via imports">String</span></span> = <a href="#StrConst_44_52" id="StrConst_505_513" title="Defined at line 5, 9">StrConst</a>

</code></pre></td></tr></tbody></table></div>