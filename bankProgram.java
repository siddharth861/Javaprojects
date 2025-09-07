import java.util.Scanner;
public class bankProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        // SIMPLE BANKING PROGRAM
        double balance =0;
        int choice=0;
        boolean isRunning = true;
        while(isRunning){
            System.out.println("\nBanking program");
            System.out.print("1. Show Balance\n2.Deposit\n3.Withdraw\n4.Exit\n");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning=false;
                default -> System.out.println("enter a valid choice");
            }
        }
        System.out.println("************************");
        System.out.println("THANKS! HAVE A GREAT DAY");
        System.out.println("************************");
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 1){
            System.out.println("There should be a valid amount to be deposited");
            return 0;
        }
        else{
            System.out.println("Amount deposited: "+amount);
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            System.out.println("Enter a valid amount");
            return 0;
        }
        else if(amount<0){
            System.out.println("You cannot withdraw negative amount");
            return 0;
        }
        else{
            System.out.println("amount withdrawn: "+ amount);
            return amount;
        }
    }
}
