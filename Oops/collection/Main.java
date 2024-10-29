package pack.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();
    
    list2.add(76);
    list2.add(34);
    list2.add(9);
   list2.add(21);
  // System.out.println(list2);

   List<Integer> vector = new Vector<>();
vector.add(77);
vector.add(43);
vector.add(85);
vector.add(24);
System.out.println(vector);
    }
}
