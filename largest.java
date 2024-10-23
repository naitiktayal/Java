public class largest {
    
    /*public static int second(int a[],int n) {
        int[] arr = new int [n];
        int temp;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n-2];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,3};
        int n = 5;
        int result = second(arr,n);
        System.out.println(result);
    }
}*/

public static void main(String[] args) {
    int []arrayOfIngeger = {23,989,989, 878,2,2,5,3,3,4,123,345,-98,-675,-98};
    //int []arrayofIngeger = {23 , 56, 56, 67, 78, 98, 87, 76, 76, 546,};
    int highestNumber = arrayOfIngeger[0];
    int secHighestNumber = 0;
    for(int i = 1; i < arrayOfIngeger.length; i++  ) {
        if(highestNumber < arrayOfIngeger[i]) {
            secHighestNumber = highestNumber; 
            highestNumber = arrayOfIngeger[i];  
        }else if(secHighestNumber < arrayOfIngeger[i] && arrayOfIngeger[i] != highestNumber) {
            secHighestNumber = arrayOfIngeger[i];
        }
    }
    System.out.println("second Highest Number in Array   :  "+secHighestNumber);
}
}
