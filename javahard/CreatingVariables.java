public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, hieght;
    double seconds, e, checking, rotations;
    String firstName, lastName, title, planet;

    x = 10;
    y = 400;
    age = 39;
    hieght = 6;

    seconds = 4.71;
    e = 2.718281828459045235536;
    checking = 1.89;
    rotations = 87;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    planet = "Moon ";


    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!");
    System.out.println( "My name's " + title + " " + firstName +" "+ lastName );
    System.out.println( "My hieght is " + hieght + " foot and I have gone aroud the "
    + planet + rotations + " times. ");
  }
}
