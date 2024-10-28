package pack.Abstractdemo;

public class Main {
    public static void main(String[] args) {
        
    
    child son = new child(30);
    son.carrer();

    parent son2  = new child(18); // parent class can be used to access 
    son2.person();
    
   // parent mom = new parent(); // we cannot create obj of abstract class
   parent.hello();
  son.normal();

}
}
