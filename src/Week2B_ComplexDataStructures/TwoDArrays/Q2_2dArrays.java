package Week2B_ComplexDataStructures.TwoDArrays;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q2_2dArrays {
   public static void main(String[] args) {

      int[][] tda = new int[][] {{1,2,3},
                                 {4,5,6},
                                 {7,8,9},
                                 {1,1,1}};

//      System.out.println(Arrays.toString(tda));
//      System.out.println(Arrays.deepToString(tda));

      for(int i = 0; i < tda.length; i++){
         for(int j = 0; j < tda[i].length ; j++){
            System.out.print(tda[i][j] + "\t");
         }//columns
         System.out.println();
         if(i >= 2){
            System.out.print("\t");
         }//if
      }//rows


      tda[1][2] = 0;
      tda[3][2] = 9;
      System.out.println();

      for(int i = 0; i < tda.length; i++){
         for(int j = 0; j < tda[i].length ; j++){
            System.out.print(tda[i][j] + "\t");
         }//columns
         System.out.println();
      }//rows

   }//main
}//class
