
class Store {
    String brand;
    int price;
    static String category;

    static {
        category = "Smartphone";
        System.out.println("Static Block: Category set to " + category);
    }

    public void Product() {
        brand = "Generic";
        price = 1000;
        System.out.println("Product created");
    }

    public void displayDetails() {
        System.out.println(brand + " " + category + ": $" + price);
    }

    public static void usageGuide() {
        System.out.println("All products in category '" + category + "' are electronic devices.");
    }
}

public class storeJava{
    public static void main(String[] args) {
        
        Store obj1 = new Store();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        obj1.displayDetails();
        obj1.usageGuide();

    }

}