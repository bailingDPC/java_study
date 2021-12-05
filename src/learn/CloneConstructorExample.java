package learn;
/**
 * @author 风雪中的白灵
 * */
public class CloneConstructorExample
{
    private int[] arr;
    public CloneConstructorExample(CloneConstructorExample original){
        arr = new int[original.arr.length];
        for(int i = 0; i< original.arr.length; i++){
            arr[i] = original.arr[i];
        }
    }

    public void set(int index, int value){
        arr[index] = value;
    }

    public int get(int index){
        return arr[index];
    }
}
