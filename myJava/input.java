import java.util.Scanner;
public class input {  

    //user input type => int
    public static int i(String inputint) { 
        Scanner scan_int = new Scanner(System.in);
        print.s(inputint); 
        return scan_int.nextInt();
    }

    //user input type => string
    public static String s(String inputString) { 
        Scanner scan_string = new Scanner(System.in);
        print.s(inputString); 
        return scan_string.nextLine();
    }

    //user input type => float
    public static float f(String inputfloat){
        Scanner scan_float = new Scanner(System.in);
        print.s(inputfloat);
        return scan_float.nextFloat();
    }

    //user input type => double
    public static double d(String inputdouble){
        Scanner scan_double = new Scanner(System.in);
        print.s(inputdouble);
        return scan_double.nextDouble();
    }

    //user input type => long
    public static long l(String inputlong){
        Scanner scan_long = new Scanner(System.in);
        print.s(inputlong);
        return scan_long.nextLong();
    }

    //user input type => char
    public static char c(String inputchar){
        Scanner scan_char = new Scanner(System.in);
        print.s(inputchar);
        return scan_char.next().charAt(0);
    }

    //user input type => boolean
    public static boolean b(String inputbool){
        Scanner scan_boll = new Scanner(System.in);
        print.s(inputbool);
        return scan_boll.nextBoolean();
    }
}
