package pack.oops.Access; 

public class A {
   //public
   protected int num;
    String name;
    int[] arr;

    //private use getter and setter method to be accessed
public int getNum(){ //getter method to get the num
    return num;
} 

public void setNum(int num){
this.num = num; 
}
    public A(int num,String name){
         this.num = num;
         this.name = name; 
         this.arr = new int[num];
    }
    public static void main(String[] args) {
        A obj = new A(23, "Arshia");

        //1. access the data numbers
        //2. modify data members
        obj.getNum();
         
    }
}
