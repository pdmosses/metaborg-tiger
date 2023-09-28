---
title: Strings-sig.stx
---

# `Strings-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Strings-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Strings-sig.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx#signatures/Strings-sig_246_268" id="signatures/Strings-sig_7_29" title="Referenced at ../Tiger-sig.stx line 12">signatures/Strings-sig</a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx#signatures/Base-sig_7_26" id="signatures/Base-sig_41_60" title="Defined at ../Base-sig.stx line 1">signatures/Base-sig</a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <a href="#StrConst_180_188" id="StrConst_85_93" title="Referenced at line 17">StrConst</a> = <span class="keyword">string</span>
    <span id="StrChar_107_114" title="Not referenced locally, nor via imports">StrChar</span> = <span class="keyword">string</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx#String_11614_11620" id="String_171_177" title="Referenced at ../../../../trans/static-semantics.stx line 486">String</a> : <a href="#StrConst_85_93" id="StrConst_180_188" title="Defined at line 9">StrConst</a> -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_192_195" title="Defined at ../Base-sig.stx line 9">Exp</a>
</code></pre></td></tr></tbody></table></div>