public class pratice_Array {

    public static void main(String[] args) {

                                         // practise Problem 1


        /*  float [] marks = {45.7f , 67.8f , 63.4f , 99.2f , 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("Sum of all elements in the array is: " + sum);*/
    
    
    
    
                                         // pracctice Problem 2

        /* float [] marks = {45.7f , 67.8f , 63.4f , 99.2f , 100.0f};
        float num = 44.7f;
        boolean isInArray = false;
        for(float element:marks){
        if(num==element){
            isInArray = true;
            break;
        }
    }
        if(isInArray){
        System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }*/



                                         // Practice problem 3


        /*  float [] marks = {45.7f , 67.8f , 63.4f , 99.2f , 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("Sum of all elements in the array is: " + sum);*/
    

                                         // Practice problem 4


        /*  int [][] mat1 = {{1 , 2 , 3},
                        {4 , 5 , 6}};
        int [][] mat2 = {{2 , 6 , 13},
                        {3 , 7 , 1}};
        int [][] result = {{0 , 0 , 0},
                        {0 , 0 , 0}};

        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value for i=%d and j=%d\n", i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }

    //printing the elements of a 2-D Array

    for (int i=0;i<mat1.length;i++){
    for(int j=0;j<mat1[i].length;j++){
        System.out.print(result[i][j] + " ");
        result [i][j] = mat1[i][j] + mat2[i][j];
    }
        System.out.println(" ");
        }*/

    

                                         // Practice problem 5


                /*    int [] arr ={1, 2, 3, 4, 5, 6};
                int l = arr.length;
                int n = Math.floorDiv(l, 2);
                int temp;
                for (int i=0;i<n;i++){

                    //Swap a[i] and a[l-1-i]
                    temp = arr[i];
                    arr[i] = arr[l-i-1];
                    arr[l-i-1] = temp;

                }
                for(int element : arr){
                    System.out.println(element + " ");}
               */
        



                                             // Practice problem 6

                /*  int [] arr = { 1, 21, 3, 455, 5, 34, 67};
                int max =0;
                for(int element: arr){
                
                if(element>max){

                    max =element;
                }
                }

  System.out.println("the value of the maximum element in this array is: "+max); */





                                              // Practise problem 7
                /*  int [] arr = {1, 21, -3, 455, 5, 34, 67};
                    int min_value =0;
                    for(int element : arr){
                    if(element<min_value){
                        min_value = element;
                    }
                }
                System.out.println(min_value);*/





                           //Practice problem 8
                        boolean  isSorted = true;
                        int [] arr = {1, 2, 3, 4, 5, 34, 67};
                        for (int i=0;i<arr.length-1;i++){
                        if(arr[i] > arr[i+1])
                        {
                            isSorted = false;
                            break;
                        }
                        }
                if(isSorted){
                    System.out.println("The array is sorted");
                }
                else{
                        System.out.println("The array is not sorted");
                }
}
}