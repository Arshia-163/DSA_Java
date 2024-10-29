package pack.Access;

public class Subclass extends A {

    public Subclass(int num,String name){
        super(num,name);
    }

//protected works fine in subclass, only the subclass can access  the protected members in diff. packg. 
    public static void main(String[] args) {
        Subclass obj  = new Subclass(45,"Aarav sharma");
int n = obj.num;
System.out.println(obj instanceof A);
    }
}
class Subclass2 extends A {
    public Subclass2(int num,String name ){
        super(num,name);
    }
public static void main(String[] args) {
    A obj = new A(21, "prince");
}}
class SubSubclass extends Subclass{
    public SubSubclass(int num,String name ){
        super(num,name);
    }
public static void main(String[] args) {
    A obj = new A(21, "prince");
}
    
}
