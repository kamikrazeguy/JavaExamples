package Examples;

public class StringReverse implements IStringReverse {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        IStringReverse.testString("TEST!");
        StringReverse stringReverse = new StringReverse();
        stringReverse.testYou();
    }

     void testYou() {
        System.out.println("Test You!!!");
        testMe();
    }

    public void testMe() {
        System.out.println("Test Me!!!");
    }
}
