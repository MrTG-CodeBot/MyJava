# Print Utility Class

## Overview
This Java class provides static methods to print various data types to the console. It offers a convenient way to print integers, strings, floats, doubles, longs, chars, and booleans.

## Class Methods
The `print` class includes the following static methods:

- `i(int i_ids)`: Prints an integer value.
- `s(String s_names)`: Prints a string value.
- `f(float f_float)`: Prints a float value.
- `d(double d_double)`: Prints a double value.
- `l(long l_long)`: Prints a long value.
- `c(char c_char)`: Prints a char value.
- `b(boolean b_boolean)`: Prints a boolean value.

## Usage
To use this class, simply call the desired method and pass the appropriate value.

### Example

```java
public class Main {
    public static void main(String[] args) {
        print.i(123); // Prints: 123
        print.s("Hello World"); // Prints: Hello World
        print.f(3.14f); // Prints: 3.14
        print.d(2.718); // Prints: 2.718
        print.l(123456789L); // Prints: 123456789
        print.c('A'); // Prints: A
        print.b(true); // Prints: true
    }
}
