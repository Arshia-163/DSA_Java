package pack.Interface_java;

public class Major implements B,A {

    @Override
    public void fun() {
        System.out.println("Have fun ");
    }

    @Override
    public void greet() {
        System.out.println("Greet everyone");
    }
    public static void main(String[] args) {
        Major obj = new Major();
        A.greeting();
    }
    
}
