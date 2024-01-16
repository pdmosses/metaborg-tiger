---
title: ATerms-sig.stx
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="signatures/ATerms-sig_1_8" title="Not referenced"><span class="token sort_Id">signatures/ATerms-sig</span></span>

<span class="keyword">imports</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortAlias"><a href="#Cons_22_11" id="Cons_8_5" title="Referenced at line 22"><span class="token sort_Id">Cons</span></a> <span class="operator">=</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>
    <span class="cons_SortAlias"><a href="#Int_21_11" id="Int_9_5" title="Referenced at line 21"><span class="token sort_Id">Int</span></a> <span class="operator">=</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>
    <span class="cons_SortAlias"><a href="#String_20_11" id="String_10_5" title="Referenced at line 20"><span class="token sort_Id">String</span></a> <span class="operator">=</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>
    <span class="cons_SortAlias"><span id="StringChar_11_5" title="Not referenced"><span class="token sort_Id">StringChar</span></span> <span class="operator">=</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>
    <span class="cons_SortDecl"><a href="#Term_15_18" id="Term_12_5" title="Referenced at line 15, 20, 21, 22, 23, 24"><span class="token sort_Id">Term</span></a></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="Term-Plhdr_15_5" title="Not referenced"><span class="token sort_Id">Term-Plhdr</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_15_18" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="Str_20_5" title="Not referenced"><span class="token sort_Id">Str</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#String_10_5" id="String_20_11" title="Defined at line 10"><span class="token sort_Id">String</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_20_21" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span></span>
    <span class="cons_OpDecl"><span id="Int_21_5" title="Not referenced"><span class="token sort_Id">Int</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Int_9_5" id="Int_21_11" title="Defined at line 9"><span class="token sort_Id">Int</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_21_18" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span></span>
    <span class="cons_OpDecl"><span id="App_22_5" title="Not referenced"><span class="token sort_Id">App</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Cons_8_5" id="Cons_22_11" title="Defined at line 8"><span class="token sort_Id">Cons</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_22_23" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_22_32" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span></span>
    <span class="cons_OpDecl"><span id="List_23_5" title="Not referenced"><span class="token sort_Id">List</span></span> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_23_17" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_23_26" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span></span>
    <span class="cons_OpDecl"><span id="Tuple_24_5" title="Not referenced"><span class="token sort_Id">Tuple</span></span> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_24_18" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Term_12_5" id="Term_24_27" title="Defined at line 12"><span class="token sort_Id">Term</span></a></span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
