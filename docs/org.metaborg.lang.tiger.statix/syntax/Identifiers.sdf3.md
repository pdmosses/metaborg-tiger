---
title: Identifiers.sdf3
hide:
  - toc
---

# `Identifiers.sdf3`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Identifiers.sdf3]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/syntax/Identifiers.sdf3]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/syntax/Identifiers.sdf3 "The source file on GitHub"

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
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3/#Identifiers_6_9" id="Identifiers_1_8" title="Referenced at ../Tiger.sdf3 line 6">Identifiers</a>

<span class="keyword">imports</span> <a href="../Base.sdf3/#Base_1_8" id="Base_3_9" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">lexical syntax</span>

  <a href="#ID_12_3" id="ID_7_3" title="Referenced at line 12">ID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <a href="#ID_12_3" id="ID_8_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"_main"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#ID_7_3" id="ID_12_3" title="Defined at line 7, 8, 16, 17, 18, 19, 20, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 46, 47, 48, 49">ID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]

<span class="keyword">lexical syntax</span>

  <a href="#ID_12_3" id="ID_16_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"label"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_17_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"goto"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_18_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"declarations"</span> {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_19_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"true"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_20_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"false"</span>        {<span class="keyword">reject</span>}

<span class="keyword">lexical syntax</span>

  <a href="#ID_12_3" id="ID_24_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"array"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_25_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"if"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_26_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"then"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_27_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"else"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_28_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"while"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_29_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"for"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_30_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"to"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_31_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"do"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_32_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"let"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_33_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"in"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_34_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"end"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_35_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"of"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_36_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"break"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_37_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"nil"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_38_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"function"</span>     {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_39_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"var"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_40_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"type"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_41_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"import"</span>       {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_42_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"primitive"</span>    {<span class="keyword">reject</span>}

<span class="keyword">lexical syntax</span>

  <a href="#ID_12_3" id="ID_46_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"class"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_47_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"extends"</span>      {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_48_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"method"</span>       {<span class="keyword">reject</span>}
  <a href="#ID_12_3" id="ID_49_3" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"new"</span>          {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
