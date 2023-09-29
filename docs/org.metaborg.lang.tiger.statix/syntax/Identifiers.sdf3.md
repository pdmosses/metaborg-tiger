---
title: Identifiers.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Tiger.sdf3#Identifiers_68_79" id="Identifiers_7_18" title="Referenced at ../Tiger.sdf3 line 6">Identifiers</a>

<span class="keyword">imports</span> <a href="../Base.sdf3#Base_7_11" id="Base_28_32" title="Defined at ../Base.sdf3 line 1">Base</a>

<span class="keyword">lexical syntax</span>

  <a href="#ID_121_123" id="ID_52_54" title="Referenced at line 12">ID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]*
  <a href="#ID_121_123" id="ID_83_85" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"_main"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#ID_52_54" id="ID_121_123" title="Defined at line 7, 8, 16, 17, 18, 19, 20, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 46, 47, 48, 49">ID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]

<span class="keyword">lexical syntax</span>

  <a href="#ID_121_123" id="ID_161_163" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"label"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_192_194" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"goto"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_223_225" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"declarations"</span> {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_254_256" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"true"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_285_287" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"false"</span>        {<span class="keyword">reject</span>}

<span class="keyword">lexical syntax</span>

  <a href="#ID_121_123" id="ID_333_335" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"array"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_364_366" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"if"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_395_397" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"then"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_426_428" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"else"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_457_459" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"while"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_488_490" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"for"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_519_521" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"to"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_550_552" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"do"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_581_583" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"let"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_612_614" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"in"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_643_645" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"end"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_674_676" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"of"</span>           {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_705_707" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"break"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_736_738" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"nil"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_767_769" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"function"</span>     {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_798_800" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"var"</span>          {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_829_831" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"type"</span>         {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_860_862" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"import"</span>       {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_891_893" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"primitive"</span>    {<span class="keyword">reject</span>}

<span class="keyword">lexical syntax</span>

  <a href="#ID_121_123" id="ID_939_941" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"class"</span>        {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_970_972" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"extends"</span>      {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_1001_1003" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"method"</span>       {<span class="keyword">reject</span>}
  <a href="#ID_121_123" id="ID_1032_1034" title="Referenced at line 12">ID</a> = <span class="cons_Lit">"new"</span>          {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>