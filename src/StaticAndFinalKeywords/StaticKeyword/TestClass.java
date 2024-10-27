package StaticAndFinalKeywords.StaticKeyword;

public class TestClass {

    static int x = 10;
    int y = 20;

    public void show() {
        System.out.println(x);
        System.out.println(y);
    }

    static void display() {
        System.out.println(x);
//        System.out.println(y); static method cannot access non-static variable
    }
}
