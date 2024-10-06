import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        a1.insert(4451238, "Mohammed", 10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        System.out.println(a1.toString());

        a2.insert(9563145, "Belal", 100);
        a2.deposit(50);
        a2.withdraw(140);
        a2.checkBalance();
        System.out.println(a2.toString());

        a3.insert(4451238, "Ahmed", 500);
        a3.deposit(550);
        a3.withdraw(10);
        a3.checkBalance();
        System.out.println(a3.toString());
    }
}