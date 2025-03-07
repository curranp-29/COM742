package week2A_DataStructures;
import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

            //LinkedList
            LinkedList<Integer> numList = new LinkedList<>();
            numList.add(2);
            numList.add(4);
            numList.add(8);
            numList.add(16);
            numList.add(32);
            numList.add(64);
            System.out.println(numList);

            //add128
            numList.add(128);
            System.out.println(numList);

            //LinkedList2
            LinkedList<Integer> numbers = new LinkedList<>();
            numbers.add(3);
            numbers.add(6);
            numbers.add(9);
            numbers.add(12);

            //add numbers to position 3 on LinkedList1
            numList.addAll(3,numbers);
            System.out.println(numList);

            //retrieve element at position 5 in LinkedList1
            System.out.println(numList.get(5));

            //set element at position 6 with 23
            numList.set(6,23);
            System.out.println(numList);

            //for
            for(int i = 0; i < numList.size(); i++){
                if(numList.get(i) == 16){
                    numList.remove(i);
                }//if
                System.out.println(numList.get(i));
            }//for

//        System.out.println(numList);

        }//main
    }//class
