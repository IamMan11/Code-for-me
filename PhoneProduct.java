// Product class
class Product {
    private String name;
    private String brand;
    private double price;

    // Constructor
    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method display
    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " THB");
    }
}

// Laptop class
class Laptop extends Product {
    private String OS;

    // Constructor
    public Laptop(String name, String brand, double price, String OS) {
        super(name, brand, price);
        this.OS = OS;
    }

    // Getter and Setter for OS
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    // Method display
    @Override
    public void display() {
        super.display();
        System.out.println("CPU: " + OS);
    }
}

// Smartphone class
class Smartphone extends Product {
    private String OS;

    // Constructor
    public Smartphone(String name, String brand, double price, String OS) {
        super(name, brand, price);
        this.OS = OS;
    }

    // Getter and Setter for OS
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    // Method display
    @Override
    public void display() {
        super.display();
        System.out.println("OS: " + OS);
    }
}

// Main class to test the classes
public class PhoneProduct {
    public static void main(String[] args) {
        // Creating an object of Laptop
        Laptop laptop = new Laptop("Macbook", "Apple", 30000.0, "M1");
        
        // Creating an object of Smartphone
        Smartphone smartphone = new Smartphone("Galaxy", "Samsung", 20000.0, "Android");

        // Displaying details
        System.out.println("Laptop Details:");
        laptop.display();
        
        System.out.println("\nSmartphone Details:");
        smartphone.display();

        // Changing price for both objects
        laptop.setPrice(35000.0);
        smartphone.setPrice(18000.0);

        // Displaying details again
        System.out.println("\nUpdated Laptop Details:");
        laptop.display();
        
        System.out.println("\nUpdated Smartphone Details:");
        smartphone.display();
    }
}
