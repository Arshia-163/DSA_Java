package pack.Interface_java.nested;

public class A {
    // nested interface can be declared any but 
    //top interface has to be declared public/default

    public interface nestedInter{
        boolean isOdd(int n);
 }
}

 class B implements A.nestedInter{
    @Override
    public boolean isOdd(int n){
    return (n&1) == 1;
    }
 }
 class Main{
    public static void main(String[] args) {
        B obj = new B();
System.out.println(obj.isOdd(45)); // give true;
    }
 }
