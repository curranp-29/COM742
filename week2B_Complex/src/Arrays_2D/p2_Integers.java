package Arrays_2D;

/****
 ***** Created by pcurr on 27/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p2_Integers {
   public static void main(String[] args) {

      int[][] tda = new int[][] {{1,2,3},{4,5,6},{7,8,9},{1,1,1}};

      for(int rows = 0; rows < tda.length; rows++){
         for(int columns = 0; columns < tda[rows].length; columns++){
            System.out.print(tda[rows][columns] + " ");
         }//for
         System.out.println();
      }//for

      tda[1][2] = 0;
      tda[3][2] = 9;

      System.out.println();

      for(int rows = 0; rows < tda.length; rows++){
         for(int columns = 0; columns < tda[rows].length; columns++){
            System.out.print(tda[rows][columns] + " ");
         }//for
         System.out.println();
      }//for

   }//main
}//class
