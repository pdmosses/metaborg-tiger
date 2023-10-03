---
title: ATerms.sdf3
hide:
  - toc
---

# `ATerms.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/ATerms.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/ATerms.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/ATerms.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="ATerms_7_13" title="Not referenced locally, nor via imports">ATerms</span>

<span class="keyword">lexical sorts</span> <a href="#Cons_361_365" id="Cons_29_33" title="Referenced at line 19">Cons</a> <a href="#Int_337_340" id="Int_34_37" title="Referenced at line 18">Int</a> <a href="#String_310_316" id="String_38_44" title="Referenced at line 17">String</a> <a href="#StringChar_177_187" id="StringChar_45_55" title="Referenced at line 10">StringChar</a>

<span class="keyword">lexical syntax</span>

   <a href="#Cons_361_365" id="Cons_76_80" title="Referenced at line 19">Cons</a>       = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>][<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]*
   <a href="#Cons_361_365" id="Cons_113_117" title="Referenced at line 19">Cons</a>       = <a href="#String_38_44" id="String_126_132" title="Defined at line 3, 10">String</a>
   <a href="#Int_337_340" id="Int_136_139" title="Referenced at line 18">Int</a>        = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
   <a href="#String_310_316" id="String_159_165" title="Referenced at line 17">String</a>     = <span class="cons_Lit">"\""</span> <a href="#StringChar_45_55" id="StringChar_177_187" title="Defined at line 3, 11, 12">StringChar</a>* <span class="cons_Lit">"\""</span>
   <a href="#StringChar_177_187" id="StringChar_197_207" title="Referenced at line 10">StringChar</a> = ~[\"\\]
   <a href="#StringChar_177_187" id="StringChar_221_231" title="Referenced at line 10">StringChar</a> = <span class="cons_Lit">"\\"</span> [\"\\]

<span class="keyword">context-free sorts</span> <a href="#Term_437_441" id="Term_266_270" title="Referenced at line 21">Term</a>
<span class="keyword">context-free syntax</span>

   <a href="#Term_437_441" id="Term_295_299" title="Referenced at line 21">Term</a>.<span class="cons_Constructor"><span id="Str_300_303" title="Not referenced locally, nor via imports">Str</span></span>   = &lt;&lt;<a href="#String_38_44" id="String_310_316" title="Defined at line 3, 10">String</a>&gt;&gt;
   <a href="#Term_437_441" id="Term_322_326" title="Referenced at line 21">Term</a>.<span class="cons_Constructor"><span id="Int_327_330" title="Not referenced locally, nor via imports">Int</span></span>   = &lt;&lt;<a href="#Int_34_37" id="Int_337_340" title="Defined at line 3, 9">Int</a>&gt;&gt;
   <a href="#Term_437_441" id="Term_346_350" title="Referenced at line 21">Term</a>.<span class="cons_Constructor"><span id="App_351_354" title="Not referenced locally, nor via imports">App</span></span>   = &lt;&lt;<a href="#Cons_29_33" id="Cons_361_365" title="Defined at line 3, 7, 8">Cons</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_266_270" id="Term_369_373" title="Defined at line 14, 17, 18, 19, 20, 21">Term</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt;
   <a href="#Term_437_441" id="Term_386_390" title="Referenced at line 21">Term</a>.<span class="cons_Constructor"><span id="List_391_395" title="Not referenced locally, nor via imports">List</span></span>  = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_266_270" id="Term_403_407" title="Defined at line 14, 17, 18, 19, 20, 21">Term</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">]</span>&gt;
   <a href="#Term_437_441" id="Term_420_424" title="Referenced at line 21">Term</a>.<span class="cons_Constructor"><span id="Tuple_425_430" title="Not referenced locally, nor via imports">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_266_270" id="Term_437_441" title="Defined at line 14, 17, 18, 19, 20, 21">Term</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt;

</code></pre></td></tr></tbody></table></div>