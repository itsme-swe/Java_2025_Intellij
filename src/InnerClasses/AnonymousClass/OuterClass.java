package InnerClasses.AnonymousClass;

public class OuterClass {

    public void display()
    {
        // ref. of abstract class
        AbstractClass ac = new AbstractClass() {
            @Override
            public void display() {
                System.out.println("I am abstract class override method");
            }
        };
        ac.display();
    }
}
