package customer_info;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Getter to retrieve data
    public String getName() {
        return this.name;
    }

    // Setter to send/update data
    public void setName(String name) {
        this.name = name;
    }
}

class CustomerDatabase {
    private List<Customer> customers = new ArrayList<>();

    // "Setter" for adding a customer to the database
    public void addCustomer(String name) {
        Customer newCustomer = new Customer(name);
        this.customers.add(newCustomer);
    }

    // Getter to retrieve all customers
    public List<Customer> getAllCustomers() {
        return this.customers;
    }

    // Getter for a specific customer by index
    public Customer getCustomer(int index) {
        if (index >= 0 && index < this.customers.size()) {
            return this.customers.get(index);
        }
        return null;
    }
}

public class data {
    public static void main(String[] args) {
        // 1. Create the database
        CustomerDatabase database = new CustomerDatabase();

        // 2. Add data to the database
        database.addCustomer("Mike");
        database.addCustomer("Charles");
        database.addCustomer("Frank");
        database.addCustomer("Medley");
        database.addCustomer("Brian");
        database.addCustomer("Natalie");
        database.addCustomer("Mark");
        database.addCustomer("Prince");
        database.addCustomer("Trent");
        database.addCustomer("Brandon");

        // 3. Retrieve and print data using the getter
        System.out.println("--- All Customers ---");
        for (Customer c : database.getAllCustomers()) {
            System.out.println("Customer name: " + c.getName());
        }

        // 4. Update data using a setter
        System.out.println("\n--- Updating First Customer ---");
        Customer firstCustomer = database.getCustomer(0);
        if (firstCustomer != null) {
            // Using the setter to update the previously set "Mike" to "Michael"
            firstCustomer.setName("Michael");

            // Using the getter to retrieve the newly updated name
            System.out.println("First customer's new name is: " + firstCustomer.getName());
        }
    }
}
