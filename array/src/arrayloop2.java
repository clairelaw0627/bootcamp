import java.util.Arrays;

public class arrayloop2 {
  public static void main(String []args) {

    int [] nums = new int[4];
    nums[0] = 100;
    nums[1] = 200;
    nums[2] = 300;
    nums[3] = 400;

    
      // find the max value and print out result
    int maxresult = -1 ;
    for (int i=0; i < nums.length ; i++)  {

    if (nums[i] > maxresult) {
      maxresult = nums[i] ;
    } 
  }
  System.out.println("max result is " + maxresult);


  // find the min value
  int minvalue = 10000 ;
  for (int i=0; i < nums.length ; i++)
    if (minvalue > nums[i] ) {
      minvalue = nums[i];
    }
    System.out.println("the min value is " + minvalue);


      // find the average of all values
      // find sum and divide by 4
      int sumall = 0;
      for (int i=0; i < nums.length ; i++)  {
        sumall += nums[i];
      }
      double average = sumall / nums.length ;

      System.out.println("sum is " + sumall + " divided by " + nums.length + " average is " + average);
     
      // print out all odd numbers, in decending order
      // 

      for (int i = nums.length - 1 ; i >= 0; i--) {
        if (nums[i] % 2 == 1){
          //睇唔到去左邊
        }
      }

      // 新問題

      int[] integers = new int[] {100, 3, 10, 5,-100};
      int target = 10;
      int indexnum = ' ';

      // print index of value 10
      for (int i=0; i < integers.length ; i++ ) {
        if ( integers[i] == target) {
          indexnum = i;
        }
      }
      System.out.println( "index number is " + indexnum);

      //end

      //問題
      // when find b, replace it by w 
      // print the whole fucking string
      String str = "fuck u bitch";
      
      int exchange = 'b';

      char[] characters = str.toCharArray();

      for (int i=0; i < characters.length ; i++ ) {
        if ( characters[i] == exchange ) {
            characters[i] = 'w' ;
        }
      }
      System.out.println(String.valueOf(characters));// 將一行行char [] -> 變返做string

      /// 寫法2

      // String str2 = ' '; 開個新
      //str2 += characters[i]  ; print晒出黎再放入去
      //System.out.println(String.valueOf(characters));// char [] -> string


      
      String u = String.valueOf(1);// 1-> "1"




}
}