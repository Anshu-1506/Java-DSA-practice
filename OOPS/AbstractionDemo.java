abstract class Shape{
  abstract void area();
  void display(){
    System.out.println("This is a shape");
  }
}

class Circle extends Shape{
    double radius;
    void area(){
    System.out.println(3.14*radius*radius);
  }

  Circle(double radius){
    this.radius = radius;
}
}


// public class AbstractionDemo {
//     public static void main(String[] args){
    
//         Shape s = new Circle(5);
//         s.area();
//         s.display();
//     }
// }


interface Payment{
    void pay();
}

class UPI implements Payment{
    public void pay(){
    System.out.println("Payment through UPI");
    }

}

class Card implements Payment{
    public void pay(){
    System.out.println("Payment through Card");
    }

}

public class AbstractionDemo {
       public static void main(String[] args){
       
        Payment p1 = new UPI();
        Payment p2 = new Card();

        p1.pay();
        p2.pay();


    }
}
