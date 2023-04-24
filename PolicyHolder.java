public class PolicyHolder
{   
   private String PHfirstName;
   private String PHlastName;
   private String PHsmokeStatus;
   private int PHage;
   private double PHheight;
   private double PHweight;
   
   public PolicyHolder()
   {
      this.PHfirstName = "";
      this.PHlastName = "";
      this.PHsmokeStatus = "non-smoker";
      this.PHage = 0;
      this.PHheight = 0.0;
      this.PHweight = 0.0;
      

   }


   public PolicyHolder(String PHfirstName, String PHlastName, String PHsmokeStatus, int PHage, double PHheight, double PHweight)
   {
      //all instance fields
      this.PHfirstName = PHfirstName;
      this.PHlastName = PHlastName;
      this.PHsmokeStatus = PHsmokeStatus;
      this.PHage = PHage;
      this.PHheight = PHheight;
      this.PHweight = PHweight;
      
      
   }
      
   
   //setters
   /** @param PHfirstName is the policyholder's first name*/
    public void setPHfirstName(String PHfirstName)//mutator method
   {
      this.PHfirstName = PHfirstName;
   }
   /** @param PHlastName is the policyholder's last name */
    public void setPHlastName(String PHlastName)//mutator method
   {
       this.PHlastName = PHlastName;
   }
   /** @param PHsmokeStatus is the policyholder's smoking status (smoker/non-smoker)*/
    public void setPHsmokeStatus(String PHsmokeStatus)//mutator method
   {
       this.PHsmokeStatus = PHsmokeStatus;   

   }
   /** @param PHAge the age */
    public void setPHage(int PHage)//mutator method
   {
      this.PHage = PHage;
   }
   /** @param PHheight the height in inches*/
    public void setPHheight(int PHheight)//mutator method
   {
      this.PHheight = PHheight;
   }
   /** @param PHweight the weight in pounds */
    public void setPHweight(double PHweight)//mutator method
   {
      this.PHweight = PHweight;
   }
   
   //getters
   
   /** @return the policy holders's first name */
    public String getPHfirstName()
   {
      return PHfirstName;
   }
  /** @return the policy holders's last name */
    public String getPHlastName()
   {
       return PHlastName;
   }
  /** @return the smoke status */
    public String getPHsmokeStatus()
   {
       return PHsmokeStatus;   
   }
   /** @return the policy holders's age */
    public int getPHage()
   {
      return PHage;
   }
  /** @return the policy holders's height in inches*/
    public double getPHheight()
   {
      return PHheight;
   }
  /** @return the policy holders's weight */ 
    public double getPHweight()
   {
      return PHweight;
   }

   /** @return the BMI */
   public double getBMI()
   {
      return ((PHweight * 703) / (PHheight* PHheight));
   }
     //creating toString method 
   public String toString()
   {
   String total = "";
      total += "Policyholder's First Name: "+ this.PHfirstName +"\n";
      total += "Policyholder's Last Name: "+ this.PHlastName +"\n";
      total += "Policyholder's Age: "+this.PHage +"\n";
      total += "Policyholder's Smoking Status (Y/N): "+ this.PHsmokeStatus +"\n";
      total += "Policyholder's Height: "+ String.format("%,.1f\n"+ this.PHheight) + " inches"; 
      total += "Policyholder's Weight: "+ String.format("%,.1f\n"+ this.PHweight) + " pounds";
      total += "Policyholder's BMI: "+String.format("%,.2f\n",this.getBMI());
      return total; 
   }  
   

}