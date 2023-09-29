---
title: Functions-sig.stx
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx#signatures/Functions-sig_194_218" id="signatures/Functions-sig_7_31" title="Referenced at ../Tiger-sig.stx line 10">signatures/Functions-sig</a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx#signatures/Base-sig_7_26" id="signatures/Base-sig_43_62" title="Defined at ../Base-sig.stx line 1">signatures/Base-sig</a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <a href="#FArg_125_129" id="FArg_87_91" title="Referenced at line 12, 17, 18, 19; ../../../../trans/static-semantics.stx line 253">FArg</a>

  <span class="keyword">constructors</span>
    FArg-Plhdr : <a href="#FArg_87_91" id="FArg_125_129" title="Defined at line 9">FArg</a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    ProcDec : <a href="../Base-sig.stx#ID_104_106" id="ID_171_173" title="Defined at ../Base-sig.stx line 13">ID</a> * <span class="keyword">list</span>(<a href="#FArg_87_91" id="FArg_181_185" title="Defined at line 9">FArg</a>) * <a href="../Base-sig.stx#Exp_68_71" id="Exp_189_192" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Dec_60_63" id="Dec_196_199" title="Defined at ../Base-sig.stx line 8">Dec</a>
    FunDec : <a href="../Base-sig.stx#ID_104_106" id="ID_213_215" title="Defined at ../Base-sig.stx line 13">ID</a> * <span class="keyword">list</span>(<a href="#FArg_87_91" id="FArg_223_227" title="Defined at line 9">FArg</a>) * <a href="../Base-sig.stx#Type_87_91" id="Type_231_235" title="Defined at ../Base-sig.stx line 11">Type</a> * <a href="../Base-sig.stx#Exp_68_71" id="Exp_238_241" title="Defined at ../Base-sig.stx line 9">Exp</a> -&gt; <a href="../Base-sig.stx#Dec_60_63" id="Dec_245_248" title="Defined at ../Base-sig.stx line 8">Dec</a>
    FArg : <a href="../Base-sig.stx#ID_104_106" id="ID_260_262" title="Defined at ../Base-sig.stx line 13">ID</a> * <a href="../Base-sig.stx#Type_87_91" id="Type_265_269" title="Defined at ../Base-sig.stx line 11">Type</a> -&gt; <a href="#FArg_87_91" id="FArg_273_277" title="Defined at line 9">FArg</a>
    Call : <a href="../Base-sig.stx#ID_104_106" id="ID_289_291" title="Defined at ../Base-sig.stx line 13">ID</a> * <span class="keyword">list</span>(<a href="../Base-sig.stx#Exp_68_71" id="Exp_299_302" title="Defined at ../Base-sig.stx line 9">Exp</a>) -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_307_310" title="Defined at ../Base-sig.stx line 9">Exp</a>
</code></pre></td></tr></tbody></table></div>