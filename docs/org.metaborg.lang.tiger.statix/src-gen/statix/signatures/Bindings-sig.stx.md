---
title: Bindings-sig.stx
hide:
  - toc
---

# `Bindings-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Bindings-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Bindings-sig.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Bindings-sig_8_3" id="signatures/Bindings-sig_1_8" title="Referenced at ../Tiger-sig.stx line 8"><span class="token sort_Id">signatures/Bindings-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="Defined at ../Base-sig.stx line 1"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#Declarations_12_26" id="Declarations_9_5" title="Referenced at line 12, 18"><span class="token sort_Id">Declarations</span></a></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="Declarations-Plhdr_12_5" title="Not referenced"><span class="token sort_Id">Declarations-Plhdr</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Declarations_9_5" id="Declarations_12_26" title="Defined at line 9"><span class="token sort_Id">Declarations</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Let_169_22" id="Let_17_5" title="Referenced at ../../../../trans/static-semantics.stx line 169"><span class="token sort_Id">Let</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_17_16" title="Defined at ../Base-sig.stx line 8"><span class="token sort_Id">Dec</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_28" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_36" title="Defined at ../Base-sig.stx line 9"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><span id="Declarations_18_5" title="Not referenced"><span class="token sort_Id">Declarations</span></span> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_18_25" title="Defined at ../Base-sig.stx line 8"><span class="token sort_Id">Dec</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Declarations_9_5" id="Declarations_18_33" title="Defined at line 9"><span class="token sort_Id">Declarations</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
