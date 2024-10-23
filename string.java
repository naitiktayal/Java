import java.util.Scanner;
public class string {
    public static void main(String[] args) {
       // String name = new String("yash");
        //String name1 = "yash";
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a %d and value of b is %8.2f ",a,b);
        //System.out.format("The value of a %d and value of b is %f ",a,b);
        //System.out.println(" The name is:");
        //System.err.print(name);
        //System.out.println(name1);
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        System.out.println(st);
        scan.close();
    }
}
