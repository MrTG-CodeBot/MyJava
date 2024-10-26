# Input & Print Utility Classes

## Overview
This Java project provides utility classes for user input and printing various data types to the console. The `input` class includes methods for capturing user input of different types, while the `print` class provides methods for printing various data types.

## Compilation and Execution

**Note**: First, compile the `print.java` file, before compiling the other files to avoid any errors.

### Compilation Instructions
1. Navigate to the directory containing the files.
2. Compile the `print.java` file:
    ```sh
    javac print.java
    ```
3. Compile the `input.java` file:
    ```sh
    javac input.java
    ```

**Project Documentation:**

A samll documentation for this project is available in the [Docs](https://github.com/MrTG-CodeBot/MyJava/blob/main/myJava/Docs.html) <= [Download](https://github.com/MrTG-CodeBot/MyJava/blob/main/myJava/Docs.html). 
1. Just download it and open file explorer then open the Docs.html file in chrome or Microsoft Edge.
2. You can view it directly in your browser.



### Example Usage
Here is a sample for how to use it:

```java
public class Main {
    public static void main(String[] args) {
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

## 🌐 contact me:
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/mrtg_coder)
[![Telegram](https://img.shields.io/badge/Telegram-blue?logo=telegram)](https://t.me/MrTG_Coder)

## License

Licensed under [GNU General Public License v3.0](https://github.com/MrTG-CodeBot/MyJava/blob/main/LICENSE) for details check it now.
