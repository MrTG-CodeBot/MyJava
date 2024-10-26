public class sample {

public static void main(String[] args) {

  // input the string 
  String name = input.s("What is your name: ");
  print.s("Your name "+name+"\n");

  // input the int 
  int intnum = input.i("Enter the int number: ");
  print.s("Your int number is "+intnum+"\n");

  //input the float
  float floatnum= input.f("Enter the float number: ");
  print.s("Your float number is " + floatnum + "\n");

  //input the double
  double doubnum = input.d("Enter the double number: ");
  print.s("Your double number is " + doubnum + "\n");

  //input the char
  char charname = input.c("Enter the char: ");
  print.s("Your char is "+ charname + '\n');

  //input the boolean
  boolean bool = input.b("Enter the boolean: ");
  print.s("Your ans is "+ bool +"\n");

  //end
  }
}
