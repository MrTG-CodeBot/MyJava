
# Input & Print Utility Classes

## Overview
This Java project provides utility classes for user input and printing various data types to the console. The `input` class includes methods for capturing user input of different types, while the `print` class provides methods for printing various data types.

## Compilation and Execution

**Note**: First, compile the [`print.java`](https://github.com/MrTG-CodeBot/MyJava/blob/main/myJava/Base/print.java) file, before compiling the other files to avoid any errors.

### Compilation Instructions
1. Navigate to the directory containing your java program files.
2. Compile the [`print.java`](https://github.com/MrTG-CodeBot/MyJava/blob/main/myJava/Base/print.java) file:
    ```sh
    javac print.java
    ```
3. Compile the [`input.java`](https://github.com/MrTG-CodeBot/MyJava/blob/main/myJava/Base/input.java) file:
    ```sh
    javac input.java
    ```


### Example Usage
Here is a sample for how to use it:

```java
public class Main {
    public static void main(String args[]) {
        int number = input.i("Enter an integer: ");
        print.i(number); // Prints: entered integer

        String text = input.s("Enter a string: ");
        print.s(text); // Prints: entered string

        float decimal = input.f("Enter a float: ");
        print.f(decimal); // Prints: entered float

        double bigDecimal = input.d("Enter a double: ");
        print.d(bigDecimal); // Prints: entered double

        long largeNumber = input.l("Enter a long: ");
        print.l(largeNumber); // Prints: entered long

        char character = input.c("Enter a char: ");
        print.c(character); // Prints: entered char

        boolean truthValue = input.b("Enter a boolean: ");
        print.b(truthValue); // Prints: entered boolean
    }
}
```

