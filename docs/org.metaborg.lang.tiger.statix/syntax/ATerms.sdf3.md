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
<td class="code"><pre><code><span class="keyword">module</span> <span id="ATerms_1_8" title="Not referenced">ATerms</span>

<span class="keyword">lexical sorts</span> <a href="#Cons_19_19" id="Cons_3_15" title="Referenced at line 19">Cons</a> <a href="#Int_18_19" id="Int_3_20" title="Referenced at line 18">Int</a> <a href="#String_8_17" id="String_3_24" title="Referenced at line 8, 17">String</a> <a href="#StringChar_10_22" id="StringChar_3_31" title="Referenced at line 10">StringChar</a>

<span class="keyword">lexical syntax</span>

   <a href="#Cons_19_19" id="Cons_7_4" title="Referenced at line 19">Cons</a>       = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>][<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]*
   <a href="#Cons_19_19" id="Cons_8_4" title="Referenced at line 19">Cons</a>       = <a href="#String_3_24" id="String_8_17" title="Defined at line 3, 10">String</a>
   <a href="#Int_18_19" id="Int_9_4" title="Referenced at line 18">Int</a>        = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
   <a href="#String_8_17" id="String_10_4" title="Referenced at line 8, 17">String</a>     = <span class="cons_Lit">"\""</span> <a href="#StringChar_3_31" id="StringChar_10_22" title="Defined at line 3, 11, 12">StringChar</a>* <span class="cons_Lit">"\""</span>
   <a href="#StringChar_10_22" id="StringChar_11_4" title="Referenced at line 10">StringChar</a> = ~[\"\\]
   <a href="#StringChar_10_22" id="StringChar_12_4" title="Referenced at line 10">StringChar</a> = <span class="cons_Lit">"\\"</span> [\"\\]

<span class="keyword">context-free sorts</span> <a href="#Term_19_27" id="Term_14_20" title="Referenced at line 19, 20, 21">Term</a>
<span class="keyword">context-free syntax</span>

   <a href="#Term_19_27" id="Term_17_4" title="Referenced at line 19, 20, 21">Term</a>.<span class="cons_Constructor"><span id="Str_17_9" title="Not referenced">Str</span></span>   = &lt;&lt;<a href="#String_3_24" id="String_17_19" title="Defined at line 3, 10">String</a>&gt;&gt;
   <a href="#Term_19_27" id="Term_18_4" title="Referenced at line 19, 20, 21">Term</a>.<span class="cons_Constructor"><span id="Int_18_9" title="Not referenced">Int</span></span>   = &lt;&lt;<a href="#Int_3_20" id="Int_18_19" title="Defined at line 3, 9">Int</a>&gt;&gt;
   <a href="#Term_19_27" id="Term_19_4" title="Referenced at line 19, 20, 21">Term</a>.<span class="cons_Constructor"><span id="App_19_9" title="Not referenced">App</span></span>   = &lt;&lt;<a href="#Cons_3_15" id="Cons_19_19" title="Defined at line 3, 7, 8">Cons</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_14_20" id="Term_19_27" title="Defined at line 14, 17, 18, 19, 20, 21">Term</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt;
   <a href="#Term_19_27" id="Term_20_4" title="Referenced at line 19, 20, 21">Term</a>.<span class="cons_Constructor"><span id="List_20_9" title="Not referenced">List</span></span>  = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_14_20" id="Term_20_21" title="Defined at line 14, 17, 18, 19, 20, 21">Term</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">]</span>&gt;
   <a href="#Term_19_27" id="Term_21_4" title="Referenced at line 19, 20, 21">Term</a>.<span class="cons_Constructor"><span id="Tuple_21_9" title="Not referenced">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_14_20" id="Term_21_21" title="Defined at line 14, 17, 18, 19, 20, 21">Term</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
