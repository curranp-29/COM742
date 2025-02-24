package week3A_SortingAlgorithms.Slides;

public class Slide31SelectionSortPseudo {

//    FOR MARKER=0 TO LIST LENGTH - 1
//    FIND SMALLEST ELEMENT IN LIST RANGE MARKER .. LIST LENGTH-1
//    SWAP THAT ELEMENT WITH ELEMENT AT LOCATION MARKER
//    INCREASE MARKER BY 1
    public static void selectionSort(int data[]) {
        int in, out, min;
        for (out=0; out < data.length-1; out++) {
            min = out;
            for (in = out+1; in < data.length; in++) {
                if (data[in] < data[min]) {
                    min = in; // new minimum
                }
            }
            int tmp = data[out]; // swap items
            data[out] = data[min]; //
            data[min] = tmp; //
        }
    }
}
