
# Input & Print Utility Classes

## Overview
This Java project provides utility classes for user input and printing various data types to the console. The `input` class includes methods for capturing user input of different types, while the `print` class provides methods for printing various data types.

## Compilation and Execution

**Note**: visit this for the compilation and execution [`click`](https://github.com/MrTG-CodeBot/MyJava/blob/main/README.md#compilation-and-execution) 


### Example Usage
Here is a sample for how to use it:

```java
class sampleio {
    public static void main(String[] args) {
        
        //input the String value
        String name = io.inputS("what is your name: ");
        io.print(name + "\n");

        //input the int value
        int id = io.inputI("what is your id: ");
        io.print(id + "\n");

        //input the double value
        double mark = io.inputD("what is your mark: ");
        io.print(mark + "\n");

        //input the float value
        float weight = io.inputF("what is your weight: ");
        io.print(weight + "\n");

        //input the char value
        char char_enter = io.inputC("what is your character: ");
        io.print(char_enter + "\n");

        //input the boolean value
        boolean tr_fa = io.inputB("Are you a boy: ");
        io.print(tr_fa + "\n");

    }
}

```

