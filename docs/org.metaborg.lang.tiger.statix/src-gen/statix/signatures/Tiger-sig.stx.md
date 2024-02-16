---
title: Tiger-sig.stx
hide:
  - toc
---

# `Tiger-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Tiger-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Tiger-sig.stx "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../../../trans/static-semantics.stx/#signatures/Tiger-sig_4_3" id="signatures/Tiger-sig_1_8" title="a definition with a single reference"><span class="token sort_Id">signatures/Tiger-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Base-sig</span></a>
  <a href="../Whitespace-sig.stx/#signatures/Whitespace-sig_1_8" id="signatures/Whitespace-sig_5_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Whitespace-sig</span></a>
  <a href="../Types-sig.stx/#signatures/Types-sig_1_8" id="signatures/Types-sig_6_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Types-sig</span></a>
  <a href="../Identifiers-sig.stx/#signatures/Identifiers-sig_1_8" id="signatures/Identifiers-sig_7_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Identifiers-sig</span></a>
  <a href="../Bindings-sig.stx/#signatures/Bindings-sig_1_8" id="signatures/Bindings-sig_8_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Bindings-sig</span></a>
  <a href="../Variables-sig.stx/#signatures/Variables-sig_1_8" id="signatures/Variables-sig_9_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Variables-sig</span></a>
  <a href="../Functions-sig.stx/#signatures/Functions-sig_1_8" id="signatures/Functions-sig_10_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Functions-sig</span></a>
  <a href="../Numbers-sig.stx/#signatures/Numbers-sig_1_8" id="signatures/Numbers-sig_11_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Numbers-sig</span></a>
  <a href="../Strings-sig.stx/#signatures/Strings-sig_1_8" id="signatures/Strings-sig_12_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Strings-sig</span></a>
  <a href="../Records-sig.stx/#signatures/Records-sig_1_8" id="signatures/Records-sig_13_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Records-sig</span></a>
  <a href="../Arrays-sig.stx/#signatures/Arrays-sig_1_8" id="signatures/Arrays-sig_14_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Arrays-sig</span></a>
  <a href="../Control-Flow-sig.stx/#signatures/Control-Flow-sig_1_8" id="signatures/Control-Flow-sig_15_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Control-Flow-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><button class="modal-open" id="Module_20_5" title="a definition with multiple references" data-urls="#Module line 23_20, 28_18; ../../../../trans/static-semantics.stx/#Module line 8_15"><span class="token sort_Id">Module</span></button></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Module-Plhdr_517_13" id="Module-Plhdr_23_5" title="a definition with a single reference"><span class="token sort_Id">Module-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Module_20_5" id="Module_23_20" title="a reference to a single-file definition"><span class="token sort_Id">Module</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Mod_10_13" id="Mod_28_5" title="a definition with a single reference"><span class="token sort_Id">Mod</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_28_11" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Module_20_5" id="Module_28_18" title="a reference to a single-file definition"><span class="token sort_Id">Module</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
