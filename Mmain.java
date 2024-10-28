package pack;

public class Mmain {
    public static void main(String[] args) {
        Oops3 Box = new Oops3(); // this will call the const. with no argument
System.out.println(Box.l+" "+Box.h+" "+Box.w);

Box.getL();

//const which takes only one argument
Oops3 box = new Oops3(4);
System.out.println(box.l+" "+box.h+" "+box.w);

//which takes a box as argument
Oops3 box1 = new Oops3(2.3,4.2,5.1);
Oops3 box2 = new Oops3(box1);
System.out.println(box2.l+" "+box2.h+" "+box2.w);


//if we create a new box with additional property
Box_oop box3 = new Box_oop();
Box_oop box4 = new Box_oop(3,6.7,4.3,8);
System.out.println(box3.l+" "+box3.h+" "+box3.weight);

Box_oop box5 = new Box_oop(2,1.3,5,7.6);

//there are many var. in both parent and child classes
//you are given access to var. that are in ref. type; BoxWeight in class Box_oop
// so, should have access to weight var. but, when the obj itself is of type parent class, 
//you cannot call it and error occur;

BoxPrice boxes = new BoxPrice(5,8,200);
System.out.println();


    }
}
