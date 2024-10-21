import java.util.Scanner;
import java.util.ArrayList;

public class Project_Angel_VillarNolasco {
   public static void main(String[]args){
   
   //defining the objects to be used later
   Scanner scanObj = new Scanner(System.in); // new scanner object: "scanObj"
   ArrayList<Policy> policyList = new ArrayList<Policy>(); // new array list of the policy class: "policylist"
   
   //main class variables to be used on the Policy class
   String provider = "";
   String name = ""; 
   String lName = "";
   int age = 0; 
   boolean smoking = false; 
   double height = 0.00; 
   double weight = 0.00; 
   int bmi = 0; 
   double price = 0;
   
   //main class looping variables
   boolean repeat;
   
   Policy customerPolicy = new Policy(provider, name, lName, age, smoking, height, weight, bmi, price);

   
   }
}