class BankAccount {
    static int totalAccounts = 0;

    final int accountNumber;

    String accountHolderName;

    String bankName = "National Bank";

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber; 
        totalAccounts++; 
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts); 
    }

    void displayAccounts() {
        if (this instanceof BankAccount) { 
            System.out.println("The accountHolderName is: " + accountHolderName);
            System.out.println("Account Number is: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        } else {
            System.out.println("Invalid account details.");
        }
    }

    public static void main(String[] args) {
        BankAccount B1 = new BankAccount("Alice", 101);
        BankAccount B2 = new BankAccount("Bob", 102);

        B1.displayAccounts();
        B2.displayAccounts();

        BankAccount.getTotalAccounts();
    }
}
		
		
	
	
	