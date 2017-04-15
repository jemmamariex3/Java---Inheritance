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
class Dachshund extends Dog {
   public Dachshund(String name) {
      super(name);
   }
   public String bark() {
      return "woof";
   }
   
   public String getColor() {
      return "brown and black";
   }
   
   public int getSpeed() {
      return 3;
   }
   
}