package pack.ExceptionHandle;

public class Main {
public static void main(String[] args) {
    // int a = 5;
    // int b = 0;
    try{
    //divide(a,b);
    //mimicing
   // throw new Exception("Just for fun");
    String name = "Arshia";
    if(name.equals("Arshia")){
        throw new MyException("name is correct");
    }
    } catch (MyException e){
System.out.println(e.getMessage());
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());  // catch error if arithmetic else got to normal
    }
    catch(Exception e){  // if error occurs it catches it and give the message
        System.out.println("Normal exception");
    }   finally{
        System.out.println("this will always be executed");
    }
}
static int divide(int a,int b) throws ArithmeticException{ // used to declare excep.
    if(b==0){
        throw new ArithmeticException("please donot divide by zero");
    }
    return a/b;
}
}
