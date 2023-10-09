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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../../../trans/static-semantics.stx/#signatures/Tiger-sig_35_55" id="signatures/Tiger-sig_7_27" title="Referenced at ../../../../trans/static-semantics.stx line 4"><span class="token sort_ModuleID">signatures/Tiger-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_7_26" id="signatures/Base-sig_39_58" title="Defined at ../Base-sig.stx line 1"><span class="token sort_ModuleID">signatures/Base-sig</span></a>
  <a href="../Whitespace-sig.stx/#signatures/Whitespace-sig_7_32" id="signatures/Whitespace-sig_61_86" title="Defined at ../Whitespace-sig.stx line 1"><span class="token sort_ModuleID">signatures/Whitespace-sig</span></a>
  <a href="../Types-sig.stx/#signatures/Types-sig_7_27" id="signatures/Types-sig_89_109" title="Defined at ../Types-sig.stx line 1"><span class="token sort_ModuleID">signatures/Types-sig</span></a>
  <a href="../Identifiers-sig.stx/#signatures/Identifiers-sig_7_33" id="signatures/Identifiers-sig_112_138" title="Defined at ../Identifiers-sig.stx line 1"><span class="token sort_ModuleID">signatures/Identifiers-sig</span></a>
  <a href="../Bindings-sig.stx/#signatures/Bindings-sig_7_30" id="signatures/Bindings-sig_141_164" title="Defined at ../Bindings-sig.stx line 1"><span class="token sort_ModuleID">signatures/Bindings-sig</span></a>
  <a href="../Variables-sig.stx/#signatures/Variables-sig_7_31" id="signatures/Variables-sig_167_191" title="Defined at ../Variables-sig.stx line 1"><span class="token sort_ModuleID">signatures/Variables-sig</span></a>
  <a href="../Functions-sig.stx/#signatures/Functions-sig_7_31" id="signatures/Functions-sig_194_218" title="Defined at ../Functions-sig.stx line 1"><span class="token sort_ModuleID">signatures/Functions-sig</span></a>
  <a href="../Numbers-sig.stx/#signatures/Numbers-sig_7_29" id="signatures/Numbers-sig_221_243" title="Defined at ../Numbers-sig.stx line 1"><span class="token sort_ModuleID">signatures/Numbers-sig</span></a>
  <a href="../Strings-sig.stx/#signatures/Strings-sig_7_29" id="signatures/Strings-sig_246_268" title="Defined at ../Strings-sig.stx line 1"><span class="token sort_ModuleID">signatures/Strings-sig</span></a>
  <a href="../Records-sig.stx/#signatures/Records-sig_7_29" id="signatures/Records-sig_271_293" title="Defined at ../Records-sig.stx line 1"><span class="token sort_ModuleID">signatures/Records-sig</span></a>
  <a href="../Arrays-sig.stx/#signatures/Arrays-sig_7_28" id="signatures/Arrays-sig_296_317" title="Defined at ../Arrays-sig.stx line 1"><span class="token sort_ModuleID">signatures/Arrays-sig</span></a>
  <a href="../Control-Flow-sig.stx/#signatures/Control-Flow-sig_7_34" id="signatures/Control-Flow-sig_320_347" title="Defined at ../Control-Flow-sig.stx line 1"><span class="token sort_ModuleID">signatures/Control-Flow-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#Module_414_420" id="Module_372_378" title="Referenced at line 23, 28; ../../../../trans/static-semantics.stx line 8"><span class="token sort_OpId">Module</span></a></span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#Module-Plhdr_12571_12583" id="Module-Plhdr_399_411" title="Referenced at ../../../../trans/static-semantics.stx line 517"><span class="token sort_OpId">Module-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Module_372_378" id="Module_414_420" title="Defined at line 20"><span class="token sort_OpId">Module</span></a></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#Mod_125_128" id="Mod_452_455" title="Referenced at ../../../../trans/static-semantics.stx line 10"><span class="token sort_OpId">Mod</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_458_461" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Module_372_378" id="Module_465_471" title="Defined at line 20"><span class="token sort_OpId">Module</span></a></span>
</code></pre></td></tr></tbody></table></div>