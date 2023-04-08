import java.io.*;
import java.util.*;
public class Project_Inna_Klimova
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      
      // initialize variables
      int policyNum = 0;
      int PHage = 0;
      
      String lineData = "";
      String providerName = "";
      String PHfirstName = "";
      String PHlastName = "";
      String PHsmokeStatus = "";
      
      double PHheight = 0.0;
      double PHweight = 0.0;
      
      File policyFile = new File("PolicyInformation.txt");
      
      if(!policyFile.exists())
      {
         System.out.println("File does not exist");
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(policyFile);
      
      ArrayList<Policy> policyList = new ArrayList<Policy>(); //policyList references ArrayList for policy objects.
      
      while(inputFile.hasNext())
      {
         lineData = inputFile.nextLine();
         policyNum = Integer.parseInt(lineData);
         
         providerName = inputFile.nextLine();
         PHfirstName = inputFile.nextLine();
         PHlastName = inputFile.nextLine();
         
         lineData = inputFile.nextLine();
         PHage = Integer.parseInt(lineData);
         PHsmokeStatus = inputFile.nextLine();
         
         lineData = inputFile.nextLine();
         PHheight = Double.parseDouble(lineData);
         lineData = inputFile.nextLine();
         PHweight = Double.parseDouble(lineData);
                  
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         Policy newPolicy = new Policy(policyNum, PHage, PHweight, PHheight, PHsmokeStatus, providerName, PHfirstName, PHlastName);
         policyList.add(newPolicy); //adding the policy objects to the ArrayList policy 
      }
      
      inputFile.close();
      
      for(int i = 0; i < policyList.size(); i++)
      {
         System.out.println("Policy Number: "+ policyList.get(i).getpolicyNum());
         System.out.println("Provider Name: "+ policyList.get(i).getproviderName());
         System.out.println("PolicyHolder's First Name: "+ policyList.get(i).getPHfirstName());
         System.out.println("PolicyHolder's Last Name: "+ policyList.get(i).getPHlastName());
         System.out.println("PolicyHolder's Age: "+ policyList.get(i).getPHage());
         System.out.println("PolicyHolder's Smoking Status: "+policyList.get(i).getPHsmokeStatus());
         System.out.printf("Policyholder's Height: %,.1f\n", policyList.get(i).getPHheight());
         System.out.printf("Policyholder's Weight: %,.1f\n",policyList.get(i).getPHweight());
         System.out.printf("Policyholder's BMI: %,.2f\n", policyList.get(i).getBMI());
         System.out.printf("Policy Price: $%,.2f\n", policyList.get(i).getPolicyCost(policyList.get(i).getBMI()));
         System.out.println();

      }
        
   }
}