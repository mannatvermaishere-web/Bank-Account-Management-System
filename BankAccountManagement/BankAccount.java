public class BankAccount{
int accountNumber;
String accountHolderName;
double balance;

BankAccount(int accountNumber, String accountHolderName, double balance){
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}

void deposit(double amount){
if(amount>0){
balance = balance + amount;
System.out.println("Amount deposited: " + amount);
}
else{
    System.out.println("Invalid deposit amount.");
}
}

void withdraw(double amount){
    if(amount<=0){
        System.out.println("Invalid withdrawl amount.");
    }
else if(amount<=balance){
balance = balance-amount;
System.out.println("Amount withdrawn: " + amount);
}
else{
System.out.println("Insufficient Balance");
}
}

void checkBalance(){
System.out.println("Current balance: " + balance);
}

void displayDetails(){
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Balance: " + balance);
}
}
