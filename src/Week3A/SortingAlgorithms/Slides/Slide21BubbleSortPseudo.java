package Week3A.SortingAlgorithms.Slides;

public class Slide21BubbleSortPseudo {

//    FOR OUT=LAST ELEMENT DOWN TO SECOND ELEMENT IN LIST
//    FOR IN=FIRST ELEMENT TO OUT-1
//    IF ELEMENT[IN] > ELEMENT[IN+1]
//    SWAP ELEMENT[IN] AND ELEMENT[IN+1]
//    END IF
//    END FOR
//    END FOR


    //BUBBLE SORT NESTED LOOPS
    public static void bubbleSort(int[] data) {
        for (int out = data.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (data[in] > data[in+1]) {
                    int tmp = data[in]; // swap items
                    data[in] = data[in+1]; //
                    data[in+1] = tmp; //
                }
            }
        }
    }


}
