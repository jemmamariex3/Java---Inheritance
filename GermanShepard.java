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
class GermanShepard extends Dog {
   public GermanShepard(String name) {
      super(name);
   }
   public String bark() {
      return "WOOF";
   }
      
   public int getSpeed() {
      return 10;
   }
   
   public String getSize() {
      return "Medium";
   }
}