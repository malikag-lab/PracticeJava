public class BankAccount {
    private static String bankName="Central Bank";
    private final int accountNumber;
    private static int totalAccounts=0;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        totalAccounts++;
    }
    public void display(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name is: "+bankName);
            System.out.println("Account Number is: "+accountNumber);
            System.out.println("Account Holder is: "+accountHolderName);
            System.out.println("Balance is: "+balance);
        }
    }

    public static void getTotalAccounts(){
        System.out.println("Total Bank Accounts are: "+totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount Account1=new BankAccount(1011, "Malika", 500000);
        BankAccount Account2=new BankAccount(1012, "Runal", 600000);

        Account1.display();
        Account2.display();

        BankAccount.getTotalAccounts();
    }

}
