---
title: static-semantics.stx
---

# `static-semantics.stx`

:simple-github: [pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/trans/static-semantics.stx]

[pdmosses/metaborg-tiger/org.metaborg.lang.tiger.statix/trans/static-semantics.stx]: https://github.com/pdmosses/metaborg-tiger/blob/master/org.metaborg.lang.tiger.statix/trans/static-semantics.stx "The source file on GitHub"

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
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149
150
151
152
153
154
155
156
157
158
159
160
161
162
163
164
165
166
167
168
169
170
171
172
173
174
175
176
177
178
179
180
181
182
183
184
185
186
187
188
189
190
191
192
193
194
195
196
197
198
199
200
201
202
203
204
205
206
207
208
209
210
211
212
213
214
215
216
217
218
219
220
221
222
223
224
225
226
227
228
229
230
231
232
233
234
235
236
237
238
239
240
241
242
243
244
245
246
247
248
249
250
251
252
253
254
255
256
257
258
259
260
261
262
263
264
265
266
267
268
269
270
271
272
273
274
275
276
277
278
279
280
281
282
283
284
285
286
287
288
289
290
291
292
293
294
295
296
297
298
299
300
301
302
303
304
305
306
307
308
309
310
311
312
313
314
315
316
317
318
319
320
321
322
323
324
325
326
327
328
329
330
331
332
333
334
335
336
337
338
339
340
341
342
343
344
345
346
347
348
349
350
351
352
353
354
355
356
357
358
359
360
361
362
363
364
365
366
367
368
369
370
371
372
373
374
375
376
377
378
379
380
381
382
383
384
385
386
387
388
389
390
391
392
393
394
395
396
397
398
399
400
401
402
403
404
405
406
407
408
409
410
411
412
413
414
415
416
417
418
419
420
421
422
423
424
425
426
427
428
429
430
431
432
433
434
435
436
437
438
439
440
441
442
443
444
445
446
447
448
449
450
451
452
453
454
455
456
457
458
459
460
461
462
463
464
465
466
467
468
469
470
471
472
473
474
475
476
477
478
479
480
481
482
483
484
485
486
487
488
489
490
491
492
493
494
495
496
497
498
499
500
501
502
503
504
505
506
507
508
509
510
511
512
513
514
515
516
517
518
519
520
521
522
523
524
525
526
527
528
529
530
531
532
533
534
535
536
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="static-semantics_7_23" title="Not referenced locally, nor via imports">static-semantics</span>

<span class="keyword">imports</span>
<span class="layout">//  signatures/start-sig</span>
  <a href="../../src-gen/statix/signatures/Tiger-sig.stx#signatures/Tiger-sig_7_27" id="signatures/Tiger-sig_60_80" title="Defined at ../../src-gen/statix/signatures/Tiger-sig.stx line 1">signatures/Tiger-sig</a>

<span class="keyword">rules</span> <span class="layout">// single-file entry point</span>

  <a href="#programOk_140_149" id="programOk_118_127" title="Referenced at line 11, 518">programOk</a> : <a href="../../src-gen/statix/signatures/Tiger-sig.stx#Module_372_378" id="Module_130_136" title="Defined at ../../src-gen/statix/signatures/Tiger-sig.stx line 20">Module</a>

  <a href="#programOk_118_127" id="programOk_140_149" title="Defined at line 9">programOk</a>(<a href="../../src-gen/statix/signatures/Tiger-sig.stx#Mod_452_455" id="Mod_150_153" title="Defined at ../../src-gen/statix/signatures/Tiger-sig.stx line 28">Mod</a>(e)) :- {<a href="#s_175_176" id="s_162_163" title="Referenced at line 12, 12, 13">s</a> <a href="#T_210_211" id="T_164_165" title="Referenced at line 13">T</a>}
    <span class="keyword">new</span> <a href="#s_162_163" id="s_175_176" title="Defined at line 11">s</a>, <a href="#init_11691_11695" id="init_178_182" title="Defined at line 492">init</a>(<a href="#s_162_163" id="s_183_184" title="Defined at line 11">s</a>),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_191_200" title="Defined at line 161">typeOfExp</a>(<a href="#s_162_163" id="s_201_202" title="Defined at line 11">s</a>, <a href="#e_154_155" id="e_204_205" title="Defined at line 11">e</a>) == <a href="#T_164_165" id="T_210_211" title="Defined at line 11">T</a>.

<span class="keyword">rules</span> <span class="layout">// multi-file entry point</span>

<span class="layout">//  projectOk : scope</span>
<span class="layout">//  projectOk(s).</span>
<span class="layout">//  fileOk : scope * Start</span>
<span class="layout">//  fileOk(s, Empty()).</span>

