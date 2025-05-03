package oops.part3.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight  = -1;
        // this.w ;
    }

    public BoxWeight(double side , double  weight){
        super(side);
        this.weight = weight;
    }


    public BoxWeight(double l , double w , double h , double weight ){
        super(l , w , h); // what is this ? this is call the parent class constructor
        // used to initialise value present in parent class
        
        this.weight  = weight;
        

    }
}
