import java.util.Scanner;

public class SecretWord{
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", now = "Dude" , guess;


    System.out.print( "What is the secret word? ");
    guess = keyboard.next();

    if ( guess.equals(secret) || guess.equals(now) ){
      System.out.println( "That's correct!" );
    }
    else {
      System.out.println( "No, the secret word isn't \"" + guess + "\".");
    }

    if ( guess == secret ) {
      System.out.println( "This will never ever show, no matter what." );
    }
  }
}
