import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            int opt;
            do {
                System.out.println("================== Online Bank Account System ====================");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Transfer Money");
                System.out.println("5. Display Account Information");
                System.out.println("6. Delete Account");
                System.out.println("7. Exit");
                System.out.println("==========================================================");
                System.out.print("=> Choose option (1-7): ");
                opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
            } while (opt != 7);

            System.out.println("Exiting Online Bank Account System...");
            sc.close();
    }

    public static void createAccount() {
        Scanner sc = new Scanner(System.in);
        int opt1;
        do {
            System.out.println("================= Create Account ====================");
            System.out.println("1. Checking Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Back");
            System.out.println("=====================================================");
            System.out.print("=> What type of account do you want to create? ");
            opt1 = sc.nextInt();

            switch (opt1) {
                case 1:
                    createChecking();
                    break;
                case 2:
                   createsaving();
                    break;
            }
        } while (opt1 != 3);

    }
//    public static CheckingAccount createChecking() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input name: ");
//        String username = scanner.nextLine();
//        System.out.print("Input birth: ");
//        String datebirth = scanner.nextLine();
//        System.out.print("Input gender : ");
//        String gender = scanner.nextLine();
//        System.out.print("Input phone: ");
//        String phone = scanner.nextLine();
//        CheckingAccount checkAccount = new CheckingAccount(username,datebirth, gender, phone);
//        return checkAccount;
//    }
public static void  createChecking() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input name: ");
    String username = scanner.nextLine();
    System.out.print("Input birth: ");
    String datebirth = scanner.nextLine();
    System.out.print("Input gender : ");
    String gender = scanner.nextLine();
    System.out.print("Input phone: ");
    String phone = scanner.nextLine();
    CheckingAccount checkAccount = new CheckingAccount(username,datebirth, gender, phone);
    checkAccount.displayAccountInfo();
}
    public static void createsaving() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String username = scanner.nextLine();
        System.out.print("Input birth: ");
        String datebirth = scanner.nextLine();
        System.out.print("Input gender : ");
        String gender = scanner.nextLine();
        System.out.print("Input phone: ");
        String phone = scanner.nextLine();
        System.out.print("Input rate: ");
        Double rate = Double.parseDouble(scanner.nextLine());

        SavingAccount createSaving = new SavingAccount(username, datebirth, gender, phone, rate);
        createSaving.displayAccountInfo();
    }
    public static void depositMoney(){


    }

}

