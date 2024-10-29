package pack.Abstractdemo;

public class child extends parent{

    public child(int age) {
        super(age);
        }

    @Override
    void carrer(){
        System.out.println("I am a doctor");
    }
    @Override
    void person(){
        System.out.println("I am person");
    }
    

}
