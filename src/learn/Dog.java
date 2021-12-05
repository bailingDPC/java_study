package learn;

/**
 * @author 风雪中的白灵
 */
public class Dog
{
    String name;

    Dog(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getObjectAddress() {
        return super.toString();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
