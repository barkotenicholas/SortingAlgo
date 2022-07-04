import static java.lang.System.in;
import static java.lang.System.out;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for (int i : array) {
            out.print(i + " ,");
        }
        quickSort(array,0,array.length);
        out.println();
        for (int i : array) {
            out.print(i + ", ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if( end - start < 2){
            return;
        }

        int pivot = partition(array,start, end);

        quickSort(array,start,pivot);
        quickSort(array,pivot+1,end);
    }

    private static int partition(int[] array, int start, int end) {
        // This is using the first element as index

        int pivot  = array[start];
        int i = start;
        int j = end;

        while (i < j){
            //empty loop
            while (i < j  && array[--j] >= pivot);
            if(i < j){
                array[i] =array[j];
            }

            // emptyLoop
            while ( i < j && array[++i] <= pivot);

            if(i<j){
                array[j] = array[i];
            }
        }

        array[j] = pivot;

        return j ;
    }
}
