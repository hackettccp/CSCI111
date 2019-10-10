package SampleCode.f_objects_of_arrays;

/**
 * Demonstrates the ParkingLot object
 */
public class ParkingLotTest {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(5);                                         //Instantiates a new ParkingLot object
        lot.addCar(new Car("Jeep", "Cherokee", 1994), 0);                           //Adds a new instance of a Car object to parking space (index) 0
        lot.addCar(new Car("Ford", "F-150", 2001), 3);                              //Adds a new instance of a Car object to parking space (index) 3

        Car c = new Car("Subaru", "Outback", 2000);                                 //Instantiates a Car object
        lot.addCar(c, 1);                                                           //Adds the Car object to parking space (index) 1

        System.out.println(lot);                                                    //Prints the ParkingLot's string representation

        System.out.println("Parking Space 0: " + lot.getCarInfo(0));                //Prints info about the car in space 0
        System.out.println("Parking Space 4: " + lot.getCarInfo(4));                //Prints info about the car in space 4 (There isn't one)

        System.out.println();

        Car removed = lot.removeCar(1);                                             //Removes/retrieves the Car object from the ParkingLot in space 1
        System.out.println("A car has left the parking lot: " + removed);           //Prints the string representation of the Car object that was removed

        System.out.println(lot);                                                    //Prints the ParkingLot's string representation
    }

}
