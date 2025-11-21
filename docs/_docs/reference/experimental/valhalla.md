---
layout: doc-page
title: "Valhalla Value Classes and Traits"
nightlyOf: https://docs.scala-lang.org/scala3/reference/experimental/valhalla.html
---

## Valhalla Value Classes

Valhalla value classes are the Scala equivalence of Java's Project Valhalla's value classes (see [JEP 401](https://openjdk.org/jeps/401)). Valhalla value classes differ from the current Scala value classes by allowing more than one field. Valhalla value classes behave almost the same as regular classes, except that they do not have identity. Two valhalla value classes are equal when their fields are the same.

Valhalla value classes extend AnyVal and have a `valhalla` annotation.

```scala
import scala.annotation.valhalla

@valhalla class ValhallaValueClass extends AnyVal:
  val x: Int = 4
  val y: Int = 5
```

Valhalla value classes are implicitly final and cannot be extended unless it is abstract. Its fields are immutable and cannot be lazy.

Valhalla value classes can extend AnyVal, Valhalla traits, or abstract valhalla value classes.

## Valhalla Traits

Valhalla Traits are Universal Traits (traits that extend Any) with a `valhalla` annotation.

Like Valhalla value classes, any Valhalla trait must have immutable fields only.

Valhalla traits can extend Any, other Valhalla traits, or abstract Valhalla value classes.

There is no restriction on what types can extend Valhalla traits.

```scala
import scala.annotation.valhalla

@valhalla trait ValhallaTrait extends Any:
  val x: Int = 4
  val y: Int = 5
```

## Using Explicit Self with Valhalla

```scala
import scala.annotation.valhalla

@valhalla abstract class Animal(val cuteness: Int) extends AnyVal

@valhalla trait Mammal extends Any:
  this: Animal =>
    val hasFur: Bool = true

@valhalla class Pig extends AnyVal with Mammal with Animal
```

Valhalla traits can have self-type of either Valhalla abstract classes and Valhalla traits.

## CanEqual with Valhalla

Valhalla value classes can be null, so the CanEqual of `null` and a valhalla value class returns `true`.