package learn;

/**
 * @author 风雪中的白灵
 */
public class Person
{
    private String name;
    private int gender;
    private int age;

    Person(String _name, int _gender, int _age) {
        name = _name;
        gender = _gender;
        age = _age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender == 0 ? "man" : "woman";
    }

    public void work() {
        if (18 <= age && age <= 50) {
            System.out.println(name + "is working very hard!");
        } else {
            System.out.println(name + "cant't work any more!");
        }
    }
}
