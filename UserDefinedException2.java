class UserDefinedException2 extends Exception {
    public UserDefinedException(String str) {
        super(str);
    }

    // Class that uses above MyException public class thr {
    public static void main(String args[]) {
        try {
            throw new UserDefinedException("This is user-defined exception");
        } catch (UserDefinedException ude) {
            System.out.println("Caught the exception");

            System.out.println(ude.getMessage());
        }
    }
}
