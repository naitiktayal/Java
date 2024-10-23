public class Aarry {
    public static void main(String[] args) {

        int [] marks = {98,67,45,56,43};
      //  float [] marks = {98.5f,76.5f,87.5f,45.5f,65.5f};
        String [] student = {"Harry" , "Rohan" , "Naitik" , "Manas"};
        System.out.println(marks.length);
        System.out.println(student.length);
        System.out.println(marks[0]);
        System.out.println(student[0]);


        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("Printing using the array reverse");

        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println("printing using for-each loop");
        for(int element:marks)
        {
            System.out.println(element);
    
}
}
}
