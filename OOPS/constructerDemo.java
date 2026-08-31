class Mobile{
    String brand;
    String model;
    int price;

    Mobile(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("price: "+price);
    }
}


// public class constructerDemo {
//     public static void main(String[] args) {
//         Mobile m1 = new Mobile("Samsung","Galaxy S24",50000);
//         Mobile m2 = new Mobile("Apple","iPhone 15",60000);

//         m1.displayDetails();

//         m2.displayDetails();
//     }
    
// }


class BankAccount{
    String accountHolder;
    String accountNumber;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
    }

    BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);

    }
}

public class constructerDemo{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rahul", "ACC101", 5000);

        b1.deposit(2000);

        b1.displayAccount();
    }
}