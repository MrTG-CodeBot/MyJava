# Math Utility Library

## Overview
This Java library provides a set of static methods for performing basic arithmetic operations and checking numerical properties such as even or odd.

## Methods

### Addition
- `public static int add(int... numbers)`
  - Adds a series of integer values.
  - **Parameters**: `numbers` - The integers to add.
  - **Returns**: The sum of the integers.

- `public static float add(float... numbers)`
  - Adds a series of float values.
  - **Parameters**: `numbers` - The floats to add.
  - **Returns**: The sum of the floats.

- `public static double add(double... numbers)`
  - Adds a series of double values.
  - **Parameters**: `numbers` - The doubles to add.
  - **Returns**: The sum of the doubles.

### Subtraction
- `public static int sub(int... numbers)`
  - Subtracts a series of integer values.
  - **Parameters**: `numbers` - The integers to subtract.
  - **Returns**: The result of the subtraction.
  - **Throws**: `IllegalArgumentException` if no numbers are provided.

- `public static float sub(float... numbers)`
  - Subtracts a series of float values.
  - **Parameters**: `numbers` - The floats to subtract.
  - **Returns**: The result of the subtraction.
  - **Throws**: `IllegalArgumentException` if no numbers are provided.

- `public static double sub(double... numbers)`
  - Subtracts a series of double values.
  - **Parameters**: `numbers` - The doubles to subtract.
  - **Returns**: The result of the subtraction.
  - **Throws**: `IllegalArgumentException` if no numbers are provided.

### Multiplication
- `public static int multi(int... numbers)`
  - Multiplies a series of integer values.
  - **Parameters**: `numbers` - The integers to multiply.
  - **Returns**: The result of the multiplication.
  - **Throws**: `IllegalArgumentException` if no numbers are provided.

- `public static float multi(float... numbers)`
  - Multiplies a series of float values.
  - **Parameters**: `numbers` - The floats to multiply.
  - **Returns**: The result of the multiplication.
  - **Throws**: `IllegalArgumentException` if no numbers are provided.

- `public static double multi(double... numbers)`
  - Multiplies a series of double values.
  - **Parameters**: `numbers` - The doubles to multiply.
  - **Returns**: The result of the multiplication.
  - **Throws**: `IllegalArgumentException` if no numbers are provided.

### Division
- `public static int div(int numerator, int denominator)`
  - Divides an integer by another integer.
  - **Parameters**: `numerator` - The dividend, `denominator` - The divisor.
  - **Returns**: The result of the division.
  - **Throws**: `ArithmeticException` if the denominator is zero.

- `public static float div(float numerator, float denominator)`
  - Divides a float by another float.
  - **Parameters**: `numerator` - The dividend, `denominator` - The divisor.
  - **Returns**: The result of the division.
  - **Throws**: `ArithmeticException` if the denominator is zero.

- `public static double div(double numerator, double denominator)`
  - Divides a double by another double.
  - **Parameters**: `numerator` - The dividend, `denominator` - The divisor.
  - **Returns**: The result of the division.
  - **Throws**: `ArithmeticException` if the denominator is zero.

### Even/Odd Checks
- `public static boolean isEven(int number)`
  - Checks if an integer is even.
  - **Parameters**: `number` - The integer to check.
  - **Returns**: `true` if the integer is even, `false` otherwise.

- `public static boolean isEven(float number)`
  - Checks if a float is even.
  - **Parameters**: `number` - The float to check.
  - **Returns**: `true` if the float is even, `false` otherwise.

- `public static boolean isEven(double number)`
  - Checks if a double is even.
  - **Parameters**: `number` - The double to check.
  - **Returns**: `true` if the double is even, `false` otherwise.

- `public static boolean isOdd(int number)`
  - Checks if an integer is odd.
  - **Parameters**: `number` - The integer to check.
  - **Returns**: `true` if the integer is odd, `false` otherwise.

- `public static boolean isOdd(float number)`
  - Checks if a float is odd.
  - **Parameters**: `number` - The float to check.
  - **Returns**: `true` if the float is odd, `false` otherwise.

- `public static boolean isOdd(double number)`
  - Checks if a double is odd.
  - **Parameters**: `number` - The double to check.
  - **Returns**: `true` if the double is odd, `false` otherwise.

## Usage
To use this library, simply include the `math` class in your Java project and call the static methods as needed.

```java
public class Main {
    public static void main(String[] args) {
        int sum = math.add(1, 2, 3);
        float fsum = math.add(1.0f, 2.0f, 3.0f);
        double dsum = math.add(1.0, 2.0, 3.0);
        
        int difference = math.sub(10, 3);
        float fdifference = math.sub(10.0f, 3.0f);
        double ddifference = math.sub(10.0, 3.0);

        boolean isEven = math.isEven(4);
        boolean isOdd = math.isOdd(5);

        System.out.println("Sum: " + sum);
        System.out.println("Float Sum: " + fsum);
        System.out.println("Double Sum: " + dsum);
        System.out.println("Difference: " + difference);
        System.out.println("Float Difference: " + fdifference);
        System.out.println("Double Difference: " + ddifference);
        System.out.println("Is Even: " + isEven);
        System.out.println("Is Odd: " + isOdd);
    }
}
```
