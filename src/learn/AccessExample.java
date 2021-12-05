package learn;

/**
 * @author 风雪中的白灵
 * */

public class AccessExample
{
    private int id;

    public String getId(){
        return id + "";
    }

    public void setId(String id){
        this.id = Integer.parseInt(id);
    }
}
