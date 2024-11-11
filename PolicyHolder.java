public class PolicyHolder{

   /**
   INSTANCE VARIABLES
   **/
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;


   /**
   NO-ARG CONSTRUCTOR
   **/
   public PolicyHolder(){
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   
   /**
   POLICY HOLDER CONSTRUCTOR
   **/
   public PolicyHolder(String fn, String ln, int a, String ss, double h, double w){
      firstName = fn;
      lastName = ln;
      age = a;
      smokingStatus = ss;
      height = h;
      weight = w;
   }
   
   /**
   INSTANCE METHODS
   GETTERS
   **/
   public String getFirstName(){ //get policy holder first name
   return firstName;
   }
   public String getLastName(){ //get policy holder last name
   return lastName;
   }
   public int getAge(){ //get policy holder age
   return age;
   }
   public String getSmokingStatus(){ //get policy holder smoking status
   return smokingStatus;
   }
   public double getHeight(){ //get policy holder height
   return height;
   }
   public double getWeight(){ //get policy holder weight
   return weight;
   }
   
   /**
   INSTANCE METHODS
   SETTERS
   **/
   public void setFirstName(String fn){ //set policy holder first name
   firstName = fn;
   }
   public void setLastName(String ln){ //set policy holder last name
   lastName = ln;
   }
   public void setAge(int a){ //set policy holder age
   age = a;
   }
   public void setSmokingStatus(String ss){ //set policy holder smoking status
   smokingStatus = ss;
   }
   public void setHeight(double h){ //set policy holder height
   height = h;
   }
   public void setWeight(double w){ //set policy holder weight
   weight = w;
   }

}