package pack.Cloning;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human p1 = new Human(34,"Kuanl");
       // Human twin = new Human(p1);
       Human twin = (Human)p1.clone();
       //System.out.println(twin.age+" "+twin.name);

       System.out.println(Arrays.toString(twin.arr));
       twin.arr[0] = 10;
       System.out.println(Arrays.toString(p1.arr));

       System.out.println("Twin Array"+" "+Arrays.toString(twin.arr));



    }
} 
 