package pack.oops.polymorphism;

public class Circle extends shapes{

    //this will run when obj of circle is created
    //hence it is overriding the parent method
    
    @Override // this is called annotation
    void area(){
        System.out.println("Area pi*r*r");
    }
}
