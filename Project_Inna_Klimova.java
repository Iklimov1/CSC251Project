import java.util.*;

public class Project_Inna_Klimova
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      // initialize variables
      int policyNum = 0;
      int PHage = 0;
      double PHheight = 0.0;
      double PHweight = 0.0;
      
      String providerName = "";
      String PHfirstName = "";
      String PHlastName = "";
      String PHsmokeStatus = "";

     // get user data for class
      System.out.print("\nPlease enter the Policy Number: ");
      policyNum = Integer.parseInt(keyboard.nextLine());
      
      System.out.print("\nPlease enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      PHfirstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      PHlastName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      PHage = Integer.parseInt(keyboard.nextLine());
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status(smoker/non-smoker): ");
      PHsmokeStatus = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Height: ");
      PHheight = Float.parseFloat(keyboard.nextLine());
      
      System.out.print("\nPlease enter the Policyholder's Weight: ");
      PHweight = keyboard.nextFloat();
  
      // initialize new Policy class
      Policy policy = new Policy(policyNum, PHage, PHweight, PHheight, PHsmokeStatus, providerName, PHfirstName, PHlastName);

      System.out.println("Policy Number: "+ policy.getpolicyNum());
      System.out.println("Provider Name: "+ policy.getproviderName());
      System.out.println("PolicyHolder's First Name: "+ policy.getPHfirstName());
      System.out.println("PolicyHolder's Last Name: "+ policy.getPHlastName());
      System.out.println("PolicyHolder's Age: "+ policy.getPHage());
      System.out.println("PolicyHolder's Smoking Status: "+policy.getPHsmokeStatus());
      System.out.printf("Policyholder's Height: %,.1f\n", policy.getPHheight());
      System.out.printf("Policyholder's Weight: %,.1f\n",policy.getPHweight());
      System.out.printf("Policyholder's BMI: %,.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%,.2f\n", policy.getPolicyCost(policy.getBMI()));
 
   }
}