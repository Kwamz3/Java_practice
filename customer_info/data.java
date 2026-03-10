package customer_info;

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
