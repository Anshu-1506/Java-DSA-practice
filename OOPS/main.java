class Student{
    String name;
    int age;
    int rollNo;


void study(){
    System.out.println(name + " is studying");
}
}

// public class main{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.name = "Anshuman";
//         s1.age = 22;
//         s1.rollNo = 51;

//         s2.name = "Ankur";
//         s2.age = 24;
//         s2.rollNo = 34;
    
       
//        System.out.println(s2.name);
//        System.out.println(s2.age);

//        s2.study();
// }
// }

class bankAccount{
    String accountNumber;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
    }

    void showBalance(){
        System.out.println("Balance: "+balance);
    }
}

// public class main{
//     public static void main(String[] args){
//         bankAccount account = new bankAccount();
//         account.accountNumber = "12345";
//         account.balance = 5000;

//         account.deposit(2000);
//         account.showBalance();
//     }
// }

class Employee{
    String name;
    double salary;
    String department;

    void displayDetails(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(department);
    }
}

// public class main{
//     public static void main(String[] args){
//     Employee e1 = new Employee();
//     e1.name = "Rahul";
//     e1.salary = 25000;
//     e1.department = "IT";

//     Employee e2 = new Employee();
//     e2.name = "Ankit";
//     e2.salary = 45000;
//     e2.department = "HR";

//     e1.displayDetails();
//     e2.displayDetails();
// }
// }

class Mobile{
    String brand;
    String model;
    int price;

    void call(){
        System.out.println(brand +" is calling...");
    }
    void displayDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}

public class main{
    public static void main(String[] args){
      Mobile m1 = new Mobile();
      m1.brand = "Samsung";
      m1.model = "Galaxy S24";
      m1.price = 50000;

      m1.displayDetails();
      m1.call();
    }
}