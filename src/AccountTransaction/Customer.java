package AccountTransaction;

public class Customer extends Account {

    int userId;
    String userName;

    public static void main(String [] args){
        Customer customer1 = new Customer(1, "Ade");
        Customer customer2 = new Customer(2, "Chukwuma");

        Account account = new Account();
        account.createAccount(customer1, "21st of January, 2016", 50000, 12345);
        account.createAccount(customer2, "1st of February 2016", 30000, 12346);

        customer1.setInitialDeposit(10000);
        customer1.setAccountValue(customer1.initialDeposit);

        customer1.transfer(customer1,customer2, 10000);
        System.out.println("Customer 1 account balance is " + customer1.accountValue);
        System.out.println("Customer 2 account number is " + customer2.accountValue);

       /* System.out.println(customer1.initialDeposit);
        System.out.println(customer1.accountValue);*/
    }

    public  Customer(int id, String name){
        this.userId = id;
        this.userName = name;
    }

    public void setUserId(int id){
        userId = id;
    }

    public void setUserName(String name){
        userName = name;
    }

    public int getUserId(int id) {
        userId = id;
        return userId;
    }


    public String getUserName() {
        return userName;
    }

    public void transfer(Customer customer1, Customer customer2, int amount){
        if(customer1.closeAccout() || customer2.closeAccout()){
            System.out.println("Your account is closed, you cannot perform any transaction");
        }
        double currentACcountValue = customer1.accountValue;
        if(currentACcountValue < amount){
            System.out.println("You don't have a sufficient balance to perform this operation");
        }
        customer1.accountValue = accountValue - amount;
        customer2.accountValue = accountValue + amount;
    }
}
