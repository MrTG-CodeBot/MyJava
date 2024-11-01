class math {

    /**
     * Adds the number of int values.
     *
     * @param numbers The numbers to add.
     *
     * @return The sum of the numbers.
     */

    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Adds the number of float values.
     *
     * @param numbers The numbers to add.
     *
     * @return The sum of the numbers.
     */

    public static float add(float... numbers) {
        float fsum = 0;
        for (float fnumber : numbers) {
            fsum += fnumber;
        }
        return fsum;
    }

    /**
     * Adds the number of double values.
     *
     * @param numbers The numbers to add.
     *
     * @return The sum of the numbers.
     */

    public static double add(double... numbers) {
        double dsum = 0;
        for (double dnumber : numbers) {
            dsum += dnumber;
        }
        return dsum;
    }

    /**
     * Subtracts the number of int values.
     *
     * @param numbers The numbers to subtract.
     *
     * @return The result of the subtraction.
     *
     * @throws IllegalArgumentException If no numbers are provided.
     */

    public static int sub(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }
        int intresult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            intresult -= numbers[i];
        }
        return intresult;
    }

    /**
     * Subtracts the number of float values.
     *
     * @param numbers The numbers to subtract.
     *
     * @return The result of the subtraction.
     *
     * @throws IllegalArgumentException If no numbers are provided.
     */

    public static float sub(float... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }
        float floatresult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            floatresult -= numbers[i];
        }
        return floatresult;
    }

    /**
     * Subtracts the number of double values.
     *
     * @param numbers The numbers to subtract.
     *
     * @return The result of the subtraction.
     *
     * @throws IllegalArgumentException If no numbers are provided.
     */

    public static double sub(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }
        double doubleresult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            doubleresult -= numbers[i];
        }
        return doubleresult;
    }

    /**
     * Multiples two int values.
     *
     * @param numbers The multiply.
     *
     * @return The result of the multiplication.
     *
     * @throws IllegalArgumentException If args is only one number.
     */

    public static int multi(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }
        int intresult = 1;
        for (int number : numbers) {
            intresult *= number;
        }
        return intresult;
    }

    /**
     * Multiples two float values.
     *
     * @param numbers The multiply.
     *
     * @return The result of the multiplication.
     *
     * @throws IllegalArgumentException If args is only one number.
     */

    public static float multi(float... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }
        float floatresult = 1;
        for (float number : numbers) {
            floatresult *= number;
        }
        return floatresult;
    }

    /**
     * Multiples two double values.
     *
     * @param numbers The multiply.
     *
     * @return The result of the multiplication.
     *
     * @throws IllegalArgumentException If args is only one number.
     */

    public static double multi(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }
        double doubleresult = 1;
        for (double number : numbers) {
            doubleresult *= number;
        }
        return doubleresult;
    }

    /**
     * Divides two int values.
     *
     * @param numerator The dividend.
     * @param denominator The divisor.
     *
     * @return The result of the division.
     *
     * @throws ArithmeticException If the denominator is zero.
     */

    public static int div(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }

    /**
     * Divides two float values.
     *
     * @param numerator The dividend.
     * @param denominator The divisor.
     *
     * @return The result of the division.
     *
     * @throws ArithmeticException If the denominator is zero.
     */

    public static float div(float numerator, float denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (float) numerator / denominator;
    }

    /**
     * Divides two double values.
     *
     * @param numerator The dividend.
     * @param denominator The divisor.
     *
     * @return The result of the division.
     *
     * @throws ArithmeticException If the denominator is zero.
     */

    public static double div(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

    /** Checks that the given number is even.
     *
     *
     * @param number datatype: int
     * @return true if the number is even, false otherwise
     **/

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /** Checks that the given number is even.
     *
     *
     * @param number datatype: float
     * @return true if the number is even, false otherwise
     **/

    public static boolean isEven(float number) {
        return number % 2 == 0;
    }

    /** Checks that the given number is even.
     *
     *
     * @param number datatype: double
     * @return true if the number is even, false otherwise
     **/

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    /** Checks that the given number is odd.
     *
     *
     * @param number datatype: int
     * @return true if the number is odd, false otherwise
     **/

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    /** Checks that the given number is odd.
     *
     *
     * @param number datatype: float
     * @return true if the number is odd, false otherwise
     **/

    public static boolean isOdd(float number) {
        return number % 2 != 0;
    }

    /** Checks that the given number is odd.
     *
     *
     * @param number datatype: double
     * @return true if the number is odd, false otherwise
     **/

    public static boolean isOdd(double number) {
        return number % 2 != 0;
    }

        public static boolean isPass(int number, int target_number){
        if (number >= target_number) {
            return true;
        }
        return false;
    }

    /** Checks that the student is pass or fail.
     *
     *
     * @param number datatype: float
     * @param target_number datatype: float
     * @return true if the number is greater than or equal to target_number, false otherwise
     **/

    public static boolean isPass(float number, float target_number){
        if (number >= target_number) {
            return true;
        }
        return false;
    }

    /** Checks that the student is pass or fail.
     *
     *
     * @param number datatype: double
     * @param target_number datatype: double
     * @return true if the number is greater than or equal to target_number, false otherwise
     **/

    public static boolean isPass(double number, double target_number){
        if (number >= target_number) {
            return true;
        }
        return false;
    }

    /** Checks that the student is fail or pass.
     *
     *
     * @param number datatype: int
     * @param target_number datatype: int
     * @return false if the number is greater than or equal to target_number, true otherwise
     **/

    public static boolean isFail(int number, int target_number){
        if (number >= target_number) {
            return false;
        }
        return true;
    }

    /** Checks that the student is fail or pass.
     *
     *
     * @param number datatype: float
     * @param target_number datatype: float
     * @return false if the number is greater than or equal to target_number, true otherwise
     **/

    public static boolean isFail(float number, float target_number){
        if (number >= target_number) {
            return false;
        }
        return true;
    }

    /** Checks that the student is fail or pass.
     *
     *
     * @param number datatype: double
     * @param target_number datatype: double
     * @return false if the number is greater than or equal to target_number, true otherwise
     **/

    public static boolean isFail(double number, double target_number){
        if (number >= target_number) {
            return false;
        }
        return true;
    }

}
