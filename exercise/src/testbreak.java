public class testbreak {
  public static void main (String [] args){

    for (int i = 0; i<10; i++){
        System.out.println("i依家系" + i);
      if (i > 3) {
        System.out.println("i is " + i + "滿足條件就會停");
        break;
      }
    }
  }
  
}
