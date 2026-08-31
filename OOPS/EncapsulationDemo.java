class Student{
    private String name;
    private int age;
    private double marks;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>=0){
        this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
    public void setMarks(double marks){
        if(marks>=0 && marks<=100){
        this.marks = marks;
        }
    }

    public double getMarks(){
        return marks;
    }

}

// public class EncapsulationDemo {
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.setName("Rahul");
//         s1.setAge(21);
//         s1.setMarks(85);

//         System.out.println(s1.getName());
//         System.out.println(s1.getAge());
//         System.out.println(s1.getMarks());
//     }
    
// }

class BankAccount{
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
          balance = balance+amount;
        }
    }


    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
          balance = balance - amount;
        }
    }
}
 
    public class EncapsulationDemo{
        public static void main(String[] args){
         
            BankAccount b1 = new BankAccount("Rahul",5000);

            b1.deposit(2000);
            b1.withdraw(1500);

            System.out.println(b1.getBalance());
        }
    }



