class Vehicle {
   String color;
   int speed;
   int capacity;
   void attributes() 
   {
      System.out.println("Color : " + color);
      System.out.println("Speed : " + speed);
      System.out.println("Capacity : " + capacity);
   }
}

// A subclass which extends for vehicle
class Car extends Vehicle {
   int cost;
   int gears;
   void attributescar() 
   {
      // The subclass refers to the members of the superclass
      System.out.println("Color of Car : " + color);
      System.out.println("Speed of Car : " + speed);
      System.out.println("Capacity of Car : " + capacity);
      System.out.println("Cost of Car : " + cost);
      System.out.println("No of gears of Car : " + gears);
   }
}
public class Test {
   public static void main(String args[]) 
   {
      Car b1 = new Car();
      b1.color = "Blue";
      b1.speed = 200 ;
      b1.capacity = 4;
      b1.cost = 1000;
      b1.gears = 5;
      b1.attributescar();
   }
}


