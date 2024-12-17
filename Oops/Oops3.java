package pack.oops;

public class Oops3 {
    double l;
    double w;
    double h;
    Oops3(){ // constructor
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
    //cube
    Oops3(double side){//one argument
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Oops3(double l,double h ,double w){  // can be called in using super() in another box with add. property
        this.h = h;
        this.w = w;
        this.l = l;
    }
    Oops3( Oops3 box){  // copy constructor takes a box as argument
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
    }
    public void display(){
        System.out.println("running");
    }

}
