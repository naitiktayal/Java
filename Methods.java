public class Methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z = (x+y)*5;
            }
            x = 566;
            return z;
        }
    //static int logic
    public static void main(String[] args){
    int a = 56;
    int b = 7;
    int c;
    System.out.println(a +" "+ b);
  //Method invocation using object creation
 //Methods obj = new Methods();
//c = obj.logic(a,b);
c =logic(a,b);
    int a1= 15;
    int b1= 7;
    int c1;
    c1 = logic(a1,b1);
    System.out.println(c);
    System.out.println(c1);
}

    
}
