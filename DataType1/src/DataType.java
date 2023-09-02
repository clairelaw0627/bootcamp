public class DataType {
  public static void main(String[] args) {

    // Assign value "Hello World!!!" to a variable box
    String box = "Hello World!!!"; //assignment

    System.out.println(box); // Print the value of variable: Hello Wolrd!!!
    System.out.println("box"); // Print the String value: box

    String str; // Declaration
    str = "abc ###&&&$$$"; // Assign value "abc" to a variable str
    System.out.println(str); // abc ###&&&$$$

    String neww;
    neww = "lesson 3 la";
    System.out.println(neww);

    // Primitives - one kind of the data type
    // int x = "abc" ; 淨系可以放數字
    int increment = 5;
    int salary = 80000; //declaration
    salary = 5000; //reassign
    System.out.println(salary); //5000

    salary = salary*5 ; 
    System.out.println(salary); //25000

    int avgsalary = salary/2;
    System.out.println(avgsalary); //12500

    int sum = salary + avgsalary + increment;
    System.out.println(sum); //37505

    int result = sum + avgsalary/2 ;
    System.out.println(result); //4XXXX

    // self +1 
    int j = 0;
    j = j+1;
    System.out.println(j);  //Approach 1 

    j += 1; // same as j = j+1 , approach 2
    System.out.println(j); 

    j++;                     //approach 3
    System.out.println(j);

    ++j;
    System.out.println(j);

    // String str = 1; //not OK, cannot assign int to string variable

    String s = "Hello";
    s = s + " World.";
    System.out.println(s);

    String str1 = "abc";
    String str2 = "xyc";
    String e = str1+str2;
    System.out.println(e); // abcxyc
    System.out.println("e=" + e); // -e=abcxyc

    // double放點數

    double d = 0.3;
    d = 3.141513546354654 ;
    System.out.println(d);

    double d2 = 3;  // assign integer to d2 and convert to double
    System.out.println(d2);

    //boolean (true OR false)
    boolean a = true;
    System.out.println(a);
    boolean isleft = false;
    System.out.println(isleft);


    // char
    char t= 'a'; //唔可以系ab, 空格, 

    // byte
    // byte b = 1; within -128 to 127
    // byte b2 = -129; // out of range
    // byte b3 = 128; // out fo range
    // D 野入左去就會變左做integer

    // short range去到 -32768到32767, 系2既次方
    short hihi = 40;
    System.out.println(hihi);
    int newresult = hihi + 5;
    System.out.println(newresult);


    // long 2既63次方
    long l1 = 10000;
    l1 += 20000; // l1=l1+2000; 30000
    System.out.println(l1);

    l1 -= 5000; // l1=l1-5000; 25000
    System.out.println(l1);

    l1 *= 2; //l1 = l1*2  50000
    System.out.println(l1);

    l1 /=10; // l1 = l1/10  5000
    System.out.println(l1);

    // string supports +=
    String k2 = "abc";
    k2 += " bcd";
    System.out.println(k2); //abc bcd

    //float
    int i = 1; // 1即系integer
    double d4 = 3.0;  //3.0即系點數既
    double d5 = 3.0d;  //explicityly assign a double value to a variable double
   //  float f =3.0;   // not OK because assign double value to float variable
   float f = 3.0f;
   System.out.println(f);


   // byte, short, int, long --> all of them handle Integer

   byte b4 = 3;
   short s4 = 3;
   //兩個byte 同 short佢地自己會識加到入去

   int i3 = 5; 
   long l4 = 5; //upcast
   long l5 = 5L; //upcast
    System.out.println(l5);


      }
    }

