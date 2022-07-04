import static java.lang.System.out;

public class BubbleSort {

    public static void main(String[] args) {



        int[]  array = {20,35,-15,7,55,1,-22};

        for(int i: array){
            out.print(i +" , ");
        }
        out.println();
        sort(array);
        for(int i: array){
            out.print(i +" , ");
        }
    }

    private static void sort(int[] array) {


        int unsorted = array.length -1;

        for(int i = unsorted ; i > 0; i--){
            for(int u = 0 ; u < unsorted ; u++){

                if (array[u] > array[u+1]) {
                    swap(u,u+1,array);
                }

            }
        }

    }

    private static void swap(int u, int i,int [] array  ) {

        int temp = array[u];
        array[u] = array[i];
        array[i] = temp;
    }
}
