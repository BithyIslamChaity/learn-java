package TenthClass;

public class Vehicle {
    private String numberOfDoor;
    private String engineBrand;
    private String seatNumber;

    public String getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(String numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Vehicle(String numberOfDoor, String engineBrand, String seatNumber) {
        this.numberOfDoor = numberOfDoor;
        this.engineBrand = engineBrand;
        this.seatNumber = seatNumber;
    }

}
