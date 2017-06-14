# lms-intrinsics: Intel Intrinsics for Lightweight Modular Staging Framework (LMS)

`lms-intrinsics` is a package that enables the use of SIMD x86 instructions in the [Lightweight Modular Staging Framework (LMS)](https://scala-lms.github.io/). While most SIMD instruction are available as a low-level machine code, the `lms-intrinsics` package focuses on the C SIMD instrinsics, which are supported by most modern C compilers such as [gcc](https://gcc.gnu.org/), [Intel Compiler](https://software.intel.com/en-us/intel-compilers), [LLVM](http://llvm.org/), etc, and provides the appropriate generation of a vectorized C code. Currently the following instruction sets are supported:


- MMX
- SSE / SSE2 / SSE3 / SSSE3 / SSE4.1 / SSE4.2
- AVX / AVX2
- FMA
- AVX-512
- KNC
- SVML

While the same set of instructions are also available on other x86 CPUs, the focus of `lms-intrinsics` is mainly towards Intel supported intrinsics, with the aim to include all listed intrinsics in the [Intel Intrinsics Guide](https://software.intel.com/sites/landingpage/IntrinsicsGuide/). Hopefully, this work will inspire the inclusion of other instruction sets and extensions such as [NEON](https://developer.arm.com/technologies/neon/intrinsics) and others in LMS. 

This implementation of `lms-intrinsics` is work done by [Ivaylo Toskov](https://github.com/ivtoskov) as part of a master thesis project at the [Department of Computer Science](https://www.inf.ethz.ch/) at [ETH Zurich](https://www.ethz.ch/en.html) Switzerland, supervised by [Alen Stojanov](https://astojanov.github.io/) and [Markus Püschel](https://www.inf.ethz.ch/personal/markusp/). 

# Usage - SBT

`lms-intrinsics` can be used though [SBT](http://www.scala-sbt.org/) directly, just include the following in your `build.sbt` file: 

```Scala
resolvers += Resolver.sonatypeRepo("snapshots")

// support for unsigned primives in Scala
libraryDependencies += "ch.ethz.acl" %% "scala-unsigned" % "0.1-SNAPSHOT"

// the main lms-intrinsics package
libraryDependencies += "ch.ethz.acl" %% "lms-intrinsics" % "0.0.1-SNAPSHOT"
```
If you like to use the latest version of the `lms-intrinsics` GitHub repository, add project dependency in your `Build.scala` file:

```Scala
.dependsOn(RootProject(uri("https://github.com/ivtoskov/lms-intrinsics")))
```

Note that the `lms-intrinsics` package contains the definition of more than 5000 Intel Intrinsics and other SIMD functions, therefore compilation time with Scala can be quite substential.


# Quick Start

A minimal example of the intrinsics is available in the [lms-intrinsics-example](https://github.com/ivtoskov/lms-intrinsics-example) repository.


# Contribution policy

Contributions via GitHub pull requests are gladly accepted from their original author. 

# License

This code is open source software licensed under the [Apache 2.0 License](https://www.apache.org/licenses/LICENSE-2.0.html). Feel free to use it accordingly.