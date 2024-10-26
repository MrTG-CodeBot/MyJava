import java.util.Scanner;
public class input {  

    public static int i(String inputString) { 
        Scanner scan_int = new Scanner(System.in);
        print.s(inputString); 
        return scan_int.nextInt();
    }

    public static String s(String inputString) { 
        Scanner scan_string = new Scanner(System.in);
        print.s(inputString); 
        return scan_string.nextLine();
    }

    public static float f(String inputfloat){
        Scanner scan_float = new Scanner(System.in);
        print.s(inputfloat);
        return scan_float.nextFloat();
    }

    public static double d(String inputdouble){
        Scanner scan_double = new Scanner(System.in);
        print.s(inputdouble);
        return scan_double.nextDouble();
    }

    public static long l(String inputlong){
        Scanner scan_long = new Scanner(System.in);
        print.s(inputlong);
        return scan_long.nextLong();
    }

    public static char c(String inputchar){
        Scanner scan_char = new Scanner(System.in);
        print.s(inputchar);
        return scan_char.next().charAt(0);
    }

    public static boolean b(String inputbool){
        Scanner scan_boll = new Scanner(System.in);
        print.s(inputbool);
        return scan_boll.nextBoolean();
    }
}