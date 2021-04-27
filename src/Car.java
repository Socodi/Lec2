import java.util.Arrays;

public class Car {
    private String colour;
    private int wheels;
    private String[] passengers;

    public String[] getPassengers() { return passengers; }

    public void setPassengers(String[] passengers) { this.passengers = passengers; }

    public void changePassenger(int Position, String passenger) {
        this.passengers[Position] = passenger;
    }

    public void addPassenger(String passenger) {
        int length = this.passengers.length;
        int i;

        String[] newArray = new String[length + 1];

        for (i=0; i<length;i++)
            newArray[i] = this.passengers[i];

        newArray[length] = passenger;

        this.setPassengers(newArray);

    }

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public int getWheels() { return wheels; }

    public void setWheels(int wheels) { this.wheels = wheels; }

    public Car(String colour, int wheels) {
        this.setColour(colour);
        this.setWheels(wheels);
    }

    public void printDetails() {
        System.out.println("The car has " + this.getWheels() + " wheels and is " + this.getColour());
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", wheels=" + wheels +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
