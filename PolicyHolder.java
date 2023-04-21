import java.util.*;
public class PolicyHolder
{   
   private String PHfirstName;
   private String PHlastName;
   private String PHsmokeStatus;
   private int PHage;
   private double PHheight;
   private double PHweight;


   public PolicyHolder(String PHfirstName, String PHlastName, String PHsmokeStatus, int PHage, double PHheight, double PHweight)
   {
      //all instance fields
      PHfirstName = "";
      PHlastName = "";
      PHsmokeStatus = "non-smoker";
      PHage = 0;
      PHheight = 0;
      PHweight = 0;
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
   /** @return the policy cost */
   public double getPolicyCost(double BMI) //need BMI info in this method.
   {
      double policyCost = 600.0;
     //using if statements to calculate extra fees.
     if (PHage > 50)
     {
      policyCost = (policyCost + 75);
     }
     if (PHsmokeStatus.equalsIgnoreCase("smoker"))
     {
      policyCost += 100;
     }
     if (getBMI() > 35)
     {
      policyCost = (policyCost + ((getBMI() - 35)*20));
     }
     return(policyCost);
     
   }

}