package StaticAndFinalKeywords.StaticKeyword;

public class MainClass {
    public static void main(String[] args) {

        TestClass tc = new TestClass();

        tc.show();

        TestClass.display();    // Directly accessing static method without creating an object

    }
}
