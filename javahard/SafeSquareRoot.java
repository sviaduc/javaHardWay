import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String a;

    System.out.print("Are you ready for my magic? ");
    a = keyboard.next();

    while ( !(a.equals("yes") ) ) {
      System.out.println("Boo! Try again.");
      System.out.println("Ready yet?\t");
      a = keyboard.next();
    }
    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("\n(No negatives, please.)\n");
    x = keyboard.nextDouble();

    while (x < 0) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
}
