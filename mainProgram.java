import java.util.InputMismatchException;
import java.util.Scanner;

public class mainProgram{
    public static void main(String args[]){
        bankSystem bank = new bankSystem();

        bank.createUser("1", "admin", "admin@email.com","admin");

        bank.createUser("64220039", "Laith Hijazi", "laith.hijazi@icloud.com", "123123");
        bank.createAccount("TR01", "64220039", 5000);

        bank.createUser("64220068", "Hassan Ghezzaoui", "hassan.ghezzaoui@gmail.com", "53215321");
        bank.createAccount("TR02", "64220068", 3000);

        bank.createUser("64220140", "Karam AbuShawish", "karam.abushawish@yahoo.com", "993366");
        bank.createAccount("TR03", "64220140", 2500);

        bank.createUser("62220097", "Ahmad Omar Raad", "omar.raad@outlook.com", "770199");

        bank.createUser("62220056", "Rashad Mimi", "rashad.mimi@hotmail.com", "66566566");

        while(true){
            try{
                System.out.println("Main Menu");
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.println("Choose an option: ");

                Scanner in = new Scanner(System.in);
                int mainChoice = in.nextInt();
                in.nextLine();

                switch(mainChoice){
                    case 1:
                        System.out.println("Enter your user id: ");
                        String id = in.nextLine();
                        System.out.println("Enter your password: ");
                        String password = in.nextLine();
                        User loggedInUser = bank.login(id, password);
                
                        if(loggedInUser != null){
                            System.out.println("Logged in successfully!");
                            System.out.println("Welcome, " + loggedInUser.getName());

                            if(loggedInUser.getName().equals("admin")){
                                handleAdminMenu(bank, loggedInUser, in);
                                break;
                            }

                            else{
                                handleUserMenu(bank, loggedInUser, in);
                                break;
                            }
                        }

                        else{
                            System.out.println("Login failed.");
                            break;
                        }
                    
                    case 2:
                        System.out.println("Thank you for Using our Online Banking System!");
                        System.exit(0);
                    
                    default:
                        System.out.println("Invalid option.");
                        System.out.println("Try again!");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input.");
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public static void handleAdminMenu(bankSystem bank, User admin, Scanner in){
        while(true){
            try{
                System.out.println("Admin Menu");
                System.out.println("1. Create User");
                System.out.println("2. Create Account");
                System.out.println("3. View Users");
                System.out.println("4. View Accounts");
                System.out.println("5. View Users Accounts");
                System.out.println("6. View All Transactions");
                System.out.println("7. Logout");
                System.out.println("Choose an option: ");

                int adminChoice = in.nextInt();
                in.nextLine();

                switch(adminChoice){
                    case 1:
                        System.out.println("Enter user id: ");
                        String newUserId = in.nextLine();
                        System.out.println("Enter username: ");
                        String newUserName = in.nextLine();
                        System.out.println("Enter user email: ");
                        String newUserEmail = in.nextLine();
                        System.out.println("Enter user password: ");
                        String newUserPassword = in.nextLine();
                        bank.createUser(newUserId, newUserName, newUserEmail, newUserPassword);
                        break;
            
                    case 2:
                        System.out.println("Enter account number: ");
                        String newAccountNumber = in.nextLine();
                        System.out.println("Enter user id: ");
                        String userId = in.nextLine();
                        System.out.println("Enter initial balance: ");
                        double InitialBalance = in.nextDouble();
                        in.nextLine();
                        bank.createAccount(newAccountNumber, userId, InitialBalance);
                        break;
                
                    case 3:
                        bank.viewUsers(admin.getUserId());
                        break;
                
                    case 4:
                        bank.viewAccounts();
                        break;
                
                    case 5:
                        bank.viewUsersAccounts();
                        break;

                    case 6:
                        bank.viewAllTrasnactions();
                        break;
                
                    case 7:
                        System.out.println("Logged out successfully!");
                        return;
            
                    default:
                        System.out.println("Invalid option.");
                        System.out.println("Try again!");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input.");
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        }
    }

    public static void handleUserMenu(bankSystem bank, User user, Scanner in){
        while(true){
            try{
                System.out.println("User Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. View Transactions");
                System.out.println("6. Logout");
                System.out.println("Choose an option: ");

                int userChoice = in.nextInt();
                in.nextLine();

                Account account = bank.getUserAccounts().get(user.getUserId());
                if(account == null){
                    System.out.println("No account found.");
                    break;
                }

                switch(userChoice){
                    case 1:
                        System.out.println("Balance = " + account.getBalance());
                        break;

                    case 2:
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = in.nextDouble();
                        in.nextLine();
                        account.deposit(depositAmount);
                        break;
                    
                    case 3:
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = in.nextDouble();
                        in.nextLine();
                        account.withdraw(withdrawAmount);
                        break;
                    
                    case 4:
                        System.out.println("Enter recepient account number: ");
                        String recepientAccountNumber = in.nextLine();
                        System.out.println("Enter amount to transfer: ");
                        double transferAmount = in.nextDouble();
                        in.nextLine();
                        account.transfer(bank, transferAmount, account.getAccountNumber(), recepientAccountNumber);
                        break;

                    case 5:
                        account.viewTransactions();
                        break;
                
                    case 6:
                        System.out.println("Logged out successfully!");
                        return;

                    default:
                        System.out.println("Invalid option.");
                        System.out.println("Try again!");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input.");
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        }
    }
}