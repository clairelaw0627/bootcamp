public class array {
  public static void main (String []args) throws Exception {
    int i1=100;
    int i2=200;
    int i3=300;

    //array
    int[]array; // this is to declara
    array = new int[3]; // 開幾多, initialiszation

    int[]arr = new int[3]; // 0,1,2
    // assign values to array
    arr[0] = 100;
    arr[1] = 101;
    arr[2] = 104;
    // arr[3] = 110 ; runt time error
    int o = arr[0]; // array 可以轉得返落integer,
    // arr[1] = 3L ; // 但英文就塞唔返落去 
    System.out.println(o);

    int[]arr2 = new int[5];  // 0 1 2 3 4
    arr2[0] = 12;
    arr2[1] = 14;
    arr2[2] = 16;
    arr2[3] = 23;
    arr2[4] = 25;
    char z = (char) arr2[4] ; //25
    int p = arr2[3] ; //23
    System.out.println("z and p os " + z + p);

    boolean[]arr3 = new boolean[4];  //0 1 2 3
    arr3[0] = true;
    arr3[1] = true;
    arr3[2] = true;
    arr3[3] = false;
        System.out.println(arr3[3]);


    char[]arr4 = new char[4];  //0 1 2 3
    arr4[0] = 'a';
    arr4[1] = 'b';
    arr4[2] = 'c';
    arr4[3] = 'd';
    int x4 = arr4[2]; // c
    System.out.println(x4);

    int[] arr5 = new int [] {100, 99, 105 ,3000} ;
    // arr[5] = 301; 唔CAN 因為都冇第5個, array 長度改唔撚到
    System.out.println( arr5 [2]);




  }
}
