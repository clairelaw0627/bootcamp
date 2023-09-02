public class ifelse {
  public static void main(String[]args) {

    int x = 100;

    if ( x > 50) {
      System.out.println("x>50");
    }
    if ( x !=80) {
       System.out.println("x is not equal to 80");
    } else if (x<80) {
      System.out.println("x is smaller than 80");
    } else if (x>80) {
      System.out.println("x is bigger than 80");
    }

    int y = 90;
    if (y == 9) {
      System.out.println("y=9");
    } else if (y<9) {
      System.out.println("y is smaller 9");
    } else { 
      System.out.println("y>9"); //print
    }

  }
}
