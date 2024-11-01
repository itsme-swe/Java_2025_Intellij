package ExceptionalHandling.UserDefinedException.LowBalanceException;

public class MainClass {
    public static void main(String[] args) {

        fun1();

    }

    static void fun1() {

        try{
            throw new LowBalanceException();
        }
        catch (LowBalanceException e) {
            System.out.println(e);
        }
    }
}
