class Driver {
   
   public static void main(String[] args) {
      //default name
      String huskyName = "Lucky";
      Husky myHusky = new Husky(huskyName);
      System.out.println("My husky's name is "+myHusky.getName());
      System.out.println(myHusky.getName()+ "'s bark goes like " +myHusky.bark());
      System.out.println("He is "+myHusky.getColor());
      System.out.println(myHusky.getName()+ "'s speed is "+myHusky.getSpeed());
      System.out.println("He is a "+myHusky.getSize()+" dog.");
      System.out.println("__________________________________");
   
      //default bark
      String chowName = "Simba";
      ChowChow myChow = new ChowChow(chowName);
      System.out.println("My ChowChow's name is "+myChow.getName());
      System.out.println(chowName+ "'s bark goes like " +myChow.bark());
      System.out.println("He is "+myChow.getColor());
      System.out.println(chowName+ "'s speed is "+myChow.getSpeed());
      System.out.println("He is a "+myChow.getSize()+" dog.");
      System.out.println("__________________________________");
   
      //default size
      String dachshundName = "Slinky";
      Dachshund myDachshund = new Dachshund(dachshundName);
      System.out.println("My dachshund's name is "+myDachshund.getName());
      System.out.println(dachshundName+ "'s bark goes like " +myDachshund.bark());
      System.out.println("He is "+myDachshund.getColor());
      System.out.println(dachshundName+ "'s speed is "+myDachshund.getSpeed());
      System.out.println("He is a "+myDachshund.getSize()+" dog.");
      System.out.println("__________________________________");
   
      //default color
      String germanShepardName = "Bolt";
      GermanShepard myGermanShepard = new GermanShepard(germanShepardName);
      System.out.println("My German Shepard's name is "+myGermanShepard.getName());
      System.out.println(germanShepardName+ "'s bark goes like " +myGermanShepard.bark());
      System.out.println("He is "+myGermanShepard.getColor());
      System.out.println(germanShepardName+ "'s speed is "+myGermanShepard.getSpeed());
      System.out.println("He is a "+myGermanShepard.getSize()+" dog.");
      System.out.println("__________________________________");
   
      //default speed
      String pugName = "Buster";
      Pug myPug = new Pug(pugName);
      System.out.println("My pug's name is "+myPug.getName());
      System.out.println(pugName+ "'s bark goes like " +myPug.bark());
      System.out.println("He is "+myPug.getColor());
      System.out.println(pugName+ "'s speed is "+myPug.getSpeed());
      System.out.println("He is a "+myPug.getSize()+" dog.");
   }
   
}
