public class Policy{
   
   /** 
   INSTANCE VARIABLES
   
   the 'p' in front of the variable names stands for policy. 
   I got tired of writting it over and over
   **/
   private String pProviderName;
   private String pNumber;
   private String pHolderFirstName;
   private String pHolderLastName;
   private int pHolderAge;
   private String pHolderSmokingStatus;
   private double pHolderHeight;
   private double pHolderWeight;
   
   /** 
   NO-ARG CONSTRUCTOR
   
   now it actually initializes the variables
   **/
   public Policy(){
   
   pProviderName = "";
   pNumber = "";
   pHolderFirstName = "";
   pHolderLastName = "";
   pHolderAge = 0;
   pHolderSmokingStatus = "";
   pHolderHeight = 0.00;
   pHolderWeight = 0.00;
   }
   
   /**
   POLICY CONSTRUCTOR
   
   imports values from the main method and set them to their respective counter parts
   **/
   public Policy(String pPName, String number, String pHFName, String pHLName,int pHAge, String pHSStatus, double pHHeight, double pHWeight){
      pProviderName = pPName;              //policy provider name
      pNumber = number;                    //policy number
      pHolderFirstName = pHFName;          //policy holder first name
      pHolderLastName = pHLName;           //policy holder last name
      pHolderAge = pHAge;                  //policy holder age
      pHolderSmokingStatus = pHSStatus;    //policy holder smoking status
      pHolderHeight = pHHeight;            //policy holder height
      pHolderWeight = pHWeight;            //policy holder weight
   }
   
   /**
   INSTANCE METHODS
   
   get(something)
   **/
   public String getPProviderName(){ //get policy provider name
   return pProviderName;
   }
   public String getPNumber(){ //get policy number
   return pNumber;
   }
   public String getPHolderFirstName(){ //get policy holder first name
   return pHolderFirstName;
   }
   public String getPHolderLastName(){ //get policy holder last name
   return pHolderLastName;
   }
   public int getPHolderAge(){ //get policy holder age
   return pHolderAge;
   }
   public String getPHolderSmokingStatus(){ //get policy holder smoking status
   return pHolderSmokingStatus;
   }
   public double getPHolderHeight(){ //get policy holder height
   return pHolderHeight;
   }
   public double getPHolderWeight(){ //get policy holder weight
   return pHolderWeight;
   }  
   
   /**
   INSTANCE METHODS
   
   set(something)
   **/
   public void setPProviderName(String pPName){ //set policy provider name
   pProviderName = pPName;
   }
   public void setPNumber(String number){ //set policy number
   pNumber = number;
   }
   public void setPHolderFirstName(String pHFName){ //set policy holder first name
   pHolderFirstName = pHFName;
   }
   public void setPHolderLastName(String pHLName){ //set policy holder last name
   pHolderLastName = pHLName;
   }
   public void setPHolderAge(int pHAge){ //set policy holder age
   pHolderAge = pHAge;
   }
   public void setPHolderSmokingStatus(String pHSStatus){ //set policy holder smoking status
   pHolderSmokingStatus = pHSStatus;
   }
   public void setPHolderHeight(double pHHeight){ //set policy holder height
   pHolderHeight = pHHeight;
   }
   public void setPHolderWeight(double pHWeight){ //set policy holder weight
   pHolderWeight = pHWeight;
   }
   
   /**
   BMI CALCULATOR
   **/
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (pHolderWeight * CONVFACTOR) / (pHolderHeight * pHolderHeight);
   }
   /**
   POLICY PRICE CALCULATOR
   **/
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(pHolderAge > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(pHolderSmokingStatus.equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(getBMI() > BMI_THRESHOLD)
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }
}