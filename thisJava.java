class VendingMachine {

    private double pricePerItem = 3.00;
    private String itemName = "Soda";
    private int stock = 20;

    // Getter methods
    public double getPricePerItem() {
        return pricePerItem;
    }

    public String itemName() {
        return itemName;
    }

    public int stock() {
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

    // private double pricePerItem = 2.50;   // dollars
    // private String itemName = "Soda";
    // private int stock = 20;               // number of items

    // // Getter methods
    // public double getPricePerItem() {
    //     return pricePerItem;
    // }

    // public String getItemName() {
    //     return itemName;
    // }

    // public int getStock() {
    //     return stock;
    // }

    // // Setter methods
    // public void setPricePerItem(double price) {
    //     if (price > 0) {
    //         this.pricePerItem = price;
    //     }
    // }

    // public void setItemName(String name) {
    //     if (name != null && !name.isEmpty()) {
    //         this.itemName = name;
    //     }
    // }

    // public void setStock(int quantity) {
    //     if (quantity >= 0) {
    //         this.stock = quantity;
    //     }
    // }

    // // Method to "buy" an item
    // public boolean buyItem(double moneyInserted) {
    //     if (stock > 0 && moneyInserted >= pricePerItem) {
    //         stock--;
    //         System.out.println("Here's your " + itemName + "! Enjoy!");
    //         return true;
    //     } else if (stock == 0) {
    //         System.out.println("Sorry, " + itemName + " is sold out!");
    //     } else {
    //         System.out.println("Insufficient funds. " + itemName + " costs $" + pricePerItem);
    //     }
    //     return false;
    // }
}

public class thisJava {
    public static void main(String[] args) {


        VendingMachine obj1 = new VendingMachine();

        obj1.buyItem(6.00);

        // VendingMachine machine = new VendingMachine();

        // // Checking machine details
        // System.out.println("Item: " + machine.getItemName());
        // System.out.println("Price: $" + machine.getPricePerItem());
        // System.out.println("Stock: " + machine.getStock());

        // System.out.println();

        // // Buying an item
        // machine.buyItem(3.00); // Customer inserts $3
        // System.out.println("Stock after purchase: " + machine.getStock());
        
        // System.out.println();
        
        // // Changing product
        // machine.setItemName("Chocolate Bar");
        // machine.setPricePerItem(1.75);
        // machine.setStock(10);
        
        // System.out.println("Item: " + machine.getItemName());
        // System.out.println("Price: $" + machine.getPricePerItem());
        // System.out.println("Stock: " + machine.getStock());
        
        // System.out.println();
       
        // machine.buyItem(3.00);
        // System.out.println("Stock after purchase: " + machine.getStock());
    }
}

