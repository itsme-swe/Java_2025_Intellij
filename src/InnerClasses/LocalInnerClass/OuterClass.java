package InnerClasses.LocalInnerClass;

public class OuterClass {

    // method of outer class
    public void display() {

        class LocalInnerClass{

            public void innerDisplay() {
                System.out.println("Hello I am calling from local inner class.");
            }
        }

        // object of local inner class
        LocalInnerClass lc = new LocalInnerClass();
        lc.innerDisplay();
    }
}
