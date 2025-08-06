
// class Vehicle {
//     public Vehicle() {
//         System.out.println("Vehicle is being built");
//     }

//     public Vehicle(String type) {
//         System.out.println("Vehicle type: " + type);
//     }
// }

// class Car extends Vehicle {
//     public Car() {
//         super(); // Calls Vehicle()
//         System.out.println("Car is being built");
//     }

//     public Car(String model) {
//         super("Car"); // Calls Vehicle(String)
//         System.out.println("Car model: " + model);
//     }
// }



class Knust {

    public Knust() {
        System.out.println("You are a student of Knust");
    }

    public Knust(String school) {
        System.out.println("You are in " + school);
    }
}

class CoS extends Knust {

    public CoS() {
        super();
        System.out.println("Welcome to College of Science");
    }

    public CoS(String level) {
        super("CoS");
        System.out.println("Level " + level);
    }
}

public class SuperJava {
    public static void main(String[] args) {

        // Car obj1 = new Car();
       
       
       
        CoS obj1 = new CoS("200");
        System.out.println();
        CoS obj2 = new CoS();

    }
}
