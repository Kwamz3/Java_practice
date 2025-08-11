class VendingMachine {

    private double pricePerItem = 3.00;
    private String itemName = "Soda";
    private int stock = 20;

    // Getter methods
    public double getPricePerItem() {
        return pricePerItem;
    }

    public String getItemName() {
        return itemName;
    }

    public int getStock() {
        return stock;
    }
    
    // Setter methods
    public void setPricePerItem(double price) {
        if (price > 0) {
            this.pricePerItem = price;
        }
    }

    public void setItemName(String name) {
        if (name != null && !name.isEmpty()) {
            this.itemName = name;
        }
    }

    public void setStock(int quantity) {
        if (quantity > 0) {
            this.stock = quantity;
        }
    }

    // Method to buy
    public boolean buyItem(double moneyInserted) {
        if (stock > 0 && moneyInserted >= pricePerItem) {
            stock--;
            System.out.println("Have a " + itemName + " ...Cheers!");
            return true;
        }
        else if (stock == 0) {
            System.out.println("Sorry we're out of " + itemName);
        }
        else {
            System.out.println("Insufficient funds... " + itemName + " costs $" + pricePerItem);}
        return false;
    }

}

public class thisJava {
    public static void main(String[] args) {


        VendingMachine obj1 = new VendingMachine();
        VendingMachine obj2 = new VendingMachine();

        
         // Checking detalis of the machine
        System.out.println("Item: " + obj1.getItemName());
        System.out.println("Price: $" + obj1.getPricePerItem());
        System.out.println("Stock: " + obj1.getStock());

        System.out.println();
        
        obj1.buyItem(6.00);
        System.out.println("Stock after purchase: " + obj1.getStock());
        
        System.out.println();

        // Entering details into the machine
        obj2.setItemName("Yoghurt");
        obj2.setPricePerItem(4.50);
        obj2.setStock(10);

        System.out.println("Item: " + obj2.getItemName());
        System.out.println("Price: $" + obj2.getPricePerItem());
        System.out.println("Stock: " + obj2.getStock());

        System.out.println();
        
        obj2.buyItem(6.00);
        System.out.println("Stock after purchase: " + obj2.getStock());
    }
}

