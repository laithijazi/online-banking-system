import java.util.Scanner;

public class mainProgram{
    public static void main(String args[]){
        bankSystem bank = new bankSystem();
        bank.createUser("64220039", "Laith Hijazi", "laith.hijazi@icloud.com", "123123");
        bank.createAccount("1", "64220039", 500);

        bank.createUser("64220068", "Hassan Ghezzaoui", "hassan.ghezzaoui@gmail.com", "53215321");
        bank.createAccount("2", "64220068", 300);

        while(true){
            System.out.println("Main Menu");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.println("Choose an option: ");

            Scanner in = new Scanner(System.in);
            int mainChoice = in.nextInt();

            if(mainChoice == 2){
                System.out.println("Thank you for Using our Online Banking System!");
                break;
            }

            else if(mainChoice == 1){
                System.out.println("Enter your user id: ");
                String userId = in.nextLine();
                System.out.println("Enter your password: ");
                String password = in.nextLine();
                User loggedInUser = bank.login(userId, password);
                
                if(loggedInUser != null){
                    System.out.println("Logged in successfully!");
                    System.out.println("Welcome, " + loggedInUser.getName());

                    while(true){
                        System.out.println("User Menu");
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Transfer");
                        System.out.println("5. View Transactions");
                        System.out.println("6. Logout");
                        System.out.println("Choose an option: ");

                        int userChoice = in.nextInt();

                        if(userChoice == 6){
                            System.out.println("Logged out successfully!");
                            break;
                        }

                        Account account = bank.getUserAccounts().get(loggedInUser.getUserId());
                        if(account == null){
                            System.out.println("No account found.");
                            break;
                        }
                        else{
                            switch(userChoice){
                                case 1:
                                System.out.println("Balance = " + account.getBalance());
                                break;
                            }
                        }
                    }
                }
                else{
                    System.out.println("Login failed.");
                }
            }

            else{
                System.out.println("Invalid option.");
                System.out.println("Try again!");
            }
        }
    }
}
