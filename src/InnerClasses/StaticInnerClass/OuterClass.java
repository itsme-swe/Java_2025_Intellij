package InnerClasses.StaticInnerClass;

public class OuterClass {

    static int x = 10;
    int y = 20;

    static class Inner {

        public void display() {
            System.out.println("I can only access static members x: " + x);
        }
    }
}
