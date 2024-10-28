package pack;

public class Main {
public static void main(String[] args) {
    human person1 = new human(24,"pari",20000);
    human person2 = new human(31,"man",210000);
    // System.out.println(person1.name);
    // System.out.println(human.population); // it is same for all so wecall it using class name;independent of obj
    
    Main funn = new Main();
    funn.fun2();

}
static void fun(){
    // greeting();   we can't use this bez it requires an instance

    //you cannot access non static stuff without refercing their instances
    // a static context

    // here we have to reference it
    Main obj = new Main();
    obj.greeting();
}

void fun2(){
    greeting();
}


 void greeting(){
    System.out.println("Hello");
}

}
