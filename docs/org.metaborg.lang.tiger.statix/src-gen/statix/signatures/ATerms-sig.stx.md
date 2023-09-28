---
title: ATerms-sig.stx
---

# `ATerms-sig.stx`



[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/ATerms-sig.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/src-gen/statix/signatures/ATerms-sig.stx "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <span id="signatures/ATerms-sig_7_28" title="Not referenced locally, nor via imports">signatures/ATerms-sig</span>

<span class="keyword">imports</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <a href="#Cons_268_272" id="Cons_62_66" title="Referenced at line 22">Cons</a> = <span class="keyword">string</span>
    <a href="#Int_246_249" id="Int_80_83" title="Referenced at line 21">Int</a> = <span class="keyword">string</span>
    <a href="#String_221_227" id="String_97_103" title="Referenced at line 20">String</a> = <span class="keyword">string</span>
    <span id="StringChar_117_127" title="Not referenced locally, nor via imports">StringChar</span> = <span class="keyword">string</span>
    <a href="#Term_179_183" id="Term_141_145" title="Referenced at line 15, 20, 21, 22, 22, 23, 23, 24, 24">Term</a>

  <span class="keyword">constructors</span>
    <span id="Term-Plhdr_166_176" title="Not referenced locally, nor via imports">Term-Plhdr</span> : <a href="#Term_141_145" id="Term_179_183" title="Defined at line 12">Term</a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span id="Str_215_218" title="Not referenced locally, nor via imports">Str</span> : <a href="#String_97_103" id="String_221_227" title="Defined at line 10">String</a> -&gt; <a href="#Term_141_145" id="Term_231_235" title="Defined at line 12">Term</a>
    <span id="Int_240_243" title="Not referenced locally, nor via imports">Int</span> : <a href="#Int_80_83" id="Int_246_249" title="Defined at line 9">Int</a> -&gt; <a href="#Term_141_145" id="Term_253_257" title="Defined at line 12">Term</a>
    <span id="App_262_265" title="Not referenced locally, nor via imports">App</span> : <a href="#Cons_62_66" id="Cons_268_272" title="Defined at line 8">Cons</a> * <span class="keyword">list</span>(<a href="#Term_141_145" id="Term_280_284" title="Defined at line 12">Term</a>) -&gt; <a href="#Term_141_145" id="Term_289_293" title="Defined at line 12">Term</a>
    <span id="List_298_302" title="Not referenced locally, nor via imports">List</span> : <span class="keyword">list</span>(<a href="#Term_141_145" id="Term_310_314" title="Defined at line 12">Term</a>) -&gt; <a href="#Term_141_145" id="Term_319_323" title="Defined at line 12">Term</a>
    <span id="Tuple_328_333" title="Not referenced locally, nor via imports">Tuple</span> : <span class="keyword">list</span>(<a href="#Term_141_145" id="Term_341_345" title="Defined at line 12">Term</a>) -&gt; <a href="#Term_141_145" id="Term_350_354" title="Defined at line 12">Term</a>
</code></pre></td></tr></tbody></table></div>