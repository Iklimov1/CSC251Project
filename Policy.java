
public class Policy
{
      //all instance fields
      private int policyNum;      
      private String providerName;
      private PolicyHolder policyholder;
      private static int policyCounter;
      
     
     
         
   // constructor that doesn't accept arguments
   /**
   @param policyNum is policyNum
   @param providerName is providerName
   */
   
   
   public Policy()
   {
     this.policyNum = 0;
     this.providerName = "";
     this.policyholder = new PolicyHolder();
     policyCounter += 1;
     
   }
   
   //static method
   
   /**
   @return the number of the policy objects created
   */
   public static int getPolicyCounter()
   {
      return policyCounter;
   }
   //constructor that accepts arguments
   public Policy(int policyNum,String providerName,PolicyHolder holder)
   {
      this.policyNum = policyNum;
      /**
      */
      this.providerName =providerName;
      /**      */   
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
   
   /** @return the policy cost */
   public double getPolicyCost()
   {
      double policyCost = 600.0;
     //using if statements to calculate extra fees.
     if (this.policyholder.getPHage > 50)
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

  //creating toString method 
   public String toString()
   {
   String total = "";
      total += "Policy Number: "+ policyNum + "\n";
      total += "Provider Name: " + providerName + "\n";
      total += policyholder;
      total += "Policy Price: "+String.format("$%.2f\n",getPolicyCost()); 
       return total;
   }  
     
}