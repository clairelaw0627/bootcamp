public class conversion {

  public static void main (String []args) {
    // Primities
    // upcase (promotion)
    // byte -> short > int> long (integer)
    byte b = 10;
    short s = b; // upcase
    int c = s;
    long d = c;

    //但int 轉落byte 會錯因為系統會判斷 10同-128 VERY CLOSE 有機會 exceed
    // float -> double 
    float f = 10.23f;
    double g = f; //upcast, 

    //CHAR -> INT
    char h = 'a';  // in ascII 97
    int w = h; //upcast
    System.out.println(w); //97
    //char c2 = w; // int 唔寫得系因為會dataloss

    //downcast
    short s3 = 129;
    byte b3 = (byte) s3; //夾硬downcast
    System.out.println(b3); // Java behavior overflow: = -127, from -128 to 127 in sequence circle
  
    double d5 = 1000.2324;
    float f5 = (float) d5 ;
    System.out.println(f5);

    short s6 = 32323;
    s6++ ;
    System.out.println(s6);
    // this is on9 

    // int -> char on99 dont do this only when (0-127 先make sense)
    int i6 = 99; // 'c'
    char c6 = (char) i6;
    System.out.println(c6); // 'c'

    char c8 = 'A'; //65
    char c9 = 'a' ;//97
    if (c8<c9) { //會轉左做ASCII 去比較
      System.out.println("c8<c9 in ASCII");
    } else {
      System.out.println("c8>=c9 in ASCII");
    }

    byte b9 = 100;
    short s9 = 101;
    if ( s9 > b9 ){ // conversion 先比較到
     System.out.println("s9>b9");
    }
  }
}
