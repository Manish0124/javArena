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

    Student random = new Student(mk);
    System.out.println(random.name);

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

  Student(){
  this.roll = 13;
  this.name = "sinchin";
  this.marks = 34.f;
  }

  Student(Student other){
     this.roll = other.roll;
     this.name = other.name;
     this.marks = other.marks;
  }

}