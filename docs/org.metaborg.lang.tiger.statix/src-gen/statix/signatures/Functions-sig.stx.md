---
title: Functions-sig.stx
hide:
  - toc
---

# `Functions-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Functions-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Functions-sig.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Functions-sig_10_3" id="signatures/Functions-sig_1_8" title="a definition with a single reference"><span class="token sort_Id">signatures/Functions-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_1_8" id="signatures/Base-sig_4_3" title="a reference to a single-file definition"><span class="token sort_Id">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><button class="modal-open" id="FArg_9_5" title="a definition with multiple references" data-urls="#FArg line 12_18, 17_25, 18_24, 19_25; ../../../../trans/static-semantics.stx/#FArg line 253_32"><span class="token sort_Id">FArg</span></button></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#FArg-Plhdr_529_19" id="FArg-Plhdr_12_5" title="a definition with a single reference"><span class="token sort_Id">FArg-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#FArg_9_5" id="FArg_12_18" title="a reference to a single-file definition"><span class="token sort_Id">FArg</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#ProcDec_238_23" id="ProcDec_17_5" title="a definition with a single reference"><span class="token sort_Id">ProcDec</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_17_15" title="a reference to a single-file definition"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#FArg_9_5" id="FArg_17_25" title="a reference to a single-file definition"><span class="token sort_Id">FArg</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_17_33" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_17_40" title="a reference to a single-file definition"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#FunDec_244_23" id="FunDec_18_5" title="a definition with a single reference"><span class="token sort_Id">FunDec</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_18_14" title="a reference to a single-file definition"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#FArg_9_5" id="FArg_18_24" title="a reference to a single-file definition"><span class="token sort_Id">FArg</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_11_5" id="Type_18_32" title="a reference to a single-file definition"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_18_39" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_8_5" id="Dec_18_46" title="a reference to a single-file definition"><span class="token sort_Id">Dec</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#FArg_256_29" id="FArg_19_5" title="a definition with a single reference"><span class="token sort_Id">FArg</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_19_12" title="a reference to a single-file definition"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_11_5" id="Type_19_17" title="a reference to a single-file definition"><span class="token sort_Id">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#FArg_9_5" id="FArg_19_25" title="a reference to a single-file definition"><span class="token sort_Id">FArg</span></a></span></span>
    <span class="cons_OpDecl"><a href="../../../../trans/static-semantics.stx/#Call_262_16" id="Call_20_5" title="a definition with a single reference"><span class="token sort_Id">Call</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_13_5" id="ID_20_12" title="a reference to a single-file definition"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_20_22" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_9_5" id="Exp_20_30" title="a reference to a single-file definition"><span class="token sort_Id">Exp</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
