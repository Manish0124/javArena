package oops.part3.inheritance;

public class BoxPrice extends BoxWeight {
    double coast ;


    BoxPrice(){
        super();
        this.coast = -1;
        
    }

    BoxPrice(BoxPrice other){
        this.coast = other.coast;
    }

    public BoxPrice(double l, double w, double h, double weight , double coast){
       super(l , w, h , weight);
       this.coast = coast;

    }

    public BoxPrice(double side , double weight , double coast){
       super(side, weight);
       this.coast = coast;
    }



}
