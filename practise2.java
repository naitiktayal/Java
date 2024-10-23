import java.util.Scanner;

public class practise2 {
    public static void main(String[] args) {

       //1.Question
    //   What will be the result of the following expression:
      //   float a = 7/4 * 9/2


       float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //2.Question
      //  Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade


            char grade = 'B';
                grade = (char)(grade + 8);
                System.out.println(grade);
               //  Decrypting the grade
                grade = (char)(grade - 8);
                System.out.println(grade);
            

                // 3.Question
              //  Use comparison operators to find out whether a given number is greater than the user entered number or not.

                Scanner sc = new Scanner(System.in);
                //int b = sc.nextInt();
                //System.out.println(b>8);
                sc.close();


               //4.Ouestions
               // Write the following expression in a java program:
             //  (v^2-u^2)/2ys


              
              int v = sc.nextInt();
              int u = sc.nextInt();
              int y = sc.nextInt();
              int s = sc.nextInt();
              int x =((v*v)-(u*u))/(2*y*s);
              System.out.println(x);
              sc.close();


             //Questions
             // Find the value of 'a' in expression given below :
                //int x = 7
                  //int c = 7*49/7 + 35/7


                  
                  int c = 7*49/7+35/7;
                  System.out.println(c);

    }
}

    

