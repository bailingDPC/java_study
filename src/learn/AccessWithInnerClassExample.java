package learn;

/**
 * @author 风雪中的白灵
 * */
public class AccessWithInnerClassExample
{
    private static class InnerClass {
        int x;
    }

    private InnerClass innerClass;

    public AccessWithInnerClassExample(){
        innerClass = new InnerClass();
    }

    public int getValue(){
        return innerClass.x;
    }
}
