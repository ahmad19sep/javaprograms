package src;

public class VipCustomer {
    private String Name;
    private String Email;
    private int CreditLimit;
    public VipCustomer(){
        this.Name="Ahamd";
        this.CreditLimit=100000;
        this.Email="ali23@gmail.com";
    }
    public VipCustomer(String name,String email){
        this(name,email,234332);
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public VipCustomer(String name, String email, int creditLimit){
        this.Email=email;
        this.Name=name;
        this.CreditLimit=creditLimit;
    }

}

