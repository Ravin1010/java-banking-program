import java.util.Scanner;
// Java banking program

public class main{
    public static void main(String[] args) {

        double balance = 0;
        boolean is_running = true;

        while (is_running) { 
            System.out.println("####");
            System.out.println("Banking Program");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);  
            System.out.println("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    double deposited=deposit(scanner);
                    balance+=deposited;
                    System.out.printf("Your balance now is %.2f \n", balance);
                    System.out.printf("You deposited %.2f \n", deposited);
                }
                case 3 -> {
                    double withdrawn=withdraw(scanner, balance);
                    balance-=withdrawn;
                    System.out.printf("Your balance now is %.2f \n", balance);
                    System.out.printf("You withdrew %.2f \n", withdrawn);
                }
                case 4 -> is_running=false;
                default -> System.out.println("This is not a valid choice.");
              }
        }

        System.out.println("Thank you, have a nice day.");

        
    }

    public static void showBalance(double balance){
        System.out.printf("Your balance is %.2f \n", balance);
    }

    public static double deposit(Scanner scanner){
        System.out.println("Enter an amount to be deposited: ");
        double amount = scanner.nextDouble();
        if (amount<=0) {
            System.out.println("That's not a valid amount.");
            return 0;
        } else {
            return amount;
        }
    }

    public static double withdraw(Scanner scanner, double balance){
        System.out.println("Enter an amount to be withdrawn: ");
        double amount = scanner.nextDouble();
        if (amount>balance) {
            System.out.println("Insufficient amount in balance.");
            return 0;
        } else if(amount<=0) {
            System.out.println("Amount must be greater than 0.");
            return 0;
        }
        else {
            return amount;
        }
    }


    
}

