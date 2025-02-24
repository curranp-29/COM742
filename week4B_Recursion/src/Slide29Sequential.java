/****
 ***** Created by psd24cur on 21/02/2025
 ***** In computer science, recursion is a method of solving a computational
 * problem where the solution depends on solutions to smaller instances of the
 * same problem.
 *****/
public class Slide29Sequential {
   public static void main(String[] args) {

      int answer = 1, number = 5;

      if (number < 0){
         System.out.println("Error - Number has to be positive");
      }//if

      else{
         for(int loop = number; loop > 1; loop--){
            answer = answer * loop;
         }//for
         System.out.println("Factorial " + number + " = " + answer);
      }//else

      //RECURSION
      System.out.println("Factorial " + number + " = " + factorial(number));

   }//main


   public static int factorial (int number){
      int answer;

      if(number == 0){
         answer = 1;
      }//if

      else{
         answer = number * factorial(number - 1);
      }//else

      return answer;
   }//factorial



}//class
