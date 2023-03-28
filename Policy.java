import java.util.*;

public class Policy
{
      //all instance fields
      private int policyNum;
      private int PHage;
      private double PHheight;
      private double PHweight;
      
      private String providerName;
      private String PHfirstName;
      private String PHlastName;
      private String PHsmokeStatus;

   
   // no-arg constructor
   public Policy()
   {
     policyNum = 0;
     PHage = 0;
     PHheight = 0;
     PHweight = 0;
      
     providerName = "";
     PHfirstName = "";
     PHlastName = "";
     PHsmokeStatus = "non-smoker";
   }
   //constructor that accepts arguments
   public Policy(int policyNum, int PHage, double PHweight, double PHheight, String PHsmokeStatus, String providerName, String PHfirstName, String PHlastName)
   {
      this.policyNum = policyNum;
      this.PHage = PHage;
      this.PHheight = PHheight;
      this.PHweight = PHweight;
      this.providerName =providerName;
      this.PHfirstName = PHfirstName;
      this.PHlastName = PHlastName;
      this.PHsmokeStatus = PHsmokeStatus;   
   }
   
    public void setpolicyNum(int policyName)//mutator method
   {
      this.policyNum = policyNum;
   }
  public void setPHage(int PHage)//mutator method
   {
      this.PHage = PHage;
   }
    public void setPHheight(int PHheight)//mutator method
   {
      this.PHheight = PHheight;
   }
    public void setPHweight(double PHweight)//mutator method
   {
      this.PHweight = PHweight;
   }
   
   
    public void setproviderName(String providerName)//mutator method
   {
      this.providerName =providerName;
   }
    public void setPHfirstName(String PHfirstName)//mutator method
   {
      this.PHfirstName = PHfirstName;
   }
    public void setPHlastName(String PHlastName)//mutator method
   {
       this.PHlastName = PHlastName;
   }
    public void setPHsmokeStatus(String PHsmokeStatus)//mutator method
   {
       this.PHsmokeStatus = PHsmokeStatus;   

   }
   
   
      public int getpolicyNum()//accessor method
   {
      return policyNum;
   }
   
  public int getPHage()//accessor method
   {
      return PHage;
   }
   
   public double getPHheight()//accessor method
   {
      return PHheight;
   }
   
   public double getPHweight()//accessor method
   {
      return PHweight;
   }
   
   
    public String getproviderName()//accessor method
   {
      return providerName;
   }
    public String getPHfirstName()//accessor method
   {
      return PHfirstName;
   }
    public String getPHlastName()//accessor method
   {
       return PHlastName;
   }
    public String getPHsmokeStatus()//accessor method
   {
       return PHsmokeStatus;   

   }
   
   public double getBMI()
   {
      return ((PHweight * 703) / (PHheight* PHheight));
   }
   
   public double getPolicyCost(double BMI) //need BMI info in this method.
   {
      double policyCost = 600.0;
     //using if statements to calculate extra fees.
     if (PHage > 50)
     {
      policyCost = (policyCost + 75);
     }
     if (PHsmokeStatus == "smoker")
     {
      policyCost = (policyCost + 100);
     }
     if (BMI > 35)
     {
      policyCost = (policyCost + ((BMI - 35)*20));
     }
     return(policyCost);
     
   }
   
}