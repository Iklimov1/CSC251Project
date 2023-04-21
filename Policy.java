import java.util.*;

public class Policy
{
      //all instance fields
      private int policyNum;      
      private String providerName;
         
   // no-arg constructor
   public Policy()
   {
     policyNum = 0;
     providerName = "";
     
   }
   //constructor that accepts arguments
   public Policy(int policyNum, int PHage, double PHweight, double PHheight, String PHsmokeStatus, String providerName, String PHfirstName, String PHlastName)
   {
      this.policyNum = policyNum;
      /**this.PHage = PHage;
      this.PHheight = PHheight;
      this.PHweight = PHweight;
      */
      this.providerName =providerName;
      /**this.PHfirstName = PHfirstName;
      this.PHlastName = PHlastName;
      this.PHsmokeStatus = PHsmokeStatus;
      */   
   }
   /** @param policyName the policy number */
    public void setpolicyNum(int policyName)//mutator method
   {
      this.policyNum = policyNum;
   }
      /** @param providerName the provider name */
    public void setproviderName(String providerName)//mutator method
   {
      this.providerName =providerName;
   }
      
   //accessor methods
  /** @return the policy number */
      public int getpolicyNum()
   {
      return policyNum;
   }
    /** @return the provider name */
    public String getproviderName()
   {
      return providerName;
   }
  
     
}