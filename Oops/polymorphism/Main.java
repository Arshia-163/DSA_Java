package pack.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes obj = new shapes();
        Circle cir  = new Circle();

 // here we refer to parent class and call obj of child class
        shapes squ = new Sq();// type is the reference var. parent class  called upcasting
        squ.area();
    }
}
