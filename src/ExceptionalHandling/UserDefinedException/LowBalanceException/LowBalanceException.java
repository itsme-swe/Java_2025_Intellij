package ExceptionalHandling.UserDefinedException.LowBalanceException;

// user-defined Exception must be extended from Exception Class
public class LowBalanceException extends Exception{
    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }
}
