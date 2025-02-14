import java.util.*;

/****
 ***** Created by psd24cur on 14/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Graphs {
   public static void main(String[] args) {

      //Creating the graph as adjacency list
      Map<Character, List<Character>> graph = new HashMap<>();
      graph.put('A', Arrays.asList('B','C'));
      graph.put('B', Arrays.asList('A','D', 'E'));
      graph.put('C', Arrays.asList('A','F','G'));
      graph.put('D', Arrays.asList('B'));
      graph.put('E', Arrays.asList('B','H'));
      graph.put('F', Arrays.asList('C'));
      graph.put('G', Arrays.asList('C'));
      graph.put('H', Arrays.asList('E'));

      //Perform BFS starting from node 'A'
      System.out.println("BFS Traversal starting from A: ");
      graphs(graph, 'A');
   }//main

   public static void graphs(Map<Character, List<Character>> graph, char startNode){
      Set<Character> visited = new HashSet<>();//to track visited nodes
      Queue<Character> queue = new LinkedList<>();//Queue for BFS traversal

      queue.add(startNode);//Start BFS from given node

      while(!queue.isEmpty()){
         char node = queue.poll();

         if(!visited.contains(node)){
            System.out.print(node + " ");//Process the node
            visited.add(node);//Mark node as visited
         }//if

         //Enqueue all unvisited neighbours
         for(char neighbour : graph.getOrDefault(node, new ArrayList<>())){
            if(!visited.contains(neighbour)){
               queue.add(neighbour);
            }
         }
      }
   }


}//class
