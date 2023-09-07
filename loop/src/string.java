public class string {
  public static void main (String []args) {
    String str1 = "abxc";
    String str2 = "xyz" ;
    boolean found = false;
    // print true/false
    // question: 有冇一樣的character
    for(int i=0; i<str1.length() ;i++) {
      for (int j=0; j<str2.length(); j++ ){
        if ( str1.charAt(i) == str2.charAt(j) ) {
          found = true ;
          break;
        }
      }
  } 
  System.out.println(found); //要系第一個FOR LOOP 度走
}
}