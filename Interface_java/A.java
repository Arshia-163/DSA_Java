package pack.Interface_java;

public interface A {

//static interface methods should always have a body
// cal via the interface name;
static void greeting(){
  System.out.println("Hey,I am static ");
}

  default  void fun(){
    System.out.println("I am in default method");
  }
}
