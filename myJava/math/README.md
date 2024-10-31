# math Utility Class

## Overview
This Java class provides a set of static methods for performing basic arithmetic operations and checking numerical properties such as even or odd.

## Usage
To use this class, simply include the `math` class in your Java project and call the static methods as needed.

## Compilation and Execution

**Note**: visit this for the compilation and execution [`click`](https://github.com/MrTG-CodeBot/MyJava/blob/main/README.md#compilation-and-execution) 



```java
public class Main {
    public static void main(String args[]) {
        int sum = math.add(1, 2, 3);
        float fsum = math.add(1.0f, 2.0f, 3.0f);
        double dsum = math.add(1.0, 2.0, 3.0);

        int difference = math.sub(10, 3);
        float fdifference = math.sub(10.0f, 3.0f);
        double ddifference = math.sub(10.0, 3.0);

        int multiplication = math.multi(10, 10);
        float fmultiplication = math.multi(10.0f, 10.0f);
        double dmultiplication = math.multi(10.0, 10.0);

        int division = math.div(10, 10);
        float fdivision = math.div(10.0f, 10.0f);
        double ddivision = math.div(10.0, 10.0);

        boolean iseven = math.isEven(4);
        boolean isodd = math.isOdd(5);

        print.s("Sum: " + sum + "\n");
        print.s("Float Sum: " + fsum + "\n");
        print.s("Double Sum: " + dsum + "\n");
        print.s("Difference: " + difference + "\n");
        print.s("Float Difference: " + fdifference + "\n");
        print.s("Double Difference: " + ddifference + "\n");
        print.s("Multiplication: " + multiplication + "\n");
        print.s("Double Multiplication: " + dmultiplication + "\n");
        print.s("Float Multiplication: " + fmultiplication + "\n");
        print.s("Division: " + division + "\n");
        print.s("Float Division: " + fdivision + "\n");
        print.s("Division: " + ddivision + "\n");
        print.s("Is Even: " + iseven + "\n");
        print.s("Is Odd: " + isodd + "\n");
    }
}
```
