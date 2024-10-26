package InnerClasses.NestedIneerClass;

public class MainClass {
    public static void main(String[] args) {

        // Object of Outer class
        OuterClass oc = new OuterClass();

        oc.outerDisplay();
        /*
        output ⇒    10 20
                    Variable of inner class 20
        */

        System.out.println("Variable of Outer Class " + oc.x);  // output ⇒ Variable of Outer Class 10

        System.out.println();

        // Creating object of inner class to direct access inner class outside the outer class
        OuterClass.InnerClass oi = new OuterClass().new InnerClass();

        oi.innerDisplay();  // output ⇒ 10 20

    }
}
