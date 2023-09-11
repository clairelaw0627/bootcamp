public class arrayloop {
  public static void main (String []args) {

    int [] nums = new int[4];
    nums[0] = 100;
    nums[1] = 200;
    nums[2] = 300;
    nums[3] = 400;

    for(int i = 0 ; i < nums.length ; i++) { //ARRAY個名.length 就會搵到佢幾大
      
      System.out.println(nums[i]);
    }

    //sum
    int result = 0;
    for (int i=0; i < nums.length ; i++)  {
      result = result + nums[i];
      System.out.println("sum is" + result);
    }


      // find the max value and print out result
      int maxresult = 0 ;

      for (int i=0; i < nums.length ; i++)  {

      if (nums[i] > nums[i++]) {
        maxresult = nums[i] ;
      continue;
      } else {
        maxresult = nums[i++] ;
        }
      }
      System.out.println("max result is" + maxresult);


  }
}
