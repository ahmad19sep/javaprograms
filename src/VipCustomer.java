package src;

public class Person {
    private String accountNumber;
    private double balance;
    private String email;
    private String phoneNumber;
    private String name;

    public  Person(){
        System.out.println("Main Menu");
    }
    public Person(String name,String accountNumber,String email,double balance,String phoneNumber){
        this.balance=balance;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.accountNumber=accountNumber;
        this.email=email;
    }

    public String getName(){

        return this.name;
    }
    public String getEmail(){
        return email;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getPhoneNumber(){
       return phoneNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void DepositFund(double deposit){
        this.balance=balance+deposit;
        System.out.println("Deposit Cash in RS= "+deposit+" Your New balance is = "+this.balance+"rs");
    }
    public void WithDraw(double withdraw) {
        this.balance = balance - withdraw;
        if (this.balance>0){
            System.out.println("Withdraw Amount= "+withdraw+"rs "+" Your Remaining  Balance is = "+this.balance+"rs");
        }
        else {
            System.out.println("No enough amount in your account, Please recharge your account.");
        }
    }

}

