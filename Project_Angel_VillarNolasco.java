import java.util.Scanner;
import java.util.ArrayList;

public class Project_Angel_VillarNolasco {
   public static void main(String[] args) {
      // defining the objects to be used later
      Scanner scanObj = new Scanner(System.in); // new scanner object: "scanObj"
      ArrayList<Policy> policyList = new ArrayList<Policy>(); // new array list of the policy class: "policylist"

      // main class variables to be used on the Policy class
      String provider = "";
      String name = "";
      String lName = ""; 
      int age = 0;
      boolean smoking = false;
      double height = 0.00;
      double weight = 0.00;
      int bmi = 0;
      double price = 0.0;

      // main class looping variables
      boolean repeat = false;

      // main loop
      while (!repeat) {
         System.out.print("please input the policy holder's name:");
         name = scanObj.nextLine();

         System.out.print("please input the policy holder's last name:");
         lName = scanObj.nextLine();

         System.out.print("please input the policy holder's age:");
         age = scanObj.nextInt();
         scanObj.nextLine(); // Consume the newline

         System.out.print("does the policy holder smoke <Y/N>:");
         if (scanObj.nextLine().equalsIgnoreCase("Y")) {
            smoking = true;
         } else if (scanObj.nextLine().equalsIgnoreCase("N")) {
            smoking = false;
         }
         scanObj.nextLine();// Consume the newline

         System.out.print("please input the policy holder's height:");
         height = scanObj.nextDouble();
         scanObj.nextLine(); // Consume the newline

         System.out.print("please input the policy holder's weight:");
         weight = scanObj.nextInt();
         scanObj.nextLine(); // Consume the newline

         System.out.print("please input the policy holder's BMI:");
         bmi = scanObj.nextInt();
         scanObj.nextLine(); // Consume the newline

         Policy customerPolicy = new Policy(provider, name, lName, age, smoking, height, weight, bmi, price);
         policyList.add(customerPolicy);

         System.out.print("do you want to register another customer <Y/N>:");
         if (scanObj.nextLine().equalsIgnoreCase("Y")) {
            repeat = false;
         } else if (scanObj.nextLine().equalsIgnoreCase("N")) {
            repeat = true;
         }
      }
   }
}
