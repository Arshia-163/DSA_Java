package pack.polymorphism;
//Static polymorphism
public class Numbers {

    int sum (int a,int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(0, 0);
        obj.sum(4,6,2);
    }
}
