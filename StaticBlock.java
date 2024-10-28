package pack;
// intialisation of static variables

public class StaticBlock {
static int a =4;
static int b;

// will only run once 
static{
    System.out.println("I am static");
    b = a*5;
}

public static void main(String[] args) {
    StaticBlock obj = new StaticBlock();
    System.out.println(StaticBlock.a + " "+StaticBlock.b);
    StaticBlock.b += 3;
    System.out.println(StaticBlock.a + " "+StaticBlock.b);
    StaticBlock obj2 = new StaticBlock();
    System.out.println(StaticBlock.a + " "+StaticBlock.b);
}
}
