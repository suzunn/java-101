# Java 101 Exercises

I use this repository to keep small, console-based exercises from my Java fundamentals practice. Each source file is a standalone program with its own `main` method, so examples can be compiled and run independently.

## Topics covered

The exercises under `src/Odevler` cover:

- basic input and output with `Scanner`;
- arithmetic calculations such as VAT, taxi fares, body mass index, and hypotenuse length;
- conditional logic for grades, dates, zodiac signs, authentication, and ticket pricing;
- `switch` statements in the calculator and menu-based examples;
- loops for powers, combinations, harmonic series, Armstrong numbers, and console patterns.

## Repository layout

```text
.
|-- README.md
|-- java101.iml
`-- src/
    `-- Odevler/
        |-- hesapmakinesi.java
        |-- kombinasyon.java
        |-- ucakbileti.java
        `-- ...
```

`java101.iml` contains the IntelliJ IDEA module configuration. The Java sources themselves do not depend on IntelliJ and can also be run from a terminal.

## Running an exercise

Install a JDK and confirm that `java` and `javac` are available:

```bash
java -version
javac -version
```

From the repository root, compile an exercise into a temporary output directory and run it using its package-qualified class name. For example:

```bash
javac -encoding UTF-8 -d out src/Odevler/hesapmakinesi.java
java -cp out Odevler.hesapmakinesi
```

Replace `hesapmakinesi` with the exercise you want to run. Delete the generated `out` directory when finished; compiled classes are intentionally not tracked.

## Learning notes

These programs are practice snapshots rather than a single production application. I keep each exercise focused on one Java concept, which makes the repository useful for reviewing syntax and comparing different control-flow approaches. When extending an exercise, I preserve its standalone entry point and keep generated IDE or compiler output out of version control.
