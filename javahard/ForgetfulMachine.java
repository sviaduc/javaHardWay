import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner enter = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    enter.next();

    System.out.println( "What is 6 multipleid by 7?");
    enter.nextDouble();

    System.out.println( "Enter a number between 0.0 and 1.0" );
    enter.nextDouble();

    System.out.println( "Is there anything else you would like to say?");
    enter.next();
  }
}
