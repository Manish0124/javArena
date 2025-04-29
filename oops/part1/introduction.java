package oops.part1;

public class introduction {

    public static void main(String[] args) {
        
    Student[] students = new Student[5];
    
    Student mk = new Student();


    // mk.roll =  12;
    // mk.name =  "sinchin";
    // mk.marks =  12.3f;

    System.out.println(mk.roll);
    System.out.println(mk.name);
    System.out.println(mk.marks);
     
    mk.changeName("ff player");
    mk.greeting();


    

    // Student random = new Student(mk);
    // System.out.println(random.name);
    
    
    Student one = new Student();

    Student two = one;

    one.name = "jj";

    System.out.println(two.name);


    

    }

    



}



// definying a class

//class is the template of the object
//object are the instance of class
 
class Student {
    int roll;
    String name;
    float marks;

    



    void greeting(){
        System.out.println("my name is ! " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }

  //constructor 

  Student () {
//   this.roll = 13;
//   this.name = "sinchin";
//   this.marks = 34.f;

// this is how you call a constructor from a another constructor


this(0, "Default Name", 0.0f); 

  }

  Student(Student other){
     this.roll = other.roll;
     this.name = other.name;
     this.marks = other.marks;
  }

  Student(int roll, String name, float marks) {
    this.roll = roll;
    this.name = name;
    this.marks = marks;
}


}