package pack.Abstractdemo;

public abstract class parent {

    int age;

    final int val;

    public parent(int age){
        this.age = age;
        val = 345346;
    }

    //abstract parent();// we cannot even create constructor

    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("simple method");
    }
    abstract void carrer();
    abstract void person();

    // but abstract class can be used as reference var. for calling the subclasses method
    




}
