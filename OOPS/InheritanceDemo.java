class Animal{
    String name;

    void eat(){
        System.out.println(name + " is eating");
    }
    }

    class Dog extends Animal{
          void bark(){
            System.out.println(name + " is barking");
          }
    }


// public class InheritanceDemo{
//        public static void main(String[] args) {
//            Dog d1 = new Dog();
//            d1.name = "Bruno";

//            d1.eat();
//            d1.bark();
//        }
// }


class Person{
    String name;
    int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    void displayPerson(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        }
}

class Student extends Person{
    int rollNo;
    String course;

    Student(String name, int age, int rollNo, String course){
    super(name, age);
    this.rollNo = rollNo;
    this.course = course;
}

    void displayStudent(){
        System.out.println("Roll No: " +rollNo);
        System.out.println("Course: " +course);

    }
}



public class InheritanceDemo{
    public static void main(String[] args) {
        
        Student s1 = new Student("Rahul", 21, 101, "CSE");

        s1.displayPerson();
        s1.displayStudent();

    }

}