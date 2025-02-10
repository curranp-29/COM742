package Week3A.SortingAlgorithms.Slides;

public class Slide43InsertionSortPseudo {

    public void insertionSort( int data[] ) {
        int in, out, temp;
        for (out=1; out < data.length; out++) {
            temp = data[out];
            for (in=out; in > 0 && data[in-1] >= temp; in--) {
                data[in] = data[in-1];
            }
            data[in] = temp;
        }
    }
//    In the outer loop, out starts at 1 and moves right. It marks the
//    leftmost unsorted data. The value at position out is stored in
//    temp.
//    In the inner loop, in starts at position out and moves left,
//    moving all larger elements (prior to position out) one place to
//    the right.
//    The value in temp is then placed in the correct position which
//    has been vacated by the shift right of larger elements.
}
