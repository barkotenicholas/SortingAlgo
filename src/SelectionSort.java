import static java.lang.System.out;

public class SelectionSort {

    public static void main(String[] args) {
        int[]  array = {20,35,-15,7,55,1,-22};

        for(int i: array){
            out.print(i +" , ");
        }
        out.println();
        selectionSort(array);
        for(int i: array){
            out.print(i +" , ");
        }
    }

    private static void selectionSort(int[] array) {


        for(int i =  array.length -1 ; i > 0; i--){

            int largest =  0 ;

            for(int u = 1 ; u <= i ; u++){
                if (array[u] > array[largest]) {
                    largest = u;
                }
            }

            swap(i,largest,array);

        }

    }
    private static void swap(int u, int i,int [] array  ) {

        int temp = array[u];
        array[u] = array[i];
        array[i] = temp;
    }
}
