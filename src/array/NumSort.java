package array;

/**
 * @author 风雪中的白灵
 */
public class NumSort
{
    public  static void main(String[] args){
        int[] a = new int[args.length];
        for(int i = 0; i< args.length; i++){
            a[i]=Integer.parseInt(args[i]);
        }
        print(a);
        selectionSort(a);
        print(a);
        selectionSort2(a);
    }

    private static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length - i; j ++){

            }
        }
    }

    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void selectionSort2(int[] arr){
        int k, temp;
        for(int i = 0; i< arr.length; i++){
            k = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[k]){
                    k = j;
                }
            }
            if(k != i){
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
    }

    private  static void print(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
