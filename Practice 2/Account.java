public class Account {
    private int accountNo;
    private String name;
    private float amount;

    public void insert(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float amount) {
        this.amount += amount;
        System.out.println(amount + " deposited");
    }
    public void withdraw(float amount) {
        if(this.amount < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        this.amount -= amount;
        System.out.println(amount + " withdrawn");
    }

    public void checkBalance() {
        if(this.amount < 0) {
            System.out.println("Insufficient Balance");
        }else{
            System.out.println("Balance is " + this.amount);
        }
    }

    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
