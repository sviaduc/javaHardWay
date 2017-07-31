import java.util.Scanner;

public class ThereAndBackAgain {
  public static void main(String[] args){
    System.out.println("Here.");
    erebor();
    System.out.println( "Back first time.");
    erebor();
    System.out.println("Back second time.");
  }

  public static void erebor() {
      Scanner keyboard = new Scanner(System.in);
      int x;

      System.out.println("There.");
      System.out.println("Please type \"2\". ");
      x = keyboard.nextInt();

      if (x == 2){
        System.out.println("Thank you");
      }
      else {
        System.out.println("You don't listen.");
      }




  }
}