<span class="keyword">signature</span> <span class="layout">// variables</span>

  <span class="keyword">sorts</span>
    <a href="#VARS_787_791" id="VARS_375_379" title="Referenced at line 51">VARS</a>  = <span class="keyword">list</span>((<span class="keyword">path</span> * (<a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_397_399" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * <a href="#TYPE_2379_2383" id="TYPE_402_406" title="Defined at line 123">TYPE</a>)))
    <a href="#TYPES_1313_1318" id="TYPES_414_419" title="Referenced at line 75">TYPES</a> = <span class="keyword">list</span>((<span class="keyword">path</span> * (<a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_436_438" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * <a href="#TYPE_2379_2383" id="TYPE_441_445" title="Defined at line 123">TYPE</a>)))

  <span class="keyword">relations</span>
    <a href="#var_857_860" id="var_466_469" title="Referenced at line 55, 61">var</a>   : <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_474_476" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_480_484" title="Defined at line 123">TYPE</a>
    <a href="#type_1410_1414" id="type_489_493" title="Referenced at line 79, 85">type</a>  : <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_497_499" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_503_507" title="Defined at line 123">TYPE</a>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <a href="#P_1006_1007" id="P_538_539" title="Referenced at line 62, 64, 86, 88, 106, 108, 113, 114, 173, 184, 190, 199, 240, 246, 345, 352, 361, 362">P</a>

<span class="keyword">signature</span> <span class="layout">// records</span>

  <span class="keyword">sorts</span>
    <a href="#FIELDS_1744_1750" id="FIELDS_575_581" title="Referenced at line 94, 95">FIELDS</a> = <span class="keyword">list</span>((<span class="keyword">path</span> * (<a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_598_600" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * <a href="#TYPE_2379_2383" id="TYPE_603_607" title="Defined at line 123">TYPE</a>)))

  <span class="keyword">relations</span>
    <a href="#field_1882_1887" id="field_628_633" title="Referenced at line 99, 105, 112">field</a>: <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_635_637" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_641_645" title="Defined at line 123">TYPE</a>

<span class="keyword">signature</span> <span class="layout">// control-flow</span>

  <span class="keyword">relations</span>
    <a href="#loop_8097_8101" id="loop_690_694" title="Referenced at line 346, 354, 360">loop</a>:

<span class="keyword">rules</span> <span class="layout">// variable binding</span>

  <a href="#declareVar_829_839" id="declareVar_726_736" title="Referenced at line 54, 242, 249, 259, 278, 283, 353, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 511, 512">declareVar</a> : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_747_749" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> *  <a href="#TYPE_2379_2383" id="TYPE_753_757" title="Defined at line 123">TYPE</a>
  <a href="#lookupVar_908_917" id="lookupVar_760_769" title="Referenced at line 57, 60, 69">lookupVar</a>  : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_781_783" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> -&gt; <a href="#VARS_375_379" id="VARS_787_791" title="Defined at line 25">VARS</a>
  <a href="#typeOfVar_1080_1089" id="typeOfVar_794_803" title="Referenced at line 67, 264, 315, 319">typeOfVar</a>  : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_815_817" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_821_825" title="Defined at line 123">TYPE</a>

  <a href="#declareVar_726_736" id="declareVar_829_839" title="Defined at line 50">declareVar</a>(s, x, T) :-
    !<a href="#var_466_469" id="var_857_860" title="Defined at line 29">var</a>[<a href="#x_843_844" id="x_861_862" title="Defined at line 54">x</a>, <a href="#T_846_847" id="T_864_865" title="Defined at line 54">T</a>] <span class="keyword">in</span> <a href="#s_840_841" id="s_870_871" title="Defined at line 54">s</a>,
    <span class="layout">// declaration is distinct</span>
    <a href="#lookupVar_760_769" id="lookupVar_908_917" title="Defined at line 51">lookupVar</a>(<a href="#s_840_841" id="s_918_919" title="Defined at line 54">s</a>, <a href="#x_843_844" id="x_921_922" title="Defined at line 54">x</a>) == [_],
    @<a href="#x_843_844" id="x_937_938" title="Defined at line 54">x</a>.decl := <a href="#x_843_844" id="x_947_948" title="Defined at line 54">x</a>.

  <a href="#lookupVar_760_769" id="lookupVar_953_962" title="Defined at line 51">lookupVar</a>(s, x) = VARs :-
    <span class="keyword">query</span> <a href="#var_466_469" id="var_989_992" title="Defined at line 29">var</a>
      <span class="keyword">filter</span> <a href="#P_538_539" id="P_1006_1007" title="Defined at line 33">P</a>*
        <span class="keyword">and</span> { x' :- <a href="#x'_1023_1025" id="x'_1029_1031" title="Defined at line 63">x'</a> == <a href="#x_966_967" id="x_1035_1036" title="Defined at line 60">x</a> }
      <span class="keyword">min</span> $ &lt; <a href="#P_538_539" id="P_1053_1054" title="Defined at line 33">P</a>
       <span class="keyword">in</span> <a href="#s_963_964" id="s_1065_1066" title="Defined at line 60">s</a> |-&gt; <a href="#VARs_971_975" id="VARs_1071_1075" title="Defined at line 60">VARs</a>.

  <a href="#typeOfVar_794_803" id="typeOfVar_1080_1089" title="Defined at line 52">typeOfVar</a>(s, x) = T :- {<a href="#x'_1194_1196" id="x'_1104_1106" title="Referenced at line 69, 70">x'</a>}
    <span class="layout">// permissive lookup to cope with double declaration</span>
    <a href="#lookupVar_760_769" id="lookupVar_1169_1178" title="Defined at line 51">lookupVar</a>(<a href="#s_1090_1091" id="s_1179_1180" title="Defined at line 67">s</a>, <a href="#x_1093_1094" id="x_1182_1183" title="Defined at line 67">x</a>) == [(_, (<a href="#x'_1104_1106" id="x'_1194_1196" title="Defined at line 67">x'</a>, <a href="#T_1098_1099" id="T_1198_1199" title="Defined at line 67">T</a>)) |_],
    @<a href="#x_1093_1094" id="x_1212_1213" title="Defined at line 67">x</a>.<span class="keyword">ref</span> := <a href="#x'_1104_1106" id="x'_1221_1223" title="Defined at line 67">x'</a>.

<span class="keyword">rules</span> <span class="layout">// type binding</span>

  <a href="#declareType_1381_1392" id="declareType_1251_1262" title="Referenced at line 78, 217, 495, 496">declareType</a> : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_1273_1275" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * <a href="#TYPE_2379_2383" id="TYPE_1278_1282" title="Defined at line 123">TYPE</a>
  <a href="#lookupType_1462_1472" id="lookupType_1285_1295" title="Referenced at line 81, 84, 227">lookupType</a>  : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_1307_1309" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> -&gt; <a href="#TYPES_414_419" id="TYPES_1313_1318" title="Defined at line 26">TYPES</a>
  <span class="layout">// no `typeOfType: scope * ID -&gt; TYPE` due to name clash</span>

  <a href="#declareType_1251_1262" id="declareType_1381_1392" title="Defined at line 74">declareType</a>(s, x, T) :-
    !<a href="#type_489_493" id="type_1410_1414" title="Defined at line 30">type</a>[<a href="#x_1396_1397" id="x_1415_1416" title="Defined at line 78">x</a>, <a href="#T_1399_1400" id="T_1418_1419" title="Defined at line 78">T</a>] <span class="keyword">in</span> <a href="#s_1393_1394" id="s_1424_1425" title="Defined at line 78">s</a>,
    <span class="layout">// declaration is distinct</span>
    <a href="#lookupType_1285_1295" id="lookupType_1462_1472" title="Defined at line 75">lookupType</a>(<a href="#s_1393_1394" id="s_1473_1474" title="Defined at line 78">s</a>, <a href="#x_1396_1397" id="x_1476_1477" title="Defined at line 78">x</a>) == [_],
    @<a href="#x_1396_1397" id="x_1492_1493" title="Defined at line 78">x</a>.decl := <a href="#x_1396_1397" id="x_1502_1503" title="Defined at line 78">x</a>.

  <a href="#lookupType_1285_1295" id="lookupType_1508_1518" title="Defined at line 75">lookupType</a>(s, x) = TYPES :-
    <span class="keyword">query</span> <a href="#type_489_493" id="type_1546_1550" title="Defined at line 30">type</a>
      <span class="keyword">filter</span> <a href="#P_538_539" id="P_1564_1565" title="Defined at line 33">P</a>*
        <span class="keyword">and</span> { x' :- <a href="#x'_1581_1583" id="x'_1587_1589" title="Defined at line 87">x'</a> == <a href="#x_1522_1523" id="x_1593_1594" title="Defined at line 84">x</a> }
      <span class="keyword">min</span> $ &lt; <a href="#P_538_539" id="P_1611_1612" title="Defined at line 33">P</a>
       <span class="keyword">in</span> <a href="#s_1519_1520" id="s_1623_1624" title="Defined at line 84">s</a> |-&gt; <a href="#TYPES_1527_1532" id="TYPES_1629_1634" title="Defined at line 84">TYPES</a>.

<span class="keyword">rules</span> <span class="layout">// field binding</span>

  <a href="#declareField_1852_1864" id="declareField_1663_1675" title="Referenced at line 98, 439, 468">declareField</a>      : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_1691_1693" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * <a href="#TYPE_2379_2383" id="TYPE_1696_1700" title="Defined at line 123">TYPE</a>
  <a href="#lookupField_1935_1946" id="lookupField_1703_1714" title="Referenced at line 101, 104, 119, 475">lookupField</a>       : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_1731_1733" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a>        -&gt; <a href="#FIELDS_575_581" id="FIELDS_1744_1750" title="Defined at line 38">FIELDS</a>
  <a href="#lookupAllFields_2112_2127" id="lookupAllFields_1753_1768" title="Referenced at line 111, 451">lookupAllFields</a>   : <span class="keyword">scope</span>             -&gt; <a href="#FIELDS_575_581" id="FIELDS_1794_1800" title="Defined at line 38">FIELDS</a>
  <a href="#typeOfField_2213_2224" id="typeOfField_1803_1814" title="Referenced at line 117, 466, 483">typeOfField</a>       : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_1831_1833" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a>        -&gt; <a href="#TYPE_2379_2383" id="TYPE_1844_1848" title="Defined at line 123">TYPE</a>

  <a href="#declareField_1663_1675" id="declareField_1852_1864" title="Defined at line 93">declareField</a>(s, x, T) :-
    !<a href="#field_628_633" id="field_1882_1887" title="Defined at line 41">field</a>[<a href="#x_1868_1869" id="x_1888_1889" title="Defined at line 98">x</a>, <a href="#T_1871_1872" id="T_1891_1892" title="Defined at line 98">T</a>] <span class="keyword">in</span> <a href="#s_1865_1866" id="s_1897_1898" title="Defined at line 98">s</a>,
    <span class="layout">// declaration is distinct</span>
    <a href="#lookupField_1703_1714" id="lookupField_1935_1946" title="Defined at line 94">lookupField</a>(<a href="#s_1865_1866" id="s_1947_1948" title="Defined at line 98">s</a>, <a href="#x_1868_1869" id="x_1950_1951" title="Defined at line 98">x</a>) == [_],
    @<a href="#x_1868_1869" id="x_1966_1967" title="Defined at line 98">x</a>.decl := <a href="#x_1868_1869" id="x_1976_1977" title="Defined at line 98">x</a>.

  <a href="#lookupField_1703_1714" id="lookupField_1982_1993" title="Defined at line 94">lookupField</a>(s, x) = FLDs :-
    <span class="keyword">query</span> <a href="#field_628_633" id="field_2020_2025" title="Defined at line 41">field</a>
      <span class="keyword">filter</span> <a href="#P_538_539" id="P_2039_2040" title="Defined at line 33">P</a>*
        <span class="keyword">and</span> { x' :- <a href="#x'_2056_2058" id="x'_2062_2064" title="Defined at line 107">x'</a> == <a href="#x_1997_1998" id="x_2068_2069" title="Defined at line 104">x</a> }
      <span class="keyword">min</span> $ &lt; <a href="#P_538_539" id="P_2086_2087" title="Defined at line 33">P</a>
      <span class="keyword">in</span> <a href="#s_1994_1995" id="s_2097_2098" title="Defined at line 104">s</a> |-&gt; <a href="#FLDs_2002_2006" id="FLDs_2103_2107" title="Defined at line 104">FLDs</a>.

  <a href="#lookupAllFields_1753_1768" id="lookupAllFields_2112_2127" title="Defined at line 95">lookupAllFields</a>(s) = FLDs :-
    <span class="keyword">query</span> <a href="#field_628_633" id="field_2151_2156" title="Defined at line 41">field</a>
      <span class="keyword">filter</span> <a href="#P_538_539" id="P_2170_2171" title="Defined at line 33">P</a>*
      <span class="keyword">min</span> $ &lt; <a href="#P_538_539" id="P_2187_2188" title="Defined at line 33">P</a>
      <span class="keyword">in</span> <a href="#s_2128_2129" id="s_2198_2199" title="Defined at line 111">s</a> |-&gt; <a href="#FLDs_2133_2137" id="FLDs_2204_2208" title="Defined at line 111">FLDs</a>.

  <a href="#typeOfField_1803_1814" id="typeOfField_2213_2224" title="Defined at line 96">typeOfField</a>(s, x) = T :- {<a href="#d_2330_2331" id="d_2239_2240" title="Referenced at line 119, 120">d</a>}
    <span class="layout">// permissive lookup to cope with double declaration</span>
    <a href="#lookupField_1703_1714" id="lookupField_2303_2314" title="Defined at line 94">lookupField</a>(<a href="#s_2225_2226" id="s_2315_2316" title="Defined at line 117">s</a>, <a href="#x_2228_2229" id="x_2318_2319" title="Defined at line 117">x</a>) == [(_, (<a href="#d_2239_2240" id="d_2330_2331" title="Defined at line 117">d</a>, <a href="#T_2233_2234" id="T_2333_2334" title="Defined at line 117">T</a>)) | _],
    @<a href="#x_2228_2229" id="x_2348_2349" title="Defined at line 117">x</a>.<span class="keyword">ref</span> := <a href="#d_2239_2240" id="d_2357_2358" title="Defined at line 117">d</a>.

<span class="keyword">signature</span>
  <span class="keyword">sorts</span> <a href="#TYPE_402_406" id="TYPE_2379_2383" title="Referenced at line 25, 26, 29, 30, 38, 41, 50, 52, 74, 93, 96, 125, 126, 127, 128, 129, 130, 130, 131, 131, 131, 133, 133, 139, 139, 149, 149, 155, 155, 155, 161, 165, 166, 223, 254, 456, 471">TYPE</a>
  <span class="keyword">constructors</span>
    <a href="#UNIT_5449_5453" id="UNIT_2403_2407" title="Referenced at line 242, 243, 307, 323, 340, 342, 344, 348, 350, 357, 359, 498, 505, 507, 508, 511, 512">UNIT</a>   : <a href="#TYPE_2379_2383" id="TYPE_2412_2416" title="Defined at line 123">TYPE</a>
    <a href="#INT_6958_6961" id="INT_2421_2424" title="Referenced at line 295, 303, 335, 341, 347, 353, 355, 356, 367, 372, 373, 375, 376, 377, 379, 380, 381, 383, 384, 385, 387, 388, 389, 391, 397, 403, 404, 405, 408, 409, 410, 412, 413, 414, 416, 417, 418, 420, 421, 422, 424, 425, 426, 495, 499, 500, 501, 502, 502, 504, 504, 505, 508">INT</a>    : <a href="#TYPE_2379_2383" id="TYPE_2430_2434" title="Defined at line 123">TYPE</a>
    <a href="#STRING_11652_11658" id="STRING_2439_2445" title="Referenced at line 487, 496, 498, 499, 500, 501, 502, 502, 503, 503, 503, 506">STRING</a> : <a href="#TYPE_2379_2383" id="TYPE_2448_2452" title="Defined at line 123">TYPE</a>
    <a href="#NIL_2629_2632" id="NIL_2457_2460" title="Referenced at line 137, 152, 153, 157, 282, 443">NIL</a>    : <a href="#TYPE_2379_2383" id="TYPE_2466_2470" title="Defined at line 123">TYPE</a>
    <a href="#RECORD_2636_2642" id="RECORD_2475_2481" title="Referenced at line 137, 152, 153, 430, 447, 448, 482">RECORD</a> : <span class="keyword">scope</span> -&gt; <a href="#TYPE_2379_2383" id="TYPE_2493_2497" title="Defined at line 123">TYPE</a>
    <a href="#ARRAY_6691_6696" id="ARRAY_2502_2507" title="Referenced at line 287, 293, 294, 302">ARRAY</a>  : <a href="#TYPE_2379_2383" id="TYPE_2511_2515" title="Defined at line 123">TYPE</a> * <span class="keyword">scope</span> -&gt; <a href="#TYPE_2379_2383" id="TYPE_2527_2531" title="Defined at line 123">TYPE</a>
    <a href="#FUN_5441_5444" id="FUN_2536_2539" title="Referenced at line 242, 249, 264, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 511, 512">FUN</a>    : <span class="keyword">list</span>(<a href="#TYPE_2379_2383" id="TYPE_2550_2554" title="Defined at line 123">TYPE</a>) * <a href="#TYPE_2379_2383" id="TYPE_2558_2562" title="Defined at line 123">TYPE</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_2566_2570" title="Defined at line 123">TYPE</a>

<span class="keyword">rules</span> <a href="#subtype_2603_2610" id="subtype_2578_2585" title="Referenced at line 135, 137, 146, 251, 277, 297, 310, 469">subtype</a> : <a href="#TYPE_2379_2383" id="TYPE_2588_2592" title="Defined at line 123">TYPE</a> * <a href="#TYPE_2379_2383" id="TYPE_2595_2599" title="Defined at line 123">TYPE</a>

  <a href="#subtype_2578_2585" id="subtype_2603_2610" title="Defined at line 133">subtype</a>(T, T).

  <a href="#subtype_2578_2585" id="subtype_2621_2628" title="Defined at line 133">subtype</a>(<a href="#NIL_2457_2460" id="NIL_2629_2632" title="Defined at line 128">NIL</a>(), <a href="#RECORD_2475_2481" id="RECORD_2636_2642" title="Defined at line 129">RECORD</a>(s)).

<span class="keyword">rules</span> <a href="#subtypes_2738_2746" id="subtypes_2655_2663" title="Referenced at line 143, 145, 147, 266">subtypes</a> : <span class="keyword">list</span>(<a href="#TYPE_2379_2383" id="TYPE_2671_2675" title="Defined at line 123">TYPE</a>) * <span class="keyword">list</span>(<a href="#TYPE_2379_2383" id="TYPE_2684_2688" title="Defined at line 123">TYPE</a>)

<span class="layout">//  subtypes maps subtype(list(*), list(*))</span>

  <a href="#subtypes_2655_2663" id="subtypes_2738_2746" title="Defined at line 139">subtypes</a>([], []).

  <a href="#subtypes_2655_2663" id="subtypes_2759_2767" title="Defined at line 139">subtypes</a>([T | Ts], [S | Ss]) :-
    <a href="#subtype_2578_2585" id="subtype_2795_2802" title="Defined at line 133">subtype</a>(<a href="#T_2769_2770" id="T_2803_2804" title="Defined at line 145">T</a>, <a href="#S_2779_2780" id="S_2806_2807" title="Defined at line 145">S</a>),
    <a href="#subtypes_2655_2663" id="subtypes_2814_2822" title="Defined at line 139">subtypes</a>(<a href="#Ts_2773_2775" id="Ts_2823_2825" title="Defined at line 145">Ts</a>, <a href="#Ss_2783_2785" id="Ss_2827_2829" title="Defined at line 145">Ss</a>).

<span class="keyword">rules</span> <a href="#equitype_2865_2873" id="equitype_2839_2847" title="Referenced at line 151, 152, 153, 338, 394, 400">equitype</a> : <a href="#TYPE_2379_2383" id="TYPE_2850_2854" title="Defined at line 123">TYPE</a> * <a href="#TYPE_2379_2383" id="TYPE_2857_2861" title="Defined at line 123">TYPE</a>

  <a href="#equitype_2839_2847" id="equitype_2865_2873" title="Defined at line 149">equitype</a>(T, T).
  <a href="#equitype_2839_2847" id="equitype_2883_2891" title="Defined at line 149">equitype</a>(<a href="#NIL_2457_2460" id="NIL_2892_2895" title="Defined at line 128">NIL</a>(), <a href="#RECORD_2475_2481" id="RECORD_2899_2905" title="Defined at line 129">RECORD</a>(s)).
  <a href="#equitype_2839_2847" id="equitype_2913_2921" title="Defined at line 149">equitype</a>(<a href="#RECORD_2475_2481" id="RECORD_2922_2928" title="Defined at line 129">RECORD</a>(s), <a href="#NIL_2457_2460" id="NIL_2933_2936" title="Defined at line 128">NIL</a>()).

  <a href="#lub_2972_2975" id="lub_2944_2947" title="Referenced at line 156, 157, 334">lub</a> : <a href="#TYPE_2379_2383" id="TYPE_2950_2954" title="Defined at line 123">TYPE</a> * <a href="#TYPE_2379_2383" id="TYPE_2957_2961" title="Defined at line 123">TYPE</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_2965_2969" title="Defined at line 123">TYPE</a>
  <a href="#lub_2944_2947" id="lub_2972_2975" title="Defined at line 155">lub</a>(S, T) = S.
  <a href="#lub_2944_2947" id="lub_2989_2992" title="Defined at line 155">lub</a>(<a href="#NIL_2457_2460" id="NIL_2993_2996" title="Defined at line 128">NIL</a>(), T) = T.

<span class="keyword">rules</span>

  <a href="#typeOfExp_191_200" id="typeOfExp_3018_3027" title="Referenced at line 13, 162, 170, 243, 250, 263, 276, 281, 293, 295, 296, 303, 307, 309, 317, 319, 326, 329, 332, 334, 335, 336, 337, 340, 341, 342, 344, 347, 348, 350, 355, 356, 357, 359, 367, 372, 373, 375, 376, 377, 379, 380, 381, 383, 384, 385, 387, 388, 389, 391, 392, 393, 397, 398, 399, 403, 404, 405, 408, 409, 410, 412, 413, 414, 416, 417, 418, 420, 421, 422, 424, 425, 426, 443, 447, 467, 487, 536">typeOfExp</a>  : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#Exp_68_71" id="Exp_3039_3042" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 9">Exp</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_3046_3050" title="Defined at line 123">TYPE</a>
  <a href="#typeOfExps_6114_6124" id="typeOfExps_3053_3063" title="Referenced at line 265">typeOfExps</a>   <span class="keyword">maps</span> <a href="#typeOfExp_3018_3027" id="typeOfExp_3071_3080" title="Defined at line 161">typeOfExp</a>(*, <span class="keyword">list</span>(*)) = <span class="keyword">list</span>(*)


  <a href="#typeOfSeq_3338_3347" id="typeOfSeq_3107_3116" title="Referenced at line 175, 323, 325, 328, 330, 332">typeOfSeq</a>  : <span class="keyword">scope</span> * <span class="keyword">list</span>(<a href="../../src-gen/statix/signatures/Base-sig.stx#Exp_68_71" id="Exp_3133_3136" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 9">Exp</a>) -&gt; <a href="#TYPE_2379_2383" id="TYPE_3141_3145" title="Defined at line 123">TYPE</a>
  <a href="#typeOfLVal_7039_7049" id="typeOfLVal_3148_3158" title="Referenced at line 301, 302, 308, 314, 317, 481, 482, 524">typeOfLVal</a> : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#LValue_76_82" id="LValue_3169_3175" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 10">LValue</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_3179_3183" title="Defined at line 123">TYPE</a>

<span class="keyword">rules</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_3194_3203" title="Defined at line 161">typeOfExp</a>(s_outer, <a href="../../src-gen/statix/signatures/Bindings-sig.stx#Let_184_187" id="Let_3213_3216" title="Defined at ../../src-gen/statix/signatures/Bindings-sig.stx line 17">Let</a>(ds, es)) = T :- {<a href="#s_body_3256_3262" id="s_body_3234_3240" title="Referenced at line 171, 174, 175">s_body</a> <a href="#s_dec_3272_3277" id="s_dec_3241_3246" title="Referenced at line 172, 173, 174">s_dec</a>}
    <span class="keyword">new</span> <a href="#s_body_3234_3240" id="s_body_3256_3262" title="Defined at line 170">s_body</a>,
    <span class="keyword">new</span> <a href="#s_dec_3241_3246" id="s_dec_3272_3277" title="Defined at line 170">s_dec</a>,
    <a href="#s_dec_3241_3246" id="s_dec_3283_3288" title="Defined at line 170">s_dec</a> -<a href="#P_538_539" id="P_3290_3291" title="Defined at line 33">P</a>-&gt; <a href="#s_outer_3204_3211" id="s_outer_3294_3301" title="Defined at line 170">s_outer</a>,
    <a href="#decsOk_3370_3376" id="decsOk_3307_3313" title="Defined at line 178">decsOk</a>(<a href="#s_body_3234_3240" id="s_body_3314_3320" title="Defined at line 170">s_body</a>, <a href="#s_dec_3241_3246" id="s_dec_3322_3327" title="Defined at line 170">s_dec</a>, <a href="#ds_3217_3219" id="ds_3329_3331" title="Defined at line 170">ds</a>),
    <a href="#typeOfSeq_3107_3116" id="typeOfSeq_3338_3347" title="Defined at line 165">typeOfSeq</a>(<a href="#s_body_3234_3240" id="s_body_3348_3354" title="Defined at line 170">s_body</a>, <a href="#es_3221_3223" id="es_3356_3358" title="Defined at line 170">es</a>) == <a href="#T_3228_3229" id="T_3363_3364" title="Defined at line 170">T</a>.


  <a href="#decsOk_3307_3313" id="decsOk_3370_3376" title="Referenced at line 174, 182, 186, 188, 192, 194, 196, 198">decsOk</a>     : <span class="keyword">scope</span> * <span class="keyword">scope</span> * <span class="keyword">list</span>(<a href="../../src-gen/statix/signatures/Base-sig.stx#Dec_60_63" id="Dec_3404_3407" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 8">Dec</a>)
  <a href="#decOk_3556_3561" id="decOk_3411_3416" title="Referenced at line 185, 191, 195, 215, 239, 245, 274, 280, 526">decOk</a>      : <span class="keyword">scope</span> * <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#Dec_60_63" id="Dec_3440_3443" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 8">Dec</a>


  <a href="#decsOk_3370_3376" id="decsOk_3448_3454" title="Defined at line 178">decsOk</a>(s_body, s_outer, [dec@<a href="../../src-gen/statix/signatures/Variables-sig.stx#VarDec_130_136" id="VarDec_3477_3483" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 15">VarDec</a>(_, _, _) | decs]) :- {<a href="#s_dec_3521_3526" id="s_dec_3506_3511" title="Referenced at line 183, 184, 185, 186">s_dec</a>}
    <span class="keyword">new</span> <a href="#s_dec_3506_3511" id="s_dec_3521_3526" title="Defined at line 182">s_dec</a>,
    <a href="#s_dec_3506_3511" id="s_dec_3532_3537" title="Defined at line 182">s_dec</a> -<a href="#P_538_539" id="P_3539_3540" title="Defined at line 33">P</a>-&gt; <a href="#s_outer_3463_3470" id="s_outer_3543_3550" title="Defined at line 182">s_outer</a>,
    <a href="#decOk_3411_3416" id="decOk_3556_3561" title="Defined at line 179">decOk</a>(<a href="#s_dec_3506_3511" id="s_dec_3562_3567" title="Defined at line 182">s_dec</a>, <a href="#s_outer_3463_3470" id="s_outer_3569_3576" title="Defined at line 182">s_outer</a>, <a href="#dec_3473_3476" id="dec_3578_3581" title="Defined at line 182">dec</a>),
    <a href="#decsOk_3370_3376" id="decsOk_3588_3594" title="Defined at line 178">decsOk</a>(<a href="#s_body_3455_3461" id="s_body_3595_3601" title="Defined at line 182">s_body</a>, <a href="#s_dec_3506_3511" id="s_dec_3603_3608" title="Defined at line 182">s_dec</a>, <a href="#decs_3495_3499" id="decs_3610_3614" title="Defined at line 182">decs</a>).

  <a href="#decsOk_3370_3376" id="decsOk_3620_3626" title="Defined at line 178">decsOk</a>(s_body, s_outer, [dec@<a href="../../src-gen/statix/signatures/Variables-sig.stx#VarDecNoType_166_178" id="VarDecNoType_3649_3661" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 16">VarDecNoType</a>(_, _) | decs]) :- {<a href="#s_dec_3696_3701" id="s_dec_3681_3686" title="Referenced at line 189, 190, 191, 192">s_dec</a>}
    <span class="keyword">new</span> <a href="#s_dec_3681_3686" id="s_dec_3696_3701" title="Defined at line 188">s_dec</a>,
    <a href="#s_dec_3681_3686" id="s_dec_3707_3712" title="Defined at line 188">s_dec</a> -<a href="#P_538_539" id="P_3714_3715" title="Defined at line 33">P</a>-&gt; <a href="#s_outer_3635_3642" id="s_outer_3718_3725" title="Defined at line 188">s_outer</a>,
    <a href="#decOk_3411_3416" id="decOk_3731_3736" title="Defined at line 179">decOk</a>(<a href="#s_dec_3681_3686" id="s_dec_3737_3742" title="Defined at line 188">s_dec</a>, <a href="#s_outer_3635_3642" id="s_outer_3744_3751" title="Defined at line 188">s_outer</a>, <a href="#dec_3645_3648" id="dec_3753_3756" title="Defined at line 188">dec</a>),
    <a href="#decsOk_3370_3376" id="decsOk_3763_3769" title="Defined at line 178">decsOk</a>(<a href="#s_body_3627_3633" id="s_body_3770_3776" title="Defined at line 188">s_body</a>, <a href="#s_dec_3681_3686" id="s_dec_3778_3783" title="Defined at line 188">s_dec</a>, <a href="#decs_3670_3674" id="decs_3785_3789" title="Defined at line 188">decs</a>).

  <a href="#decsOk_3370_3376" id="decsOk_3795_3801" title="Defined at line 178">decsOk</a>(s_body, s_outer, [dec | decs]) :- {<span id="s_dec_3837_3842" title="Not referenced locally, nor via imports">s_dec</span>}
    <a href="#decOk_3411_3416" id="decOk_3848_3853" title="Defined at line 179">decOk</a>(<a href="#s_outer_3810_3817" id="s_outer_3854_3861" title="Defined at line 194">s_outer</a>, <a href="#s_outer_3810_3817" id="s_outer_3863_3870" title="Defined at line 194">s_outer</a>, <a href="#dec_3820_3823" id="dec_3872_3875" title="Defined at line 194">dec</a>),
    <a href="#decsOk_3370_3376" id="decsOk_3882_3888" title="Defined at line 178">decsOk</a>(<a href="#s_body_3802_3808" id="s_body_3889_3895" title="Defined at line 194">s_body</a>, <a href="#s_outer_3810_3817" id="s_outer_3897_3904" title="Defined at line 194">s_outer</a>, <a href="#decs_3826_3830" id="decs_3906_3910" title="Defined at line 194">decs</a>).

  <a href="#decsOk_3370_3376" id="decsOk_3916_3922" title="Defined at line 178">decsOk</a>(s_body, s_outer, []) :-
    <a href="#s_body_3923_3929" id="s_body_3951_3957" title="Defined at line 198">s_body</a> -<a href="#P_538_539" id="P_3959_3960" title="Defined at line 33">P</a>-&gt; <a href="#s_outer_3931_3938" id="s_outer_3963_3970" title="Defined at line 198">s_outer</a>.

<span class="keyword">rules</span> <span class="layout">// type declarations</span>

  <span class="layout">// Types: In the expression [let ... typedecs ... in exps end] the</span>
  <span class="layout">// scope of a type identifier starts at the beginning of the</span>
  <span class="layout">// consecutive sequence of type declarations defining it and lasts</span>
  <span class="layout">// until the end. The includes the headers and bodies of any functions</span>
  <span class="layout">// with the scope.</span>

  <span class="layout">// Name spaces: There are two different name spaces: one for types,</span>
  <span class="layout">// and one for functions and variables. A type [a] can be "in scope"</span>
  <span class="layout">// at the same time as a variable [a] or a function [a], but</span>
  <span class="layout">// variables and functions of the same name cannot both be in</span>
  <span class="layout">// scope simultaneously (one will hide the other).</span>

  <a href="#decOk_3411_3416" id="decOk_4621_4626" title="Defined at line 179">decOk</a>(s, s_outer, <a href="../../src-gen/statix/signatures/Types-sig.stx#TypeDec_126_133" id="TypeDec_4639_4646" title="Defined at ../../src-gen/statix/signatures/Types-sig.stx line 15">TypeDec</a>(x, t)) :- {<a href="#T_4691_4692" id="T_4658_4659" title="Referenced at line 216, 217">T</a>}
    <a href="#typeOfType_4807_4817" id="typeOfType_4665_4675" title="Defined at line 223">typeOfType</a>(<a href="#s_outer_4630_4637" id="s_outer_4676_4683" title="Defined at line 215">s_outer</a>, <a href="#t_4650_4651" id="t_4685_4686" title="Defined at line 215">t</a>) == <a href="#T_4658_4659" id="T_4691_4692" title="Defined at line 215">T</a>,
    <a href="#declareType_1251_1262" id="declareType_4698_4709" title="Defined at line 74">declareType</a>(<a href="#s_4627_4628" id="s_4710_4711" title="Defined at line 215">s</a>, <a href="#x_4647_4648" id="x_4713_4714" title="Defined at line 215">x</a>, <a href="#T_4658_4659" id="T_4716_4717" title="Defined at line 215">T</a>).

   <span class="layout">// note: type declarations in a sequence are mutually recursive</span>

<span class="keyword">rules</span> <span class="layout">// types</span>

  <a href="#typeOfType_4665_4675" id="typeOfType_4807_4817" title="Referenced at line 216, 225, 248, 258, 275, 287, 289, 294, 430, 438, 448, 528">typeOfType</a> : <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Base-sig.stx#Type_87_91" id="Type_4828_4832" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 11">Type</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_4836_4840" title="Defined at line 123">TYPE</a>

  <a href="#typeOfType_4807_4817" id="typeOfType_4844_4854" title="Defined at line 223">typeOfType</a>(s, <a href="../../src-gen/statix/signatures/Types-sig.stx#Tid_157_160" id="Tid_4858_4861" title="Defined at ../../src-gen/statix/signatures/Types-sig.stx line 16">Tid</a>(x)) = T :- {<a href="#x'_4965_4967" id="x'_4874_4876" title="Referenced at line 227, 228">x'</a>}
    <span class="layout">// permissive lookup to cope with double declaration</span>
    <a href="#lookupType_1285_1295" id="lookupType_4939_4949" title="Defined at line 75">lookupType</a>(<a href="#s_4855_4856" id="s_4950_4951" title="Defined at line 225">s</a>, <a href="#x_4862_4863" id="x_4953_4954" title="Defined at line 225">x</a>) == [(_, (<a href="#x'_4874_4876" id="x'_4965_4967" title="Defined at line 225">x'</a>, <a href="#T_4868_4869" id="T_4969_4970" title="Defined at line 225">T</a>)) | _],
    @<a href="#x_4862_4863" id="x_4984_4985" title="Defined at line 225">x</a>.<span class="keyword">ref</span> := <a href="#x'_4874_4876" id="x'_4993_4995" title="Defined at line 225">x'</a>.

    <span class="layout">// typeOfDecl of Type{x} in s |-&gt; [(_, (_, T))|_].</span>
    <span class="layout">// permissive query to allow non-distinct type declarations</span>

<span class="keyword">rules</span> <span class="layout">// function declarations</span>

  <span class="layout">// Parameters: In [function id(... id1: id2 ...) = exp] the</span>
  <span class="layout">// scope of the parameter id1 lasts throughout the function</span>
  <span class="layout">// body exp</span>

  <a href="#decOk_3411_3416" id="decOk_5291_5296" title="Defined at line 179">decOk</a>(s, s_outer, d@<a href="../../src-gen/statix/signatures/Functions-sig.stx#ProcDec_161_168" id="ProcDec_5311_5318" title="Defined at ../../src-gen/statix/signatures/Functions-sig.stx line 17">ProcDec</a>(f, args, e)) :- {<a href="#s_fun_5354_5359" id="s_fun_5336_5341" title="Referenced at line 240, 240, 241, 243">s_fun</a> <a href="#Ts_5416_5418" id="Ts_5342_5344" title="Referenced at line 241, 242">Ts</a>}
    <span class="keyword">new</span> <a href="#s_fun_5336_5341" id="s_fun_5354_5359" title="Defined at line 239">s_fun</a>, <a href="#s_fun_5336_5341" id="s_fun_5361_5366" title="Defined at line 239">s_fun</a> -<a href="#P_538_539" id="P_5368_5369" title="Defined at line 33">P</a>-&gt; <a href="#s_5297_5298" id="s_5372_5373" title="Defined at line 239">s</a>,
    <a href="#typesOfArgs_5843_5854" id="typesOfArgs_5379_5390" title="Defined at line 255">typesOfArgs</a>(<a href="#s_fun_5336_5341" id="s_fun_5391_5396" title="Defined at line 239">s_fun</a>, <a href="#s_outer_5300_5307" id="s_outer_5398_5405" title="Defined at line 239">s_outer</a>, <a href="#args_5322_5326" id="args_5407_5411" title="Defined at line 239">args</a>) == <a href="#Ts_5342_5344" id="Ts_5416_5418" title="Defined at line 239">Ts</a>,
    <a href="#declareVar_726_736" id="declareVar_5424_5434" title="Defined at line 50">declareVar</a>(<a href="#s_5297_5298" id="s_5435_5436" title="Defined at line 239">s</a>, <a href="#f_5319_5320" id="f_5438_5439" title="Defined at line 239">f</a>, <a href="#FUN_2536_2539" id="FUN_5441_5444" title="Defined at line 131">FUN</a>(<a href="#Ts_5342_5344" id="Ts_5445_5447" title="Defined at line 239">Ts</a>, <a href="#UNIT_2403_2407" id="UNIT_5449_5453" title="Defined at line 125">UNIT</a>())),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_5463_5472" title="Defined at line 161">typeOfExp</a>(<a href="#s_fun_5336_5341" id="s_fun_5473_5478" title="Defined at line 239">s_fun</a>, <a href="#e_5328_5329" id="e_5480_5481" title="Defined at line 239">e</a>) == <a href="#UNIT_2403_2407" id="UNIT_5486_5490" title="Defined at line 125">UNIT</a>().

  <a href="#decOk_3411_3416" id="decOk_5497_5502" title="Defined at line 179">decOk</a>(s, s_outer, d@<a href="../../src-gen/statix/signatures/Functions-sig.stx#FunDec_204_210" id="FunDec_5517_5523" title="Defined at ../../src-gen/statix/signatures/Functions-sig.stx line 18">FunDec</a>(f, args, t, e)) :- {<a href="#s_fun_5566_5571" id="s_fun_5544_5549" title="Referenced at line 246, 246, 247, 250">s_fun</a> <a href="#Ts_5628_5630" id="Ts_5550_5552" title="Referenced at line 247, 249">Ts</a> <a href="#T_5662_5663" id="T_5553_5554" title="Referenced at line 248, 249, 251, 251">T</a> <a href="#S_5726_5727" id="S_5555_5556" title="Referenced at line 250, 251, 251">S</a>}
    <span class="keyword">new</span> <a href="#s_fun_5544_5549" id="s_fun_5566_5571" title="Defined at line 245">s_fun</a>, <a href="#s_fun_5544_5549" id="s_fun_5573_5578" title="Defined at line 245">s_fun</a> -<a href="#P_538_539" id="P_5580_5581" title="Defined at line 33">P</a>-&gt; <a href="#s_5503_5504" id="s_5584_5585" title="Defined at line 245">s</a>,
    <a href="#typesOfArgs_5843_5854" id="typesOfArgs_5591_5602" title="Defined at line 255">typesOfArgs</a>(<a href="#s_fun_5544_5549" id="s_fun_5603_5608" title="Defined at line 245">s_fun</a>, <a href="#s_outer_5506_5513" id="s_outer_5610_5617" title="Defined at line 245">s_outer</a>, <a href="#args_5527_5531" id="args_5619_5623" title="Defined at line 245">args</a>) == <a href="#Ts_5550_5552" id="Ts_5628_5630" title="Defined at line 245">Ts</a>,
    <a href="#typeOfType_4807_4817" id="typeOfType_5636_5646" title="Defined at line 223">typeOfType</a>(<a href="#s_outer_5506_5513" id="s_outer_5647_5654" title="Defined at line 245">s_outer</a>, <a href="#t_5533_5534" id="t_5656_5657" title="Defined at line 245">t</a>) == <a href="#T_5553_5554" id="T_5662_5663" title="Defined at line 245">T</a>,
    <a href="#declareVar_726_736" id="declareVar_5669_5679" title="Defined at line 50">declareVar</a>(<a href="#s_5503_5504" id="s_5680_5681" title="Defined at line 245">s</a>, <a href="#f_5524_5525" id="f_5683_5684" title="Defined at line 245">f</a>, <a href="#FUN_2536_2539" id="FUN_5686_5689" title="Defined at line 131">FUN</a>(<a href="#Ts_5550_5552" id="Ts_5690_5692" title="Defined at line 245">Ts</a>, <a href="#T_5553_5554" id="T_5694_5695" title="Defined at line 245">T</a>)),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_5703_5712" title="Defined at line 161">typeOfExp</a>(<a href="#s_fun_5544_5549" id="s_fun_5713_5718" title="Defined at line 245">s_fun</a>, <a href="#e_5536_5537" id="e_5720_5721" title="Defined at line 245">e</a>) == <a href="#S_5555_5556" id="S_5726_5727" title="Defined at line 245">S</a>,
    <a href="#subtype_2578_2585" id="subtype_5733_5740" title="Defined at line 133">subtype</a>(<a href="#S_5555_5556" id="S_5741_5742" title="Defined at line 245">S</a>, <a href="#T_5553_5554" id="T_5744_5745" title="Defined at line 245">T</a>) | <span class="keyword">error</span> $[[<a href="#S_5555_5556" id="S_5758_5759" title="Defined at line 245">S</a>] is not a subtype of [<a href="#T_5553_5554" id="T_5782_5783" title="Defined at line 245">T</a>]] @<a href="#t_5533_5534" id="t_5787_5788" title="Defined at line 245">t</a>.

<span class="keyword">rules</span>
  <a href="#typeOfArg_5861_5870" id="typeOfArg_5799_5808" title="Referenced at line 255, 257, 530">typeOfArg</a>  : <span class="keyword">scope</span> * <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Functions-sig.stx#FArg_87_91" id="FArg_5828_5832" title="Defined at ../../src-gen/statix/signatures/Functions-sig.stx line 9">FArg</a> -&gt; <a href="#TYPE_2379_2383" id="TYPE_5836_5840" title="Defined at line 123">TYPE</a>
  <a href="#typesOfArgs_5379_5390" id="typesOfArgs_5843_5854" title="Referenced at line 241, 247">typesOfArgs</a>  <span class="keyword">maps</span> <a href="#typeOfArg_5799_5808" id="typeOfArg_5861_5870" title="Defined at line 254">typeOfArg</a>(*, *, <span class="keyword">list</span>(*)) = <span class="keyword">list</span>(*)

  <a href="#typeOfArg_5799_5808" id="typeOfArg_5899_5908" title="Defined at line 254">typeOfArg</a>(s_fun, s_outer, <a href="../../src-gen/statix/signatures/Functions-sig.stx#FArg_253_257" id="FArg_5925_5929" title="Defined at ../../src-gen/statix/signatures/Functions-sig.stx line 19">FArg</a>(x, t)) = T :-
    <a href="#typeOfType_4807_4817" id="typeOfType_5948_5958" title="Defined at line 223">typeOfType</a>(<a href="#s_outer_5916_5923" id="s_outer_5959_5966" title="Defined at line 257">s_outer</a>, <a href="#t_5933_5934" id="t_5968_5969" title="Defined at line 257">t</a>) == <a href="#T_5939_5940" id="T_5974_5975" title="Defined at line 257">T</a>,
    <a href="#declareVar_726_736" id="declareVar_5981_5991" title="Defined at line 50">declareVar</a>(<a href="#s_fun_5909_5914" id="s_fun_5992_5997" title="Defined at line 257">s_fun</a>, <a href="#x_5930_5931" id="x_5999_6000" title="Defined at line 257">x</a>, <a href="#T_5939_5940" id="T_6002_6003" title="Defined at line 257">T</a>).

<span class="keyword">rules</span> <span class="layout">// function calls</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_6034_6043" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Functions-sig.stx#Call_282_286" id="Call_6047_6051" title="Defined at ../../src-gen/statix/signatures/Functions-sig.stx line 20">Call</a>(f, es)) = T :- {<a href="#Ts_6102_6104" id="Ts_6068_6070" title="Referenced at line 264, 266">Ts</a> <a href="#Ss_6135_6137" id="Ss_6071_6073" title="Referenced at line 265, 266">Ss</a>}
    <a href="#typeOfVar_794_803" id="typeOfVar_6079_6088" title="Defined at line 52">typeOfVar</a>(<a href="#s_6044_6045" id="s_6089_6090" title="Defined at line 263">s</a>, <a href="#f_6052_6053" id="f_6092_6093" title="Defined at line 263">f</a>) == <a href="#FUN_2536_2539" id="FUN_6098_6101" title="Defined at line 131">FUN</a>(<a href="#Ts_6068_6070" id="Ts_6102_6104" title="Defined at line 263">Ts</a>, <a href="#T_6062_6063" id="T_6106_6107" title="Defined at line 263">T</a>),
    <a href="#typeOfExps_3053_3063" id="typeOfExps_6114_6124" title="Defined at line 162">typeOfExps</a>(<a href="#s_6044_6045" id="s_6125_6126" title="Defined at line 263">s</a>, <a href="#es_6055_6057" id="es_6128_6130" title="Defined at line 263">es</a>) == <a href="#Ss_6071_6073" id="Ss_6135_6137" title="Defined at line 263">Ss</a>,
    <a href="#subtypes_2655_2663" id="subtypes_6143_6151" title="Defined at line 139">subtypes</a>(<a href="#Ss_6071_6073" id="Ss_6152_6154" title="Defined at line 263">Ss</a>, <a href="#Ts_6068_6070" id="Ts_6156_6158" title="Defined at line 263">Ts</a>).

<span class="keyword">rules</span> <span class="layout">// variable declarations</span>

  <span class="layout">// Local variables: In the expression [let ... vardec ... in exp end],</span>
  <span class="layout">// the scope of the declared variable starts just after its vardec</span>
  <span class="layout">// and lasts until the end.</span>

  <a href="#decOk_3411_3416" id="decOk_6369_6374" title="Defined at line 179">decOk</a>(s, s_outer, <a href="../../src-gen/statix/signatures/Variables-sig.stx#VarDec_130_136" id="VarDec_6387_6393" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 15">VarDec</a>(x, t, e)) :- {<a href="#T_6443_6444" id="T_6408_6409" title="Referenced at line 275, 277, 278">T</a> <a href="#S_6475_6476" id="S_6410_6411" title="Referenced at line 276, 277">S</a>}
    <a href="#typeOfType_4807_4817" id="typeOfType_6417_6427" title="Defined at line 223">typeOfType</a>(<a href="#s_outer_6378_6385" id="s_outer_6428_6435" title="Defined at line 274">s_outer</a>, <a href="#t_6397_6398" id="t_6437_6438" title="Defined at line 274">t</a>) == <a href="#T_6408_6409" id="T_6443_6444" title="Defined at line 274">T</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_6450_6459" title="Defined at line 161">typeOfExp</a>(<a href="#s_outer_6378_6385" id="s_outer_6460_6467" title="Defined at line 274">s_outer</a>, <a href="#e_6400_6401" id="e_6469_6470" title="Defined at line 274">e</a>) == <a href="#S_6410_6411" id="S_6475_6476" title="Defined at line 274">S</a>,
    <a href="#subtype_2578_2585" id="subtype_6482_6489" title="Defined at line 133">subtype</a>(<a href="#S_6410_6411" id="S_6490_6491" title="Defined at line 274">S</a>, <a href="#T_6408_6409" id="T_6493_6494" title="Defined at line 274">T</a>),
    <a href="#declareVar_726_736" id="declareVar_6501_6511" title="Defined at line 50">declareVar</a>(<a href="#s_6375_6376" id="s_6512_6513" title="Defined at line 274">s</a>, <a href="#x_6394_6395" id="x_6515_6516" title="Defined at line 274">x</a>, <a href="#T_6408_6409" id="T_6518_6519" title="Defined at line 274">T</a>).

  <a href="#decOk_3411_3416" id="decOk_6525_6530" title="Defined at line 179">decOk</a>(s, s_outer, <a href="../../src-gen/statix/signatures/Variables-sig.stx#VarDecNoType_166_178" id="VarDecNoType_6543_6555" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 16">VarDecNoType</a>(x, e)) :- {<a href="#T_6599_6600" id="T_6567_6568" title="Referenced at line 281, 282, 283">T</a>}
    <a href="#typeOfExp_3018_3027" id="typeOfExp_6574_6583" title="Defined at line 161">typeOfExp</a>(<a href="#s_outer_6534_6541" id="s_outer_6584_6591" title="Defined at line 280">s_outer</a>, <a href="#e_6559_6560" id="e_6593_6594" title="Defined at line 280">e</a>) == <a href="#T_6567_6568" id="T_6599_6600" title="Defined at line 280">T</a>,
    <a href="#T_6567_6568" id="T_6606_6607" title="Defined at line 280">T</a> != <a href="#NIL_2457_2460" id="NIL_6611_6614" title="Defined at line 128">NIL</a>(),
    <a href="#declareVar_726_736" id="declareVar_6622_6632" title="Defined at line 50">declareVar</a>(<a href="#s_6531_6532" id="s_6633_6634" title="Defined at line 280">s</a>, <a href="#x_6556_6557" id="x_6636_6637" title="Defined at line 280">x</a>, <a href="#T_6567_6568" id="T_6639_6640" title="Defined at line 280">T</a>).

<span class="keyword">rules</span> <span class="layout">// arrays</span>

  <a href="#typeOfType_4807_4817" id="typeOfType_6663_6673" title="Defined at line 223">typeOfType</a>(s, <a href="../../src-gen/statix/signatures/Arrays-sig.stx#ArrayTy_161_168" id="ArrayTy_6677_6684" title="Defined at ../../src-gen/statix/signatures/Arrays-sig.stx line 16">ArrayTy</a>(x)) = <a href="#ARRAY_2502_2507" id="ARRAY_6691_6696" title="Defined at line 130">ARRAY</a>(T, s_arr) :-
    <span class="keyword">new</span> <a href="#s_arr_6700_6705" id="s_arr_6718_6723" title="Defined at line 287">s_arr</a>, <span class="layout">// unique token to distinghuish the array type</span>
    <a href="#typeOfType_4807_4817" id="typeOfType_6776_6786" title="Defined at line 223">typeOfType</a>(<a href="#s_6674_6675" id="s_6787_6788" title="Defined at line 287">s</a>, <a href="../../src-gen/statix/signatures/Types-sig.stx#Tid_157_160" id="Tid_6790_6793" title="Defined at ../../src-gen/statix/signatures/Types-sig.stx line 16">Tid</a>(<a href="#x_6685_6686" id="x_6794_6795" title="Defined at line 287">x</a>)) == <a href="#T_6697_6698" id="T_6801_6802" title="Defined at line 287">T</a>.

<span class="keyword">rules</span> <span class="layout">// array creation</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_6832_6841" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Arrays-sig.stx#Array_127_132" id="Array_6845_6850" title="Defined at ../../src-gen/statix/signatures/Arrays-sig.stx line 15">Array</a>(x, e1, e2)) = <a href="#ARRAY_2502_2507" id="ARRAY_6865_6870" title="Defined at line 130">ARRAY</a>(T, s_arr) :- {<a href="#S_6989_6990" id="S_6885_6886" title="Referenced at line 296, 297">S</a>}
    <a href="#typeOfType_4807_4817" id="typeOfType_6892_6902" title="Defined at line 223">typeOfType</a>(<a href="#s_6842_6843" id="s_6903_6904" title="Defined at line 293">s</a>, <a href="../../src-gen/statix/signatures/Types-sig.stx#Tid_157_160" id="Tid_6906_6909" title="Defined at ../../src-gen/statix/signatures/Types-sig.stx line 16">Tid</a>(<a href="#x_6851_6852" id="x_6910_6911" title="Defined at line 293">x</a>)) == <a href="#ARRAY_2502_2507" id="ARRAY_6917_6922" title="Defined at line 130">ARRAY</a>(<a href="#T_6871_6872" id="T_6923_6924" title="Defined at line 293">T</a>, <a href="#s_arr_6874_6879" id="s_arr_6926_6931" title="Defined at line 293">s_arr</a>),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_6938_6947" title="Defined at line 161">typeOfExp</a>(<a href="#s_6842_6843" id="s_6948_6949" title="Defined at line 293">s</a>, <a href="#e1_6854_6856" id="e1_6951_6953" title="Defined at line 293">e1</a>) == <a href="#INT_2421_2424" id="INT_6958_6961" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_6969_6978" title="Defined at line 161">typeOfExp</a>(<a href="#s_6842_6843" id="s_6979_6980" title="Defined at line 293">s</a>, <a href="#e2_6858_6860" id="e2_6982_6984" title="Defined at line 293">e2</a>) == <a href="#S_6885_6886" id="S_6989_6990" title="Defined at line 293">S</a>,
    <a href="#subtype_2578_2585" id="subtype_6996_7003" title="Defined at line 133">subtype</a>(<a href="#S_6885_6886" id="S_7004_7005" title="Defined at line 293">S</a>, <a href="#T_6871_6872" id="T_7007_7008" title="Defined at line 293">T</a>).

<span class="keyword">rules</span> <span class="layout">// array indexing</span>

  <a href="#typeOfLVal_3148_3158" id="typeOfLVal_7039_7049" title="Defined at line 166">typeOfLVal</a>(s, <a href="../../src-gen/statix/signatures/Arrays-sig.stx#Subscript_186_195" id="Subscript_7053_7062" title="Defined at ../../src-gen/statix/signatures/Arrays-sig.stx line 17">Subscript</a>(e1, e2)) = T :- {<a href="#s_arr_7121_7126" id="s_arr_7080_7085" title="Referenced at line 302">s_arr</a>}
    <a href="#typeOfLVal_3148_3158" id="typeOfLVal_7091_7101" title="Defined at line 166">typeOfLVal</a>(<a href="#s_7050_7051" id="s_7102_7103" title="Defined at line 301">s</a>, <a href="#e1_7063_7065" id="e1_7105_7107" title="Defined at line 301">e1</a>) == <a href="#ARRAY_2502_2507" id="ARRAY_7112_7117" title="Defined at line 130">ARRAY</a>(<a href="#T_7074_7075" id="T_7118_7119" title="Defined at line 301">T</a>, <a href="#s_arr_7080_7085" id="s_arr_7121_7126" title="Defined at line 301">s_arr</a>),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7133_7142" title="Defined at line 161">typeOfExp</a>(<a href="#s_7050_7051" id="s_7143_7144" title="Defined at line 301">s</a>, <a href="#e2_7067_7069" id="e2_7146_7148" title="Defined at line 301">e2</a>) == <a href="#INT_2421_2424" id="INT_7153_7156" title="Defined at line 126">INT</a>().

<span class="keyword">rules</span> <span class="layout">// statements</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_7184_7193" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Control-Flow-sig.stx#Assign_306_312" id="Assign_7197_7203" title="Defined at ../../src-gen/statix/signatures/Control-Flow-sig.stx line 21">Assign</a>(e1, e2)) = <a href="#UNIT_2403_2407" id="UNIT_7215_7219" title="Defined at line 125">UNIT</a>() :- {<a href="#T_7256_7257" id="T_7226_7227" title="Referenced at line 308, 310">T</a> <a href="#S_7283_7284" id="S_7228_7229" title="Referenced at line 309, 310">S</a>}
    <a href="#typeOfLVal_3148_3158" id="typeOfLVal_7235_7245" title="Defined at line 166">typeOfLVal</a>(<a href="#s_7194_7195" id="s_7246_7247" title="Defined at line 307">s</a>, <a href="#e1_7204_7206" id="e1_7249_7251" title="Defined at line 307">e1</a>) == <a href="#T_7226_7227" id="T_7256_7257" title="Defined at line 307">T</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7263_7272" title="Defined at line 161">typeOfExp</a>(<a href="#s_7194_7195" id="s_7273_7274" title="Defined at line 307">s</a>, <a href="#e2_7208_7210" id="e2_7276_7278" title="Defined at line 307">e2</a>) == <a href="#S_7228_7229" id="S_7283_7284" title="Defined at line 307">S</a>,
    <a href="#subtype_2578_2585" id="subtype_7290_7297" title="Defined at line 133">subtype</a>(<a href="#S_7228_7229" id="S_7298_7299" title="Defined at line 307">S</a>, <a href="#T_7226_7227" id="T_7301_7302" title="Defined at line 307">T</a>).

<span class="keyword">rules</span>

  <a href="#typeOfLVal_3148_3158" id="typeOfLVal_7315_7325" title="Defined at line 166">typeOfLVal</a>(s, <a href="../../src-gen/statix/signatures/Variables-sig.stx#Var2LValue_221_231" id="Var2LValue_7329_7339" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 18">Var2LValue</a>(<a href="../../src-gen/statix/signatures/Variables-sig.stx#Var_201_204" id="Var_7340_7343" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 17">Var</a>(x))) = T :-
    <a href="#typeOfVar_794_803" id="typeOfVar_7360_7369" title="Defined at line 52">typeOfVar</a>(<a href="#s_7326_7327" id="s_7370_7371" title="Defined at line 314">s</a>, <a href="#x_7344_7345" id="x_7373_7374" title="Defined at line 314">x</a>) == <a href="#T_7351_7352" id="T_7379_7380" title="Defined at line 314">T</a>.

  <a href="#typeOfExp_3018_3027" id="typeOfExp_7385_7394" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Variables-sig.stx#LValue2Exp_252_262" id="LValue2Exp_7398_7408" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 19">LValue2Exp</a>(lval)) = <a href="#typeOfLVal_3148_3158" id="typeOfLVal_7418_7428" title="Defined at line 166">typeOfLVal</a>(s, lval).

  <a href="#typeOfExp_3018_3027" id="typeOfExp_7442_7451" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Variables-sig.stx#LValue2Exp_252_262" id="LValue2Exp_7455_7465" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 19">LValue2Exp</a>(<a href="../../src-gen/statix/signatures/Variables-sig.stx#Var2LValue_221_231" id="Var2LValue_7466_7476" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 18">Var2LValue</a>(<a href="../../src-gen/statix/signatures/Variables-sig.stx#Var_201_204" id="Var_7477_7480" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 17">Var</a>(x)))) = <a href="#typeOfVar_794_803" id="typeOfVar_7489_7498" title="Defined at line 52">typeOfVar</a>(s, x).

<span class="keyword">rules</span> <span class="layout">// sequence</span>

  <a href="#typeOfSeq_3107_3116" id="typeOfSeq_7528_7537" title="Defined at line 165">typeOfSeq</a>(s, []) = <a href="#UNIT_2403_2407" id="UNIT_7547_7551" title="Defined at line 125">UNIT</a>().

  <a href="#typeOfSeq_3107_3116" id="typeOfSeq_7558_7567" title="Defined at line 165">typeOfSeq</a>(s, [e]) = T :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7587_7596" title="Defined at line 161">typeOfExp</a>(<a href="#s_7568_7569" id="s_7597_7598" title="Defined at line 325">s</a>, <a href="#e_7572_7573" id="e_7600_7601" title="Defined at line 325">e</a>) == <a href="#T_7578_7579" id="T_7606_7607" title="Defined at line 325">T</a>.

  <a href="#typeOfSeq_3107_3116" id="typeOfSeq_7612_7621" title="Defined at line 165">typeOfSeq</a>(s, [e | es@[_|_]]) = T :- {<a href="#S_7675_7676" id="S_7649_7650" title="Referenced at line 329">S</a>}
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7656_7665" title="Defined at line 161">typeOfExp</a>(<a href="#s_7622_7623" id="s_7666_7667" title="Defined at line 328">s</a>, <a href="#e_7626_7627" id="e_7669_7670" title="Defined at line 328">e</a>) == <a href="#S_7649_7650" id="S_7675_7676" title="Defined at line 328">S</a>,
    <a href="#typeOfSeq_3107_3116" id="typeOfSeq_7682_7691" title="Defined at line 165">typeOfSeq</a>(<a href="#s_7622_7623" id="s_7692_7693" title="Defined at line 328">s</a>, <a href="#es_7630_7632" id="es_7695_7697" title="Defined at line 328">es</a>) == <a href="#T_7643_7644" id="T_7702_7703" title="Defined at line 328">T</a>.

  <a href="#typeOfExp_3018_3027" id="typeOfExp_7708_7717" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Control-Flow-sig.stx#Seq_133_136" id="Seq_7721_7724" title="Defined at ../../src-gen/statix/signatures/Control-Flow-sig.stx line 15">Seq</a>(es)) = <a href="#typeOfSeq_3107_3116" id="typeOfSeq_7732_7741" title="Defined at line 165">typeOfSeq</a>(s, es).

  <a href="#typeOfExp_3018_3027" id="typeOfExp_7753_7762" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Control-Flow-sig.stx#If_160_162" id="If_7766_7768" title="Defined at ../../src-gen/statix/signatures/Control-Flow-sig.stx line 16">If</a>(e1, e2, e3)) = <a href="#lub_2944_2947" id="lub_7784_7787" title="Defined at line 155">lub</a>(T, S) :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7801_7810" title="Defined at line 161">typeOfExp</a>(<a href="#s_7763_7764" id="s_7811_7812" title="Defined at line 334">s</a>, <a href="#e1_7769_7771" id="e1_7814_7816" title="Defined at line 334">e1</a>) == <a href="#INT_2421_2424" id="INT_7821_7824" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7832_7841" title="Defined at line 161">typeOfExp</a>(<a href="#s_7763_7764" id="s_7842_7843" title="Defined at line 334">s</a>, <a href="#e2_7773_7775" id="e2_7845_7847" title="Defined at line 334">e2</a>) == <a href="#T_7788_7789" id="T_7852_7853" title="Defined at line 334">T</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7859_7868" title="Defined at line 161">typeOfExp</a>(<a href="#s_7763_7764" id="s_7869_7870" title="Defined at line 334">s</a>, <a href="#e3_7777_7779" id="e3_7872_7874" title="Defined at line 334">e3</a>) == <a href="#S_7791_7792" id="S_7879_7880" title="Defined at line 334">S</a>,
    <a href="#equitype_2839_2847" id="equitype_7886_7894" title="Defined at line 149">equitype</a>(<a href="#S_7791_7792" id="S_7895_7896" title="Defined at line 334">S</a>, <a href="#T_7788_7789" id="T_7898_7899" title="Defined at line 334">T</a>).

  <a href="#typeOfExp_3018_3027" id="typeOfExp_7905_7914" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Control-Flow-sig.stx#IfThen_192_198" id="IfThen_7918_7924" title="Defined at ../../src-gen/statix/signatures/Control-Flow-sig.stx line 17">IfThen</a>(e1, e2)) = <a href="#UNIT_2403_2407" id="UNIT_7936_7940" title="Defined at line 125">UNIT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7950_7959" title="Defined at line 161">typeOfExp</a>(<a href="#s_7915_7916" id="s_7960_7961" title="Defined at line 340">s</a>, <a href="#e1_7925_7927" id="e1_7963_7965" title="Defined at line 340">e1</a>) == <a href="#INT_2421_2424" id="INT_7970_7973" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_7981_7990" title="Defined at line 161">typeOfExp</a>(<a href="#s_7915_7916" id="s_7991_7992" title="Defined at line 340">s</a>, <a href="#e2_7929_7931" id="e2_7994_7996" title="Defined at line 340">e2</a>) == <a href="#UNIT_2403_2407" id="UNIT_8001_8005" title="Defined at line 125">UNIT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8012_8021" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Control-Flow-sig.stx#While_222_227" id="While_8025_8030" title="Defined at ../../src-gen/statix/signatures/Control-Flow-sig.stx line 18">While</a>(e1, e2)) = <a href="#UNIT_2403_2407" id="UNIT_8042_8046" title="Defined at line 125">UNIT</a>() :- {<a href="#s_loop_8069_8075" id="s_loop_8053_8059" title="Referenced at line 345, 345, 346, 347, 348">s_loop</a>}
    <span class="keyword">new</span> <a href="#s_loop_8053_8059" id="s_loop_8069_8075" title="Defined at line 344">s_loop</a>, <a href="#s_loop_8053_8059" id="s_loop_8077_8083" title="Defined at line 344">s_loop</a> -<a href="#P_538_539" id="P_8085_8086" title="Defined at line 33">P</a>-&gt; <a href="#s_8022_8023" id="s_8089_8090" title="Defined at line 344">s</a>,
    !<a href="#loop_690_694" id="loop_8097_8101" title="Defined at line 46">loop</a>[] <span class="keyword">in</span> <a href="#s_loop_8053_8059" id="s_loop_8107_8113" title="Defined at line 344">s_loop</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8119_8128" title="Defined at line 161">typeOfExp</a>(<a href="#s_loop_8053_8059" id="s_loop_8129_8135" title="Defined at line 344">s_loop</a>, <a href="#e1_8031_8033" id="e1_8137_8139" title="Defined at line 344">e1</a>) == <a href="#INT_2421_2424" id="INT_8144_8147" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8155_8164" title="Defined at line 161">typeOfExp</a>(<a href="#s_loop_8053_8059" id="s_loop_8165_8171" title="Defined at line 344">s_loop</a>, <a href="#e2_8035_8037" id="e2_8173_8175" title="Defined at line 344">e2</a>) == <a href="#UNIT_2403_2407" id="UNIT_8180_8184" title="Defined at line 125">UNIT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8191_8200" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Control-Flow-sig.stx#For_251_254" id="For_8204_8207" title="Defined at ../../src-gen/statix/signatures/Control-Flow-sig.stx line 19">For</a>(<a href="../../src-gen/statix/signatures/Variables-sig.stx#Var_201_204" id="Var_8208_8211" title="Defined at ../../src-gen/statix/signatures/Variables-sig.stx line 17">Var</a>(x), e1, e2, e3)) = <a href="#UNIT_2403_2407" id="UNIT_8231_8235" title="Defined at line 125">UNIT</a>() :- {<a href="#s_for_8257_8262" id="s_for_8242_8247" title="Referenced at line 351, 352, 353, 354, 357">s_for</a>}
    <span class="keyword">new</span> <a href="#s_for_8242_8247" id="s_for_8257_8262" title="Defined at line 350">s_for</a>,
    <a href="#s_for_8242_8247" id="s_for_8268_8273" title="Defined at line 350">s_for</a> -<a href="#P_538_539" id="P_8275_8276" title="Defined at line 33">P</a>-&gt; <a href="#s_8201_8202" id="s_8279_8280" title="Defined at line 350">s</a>,
    <a href="#declareVar_726_736" id="declareVar_8286_8296" title="Defined at line 50">declareVar</a>(<a href="#s_for_8242_8247" id="s_for_8297_8302" title="Defined at line 350">s_for</a>, <a href="#x_8212_8213" id="x_8304_8305" title="Defined at line 350">x</a>, <a href="#INT_2421_2424" id="INT_8307_8310" title="Defined at line 126">INT</a>()),
    !<a href="#loop_690_694" id="loop_8320_8324" title="Defined at line 46">loop</a>[] <span class="keyword">in</span> <a href="#s_for_8242_8247" id="s_for_8330_8335" title="Defined at line 350">s_for</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8341_8350" title="Defined at line 161">typeOfExp</a>(<a href="#s_8201_8202" id="s_8351_8352" title="Defined at line 350">s</a>, <a href="#e1_8216_8218" id="e1_8354_8356" title="Defined at line 350">e1</a>) == <a href="#INT_2421_2424" id="INT_8361_8364" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8372_8381" title="Defined at line 161">typeOfExp</a>(<a href="#s_8201_8202" id="s_8382_8383" title="Defined at line 350">s</a>, <a href="#e2_8220_8222" id="e2_8385_8387" title="Defined at line 350">e2</a>) == <a href="#INT_2421_2424" id="INT_8392_8395" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8403_8412" title="Defined at line 161">typeOfExp</a>(<a href="#s_for_8242_8247" id="s_for_8413_8418" title="Defined at line 350">s_for</a>, <a href="#e3_8224_8226" id="e3_8420_8422" title="Defined at line 350">e3</a>) == <a href="#UNIT_2403_2407" id="UNIT_8427_8431" title="Defined at line 125">UNIT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8438_8447" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Control-Flow-sig.stx#Break_290_295" id="Break_8451_8456" title="Defined at ../../src-gen/statix/signatures/Control-Flow-sig.stx line 20">Break</a>()) = <a href="#UNIT_2403_2407" id="UNIT_8462_8466" title="Defined at line 125">UNIT</a>() :-
    <span class="keyword">query</span> <a href="#loop_690_694" id="loop_8482_8486" title="Defined at line 46">loop</a>
      <span class="keyword">filter</span> <a href="#P_538_539" id="P_8500_8501" title="Defined at line 33">P</a>*
      <span class="keyword">min</span> $ &lt; <a href="#P_538_539" id="P_8517_8518" title="Defined at line 33">P</a>
       <span class="keyword">in</span> <a href="#s_8448_8449" id="s_8529_8530" title="Defined at line 359">s</a> |-&gt; [_].

<span class="keyword">rules</span> <span class="layout">// literals</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8562_8571" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Int_150_153" id="Int_8575_8578" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 16">Int</a>(i)) = <a href="#INT_2421_2424" id="INT_8585_8588" title="Defined at line 126">INT</a>() :-
    @<a href="#i_8579_8580" id="i_8599_8600" title="Defined at line 367">i</a>.lit := <a href="#i_8579_8580" id="i_8608_8609" title="Defined at line 367">i</a>.

<span class="keyword">rules</span> <span class="layout">// operators</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8634_8643" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Uminus_176_182" id="Uminus_8647_8653" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 17">Uminus</a>(e)) = <a href="#INT_2421_2424" id="INT_8660_8663" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8673_8682" title="Defined at line 161">typeOfExp</a>(<a href="#s_8644_8645" id="s_8683_8684" title="Defined at line 372">s</a>, <a href="#e_8654_8655" id="e_8686_8687" title="Defined at line 372">e</a>) == <a href="#INT_2421_2424" id="INT_8692_8695" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8702_8711" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Divide_229_235" id="Divide_8715_8721" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 19">Divide</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_8733_8736" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8746_8755" title="Defined at line 161">typeOfExp</a>(<a href="#s_8712_8713" id="s_8756_8757" title="Defined at line 375">s</a>, <a href="#e1_8722_8724" id="e1_8759_8761" title="Defined at line 375">e1</a>) == <a href="#INT_2421_2424" id="INT_8766_8769" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8777_8786" title="Defined at line 161">typeOfExp</a>(<a href="#s_8712_8713" id="s_8787_8788" title="Defined at line 375">s</a>, <a href="#e2_8726_8728" id="e2_8790_8792" title="Defined at line 375">e2</a>) == <a href="#INT_2421_2424" id="INT_8797_8800" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8807_8816" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Times_200_205" id="Times_8820_8825" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 18">Times</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_8837_8840" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8850_8859" title="Defined at line 161">typeOfExp</a>(<a href="#s_8817_8818" id="s_8860_8861" title="Defined at line 379">s</a>, <a href="#e1_8826_8828" id="e1_8863_8865" title="Defined at line 379">e1</a>) == <a href="#INT_2421_2424" id="INT_8870_8873" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8881_8890" title="Defined at line 161">typeOfExp</a>(<a href="#s_8817_8818" id="s_8891_8892" title="Defined at line 379">s</a>, <a href="#e2_8830_8832" id="e2_8894_8896" title="Defined at line 379">e2</a>) == <a href="#INT_2421_2424" id="INT_8901_8904" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_8911_8920" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Minus_287_292" id="Minus_8924_8929" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 21">Minus</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_8941_8944" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8954_8963" title="Defined at line 161">typeOfExp</a>(<a href="#s_8921_8922" id="s_8964_8965" title="Defined at line 383">s</a>, <a href="#e1_8930_8932" id="e1_8967_8969" title="Defined at line 383">e1</a>) == <a href="#INT_2421_2424" id="INT_8974_8977" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_8985_8994" title="Defined at line 161">typeOfExp</a>(<a href="#s_8921_8922" id="s_8995_8996" title="Defined at line 383">s</a>, <a href="#e2_8934_8936" id="e2_8998_9000" title="Defined at line 383">e2</a>) == <a href="#INT_2421_2424" id="INT_9005_9008" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9015_9024" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Plus_259_263" id="Plus_9028_9032" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 20">Plus</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9044_9047" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9057_9066" title="Defined at line 161">typeOfExp</a>(<a href="#s_9025_9026" id="s_9067_9068" title="Defined at line 387">s</a>, <a href="#e1_9033_9035" id="e1_9070_9072" title="Defined at line 387">e1</a>) == <a href="#INT_2421_2424" id="INT_9077_9080" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9088_9097" title="Defined at line 161">typeOfExp</a>(<a href="#s_9025_9026" id="s_9098_9099" title="Defined at line 387">s</a>, <a href="#e2_9037_9039" id="e2_9101_9103" title="Defined at line 387">e2</a>) == <a href="#INT_2421_2424" id="INT_9108_9111" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9118_9127" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Eq_316_318" id="Eq_9131_9133" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 22">Eq</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9145_9148" title="Defined at line 126">INT</a>() :- {<a href="#T_9184_9185" id="T_9155_9156" title="Referenced at line 392, 394">T</a> <a href="#S_9211_9212" id="S_9157_9158" title="Referenced at line 393, 394">S</a>}
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9164_9173" title="Defined at line 161">typeOfExp</a>(<a href="#s_9128_9129" id="s_9174_9175" title="Defined at line 391">s</a>, <a href="#e1_9134_9136" id="e1_9177_9179" title="Defined at line 391">e1</a>) == <a href="#T_9155_9156" id="T_9184_9185" title="Defined at line 391">T</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9191_9200" title="Defined at line 161">typeOfExp</a>(<a href="#s_9128_9129" id="s_9201_9202" title="Defined at line 391">s</a>, <a href="#e2_9138_9140" id="e2_9204_9206" title="Defined at line 391">e2</a>) == <a href="#S_9157_9158" id="S_9211_9212" title="Defined at line 391">S</a>,
    <a href="#equitype_2839_2847" id="equitype_9218_9226" title="Defined at line 149">equitype</a>(<a href="#T_9155_9156" id="T_9227_9228" title="Defined at line 391">T</a>, <a href="#S_9157_9158" id="S_9230_9231" title="Defined at line 391">S</a>).
    <span class="layout">// TODO: does Eq work for all types?</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9278_9287" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Neq_342_345" id="Neq_9291_9294" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 23">Neq</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9306_9309" title="Defined at line 126">INT</a>() :- {<a href="#T_9345_9346" id="T_9316_9317" title="Referenced at line 398, 400">T</a> <a href="#S_9372_9373" id="S_9318_9319" title="Referenced at line 399, 400">S</a>}
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9325_9334" title="Defined at line 161">typeOfExp</a>(<a href="#s_9288_9289" id="s_9335_9336" title="Defined at line 397">s</a>, <a href="#e1_9295_9297" id="e1_9338_9340" title="Defined at line 397">e1</a>) == <a href="#T_9316_9317" id="T_9345_9346" title="Defined at line 397">T</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9352_9361" title="Defined at line 161">typeOfExp</a>(<a href="#s_9288_9289" id="s_9362_9363" title="Defined at line 397">s</a>, <a href="#e2_9299_9301" id="e2_9365_9367" title="Defined at line 397">e2</a>) == <a href="#S_9318_9319" id="S_9372_9373" title="Defined at line 397">S</a>,
    <a href="#equitype_2839_2847" id="equitype_9379_9387" title="Defined at line 149">equitype</a>(<a href="#T_9316_9317" id="T_9388_9389" title="Defined at line 397">T</a>, <a href="#S_9318_9319" id="S_9391_9392" title="Defined at line 397">S</a>).
    <span class="layout">// TODO: does Neq work for all types?</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9440_9449" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Gt_369_371" id="Gt_9453_9455" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 24">Gt</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9467_9470" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9480_9489" title="Defined at line 161">typeOfExp</a>(<a href="#s_9450_9451" id="s_9490_9491" title="Defined at line 403">s</a>, <a href="#e1_9456_9458" id="e1_9493_9495" title="Defined at line 403">e1</a>) == <a href="#INT_2421_2424" id="INT_9500_9503" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9511_9520" title="Defined at line 161">typeOfExp</a>(<a href="#s_9450_9451" id="s_9521_9522" title="Defined at line 403">s</a>, <a href="#e2_9460_9462" id="e2_9524_9526" title="Defined at line 403">e2</a>) == <a href="#INT_2421_2424" id="INT_9531_9534" title="Defined at line 126">INT</a>().
    <span class="layout">// TODO: does Gt work for more types?</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9583_9592" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Lt_395_397" id="Lt_9596_9598" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 25">Lt</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9610_9613" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9623_9632" title="Defined at line 161">typeOfExp</a>(<a href="#s_9593_9594" id="s_9633_9634" title="Defined at line 408">s</a>, <a href="#e1_9599_9601" id="e1_9636_9638" title="Defined at line 408">e1</a>) == <a href="#INT_2421_2424" id="INT_9643_9646" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9654_9663" title="Defined at line 161">typeOfExp</a>(<a href="#s_9593_9594" id="s_9664_9665" title="Defined at line 408">s</a>, <a href="#e2_9603_9605" id="e2_9667_9669" title="Defined at line 408">e2</a>) == <a href="#INT_2421_2424" id="INT_9674_9677" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9684_9693" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Geq_421_424" id="Geq_9697_9700" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 26">Geq</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9712_9715" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9725_9734" title="Defined at line 161">typeOfExp</a>(<a href="#s_9694_9695" id="s_9735_9736" title="Defined at line 412">s</a>, <a href="#e1_9701_9703" id="e1_9738_9740" title="Defined at line 412">e1</a>) == <a href="#INT_2421_2424" id="INT_9745_9748" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9756_9765" title="Defined at line 161">typeOfExp</a>(<a href="#s_9694_9695" id="s_9766_9767" title="Defined at line 412">s</a>, <a href="#e2_9705_9707" id="e2_9769_9771" title="Defined at line 412">e2</a>) == <a href="#INT_2421_2424" id="INT_9776_9779" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9786_9795" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Leq_448_451" id="Leq_9799_9802" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 27">Leq</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9814_9817" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9827_9836" title="Defined at line 161">typeOfExp</a>(<a href="#s_9796_9797" id="s_9837_9838" title="Defined at line 416">s</a>, <a href="#e1_9803_9805" id="e1_9840_9842" title="Defined at line 416">e1</a>) == <a href="#INT_2421_2424" id="INT_9847_9850" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9858_9867" title="Defined at line 161">typeOfExp</a>(<a href="#s_9796_9797" id="s_9868_9869" title="Defined at line 416">s</a>, <a href="#e2_9807_9809" id="e2_9871_9873" title="Defined at line 416">e2</a>) == <a href="#INT_2421_2424" id="INT_9878_9881" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9888_9897" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#Or_502_504" id="Or_9901_9903" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 29">Or</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_9915_9918" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9928_9937" title="Defined at line 161">typeOfExp</a>(<a href="#s_9898_9899" id="s_9938_9939" title="Defined at line 420">s</a>, <a href="#e1_9904_9906" id="e1_9941_9943" title="Defined at line 420">e1</a>) == <a href="#INT_2421_2424" id="INT_9948_9951" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_9959_9968" title="Defined at line 161">typeOfExp</a>(<a href="#s_9898_9899" id="s_9969_9970" title="Defined at line 420">s</a>, <a href="#e2_9908_9910" id="e2_9972_9974" title="Defined at line 420">e2</a>) == <a href="#INT_2421_2424" id="INT_9979_9982" title="Defined at line 126">INT</a>().

  <a href="#typeOfExp_3018_3027" id="typeOfExp_9989_9998" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Numbers-sig.stx#And_475_478" id="And_10002_10005" title="Defined at ../../src-gen/statix/signatures/Numbers-sig.stx line 28">And</a>(e1, e2)) = <a href="#INT_2421_2424" id="INT_10017_10020" title="Defined at line 126">INT</a>() :-
    <a href="#typeOfExp_3018_3027" id="typeOfExp_10030_10039" title="Defined at line 161">typeOfExp</a>(<a href="#s_9999_10000" id="s_10040_10041" title="Defined at line 424">s</a>, <a href="#e1_10006_10008" id="e1_10043_10045" title="Defined at line 424">e1</a>) == <a href="#INT_2421_2424" id="INT_10050_10053" title="Defined at line 126">INT</a>(),
    <a href="#typeOfExp_3018_3027" id="typeOfExp_10061_10070" title="Defined at line 161">typeOfExp</a>(<a href="#s_9999_10000" id="s_10071_10072" title="Defined at line 424">s</a>, <a href="#e2_10010_10012" id="e2_10074_10076" title="Defined at line 424">e2</a>) == <a href="#INT_2421_2424" id="INT_10081_10084" title="Defined at line 126">INT</a>().

<span class="keyword">rules</span> <span class="layout">// record type</span>

  <a href="#typeOfType_4807_4817" id="typeOfType_10113_10123" title="Defined at line 223">typeOfType</a>(s, <a href="../../src-gen/statix/signatures/Records-sig.stx#RecordTy_208_216" id="RecordTy_10127_10135" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 19">RecordTy</a>(fields)) = <a href="#RECORD_2475_2481" id="RECORD_10147_10153" title="Defined at line 129">RECORD</a>(s_rec) :-
    <span class="keyword">new</span> <a href="#s_rec_10154_10159" id="s_rec_10172_10177" title="Defined at line 430">s_rec</a>,
    <a href="#fieldsOk_10248_10256" id="fieldsOk_10183_10191" title="Defined at line 435">fieldsOk</a>(<a href="#s_rec_10154_10159" id="s_rec_10192_10197" title="Defined at line 430">s_rec</a>, <a href="#s_10124_10125" id="s_10199_10200" title="Defined at line 430">s</a>, <a href="#fields_10136_10142" id="fields_10202_10208" title="Defined at line 430">fields</a>).

  <a href="#fieldOk_10262_10269" id="fieldOk_10214_10221" title="Referenced at line 435, 437, 534">fieldOk</a> : <span class="keyword">scope</span> * <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Records-sig.stx#Field_85_90" id="Field_10240_10245" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 9">Field</a>
  <a href="#fieldsOk_10183_10191" id="fieldsOk_10248_10256" title="Referenced at line 432">fieldsOk</a> <span class="keyword">maps</span> <a href="#fieldOk_10214_10221" id="fieldOk_10262_10269" title="Defined at line 434">fieldOk</a>(*, *, <span class="keyword">list</span>(*))

  <a href="#fieldOk_10214_10221" id="fieldOk_10288_10295" title="Defined at line 434">fieldOk</a>(s_rec, s_outer, <a href="../../src-gen/statix/signatures/Records-sig.stx#Field_243_248" id="Field_10312_10317" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 20">Field</a>(x, t)) :- {<a href="#T_10367_10368" id="T_10329_10330" title="Referenced at line 438, 439">T</a>}
    <a href="#typeOfType_4807_4817" id="typeOfType_10336_10346" title="Defined at line 223">typeOfType</a>(<a href="#s_outer_10303_10310" id="s_outer_10347_10354" title="Defined at line 437">s_outer</a>, <a href="../../src-gen/statix/signatures/Types-sig.stx#Tid_157_160" id="Tid_10356_10359" title="Defined at ../../src-gen/statix/signatures/Types-sig.stx line 16">Tid</a>(<a href="#t_10321_10322" id="t_10360_10361" title="Defined at line 437">t</a>)) == <a href="#T_10329_10330" id="T_10367_10368" title="Defined at line 437">T</a>,
    <a href="#declareField_1663_1675" id="declareField_10374_10386" title="Defined at line 93">declareField</a>(<a href="#s_rec_10296_10301" id="s_rec_10387_10392" title="Defined at line 437">s_rec</a>, <a href="#x_10318_10319" id="x_10394_10395" title="Defined at line 437">x</a>, <a href="#T_10329_10330" id="T_10397_10398" title="Defined at line 437">T</a>).

<span class="keyword">rules</span> <span class="layout">// literals</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_10423_10432" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Records-sig.stx#NilExp_272_278" id="NilExp_10436_10442" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 21">NilExp</a>()) = <a href="#NIL_2457_2460" id="NIL_10448_10451" title="Defined at line 128">NIL</a>().

<span class="keyword">rules</span> <span class="layout">// record creation</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_10484_10493" title="Defined at line 161">typeOfExp</a>(s, e@<a href="../../src-gen/statix/signatures/Records-sig.stx#Record_289_295" id="Record_10499_10505" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 22">Record</a>(t, inits)) = <a href="#RECORD_2475_2481" id="RECORD_10519_10525" title="Defined at line 129">RECORD</a>(s_rec) :- {<a href="#s_init_10600_10606" id="s_init_10537_10543" title="Referenced at line 449, 450, 453">s_init</a> <a href="#ds_10676_10678" id="ds_10544_10546" title="Referenced at line 451, 452, 453">ds</a>}
    <a href="#typeOfType_4807_4817" id="typeOfType_10552_10562" title="Defined at line 223">typeOfType</a>(<a href="#s_10494_10495" id="s_10563_10564" title="Defined at line 447">s</a>, <a href="../../src-gen/statix/signatures/Types-sig.stx#Tid_157_160" id="Tid_10566_10569" title="Defined at ../../src-gen/statix/signatures/Types-sig.stx line 16">Tid</a>(<a href="#t_10506_10507" id="t_10570_10571" title="Defined at line 447">t</a>)) == <a href="#RECORD_2475_2481" id="RECORD_10577_10583" title="Defined at line 129">RECORD</a>(<a href="#s_rec_10526_10531" id="s_rec_10584_10589" title="Defined at line 447">s_rec</a>),
    <span class="keyword">new</span> <a href="#s_init_10537_10543" id="s_init_10600_10606" title="Defined at line 447">s_init</a>,
    <a href="#initsOk_10963_10970" id="initsOk_10612_10619" title="Defined at line 463">initsOk</a>(<a href="#s_10494_10495" id="s_10620_10621" title="Defined at line 447">s</a>, <a href="#s_rec_10526_10531" id="s_rec_10623_10628" title="Defined at line 447">s_rec</a>, <a href="#s_init_10537_10543" id="s_init_10630_10636" title="Defined at line 447">s_init</a>, <a href="#inits_10509_10514" id="inits_10638_10643" title="Defined at line 447">inits</a>),
    <a href="#lookupAllFields_1753_1768" id="lookupAllFields_10650_10665" title="Defined at line 95">lookupAllFields</a>(<a href="#s_rec_10526_10531" id="s_rec_10666_10671" title="Defined at line 447">s_rec</a>) == <a href="#ds_10544_10546" id="ds_10676_10678" title="Defined at line 447">ds</a>,
    <a href="#fieldsSameLength_10758_10774" id="fieldsSameLength_10684_10700" title="Defined at line 456">fieldsSameLength</a>(<a href="#ds_10544_10546" id="ds_10701_10703" title="Defined at line 447">ds</a>, <a href="#inits_10509_10514" id="inits_10705_10710" title="Defined at line 447">inits</a>),
    <a href="#allFieldsInitialized_11222_11242" id="allFieldsInitialized_10717_10737" title="Defined at line 472">allFieldsInitialized</a>(<a href="#t_10506_10507" id="t_10738_10739" title="Defined at line 447">t</a>, <a href="#ds_10544_10546" id="ds_10741_10743" title="Defined at line 447">ds</a>, <a href="#s_init_10537_10543" id="s_init_10745_10751" title="Defined at line 447">s_init</a>).


  <a href="#fieldsSameLength_10684_10700" id="fieldsSameLength_10758_10774" title="Referenced at line 452, 457, 458, 458">fieldsSameLength</a> : <span class="keyword">list</span>((<span class="keyword">path</span> * (<a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_10791_10793" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * <a href="#TYPE_2379_2383" id="TYPE_10796_10800" title="Defined at line 123">TYPE</a>))) * <span class="keyword">list</span>(<a href="../../src-gen/statix/signatures/Records-sig.stx#InitField_95_104" id="InitField_10811_10820" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 10">InitField</a>)
  <a href="#fieldsSameLength_10758_10774" id="fieldsSameLength_10824_10840" title="Defined at line 456">fieldsSameLength</a>([],[]).
  <a href="#fieldsSameLength_10758_10774" id="fieldsSameLength_10851_10867" title="Defined at line 456">fieldsSameLength</a>([_|xs], [_|ys]) :- <a href="#fieldsSameLength_10758_10774" id="fieldsSameLength_10887_10903" title="Defined at line 456">fieldsSameLength</a>(<a href="#xs_10871_10873" id="xs_10904_10906" title="Defined at line 458">xs</a>, <a href="#ys_10879_10881" id="ys_10908_10910" title="Defined at line 458">ys</a>).



  <a href="#initOk_10976_10982" id="initOk_10918_10924" title="Referenced at line 463, 465, 520">initOk</a> : <span class="keyword">scope</span> * <span class="keyword">scope</span> * <span class="keyword">scope</span> * <a href="../../src-gen/statix/signatures/Records-sig.stx#InitField_95_104" id="InitField_10951_10960" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 10">InitField</a>
  <a href="#initsOk_10612_10619" id="initsOk_10963_10970" title="Referenced at line 450">initsOk</a> <span class="keyword">maps</span> <a href="#initOk_10918_10924" id="initOk_10976_10982" title="Defined at line 462">initOk</a>(*, *, *, <span class="keyword">list</span>(*))

  <a href="#initOk_10918_10924" id="initOk_11004_11010" title="Defined at line 462">initOk</a>(s, s_rec, s_init, <a href="../../src-gen/statix/signatures/Records-sig.stx#InitField_330_339" id="InitField_11029_11038" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 23">InitField</a>(x, e)) :- {<a href="#S_11110_11111" id="S_11050_11051" title="Referenced at line 467, 468, 469">S</a> <a href="#T_11084_11085" id="T_11052_11053" title="Referenced at line 466, 469">T</a>}
    <a href="#typeOfField_1803_1814" id="typeOfField_11059_11070" title="Defined at line 96">typeOfField</a>(<a href="#s_rec_11014_11019" id="s_rec_11071_11076" title="Defined at line 465">s_rec</a>, <a href="#x_11039_11040" id="x_11078_11079" title="Defined at line 465">x</a>) == <a href="#T_11052_11053" id="T_11084_11085" title="Defined at line 465">T</a>,
    <a href="#typeOfExp_3018_3027" id="typeOfExp_11091_11100" title="Defined at line 161">typeOfExp</a>(<a href="#s_11011_11012" id="s_11101_11102" title="Defined at line 465">s</a>, <a href="#e_11042_11043" id="e_11104_11105" title="Defined at line 465">e</a>) == <a href="#S_11050_11051" id="S_11110_11111" title="Defined at line 465">S</a>,
    <a href="#declareField_1663_1675" id="declareField_11117_11129" title="Defined at line 93">declareField</a>(<a href="#s_init_11021_11027" id="s_init_11130_11136" title="Defined at line 465">s_init</a>, <a href="#x_11039_11040" id="x_11138_11139" title="Defined at line 465">x</a>, <a href="#S_11050_11051" id="S_11141_11142" title="Defined at line 465">S</a>),
    <a href="#subtype_2578_2585" id="subtype_11149_11156" title="Defined at line 133">subtype</a>(<a href="#S_11050_11051" id="S_11157_11158" title="Defined at line 465">S</a>, <a href="#T_11052_11053" id="T_11160_11161" title="Defined at line 465">T</a>).

  <a href="#fieldInitialized_11248_11264" id="fieldInitialized_11167_11183" title="Referenced at line 472, 474">fieldInitialized</a> : <a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_11186_11188" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * (<span class="keyword">path</span> * (<a href="../../src-gen/statix/signatures/Base-sig.stx#ID_104_106" id="ID_11200_11202" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 13">ID</a> * <a href="#TYPE_2379_2383" id="TYPE_11205_11209" title="Defined at line 123">TYPE</a>)) * <span class="keyword">scope</span>
  <a href="#allFieldsInitialized_10717_10737" id="allFieldsInitialized_11222_11242" title="Referenced at line 453">allFieldsInitialized</a> <span class="keyword">maps</span> <a href="#fieldInitialized_11167_11183" id="fieldInitialized_11248_11264" title="Defined at line 471">fieldInitialized</a>(*, <span class="keyword">list</span>(*), *)

  <a href="#fieldInitialized_11167_11183" id="fieldInitialized_11283_11299" title="Defined at line 471">fieldInitialized</a>(t, (_, (x, _)), s) :-
    <a href="#lookupField_1703_1714" id="lookupField_11326_11337" title="Defined at line 94">lookupField</a>(<a href="#s_11316_11317" id="s_11338_11339" title="Defined at line 474">s</a>, <a href="#x_11308_11309" id="x_11341_11342" title="Defined at line 474">x</a>) == [_].
    <span class="layout">// t is passed such that error is displayed be on t;</span>
    <span class="layout">// noting that init of x is missing</span>

<span class="keyword">rules</span> <span class="layout">// record field access</span>

  <a href="#typeOfLVal_3148_3158" id="typeOfLVal_11482_11492" title="Defined at line 166">typeOfLVal</a>(s, <a href="../../src-gen/statix/signatures/Records-sig.stx#FieldVar_368_376" id="FieldVar_11496_11504" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 24">FieldVar</a>(lval, x)) = T :- {<a href="#s_rec_11564_11569" id="s_rec_11523_11528" title="Referenced at line 482, 483">s_rec</a>}
    <a href="#typeOfLVal_3148_3158" id="typeOfLVal_11534_11544" title="Defined at line 166">typeOfLVal</a>(<a href="#s_11493_11494" id="s_11545_11546" title="Defined at line 481">s</a>, <a href="#lval_11505_11509" id="lval_11548_11552" title="Defined at line 481">lval</a>) == <a href="#RECORD_2475_2481" id="RECORD_11557_11563" title="Defined at line 129">RECORD</a>(<a href="#s_rec_11523_11528" id="s_rec_11564_11569" title="Defined at line 481">s_rec</a>),
    <a href="#typeOfField_1803_1814" id="typeOfField_11576_11587" title="Defined at line 96">typeOfField</a>(<a href="#s_rec_11523_11528" id="s_rec_11588_11593" title="Defined at line 481">s_rec</a>, <a href="#x_11511_11512" id="x_11595_11596" title="Defined at line 481">x</a>) == <a href="#T_11517_11518" id="T_11601_11602" title="Defined at line 481">T</a>.

<span class="keyword">rules</span> <span class="layout">// literals</span>

  <a href="#typeOfExp_3018_3027" id="typeOfExp_11626_11635" title="Defined at line 161">typeOfExp</a>(s, <a href="../../src-gen/statix/signatures/Strings-sig.stx#String_171_177" id="String_11639_11645" title="Defined at ../../src-gen/statix/signatures/Strings-sig.stx line 17">String</a>(v)) = <a href="#STRING_2439_2445" id="STRING_11652_11658" title="Defined at line 127">STRING</a>() :-
    @<a href="#v_11646_11647" id="v_11669_11670" title="Defined at line 487">v</a>.lit := <a href="#v_11646_11647" id="v_11678_11679" title="Defined at line 487">v</a>.

<span class="keyword">rules</span>

  <a href="#init_178_182" id="init_11691_11695" title="Referenced at line 12, 494">init</a> : <span class="keyword">scope</span>

  <a href="#init_11691_11695" id="init_11707_11711" title="Defined at line 492">init</a>(s) :-
    <a href="#declareType_1251_1262" id="declareType_11722_11733" title="Defined at line 74">declareType</a>(<a href="#s_11712_11713" id="s_11734_11735" title="Defined at line 494">s</a>, "int",    <a href="#INT_2421_2424" id="INT_11747_11750" title="Defined at line 126">INT</a>()),
    <a href="#declareType_1251_1262" id="declareType_11759_11770" title="Defined at line 74">declareType</a>(<a href="#s_11712_11713" id="s_11771_11772" title="Defined at line 494">s</a>, "string", <a href="#STRING_2439_2445" id="STRING_11784_11790" title="Defined at line 127">STRING</a>()),

    <a href="#declareVar_726_736" id="declareVar_11800_11810" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_11811_11812" title="Defined at line 494">s</a>,  "print",     <a href="#FUN_2536_2539" id="FUN_11828_11831" title="Defined at line 131">FUN</a>([<a href="#STRING_2439_2445" id="STRING_11833_11839" title="Defined at line 127">STRING</a>()], <a href="#UNIT_2403_2407" id="UNIT_11844_11848" title="Defined at line 125">UNIT</a>())),
    <a href="#declareVar_726_736" id="declareVar_11858_11868" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_11869_11870" title="Defined at line 494">s</a>,  "chr",       <a href="#FUN_2536_2539" id="FUN_11886_11889" title="Defined at line 131">FUN</a>([<a href="#INT_2421_2424" id="INT_11891_11894" title="Defined at line 126">INT</a>()], <a href="#STRING_2439_2445" id="STRING_11899_11905" title="Defined at line 127">STRING</a>())),
    <a href="#declareVar_726_736" id="declareVar_11915_11925" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_11926_11927" title="Defined at line 494">s</a>,  "ord",       <a href="#FUN_2536_2539" id="FUN_11943_11946" title="Defined at line 131">FUN</a>([<a href="#STRING_2439_2445" id="STRING_11948_11954" title="Defined at line 127">STRING</a>()], <a href="#INT_2421_2424" id="INT_11959_11962" title="Defined at line 126">INT</a>())),
    <a href="#declareVar_726_736" id="declareVar_11972_11982" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_11983_11984" title="Defined at line 494">s</a>,  "size",      <a href="#FUN_2536_2539" id="FUN_12000_12003" title="Defined at line 131">FUN</a>([<a href="#STRING_2439_2445" id="STRING_12005_12011" title="Defined at line 127">STRING</a>()], <a href="#INT_2421_2424" id="INT_12016_12019" title="Defined at line 126">INT</a>())),
    <a href="#declareVar_726_736" id="declareVar_12029_12039" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12040_12041" title="Defined at line 494">s</a>,  "substring", <a href="#FUN_2536_2539" id="FUN_12057_12060" title="Defined at line 131">FUN</a>([<a href="#STRING_2439_2445" id="STRING_12062_12068" title="Defined at line 127">STRING</a>(), <a href="#INT_2421_2424" id="INT_12072_12075" title="Defined at line 126">INT</a>(), <a href="#INT_2421_2424" id="INT_12079_12082" title="Defined at line 126">INT</a>()], <a href="#STRING_2439_2445" id="STRING_12087_12093" title="Defined at line 127">STRING</a>())),
    <a href="#declareVar_726_736" id="declareVar_12103_12113" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12114_12115" title="Defined at line 494">s</a>,  "concat",    <a href="#FUN_2536_2539" id="FUN_12131_12134" title="Defined at line 131">FUN</a>([<a href="#STRING_2439_2445" id="STRING_12136_12142" title="Defined at line 127">STRING</a>(), <a href="#STRING_2439_2445" id="STRING_12146_12152" title="Defined at line 127">STRING</a>()], <a href="#STRING_2439_2445" id="STRING_12157_12163" title="Defined at line 127">STRING</a>())),
    <a href="#declareVar_726_736" id="declareVar_12173_12183" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12184_12185" title="Defined at line 494">s</a>,  "not",       <a href="#FUN_2536_2539" id="FUN_12201_12204" title="Defined at line 131">FUN</a>([<a href="#INT_2421_2424" id="INT_12206_12209" title="Defined at line 126">INT</a>()], <a href="#INT_2421_2424" id="INT_12214_12217" title="Defined at line 126">INT</a>())),
    <a href="#declareVar_726_736" id="declareVar_12227_12237" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12238_12239" title="Defined at line 494">s</a>,  "exit",      <a href="#FUN_2536_2539" id="FUN_12255_12258" title="Defined at line 131">FUN</a>([<a href="#INT_2421_2424" id="INT_12260_12263" title="Defined at line 126">INT</a>()], <a href="#UNIT_2403_2407" id="UNIT_12268_12272" title="Defined at line 125">UNIT</a>())),
    <a href="#declareVar_726_736" id="declareVar_12282_12292" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12293_12294" title="Defined at line 494">s</a>,  "getchar",   <a href="#FUN_2536_2539" id="FUN_12310_12313" title="Defined at line 131">FUN</a>([], <a href="#STRING_2439_2445" id="STRING_12318_12324" title="Defined at line 127">STRING</a>())),
    <a href="#declareVar_726_736" id="declareVar_12334_12344" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12345_12346" title="Defined at line 494">s</a>,  "flush",     <a href="#FUN_2536_2539" id="FUN_12362_12365" title="Defined at line 131">FUN</a>([], <a href="#UNIT_2403_2407" id="UNIT_12370_12374" title="Defined at line 125">UNIT</a>())),
    <a href="#declareVar_726_736" id="declareVar_12384_12394" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12395_12396" title="Defined at line 494">s</a>,  "printi",    <a href="#FUN_2536_2539" id="FUN_12412_12415" title="Defined at line 131">FUN</a>([<a href="#INT_2421_2424" id="INT_12417_12420" title="Defined at line 126">INT</a>()], <a href="#UNIT_2403_2407" id="UNIT_12425_12429" title="Defined at line 125">UNIT</a>())),

    <span class="layout">// For benchmarks</span>
    <a href="#declareVar_726_736" id="declareVar_12462_12472" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12473_12474" title="Defined at line 494">s</a>,  "timeGo",    <a href="#FUN_2536_2539" id="FUN_12490_12493" title="Defined at line 131">FUN</a>([], <a href="#UNIT_2403_2407" id="UNIT_12498_12502" title="Defined at line 125">UNIT</a>())),
    <a href="#declareVar_726_736" id="declareVar_12512_12522" title="Defined at line 50">declareVar</a>(<a href="#s_11712_11713" id="s_12523_12524" title="Defined at line 494">s</a>,  "timeStop",  <a href="#FUN_2536_2539" id="FUN_12540_12543" title="Defined at line 131">FUN</a>([], <a href="#UNIT_2403_2407" id="UNIT_12548_12552" title="Defined at line 125">UNIT</a>())).



<span class="keyword">rules</span> <span class="layout">// placeholders</span>

  <a href="#programOk_118_127" id="programOk_12586_12595" title="Defined at line 9">programOk</a>(<a href="../../src-gen/statix/signatures/Tiger-sig.stx#Module-Plhdr_399_411" id="Module-Plhdr_12596_12608" title="Defined at ../../src-gen/statix/signatures/Tiger-sig.stx line 23">Module-Plhdr</a>()).

  <a href="#initOk_10918_10924" id="initOk_12616_12622" title="Defined at line 462">initOk</a>(_, _, _, <a href="../../src-gen/statix/signatures/Records-sig.stx#InitField-Plhdr_149_164" id="InitField-Plhdr_12632_12647" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 14">InitField-Plhdr</a>()).

  <span class="layout">//declareField(_, TypeId-Plhdr(), T).</span>

  <a href="#typeOfLVal_3148_3158" id="typeOfLVal_12696_12706" title="Defined at line 166">typeOfLVal</a>(_, <a href="../../src-gen/statix/signatures/Base-sig.stx#LValue-Plhdr_176_188" id="LValue-Plhdr_12710_12722" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 18">LValue-Plhdr</a>()) = T.

  <a href="#decOk_3411_3416" id="decOk_12734_12739" title="Defined at line 179">decOk</a>(_, _, <a href="../../src-gen/statix/signatures/Base-sig.stx#Dec-Plhdr_136_145" id="Dec-Plhdr_12746_12755" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 16">Dec-Plhdr</a>()).

  <a href="#typeOfType_4807_4817" id="typeOfType_12763_12773" title="Defined at line 223">typeOfType</a>(_, <a href="../../src-gen/statix/signatures/Base-sig.stx#Type-Plhdr_202_212" id="Type-Plhdr_12777_12787" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 19">Type-Plhdr</a>()) = T.

  <a href="#typeOfArg_5799_5808" id="typeOfArg_12799_12808" title="Defined at line 254">typeOfArg</a>(_, _, <a href="../../src-gen/statix/signatures/Functions-sig.stx#FArg-Plhdr_112_122" id="FArg-Plhdr_12815_12825" title="Defined at ../../src-gen/statix/signatures/Functions-sig.stx line 12">FArg-Plhdr</a>()) = T.

  <span class="layout">//fieldInitialized(TypeId-Plhdr(), _, _).</span>

  <a href="#fieldOk_10214_10221" id="fieldOk_12882_12889" title="Defined at line 434">fieldOk</a>(_, _, <a href="../../src-gen/statix/signatures/Records-sig.stx#Field-Plhdr_125_136" id="Field-Plhdr_12896_12907" title="Defined at ../../src-gen/statix/signatures/Records-sig.stx line 13">Field-Plhdr</a>()).

  <a href="#typeOfExp_3018_3027" id="typeOfExp_12915_12924" title="Defined at line 161">typeOfExp</a>(_, <a href="../../src-gen/statix/signatures/Base-sig.stx#Exp-Plhdr_156_165" id="Exp-Plhdr_12928_12937" title="Defined at ../../src-gen/statix/signatures/Base-sig.stx line 17">Exp-Plhdr</a>()) = T.

</code></pre></td></tr></tbody></table></div>