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
class Husky extends Dog {
   public Husky(String name) {
      super();
   }
   public String bark() {
      return "WOOOOOOFFF";
   }
   
   public String getColor() {
      return "grey";
   }
   
   public int getSpeed() {
      return 10;
   }
   
   public String getSize() {
      return "large";
   }
}