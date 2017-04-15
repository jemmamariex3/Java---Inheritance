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
class ChowChow extends Dog {
   public ChowChow(String name) {
      super(name);
   }

   public String getColor() {
      return "White";
   }
   
   public int getSpeed() {
      return 6;
   }
   
   public String getSize() {
      return "large";
   }
}