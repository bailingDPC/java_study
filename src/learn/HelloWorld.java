package learn;

/**
 * @author 风雪中的白灵
 */
public class HelloWorld
{
    static int i = 9;

    public static void main(String[] args) {
        boolean b = true;
        int x, y = 9;
        int i = 1;
        char c1, c2;

        c1 = '\u534e';
        c2 = 'c';
        x = 12;

        System.out.println(c1);
        System.out.println(i);
        System.out.println("hello world");

        do {
            i++;

            System.out.println(i);
        } while (i < 10);

        System.out.println(i);
    }

    public static int dg(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dg(n - 1);
        }
    }

    public static long f(int index) {
        if (index == 1 || index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }

    }
}