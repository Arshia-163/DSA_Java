package pack;

import java.util.ArrayList;

public class Box_oop extends Oops3{
// this way using extend keyword you can inherit prop.

double weight;
public Box_oop(){ //constructor
this.weight = -2;
}

Box_oop(Box_oop other){
super(other);
weight = other.weight;
}
public Box_oop(double l,double h,double w,double weight){
    super(l,h,w); // use to intialize value in parent class constructor in oops3 
    this.weight = weight;
        }
        public Box_oop(double side,double weight){
            super(side);
            this.weight = weight;
        }

static void greeting(){
    System.out.println("Hey,I am in BoxWeight");
    ArrayList list = new ArrayList<>();
    
}


    }