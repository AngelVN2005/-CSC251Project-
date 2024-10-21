public class Policy{
   
   // policy class instance variables
   String policyProvider;
   String policyHolderName;
   String policyHolderLastName;
   int policyHolderAge;
   boolean policyHolderSmoking;
   double policyHolderHeight;
   double policyHolderWeight;
   int policyHolderBMI;
   double policyPrice;
   
   //no arg constructor
   private Policy(){
   
   }
   
   // policy constructor
   public Policy(String provider, String name, String lName, int age, boolean smoking, double height, double weight, int bmi, double price){
   
   policyProvider = provider;
   policyHolderName = name;
   policyHolderLastName = lName;
   policyHolderAge = age;
   policyHolderSmoking = smoking; 
   policyHolderHeight = height;
   policyHolderWeight = weight;
   policyHolderBMI = bmi;
   policyPrice = price;
   
   }
   
}