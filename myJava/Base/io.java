import java.util.Scanner;

public class io {

    public static void print(int i_ids) {
        System.out.print(i_ids);
    }

    public static void print(String s_names) {
        System.out.print(s_names);
    }

    public static void print(float f_float) {
        System.out.print(f_float);
    }

    public static void print(double d_double) {
        System.out.print(d_double);
    }

    public static void print(long l_long) {
        System.out.print(l_long);
    }

    public static void print(char c_char) {
        System.out.print(c_char);
    }

    public static void print(boolean b_boolean) {
        System.out.print(b_boolean);
    }

    public static int inputI(String prompt) {
        Scanner scan = new Scanner(System.in);
        print(prompt);
        return scan.nextInt();
    }

    public static String inputS(String prompt) {
        Scanner scan = new Scanner(System.in);
        print(prompt);
        return scan.nextLine();
    }

    public static float inputF(String inputfloat){
        Scanner scan_float = new Scanner(System.in);
        print(inputfloat);
        return scan_float.nextFloat();
    }


    public static double inputD(String inputdouble){
        Scanner scan_double = new Scanner(System.in);
        print(inputdouble);
        return scan_double.nextDouble();
    }

    public static long inputL(String inputlong){
        Scanner scan_long = new Scanner(System.in);
        print(inputlong);
        return scan_long.nextLong();
    }

    public static char inputC(String inputchar){
        Scanner scan_char = new Scanner(System.in);
        print(inputchar);
        return scan_char.next().charAt(0);
    }

    public static boolean inputB(String inputbool){
        Scanner scan_boll = new Scanner(System.in);
        print(inputbool);
        return scan_boll.nextBoolean();
    }

}
