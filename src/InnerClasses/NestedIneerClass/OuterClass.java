package InnerClasses.NestedIneerClass;

public class OuterClass {

    int x = 10;

    class InnerClass {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay() {

        // object of inner class
        InnerClass ic = new InnerClass();

        ic.innerDisplay();
        System.out.println("Variable of inner class " + ic.y);
    }
}
