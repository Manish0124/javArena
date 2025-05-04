package oops.part5.abstractDemo;

public class Main {

public static void main(String[] args) {
        
    Son son = new Son(13);
    son.career();

    // son.career();

    Daughter daughter = new Daughter(11);

    daughter.career();
    Parent.hello();
}

    
}
