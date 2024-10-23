
public class opp
{
    public static void main(String[] args) {
        try {
            //int x = 5 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Oops! You can't divide by zero!");
        }
    }
}