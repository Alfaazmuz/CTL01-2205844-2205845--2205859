package SmartCal;

import java.util.Scanner;

public class Clientprog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time: ");
        int time = scanner.nextInt();
        
        SmartCalculator calculator = new SmartCalculator(principal, rate, time);

        System.out.println("Principal: " + calculator.getPrincipal());
        System.out.println("Rate: " + calculator.getRate());
        System.out.println("Time: " + calculator.getTime());

   
        double simpleInterest = calculator.calculateSimpleInterest();
        System.out.println("Simple Interest: " + simpleInterest);

 
        int numberOfTimes = 12; 
        double compoundInterest = calculator.calculateCompoundInterest(numberOfTimes);
        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}
