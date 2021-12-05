package error;

/**
 * @author 风雪中的白灵
 */
public class TestEx
{
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5};
        System.out.println(arr[2]);
        try {
            System.out.println(2/0);
        }catch (ArithmeticException error){
            System.out.println("系统正在维护中,请与管理员联系");
            error.printStackTrace();
        }
    }
}
