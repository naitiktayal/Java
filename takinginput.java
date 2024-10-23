 import java.util.Scanner;

public class takinginput {
    
public static void main(String[] args) {
System.out.println("Taking input from use");
Scanner sc= new Scanner(System.in);
System.out.println("enter number 1");
int a = sc.nextInt();
System.out.println("Enternumber 2");
int  b = sc.nextInt();
int sum = a+b;
System.out.println("The sum of these number is");
System.out.println(sum);
sc.close();
}
}

