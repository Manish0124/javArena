package oops.part3.polymorphism;

import oops.part3.inheritance.Box;

public class Main {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        // circle.area();
        Box.greeting();
    }
}



//you can prevent the overriding and inheritance just by adding final keyword