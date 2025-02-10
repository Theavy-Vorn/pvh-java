import java.util.Scanner;

public class SavingAccount implements Account{
    static Scanner sc = new Scanner(System.in);
    private String username;
    private String datebirth;
    private String gender;
    private String phone;
    private double rate;

    public SavingAccount(String username, String datebirth, String gender, String phone, double rate) {
        this.username = username;
        this.datebirth = datebirth;
        this.gender = gender;
        this.phone = phone;
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void transfer(double amount, Account targetAccount) {

    }

    @Override
    public void displayAccountInfo() {
//        System.out.println("Username: " + username);
//        System.out.println("Date of Birth: " + datebirth);
//        System.out.println("Gender: " + gender);
//        System.out.println("Phone: " + phone);
//        System.out.println("Interest Rate: " + rate + "%");
    }
}
//
//private String accountNumber;
//private String accountName;
//private double balance;
//
//public SavingAccount(double balance, String accountName) {
//    this.balance = balance;
//    this.accountName = accountName;
//}
//@Override
//public void deposit(double amount) {
//    balance += amount;
//    System.out.println("Deposited " + amount + " to " + accountName);
//}
//
//@Override
//public void withdraw(double amount) {
//    if (amount < 0.8*balance || amount > balance) {
//        System.out.println("Insufficient funds for account " + accountNumber);
//    } else {
//        balance -= amount;
//        System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
//    }
//}
//
//@Override
//public void transfer(double amount, Account targetAccount) {
//    if (amount < 0.8*balance || amount > balance) {
//        System.out.println("Transfer failed! Not enough balance.");
//    } else {
//        withdraw(amount);
//        targetAccount.deposit(amount);
//        System.out.println("Transferred $" + amount);
//    }
//}
//
//@Override
//public void displayAccountInfo() {
//
//}
