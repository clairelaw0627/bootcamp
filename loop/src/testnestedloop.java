public class testnestedloop {
  public static void main (String []args) {

    
    for(int i=0; i<10 ;i++) { // i , nested below cannot declare i again, need to define new
     for (int j = 11; j<20; j++ ) {
      if (j>15) {
        break; //走緊第一個LOOP, INNERLOOP
      }
      if (i%2 == 0 && j%2==0 && i!=0 && j!=0 ) {
        System.out.println("I is " + i + ", J is " + j);
      }
     }
    }

    // i is betweem 1-10, j is 11-20, j needs to be below 10
    // approach 2: ans we put this in the first condition, 因為會由左開始睇, 就可以最快SKIP到, 寫AND既時候要最HARSH既系前面

  }
}
