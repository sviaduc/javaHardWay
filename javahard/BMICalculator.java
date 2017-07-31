import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double f, ft, i, in, p, bmi;

    System.out.print( "Your height (feet only): ");
    f = keyboard.nextDouble();
    ft = f*12;
   
    System.out.print( "Your height (inches)");
    i = keyboard.nextDouble();

    in = ft + i;

    System.out.print( "Your weight in pounds: " );
    p = keyboard.nextDouble();

    bmi = (p / (in*in)) * 703;

    System.out.println( "Your BMI is " + bmi );
    }
  }
