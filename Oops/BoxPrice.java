package pack.oops;

public class BoxPrice extends Box_oop  {
    double cost;
    BoxPrice(){
        super();
        this.cost = -1;

    }
    BoxPrice(BoxPrice old){
        super(old);
        this.cost = old.cost;
    }
   public  BoxPrice(double l,double h,double w,double weight,double cost){
 super(l, h, w, weight);
 this.cost  = cost;
    }

    public BoxPrice(double side, double weight,double cost){
        super(side,weight); // taken from parent class
        this.cost = cost;
    }
}
