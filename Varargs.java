public class Varargs {
    static int sum(int ...arr){ // ... -----> is used to take multiple arguments and stores the value as array
        int result=0; 
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("sum is "+ sum( 2,4));
    }
    
}
