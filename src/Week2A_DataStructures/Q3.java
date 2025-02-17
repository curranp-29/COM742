package Week2A_DataStructures;

import java.util.Collections;
import java.util.LinkedList;

public class Q3 {

    public static void main(String[] args) {

        //createLinkedList
        LinkedList listNum = new LinkedList<>();
        for(int i = 1; i <= 20; i++){
            listNum.add(i);
        }//for


        //shuffle
        Collections.shuffle(listNum);
        System.out.println(listNum);


        //createLinkedList2
        LinkedList copyListNum = new LinkedList<>(listNum);
        Collections.copy(copyListNum, listNum);


        //setFirstLast
        copyListNum.set(0, 16);
        copyListNum.set(copyListNum.size() - 1, 24);
        System.out.println(copyListNum);


        //First and last occurrence
        if(copyListNum.indexOf(6) == -1){
            System.out.println("Value not found");
        }//if
        else{
            copyListNum.indexOf(6);
        }//else

        if(copyListNum.lastIndexOf(15) == -1){
            System.out.println("Value not found");
        }//if
        else{
            System.out.println(copyListNum.indexOf(15));
        }//else

        //Display all elements and their positions
        for(int i = 0; i < listNum.size(); i++){
            System.out.println("Element [" + i + "] Value [" + listNum.get(i) + "]");
        }//for


        //Remove first, last and element 4 from linked list
        listNum.remove(0);
        listNum.remove(listNum.size()-1);
        listNum.remove(4);
        System.out.println(listNum);


        //Swap elements at location 3 and 16
        Collections.swap(listNum, 3,16 );
        System.out.println(listNum);


        //createSecondList
        LinkedList listNum2 = new LinkedList<>();
        for(int i = 1; i <= 6; i++){
            listNum2.add(i);
        }//for


        //shuffleList2
        Collections.shuffle(listNum2);


        //add List2 to List1
        listNum.addAll(listNum2);
        System.out.println(listNum);



        //remove element
        System.out.println(removeElement(listNum));

        if(listNum.contains(32)){
            System.out.println("Element exists within list");
        }//if
        else{
            System.out.println("Element does not exist");
        }//else


        //check if list is empty
        boolean isEmpty = listNum.isEmpty();


        //if empty
        if(isEmpty){
            System.out.println("List is empty");
        }//if
        else{
            System.out.println("List is not empty");
        }//else

    }//main


    public static  int removeElement(LinkedList<Integer> numbers){
        int value = numbers.removeFirst();
        return value;
    }//removeElement

//    public static int removeFirstElement(LinkedList<Integer>numbers) {
//        if (numbers.isEmpty()) {
//            System.out.println("List is empty!");
//            return -1; // or you can throw an exception
//        }//if
//        return numbers.removeFirst();
//    }//removeFirstElement

}//class
