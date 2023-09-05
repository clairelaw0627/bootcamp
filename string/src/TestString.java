
public class TestString {
  public static void main(String[]args){
    // String str = 1; no beacuse it is integer

    // .equals 系一個method,  要撜個typeg去.method. 
    // equals() ->method
    // String can use methods
    String str = "abc";


    //or

    boolean result = "abc".equals(str);
    if(result) { //if result is true
    System.out.println("it is abc");
   }
    if ("abc".equals(str)) {
      System.out.println("It is abc");
    }
    if ("abc".length() == 3) {
      System.out.println("the string is 3");
    }
    // str 放緊ABC, 
    //a is at the position[0], 
    //b is at the position [2],
    //c is at the position [3]

    if (str.charAt(0) == 'a') {
      System.out.println("The first character in string is A");
    }

    if (str.charAt(1) == 'b' || str.length()<3) {
      System.out.println("OK");
    }
    // 記得唔同variable 要set and decaration
    long l1 = 200000L; // 唔要L既話, 最多系2億, 加左就可以長D 
    float f1= 100.3f; // 32 bits
    double d1 = 1.0; //1.0d 64 bits
    byte b1 = 127; // max at 127
    short b2 = 3200; //integer max at 32000, convert string 32000 to intege short32000

  }
}
