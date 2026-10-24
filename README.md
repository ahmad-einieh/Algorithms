# Java Algorithm Exercises

A collection of standalone Java algorithm and dynamic-programming exercises with built-in example inputs.

## Topics

- Binomial coefficients and Fibonacci numbers.
- Longest common, increasing, decreasing, and contiguous odd subsequences.
- Maximum contiguous sum and maximum product subarray.
- A weighted interval-scheduling experiment.

## Compile and run

Use a Java JDK with `var` support (Java 10+; project IDE configuration uses JDK 17). From the repository directory:

```bash
javac -d out src/*.java
java -cp out Binomial
java -cp out LongestCommonSubsequence
```

Each exercise has its own source/class; choose its entry point rather than looking for a single application menu. `Binomial` prints the sample coefficient for `(4, 2)`. Edit a class's sample values to explore other inputs.

Class/file spellings match the originals, including `LongestIncreasingSubsequance`, `MaxContigousSum`, and `WightedIntervalSechedualing`.

## Notes

These are study implementations rather than a tested algorithm library. Input bounds, empty inputs, integer overflow, and correctness vary by exercise. The weighted interval example also declares job finish time `static`, so separate jobs do not retain independent finish values.

Source lives in [`src/`](src/). No external dependencies or Maven/Gradle build are required; comprehensive algorithm/runtime checks were not performed for this documentation refresh.
