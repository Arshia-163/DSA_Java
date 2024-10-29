package pack;
import pack.Access.*;

public class human {
int age;
String name;
int salary;
static long population;  // here it is a static variable means value won't change for any obj , it is common for all obj of that class

static void message(){

   System.out.println("Hello World!!");
}


 public human(int age,String name , int salary){ // constructor
    this.age = age;
    this.name = name;
    this.salary = salary;
    human.population +=1;

    human.message(); // we use human. instead of this. as the func is static
 }

 //example for access modifiers
 public static void main(String[] args) {
   A st = new A(10,"pari");
 st.getNum();

 
 
 }
 
}
