package pack.polymorphism;

public class Sq extends shapes{

    @Override
    void area(){
        System.out.println("Area s*s");
    }
    public static void main(String[] args) {
        shapes obj = new Sq();
        obj.area();
    }
}
