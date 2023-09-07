public class testcontinue {
  public static void main (String []args) {

    // String s = "abcd";
    // // charAt, for loop, print abcd
    // //
    // for (int i=0; i<s.length(); i++) {
    //   char result = s.charAt(i);
    //   System.out.println(result);
    // }

    //find char 't' and print the next character of t, 
    // if not find print -1
    // 簽
    String s2 ="bootcamp" ;
    for (int i=0; i<s2.length();i++) {
        if (s2.charAt(i) == 't') { 
          System.out.println(s2.charAt(i+1));
        } else { 
          System.out.println("-1");
          break;
        } 
      }

    // ////ans
    // String s2 = "ijkxyz";
    // boolean found = false;
    // char target = ' ';
    // for (int i=0;i<s2.length(); i++) {
    //     if (s2.charAt(i) == 'x') {
    //       target =s2.charAt(i+1);
    //       found = true;
    //       break;
    //     }
    // }
    // if (found) {
    //   System.out.println(target);
    // } else {
    //   System.out.println(-1);
    //   ////ans
    
 }
}
