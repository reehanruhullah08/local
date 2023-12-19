public class Methods{
    int add(int a,int b){
        int c=a+b;
        return c;
    }
    int add(int c){
        int b=c;
        return b;
    }
    public static void main(String arg[]){
int a=5;
int b=6;
int c;
Methods ob=new Methods();

int x=ob.add(c=20);
int z=ob.add(a,b);
System.out.println("sum of a and b is :"+z);
System.out.println("another value :"+x);
    }
}