public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Camera", "Auto focus", 99, 10, 5, "red");
        Product p2 = new Product();
        Product p3 = new Product(p1);
        p1.display();
        p2.display();
        p3.display();
    }
}