import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Angel_VillarNolasco {
   public static void main(String[] args) throws IOException {
   
      // variables
      String providerName, policyNumber, firstName, lastName, smokingStatus;
      int age, numSmokers = 0; 
      double height, weight; 
      
      // arraylist
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //making a text file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //reading the text file
      while(inputFile.hasNext()){
         providerName = inputFile.nextLine();
         policyNumber = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         // making sure not to read blank lines
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
         
         // adding each individual policy to the list
         policyList.add(new Policy(providerName, policyNumber, firstName, lastName, age, smokingStatus, height, weight));
      }
      
      // print the info of each policy
      for(Policy policy : policyList){
         System.out.println("Provider Name: " + policy.getPProviderName());
         System.out.println("Policy Number: " + policy.getPNumber());
         System.out.println("Policyholder's First Name: " + policy.getPHolderFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getPHolderLastName());
         System.out.println("Policyholder's Age: " + policy.getPHolderAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getPHolderSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getPHolderHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getPHolderWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
         System.out.println();
         
         if(policy.getPHolderSmokingStatus().equalsIgnoreCase("smoker"))//tracking the smokers
            numSmokers++;
      }
      
      //print the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
   
   }
}
