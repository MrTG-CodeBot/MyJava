import java.util.Scanner;

public class io {

    /**
     * Prints the given integer value to the console.
     *
     * @param i_ids The integer value to be printed.
     */
    public static void print(int i_ids) {
        System.out.print(i_ids);
    }

    /**
     * Prints the given string value to the console.
     *
     * @param s_names The string value to be printed.
     */
    public static void print(String s_names) {
        System.out.print(s_names);
    }

    /**
     * Prints the given float value to the console.
     *
     * @param f_float The float value to be printed.
     */
    public static void print(float f_float) {
        System.out.print(f_float);
    }

    /**
     * Prints the given double value to the console.
     *
     * @param d_double The double value to be printed.
     */
    public static void print(double d_double) {
        System.out.print(d_double);
    }

    /**
     * Prints the given long value to the console.
     *
     * @param l_long The long value to be printed.
     */
    public static void print(long l_long) {
        System.out.print(l_long);
    }

    /**
     * Prints the given character value to the console.
     *
     * @param c_char The character value to be printed.
     */
    public static void print(char c_char) {
        System.out.print(c_char);
    }

    /**
     * Prints the given boolean value to the console.
     *
     * @param b_boolean The boolean value to be printed.
     */
    public static void print(boolean b_boolean) {
        System.out.print(b_boolean);
    }

    /**
     * Prompts the user for an integer value and returns it.
     *
     * @param prompt The message to display to the user before input.
     * @return The integer value entered by the user.
     */
    public static int inputI(String prompt) {
        Scanner scan = new Scanner(System.in);
        print(prompt);
        return scan.nextInt();
    }

    /**
     * Prompts the user for a string value and returns it.
     *
     *  @param prompt The message to display to the user before input.
     * @return The string value entered by the user.
     */
    public static String inputS(String prompt) {
        Scanner scan = new Scanner(System.in);
        print(prompt);
        return scan.nextLine();
    }

    /**
     * Prompts the user for a float value and returns it.
     *
     * @param prompt The message to display to the user before input.
     * @return The float value entered by the user.
     */
    public static float inputF(String prompt) {
        Scanner scan_float = new Scanner(System.in);
        print(prompt);
        return scan_float.nextFloat();
    }

    /**
     * Prompts the user for a double value and returns it.
     *
     * @param prompt The message to display to the user before input.
     * @return The double value entered by the user.
     */
    public static double inputD(String prompt) {
        Scanner scan_double = new Scanner(System.in);
        print(prompt);
        return scan_double.nextDouble();
    }

    /**
     * Prompts the user for a long value and returns it.
     *
     * @param prompt The message to display to the user before input.
     * @return The long value entered by the user.
     */
    public static long inputL(String prompt) {
        Scanner scan_long = new Scanner(System.in);
        print(prompt);
        return scan_long.nextLong();
    }

    /**
     * Prompts the user for a long value and returns it.
     *
     * @param prompt The message to display to the user before input.
     * @return The char value entered by the user.
     */
    public static char inputC(String prompt){
        Scanner scan_char = new Scanner(System.in);
        print(prompt);
        return scan_char.next().charAt(0);
    }

    /**
     * Prompts the user for a long value and returns it.
     *
     * @param prompt The message to display to the user before input.
     * @return The boolean value entered by the user.
     */
    public static boolean inputB(String prompt){
        Scanner scan_boll = new Scanner(System.in);
        print(prompt);
        return scan_boll.nextBoolean();
    }

}
