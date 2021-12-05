package learn;
/**
 * @author 风雪中的白灵
 * */
public abstract class AbstractClassExample
{
    protected int x;
    private int y;

    /**
     * <p>
     *     定义的虚拟抽象的描述信息
     * </p>
     * @author 风雪中的白灵
     * @deprecated
     * @since JDK1.8
     * */
    public abstract void func1();

    public void func2(){
        System.out.println("func2");
    }
}
