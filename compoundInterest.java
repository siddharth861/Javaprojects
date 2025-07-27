import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args){

       // Compound Interest Calculator
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the value of principle amount: ");
        principle= scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the no. of times money is compounded: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the no of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow (1+ rate/timesCompounded , timesCompounded * years);
        System.out.printf("The total compounded amount is: Rs. %f", amount);



        scanner.close();

    }
}
