---
layout: doc-page
title: "Valhalla Value Classes and Traits"
---

## Valhalla Value Classes

Valhalla value classes are the Scala equivalence of Java's Project Valhalla's value classes (see [JEP 401](https://openjdk.org/jeps/401)). Valhalla value classes differ from the current Scala value classes by allowing more than one field. Valhalla value classes behave almost the same as regular classes, except that they do not have identity. Two valhalla value classes are equal when their fields are the same.

Valhalla value classes extend AnyVal and have a `valhalla` annotation.

```scala
import scala.annotation.valhalla

@valhalla class ValhallaValueClass(val x: Int, val y: Int) extends AnyVal:
  def addX(a: Int): Int = a + x
```

Valhalla value classes are implicitly final and cannot be extended unless it is abstract.

Valhalla value classes cannot have fields in its body. All its fields have to be declared in its constructor and must be final.

Valhalla value classes can extend AnyVal, Valhalla traits, or abstract valhalla value classes.

Valhalla value classes may not have secondary constructors.

## Valhalla Traits

Valhalla Traits are Universal Traits (traits that extend `Any`) with a `valhalla` annotation.

Like Valhalla value classes, any Valhalla trait must have immutable fields declared in its constructor only.

Valhalla traits can extend `Any` or other Valhalla traits.

There is no restriction on what types can extend Valhalla traits.

```scala
import scala.annotation.valhalla

@valhalla trait ValhallaTrait(val x: Int, val y: Int) extends Any
```

## Using Value Classes

Use the `--Yvalue-classes` compiler option when compiling value classes in the scala compiler

## Getting Started

1. Install the Project Valhalla JVM at https://jdk.java.net/valhalla/ or alternative clone the source code at https://github.com/openjdk/valhalla.

2. Download the scala compiler.

3. Run `sbt scala-library-nonbootstrapped/publishLocal` to use the local library that includes the value class annotation.

4. Run `sbt`

4. To compile the code, inside the sbt terminal, run
```
scalac -cp library/target/scala-library-nonbootstrapped/scala-library-3.8.1-RC1-bin-SNAPSHOT-nonbootstrapped.jar -d your/output/directory --Yvalue-classes path/to/your/files
```

5. To run the program, run
```
java -cp library/target/scala-library-nonbootstrapped/scala-library-3.8.1-RC1-bin-SNAPSHOT-nonbootstrapped.jar:your/output/directory --enable-preview Main
```
where java is from Project Valhalla.

6. To see a generated classfile, run
```
javap -c -v -p your/class/file
```

Alternatively, if you do not wish to see any class files, you can run ./test_script.sh to remove the generated class files after program execution.

## Testing

To run the valhalla value class test suite, in the `sbt` terminal, run
```testOnly * -- *checkValhallaValueClasses```

## Using Explicit Self with Valhalla

```scala
import scala.annotation.valhalla

@valhalla trait Animal(val cuteness: Int) extends AnyVal

@valhalla trait Mammal extends Any:
  this: Animal =>
    def introduction = println("I am a mammal")

@valhalla class Pig(cuteness: Int) extends AnyVal with Mammal with Animal(cuteness)
```

Valhalla traits can have self-type of either Valhalla abstract classes and Valhalla traits.

## CanEqual with Valhalla

Valhalla value classes can be null, so the CanEqual of `null` and a valhalla value class returns `true`.
