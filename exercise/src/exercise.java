public class exercise {
  public static void main(String []args) {

    // int sum = 0;
    // for (int i = 1 ; i < 11 ;i++) {
    //   // sum = sum + +i;
    //   sum += i;
    //   System.out.println(sum);
    // }

    // int sum = 0;
    // for (int i = 1 ; i < 11 ;i++) {
    //   if ( i % 2 == 0) {  
    //     sum += i;
    //     System.out.println("i依家系" + i);
    //   } else {}
    // }
    //       System.out.println("加晒exit左個for loop" + sum);

// 1-299 加雙數, 300-699 加單數, 700-100 除得盡3既加晒

    int total = 0;
    for (int i = 1 ; i < 699 ;i++) {
      if ( i % 2 == 0 || i < 299 ) {  
        total += i;
      } else if (i % 2 == 1 || i < 699) {
          total += i;
          } else if (i % 3 == 0 || i < 1000) { 
            total += i;
          } else {}
        
       }
    
          System.out.println("加晒exit左個for loop" + total);



// ANS



          
  }
}
