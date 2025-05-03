package oops.part3.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(4.5);
        // Box box2 = new Box(box);

        // System.out.println(box.l + " " + box.w + " " + box.h);
        // BoxWeight boxweight = new BoxWeight();

        // BoxWeight box4 = new BoxWeight(3,5,7, 45);

        // System.out.println(boxweight.weight + " " + boxweight.w);
       
        Box box5 = new BoxWeight(3, 4, 5,8);

        System.out.println(box5.w);


        //there are many variable in both parent and child classes
        //you are given the access to variable that are ref type i.e BoxWeight 
        // hence , you should have access the weight variable
        //this also mean , that the one , you are trying to access  should be initalised 
        // but here, when the obj is of type parent class , how will you call the constructor of the child class 
        //thats why error

       
        BoxPrice box = new BoxPrice(2,5,8);
        


    }
}
