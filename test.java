import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    
    String name;
    System.out.print("Enter the employee's full name: ");
    name=(new Scanner(System.in)).nextLine();

    String num;
    System.out.print("Enter the employee's number: ");
    num=(new Scanner(System.in)).nextLine();
   double rate;
    System.out.print("Enter the hourly pay rate: ");
    rate=(new Scanner(System.in)).nextDouble();

    double hours;
    System.out.print("Enter the hours worked: ");
    hours=(new Scanner(System.in)).nextDouble();
    
    double grossPay= hours*rate;
    double taxDeduc=grossPay*0.06;
    double net=grossPay-taxDeduc;
   
    System.out.println("\nThank you!");
    System.out.println("Here is your paycheck.");
    
    System.out.println("--------------------------\n");
    System.out.println("Employee's name: " + name);
    System.out.println("Employee's number: "+ num);
    System.out.println("Total Gross Pay: " + String.format("%.2f", grossPay));
    System.out.println("Deductions Tax(6%): "+ String.format("%.2f", taxDeduc));
    System.out.println("Net Pay: "+ String.format("%.2f", net));
    System.out.println("\n--------------------------");
    
    System.out.println("\nBye!");
    
  }
}