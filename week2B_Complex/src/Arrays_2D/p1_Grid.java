package Arrays_2D;

/****
 ***** Created by pcurr on 27/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p1_Grid {
   public static void main(String[] args) {

      int[][] grid = new int[10][10];

      for(int i = 0; i < grid.length; i++){
         for(int j = 0; j < grid[i].length; j++){
            System.out.print("-\t");
         }//for
         System.out.println();
      }//for

   }//main
}//class
