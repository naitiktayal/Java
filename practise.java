import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        
        //1
       /*Scanner scan = new Scanner(System.in);
        System.out.println("sum of three no ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt(); 
        int sum = a+b+c;
        System.out.println(sum);
        scan.close();*/


        //2
      /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks");
        float subject1 = scan.nextFloat();
        float subject2 = scan.nextFloat();
        float subject3 = scan.nextFloat();
        float cgpa = (subject1+subject2+subject3)/30;
        System.out.println(cgpa);
        scan.close();*/


        //3
        System.err.println("What is yor name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello "+name+" have a good day!");
        scan.close();
    }
    
}
