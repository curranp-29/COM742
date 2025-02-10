package Week3A.SortingAlgorithms.Practicals;

public class Q5_BubbleSortBoolean {

    public static void main(String[] args) {

        int [] numbersCopy = {2,5,9,3,13,1,16,7,8,15,4,6};
        bubbleSortOptimised(numbersCopy);
    }

    public static void bubbleSortOptimised(int [] data) {
        int swapBS1 = 0, comparisonBS1 = 0;
        boolean swapped = true;

        for (int out = data.length - 1; out > 0; out--) {
            swapped = false;
            for (int in = 0; in < out; in++) {
                comparisonBS1++;
                if (data[in] > data[in + 1]) {
                    swapped = true;
                    int tmp = data[in];
                    data[in] = data[in + 1];
                    data[in + 1] = tmp;
                    swapBS1++;
                }//if
            }//for

                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + " ");
                }//for
                System.out.println();

                if (swapped == false) {
                    out = 0;
                }
            }
        System.out.println("Swaps: " + swapBS1);
        System.out.println("Comparisons: " + comparisonBS1);
        }
}
