package pack.oops;
import java.util.ArrayList;

//it expresses a func as a block of code without having to define a method;
public class lambdaFunc {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
       // arr.forEach((ele -> System.out.println(ele*2)));
       
       //Consumer<Integer> fun = (ele)->  System.out.println(ele*2);
       //arr.forEach(fun);

Operation sum = (a,b)->a+b;
Operation mul = (a,b)->a*b;
Operation div = (a,b)->a/b;
lambdaFunc  cal = new lambdaFunc();
System.out.println(cal.operate(6,3,sum));
System.out.println(cal.operate(6,3,mul));
    }
private int operate (int a,int b,Operation op){
    return op.opp(a, b);
}}
   
 interface Operation {
    int opp(int a,int b);
        
    
}
