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
class Pug extends Dog {
   public Pug(String name) {
      super(name);
   }
   public String bark() {
      return "WooF";
   }
   
   public String getColor() {
      return "beige";
   }
   
   
   public String getSize() {
      return "Small";
   }
}