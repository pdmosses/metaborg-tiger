---
title: Base-sig.stx
hide:
  - toc
---

# `Base-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Base-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Base-sig.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Arrays-sig.stx/#signatures/Base-sig_40_59" id="signatures/Base-sig_7_26" title="Referenced at ../Arrays-sig.stx line 4; ../Bindings-sig.stx line 4; ../Control-Flow-sig.stx line 4; ../Functions-sig.stx line 4; ../Identifiers-sig.stx line 4; ../Numbers-sig.stx line 4; ../Records-sig.stx line 4; ../Strings-sig.stx line 4; ../Tiger-sig.stx line 4; ../Types-sig.stx line 4; ../Variables-sig.stx line 4"><span class="token sort_ModuleID">signatures/Base-sig</span></a>

<span class="keyword">imports</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#Dec_148_151" id="Dec_60_63" title="Referenced at line 16; ../Bindings-sig.stx line 17, 18; ../Functions-sig.stx line 17, 18; ../Types-sig.stx line 15; ../Variables-sig.stx line 15, 16; ../../../../trans/static-semantics.stx line 177, 178"><span class="token sort_ModuleID">Dec</span></a></span>
    <span class="cons_SortDecl"><a href="#Exp_168_171" id="Exp_68_71" title="Referenced at line 17; ../Arrays-sig.stx line 15, 15, 15, 17; ../Bindings-sig.stx line 17, 17; ../Control-Flow-sig.stx line 15, 15, 16, 16, 16, 16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 20, 21, 21; ../Functions-sig.stx line 17, 18, 20, 20; ../Numbers-sig.stx line 16, 17, 17, 18, 18, 18, 19, 19, 19, 20, 20, 20, 21, 21, 21, 22, 22, 22, 23, 23, 23, 24, 24, 24, 25, 25, 25, 26, 26, 26, 27, 27, 27, 28, 28, 28, 29, 29, 29; ../Records-sig.stx line 21, 22, 23; ../Strings-sig.stx line 17; ../Tiger-sig.stx line 28; ../Variables-sig.stx line 15, 16, 19; ../../../../trans/static-semantics.stx line 160, 164"><span class="token sort_ModuleID">Exp</span></a></span>
    <span class="cons_SortDecl"><a href="#LValue_191_197" id="LValue_76_82" title="Referenced at line 18; ../Arrays-sig.stx line 17, 17; ../Control-Flow-sig.stx line 21; ../Records-sig.stx line 24, 24; ../Variables-sig.stx line 18, 19; ../../../../trans/static-semantics.stx line 165"><span class="token sort_ModuleID">LValue</span></a></span>
    <span class="cons_SortDecl"><a href="#Type_215_219" id="Type_87_91" title="Referenced at line 19; ../Arrays-sig.stx line 16; ../Functions-sig.stx line 18, 19; ../Records-sig.stx line 19; ../Types-sig.stx line 15, 16; ../Variables-sig.stx line 15; ../../../../trans/static-semantics.stx line 222"><span class="token sort_ModuleID">Type</span></a></span>
    <span class="cons_SortDecl"><a href="#Var_236_239" id="Var_96_99" title="Referenced at line 20; ../Control-Flow-sig.stx line 19; ../Variables-sig.stx line 17, 18"><span class="token sort_ModuleID">Var</span></a></span>
    <a href="../Arrays-sig.stx/#ID_135_137" id="ID_104_106" title="Referenced at ../Arrays-sig.stx line 15, 16; ../Functions-sig.stx line 17, 18, 19, 20; ../Records-sig.stx line 20, 20, 22, 23, 24; ../Types-sig.stx line 15, 16; ../Variables-sig.stx line 15, 16, 17; ../../../../trans/static-semantics.stx line 24, 25, 28, 29, 37, 40, 49, 50, 51, 73, 74, 92, 93, 95, 455, 470, 470"><span class="token sort_ModuleID">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#Dec-Plhdr_12721_12730" id="Dec-Plhdr_136_145" title="Referenced at ../../../../trans/static-semantics.stx line 525"><span class="token sort_ModuleID">Dec-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Dec_60_63" id="Dec_148_151" title="Defined at line 8"><span class="token sort_ModuleID">Dec</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#Exp-Plhdr_12903_12912" id="Exp-Plhdr_156_165" title="Referenced at ../../../../trans/static-semantics.stx line 535"><span class="token sort_ModuleID">Exp-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_68_71" id="Exp_168_171" title="Defined at line 9"><span class="token sort_ModuleID">Exp</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#LValue-Plhdr_12685_12697" id="LValue-Plhdr_176_188" title="Referenced at ../../../../trans/static-semantics.stx line 523"><span class="token sort_ModuleID">LValue-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#LValue_76_82" id="LValue_191_197" title="Defined at line 10"><span class="token sort_ModuleID">LValue</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#Type-Plhdr_12752_12762" id="Type-Plhdr_202_212" title="Referenced at ../../../../trans/static-semantics.stx line 527"><span class="token sort_ModuleID">Type-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_87_91" id="Type_215_219" title="Defined at line 11"><span class="token sort_ModuleID">Type</span></a></span>
    <span id="Var-Plhdr_224_233" title="Not referenced locally, nor via imports"><span class="token sort_ModuleID">Var-Plhdr</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Var_96_99" id="Var_236_239" title="Defined at line 12"><span class="token sort_ModuleID">Var</span></a></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
</code></pre></td></tr></tbody></table></div>