public class Product {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private float discount;
    private String color;

    public Product(){
        this.name = "No name";
        this.description = "No description";
        this.price = 0;
        this.quantity = 0;
        this.discount = 0;
    }

    public Product(String name, String description, double price, int quantity, float discount){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Product(String name, String description, double price, int quantity, float discount, String color){
        this(name, description, price, quantity, discount);
        this.color = color;
    }

    public Product(Product product){
        this.name = product.name;
        this.description = product.description;
        this.price = product.price;
        this.quantity = product.quantity;
        this.discount = product.discount;
        this.color = product.color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
        System.out.println("Color: " + color);
    }
}
