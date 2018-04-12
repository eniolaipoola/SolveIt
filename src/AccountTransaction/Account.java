package AccountTransaction;

public class Account{

    String date;
    Customer customer;
    double initialDeposit;
    int accountNumber;

    double accountValue;

    public void createAccount(Customer customerId, String date, double deposit, int accountNumber){
        this.customer = customerId;
        this.date = date;
        this.initialDeposit = deposit;
        this.accountNumber = accountNumber;
    }

    public boolean closeAccout(){
        return true;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountValue() {
        return accountValue;
    }


}
