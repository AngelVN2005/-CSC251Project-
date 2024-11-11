public class Policy{
   
   /**
   STATIC CONSTANT FIELDS 
   
   these values will be used across all the policy objects created, without the need of setting new ones over and over
   **/ 
   private static final double CONVFACTOR = 703;
   private static final double BASE_PRICE = 600;
   private static final double ADDITIONAL_FEE_AGE = 75;
   private static final double ADDITIONAL_FEE_SMOKING = 100;
   private static final double ADDITIONAL_FEE_PER_BMI = 20;  
   private static final int AGE_THRESHOLD = 50;
   private static final int BMI_THRESHOLD = 35;
   
   /** 
   INSTANCE VARIABLES
   **/
   private String pProviderName;
   private String pNumber;
   private PolicyHolder policyHolder;
   
   /** 
   NO-ARG CONSTRUCTOR
   **/
   public Policy() { 
      pProviderName = ""; 
      pNumber = ""; 
      policyHolder = new PolicyHolder();
   }
   
   /**
   POLICY CONSTRUCTOR
   **/
   public Policy(String pPName, String number, PolicyHolder holder) { 
      pProviderName = pPName; 
      pNumber = number; 
      policyHolder = holder;
   }
   
   /**
   INSTANCE METHODS (GETTERS)
   **/
   public String getPProviderName() { 
      return pProviderName; 
   } 
   public String getPNumber() { 
      return pNumber; 
   } 
   public PolicyHolder getPolicyHolder() { 
      return policyHolder; 
   }  
   
   /**
   INSTANCE METHODS (SETTERS)
   **/
   public void setPProviderName(String pPName) { 
      pProviderName = pPName; 
   } 
   public void setPNumber(String number) { 
      pNumber = number; 
   } 
   public void setPolicyHolder(PolicyHolder holder) { 
      policyHolder = holder;
   }
   
   /**
   BMI CALCULATOR
   **/
   public double getBMI() { 
     return (policyHolder.getWeight() * CONVFACTOR) / (policyHolder.getHeight() * policyHolder.getHeight()); 
   }
   
   /**
   POLICY PRICE CALCULATOR
   **/
   public double getPrice() { 
      double price = BASE_PRICE;
         if (policyHolder.getAge() > AGE_THRESHOLD) price += ADDITIONAL_FEE_AGE; 
         if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) price += ADDITIONAL_FEE_SMOKING; 
         if (getBMI() > BMI_THRESHOLD) price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); 
      return price;
   }
}