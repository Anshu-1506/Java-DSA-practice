class calculator{

    int multiply(int a, int b){
        return a*b;  
      }

      int multiply(int a, int b, int c){
        return a*b*c;
      }

      double multiply(double a, double b){
        return a*b;
      }
}

// public class PolyMorphism{
//     public static void main(String[] args){

//         calculator c = new calculator();
//         System.out.println(c.multiply(2,10));
//         System.out.println(c.multiply(2,3,10));
//         System.out.println(c.multiply(2.0,5.0));

//     }
// }



class Vehicle{
    void start(){
        System.out.println("Vehicle start");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts with self");
    }
}


public class PolyMorphism{
    public static void main(String[] args) {
        Vehicle v1  = new Car();
        v1.start();

        Vehicle v2 = new Bike();
        v2.start();
    }
}