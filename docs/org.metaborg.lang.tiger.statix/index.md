---
hide:
  -toc
---

# Tiger

[metaborgcube/metaborg-tiger/org.metaborg.lang.tiger.statix]

[metaborgcube/metaborg-tiger/org.metaborg.lang.tiger.statix]: https://github.com/metaborgcube/metaborg-tiger/tree/master/org.metaborg.lang.tiger.statix "The original language project on GitHub"

From the [_Tiger Language Reference Manual_](https://www.cs.columbia.edu/~sedwards/classes/2002/w4115/tiger.pdf):

> This document describes the Tiger language defined in Andrew Appel’s book
[_Modern Compiler Implementation in Java_](https://www.cs.princeton.edu/~appel/modern/java/)
(Cambridge University Press, 1998).

> The Tiger language is a small, imperative language with integer and string variables,
arrays, records, and nested functions.
Its syntax resembles some functional languages.

## Syntax

[`syntax/Tiger.sdf3`](syntax/Tiger.sdf3.md)

The syntax of Tiger is specified in [SDF3].

## Name binding

[`trans/static-semantics.stx`](trans/static-semantics.stx.md)

The name binding of Tiger is specified in [Statix].

[NaBL]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/nabl.html
[NaBL2]: https://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/index.html
[SDF3]: https://spoofax.dev/references/sdf3/
[Statix]: https://spoofax.dev/references/statix/
[MetaBorgCube]: https://github.com/MetaBorgCube
[Tiger]: https://github.com/MetaBorgCube/metaborg-tiger
