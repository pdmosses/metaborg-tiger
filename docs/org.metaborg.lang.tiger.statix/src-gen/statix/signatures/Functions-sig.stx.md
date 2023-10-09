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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx/#signatures/Functions-sig_194_218" id="signatures/Functions-sig_7_31" title="Referenced at ../Tiger-sig.stx line 10"><span class="token sort_ModuleID">signatures/Functions-sig</span></a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx/#signatures/Base-sig_7_26" id="signatures/Base-sig_43_62" title="Defined at ../Base-sig.stx line 1"><span class="token sort_ModuleID">signatures/Base-sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#FArg_125_129" id="FArg_87_91" title="Referenced at line 12, 17, 18, 19; ../../../../trans/static-semantics.stx line 253"><span class="token sort_OpId">FArg</span></a></span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#FArg-Plhdr_12790_12800" id="FArg-Plhdr_112_122" title="Referenced at ../../../../trans/static-semantics.stx line 529"><span class="token sort_OpId">FArg-Plhdr</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#FArg_87_91" id="FArg_125_129" title="Defined at line 9"><span class="token sort_OpId">FArg</span></a></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx/#ProcDec_5286_5293" id="ProcDec_161_168" title="Referenced at ../../../../trans/static-semantics.stx line 238"><span class="token sort_OpId">ProcDec</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_171_173" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#FArg_87_91" id="FArg_181_185" title="Defined at line 9"><span class="token sort_OpId">FArg</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_189_192" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_60_63" id="Dec_196_199" title="Defined at ../Base-sig.stx line 8"><span class="token sort_OpId">Dec</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#FunDec_5492_5498" id="FunDec_204_210" title="Referenced at ../../../../trans/static-semantics.stx line 244"><span class="token sort_OpId">FunDec</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_213_215" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#FArg_87_91" id="FArg_223_227" title="Defined at line 9"><span class="token sort_OpId">FArg</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_87_91" id="Type_231_235" title="Defined at ../Base-sig.stx line 11"><span class="token sort_OpId">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_238_241" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Dec_60_63" id="Dec_245_248" title="Defined at ../Base-sig.stx line 8"><span class="token sort_OpId">Dec</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#FArg_5900_5904" id="FArg_253_257" title="Referenced at ../../../../trans/static-semantics.stx line 256"><span class="token sort_OpId">FArg</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_260_262" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Type_87_91" id="Type_265_269" title="Defined at ../Base-sig.stx line 11"><span class="token sort_OpId">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#FArg_87_91" id="FArg_273_277" title="Defined at line 9"><span class="token sort_OpId">FArg</span></a></span>
    <a href="../../../../trans/static-semantics.stx/#Call_6022_6026" id="Call_282_286" title="Referenced at ../../../../trans/static-semantics.stx line 262"><span class="token sort_OpId">Call</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#ID_104_106" id="ID_289_291" title="Defined at ../Base-sig.stx line 13"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_299_302" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../Base-sig.stx/#Exp_68_71" id="Exp_307_310" title="Defined at ../Base-sig.stx line 9"><span class="token sort_OpId">Exp</span></a></span>
</code></pre></td></tr></tbody></table></div>