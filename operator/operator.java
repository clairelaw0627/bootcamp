public class operator {
  public static void main(String [] args){
    // +-*
    //++
    //--
    //int i = 0';
    // i = i-1; //-1
    // i -= 1; // -2 = // i = i -1, i = -1-1 
    // i--; //-3
    // --i; //-4

    //++, -- 有個叫precedence 過程
    int i = 0;
    int result1 = ++i;
    System.out.println(result1);
    System.out.println("result1" + result1); // result =0
    System.out.println("i=" + i); // x=1
    
    
    int y = 0;
    int result2 = ++y;
    System.out.println("result2=" + result2) ; // result2=1

    int j = 0;
    int result3 = j-- ;
    System.out.println("result3 is" + result3);
    System.out.println("j is" + j);


    // %, remainder
    int r = 5 % 2; // 1; remainer of 5/2
    System.out.println(r);

    // && both true ; || either one ; 如果有|| && 就會行 && 先!!! 
    boolean b1 = true && true;  //true
    boolean b2 = true && false; //false
    boolean b3 = false && false; //false
    boolean b4 = false && true; //false

    boolean b5 = true || true;  //true
    boolean b6 = true || false; //true
    boolean b7 = false || false; //false
    boolean b8 = false || true; //true

    boolean combine = true || false && true; 
    //     boolean combine = true || (false && true ) = (false)
    //     boolean combine = true || false 
    //     boolean combine = true || false  = true

    // ! not; 掉轉

    boolean b9 = !false;
    int h = (1+2) *10 ; //30
    boolean b10 = !(true && false); // true

    // >, <, >=, <=
    boolean g = 5>3; //true
    boolean combine2 = (4 + 3) > 5 || (10 * 2) % 3 ==2;  // true || true

    // *=, /=, %=
    int a = 2;
    a *= 3; //a = a*3;
    System.out.println(a); //6

    int f = 3;
    f /= 1; // f=f/1;
    System.out.println(f); //3

    int e = 10;
    e %= 3; // e= 10/3
    System.out.println(e); //1


    int aaa = 10;
    int bbb =3;
    if (aaa<9 || bbb>2) {
      System.out.println("aaa<9 or bbb>2");
    }
    


    ///char

    char grade ='A';
    if(grade == 'B' ) {
      System.out.println("It s B");
    } else if (grade == 'c'|| grade =='A') {
      System.out.println("it is c or A");
    } else {
      System.out.println("bye");
    }
    // 要寫埋not equal to
    //4 

    //check if a number is even number
    int num = 10;
    if (num %2 == 0) {
      System.out.println("is it an even number" + num); 
    }
     if (num %2 == 1) {
      System.out.println("this is an odd number" + num);
     }

  }
}