package InnerClasses.StaticInnerClass;

public class MainClass {
    public static void main(String[] args) {

        OuterClass.Inner oi = new OuterClass.Inner();

        oi.display();   // output: I can only access static members x: 10

    }
}
