import static java.lang.System.out;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int i : array) {
            out.print(i + " ,");
        }
        out.println();
        insertionSort(array);
        for (int i : array) {
            out.print(i + ", ");
        }
    }

    private static void insertionSort(int[] array) {



        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex ; i > 0 && array[i-1]> newElement ;i--){

                array[i] = array[i-1];
            }

            array[i] = newElement;

        }

    }


}
