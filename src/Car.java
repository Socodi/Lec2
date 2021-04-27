public class Car {
    public String colour;
    public int wheels;

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public int getWheels() { return wheels; }

    public void setWheels(int wheels) { this.wheels = wheels; }

    public Car(String colour, int wheels) {
        this.colour = colour;
        this.wheels = wheels;
    }

    public void printDetails() {
        System.out.println("The car has " + this.wheels + " wheels and is " + this.colour);
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
