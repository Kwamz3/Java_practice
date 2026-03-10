package customer_info;

import java.util.List;
import java.util.ArrayList;

public class customer_function {

    // class Customer {
    //     private String name;

    //     // Constructor
    //     public Customer(String name) {
    //         this.name = name;
    //     }

    //     // Getter to retrieve data
    //     public String getName() {
    //         return this.name;
    //     }

    //     // Setter to send/update data
    //     public void setName(String name) {
    //         this.name = name;
    //     }
    // }

    class Customer {
        private String name;

        public Customer(String name) {
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
}
