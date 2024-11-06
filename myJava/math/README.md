# math Utility Class

## Overview
This Java class provides a set of static methods for performing basic arithmetic operations and checking numerical properties such as even or odd.

## Usage
To use this class, simply include the `math` class in your Java project and call the static methods as needed.

## Compilation and Execution

**Note**: visit this for the compilation and execution [`click`](https://github.com/MrTG-CodeBot/MyJava/blob/main/README.md#compilation-and-execution) 



```java
class samplemath {
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

        boolean ipass = math.isPass(60, 28);
        boolean fpass = math.isPass(60f, 28f);
        boolean dpass = math.isPass(60.0, 28.0);

        boolean ifail = math.isFail(24, 28);
        boolean ffail = math.isFail(60f, 28f);
        boolean dfail = math.isFail(60.0, 28.0);

        io.print("Sum: " + sum + "\n");
        io.print("Float Sum: " + fsum + "\n");
        io.print("Double Sum: " + dsum + "\n");
        
        io.print("Difference: " + difference + "\n");
        io.print("Float Difference: " + fdifference + "\n");
        io.print("Double Difference: " + ddifference + "\n");
        
        io.print("Multiplication: " + multiplication + "\n");
        io.print("Double Multiplication: " + dmultiplication + "\n");
        io.print("Float Multiplication: " + fmultiplication + "\n");
        
        io.print("Division: " + division + "\n");
        io.print("Float Division: " + fdivision + "\n");
        io.print("Division: " + ddivision + "\n");
        
        io.print("Is Even: " + iseven + "\n");
        io.print("Is Odd: " + isodd + "\n");
        

        if (ipass) {
            io.print("You are passed, congrats\n");
        }
        else{
           io.print("You are not passed, " + math.sub(60, 5) + " marks for to win the exam.\n");
        }
        

        if (ifail) {
            io.print("You are not passed, " + math.sub(28, 24) + " marks for to win the exam.\n");
        }
        else{
            io.print("You are passed, congrats\n");
        }

        int num = 5;
        long result = math.factorial(num);
        io.print(result);
        
    }
}
```
