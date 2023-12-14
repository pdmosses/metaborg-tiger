---
title: Strings-sig.stx
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Strings-sig_12_3" id="signatures/Strings-sig_1_8" title="Referenced at ../Tiger-sig.stx line 12"><span class="token sort_Id">signatures/Strings-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="Defined at ../Base-sig.stx line 1"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortAlias"><a href="#StrConst_17_14" id="StrConst_9_5" title="Referenced at line 17"><span class="token sort_Id">StrConst</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>
    <span class="cons_SortAlias"><span id="StrChar_10_5" title="Not referenced"><span class="token sort_Id">StrChar</span></span> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#String_486_16" id="String_17_5" title="Referenced at ../../../../trans/static-semantics.stx line 486"><span class="token sort_Id">String</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#StrConst_9_5" id="StrConst_17_14" title="Defined at line 9"><span class="token sort_Id">StrConst</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_26" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
