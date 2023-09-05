public class TestSwitch {
  public static void main (String[]args){
     int score = 80;
     char grade = ' ';
     switch(score) {
      case 90: //use case to define the condition
        grade = 'A';
        break;
      case 80:
        grade = 'B';
        break;
      case 70:
        grade = 'C';
        break;
      default:
        grade = 'F';
        break;
     }
             System.out.println(grade);
      //alternative

      if (score>=90) {
        grade = 'A';
        System.out.println(grade);
      } else if (score >= 80) {
        grade = 'B';
        System.out.println("the second alternative shows result is " + grade);
      }


      
  } 
  
}
