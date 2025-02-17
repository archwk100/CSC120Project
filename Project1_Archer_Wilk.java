import java.util.Scanner;//for reading user input

public class Project1_Archer_Wilk
{

   public class Policy
   {
      //declare variables for class
      int number;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
   
      //no arg contructor
      public Policy() 
      {
         this.number = 1234;
         this.providerName = "State Farm";
         this.firstName = "John";
         this.lastName = "Doe";
         this.age = 24;
         this.smokingStatus = "non-smoker";
         this.height = 62;
         this.weight = 250.5;
      }
   
      //argument constructor
      public Policy(int number, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight)
      {
         this.number = number;
         this.providerName = providerName;
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.smokingStatus = smokingStatus;
         this.height = height;
         this.weight = weight;
      }
      
      //calculates and returns BMI
      public double calculateBMI(double weight, double height)
      {
         return (weight * 703) / (height ^ 2);
      }
      
      //calculates price
      public int calculatePrice(int age, String smokingStatus, double BMI)
      {
         int price = 600;
         
         if (age > 50)
         {
            price = price + 75;
         }
         
         if (smokingStatus == "smoker")
         {
            price = price + 100;
         }
         
         if (BMI > 35)
         {
            price = price + ( (BMI - 35) * 20 );
         }
         
         return price;
      }
      
   }

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      //get input from user
      System.out.println("Please enter the Policy Number: ");
      int number = keyboard.nextInt();
      
      System.out.println("Please enter the Provider Name: ");
      String name = keyboard.next();
      
      System.out.println("Please enter the Policyholder's First Name: ");
      String firstName = keyboard.next();
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      String lastName = keyboard.next();
      
      System.out.println("Please enter the Provider Age: ");
      int age = keyboard.nextInt();
      
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.next();
      
      System.out.println("Please enter the Policyholder's Height: ");
      double height = keyboard.nextDouble();
      
      System.out.println("Please enter the Policyholder's Weight: ");
      double weight = keyboard.nextDouble();
      
      //create object
      new Policy(number, name, firstName, lastName, age, smokingStatus, height, weight);
      
      //run calculations
      double BMI = calculateBMI(weight, height);
      
      int price = calculatePrice(age, smokingStatus, BMI);
      
      //output results to user
      
      System.out.println("Policy Number: " + number);
      
      System.out.println("Provider Name: " + name);
      
      System.out.println("Policyholder's First Name: " + firstName);
      
      System.out.println("Policyholder's Last Name: " + lastName);
      
      System.out.println("Policyholder's Age: " + age);
      
      System.out.println("Policyholder's Smoking Status: " + smokingStatus);
      
      System.out.println("Policyholder's Height: " + height);
      
      System.out.println("Policyholder's Weight: " + weight);
      
      System.out.println("Policyholder's BMI: " + BMI);
      
      System.out.println("Policy Price: " + price);
   }
}