---
title: Types-sig.stx
hide:
  - toc
---

# `Types-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Types-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Types-sig.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Types-sig_89_109" id="signatures/Types-sig_7_27" title="Referenced at ../Tiger-sig.stx line 6"><span class="token sort_ModuleID">signatures/Types-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_7_26" id="signatures/Base-sig_39_58" title="Defined at ../Base-sig.stx line 1"><span class="token sort_ModuleID">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>

  <span class="keyword">constructors</span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#TypeDec_4614_4621" id="TypeDec_126_133" title="Referenced at ../../../../trans/static-semantics.stx line 214"><span class="token sort_OpId">TypeDec</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_136_138" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_87_91" id="Type_141_145" title="Defined at ../Base-sig.stx line 11"><span class="token sort_OpId">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_60_63" id="Dec_149_152" title="Defined at ../Base-sig.stx line 8"><span class="token sort_OpId">Dec</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#Tid_4833_4836" id="Tid_157_160" title="Referenced at ../../../../trans/static-semantics.stx line 224, 288, 293, 437, 447"><span class="token sort_OpId">Tid</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_163_165" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_87_91" id="Type_169_173" title="Defined at ../Base-sig.stx line 11"><span class="token sort_OpId">Type</span></a></span>
</code></pre></td></tr></tbody></table></div>