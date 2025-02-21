/****
 ***** Created by psd24cur on 21/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Towers {
   public static void main(String[] args) {
      int n = 3; // Number of disks
      solve(n, 'A', 'B', 'C'); // A, B and C are names of rods
   }
   public static void solve(int n, char from, char auxiliary, char to) {
      if (n == 1) {
         System.out.println("Move disk 1 from " + from + " to " + to);
         return;
      }
      solve(n - 1, from, to, auxiliary);
      System.out.println("Move disk " + n + " from " + from + " to " + to);
      solve(n - 1, auxiliary, from, to);
   }
}//class
