package pack.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
int[] arr;

public Human(int age,String name){
    this.age = age;
    this.name = name;
    this.arr = new int[] {3,4,5,68,7};
}

//  public Human(Human other){
//         this.age = other.age;
//         this.name = other.name;
//     }
 @Override
    public Object clone() throws CloneNotSupportedException{
             //this is a shallow copy
        Human twin = (Human)super.clone();
        //this is a deep copy
        twin.arr = new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
   twin.arr[i] = this.arr[i];
        }
        return twin;
    } 

// due to deep copy if make change in twin , there will be no change in the main 

// @Override
//     public Object clone() throws CloneNotSupportedException{
             //this is shallow copy
//         return super.clone();
//     } 
}
