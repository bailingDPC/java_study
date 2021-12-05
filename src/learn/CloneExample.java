package learn;
/**
 * @author 风雪中的白灵
 * */
public class CloneExample implements Cloneable
{
    private int a;
    private int b;

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }
}
