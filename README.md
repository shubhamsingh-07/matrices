# Character Pattern Printer (Java)

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A small Java console program that prints a rectangular pattern using a character selected by the user. Despite the repository name, the current implementation prints repeated symbols; it does not perform matrix arithmetic.

## Features

- Accept the number of rows.
- Accept the number of columns.
- Accept a character to use in the pattern.
- Print a rectangle of the chosen character.

## Project Structure

```text
matrices/
└── MiniProject6.java
```

## Compile and Run

```bash
javac MiniProject6.java
java MiniProject6
```

Provide row and column counts, then the character to display.

## Concepts Practiced

- Reading integers and characters with `Scanner`.
- Nested `for` loops.
- Terminal output.

## Limitations and Improvements

Row and column counts are not validated, so non-positive values may produce empty output. The source prints a leading blank line before each row. Consider renaming the project to match its current behavior or extending it to perform matrix operations.

## License

Licensed under the MIT License. See [LICENSE](LICENSE).
