package error;

/**
 * @author 风雪中的白灵
 */
public class MyException extends Exception
{
    private int id;
    public MyException (String message, int id){
        super(message);
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
