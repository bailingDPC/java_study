package learn;
/**
 * @author 风雪中的白灵
 * */
public interface InterfaceExample
{
    public static final int ID = 123;
    public int Z = 0;

    /**
     * <p>
     *     定义的方法 fun1
     * </p>
     * */
    public void func1();

    /**
     * <p>
     *     定义的方法
     * </p>
     * */
    default void func2(){
        System.out.println("func2");
    }
}
