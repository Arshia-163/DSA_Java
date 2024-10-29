package pack;
// class Test{
//    static String name;
//     public Test(String name){
//        Test.name = name; 
//     }}  if we take it outside this way and call two diff names it wil give ans same for both


public class InnerClass {
 static class Test{
 String name;
 public Test(String name){
    this.name = name; 
 }
 @Override
 public String toString(){
    return name;   // adding inbuilt toString() which will give the name instead of random
 }

} 
public static void main(String[] args) {
    Test a = new Test("Arshia"); // we can use it when we test a static 
    Test b = new Test("Prince");
    System.out.println(a); // when call any obj. it automatically calls toString() if not and generates random value 
    System.out.println(b.name);
}
}
