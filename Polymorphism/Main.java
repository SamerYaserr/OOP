public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000);
        System.out.println("e1 salary: " + e1.getSalary());

        DailyEmployee e2 = new DailyEmployee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000, 100, 30);
        System.out.println("e2 salary: " + e2.getSalary());

        HourlyEmployee e3 = new HourlyEmployee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000, 10, 600);
        System.out.println("e3 salary: " + e3.getSalary());

        SalariedEmployee e4 = new SalariedEmployee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000, 10000);
        System.out.println("e4 salary: " + e4.getSalary());

        System.out.println("---------------------------------------");

        Employee e5 = new Employee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000);
        System.out.println("e5 salary: " + e5.getSalary());

        e5 = new SalariedEmployee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000, 5000);
        System.out.println("e5 salary: " + e5.getSalary());

        e5 = new HourlyEmployee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000, 50, 300);
        System.out.println("e5 salary: " + e5.getSalary());

        e5 = new DailyEmployee("Samer", "Mansoura", "Software", "ssrr@gmail.com", 100000, 500, 20);
        System.out.println("e5 salary: " + e5.getSalary());
    }
}