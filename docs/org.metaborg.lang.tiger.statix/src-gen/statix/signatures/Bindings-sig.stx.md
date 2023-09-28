---
title: Bindings-sig.stx
---

# `Bindings-sig.stx`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/Bindings-sig.stx]

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger-sig.stx#signatures/Bindings-sig_141_164" id="signatures/Bindings-sig_7_30" title="Referenced at ../Tiger-sig.stx line 8">signatures/Bindings-sig</a>

<span class="keyword">imports</span>
  <a href="../Base-sig.stx#signatures/Base-sig_7_26" id="signatures/Base-sig_42_61" title="Defined at ../Base-sig.stx line 1">signatures/Base-sig</a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <a href="#Declarations_140_152" id="Declarations_86_98" title="Referenced at line 12, 18">Declarations</a>

  <span class="keyword">constructors</span>
    <span id="Declarations-Plhdr_119_137" title="Not referenced locally, nor via imports">Declarations-Plhdr</span> : <a href="#Declarations_86_98" id="Declarations_140_152" title="Defined at line 9">Declarations</a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <a href="../../../../trans/static-semantics.stx#Let_3188_3191" id="Let_184_187" title="Referenced at ../../../../trans/static-semantics.stx line 169">Let</a> : <span class="keyword">list</span>(<a href="../Base-sig.stx#Dec_60_63" id="Dec_195_198" title="Defined at ../Base-sig.stx line 8">Dec</a>) * <span class="keyword">list</span>(<a href="../Base-sig.stx#Exp_68_71" id="Exp_207_210" title="Defined at ../Base-sig.stx line 9">Exp</a>) -&gt; <a href="../Base-sig.stx#Exp_68_71" id="Exp_215_218" title="Defined at ../Base-sig.stx line 9">Exp</a>
    <span id="Declarations_223_235" title="Not referenced locally, nor via imports">Declarations</span> : <span class="keyword">list</span>(<a href="../Base-sig.stx#Dec_60_63" id="Dec_243_246" title="Defined at ../Base-sig.stx line 8">Dec</a>) -&gt; <a href="#Declarations_86_98" id="Declarations_251_263" title="Defined at line 9">Declarations</a>
</code></pre></td></tr></tbody></table></div>