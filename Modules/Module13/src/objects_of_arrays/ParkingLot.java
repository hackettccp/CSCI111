package objects_of_arrays;

/**
 * ParkingLot Object.
 */
public class ParkingLot {

    private Car[] carLot;

    /**
     * Constructor with one argument.
     */
    public ParkingLot(int sizeIn) {
        carLot= new Car[sizeIn];
    }

    /**
     * Places a Car object in the specified space
     */
    public void addCar(Car carIn, int spaceIn) {
        if(carLot[spaceIn] == null && spaceIn < carLot.length) {
            carLot[spaceIn] = carIn;                            //Puts the car in that space, provided no car is already there and the parking space number is valid.
        }
    }

    /**
     * Gets and removes a car from the array
     */
    public Car removeCar(int spaceIn) {
        if(carLot[spaceIn] == null) {
            return null;                                        //Returns null if there is no car in that space
        }
        else {
            Car temp = carLot[spaceIn];                         //Creates a temporary reference to the car
            carLot[spaceIn] = null;                             //Removes the reference to the car from the array
            return temp;                                        //Returns the car
        }
    }

    /**
     * Returns information about an individual car (if there is one in the specified space)
     */
    public String getCarInfo(int spaceIn) {
        if(carLot[spaceIn] != null) {
            return carLot[spaceIn].toString();                  //If a car is in that space, return the string representation of the car
        }
        else {
            return "No car parked in this space.";              //Return a message saying there is no car in that space
        }
    }

    /**
     * String representation.
     */
    public String toString() {
        String s = "Lot capacity: " + carLot.length;            //Starts with the lot's capacity
        int totalCars = 0;
        for(Car c : carLot) {                                   //Add up all the spaces that are not null
            if(c != null) {
                totalCars += 1;
            }
        }
        s += ", Total Cars: " + totalCars;                      //Adds on the total number of cars in the lot
        return s;                                               //Returns the string representation of the object.
    }

}
