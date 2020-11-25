package backaccount;

public class Account {

    private String customerName;
    private double balance;

    public void status(){
        System.out.println("Name: "+ this.customerName);
        System.out.println("Current Balance: "+ this.balance);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" made. New balance is "+ this.balance);
    }

    public void transfer(double transferAmount){
        if(this.balance - transferAmount <= 0){
            System.out.println("Only " + this.balance + " available. Transfer not processed");
        } else {
            this.balance -= transferAmount;
            System.out.println("Transfer of " + transferAmount +" processed. Remaining balance = " + this.balance);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
