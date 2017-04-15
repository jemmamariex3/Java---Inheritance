/*
Jemma Tiongson
Section #16031
App: Driver.java (Inheritance App)
Purpose: Demonstrate ability to use inheritance
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java Dog.java (all other dog classes)
   Run: java Driver
_________________________________________________________________________
*/
public class Dog //parent class
{
   private String name;
   private final int speed = 5; // default speed in mph
   private final String size = "Normal"; // default size
   private final String color = "White"; // default color
   
   public Dog() {
      name = "Chance";
   }
   
   public Dog(String name) {
      this.name = name;
   }
   
   public String getName() {
      return name;
   }
   
   public String bark() {
      return "Woof";
   }
   
   public String getColor() {
      return color;
   }
   
   public int getSpeed() {
      return speed;
   }
   
   public String getSize() {
      return size;
   }
}